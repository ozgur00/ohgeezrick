package com.example.ohgeezrick.services.api

import com.example.ohgeezrick.datamodels.CharacterResponse
import io.reactivex.Single

interface RickAndMortyRepository {

    fun getAllCharacters(): Single<CharacterResponse>

}