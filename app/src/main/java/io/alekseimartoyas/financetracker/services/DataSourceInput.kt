package io.alekseimartoyas.financetracker.services

import io.alekseimartoyas.financetracker.datalayer.Transaction

interface DataSourceInput {
    fun addTransaction(transaction: Transaction)

    fun addTransactions(transactions: Array<Transaction>)

    fun getTransaction(): Transaction

    fun getTransactions(): Array<Transaction>
}