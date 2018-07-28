package io.alekseimartoyas.financetracker.di.modules

import dagger.Module
import dagger.Provides
import io.alekseimartoyas.financetracker.services.SettingsSevice

@Module
class SettingsModule {
    @Provides
    fun settingsService(): SettingsSevice = SettingsSevice()
}