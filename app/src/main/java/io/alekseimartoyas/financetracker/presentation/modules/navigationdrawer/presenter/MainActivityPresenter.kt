package io.alekseimartoyas.financetracker.presentation.modules.navigationdrawer.presenter

import android.content.Context
import io.alekseimartoyas.financetracker.presentation.modules.navigationdrawer.router.IMainActivityRouterInput
import io.alekseimartoyas.financetracker.presentation.modules.navigationdrawer.view.IMainActivityPresenter
import io.alekseimartoyas.tradetracker.Foundation.BasePresenter

class MainActivityPresenter: BasePresenter<IMainActivityInput,
        IMainActivityRouterInput>(),
        IMainActivityPresenter {
    override fun onStart() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onStop() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    var canStartActivity = false

    override fun blockStartActivity() {
        canStartActivity = false
    }

    override fun unblockStartActivity() {
        canStartActivity = true
    }

    override fun showSettings(context: Context) {
//        if (canStartActivity)
//            router?.showSettings(context)
    }
}
