package com.example.education;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class login_student extends AppCompatActivity implements View.OnClickListener{
    private Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_student);

        login = (Button)findViewById(R.id.loginstudent);
        login.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.loginstudent){
            Intent intend = new Intent(login_student.this,Main2ActivityStudent.class);
            startActivity(intend);
        }

    }
}
