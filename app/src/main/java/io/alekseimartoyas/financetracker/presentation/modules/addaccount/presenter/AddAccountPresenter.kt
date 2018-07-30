package io.alekseimartoyas.financetracker.presentation.modules.addaccount.presenter

import io.alekseimartoyas.financetracker.presentation.modules.addaccount.view.IAddAccountFragmentPresenter
import io.alekseimartoyas.financetracker.presentation.modules.navigationdrawer.router.IMainActivityRouterInput
import io.alekseimartoyas.tradetracker.Foundation.BasePresenter

class AddAccountPresenter(view: IAddAccountFragmentInput,
                          router: IMainActivityRouterInput):
        BasePresenter<IAddAccountFragmentInput,
        IMainActivityRouterInput>(view, router),
        IAddAccountFragmentPresenter {

    override fun onStart() {

    }

    override fun backButtonTb() {
        router?.returnFromAddAccount()
    }

    override fun onStop() {

    }

}