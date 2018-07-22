package io.alekseimartoyas.financetracker.modules.mainscreen.presenter

import io.alekseimartoyas.financetracker.modules.mainscreen.interactor.MainScreenInteractorInput
import io.alekseimartoyas.financetracker.modules.mainscreen.interactor.MainScreenInteractorOutput
import io.alekseimartoyas.financetracker.modules.mainscreen.router.MainScreenRouterInput
import io.alekseimartoyas.financetracker.modules.mainscreen.view.MainScreenFragmentInput
import io.alekseimartoyas.financetracker.modules.mainscreen.view.MainScreenFragmentOutput
import io.alekseimartoyas.tradetracker.Foundation.BasePresenter

class MainScreenPresenter: BasePresenter<MainScreenFragmentInput,
        MainScreenInteractorInput,
        MainScreenRouterInput>(),
        MainScreenFragmentOutput, MainScreenInteractorOutput {

    override var interactor: MainScreenInteractorInput? = null
    override var activity: MainScreenFragmentInput? = null
    override var router: MainScreenRouterInput? = null

    override fun destructor() {
        activity = null
        interactor?.destructor()
    }
}