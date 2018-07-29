package io.alekseimartoyas.financetracker.presentation.modules.mainscreen.presenter

import io.alekseimartoyas.financetracker.App.Companion.graph
import io.alekseimartoyas.financetracker.data.Currency
import io.alekseimartoyas.financetracker.data.OperationType
import io.alekseimartoyas.financetracker.data.Transaction
import io.alekseimartoyas.financetracker.domain.interactors.GetExchRateInteractor
import io.alekseimartoyas.financetracker.presentation.modules.mainscreen.view.IMainScreenFragmentPresenter
import io.alekseimartoyas.financetracker.presentation.modules.navigationdrawer.router.IMainActivityRouterInput
import io.alekseimartoyas.tradetracker.Foundation.BasePresenter

class MainScreenPresenter: BasePresenter<IMainScreenFragmentInput,
        IMainActivityRouterInput>(),
        IMainScreenFragmentPresenter {

    var pieChart: IPieChartViewInput? = null

    var inter = GetExchRateInteractor(graph.getExchRateProvider())

    override fun onStart() {
        pieChart?.changeData(listOf(
                Transaction(1,
                        OperationType.ENLISTMENT,
                        75F,
                        Currency.USD,
                        "correcting",
                        "yesterday"),
                Transaction(2,
                        OperationType.DEBIT,
                        25F,
                        Currency.USD,
                        "Food",
                        "today")))

        inter.execute("") {}
    }

    override fun onStop() {
        pieChart?.destructor()  //  может не надо это делать в onStop, хотя data может измениться
    }

}