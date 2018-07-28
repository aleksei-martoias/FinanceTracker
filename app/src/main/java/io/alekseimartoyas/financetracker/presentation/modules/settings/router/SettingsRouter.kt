package io.alekseimartoyas.financetracker.presentation.modules.settings.router

import android.content.Context
import android.content.Intent
import io.alekseimartoyas.financetracker.presentation.modules.aboutapp.view.AboutAppActivity

class SettingsRouter: SettingsRouterInput {
    override fun showAboutApp(context: Context) {
        context.startActivity(Intent(context, AboutAppActivity::class.java))
    }
}