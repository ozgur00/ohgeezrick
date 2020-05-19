package com.example.ohgeezrick.services.api

import com.example.ohgeezrick.datamodels.CharacterResponse
import io.reactivex.Single
import javax.inject.Inject

class RickAndMortyRepositoryImpl @Inject constructor(
    private val rickAndMortyApi: RickAndMortyApi
) : RickAndMortyRepository {

    override fun getAllCharacters(): Single<CharacterResponse> {
        return rickAndMortyApi.getAllCharacters()
    }

}