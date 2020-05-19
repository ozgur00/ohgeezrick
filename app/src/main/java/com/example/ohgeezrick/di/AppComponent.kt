package com.example.ohgeezrick.di

import android.content.Context
import com.example.ohgeezrick.OhGeezRickApp
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Component(modules = [AndroidInjectionModule::class,
    FragmentModule::class,
    ViewModelModule::class,
    ApiModule::class,
    ServicesModule::class])
@Singleton
interface AppComponent : AndroidInjector<OhGeezRickApp> {

    @Component.Builder
    interface Builder {

        fun build(): AppComponent

        @BindsInstance
        fun context(context: Context): Builder
    }

}