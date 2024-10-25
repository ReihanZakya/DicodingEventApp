package com.example.dicodingeventapp.ui

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Event(
    var photo: String,
    var description: String,
) : Parcelable