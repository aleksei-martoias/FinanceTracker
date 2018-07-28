package io.alekseimartoyas.financetracker.domain.entity

import io.alekseimartoyas.financetracker.datalayer.Currency

interface FinanceCalculatingInput {
    fun calculateTransactionsSum(inCurrency: Currency): Float
}