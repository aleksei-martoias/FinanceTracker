package io.alekseimartoyas.financetracker.presentation.modules.mainscreen.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import io.alekseimartoyas.financetracker.R
import io.alekseimartoyas.financetracker.presentation.modules.anothercurrency.view.AnotherCurrencyFragment
import io.alekseimartoyas.financetracker.presentation.modules.mainscreen.configurator.MainScreenConfigurator
import io.alekseimartoyas.financetracker.presentation.modules.mainscreen.presenter.IMainScreenFragmentInput
import io.alekseimartoyas.financetracker.presentation.modules.mainscreen.presenter.MainScreenPresenter
import io.alekseimartoyas.tradetracker.Foundation.BaseFragment
import kotlinx.android.synthetic.main.fragment_main_screen.*

class MainScreenFragment: BaseFragment<MainScreenPresenter>(),
        IMainScreenFragmentInput {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_main_screen, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        MainScreenConfigurator().buildModule(this)
        setAddAccountBtListener()
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
    }

    fun setAddAccountBtListener() {
        add_account_bt.setOnClickListener {
//            presenter?.showAddAccount()
        }
    }

    override fun onStart() {
        super.onStart()
        presenter?.onStart()
        presenter?.getAccountsId()
        presenter?.getAccountData(/*selected*/1)
    }

    override fun onStop() {
        super.onStop()
        presenter?.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter?.destructor()
    }
}