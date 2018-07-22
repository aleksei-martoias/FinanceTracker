package io.alekseimartoyas.financetracker.modules.navigationdrawer.interactor

import io.alekseimartoyas.tradetracker.Foundation.BaseInteractor

class MainActivityInteractor: BaseInteractor<MainActivityInteractorOutput>(),
        MainActivityInteractorInput {
    override var presenter: MainActivityInteractorOutput? = null

    override fun destructor() {

    }
}