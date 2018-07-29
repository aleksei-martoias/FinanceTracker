package io.alekseimartoyas.financetracker.presentation.modules.mainscreen.view.PieChartManager

import com.github.mikephil.charting.charts.PieChart
import com.github.mikephil.charting.data.PieData
import com.github.mikephil.charting.data.PieDataSet
import com.github.mikephil.charting.data.PieEntry
import com.github.mikephil.charting.utils.ColorTemplate
import io.alekseimartoyas.financetracker.data.Transaction
import io.alekseimartoyas.financetracker.presentation.modules.mainscreen.presenter.IPieChartViewInput

class PieChartView(chart: PieChart): IPieChartViewInput {
    private var chart: PieChart? = chart
    private lateinit var chartData: List<Transaction>

    override fun changeData(data: List<Transaction>) {
        chartData = data
        setup()
    }

    private fun setup() {
        val pieData = hashMapOf<String, Float>()
        for (item in chartData)
            if (pieData[item.category] == null)
                pieData[item.category] = item.quantity
            else
                pieData[item.category] = (pieData[item.category] ?: 0F) + item.quantity

        var pieEntries = mutableListOf<PieEntry>()

//        val colors = mutableListOf<Int>()

        for (item in pieData) {
            val value = PieEntry(item.value, item.key)
            pieEntries.add(value)
//            colors.add(getColor(item.key))
        }

        val dataSet = PieDataSet(pieEntries, "")
        dataSet.colors = ColorTemplate.COLORFUL_COLORS.toList()
//        dataSet.valueTextColor = Color.WHITE
        dataSet.valueTextSize = 12f
//        dataSet.valueFormatter = PercentFormatter()
//        dataSet.setDrawValues(false)
        val data = PieData(dataSet)
        chart?.data = data
        chart?.setDrawEntryLabels(false)
        chart?.description?.isEnabled = false
        chart?.setUsePercentValues(true)
//        chart?.legend?.position = Legend.LegendPosition.BELOW_CHART_CENTER
        chart?.legend?.isWordWrapEnabled = true
        chart?.legend?.textSize = 14f
        chart?.invalidate()
    }

    override fun destructor() {
        chart = null
//        contextView = null
    }
}