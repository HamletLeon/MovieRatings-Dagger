package com.hamletleon.movieratings.repositories.local

import android.arch.persistence.db.SimpleSQLiteQuery
import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context
import com.hamletleon.movieratings.models.main.Movie

@Database(entities = [Movie::class], version = 1)
abstract class DatabaseContext: RoomDatabase() {

    companion object {
        private var INSTANCE: DatabaseContext? = null

        fun getInstance(context: Context): DatabaseContext =
                INSTANCE ?: synchronized(DatabaseContext::class) {
                    INSTANCE ?: buildDatabase(context).also { INSTANCE = it }

                }

        private fun buildDatabase(context: Context) = Room
                .databaseBuilder(context.applicationContext, DatabaseContext::class.java, "MovieRatings.Db")
                .build()

        fun destroyInstance() {
            INSTANCE = null
        }

        fun clearAndResetAllTables(): Boolean {
            if (INSTANCE == null) return false

            // reset all auto-incrementalValues
            val query = SimpleSQLiteQuery("DELETE FROM sqlite_sequence")

            INSTANCE!!.beginTransaction()
            return try {
                INSTANCE!!.clearAllTables()
                INSTANCE!!.query(query)
                INSTANCE!!.setTransactionSuccessful()
                true
            } catch (e: Exception){
                false
            } finally {
                INSTANCE!!.endTransaction()
            }
        }
    }
}