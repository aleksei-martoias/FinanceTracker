package io.alekseimartoyas.financetracker.presentation.modules.history.configurator

import io.alekseimartoyas.financetracker.presentation.modules.history.presenter.HistoryPresenter
import io.alekseimartoyas.financetracker.presentation.modules.history.view.HistoryFragment
import io.alekseimartoyas.financetracker.presentation.modules.history.view.RecyclerViewManager.TransactionRVAdapter
import io.alekseimartoyas.financetracker.presentation.modules.navigationdrawer.router.IMainActivityRouterInput

class HistoryConfigurator {

    fun buildModule(view: HistoryFragment) {
        val presenter = HistoryPresenter()

        presenter.setView(view)
        presenter.adapter = TransactionRVAdapter()
        presenter.router = view.activity as IMainActivityRouterInput
        
        view.presenter = presenter
    }
}