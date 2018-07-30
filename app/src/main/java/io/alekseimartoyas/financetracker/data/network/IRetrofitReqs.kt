package io.alekseimartoyas.financetracker.data.network

import io.reactivex.Observable
import retrofit2.Call
import retrofit2.http.GET

interface IRetrofitReqs {
    @GET("/daily_json.js")
    fun getExchRates(): Observable<DailyResponse>
}