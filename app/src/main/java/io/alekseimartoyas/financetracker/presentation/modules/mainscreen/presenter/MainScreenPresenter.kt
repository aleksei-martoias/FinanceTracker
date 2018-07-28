package io.alekseimartoyas.financetracker.presentation.modules.mainscreen.presenter

import io.alekseimartoyas.financetracker.presentation.modules.mainscreen.view.IMainScreenFragmentPresenter
import io.alekseimartoyas.financetracker.presentation.modules.navigationdrawer.router.IMainActivityRouterInput
import io.alekseimartoyas.tradetracker.Foundation.BasePresenter

class MainScreenPresenter: BasePresenter<IMainScreenFragmentInput,
        IMainActivityRouterInput>(),
        IMainScreenFragmentPresenter {

}