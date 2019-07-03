package com.example.sample7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    TextView txtGreeting;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        txtGreeting = findViewById(R.id.tvGreeting);
        Intent intent = getIntent();
        String str = intent.getStringExtra("person");
        txtGreeting.setText("Welcome " + str);
    }
}
