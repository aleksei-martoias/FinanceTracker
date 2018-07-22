package io.alekseimartoyas.financetracker.modules.settings.view

import android.os.Bundle
import io.alekseimartoyas.financetracker.R
import io.alekseimartoyas.tradetracker.Foundation.BaseActivity
import kotlinx.android.synthetic.main.activity_settings.*

class SettingsActivity : BaseActivity<SettingsOutput>(),
        SettingsInput{
    override var presenter: SettingsOutput? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        setSupportActionBar(toolbar_settings)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun destructor() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
