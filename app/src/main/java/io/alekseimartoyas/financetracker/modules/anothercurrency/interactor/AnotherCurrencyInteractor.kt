package io.alekseimartoyas.financetracker.modules.anothercurrency.interactor

import io.alekseimartoyas.tradetracker.Foundation.BaseInteractor

class AnotherCurrencyInteractor: BaseInteractor<AnotherCurrencyInteractorOutput>(),
        AnotherCurrencyInteractorInput {

    override var presenter: AnotherCurrencyInteractorOutput? = null

    override fun destructor() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}