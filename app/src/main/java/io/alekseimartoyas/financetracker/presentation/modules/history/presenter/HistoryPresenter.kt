package io.alekseimartoyas.financetracker.presentation.modules.history.presenter

import io.alekseimartoyas.financetracker.datalayer.Currency
import io.alekseimartoyas.financetracker.datalayer.OperationType
import io.alekseimartoyas.financetracker.datalayer.Transaction
import io.alekseimartoyas.financetracker.presentation.modules.history.view.IHistoryFragmentPresenter
import io.alekseimartoyas.financetracker.presentation.modules.history.view.RecyclerViewManager.TransactionRVAdapter
import io.alekseimartoyas.financetracker.presentation.modules.navigationdrawer.router.IMainActivityRouterInput
import io.alekseimartoyas.tradetracker.Foundation.BasePresenter

class HistoryPresenter: BasePresenter<IHistoryFragmentInput,
        IMainActivityRouterInput>(),
        IHistoryFragmentPresenter {

    var adapter: ITransactionRVInput? = null

    override fun getAdapter(): TransactionRVAdapter = adapter!! as TransactionRVAdapter

    override fun onStart() {
        adapter?.setData(arrayOf(
                Transaction(1,
                        OperationType.ENLISTMENT,
                        159F,
                        Currency.USD,
                        "correcting",
                        "yesterday"),
                Transaction(2,
                        OperationType.DEBIT,
                        5F,
                        Currency.USD,
                        "Food",
                        "today")))
    }

    override fun onStop() {

    }
}