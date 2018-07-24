package io.alekseimartoyas.financetracker.modules.navigationdrawer.interactor

import io.alekseimartoyas.tradetracker.Foundation.BaseInteractor

class MainActivityInteractor: BaseInteractor<IMainActivityInteractorPresenter>(),
        IMainActivityInteractorInput {
    override var presenter: IMainActivityInteractorPresenter? = null

    override fun destructor() {

    }
}