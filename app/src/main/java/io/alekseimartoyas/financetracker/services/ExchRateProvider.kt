package io.alekseimartoyas.financetracker.services

import io.alekseimartoyas.financetracker.domain.dinversion.IExchRateProviderInput
import retrofit2.Retrofit

class ExchRateProvider(val retrofit: Retrofit): IExchRateProviderInput {

}