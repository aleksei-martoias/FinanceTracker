package io.alekseimartoyas.financetracker.presentation.modules.navigationdrawer.view

import android.content.Context
import io.alekseimartoyas.financetracker.presentation.foundation.IBaseViewPresenter

interface IMainActivityPresenter: IBaseViewPresenter {
    fun blockStartActivity()

    fun unblockStartActivity()

    fun showSettings(context: Context)
}