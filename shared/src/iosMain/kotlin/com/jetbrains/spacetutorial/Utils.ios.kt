package com.jetbrains.spacetutorial

import platform.Foundation.NSUUID

actual fun randomUUID(): String = NSUUID().UUIDString()