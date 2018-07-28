package io.alekseimartoyas.financetracker.presentation.modules.settings.presenter

import android.content.Context
import io.alekseimartoyas.financetracker.presentation.modules.navigationdrawer.router.IMainActivityRouterInput
import io.alekseimartoyas.financetracker.presentation.modules.settings.view.ISettingsPresenter
import io.alekseimartoyas.tradetracker.Foundation.BasePresenter

class SettingsPresenter: BasePresenter<ISettingsActivityInput,
        IMainActivityRouterInput>(),
        ISettingsPresenter {

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