package io.alekseimartoyas.financetracker.presentation.modules.anothercurrency.configurator

import io.alekseimartoyas.financetracker.presentation.modules.anothercurrency.presenter.AnotherCurrencyPresenter
import io.alekseimartoyas.financetracker.presentation.modules.anothercurrency.view.AnotherCurrencyFragment
import io.alekseimartoyas.financetracker.presentation.modules.navigationdrawer.router.IMainActivityRouterInput

class AnotherCurrencyConfigurator {

    fun buildModule(view: AnotherCurrencyFragment) {
        val presenter = AnotherCurrencyPresenter()

        view.presenter = presenter

        presenter.setView(view)
        presenter.setRouter(view.activity as IMainActivityRouterInput)
    }
}