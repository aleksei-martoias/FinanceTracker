package io.alekseimartoyas.financetracker.modules.settings.presenter

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
    override var activity: SettingsInput? = null
    override var router: SettingsRouterInput? = null

    override fun destructor() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}