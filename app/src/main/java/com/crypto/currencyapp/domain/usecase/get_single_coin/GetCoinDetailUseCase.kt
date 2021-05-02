package com.crypto.currencyapp.domain.usecase.get_single_coin

import com.crypto.currencyapp.commonutil.Resource
import com.crypto.currencyapp.data.remote.dto.toCoinDetail
import com.crypto.currencyapp.domain.model.CoinDetail
import com.crypto.currencyapp.domain.repos.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flo