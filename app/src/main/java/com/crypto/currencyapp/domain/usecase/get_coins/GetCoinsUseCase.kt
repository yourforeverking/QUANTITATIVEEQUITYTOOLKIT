package com.crypto.currencyapp.domain.usecase.get_coins

import com.crypto.currencyapp.commonutil.Resource
import com.crypto.currencyapp.data.remote.dto.toCoin
import com.crypto.currencyapp.domain.model.Coin
import com.crypto.currencyapp.domain.repos.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoinsUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    operator fun invoke(): Flow<Resource<List<Coin>>> = flow {
        try {
            emit(Resource.Loading<List<Coin>>())
            val coins = repository.getCoins().map { it.toCoin() }
            println(coins)
            emit(Resource.Success<List<Coin>>(coins))
        } catch (e: HttpException) {
            println(e.