package com.crypto.currencyapp.presentation.cryptodetail

import com.crypto.currencyapp.domain.model.Coin
import com.crypto.currencyapp.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
