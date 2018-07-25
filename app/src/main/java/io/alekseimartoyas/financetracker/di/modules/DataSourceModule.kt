package io.alekseimartoyas.financetracker.di.modules

import dagger.Module
import dagger.Provides
import io.alekseimartoyas.financetracker.services.DataSource

@Module
class DataSourceModule {
    @Provides
    fun dataSource(): DataSource = DataSource()
}