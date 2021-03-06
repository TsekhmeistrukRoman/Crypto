package com.tsekhmeistruk.crypto.models

/**
 * Created by Roman Tsekhmeistruk on 05.01.2018.
 */

interface IUserDataSource {

    fun wasUserAsked(): Boolean

    fun setIfUserWasAsked()

    fun setPassword(password: String)

    fun getPassword(): String?

    fun setPasswordHint(hint: String)

    fun getPasswordHint(): String?
}
