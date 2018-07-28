package io.alekseimartoyas.financetracker.di

import dagger.Component
import io.alekseimartoyas.financetracker.di.modules.DataSourceModule
import io.alekseimartoyas.financetracker.di.modules.FinanceCalculatingModule
import io.alekseimartoyas.financetracker.di.modules.SettingsModule
import io.alekseimartoyas.financetracker.domain.entity.FinanceCalculating
import io.alekseimartoyas.financetracker.services.DataSource
import io.alekseimartoyas.financetracker.services.SettingsSevice

@Component(modules = [FinanceCalculatingModule::class,
    DataSourceModule::class,
    SettingsModule::class])
interface ServicesEntityComponent {
    fun getDataSource(): DataSource
    fun getFinanceCalculating(): FinanceCalculating
    fun getSettingsService(): SettingsSevice
}