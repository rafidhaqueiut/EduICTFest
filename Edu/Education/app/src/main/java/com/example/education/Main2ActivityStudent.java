package com.example.education;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2ActivityStudent extends AppCompatActivity implements View.OnClickListener {

    private Button course;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2_student);

        course= (Button)findViewById(R.id.cse4303);

        course.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.cse4303){
            Intent intent= new Intent(Main2ActivityStudent.this,StudentCourse.class);
            startActivity(intent);
        }

    }
}
