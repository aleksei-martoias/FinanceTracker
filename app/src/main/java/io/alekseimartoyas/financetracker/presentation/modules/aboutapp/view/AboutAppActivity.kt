package io.alekseimartoyas.financetracker.presentation.modules.aboutapp.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar
import io.alekseimartoyas.financetracker.R
import kotlinx.android.synthetic.main.activity_about_app.*

class AboutAppActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_app)
        setSupportActionBar(toolbar_about_app_activity as Toolbar)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        title = resources.getString(R.string.nav_about_app)
    }
}
