
package com.crypto.currencyapp.data.remote

import com.crypto.currencyapp.data.remote.dto.CoinDetailDto
import com.crypto.currencyapp.data.remote.dto.CoinDto
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinApi {
    @GET("v1/coins")
    suspend fun getCoinList(): List<CoinDto>

    @GET("v1/coins/{coinId}")
    suspend fun getCoinById(@Path("coinId") coinId : String) : CoinDetailDto
}