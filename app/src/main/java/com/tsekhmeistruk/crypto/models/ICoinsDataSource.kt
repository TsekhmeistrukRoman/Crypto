package com.tsekhmeistruk.crypto.models

import com.tsekhmeistruk.crypto.models.entities.CoinDto
import io.reactivex.Flowable

/**
 * Created by Roman Tsekhmeistruk on 12.01.2018.
 */

interface ICoinsDataSource {

    fun getCoins(): Flowable<List<CoinDto>>

    fun addCoin(coinDto: CoinDto): Flowable<CoinDto>
}
