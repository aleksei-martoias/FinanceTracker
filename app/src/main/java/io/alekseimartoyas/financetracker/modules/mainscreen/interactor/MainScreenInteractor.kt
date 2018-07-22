package io.alekseimartoyas.financetracker.modules.mainscreen.interactor

import io.alekseimartoyas.tradetracker.Foundation.BaseInteractor

class MainScreenInteractor: BaseInteractor<MainScreenInteractorOutput>(),
        MainScreenInteractorInput {

    override var presenter: MainScreenInteractorOutput? = null

    override fun destructor() {

    }

}