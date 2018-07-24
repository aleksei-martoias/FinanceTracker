package io.alekseimartoyas.financetracker.modules.mainscreen.presenter

import io.alekseimartoyas.financetracker.modules.mainscreen.interactor.IMainScreenInteractorInput
import io.alekseimartoyas.financetracker.modules.mainscreen.interactor.IMainScreenInteractorPresenter
import io.alekseimartoyas.financetracker.modules.mainscreen.router.MainScreenRouterInput
import io.alekseimartoyas.financetracker.modules.mainscreen.view.IMainScreenFragmentInput
import io.alekseimartoyas.financetracker.modules.mainscreen.view.IMainScreenFragmentPresenter
import io.alekseimartoyas.tradetracker.Foundation.BasePresenter

class MainScreenPresenter: BasePresenter<IMainScreenFragmentInput,
        IMainScreenInteractorInput,
        MainScreenRouterInput>(),
        IMainScreenFragmentPresenter, IMainScreenInteractorPresenter {

    override var interactor: IMainScreenInteractorInput? = null
    override var view: IMainScreenFragmentInput? = null
    override var router: MainScreenRouterInput? = null

    override fun destructor() {
        view = null
        interactor?.destructor()
    }
}