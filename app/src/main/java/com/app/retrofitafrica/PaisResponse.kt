package com.app.retrofitafrica

import com.google.gson.annotations.SerializedName

data class PaisResponse (
    @SerializedName("bandera") var bandera : String,
    @SerializedName("capital") var capital : String,
    @SerializedName("nombre") var nombre : String
    )