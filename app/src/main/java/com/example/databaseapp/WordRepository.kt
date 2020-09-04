package com.example.databaseapp

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData

class WordRepository (private val wordDao: WordDao) {

    val allWords: LiveData<List<Word>> = wordDao.getAlphabetizedWords()
    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insert(word: Word) {
        wordDao.insert(word)
    }
}