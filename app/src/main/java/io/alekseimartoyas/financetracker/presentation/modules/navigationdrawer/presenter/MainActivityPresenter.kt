package io.alekseimartoyas.financetracker.presentation.modules.navigationdrawer.presenter

import io.alekseimartoyas.financetracker.presentation.modules.navigationdrawer.router.IMainActivityRouterInput
import io.alekseimartoyas.tradetracker.Foundation.BasePresenter

class MainActivityPresenter(
        view: IMainActivityInput,
        router: IMainActivityRouterInput?):
        BasePresenter<IMainActivityInput,
        IMainActivityRouterInput>() {
    override fun onStart() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onStop() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun blockStartActivity() {
    }

    fun unblockStartActivity() {
    }

    fun showSettings() {
//      router?.showSettings(context)
    }
}
