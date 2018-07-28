package io.alekseimartoyas.financetracker.presentation.modules.mainscreen.configurator

import io.alekseimartoyas.financetracker.App.Companion.graph
import io.alekseimartoyas.financetracker.presentation.modules.mainscreen.presenter.MainScreenPresenter
import io.alekseimartoyas.financetracker.presentation.modules.mainscreen.view.MainScreenFragment
import io.alekseimartoyas.financetracker.presentation.modules.navigationdrawer.router.IMainActivityRouterInput

class MainScreenConfigurator {

    fun buildModule(view: MainScreenFragment) {
        val presenter = MainScreenPresenter()

        view.presenter = presenter

        presenter.setView(view)
        presenter.setRouter(view.activity as IMainActivityRouterInput)
    }
}