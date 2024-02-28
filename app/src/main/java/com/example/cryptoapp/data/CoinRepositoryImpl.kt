package com.example.cryptoapp.data

import androidx.lifecycle.LiveData
import com.example.cryptoapp.domain.CoinRepository
import com.example.cryptoapp.domain.entity.CoinInfo

class CoinRepositoryImpl : CoinRepository {
    override fun getCoinsList(): LiveData<List<CoinInfo>> {
        TODO("Not yet implemented")
    }

    override fun getDetailOfCoin(): CoinInfo {
        TODO("Not yet implemented")
    }
}