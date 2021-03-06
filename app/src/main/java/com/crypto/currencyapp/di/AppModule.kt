package com.crypto.currencyapp.di

import com.crypto.currencyapp.commonutil.ConstantsUtil
import com.crypto.currencyapp.data.remote.CoinApi
import com.crypto.currencyapp.data.repos.CoinRepositoryImpl
import com.crypto.currencyapp.domain.repos.CoinRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideApi(): CoinApi {
        return Retrofit.Builder().baseUrl(ConstantsUtil.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create()).build().create(CoinApi::class.java)
    }

    @Provides
    @Singleton
    fun provideCoinRepository(api: CoinApi) : CoinRepository{
        return CoinRepositoryImpl(api)
    }
}