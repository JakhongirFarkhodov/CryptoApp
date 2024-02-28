package com.example.cryptoapp.data.network.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class CoinListInfoResponse(
    @SerializedName("Data")
    @Expose
    val coins_list:List<CoinInfoRawResponse>
)