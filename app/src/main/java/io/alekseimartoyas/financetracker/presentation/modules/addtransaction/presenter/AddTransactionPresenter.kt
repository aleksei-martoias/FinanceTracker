package io.alekseimartoyas.financetracker.presentation.modules.addtransaction.presenter

import io.alekseimartoyas.financetracker.presentation.modules.addtransaction.router.IAddTransactionRouter
import io.alekseimartoyas.financetracker.presentation.modules.addtransaction.view.IAddTransactionActivityPresenter
import io.alekseimartoyas.tradetracker.Foundation.BasePresenter

class AddTransactionPresenter(view: IAddTransactionActivityInput,
                              router: IAddTransactionRouter?):
        BasePresenter<IAddTransactionActivityInput,
        IAddTransactionRouter>(view, router) {

    override fun onStart() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onStop() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}