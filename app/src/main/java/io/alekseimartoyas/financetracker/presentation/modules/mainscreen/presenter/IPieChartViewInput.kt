package io.alekseimartoyas.financetracker.presentation.modules.mainscreen.presenter

import com.github.mikephil.charting.charts.PieChart
import io.alekseimartoyas.financetracker.datalayer.Transaction

interface IPieChartViewInput {
    fun changeData(data: List<Transaction>)

    fun destructor()
}