package io.alekseimartoyas.financetracker.presentation.modules.settings.view

import android.os.Bundle
import android.view.View
import io.alekseimartoyas.financetracker.R
import io.alekseimartoyas.financetracker.presentation.modules.settings.configurator.SettingsConfigurator
import io.alekseimartoyas.tradetracker.Foundation.BaseActivity
import kotlinx.android.synthetic.main.activity_settings.*

class SettingsActivity : BaseActivity<ISettingsPresenter>(),
        ISettingsActivityInput{
    override var presenter: ISettingsPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        setSupportActionBar(toolbar_settings)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        title = resources.getString(R.string.nav_settings)

        SettingsConfigurator().buildModule(this)
    }

    override fun onResume() {
        super.onResume()
        presenter?.unblockStartActivity()
    }

    override fun onStop() {
        super.onStop()
        presenter?.blockStartActivity()
    }

    fun onClickAboutApp(view: View) {
        presenter?.showAboutApp(this)
    }

    override fun onDestroy() {
        super.onDestroy()

        presenter?.destructor()
    }
}
