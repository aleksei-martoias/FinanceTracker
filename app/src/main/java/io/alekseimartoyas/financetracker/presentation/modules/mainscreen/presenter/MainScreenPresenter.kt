package io.alekseimartoyas.financetracker.presentation.modules.mainscreen.presenter

import io.alekseimartoyas.financetracker.presentation.modules.mainscreen.interactor.IMainScreenInteractorInput
import io.alekseimartoyas.financetracker.presentation.modules.mainscreen.interactor.IMainScreenInteractorPresenter
import io.alekseimartoyas.financetracker.presentation.modules.mainscreen.view.IMainScreenFragmentInput
import io.alekseimartoyas.financetracker.presentation.modules.mainscreen.view.IMainScreenFragmentPresenter
import io.alekseimartoyas.financetracker.presentation.modules.navigationdrawer.router.MainActivityRouterInput
import io.alekseimartoyas.tradetracker.Foundation.BasePresenter

class MainScreenPresenter: BasePresenter<IMainScreenFragmentInput,
//        IMainScreenInteractorInput,
        MainActivityRouterInput>(),
        IMainScreenFragmentPresenter/*, IMainScreenInteractorPresenter*/ {

//    override var interactor: IMainScreenInteractorInput? = null
//    override var view: IMainScreenFragmentInput? = null
//    override var router: MainScreenRouterInput? = null
}