package com.example.noteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class NotebookPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try
        {
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e){}
        setContentView(R.layout.activity_notebook_page);
    }
}
