package com.tsekhmeistruk.crypto.di.component

import android.content.Context
import android.content.SharedPreferences
import com.tsekhmeistruk.crypto.di.module.AppModule
import com.tsekhmeistruk.crypto.di.module.DataModule
import dagger.Component
import java.util.concurrent.Executor
import javax.inject.Singleton

/**
 * Created by Roman Tsekhmeistruk on 12.01.2018.
 */

@Singleton
@Component(modules = arrayOf(AppModule::class, DataModule::class))
interface AppComponent : DataComponent {

    fun context(): Context

    fun preferences(): SharedPreferences

    fun executor(): Executor
}
