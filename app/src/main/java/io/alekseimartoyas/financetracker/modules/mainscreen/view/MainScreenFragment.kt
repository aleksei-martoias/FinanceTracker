package io.alekseimartoyas.financetracker.modules.mainscreen.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import io.alekseimartoyas.financetracker.R
import io.alekseimartoyas.tradetracker.Foundation.BaseFragment

class MainScreenFragment: BaseFragment<MainScreenFragmentOutput>(),
        MainScreenFragmentInput {
    override var presenter: MainScreenFragmentOutput? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_main_screen, container, false)

        return rootView
    }

    override fun destructor() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}