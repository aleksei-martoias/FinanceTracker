package io.alekseimartoyas.financetracker.di.modules

import dagger.Module
import dagger.Provides
import io.alekseimartoyas.financetracker.datalayer.Currency
import io.alekseimartoyas.financetracker.datalayer.OperationType
import io.alekseimartoyas.financetracker.datalayer.Transaction
import io.alekseimartoyas.financetracker.domain.entity.FinanceCalculating

@Module
class FinanceCalculatingModule {

    @Provides
    fun financeCalculating(): FinanceCalculating = FinanceCalculating(
            arrayOf(Transaction(0, OperationType.ENLISTMENT,5F, Currency.USD)))  // заглушка
}