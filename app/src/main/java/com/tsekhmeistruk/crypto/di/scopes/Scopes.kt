package com.tsekhmeistruk.crypto.di.scopes

/**
 * Created by Roman Tsekhmeistruk on 12.01.2018.
 */
class Scopes private constructor() {

    init {
        throw AssertionError("Unable to instantiate")
    }

    companion object {

        /**
         * Lifecycle scope annotation constants.
         */
        val ACTIVITY = "activity"
        val SERVICE = "service"
        val FRAGMENT = "fragment"
        val VIEW = "view"
    }
}
