package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String arr[]= new String[]{"One","Two", "Three", "Four"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner= findViewById(R.id.spinner);
        ArrayAdapter<String> adapter=  new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_dropdown_item_1line, arr);
        spinner.setAdapter(adapter);

        spinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "You selected "+ arr[i], Toast.LENGTH_SHORT).show();
            }
        });






    }
}
// creates Item in a Spinner, also uses toast
