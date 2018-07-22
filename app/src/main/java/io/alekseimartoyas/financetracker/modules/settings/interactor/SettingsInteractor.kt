package io.alekseimartoyas.financetracker.modules.settings.interactor

import io.alekseimartoyas.tradetracker.Foundation.BaseInteractor

class SettingsInteractor: BaseInteractor<SettingsInteractorOutput>(),
        SettingsInteractorInput {
    override var presenter: SettingsInteractorOutput? = null

    override fun destructor() {

    }
}