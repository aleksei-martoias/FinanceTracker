package io.alekseimartoyas.financetracker.entity

import io.alekseimartoyas.financetracker.datalayer.Currency
import io.alekseimartoyas.financetracker.datalayer.OperationType
import io.alekseimartoyas.financetracker.datalayer.Transaction

class FinanceCalculating(val transactions: Array<Transaction>) {

    fun calculateTransactionsSum(inCurrency: Currency): Float {
        var balance: Float = 0F

        for (item in transactions)
            if (item.operationType == OperationType.ENLISTMENT)
                balance += toTargetCurrency(item, inCurrency, 1F)
            else if (item.operationType == OperationType.DEBIT)
                balance -= toTargetCurrency(item, inCurrency, 1F)

        return balance
    }

    // может перенести в Transaction
    private fun toTargetCurrency(transaction: Transaction,
                                 target: Currency,
                                 course: Float): Float = //где взять курс
            if (transaction.currency == target)
                transaction.quantity
            else
                transaction.quantity * course
}