package io.alekseimartoyas.financetracker.presentation.modules.history.presenter

import io.alekseimartoyas.financetracker.data.Transaction

interface ITransactionRVInput {
    fun setData(transactions: Array<Transaction>)
}