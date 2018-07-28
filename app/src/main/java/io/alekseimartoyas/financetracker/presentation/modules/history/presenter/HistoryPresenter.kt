package io.alekseimartoyas.financetracker.presentation.modules.history.presenter

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
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onStop() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}