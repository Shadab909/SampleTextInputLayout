package com.example.profile;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;



import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> arrayList_class;
    ArrayAdapter<String> arrayAdapter_class;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//
       final AutoCompleteTextView  act_class = findViewById(R.id.act_class);
        Button button = findViewById(R.id.button);

        arrayList_class = new ArrayList<>();
        arrayList_class.add("Class 10");
        arrayList_class.add("Class 12 Science");
        arrayList_class.add("Class 12 Commerce");
        arrayList_class.add("Class 12 Arts");

        arrayAdapter_class = new ArrayAdapter<>(getApplicationContext(),R.layout.sample_dropdown,arrayList_class);
        act_class.setAdapter(arrayAdapter_class);

        act_class.setThreshold(1);


        button.setOnClickListener(v -> {
            String s = act_class.getText().toString();
            Log.d("class",s);
        });


    }
}