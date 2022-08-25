package com.example.hw2;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class cv extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cv);

        TextView namet = findViewById(R.id.textView2);
        TextView namet2 = findViewById(R.id.textView3);
        TextView namet3 = findViewById(R.id.textView4);
        TextView namet4 = findViewById(R.id.textView5);
        TextView namet5 = findViewById(R.id.textView6);



        Bundle bundle = getIntent().getExtras();
        String name1 = bundle.getString("name");
          namet.setText(name1);
        String name2 = bundle.getString("job");
          namet3.setText(name2);
        String name3 = bundle.getString("email");
          namet5.setText(name3);
        int age = bundle.getInt("age");
          namet2.setText(String.valueOf(age));
        int number = bundle.getInt("number");
          namet4.setText(String.valueOf(number));
    }
}