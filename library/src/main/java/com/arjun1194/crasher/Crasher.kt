package com.arjun1194.crasher

import android.os.Handler
import android.os.Looper
import kotlinx.coroutines.sync.Mutex

class Crasher {

    private val handler = Handler(Looper.getMainLooper())

    init {
        System.loadLibrary("library")
    }

    fun createANR() {
        val mutex = Mutex()
        Thread {
            synchronized(mutex) {
                while (true) {
                    try {
                        Thread.sleep(60000)
                    } catch (e: InterruptedException) {
                        e.printStackTrace()
                    }
                }
            }
        }.start()

        handler.postDelayed({ synchronized(mutex) { throw IllegalStateException() } }, 1000)

    }

    fun createJavaCrash() {
        throw NullPointerException()
    }

    fun createNativeCxxCrash() {
        nativeCrash()
    }

    private external fun nativeCrash()

}
