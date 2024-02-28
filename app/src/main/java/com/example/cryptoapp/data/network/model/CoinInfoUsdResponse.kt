package com.example.cryptoapp.data.network.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class CoinInfoUsdResponse(

    @SerializedName("FROMSYMBOL")
    @Expose
    val from_symbol:String,

    @SerializedName("TOSYMBOL")
    @Expose
    val to_symbol:String,

    @SerializedName("PRICE")
    @Expose
    val price:Double,

    @SerializedName("IMAGEURL")
    @Expose
    val image_url:String

)
