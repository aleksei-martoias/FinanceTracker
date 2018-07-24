package io.alekseimartoyas.financetracker.modules.settings.presenter

import android.content.Context
import io.alekseimartoyas.financetracker.modules.settings.interactor.SettingsInteractorInput
import io.alekseimartoyas.financetracker.modules.settings.interactor.SettingsInteractorOutput
import io.alekseimartoyas.financetracker.modules.settings.router.SettingsRouterInput
import io.alekseimartoyas.financetracker.modules.settings.view.SettingsInput
import io.alekseimartoyas.financetracker.modules.settings.view.SettingsOutput
import io.alekseimartoyas.tradetracker.Foundation.BasePresenter

class SettingsPresenter: BasePresenter<SettingsInput,
        SettingsInteractorInput,
        SettingsRouterInput>(),
        SettingsOutput,
        SettingsInteractorOutput {

    override var interactor: SettingsInteractorInput? = null
    override var view: SettingsInput? = null
    override var router: SettingsRouterInput? = null
    var canStartActivity = false

    override fun blockStartActivity() {
        canStartActivity = false
    }

    override fun unblockStartActivity() {
        canStartActivity = true
    }

    override fun showAboutApp(context: Context) {
        if (canStartActivity)
            router?.showAboutApp(context)
    }

    override fun destructor() {
        view = null
        interactor?.destructor()
    }

}