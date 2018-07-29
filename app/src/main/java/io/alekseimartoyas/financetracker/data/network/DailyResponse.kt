package io.alekseimartoyas.financetracker.data.network

data class DailyResponse(val Valute: Values)

data class Values(val USD: Information,
                  val AUD: Information,
                  val GBP: Information,
                  val EUR: Information)

data class Information(val Value: Double,
                       val Name: String)