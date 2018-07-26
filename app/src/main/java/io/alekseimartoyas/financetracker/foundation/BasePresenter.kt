package io.alekseimartoyas.tradetracker.Foundation

/**
 * Created by optim on 04.02.2018.
 */
abstract class BasePresenter<View, /*Interactor,*/ Router> {
    /*abstract var interactor: Interactor?*/
    private var view: View? = null
    private var router: Router? = null

    fun setView(view: View) {
        this.view = view
    }

    fun getView(): View? = view

    fun setRouter(router: Router) {
        this.router = router
    }

    fun getRouter(): Router? = router

    open fun destructor() {
        view = null
    }
}