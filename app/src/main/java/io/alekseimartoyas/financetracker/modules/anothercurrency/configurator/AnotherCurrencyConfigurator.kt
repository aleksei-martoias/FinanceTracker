package io.alekseimartoyas.financetracker.modules.anothercurrency.configurator

import io.alekseimartoyas.financetracker.modules.anothercurrency.interactor.AnotherCurrencyInteractor
import io.alekseimartoyas.financetracker.modules.anothercurrency.presenter.AnotherCurrencyPresenter
import io.alekseimartoyas.financetracker.modules.anothercurrency.router.AnotherCurrencyRouter
import io.alekseimartoyas.financetracker.modules.anothercurrency.view.AnotherCurrencyFragment

class AnotherCurrencyConfigurator {

    fun buildModule(view: AnotherCurrencyFragment) {
        val presenter = AnotherCurrencyPresenter()
        val interactor = AnotherCurrencyInteractor()
        val router = AnotherCurrencyRouter()

        view.presenter = presenter

        presenter.view = view
        presenter.interactor = interactor
        presenter.router = router

        interactor.presenter = presenter
    }
}