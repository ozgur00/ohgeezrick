package com.example.ohgeezrick.datamodels

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Origin(
    val name: String? = null
): Parcelable