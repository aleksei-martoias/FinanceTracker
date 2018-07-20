package io.alekseimartoyas.financetracker.modules.anothercurrency.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.alekseimartoyas.financetracker.R
import io.alekseimartoyas.tradetracker.Foundation.BaseFragment

class AnotherCurrencyFragment: BaseFragment<AnotherCurrencyFragmentOutput>(),
        AnotherCurrencyFragmentInput {

    override var presenter: AnotherCurrencyFragmentOutput? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_another_currency, container, false)
    }

    override fun destructor() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}