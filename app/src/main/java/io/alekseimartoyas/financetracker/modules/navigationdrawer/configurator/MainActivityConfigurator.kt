package io.alekseimartoyas.financetracker.modules.navigationdrawer.configurator

import io.alekseimartoyas.financetracker.modules.navigationdrawer.interactor.MainActivityInteractor
import io.alekseimartoyas.financetracker.modules.navigationdrawer.presenter.MainActivityPresenter
import io.alekseimartoyas.financetracker.modules.navigationdrawer.router.MainActivityRouter
import io.alekseimartoyas.financetracker.modules.navigationdrawer.view.MainActivity

class MainActivityConfigurator {

    fun buildModule(context: MainActivity) {
        val presenter = MainActivityPresenter()
        val interactor = MainActivityInteractor()
        val router = MainActivityRouter()

        context.presenter = presenter

        presenter.activity = context
        presenter.interactor = interactor
        presenter.router = router
    }
}