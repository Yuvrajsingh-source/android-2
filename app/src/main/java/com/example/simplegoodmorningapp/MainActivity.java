package com.example.simplegoodmorningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this,"Good morning!!",Toast.LENGTH_SHORT).show();
        textview= findViewById(R.id.text);
            textview.setText("Very Good morning!!");
    }
}