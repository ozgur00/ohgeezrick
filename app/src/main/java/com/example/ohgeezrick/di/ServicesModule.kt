package com.example.ohgeezrick.di

import com.example.ohgeezrick.services.api.RickAndMortyRepository
import com.example.ohgeezrick.services.api.RickAndMortyRepositoryImpl
import dagger.Binds
import dagger.Module

@Module
abstract class ServicesModule {

    @Binds
    abstract fun rickAndMortyRepository(rickAndMortyRepositoryImpl: RickAndMortyRepositoryImpl): RickAndMortyRepository

}