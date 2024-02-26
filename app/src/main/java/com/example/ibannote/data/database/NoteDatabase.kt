package com.example.ibannote.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.ibannote.model.Note

@Database(entities = [Note::class], version = 1)
abstract class NoteDatabase : RoomDatabase() {

    abstract fun getNoteDao(): NoteDao
}