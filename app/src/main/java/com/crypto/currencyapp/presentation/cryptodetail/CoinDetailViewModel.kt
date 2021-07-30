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