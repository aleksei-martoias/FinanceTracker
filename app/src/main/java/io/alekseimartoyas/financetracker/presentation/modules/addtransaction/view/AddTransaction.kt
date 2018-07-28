package io.alekseimartoyas.financetracker.presentation.modules.addtransaction.view

import android.os.Bundle
import io.alekseimartoyas.financetracker.R
import io.alekseimartoyas.financetracker.presentation.modules.addtransaction.presenter.IAddTransactionActivityInput
import io.alekseimartoyas.tradetracker.Foundation.BaseActivity

class AddTransaction : BaseActivity<IAddTransactionActivityPresenter>(),
        IAddTransactionActivityInput {

    override var presenter: IAddTransactionActivityPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_transaction)
    }
}
