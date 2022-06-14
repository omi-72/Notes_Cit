package com.example.notescit.db;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.notescit.MainActivity;

@Database(entities = {Note.class}, version = 1, exportSchema = false)
public abstract class NoteDatabase extends RoomDatabase {
    static NoteDatabase noteDatabase=null;

    public abstract NoteDao getDao();

    public static NoteDatabase getInstance(Context context){

        if (noteDatabase== null){
            noteDatabase = Room.databaseBuilder(
                    context,
                    NoteDatabase.class,
                    "Note_db"
            ).allowMainThreadQueries().build();

        }



       return noteDatabase;

    }

}
