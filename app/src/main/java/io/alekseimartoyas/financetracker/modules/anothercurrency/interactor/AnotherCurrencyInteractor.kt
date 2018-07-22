package io.alekseimartoyas.financetracker.modules.anothercurrency.interactor

import io.alekseimartoyas.tradetracker.Foundation.BaseInteractor

class AnotherCurrencyInteractor: BaseInteractor<AnotherCurrencyInteractorOutput>(),
        AnotherCurrencyInteractorInput {

    override var presenter: AnotherCurrencyInteractorOutput? = null

    override fun destructor() {

    }

}