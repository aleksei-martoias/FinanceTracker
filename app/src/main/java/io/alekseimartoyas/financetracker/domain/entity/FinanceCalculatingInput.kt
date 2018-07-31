package io.alekseimartoyas.financetracker.domain.entity

import io.alekseimartoyas.financetracker.domain.Currency

interface FinanceCalculatingInput {
    fun calculateTransactionsSum(inCurrency: Currency): Float
}