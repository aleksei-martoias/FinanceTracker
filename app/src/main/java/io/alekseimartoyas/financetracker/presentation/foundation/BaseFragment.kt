package io.alekseimartoyas.tradetracker.Foundation

import android.support.v4.app.Fragment

/**
 * Created by optim on 04.02.2018.
 */
abstract class BaseFragment<Presenter>: Fragment() {
    protected var presenter: Presenter? = null

    fun setPres(presenter: Presenter) {
        this.presenter = presenter
    }
}