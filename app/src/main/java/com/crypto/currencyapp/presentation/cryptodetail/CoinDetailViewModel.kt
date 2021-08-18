package com.crypto.currencyapp.presentation.cryptodetail

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.crypto.currencyapp.commonutil.ConstantsUtil
import com.crypto.currencyapp.commonutil.Resource
import com.crypto.currencyapp.domain.model.Coin
import com.crypto.currencyapp.domain.usecase.get_coins.GetCoinsUseCase
import com.crypto.currencyapp.domain.usecase.get_single_coin.GetCoinDetailUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class CoinDetailViewModel @Inject constructor(
    private val getCoinDetailUseCase: GetCoinDetailUseCase,
    savedStateHandle: SavedStateHandle
) : ViewModel() {
    private val _state = mutableStateOf(CoinDetailState())
    val state: State<CoinDetailState> = _state

    init {
        savedStateHandle.get<String>(ConstantsUtil.COIN_ID)?.let { coinId ->
            getCoinDetail(coinId)
        }
    }
    
    private fun getCoinDetail(coinId: String) {
        getCoinDetailUseCase(coinId)