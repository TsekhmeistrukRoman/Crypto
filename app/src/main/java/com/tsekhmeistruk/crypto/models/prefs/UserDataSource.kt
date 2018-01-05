package com.tsekhmeistruk.crypto.models.prefs

import android.content.SharedPreferences
import com.tsekhmeistruk.crypto.models.IUserDataSource

/**
 * Created by Roman Tsekhmeistruk on 05.01.2018.
 */

class UserDataSource(sharedPreferences: SharedPreferences) : IUserDataSource, BasePrefSource(sharedPreferences) {

    private val mIsPasswordSet = "IS_PASSWORD_SET"
    private val mPassword = "PASSWORD"
    private val mWasUserAcknowledged = "ACKNOWLEDGED"

    override fun isPasswordSet(): Boolean? {
        return getBooleanPreference(mIsPasswordSet, false)
    }

    override fun setProtected() {
        setBooleanPreference(mIsPasswordSet, true)
    }

    override fun setPassword(password: String) {
        setStringPreference(mPassword, password)
    }

    override fun getPassword(): String? {
        return getStringPreference(mPassword)
    }

    override fun setUserAcknowledged() {
        setBooleanPreference(mWasUserAcknowledged, true)
    }

    override fun wasUserAsked(): Boolean? {
        return getBooleanPreference(mWasUserAcknowledged)
    }
}
