package com.jetbrains.spacetutorial.cache

import com.jetbrains.spacetutorial.entity.RocketLaunch

internal class Database(databaseDriverFactory: DatabaseDriverFactory) {
    private val database = AppDatabase(databaseDriverFactory.createDriver())
    private val dbQuery = database.appDatabaseQueries

//    internal fun getAllLaunches(): List<RocketLaunch> {
//        return dbQuery.selectAllLaunchesInfo(::mapLaunchSelecting).executeAsList()
//    }
}