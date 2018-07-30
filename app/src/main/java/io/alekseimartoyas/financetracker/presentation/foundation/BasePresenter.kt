package io.alekseimartoyas.tradetracker.Foundation

/**
 * Created by optim on 04.02.2018.
 */
abstract class BasePresenter<View, Router>(
        protected var view: View? = null,
        protected var router: Router? = null) {

    abstract fun onStart()

    abstract fun onStop()

    open fun destructor() {
        view = null
    }
}