package com.example.ohgeezrick.characters

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.ohgeezrick.base.BaseViewModel
import com.example.ohgeezrick.datamodels.Character
import com.example.ohgeezrick.services.api.RickAndMortyRepository
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class CharactersViewModel @Inject constructor(
    private val rickAndMortyRepository: RickAndMortyRepository
): BaseViewModel() {

    val mutableCharactersLiveData = MutableLiveData<List<Character>>()

    init {
        compositeDisposable.add(
            rickAndMortyRepository.getAllCharacters()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                    {
                        mutableCharactersLiveData.postValue(it.results)
                    },
                    {
                        Log.d("error", "lel", it)
                    }
                )
        )
    }

}