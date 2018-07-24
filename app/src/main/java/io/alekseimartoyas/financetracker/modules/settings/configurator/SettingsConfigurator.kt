package io.alekseimartoyas.financetracker.modules.settings.configurator

import io.alekseimartoyas.financetracker.App.Companion.graph
import io.alekseimartoyas.financetracker.modules.settings.interactor.SettingsInteractor
import io.alekseimartoyas.financetracker.modules.settings.presenter.SettingsPresenter
import io.alekseimartoyas.financetracker.modules.settings.router.SettingsRouter
import io.alekseimartoyas.financetracker.modules.settings.view.SettingsActivity

class SettingsConfigurator {

    fun buildModule(view: SettingsActivity) {
        val presenter = SettingsPresenter()
        val interactor = SettingsInteractor()
        val router = SettingsRouter()

        view.presenter = presenter

        presenter.view = view
        presenter.interactor = interactor
        presenter.router = router

        interactor.presenter = presenter
        interactor.settingsService = graph.getSettingsService()
    }
}