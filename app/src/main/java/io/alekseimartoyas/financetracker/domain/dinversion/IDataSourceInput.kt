package io.alekseimartoyas.financetracker.domain.dinversion

import io.alekseimartoyas.financetracker.data.local.Transaction

interface IDataSourceInput {
    fun addTransaction(transaction: Transaction)

    fun addTransactions(transactions: Array<Transaction>)

    fun getTransaction(): Transaction

    fun getTransactions(): Array<Transaction>
}