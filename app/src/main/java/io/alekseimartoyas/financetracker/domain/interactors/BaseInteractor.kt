package io.alekseimartoyas.financetracker.domain.interactors

import io.reactivex.Observable
import io.reactivex.Scheduler
import io.reactivex.disposables.Disposable

abstract class BaseInteractor<ResulType, ParametrType>(
        protected val jobScheduler: Scheduler,
        private val uiScheduler: Scheduler) {
    private var disposable: Disposable? = null

    protected abstract fun buildObservable(parametr: ParametrType?): Observable<ResulType>

    fun execute(parametr: ParametrType?, subscriber: (ResulType) -> Unit) {
        disposable = buildObservable(parametr)
                .subscribeOn(jobScheduler)
                .observeOn(uiScheduler)
                .subscribe { subscriber(it) }
    }

    fun execute(subscriber: (ResulType) -> Unit) {
        execute(null, subscriber)
    }

    fun dispose() {
        disposable?.dispose()
    }
}