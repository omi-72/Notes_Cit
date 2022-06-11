package com.example.notescit.db;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Note {
    @PrimaryKey(autoGenerate = true)
    int id;

    @ColumnInfo(name = "title")
    String noteTitle;

    @ColumnInfo(name = "details")
    String noteDetails;

    @ColumnInfo(name = "priority")
    String notePriority;

    public Note(String noteTitle, String noteDetails, String notePriority) {
        this.noteTitle = noteTitle;
        this.noteDetails = noteDetails;
        this.notePriority = notePriority;
    }

    public int getId() {
        return id;
    }

    public String getNoteTitle() {
        return noteTitle;
    }

    public String getNoteDetails() {
        return noteDetails;
    }

    public String getNotePriority() {
        return notePriority;
    }
}
