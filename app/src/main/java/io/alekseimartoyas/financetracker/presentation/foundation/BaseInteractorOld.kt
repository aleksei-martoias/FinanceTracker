package io.alekseimartoyas.tradetracker.Foundation

/**
 * Created by optim on 04.02.2018.
 */
abstract class BaseInteractorOld<Presenter> {
    abstract var presenter: Presenter?

    abstract fun destructor()
}