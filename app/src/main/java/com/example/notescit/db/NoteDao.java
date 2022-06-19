package com.example.notescit.db;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface NoteDao {

    @Insert
     void insertNote(Note note);
    @Update
    void  updateNote(Note note);
    @Delete
    void  deleteNote(Note note);

    @Query("SELECT * FROM Note")
    List<Note> getNotes();

}
