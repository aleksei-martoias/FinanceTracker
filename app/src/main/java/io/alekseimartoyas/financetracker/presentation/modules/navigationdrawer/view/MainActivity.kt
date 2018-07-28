package io.alekseimartoyas.financetracker.presentation.modules.navigationdrawer.view

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.support.design.widget.NavigationView
import android.support.v4.app.Fragment
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.view.MenuItem
import io.alekseimartoyas.financetracker.R
import io.alekseimartoyas.financetracker.presentation.modules.mainscreen.view.MainScreenFragment
import io.alekseimartoyas.financetracker.presentation.modules.navigationdrawer.presenter.IMainActivityInput
import io.alekseimartoyas.financetracker.presentation.modules.navigationdrawer.router.IMainActivityRouterInput
import io.alekseimartoyas.financetracker.presentation.modules.settings.view.SettingsActivity
import io.alekseimartoyas.tradetracker.Foundation.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity<IMainActivityPresenter>(),
        IMainActivityInput,
        NavigationView.OnNavigationItemSelectedListener,
        IMainActivityRouterInput {

    override fun showSettings(context: Context) {
        context.startActivity(Intent(context, SettingsActivity::class.java))
    }

    override var presenter: IMainActivityPresenter? = null

    var currentFragment: Int = R.id.nav_main
    private val keyCurrentFragment = "currentFragment"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        val toggle = ActionBarDrawerToggle(
                this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)

        currentFragment = if (savedInstanceState == null) {
            replaceFragment(MainScreenFragment())
            nav_view.setCheckedItem(R.id.nav_main)
            R.id.nav_main
        } else {
            savedInstanceState?.getInt(keyCurrentFragment)
        }

//        MainActivityConfigurator().buildModule(this)
    }

    override fun onResume() {
        super.onResume()
        presenter?.unblockStartActivity()
    }

    override fun onRestart() {
        super.onRestart()
        presenter?.blockStartActivity()
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        if (item.itemId != currentFragment)
            when (item.itemId) {
                R.id.nav_main -> {
                    replaceFragment(MainScreenFragment())
                }
                R.id.nav_settings -> {
                    startActivity(Intent(this, SettingsActivity::class.java))
//                    presenter?.showSettings(this)
                }
            }

//        item.isChecked = true
        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
                .replace(R.id.main_frame, fragment, "visible_fragment")
                .commit()
    }

    override fun onSaveInstanceState(outState: Bundle?, outPersistentState: PersistableBundle?) {
        super.onSaveInstanceState(outState, outPersistentState)

        outState?.putInt(keyCurrentFragment, currentFragment)
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter?.destructor()
        presenter = null
    }
}
