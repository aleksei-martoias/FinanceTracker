package io.alekseimartoyas.financetracker.modules.anothercurrency.presenter

import io.alekseimartoyas.financetracker.modules.anothercurrency.interactor.AnotherCurrencyInteractorInput
import io.alekseimartoyas.financetracker.modules.anothercurrency.interactor.AnotherCurrencyInteractorOutput
import io.alekseimartoyas.financetracker.modules.anothercurrency.router.AnotherCurrencyRouterInput
import io.alekseimartoyas.financetracker.modules.anothercurrency.view.AnotherCurrencyFragmentInput
import io.alekseimartoyas.financetracker.modules.anothercurrency.view.AnotherCurrencyFragmentOutput
import io.alekseimartoyas.tradetracker.Foundation.BasePresenter

class AnotherCurrencyPresenter: BasePresenter<AnotherCurrencyFragmentInput,
        AnotherCurrencyInteractorInput,
        AnotherCurrencyRouterInput>(),
        AnotherCurrencyFragmentOutput,
        AnotherCurrencyInteractorOutput {

    override var interactor: AnotherCurrencyInteractorInput? = null
    override var view: AnotherCurrencyFragmentInput? = null
    override var router: AnotherCurrencyRouterInput? = null

    override fun destructor() {
        view = null
        interactor?.destructor()
    }
}