package com.example.hi.testingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Message", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Message", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Message", Toast.LENGTH_SHORT).show();
    }
}
