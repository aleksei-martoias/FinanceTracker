package io.alekseimartoyas.financetracker.services

import io.alekseimartoyas.financetracker.datalayer.Transaction
import io.alekseimartoyas.financetracker.domain.dinversion.IDataSourceInput

class DataSource: IDataSourceInput {
    override fun addTransaction(transaction: Transaction) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun addTransactions(transactions: Array<Transaction>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getTransaction(): Transaction {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getTransactions(): Array<Transaction> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}