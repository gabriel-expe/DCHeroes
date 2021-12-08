package com.gabriel.dcheroes.model


import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class HeroItem(
    @SerializedName("alias")
    val alias: String,
    @SerializedName("city")
    val city: String,
    @SerializedName("facebook")
    val facebook: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("occupation")
    val occupation: String,
    @SerializedName("powers")
    val powers: String,
    @SerializedName("urlPicture")
    val urlPicture: String
) : Serializable