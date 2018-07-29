package io.alekseimartoyas.financetracker.presentation.modules.mainscreen.presenter

import io.alekseimartoyas.financetracker.data.local.Transaction

interface IPieChartViewInput {
    fun changeData(data: List<Transaction>)

    fun destructor()
}