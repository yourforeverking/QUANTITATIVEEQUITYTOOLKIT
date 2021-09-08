package com.crypto.currencyapp.presentation.cyptolist

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.crypto.currencyapp.commonutil.Resource
import com.crypto.currencyapp.domain.model.Coin
import com.crypto.currencyapp.domain.usecase.get_coins.GetCoinsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import 