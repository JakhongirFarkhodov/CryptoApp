package com.example.cryptoapp.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.cryptoapp.data.database.model.CoinInfoDbModel

@Database(entities = [CoinInfoDbModel::class], version = 1)
abstract class CoinDataBase : RoomDatabase() {

    companion object{

        private var INSTANCE:CoinDataBase? = null
        private const val DB_NAME = "coin_database"

        fun getInstance(context: Context):CoinDataBase
        {
            synchronized(CoinDataBase::class.java)
            {
                INSTANCE?.let {
                    return it
                }

                val database = Room.databaseBuilder(context, CoinDataBase::class.java, DB_NAME).build()
                INSTANCE = database

                return database

            }

        }
    }
    abstract fun coinInfoDao():CoinInfoDao
}