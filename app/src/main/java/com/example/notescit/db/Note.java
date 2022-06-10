package com.example.notescit.db;


import androidx.room.ColumnInfo;
import androidx.room.Entity;

@Entity
public class Note {

    @ColumnInfo(name = "title")
    String noteTitle;

    @ColumnInfo(name = "details")
    String noteDetails;

    @ColumnInfo(name = "priority")
    String notePriority;

}
