package io.alekseimartoyas.tradetracker.Foundation

/**
 * Created by optim on 04.02.2018.
 */
abstract class BasePresenter<View, Interactor, Router> {
    abstract var interactor: Interactor?
    abstract var view: View?
    abstract var router: Router?

    abstract fun destructor()
}