package com.crypto.currencyapp.domain.usecase.get_coins

import com.crypto.currencyapp.commonutil.Resource
import com.crypto.currencyapp.data.remote.dto.toCoin
import com.crypto.currencyapp.domain.model.Coin
import com.crypto.currencyapp.domain.repos.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOExcep