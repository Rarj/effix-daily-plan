package com.rioarj.core.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.rioarj.core.db.dao.NoteDao
import com.rioarj.core.db.entity.NoteEntity

@Database(entities = [NoteEntity::class], version = 1, exportSchema = false)
abstract class DatabaseAccessor : RoomDatabase() {
    abstract fun noteDao(): NoteDao
}