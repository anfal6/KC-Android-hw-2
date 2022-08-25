package com.example.hw2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        EditText e1 = findViewById(R.id.ed1);
        EditText e2 = findViewById(R.id.ed2);
        EditText e3 = findViewById(R.id.ed3);
        EditText e4 = findViewById(R.id.ed4);
        EditText e5 = findViewById(R.id.ed5);




        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,cv.class);
                String customerName = e1.getText().toString();
                int customerAge = Integer.parseInt(e2.getText().toString());
                String customerJob = e3.getText().toString();
                int customerNumber = Integer.parseInt(e4.getText().toString());
                String customerEmail = e5.getText().toString();
                intent.putExtra("name",customerName);
                intent.putExtra("age",customerAge);
                intent.putExtra("job",customerJob);
                intent.putExtra("number",customerNumber);
                intent.putExtra("email",customerEmail);

                startActivity(intent);
            }
        });
        }

}