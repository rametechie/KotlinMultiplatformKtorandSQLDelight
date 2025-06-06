package com.jetbrains.spacetutorial.simplelogin.androidapp.ui.login

import com.jetbrains.spacetutorial.simplelogin.LoggedInUserView

/**
 * Authentication result : success (user details) or error message.
 */
data class LoginResult(
    val success: LoggedInUserView? = null,
    val error: Int? = null
)