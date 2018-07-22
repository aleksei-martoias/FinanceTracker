package io.alekseimartoyas.financetracker.modules.navigationdrawer.presenter

import android.content.Context
import io.alekseimartoyas.financetracker.modules.navigationdrawer.interactor.MainActivityInteractorInput
import io.alekseimartoyas.financetracker.modules.navigationdrawer.interactor.MainActivityInteractorOutput
import io.alekseimartoyas.financetracker.modules.navigationdrawer.router.MainActivityRouterInput
import io.alekseimartoyas.financetracker.modules.navigationdrawer.view.MainActivityInput
import io.alekseimartoyas.financetracker.modules.navigationdrawer.view.MainActivityOutput
import io.alekseimartoyas.tradetracker.Foundation.BasePresenter

class MainActivityPresenter: BasePresenter<MainActivityInput,
        MainActivityInteractorInput,
        MainActivityRouterInput>(),
        MainActivityOutput,
        MainActivityInteractorOutput {

    override var interactor: MainActivityInteractorInput? = null
    override var activity: MainActivityInput? = null
    override var router: MainActivityRouterInput? = null
    var canStartActivity = false

    override fun blockStartActivity() {
        canStartActivity = false
    }

    override fun unblockStartActivity() {
        canStartActivity = true
    }

    override fun showSettings(context: Context) {
        if (canStartActivity)
            router?.showSettings(context)
    }

    override fun destructor() {
        activity = null
        interactor?.destructor()
    }

}
