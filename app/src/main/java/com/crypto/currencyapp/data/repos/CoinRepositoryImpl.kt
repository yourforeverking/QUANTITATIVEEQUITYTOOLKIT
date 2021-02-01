
package com.crypto.currencyapp.data.repos

import com.crypto.currencyapp.data.remote.CoinApi
import com.crypto.currencyapp.data.remote.dto.CoinDetailDto
import com.crypto.currencyapp.data.remote.dto.CoinDto
import com.crypto.currencyapp.domain.repos.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(private val api: CoinApi) : CoinRepository {
    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoinList()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }

}