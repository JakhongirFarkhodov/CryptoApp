package com.example.cryptoapp.data.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity("coin_info_table")
class CoinInfoDbModel(

    @PrimaryKey
    @ColumnInfo(name = "from_symbol")
    val from_symbol:String,

    @ColumnInfo(name = "to_symbol")
    val to_symbol:String,

    @ColumnInfo(name = "price")
    val price:Double,

    @ColumnInfo(name = "image")
    val image:String


)