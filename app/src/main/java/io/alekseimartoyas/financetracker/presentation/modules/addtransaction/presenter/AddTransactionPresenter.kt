package io.alekseimartoyas.financetracker.presentation.modules.addtransaction.presenter

import io.alekseimartoyas.financetracker.presentation.modules.addtransaction.router.IAddTransactionRouter
import io.alekseimartoyas.tradetracker.Foundation.BasePresenter
import java.text.SimpleDateFormat
import java.util.*

class AddTransactionPresenter(view: IAddTransactionActivityInput,
                              router: IAddTransactionRouter?):
        BasePresenter<IAddTransactionActivityInput,
        IAddTransactionRouter>(view, router) {

    override fun onStart() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun getDate(): String {
        var date: Date = Calendar.getInstance().time

        val myFormat = "dd.MM.yyyy" // mention the format you need
        val sdf = SimpleDateFormat(myFormat, Locale.getDefault())

        return sdf.format(date)
    }

    override fun onStop() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}