package io.alekseimartoyas.financetracker.presentation.modules.addaccount.view

import io.alekseimartoyas.financetracker.presentation.modules.addaccount.presenter.IAddAccountFragmentInput
import io.alekseimartoyas.tradetracker.Foundation.BaseFragment

class AddAccountFragment: BaseFragment<IAddAccountFragmentPresenter>(),
        IAddAccountFragmentInput {
    override var presenter: IAddAccountFragmentPresenter? = null

}