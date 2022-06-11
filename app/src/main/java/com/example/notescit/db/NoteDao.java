package com.example.notescit.db;

import androidx.room.Dao;
import androidx.room.Insert;

@Dao
public interface NoteDao {

    @Insert
    public void insertNote(Note note);

}
