package io.alekseimartoyas.financetracker.presentation.modules.settings.presenter

import android.content.Context
import io.alekseimartoyas.financetracker.presentation.modules.navigationdrawer.router.MainActivityRouterInput
import io.alekseimartoyas.financetracker.presentation.modules.settings.interactor.ISettingsInteractorInput
import io.alekseimartoyas.financetracker.presentation.modules.settings.interactor.ISettingsInteractorPresenter
import io.alekseimartoyas.financetracker.presentation.modules.settings.router.SettingsRouterInput
import io.alekseimartoyas.financetracker.presentation.modules.settings.view.ISettingsActivityInput
import io.alekseimartoyas.financetracker.presentation.modules.settings.view.ISettingsPresenter
import io.alekseimartoyas.tradetracker.Foundation.BasePresenter

class SettingsPresenter: BasePresenter<ISettingsActivityInput,
        /*ISettingsInteractorInput,*/
        MainActivityRouterInput>(),
        ISettingsPresenter/*, ISettingsInteractorPresenter*/ {

//    override var interactor: ISettingsInteractorInput? = null
//    override var view: ISettingsActivityInput? = null
//    override var router: SettingsRouterInput? = null
    var canStartActivity = false

    override fun blockStartActivity() {
        canStartActivity = false
    }

    override fun unblockStartActivity() {
        canStartActivity = true
    }

    override fun showAboutApp(context: Context) {
//        if (canStartActivity)
//            router?.showAboutApp(context)
    }
}