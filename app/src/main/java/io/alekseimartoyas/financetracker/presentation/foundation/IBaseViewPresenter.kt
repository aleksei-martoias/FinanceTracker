package io.alekseimartoyas.financetracker.presentation.foundation

interface IBaseViewPresenter {
    fun onStart()
    fun onStop()
    fun destructor()
}