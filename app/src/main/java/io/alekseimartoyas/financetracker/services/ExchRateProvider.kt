package io.alekseimartoyas.financetracker.services

import io.alekseimartoyas.financetracker.data.network.DailyResponse
import io.alekseimartoyas.financetracker.data.network.IRetrofitReqs
import io.alekseimartoyas.financetracker.domain.dinversion.IExchRateProviderInput
import io.reactivex.Observable
import io.reactivex.Scheduler

class ExchRateProvider(private val retrofit: IRetrofitReqs): IExchRateProviderInput {
    override fun getExchRates(): Observable<DailyResponse> {
        return retrofit.getExchRates()
    }

    private fun parseDailyResp(data: Any) {
//        val valute =(data as HashMap<*, *>) ["Valute"]
        println()
    }
}