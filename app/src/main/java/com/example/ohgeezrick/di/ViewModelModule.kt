package com.example.ohgeezrick.di

import androidx.lifecycle.ViewModel
import com.example.ohgeezrick.characters.CharactersViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(CharactersViewModel::class)
    abstract fun charactersViewModel(charactersViewModel: CharactersViewModel): ViewModel

}