package io.alekseimartoyas.financetracker.presentation.modules.navigationdrawer.presenter

import android.content.Context
import io.alekseimartoyas.financetracker.presentation.modules.navigationdrawer.interactor.IMainActivityInteractorInput
import io.alekseimartoyas.financetracker.presentation.modules.navigationdrawer.interactor.IMainActivityInteractorPresenter
import io.alekseimartoyas.financetracker.presentation.modules.navigationdrawer.router.MainActivityRouterInput
import io.alekseimartoyas.financetracker.presentation.modules.navigationdrawer.view.IMainActivityInput
import io.alekseimartoyas.financetracker.presentation.modules.navigationdrawer.view.IMainActivityPresenter
import io.alekseimartoyas.tradetracker.Foundation.BasePresenter

class MainActivityPresenter: BasePresenter<IMainActivityInput,
        /*IMainActivityInteractorInput,*/
        MainActivityRouterInput>(),
        IMainActivityPresenter/*, IMainActivityInteractorPresenter*/ {

//    override var interactor: IMainActivityInteractorInput? = null
//    override var view: IMainActivityInput? = null
//    override var router: MainActivityRouterInput? = null
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
