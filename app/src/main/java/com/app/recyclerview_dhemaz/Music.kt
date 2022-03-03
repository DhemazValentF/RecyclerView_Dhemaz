package com.app.recyclerview_dhemaz

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Music(
    val imgBook: Int,
    val nameBook: String,
    val descBook: String,
) : Parcelable