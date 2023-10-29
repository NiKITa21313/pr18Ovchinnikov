package com.example.pr18ovchinnikov;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnLesson48, btnLesson49, btnLesson50, btnLesson51, btnLesson52, btnLesson53, btnLesson54;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLesson48 = findViewById(R.id.btn48);
        btnLesson48.setOnClickListener(this);

        btnLesson49 = findViewById(R.id.btn49);
        btnLesson49.setOnClickListener(this);

        btnLesson50 = findViewById(R.id.btn50);
        btnLesson50.setOnClickListener(this);

        btnLesson51 = findViewById(R.id.btn51);
        btnLesson51.setOnClickListener(this);

        btnLesson52 = findViewById(R.id.btn52);
        btnLesson52.setOnClickListener(this);

        btnLesson53 = findViewById(R.id.btn53);
        btnLesson53.setOnClickListener(this);

        btnLesson54 = findViewById(R.id.btn54);
        btnLesson54.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.btn48){
            startActivity(new Intent(this,Simpleadapter.class));
        }
        else if (view.getId() == R.id.btn49){
            startActivity(new Intent(this,Lesson49.class));
        }
        else if (view.getId() == R.id.btn50) {
            startActivity(new Intent(this,Lesson50.class));
        }
        else if(view.getId() == R.id.btn51){
            startActivity(new Intent(this,Lesson51.class));
        }
        else if(view.getId() == R.id.btn52){
            startActivity(new Intent(this,Lesson52.class));
        }
        else if(view.getId() == R.id.btn53){
            startActivity(new Intent(this,Lesson53.class));
        }
        else if(view.getId() == R.id.btn54){
            startActivity(new Intent(this,Lesson54.class));
        }
    }
}