package com.tsekhmeistruk.crypto.models

import com.tsekhmeistruk.crypto.models.entities.CoinDto
import io.reactivex.Flowable

/**
 * Created by Roman Tsekhmeistruk on 12.01.2018.
 */
class CoinsDataSource(private val remoteCoinsDataSource: ICoinsDataSource,
                      private val localCoinsDataSource: ICoinsDataSource) : ICoinsDataSource {
    override fun addCoin(coinDto: CoinDto): Flowable<CoinDto> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getCoins(): Flowable<List<CoinDto>> {
        // TODO: check and implement
        remoteCoinsDataSource.getCoins()
                .concatMap { Flowable.fromIterable(it) }
                .doOnNext {
                    localCoinsDataSource.addCoin(it)
                }

        return localCoinsDataSource.getCoins()
    }
}
