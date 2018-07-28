package io.alekseimartoyas.financetracker.presentation.modules.settings.view

import android.content.Context
import io.alekseimartoyas.financetracker.presentation.foundation.IBaseViewPresenter

interface ISettingsPresenter: IBaseViewPresenter {
    fun blockStartActivity()

    fun unblockStartActivity()

    fun showAboutApp(context: Context)
}