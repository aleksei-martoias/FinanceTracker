package io.alekseimartoyas.financetracker.services

import io.alekseimartoyas.financetracker.data.network.DailyResponse
import io.alekseimartoyas.financetracker.data.network.IRetrofitReqs
import io.alekseimartoyas.financetracker.domain.dinversion.IExchRateProviderInput
import io.reactivex.Observable

class ExchRateProvider(private val retrofit: IRetrofitReqs): IExchRateProviderInput {
    override fun getExchRates(): Observable<DailyResponse> {
        return retrofit.getExchRates()
    }
}