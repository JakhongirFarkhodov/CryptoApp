package com.example.cryptoapp.domain

import androidx.lifecycle.LiveData
import com.example.cryptoapp.domain.entity.CoinInfo

interface CoinRepository {

    fun getCoinsList():LiveData<List<CoinInfo>>

    fun getDetailOfCoin():CoinInfo

}