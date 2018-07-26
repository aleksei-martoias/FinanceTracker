package io.alekseimartoyas.financetracker.presentation.modules.navigationdrawer.configurator

import io.alekseimartoyas.financetracker.presentation.modules.navigationdrawer.presenter.MainActivityPresenter
import io.alekseimartoyas.financetracker.presentation.modules.navigationdrawer.view.MainActivity

class MainActivityConfigurator {

    fun buildModule(view: MainActivity) {
        val presenter = MainActivityPresenter()

        view.presenter = presenter

        presenter.setView(view)
    }
}