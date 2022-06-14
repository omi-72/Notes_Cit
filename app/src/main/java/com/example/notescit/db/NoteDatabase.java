package com.example.notescit.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Note.class}, version = 1, exportSchema = false)
public abstract class NoteDatabase extends RoomDatabase {

    public abstract NoteDao getDao();

    public static NoteDatabase

}
