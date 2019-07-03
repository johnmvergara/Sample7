package com.example.sample7;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText txtName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtName = findViewById(R.id.etName);
    }
    public void showUSTWebsite(View v){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.ust.edu.ph"));
        startActivity(i);
    }

    public void showEmailActivity(View v){
        Intent i2 = new Intent(Intent.ACTION_SEND, Uri.parse("mailto:"));
        i2.setType("text/plain");
        startActivity(i2);
    }

    public void showScreen2(View v){
    String name = txtName.getText().toString();
    Intent i3 = new Intent(this, Activity2.class);
    i3.putExtra("person", name);
    startActivity(i3);
    }
}
