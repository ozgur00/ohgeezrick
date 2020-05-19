package com.example.ohgeezrick.datamodels

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CharacterResponse(
    val results: List<Character> = emptyList()
): Parcelable