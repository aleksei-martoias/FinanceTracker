package io.alekseimartoyas.financetracker.modules.navigationdrawer.configurator

import io.alekseimartoyas.financetracker.modules.navigationdrawer.interactor.MainActivityInteractor
import io.alekseimartoyas.financetracker.modules.navigationdrawer.presenter.MainActivityPresenter
import io.alekseimartoyas.financetracker.modules.navigationdrawer.router.MainActivityRouter
import io.alekseimartoyas.financetracker.modules.navigationdrawer.view.MainActivity

class MainActivityConfigurator {

    fun buildModule(view: MainActivity) {
        val presenter = MainActivityPresenter()
        val interactor = MainActivityInteractor()
        val router = MainActivityRouter()

        view.presenter = presenter

        presenter.view = view
        presenter.interactor = interactor
        presenter.router = router
    }
}