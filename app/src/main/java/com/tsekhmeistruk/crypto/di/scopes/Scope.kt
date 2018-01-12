package com.tsekhmeistruk.crypto.di.scopes

import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy

/**
 * Created by Roman Tsekhmeistruk on 12.01.2018.
 */
@javax.inject.Scope
@Retention(RetentionPolicy.RUNTIME)
annotation class Scope(val value: String = "")
