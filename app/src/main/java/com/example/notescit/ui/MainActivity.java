package com.example.notescit.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;

import com.example.notescit.R;
import com.example.notescit.db.Note;
import com.example.notescit.db.NoteDatabase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Note note= new Note("Exam", "will start from tomorrow", "High");

       NoteDatabase.getInstance(this).getDao().insertNote(note);

    }
}