package io.alekseimartoyas.financetracker.presentation.modules.anothercurrency.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.alekseimartoyas.financetracker.R
import io.alekseimartoyas.financetracker.presentation.modules.anothercurrency.configurator.AnotherCurrencyConfigurator
import io.alekseimartoyas.tradetracker.Foundation.BaseFragment

class AnotherCurrencyFragment: BaseFragment<IAnotherCurrencyFragmentPresenter>(),
        IAnotherCurrencyFragmentInput {

    override var presenter: IAnotherCurrencyFragmentPresenter? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_another_currency, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        AnotherCurrencyConfigurator().buildModule(this)
    }

    override fun onDestroy() {
        super.onDestroy()

        presenter?.destructor()
    }
}