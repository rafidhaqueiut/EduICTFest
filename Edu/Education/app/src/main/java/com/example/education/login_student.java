package com.example.education;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class login_student extends AppCompatActivity implements View.OnClickListener{
    private Button login, signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_student);

        login = (Button)findViewById(R.id.loginstudent);
        signup= (Button)findViewById(R.id.createaccount);
        login.setOnClickListener(this);
        signup.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.loginstudent){
            Intent intend = new Intent(login_student.this,Main2ActivityStudent.class);
            startActivity(intend);
        }else if(v.getId()==R.id.createaccount){
            Intent intent = new Intent(login_student.this, registerStudent.class);
            startActivity(intent);
        }

    }
}
