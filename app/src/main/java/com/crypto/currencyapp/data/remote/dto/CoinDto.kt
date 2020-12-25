package com.crypto.currencyapp.data.remote.dto

import com.crypto.currencyapp.domain.model.Coin
import com.google.gson.annotations.SerializedName

data class CoinDto(
    val id: String,
    @SerializedNam