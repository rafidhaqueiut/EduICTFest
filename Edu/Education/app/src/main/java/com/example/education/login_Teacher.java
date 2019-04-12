package com.example.education;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class login_Teacher extends AppCompatActivity implements View.OnClickListener {
    private Button login,signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_supervisor);

        login = (Button)findViewById(R.id.loginstudent);
        signup= (Button)findViewById(R.id.createaccount);

        signup.setOnClickListener(this);
        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.loginstudent){
            Intent intend = new Intent(login_Teacher.this,Main2ActivityTeacher.class);
            startActivity(intend);
        }else if(v.getId()==R.id.createaccount){
            Intent intend = new Intent(login_Teacher.this,registerTeacher.class);
            startActivity(intend);
        }

    }
}
