package com.tsekhmeistruk.crypto.models.entities

import com.google.gson.annotations.SerializedName

/**
 * Created by Roman Tsekhmeistruk on 12.01.2018.
 */

data class CoinDto(@SerializedName("id") val id: String,
                   @SerializedName("name") val name: String,
                   @SerializedName("symbol") val symbol: String,
                   @SerializedName("rank") val rank: String,
                   @SerializedName("price_usd") val priceUsd: String,
                   @SerializedName("price_btc") val priceBtc: String,
                   @SerializedName("day_volume_usd") val dayVolumeUsd: String,
                   @SerializedName("market_cap_usd") val marketCapUsd: String,
                   @SerializedName("available_supply") val availableSupply: String,
                   @SerializedName("total_supply") val totalSupply: String,
                   @SerializedName("max_supply") val maxSupply: String,
                   @SerializedName("percent_change_1h") val percentChange1h: String,
                   @SerializedName("percent_change_24h") val percentChange24h: String,
                   @SerializedName("percent_change_7d") val percentChange7d: String,
                   @SerializedName("last_updated") val lastUpdated: String)
