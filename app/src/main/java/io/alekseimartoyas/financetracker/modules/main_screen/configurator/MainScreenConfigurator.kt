package io.alekseimartoyas.financetracker.modules.main_screen.configurator

import android.content.Context
import io.alekseimartoyas.financetracker.modules.main_screen.interactor.MainScreenInteractor
import io.alekseimartoyas.financetracker.modules.main_screen.presenter.MainScreenPresenter
import io.alekseimartoyas.financetracker.modules.main_screen.router.MainScreenRouter
import io.alekseimartoyas.financetracker.modules.main_screen.view.MainScreenFragment

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
    }
}