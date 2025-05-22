package com.jetbrains.spacetutorial

import android.os.Build

class AndroidPlatform(override val name: String) : Platform {
}

actual fun getPlatform(): Platform = AndroidPlatform()