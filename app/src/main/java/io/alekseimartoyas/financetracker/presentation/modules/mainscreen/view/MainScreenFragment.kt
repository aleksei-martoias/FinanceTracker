package io.alekseimartoyas.financetracker.presentation.modules.mainscreen.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.alekseimartoyas.financetracker.R
import io.alekseimartoyas.financetracker.presentation.modules.anothercurrency.view.AnotherCurrencyFragment
import io.alekseimartoyas.financetracker.presentation.modules.mainscreen.configurator.MainScreenConfigurator
import io.alekseimartoyas.financetracker.presentation.modules.mainscreen.presenter.IMainScreenFragmentInput
import io.alekseimartoyas.financetracker.presentation.modules.mainscreen.presenter.MainScreenPresenter
import io.alekseimartoyas.tradetracker.Foundation.BaseFragment

class MainScreenFragment: BaseFragment<IMainScreenFragmentPresenter>(),
        IMainScreenFragmentInput {
    override var presenter: IMainScreenFragmentPresenter? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_main_screen, container, false)

        if (savedInstanceState == null) {  //To change fragment insertion
            activity?.let {
                it.supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.anoth_curr_card,
                                AnotherCurrencyFragment(),
                                "visible_sub_fragment")
                        .commit()
            }
        }

        return rootView
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        presenter = MainScreenPresenter()
        MainScreenConfigurator().buildModule(this)
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter?.destructor()
    }
}