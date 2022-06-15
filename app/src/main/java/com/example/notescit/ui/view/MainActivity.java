package com.example.notescit.ui.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.view.View;

import com.example.notescit.R;
import com.example.notescit.db.Note;
import com.example.notescit.db.NoteDatabase;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

public class MainActivity extends AppCompatActivity {
    ExtendedFloatingActionButton fab_addNote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Note note= new Note("Exam", "will start from tomorrow", "High");

       NoteDatabase.getInstance(this).getDao().insertNote(note);

       fab_addNote= findViewById(R.id.add_note);

       fab_addNote.setOnClickListener(v -> {
           
       });

    }
}