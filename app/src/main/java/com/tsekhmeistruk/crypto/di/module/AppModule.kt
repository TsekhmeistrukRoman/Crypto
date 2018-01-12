package com.tsekhmeistruk.crypto.di.module

import android.content.Context
import android.content.SharedPreferences
import dagger.Module
import dagger.Provides
import java.util.concurrent.Executor
import java.util.concurrent.Executors
import javax.inject.Singleton

/**
 * Created by Roman Tsekhmeistruk on 12.01.2018.
 */

@Module
class AppModule(private val mContext: Context) {

    @Provides
    @Singleton
    internal fun provideContext(): Context {
        return mContext
    }

    @Provides
    @Singleton
    internal fun providePreferences(context: Context): SharedPreferences {
        return context.getSharedPreferences(context.packageName, Context.MODE_PRIVATE)
    }

    @Provides
    @Singleton
    internal fun provideExecutor(): Executor {
        return Executors.newCachedThreadPool()
    }
}
