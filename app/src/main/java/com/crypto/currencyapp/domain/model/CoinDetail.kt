package com.crypto.currencyapp.domain.model

import com.crypto.currencyapp.data.remote.dto.TeamMember

data class CoinDetail(
    val coinId: String,
    val name: String,
    val description: String,
    val symbol: String,
   