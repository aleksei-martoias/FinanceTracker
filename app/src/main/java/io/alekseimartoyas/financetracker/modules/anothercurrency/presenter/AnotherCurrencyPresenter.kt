package io.alekseimartoyas.financetracker.modules.anothercurrency.presenter

import io.alekseimartoyas.financetracker.modules.anothercurrency.interactor.IAnotherCurrencyInteractorInput
import io.alekseimartoyas.financetracker.modules.anothercurrency.interactor.IAnotherCurrencyInteractorPresenter
import io.alekseimartoyas.financetracker.modules.anothercurrency.router.AnotherCurrencyRouterInput
import io.alekseimartoyas.financetracker.modules.anothercurrency.view.IAnotherCurrencyFragmentInput
import io.alekseimartoyas.financetracker.modules.anothercurrency.view.IAnotherCurrencyFragmentPresenter
import io.alekseimartoyas.tradetracker.Foundation.BasePresenter

class AnotherCurrencyPresenter: BasePresenter<IAnotherCurrencyFragmentInput,
        IAnotherCurrencyInteractorInput,
        AnotherCurrencyRouterInput>(),
        IAnotherCurrencyFragmentPresenter,
        IAnotherCurrencyInteractorPresenter {

    override var interactor: IAnotherCurrencyInteractorInput? = null
    override var view: IAnotherCurrencyFragmentInput? = null
    override var router: AnotherCurrencyRouterInput? = null

    override fun destructor() {
        view = null
        interactor?.destructor()
    }
}