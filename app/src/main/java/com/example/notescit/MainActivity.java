package com.example.notescit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;

import com.example.notescit.db.Note;
import com.example.notescit.db.NoteDatabase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NoteDatabase noteDatabase= Room.databaseBuilder(
                MainActivity.this,
                NoteDatabase.class,
                "Note_db"
        ).build();

        Note note= new Note("Exam", "will start from tomorrow", "High");

    }
}