package io.alekseimartoyas.financetracker.modules.main_screen.presenter

import io.alekseimartoyas.financetracker.modules.main_screen.interactor.MainScreenInteractorInput
import io.alekseimartoyas.financetracker.modules.main_screen.interactor.MainScreenInteractorOutput
import io.alekseimartoyas.financetracker.modules.main_screen.router.MainScreenRouterInput
import io.alekseimartoyas.financetracker.modules.main_screen.view.MainScreenFragmentInput
import io.alekseimartoyas.financetracker.modules.main_screen.view.MainScreenFragmentOutput
import io.alekseimartoyas.tradetracker.Foundation.BasePresenter

class MainScreenPresenter: BasePresenter<MainScreenFragmentInput,
        MainScreenInteractorInput,
        MainScreenRouterInput>(),
        MainScreenFragmentOutput, MainScreenInteractorOutput {

    override var interactor: MainScreenInteractorInput? = null
    override var activity: MainScreenFragmentInput? = null
    override var router: MainScreenRouterInput? = null

    override fun destructor() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}