package com.example.education;

import android.content.Intent;
import android.content.SearchRecentSuggestionsProvider;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class login_Supervisor extends AppCompatActivity implements View.OnClickListener{
    private Button login,signup;
    private FirebaseAuth mAuth;
    public EditText email,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_supervisor);
        //FirebaseApp.initializeApp(this);

        login = (Button)findViewById(R.id.loginstudent);
        signup= (Button)findViewById(R.id.createaccount);
        email = (EditText)findViewById(R.id.email);
        password= (EditText)findViewById(R.id.passwoed);

        signup.setOnClickListener(this);
        login.setOnClickListener(this);
        //mAuth = FirebaseAuth.getInstance();

    }

    @Override
    public void onClick(View v) {
        //String mail= email.getText().toString();
        //String pass= password.getText().toString();

        if(v.getId()==R.id.loginstudent){

            Intent intend = new Intent(login_Supervisor.this,Main2ActivitySupervisor.class);
            startActivity(intend);
/*
            mAuth.signInWithEmailAndPassword(mail, pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if(task.isSuccessful()){
                        Intent intend = new Intent(login_Supervisor.this,Main2ActivitySupervisor.class);
                        startActivity(intend);
                    }
                    else {
                        String message = task.getException().toString();
                        Toast.makeText(login_Supervisor.this, message, Toast.LENGTH_LONG).show();
                    }
                }
            });*/

        }else if(v.getId()==R.id.createaccount){
            Intent intend = new Intent(login_Supervisor.this,registerSupervisor.class);
            startActivity(intend);
        }

    }


}

