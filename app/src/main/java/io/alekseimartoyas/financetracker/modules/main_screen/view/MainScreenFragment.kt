package io.alekseimartoyas.financetracker.modules.main_screen.view

import io.alekseimartoyas.tradetracker.Foundation.BaseFragment

class MainScreenFragment: BaseFragment<MainScreenFragmentOutput>(),
        MainScreenFragmentInput {
    override var presenter: MainScreenFragmentOutput? = null

    override fun destructor() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}