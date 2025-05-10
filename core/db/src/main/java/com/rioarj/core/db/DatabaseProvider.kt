package com.rioarj.core.db

import android.content.Context
import androidx.room.Room

object DatabaseProvider {
    @Volatile
    private var INSTANCE: DatabaseAccessor? = null

    fun getDatabase(context: Context): DatabaseAccessor {
        return INSTANCE ?: synchronized(this) {
            val instance = Room.databaseBuilder(
                context = context.applicationContext,
                klass = DatabaseAccessor::class.java,
                name = "effix_db"
            ).build()
            INSTANCE = instance
            instance
        }
    }
}