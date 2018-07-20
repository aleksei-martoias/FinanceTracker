package io.alekseimartoyas.tradetracker.Foundation

import android.support.v7.app.AppCompatActivity

/**
 * Created by optim on 04.02.2018.
 */
abstract class BaseActivity<Presenter>: AppCompatActivity() { //was Ativity()
    abstract var presenter: Presenter?

    abstract fun destructor()
}