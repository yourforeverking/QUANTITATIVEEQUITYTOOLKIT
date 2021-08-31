package com.crypto.currencyapp.presentation.cyptolist

import com.crypto.currencyapp.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val erro