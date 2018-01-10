package com.tsekhmeistruk.crypto.models.prefs

import android.content.SharedPreferences
import com.tsekhmeistruk.crypto.models.IUserDataSource

/**
 * Created by Roman Tsekhmeistruk on 05.01.2018.
 */

class UserDataSource(sharedPreferences: SharedPreferences) : BasePrefSource(sharedPreferences), IUserDataSource {

    private val mPassword = "PASSWORD"
    private val mWasUserAsked = "WAS_USER_ASKED"
    private val mHint = "HINT"

    override fun setPassword(password: String) {
        setStringPreference(mPassword, password)
    }

    override fun getPassword(): String? {
        return getStringPreference(mPassword)
    }

    override fun setIfUserWasAsked() {
        setBooleanPreference(mWasUserAsked, true)
    }

    override fun wasUserAsked(): Boolean {
        return getBooleanPreference(mWasUserAsked, false)
    }

    override fun setPasswordHint(hint: String) {
        setStringPreference(mHint, hint)
    }

    override fun getPasswordHint(): String? {
        return getStringPreference(mHint)
    }
}
