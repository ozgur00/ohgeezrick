package com.example.ohgeezrick.di

import android.content.Context
import com.example.ohgeezrick.OhGeezRickApp
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector

@Component(modules = [AndroidInjectionModule::class,
    FragmentModule::class,
    ViewModelModule::class])
interface AppComponent : AndroidInjector<OhGeezRickApp> {

    @Component.Builder
    interface Builder {

        fun build(): AppComponent

        @BindsInstance
        fun context(context: Context): Builder
    }

}