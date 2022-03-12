package com.example.listacontatos.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Contact(
    var nome: String,
    var phone: String,
    var photograph: String
) : Parcelable