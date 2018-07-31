package io.alekseimartoyas.financetracker.presentation.modules.history.presenter

import io.alekseimartoyas.financetracker.domain.Currency
import io.alekseimartoyas.financetracker.domain.OperationType
import io.alekseimartoyas.financetracker.data.local.Transaction
import io.alekseimartoyas.financetracker.presentation.modules.history.view.RecyclerViewManager.TransactionRVAdapter
import io.alekseimartoyas.financetracker.presentation.modules.navigationdrawer.router.IMainActivityRouterInput
import io.alekseimartoyas.tradetracker.Foundation.BasePresenter

class HistoryPresenter(view: IHistoryFragmentInput,
                       router: IMainActivityRouterInput,
                       var adapter: ITransactionRVInput? = null):
        BasePresenter<IHistoryFragmentInput,
        IMainActivityRouterInput>(view, router) {

    fun showAddTransaction() {
        router?.showAddTransaction()
    }

    fun getAdapter(): TransactionRVAdapter = adapter!! as TransactionRVAdapter

    override fun onStart() {
        //from interactor
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