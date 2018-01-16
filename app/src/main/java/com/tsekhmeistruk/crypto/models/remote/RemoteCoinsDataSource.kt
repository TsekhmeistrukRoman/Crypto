package com.tsekhmeistruk.crypto.models.remote

import com.tsekhmeistruk.crypto.api.CoinMarketCapApiSet
import com.tsekhmeistruk.crypto.models.ICoinsDataSource
import com.tsekhmeistruk.crypto.models.entities.CoinDto
import io.reactivex.Flowable

/**
 * Created by Roman Tsekhmeistruk on 12.01.2018.
 */

class RemoteCoinsDataSource(private val coinMarketCapApiSet: CoinMarketCapApiSet) : ICoinsDataSource {

    override fun addCoin(coinDto: CoinDto): Flowable<CoinDto> {
        TODO("not implemented")
    }

    override fun getCoins(): Flowable<List<CoinDto>> {
        return coinMarketCapApiSet.getCoins()
    }
}
