package io.alekseimartoyas.financetracker.di.modules

import dagger.Module
import dagger.Provides
import io.alekseimartoyas.financetracker.services.ExchRateProvider
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
class ExchRateProviderModule {
    @Provides
    fun retrofit(): Retrofit = Retrofit
            .Builder()
            .baseUrl("https://www.cbr-xml-daily.ru")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    @Provides
    fun exchRateProvider(retrofit: Retrofit): ExchRateProvider = ExchRateProvider(retrofit)
}