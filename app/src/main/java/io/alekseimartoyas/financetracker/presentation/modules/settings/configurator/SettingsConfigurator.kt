package io.alekseimartoyas.financetracker.presentation.modules.settings.configurator

import io.alekseimartoyas.financetracker.presentation.modules.settings.presenter.SettingsPresenter
import io.alekseimartoyas.financetracker.presentation.modules.settings.view.SettingsActivity

class SettingsConfigurator {

    fun buildModule(view: SettingsActivity) {
        val presenter = SettingsPresenter(view, null)

        view.setPres(presenter)
//        presenter.setRouter()
    }
}