package io.alekseimartoyas.financetracker.modules.main_screen.interactor

import io.alekseimartoyas.financetracker.modules.main_screen.presenter.MainScreenPresenterInput
import io.alekseimartoyas.tradetracker.Foundation.BaseInteractor

class MainScreenInteractor: BaseInteractor<MainScreenInteractorOutput>(),
        MainScreenInteractorInput {

    override var presenter: MainScreenInteractorOutput? = null

    override fun destructor() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}