package com.example.colorchange;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class LoginPage extends AppCompatActivity {

    TextView nameText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        Intent intent= getIntent();
        String data= intent.getStringExtra("name");
        nameText.setText("Welcome "+data);
    }
}

//send name to page 2 and get from there.
