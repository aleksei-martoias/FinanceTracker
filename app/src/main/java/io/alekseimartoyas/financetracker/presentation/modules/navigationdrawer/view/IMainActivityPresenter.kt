package io.alekseimartoyas.financetracker.presentation.modules.navigationdrawer.view

import android.content.Context

interface IMainActivityPresenter {
    fun destructor()

    fun blockStartActivity()

    fun unblockStartActivity()

    fun showSettings(context: Context)
}