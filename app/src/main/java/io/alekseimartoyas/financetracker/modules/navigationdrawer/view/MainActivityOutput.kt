package io.alekseimartoyas.financetracker.modules.navigationdrawer.view

import android.content.Context

interface MainActivityOutput {
    fun destructor()

    fun blockStartActivity()

    fun unblockStartActivity()

    fun showSettings(context: Context)
}