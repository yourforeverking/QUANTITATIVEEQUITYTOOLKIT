package com.crypto.currencyapp.domain.repos

import com.crypto.currencyapp.data.remote.dto.CoinDetailDto
import com.crypto.currencyapp.data.remote.dto.CoinDto

interface CoinRepository {
    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}