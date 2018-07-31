package io.alekseimartoyas.financetracker.presentation.modules.addaccount.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import io.alekseimartoyas.financetracker.R
import io.alekseimartoyas.financetracker.presentation.modules.addaccount.configurator.AddAccountConfigurator
import io.alekseimartoyas.financetracker.presentation.modules.addaccount.presenter.IAddAccountFragmentInput
import io.alekseimartoyas.tradetracker.Foundation.BaseActivity
import io.alekseimartoyas.tradetracker.Foundation.BaseFragment

class AddAccountFragment: BaseFragment<IAddAccountFragmentPresenter>(),
        IAddAccountFragmentInput {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_add_account, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        AddAccountConfigurator().buildModule(this)
        setTb()
    }

    fun setTb() {
        (activity as BaseActivity<*>).supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            android.R.id.home -> presenter?.backButtonTb()
        }
        return super.onOptionsItemSelected(item)
    }
}