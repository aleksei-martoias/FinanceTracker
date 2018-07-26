package io.alekseimartoyas.financetracker.presentation.modules.anothercurrency.configurator

import io.alekseimartoyas.financetracker.presentation.modules.anothercurrency.interactor.AnotherCurrencyInteractor
import io.alekseimartoyas.financetracker.presentation.modules.anothercurrency.presenter.AnotherCurrencyPresenter
import io.alekseimartoyas.financetracker.presentation.modules.anothercurrency.view.AnotherCurrencyFragment

class AnotherCurrencyConfigurator {

    fun buildModule(view: AnotherCurrencyFragment) {
        val presenter = AnotherCurrencyPresenter()
//        val interactor = AnotherCurrencyInteractor()
//        val router = AnotherCurrencyRouter()

        view.presenter = presenter

        presenter.setView(view)
//        presenter.interactor = interactor
//        presenter.router = router

//        interactor.presenter = presenter
    }
}