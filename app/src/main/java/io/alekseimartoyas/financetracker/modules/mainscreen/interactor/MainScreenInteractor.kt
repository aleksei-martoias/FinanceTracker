package io.alekseimartoyas.financetracker.modules.mainscreen.interactor

import io.alekseimartoyas.financetracker.entity.FinanceCalculatingInput
import io.alekseimartoyas.tradetracker.Foundation.BaseInteractor

class MainScreenInteractor: BaseInteractor<IMainScreenInteractorPresenter>(),
        IMainScreenInteractorInput {

    override var presenter: IMainScreenInteractorPresenter? = null
    var financeCalculating: FinanceCalculatingInput? = null

    override fun destructor() {

    }

}