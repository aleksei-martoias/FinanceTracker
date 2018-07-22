package io.alekseimartoyas.financetracker

import android.support.test.runner.AndroidJUnit4
import io.alekseimartoyas.financetracker.datalayer.Currency
import io.alekseimartoyas.financetracker.datalayer.OperationType
import io.alekseimartoyas.financetracker.datalayer.Transaction
import io.alekseimartoyas.financetracker.entity.FinanceCalculating
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class FinanceCalculatingTest {

    @Test
    fun sumEqualCurrencies() {
        val transactions = arrayOf(Transaction(0, OperationType.ENLISTMENT, 4F, Currency.RUB),
            Transaction(0, OperationType.ENLISTMENT, 5F, Currency.RUB))
        val logic = FinanceCalculating(transactions)
        Assert.assertEquals(9F, logic.calculateTransactionsSum(Currency.RUB))
    }

    fun sumDifferentCurrencies() {
        val transactions = arrayOf(Transaction(0, OperationType.ENLISTMENT, 4F, Currency.RUB),
                Transaction(0, OperationType.ENLISTMENT, 5F, Currency.USD))
        val logic = FinanceCalculating(transactions)
        Assert.assertEquals(14F, logic.calculateTransactionsSum(Currency.RUB))
    }

    fun subEqualCurrencies() {
        val transactions = arrayOf(Transaction(0, OperationType.ENLISTMENT, 400F, Currency.RUB),
                Transaction(0, OperationType.DEBIT, 5F, Currency.RUB))
        val logic = FinanceCalculating(transactions)
        Assert.assertEquals(395F, logic.calculateTransactionsSum(Currency.RUB))
    }

    fun subDifferentCurrencies() {
        val transactions = arrayOf(Transaction(0, OperationType.ENLISTMENT, 400F, Currency.RUB),
                Transaction(0, OperationType.DEBIT, 5F, Currency.USD))
        val logic = FinanceCalculating(transactions)
        Assert.assertEquals(390F, logic.calculateTransactionsSum(Currency.RUB))
    }
}