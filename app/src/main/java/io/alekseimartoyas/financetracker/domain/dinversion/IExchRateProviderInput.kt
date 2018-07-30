package io.alekseimartoyas.financetracker.domain.dinversion

import io.alekseimartoyas.financetracker.data.network.DailyResponse
import io.reactivex.Observable

interface IExchRateProviderInput {
    fun getExchRates(): Observable<DailyResponse>
}