package com.example.notescit.ui.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

import com.example.notescit.R;
import com.google.android.material.textfield.TextInputEditText;

public class AddNoteActivity extends AppCompatActivity {

    AutoCompleteTextView edt_priority;
    TextInputEditText edt_title, edt_details;
    Button btn_addNote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_note);

        edt_title= findViewById(R.id.edt_title);
        edt_details= findViewById(R.id.edt_details);
        edt_priority= findViewById(R.id.edt_priority);
        btn_addNote= findViewById(R.id.btn_addNote);

        btn_addNote.setOnClickListener(view -> {
            String title = edt_title.getText().toString().trim();
            String details = edt_details.getText().toString().trim();
            String priority = edt_priority.getText().toString().trim();



        });




    }
}