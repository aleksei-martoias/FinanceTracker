package io.alekseimartoyas.financetracker.modules.anothercurrency.configurator

import io.alekseimartoyas.financetracker.modules.anothercurrency.interactor.AnotherCurrencyInteractor
import io.alekseimartoyas.financetracker.modules.anothercurrency.presenter.AnotherCurrencyPresenter
import io.alekseimartoyas.financetracker.modules.anothercurrency.router.AnotherCurrencyRouter
import io.alekseimartoyas.financetracker.modules.anothercurrency.view.AnotherCurrencyFragment

class AnotherCurrencyConfigurator {

    fun buildModule(context: AnotherCurrencyFragment) {
        val presenter = AnotherCurrencyPresenter()
        val interactor = AnotherCurrencyInteractor()
        val router = AnotherCurrencyRouter()

        context.presenter = presenter

        presenter.activity = context
        presenter.interactor = interactor
        presenter.router = router

        interactor.presenter = presenter
    }
}