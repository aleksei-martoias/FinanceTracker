package io.alekseimartoyas.financetracker.presentation.modules.navigationdrawer.view

import io.alekseimartoyas.financetracker.presentation.foundation.IBaseViewPresenter

interface IMainActivityPresenter: IBaseViewPresenter {
    fun blockStartActivity()

    fun unblockStartActivity()

    fun showSettings()
}