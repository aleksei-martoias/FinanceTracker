package io.alekseimartoyas.financetracker.modules.anothercurrency.interactor

import io.alekseimartoyas.tradetracker.Foundation.BaseInteractor

class AnotherCurrencyInteractor: BaseInteractor<IAnotherCurrencyInteractorPresenter>(),
        IAnotherCurrencyInteractorInput {

    override var presenter: IAnotherCurrencyInteractorPresenter? = null

    override fun destructor() {

    }

}