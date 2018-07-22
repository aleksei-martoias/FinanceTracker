package io.alekseimartoyas.financetracker.modules.mainscreen.configurator

import io.alekseimartoyas.financetracker.App.Companion.graph
import io.alekseimartoyas.financetracker.modules.mainscreen.interactor.MainScreenInteractor
import io.alekseimartoyas.financetracker.modules.mainscreen.presenter.MainScreenPresenter
import io.alekseimartoyas.financetracker.modules.mainscreen.router.MainScreenRouter
import io.alekseimartoyas.financetracker.modules.mainscreen.view.MainScreenFragment

class MainScreenConfigurator {

    fun buildModule(context: MainScreenFragment) {
        val presenter = MainScreenPresenter()
        val interactor = MainScreenInteractor()
        val router = MainScreenRouter()

        context.presenter = presenter

        presenter.activity = context
        presenter.interactor = interactor
        presenter.router = router

        interactor.presenter = presenter
        interactor.financeCalculating = graph.getFinanceCalculating()
    }
}