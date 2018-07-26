package io.alekseimartoyas.financetracker.presentation.modules.mainscreen.configurator

import io.alekseimartoyas.financetracker.App.Companion.graph
import io.alekseimartoyas.financetracker.presentation.modules.mainscreen.interactor.MainScreenInteractor
import io.alekseimartoyas.financetracker.presentation.modules.mainscreen.presenter.MainScreenPresenter
import io.alekseimartoyas.financetracker.presentation.modules.mainscreen.view.MainScreenFragment

class MainScreenConfigurator {

    fun buildModule(view: MainScreenFragment) {
        val presenter = MainScreenPresenter()
//        val router = MainScreenRouter()

        view.presenter = presenter

        presenter.setView(view)
//        presenter.setRouter(router)

        //        val interactor = MainScreenInteractor()
        //        presenter.interactor = interactor
//        interactor.presenter = presenter
//        interactor.financeCalculating = graph.getFinanceCalculating()
    }
}