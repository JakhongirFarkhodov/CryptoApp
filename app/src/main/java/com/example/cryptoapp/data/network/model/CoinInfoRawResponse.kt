package com.example.cryptoapp.data.network.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class CoinInfoRawResponse(
    @SerializedName("USD")
    @Expose
    val coinInfoUsdResponse: CoinInfoUsdResponse
)
