package io.alekseimartoyas.financetracker.presentation.modules.navigationdrawer.router

import android.content.Context
import android.content.Intent
import io.alekseimartoyas.financetracker.presentation.modules.settings.view.SettingsActivity

class MainActivityRouter: MainActivityRouterInput {
    override fun showSettings(context: Context) {
        context.startActivity(Intent(context, SettingsActivity::class.java))
    }
}
