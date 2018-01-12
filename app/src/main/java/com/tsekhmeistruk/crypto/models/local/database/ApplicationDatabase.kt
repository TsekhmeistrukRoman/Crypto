package com.tsekhmeistruk.crypto.models.local.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.tsekhmeistruk.crypto.models.entities.CoinDto
import com.tsekhmeistruk.crypto.models.local.CoinsDao

/**
 * Created by Roman Tsekhmeistruk on 12.01.2018.
 */

@Database(entities = arrayOf(CoinDto::class), version = 1, exportSchema = false)
abstract class ApplicationDatabase : RoomDatabase() {

    abstract fun coinDao(): CoinsDao
}
