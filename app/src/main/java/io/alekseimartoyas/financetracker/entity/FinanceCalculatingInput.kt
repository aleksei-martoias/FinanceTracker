package io.alekseimartoyas.financetracker.entity

import io.alekseimartoyas.financetracker.datalayer.Currency

interface FinanceCalculatingInput {
    fun calculateTransactionsSum(inCurrency: Currency): Float
}