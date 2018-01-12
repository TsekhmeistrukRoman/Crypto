package com.tsekhmeistruk.crypto.models.entities

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import com.google.gson.annotations.SerializedName

/**
 * Created by Roman Tsekhmeistruk on 12.01.2018.
 */

@Entity(tableName = "coins")
data class CoinDto(@ColumnInfo(name = "id") @PrimaryKey(autoGenerate = false) @SerializedName("id") val id: String,
                   @ColumnInfo(name = "name") @SerializedName("name") val name: String,
                   @ColumnInfo(name = "symbol") @SerializedName("symbol") val symbol: String,
                   @ColumnInfo(name = "rank") @SerializedName("rank") val rank: String,
                   @ColumnInfo(name = "price_usd") @SerializedName("price_usd") val priceUsd: String,
                   @ColumnInfo(name = "price_btc") @SerializedName("price_btc") val priceBtc: String,
                   @ColumnInfo(name = "day_volume_usd") @SerializedName("day_volume_usd") val dayVolumeUsd: String,
                   @ColumnInfo(name = "market_cap_usd") @SerializedName("market_cap_usd") val marketCapUsd: String,
                   @ColumnInfo(name = "available_supply") @SerializedName("available_supply") val availableSupply: String,
                   @ColumnInfo(name = "total_supply") @SerializedName("total_supply") val totalSupply: String,
                   @ColumnInfo(name = "max_supply") @SerializedName("max_supply") val maxSupply: String,
                   @ColumnInfo(name = "percent_change_1h") @SerializedName("percent_change_1h") val percentChange1h: String,
                   @ColumnInfo(name = "percent_change_24h") @SerializedName("percent_change_24h") val percentChange24h: String,
                   @ColumnInfo(name = "percent_change_7d") @SerializedName("percent_change_7d") val percentChange7d: String,
                   @ColumnInfo(name = "last_updated") @SerializedName("last_updated") val lastUpdated: String)
