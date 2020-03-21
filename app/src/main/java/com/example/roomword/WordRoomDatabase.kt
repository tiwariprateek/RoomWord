package com.example.roomword

import android.content.Context
import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Word::class), version = 1,exportSchema = false )
public abstract class WordRoomDatabase :RoomDatabase() {
    abstract fun wordDao() :WordDao

    companion object{
        @Volatile
        private var INSTANCE :WordRoomDatabase?=null
        fun getDatabse(context: Context):WordRoomDatabase{

        }
    }
}