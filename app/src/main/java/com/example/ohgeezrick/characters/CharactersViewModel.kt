package com.example.ohgeezrick.characters

import com.example.ohgeezrick.base.BaseViewModel
import com.example.ohgeezrick.services.api.RickAndMortyRepository
import javax.inject.Inject

class CharactersViewModel @Inject constructor(
    private val rickAndMortyRepository: RickAndMortyRepository
): BaseViewModel() {

}