package io.alekseimartoyas.financetracker.presentation.modules.addaccount.presenter

import io.alekseimartoyas.financetracker.presentation.modules.addaccount.view.IAddAccountFragmentPresenter
import io.alekseimartoyas.financetracker.presentation.modules.navigationdrawer.router.IMainActivityRouterInput
import io.alekseimartoyas.tradetracker.Foundation.BasePresenter

class AddAccountPresenter: BasePresenter<IAddAccountFragmentInput,
        IMainActivityRouterInput>(),
        IAddAccountFragmentPresenter {

    override fun onStart() {

    }

    override fun backButtonTb() {
        getRouter()?.returnFromAddAccount()
    }

    override fun onStop() {

    }

}