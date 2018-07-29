package io.alekseimartoyas.financetracker.domain.dinversion

import io.alekseimartoyas.financetracker.data.network.DailyResponse
import io.reactivex.Observable
import io.reactivex.Scheduler

interface IExchRateProviderInput {
    fun getExchRates(): Observable<DailyResponse>
}