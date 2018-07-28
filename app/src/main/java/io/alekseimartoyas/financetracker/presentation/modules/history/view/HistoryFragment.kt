package io.alekseimartoyas.financetracker.presentation.modules.history.view

import io.alekseimartoyas.financetracker.presentation.modules.history.presenter.IHistoryFragmentInput
import io.alekseimartoyas.tradetracker.Foundation.BaseFragment

class HistoryFragment: BaseFragment<IHistoryFragmentPresenter>(),
        IHistoryFragmentInput {
    override var presenter: IHistoryFragmentPresenter? = null
}