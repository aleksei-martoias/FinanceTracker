package io.alekseimartoyas.financetracker

import android.app.Application
import io.alekseimartoyas.financetracker.di.DaggerServicesEntityComponent
import io.alekseimartoyas.financetracker.di.ServicesEntityComponent

class App: Application() {

    companion object {
        lateinit var graph: ServicesEntityComponent
    }

    override fun onCreate() {
        super.onCreate()

        graph = DaggerServicesEntityComponent.create()
    }

}