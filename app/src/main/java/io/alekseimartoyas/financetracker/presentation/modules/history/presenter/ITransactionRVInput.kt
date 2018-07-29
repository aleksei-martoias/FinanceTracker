package io.alekseimartoyas.financetracker.presentation.modules.history.presenter

import io.alekseimartoyas.financetracker.data.local.Transaction

interface ITransactionRVInput {
    fun setData(transactions: Array<Transaction>)
}