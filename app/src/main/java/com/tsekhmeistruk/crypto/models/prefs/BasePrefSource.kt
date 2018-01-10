package com.tsekhmeistruk.crypto.models.prefs

import android.content.SharedPreferences

/**
 * Created by Roman Tsekhmeistruk on 05.01.2018.
 */

abstract class BasePrefSource(sharedPreferences: SharedPreferences) {

    private var mSharedPreferences: SharedPreferences = sharedPreferences
    private var mEditor: SharedPreferences.Editor

    init {
        mEditor = mSharedPreferences.edit()
    }

    @Synchronized
    fun getStringPreference(name: String): String? {
        return mSharedPreferences.getString(name, null)
    }

    @Synchronized
    fun setStringPreference(name: String, value: String) {
        mEditor.putString(name, value)
        mEditor.apply()
    }

    @Synchronized
    fun getBooleanPreference(name: String): Boolean? {
        return getBooleanPreference(name, true)
    }

    @Synchronized
    fun getBooleanPreference(name: String, def: Boolean): Boolean {
        return mSharedPreferences.getBoolean(name, def)
    }

    @Synchronized
    fun setBooleanPreference(name: String, value: Boolean?) {
        mEditor.putBoolean(name, value!!)
        mEditor.apply()
    }

    @Synchronized
    fun getIntPreference(name: String): Int {
        return mSharedPreferences.getInt(name, -1)
    }

    @Synchronized
    fun setIntPreference(name: String, value: Int?) {
        mEditor.putInt(name, value!!)
        mEditor.apply()
    }

    @Synchronized
    fun getDoublePreference(name: String): Double {
        return mSharedPreferences.getFloat(name, -1f).toDouble()
    }

    @Synchronized
    fun setDoublePreference(name: String, value: Double) {
        mEditor.putFloat(name, value.toFloat())
        mEditor.apply()
    }
}
