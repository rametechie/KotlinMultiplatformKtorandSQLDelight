MultiplatformKtorandSQLDelight

A Kotlin Multiplatform mobile application for iOS and Android that demonstrates modern mobile development using shared business logic and native UIs.
Overview

This project showcases how to:

    Retrieve data over the internet using the SpaceX API with Ktor

    Store and cache data locally using SQLDelight

    Display a list of SpaceX rocket launches with their:

        Launch date

        Launch success/failure

        Launch details

    Use Kotlin Multiplatform (KMP) to share business logic between Android and iOS, while maintaining fully native UI for each platform

Project Modules

    shared: Contains business logic, network layer (Ktor), and data layer (SQLDelight)

    androidApp (composeApp): Native Android UI built with Jetpack Compose

    iosApp: Native iOS UI built with Swift/UIKit (integration-ready)

Technologies Used

    Kotlin Multiplatform

    Ktor

    SQLDelight

    Jetpack Compose

    Coroutines and Flows

    Swift (for iOS UI)

    Gradle Kotlin DSL

Setup Instructions

    Clone the repository

    Open the project in IntelliJ IDEA or Android Studio

    To run:

        Android: Run the composeApp module on an emulator or device

        iOS: Open iosApp with Xcode and run on simulator

License

This project is intended for learning and demonstration purposes.
