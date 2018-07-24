package io.alekseimartoyas.financetracker.modules.settings.interactor

import io.alekseimartoyas.financetracker.services.SettingsSeviceInput
import io.alekseimartoyas.tradetracker.Foundation.BaseInteractor

class SettingsInteractor: BaseInteractor<ISettingsInteractorPresenter>(),
        ISettingsInteractorInput {
    override var presenter: ISettingsInteractorPresenter? = null
    var settingsService: SettingsSeviceInput? = null

    override fun destructor() {

    }
}