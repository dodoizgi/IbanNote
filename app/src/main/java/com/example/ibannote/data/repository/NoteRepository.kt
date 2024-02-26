package com.example.ibannote.data.repository

import androidx.lifecycle.LiveData
import com.example.ibannote.data.database.NoteDao
import com.example.ibannote.model.Note
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NoteRepository @Inject constructor(
    private val noteDao: NoteDao
) {

    val getAllData: LiveData<List<Note>> = noteDao.getAllData()

    suspend fun insertData(note: Note) {
        noteDao.insertData(note)
    }

    suspend fun updateData(note: Note) {
        noteDao.updateData(note)
    }

    suspend fun deleteItem(note: Note) {
        noteDao.deleteItem(note)
    }

    suspend fun deleteAll() {
        noteDao.deleteAll()
    }
}