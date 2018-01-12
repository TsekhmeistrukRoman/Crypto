package com.tsekhmeistruk.crypto.api

import com.tsekhmeistruk.crypto.models.entities.CoinDto
import io.reactivex.Flowable
import retrofit2.http.GET

/**
 * Created by Roman Tsekhmeistruk on 12.01.2018.
 */
interface CoinMarketCapApiSet {

    @GET("ticker?limit=50")
    fun getCoins(): Flowable<List<CoinDto>>
}
