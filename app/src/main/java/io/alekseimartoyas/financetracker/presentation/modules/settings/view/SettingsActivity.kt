package io.alekseimartoyas.financetracker.presentation.modules.settings.view

import android.content.Intent
import android.os.Bundle
import android.view.View
import io.alekseimartoyas.financetracker.R
import io.alekseimartoyas.financetracker.presentation.modules.aboutapp.view.AboutAppActivity
import io.alekseimartoyas.financetracker.presentation.modules.settings.configurator.SettingsConfigurator
import io.alekseimartoyas.financetracker.presentation.modules.settings.presenter.ISettingsActivityInput
import io.alekseimartoyas.tradetracker.Foundation.BaseActivity
import kotlinx.android.synthetic.main.activity_settings.*

class SettingsActivity:
        BaseActivity<ISettingsPresenter>(),
        ISettingsActivityInput {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        setTb()
        SettingsConfigurator().buildModule(this)
    }

    private fun setTb() {
        setSupportActionBar(toolbar_settings)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        title = resources.getString(R.string.nav_settings)
    }

    fun onClickAboutApp(view: View) {
//        presenter?.showAboutApp(this)
        startActivity(Intent(this, AboutAppActivity::class.java))  // to router
    }

    fun onClickFeedback(view: View) {
        val emailIntent = Intent(Intent.ACTION_SENDTO)
        emailIntent.type = "text/plain"
        emailIntent.putExtra(Intent.EXTRA_EMAIL, "someAddress@gmail.com")
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "FinanceTracker feedback")
        emailIntent.putExtra(Intent.EXTRA_TEXT, "Good Application, thank you.")
        startActivity(Intent.createChooser(intent, "Send email"))
    }

    override fun onDestroy() {
        super.onDestroy()

        presenter?.destructor()
    }
}
