package com.example.cryptoapp.data.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import androidx.room.Upsert
import com.example.cryptoapp.data.database.model.CoinInfoDbModel

@Dao
interface CoinInfoDao {

    @Upsert
    fun insert_or_update_coin_info(coinInfoDbModel: CoinInfoDbModel)

    @Query("SELECT * FROM coin_info_table")
    fun getCoinListFromDataBase():LiveData<List<CoinInfoDbModel>>

    @Query("SELECT * FROM coin_info_table WHERE from_symbol ==:fsym")
    fun getCoinInfo(fsym:String):CoinInfoDbModel

}