
package com.crypto.currencyapp.presentation

sealed class Screen(val route: String) {
    object CoinListScreen: Screen("cryptolist_screen")
    object CoinDetailScreen: Screen("cryptodetail_screen")
}