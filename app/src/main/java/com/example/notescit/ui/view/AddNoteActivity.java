package com.example.notescit.ui.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

import com.example.notescit.R;
import com.example.notescit.db.Note;
import com.example.notescit.db.NoteDatabase;
import com.google.android.material.textfield.TextInputEditText;

public class AddNoteActivity extends AppCompatActivity {

    AutoCompleteTextView edt_priority;
    TextInputEditText edt_title, edt_details;
    Button btn_addNote;
    String[] priorityArr = {"High", "Medium", "Low"};
    String priority= "Priority";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_note);

        edt_title= findViewById(R.id.edt_title);
        edt_details= findViewById(R.id.edt_details);
        edt_priority= findViewById(R.id.edt_priority);
        btn_addNote= findViewById(R.id.btn_addNote);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, priorityArr);
        edt_priority.setAdapter(adapter);


        btn_addNote.setOnClickListener(view -> {
            String title = edt_title.getText().toString().trim();
            String details = edt_details.getText().toString().trim();
            String priority = edt_priority.getText().toString().trim();

            if (title.isEmpty() || details.isEmpty() || priority.equals(priority)){
                
            }


            insertToDataBase(title, details, priority);



        });




    }

    private void insertToDataBase(String title, String details, String priority) {

        Note note= new Note(title, details, priority);

        NoteDatabase.getInstance(this).getDao().insertNote(note);
        edt_title.setText("");
        edt_details.setText("");
        edt_priority.setText(priority);

    }
}