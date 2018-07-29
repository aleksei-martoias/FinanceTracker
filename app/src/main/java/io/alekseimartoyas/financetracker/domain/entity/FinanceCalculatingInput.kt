package io.alekseimartoyas.financetracker.domain.entity

import io.alekseimartoyas.financetracker.data.Currency

interface FinanceCalculatingInput {
    fun calculateTransactionsSum(inCurrency: Currency): Float
}