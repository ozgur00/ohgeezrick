package com.example.ohgeezrick.datamodels

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Character(
    val id: Int? = null,
    val name: String? = null,
    val status: String? = null,
    val species: String? = null,
    val gender: String? = null,
    val image: String? = null,
    val origin: Origin? = null
): Parcelable