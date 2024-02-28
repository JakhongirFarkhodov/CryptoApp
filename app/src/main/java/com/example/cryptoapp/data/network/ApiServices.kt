package com.example.cryptoapp.data.network

import com.example.cryptoapp.data.network.model.CoinListInfoResponse
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface ApiServices {

    @GET("top/totalvolfull")
    fun getCoinsList(
        @Header(API_KEY_KEY) api_key:String = API_KEY_VALUE,
        @Query(LIMIT_KEY) limit:Int = LIMIT_VALUE,
        @Query(TO_SYMBOL_KEY) to_symbol:String = TO_SYMBOL_VALUE,
        @Query(PAGE_KEY) page:Int = PAGE_VALUE
    ):CoinListInfoResponse

    @GET("pricemultifull")
    fun getCoinInfo(
        @Header(API_KEY_KEY) api_key: String = API_KEY_VALUE,
        @Query(FROM_SYMBOLS_KEY) from_symbol:String,
        @Query(TO_SYMBOLS_KEY) to_symbols:String = TO_SYMBOL_VALUE
    )


    companion object{

        private const val API_KEY_KEY = "api_key"
        private const val LIMIT_KEY:String = "limit"
        private const val TO_SYMBOL_KEY:String = "tsym"
        private const val TO_SYMBOLS_KEY:String = "tsyms"
        private const val FROM_SYMBOLS_KEY = "fsyms"
        private const val PAGE_KEY:String = "page"

        private const val API_KEY_VALUE = "0e6f19066bde6d150e79528f6c7497d46b555e03aa9f692b87fbcba7d188e7cb"
        private const val LIMIT_VALUE = 10
        private const val TO_SYMBOL_VALUE = "USD"
        private const val PAGE_VALUE = 1
    }

}