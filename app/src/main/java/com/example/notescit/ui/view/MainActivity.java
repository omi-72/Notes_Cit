package com.example.notescit.ui.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.notescit.R;
import com.example.notescit.db.Note;
import com.example.notescit.db.NoteDatabase;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    ExtendedFloatingActionButton fab_addNote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



       fab_addNote= findViewById(R.id.add_note);

       fab_addNote.setOnClickListener(v -> {
        startActivity(new Intent(getApplicationContext(), AddNoteActivity.class));

       });

    }

    @Override
    protected void onStart() {
        super.onStart();
      List<Note> allNotes = NoteDatabase.getInstance(getApplicationContext()).getDao().getNotes();

      for (Note note : allNotes){
          Log.i("TAG", " ");
      }
    }
}