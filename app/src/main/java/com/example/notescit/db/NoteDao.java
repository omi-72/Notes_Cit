package com.example.notescit.db;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Update;

@Dao
public interface NoteDao {

    @Insert
     void insertNote(Note note);
    @Update
    void  updateNote(Note note);

}
