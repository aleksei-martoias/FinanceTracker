package io.alekseimartoyas.financetracker.modules.settings.router

import android.content.Context
import android.content.Intent
import io.alekseimartoyas.financetracker.modules.aboutapp.view.AboutAppActivity

class SettingsRouter: SettingsRouterInput {
    override fun showAboutApp(context: Context) {
        context.startActivity(Intent(context, AboutAppActivity::class.java))
    }
}