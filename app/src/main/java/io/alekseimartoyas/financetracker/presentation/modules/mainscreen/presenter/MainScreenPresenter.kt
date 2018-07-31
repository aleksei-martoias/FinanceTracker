package io.alekseimartoyas.financetracker.presentation.modules.mainscreen.presenter

import io.alekseimartoyas.financetracker.domain.Currency
import io.alekseimartoyas.financetracker.domain.OperationType
import io.alekseimartoyas.financetracker.data.local.Transaction
import io.alekseimartoyas.financetracker.presentation.modules.navigationdrawer.router.IMainActivityRouterInput
import io.alekseimartoyas.tradetracker.Foundation.BasePresenter

class MainScreenPresenter(view: IMainScreenFragmentInput,
                          router: IMainActivityRouterInput,
                          var pieChart: IPieChartViewInput? = null):
        BasePresenter<IMainScreenFragmentInput,
        IMainActivityRouterInput>(view, router) {

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
    }

    fun showAddAccount() {
        router?.showAddAccount()
    }

    fun getAccountsId(): Array<Int> {
        return arrayOf()  //from interactor
    }

    fun getAccountData(accountId: Int) {
        //from interactor
    }

    override fun onStop() {
        pieChart?.destructor()  //  может не надо это делать в onStop, хотя data может измениться
    }

    override fun destructor() {
        super.destructor()
        view = null
        pieChart?.destructor()
    }
}