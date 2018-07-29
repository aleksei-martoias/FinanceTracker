package io.alekseimartoyas.financetracker.presentation.modules.navigationdrawer.router


interface IMainActivityRouterInput {
    fun showSettings()
    fun showAddTransaction()
    fun showAddAccount()
    fun returnFromAddAccount()
}