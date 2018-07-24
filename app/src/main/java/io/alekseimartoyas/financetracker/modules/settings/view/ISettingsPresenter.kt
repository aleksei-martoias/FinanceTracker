package io.alekseimartoyas.financetracker.modules.settings.view

import android.content.Context

interface ISettingsPresenter {
    fun destructor()

    fun blockStartActivity()

    fun unblockStartActivity()

    fun showAboutApp(context: Context)
}