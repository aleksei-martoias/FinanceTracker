package io.alekseimartoyas.financetracker.presentation.modules.anothercurrency.configurator

import io.alekseimartoyas.financetracker.App
import io.alekseimartoyas.financetracker.domain.interactors.GetExchRateInteractor
import io.alekseimartoyas.financetracker.presentation.modules.anothercurrency.presenter.AnotherCurrencyPresenter
import io.alekseimartoyas.financetracker.presentation.modules.anothercurrency.view.AnotherCurrencyFragment
import io.alekseimartoyas.financetracker.presentation.modules.navigationdrawer.router.IMainActivityRouterInput

class AnotherCurrencyConfigurator {

    fun buildModule(view: AnotherCurrencyFragment) {
        val presenter = AnotherCurrencyPresenter(
                GetExchRateInteractor(App.graph.getExchRateProvider()),
                view, view.activity as IMainActivityRouterInput)

        view.setPres(presenter)
    }
}