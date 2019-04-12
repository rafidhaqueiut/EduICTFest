package com.example.education;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class login_Supervisor extends AppCompatActivity implements View.OnClickListener{
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_supervisor);

        login = (Button)findViewById(R.id.loginstudent);
        login.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.loginstudent){
            Intent intend = new Intent(login_Supervisor.this,Main2ActivitySupervisor.class);
            startActivity(intend);
        }

    }
}

