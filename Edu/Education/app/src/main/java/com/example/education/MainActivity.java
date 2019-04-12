package com.example.education;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button student,teacher,supervisor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(),"okay",Toast.LENGTH_LONG).show();

        student = (Button)findViewById(R.id.student);
        teacher= (Button)findViewById(R.id.teacher);
        supervisor= (Button)findViewById(R.id.supervisor);

        student.setOnClickListener(this);
        teacher.setOnClickListener(this);
        supervisor.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.student){
            Intent intend = new Intent(MainActivity.this,login_student.class);
            startActivity(intend);
        }else if(v.getId()== R.id.teacher){
            Intent intend = new Intent(MainActivity.this,login_Teacher.class);
            startActivity(intend);
        }else if(v.getId()==R.id.supervisor){
            Intent intend = new Intent(MainActivity.this, login_Supervisor.class);
            startActivity(intend);
        }

    }
}
