package io.alekseimartoyas.financetracker.presentation.modules.history.view

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import io.alekseimartoyas.financetracker.R
import io.alekseimartoyas.financetracker.presentation.modules.history.presenter.IHistoryFragmentInput
import io.alekseimartoyas.tradetracker.Foundation.BaseFragment
import kotlinx.android.synthetic.main.fragment_history.*

class HistoryFragment: BaseFragment<IHistoryFragmentPresenter>(),
        IHistoryFragmentInput {
    override var presenter: IHistoryFragmentPresenter? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_history, container, false)

        transaction_rv.layoutManager = LinearLayoutManager(inflater.context,
                LinearLayout.VERTICAL,
                false)

        return rootView
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        add_transaction_fab.setOnClickListener { view ->

        }
    }
}