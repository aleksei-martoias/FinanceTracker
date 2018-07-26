package io.alekseimartoyas.financetracker.foundation

abstract class BaseConfigurator<View, Router, Presenter> {
    private var view: View? = null
    private var presenter: Presenter? = null
    private var router: Router? = null

    fun setView(view: View) {
        this.view = view
    }

    fun setPresenter(presenter: Presenter) {
        this.presenter = presenter
    }

    fun setRouter(router: Router) {
        this.router = router
    }

    abstract fun build()

    abstract fun setInteractors()
}