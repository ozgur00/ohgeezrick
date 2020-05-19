package com.example.ohgeezrick.di

import com.example.ohgeezrick.characters.CharactersFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentModule {

    @ContributesAndroidInjector
    abstract fun charactersFragment(): CharactersFragment

}