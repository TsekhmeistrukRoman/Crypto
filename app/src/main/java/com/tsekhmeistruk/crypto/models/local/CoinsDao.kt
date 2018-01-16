package com.tsekhmeistruk.crypto.models.local

import android.arch.persistence.room.*
import android.arch.persistence.room.OnConflictStrategy.REPLACE
import com.tsekhmeistruk.crypto.models.entities.CoinDto
import io.reactivex.Flowable

/**
 * Created by Roman Tsekhmeistruk on 12.01.2018.
 */

@Dao
interface CoinsDao {

    @Query("select * from coins")
    fun getAllCoins(): Flowable<List<CoinDto>>

    @Query("select * from coins where id = :id")
    fun findCoinById(id: String): Flowable<CoinDto>

    @Insert(onConflict = REPLACE)
    fun insertCoin(coinDto: CoinDto): Flowable<CoinDto>

    @Update(onConflict = REPLACE)
    fun updateCoin(coinDto: CoinDto)

    @Delete
    fun deleteCoin(coinDto: CoinDto)
}
