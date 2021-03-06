package com.example.ohgeezrick.services.api

import com.example.ohgeezrick.datamodels.CharacterResponse
import io.reactivex.Single
import retrofit2.http.GET

interface RickAndMortyApi {

    @GET("/api/character")
    fun getAllCharacters(): Single<CharacterResponse>

}