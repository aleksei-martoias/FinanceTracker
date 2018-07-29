package io.alekseimartoyas.financetracker.presentation.modules.history.view

import io.alekseimartoyas.financetracker.presentation.foundation.IBaseViewPresenter
import io.alekseimartoyas.financetracker.presentation.modules.history.view.RecyclerViewManager.TransactionRVAdapter

interface IHistoryFragmentPresenter: IBaseViewPresenter {
    fun getAdapter(): TransactionRVAdapter?
    fun showAddTransaction()
}