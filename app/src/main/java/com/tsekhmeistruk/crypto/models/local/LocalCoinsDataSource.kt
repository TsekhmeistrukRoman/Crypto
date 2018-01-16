package com.tsekhmeistruk.crypto.models.local

import com.tsekhmeistruk.crypto.models.ICoinsDataSource
import com.tsekhmeistruk.crypto.models.entities.CoinDto
import com.tsekhmeistruk.crypto.models.local.database.ApplicationDatabase
import io.reactivex.Flowable

/**
 * Created by Roman Tsekhmeistruk on 12.01.2018.
 */

class LocalCoinsDataSource(private val applicationDatabase: ApplicationDatabase) : ICoinsDataSource {
    override fun addCoin(coinDto: CoinDto): Flowable<CoinDto> {
        return applicationDatabase.coinDao().insertCoin(coinDto)
    }

    override fun getCoins(): Flowable<List<CoinDto>> {
        return applicationDatabase.coinDao().getAllCoins()
    }
}
