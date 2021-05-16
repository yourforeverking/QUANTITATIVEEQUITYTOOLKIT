package com.crypto.currencyapp.domain.usecase.get_single_coin

import com.crypto.currencyapp.commonutil.Resource
import com.crypto.currencyapp.data.remote.dto.toCoinDetail
import com.crypto.currencyapp.domain.model.CoinDetail
import com.crypto.currencyapp.domain.repos.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoinDetailUseCase @Inject constructor(
    private val repository: CoinRepository
) {
    operator fun invoke(coinId: String): Flow<Resource<CoinDetail>> = flow {
        try {
            emit(Resource.Loading<CoinDetail>())
            val coin = repository.getCoinById(coinId).toCoinDetail()
            emit(Resource.Success<CoinDetail>(coin))
        } catch (e: HttpException) {
            emit(Resource.Error<CoinDetail>(e.