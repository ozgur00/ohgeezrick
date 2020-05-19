package com.example.ohgeezrick

import com.example.ohgeezrick.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

class OhGeezRickApp : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder().context(applicationContext).build()
    }

}