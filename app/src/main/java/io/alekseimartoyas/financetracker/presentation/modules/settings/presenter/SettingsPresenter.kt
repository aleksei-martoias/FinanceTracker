package io.alekseimartoyas.financetracker.presentation.modules.settings.presenter

import android.content.Context
import io.alekseimartoyas.financetracker.presentation.modules.navigationdrawer.router.IMainActivityRouterInput
import io.alekseimartoyas.tradetracker.Foundation.BasePresenter

class SettingsPresenter(view: ISettingsActivityInput,
                        router: IMainActivityRouterInput?):
        BasePresenter<ISettingsActivityInput,
        IMainActivityRouterInput>(view, router) {
    override fun onStart() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onStop() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun showAboutApp(context: Context) {
//        if (canStartActivity)
//            router?.showAboutApp(context)
    }
}