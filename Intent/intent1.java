package com.example.colorchange;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {


    EditText tname;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tname= findViewById(R.id.etName);
        submit= findViewById(R.id.button);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data= tname.getText().toString();
                Intent intent= new Intent(MainActivity.this, LoginPage.class);
                intent.putExtra("name", data);
                startActivity(intent);
            }
        });



    }
}

//sending name from one intent to another
