package io.alekseimartoyas.financetracker.di

import dagger.Component
import io.alekseimartoyas.financetracker.entity.FinanceCalculating
import io.alekseimartoyas.financetracker.services.DataSource

@Component(modules = [FinanceCalculatingModule::class, DataSourceModule::class])
interface ServicesEntityComponent {
    fun getDataSource(): DataSource
    fun getFinanceCalculating(): FinanceCalculating
}