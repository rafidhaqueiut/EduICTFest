package com.example.education;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class registerTeacher extends AppCompatActivity{

    //private DatabaseReference mDatabase;
    //private FirebaseAuth mAuth;

    EditText email, username, password, cpassword, name, institutuion,id;
    Button submit;
    FirebaseAuth firebaseAuth;
    DatabaseReference databaseArtists;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_teacher);
        
        databaseArtists = FirebaseDatabase.getInstance().getReference("artists");

        //mDatabase = FirebaseDatabase.getInstance().getReference().child("Users");
        //mAuth = FirebaseAuth.getInstance();

        email = (EditText)findViewById(R.id.email);
        username = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.password);
        cpassword = (EditText)findViewById(R.id.cpassword);
        name = (EditText)findViewById(R.id.name);
        institutuion = (EditText)findViewById(R.id.institution);
        id = (EditText)findViewById(R.id.id);

        FirebaseApp.initializeApp(this);
        firebaseAuth = FirebaseAuth.getInstance();

        submit = (Button) findViewById(R.id.teacher_reg_submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addArtist();
            }
        });
    }

    private void addArtist() {
        String emailS= email.getText().toString().trim();
        String usernameS= username.getText().toString();
        String passwordS= password.getText().toString();
        String cpasswordS= cpassword.getText().toString();
        String nameS= name.getText().toString();
        String insS= institutuion.getText().toString();
        String idS= id.getText().toString();

        if(!TextUtils.isEmpty(emailS)){
            String id = databaseArtists.push().getKey();
            //, passwordS, cpasswordS,nameS,insS,idS
            Artist artist = new Artist(id, emailS, usernameS);

            databaseArtists.child(id).setValue(artist);

            Toast.makeText(getApplicationContext(), "oaky",Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(getApplicationContext(), "email is empty",Toast.LENGTH_LONG).show();

        }
    }/*

    private void SaveAccountInfo() {
        String emailS = email.getText().toString();
        String passwordS= password.getText().toString();
        String cpasswordS= cpassword.getText().toString();
        String nameS= name.getText().toString();
        String institutuionS= institutuion.getText().toString();

        if(!passwordS.equals(cpasswordS)){
            Toast.makeText(registerTeacher.this, "Passwords do not match!!", Toast.LENGTH_LONG).show();
        }
        else {

            HashMap userMap = new HashMap();
            userMap.put("Email", emailS);
            userMap.put("Password", passwordS);
            userMap.put("Confirm_password", cpasswordS);
            userMap.put("Name", nameS);
            userMap.put("Institution", institutuionS);

            mDatabase.updateChildren(userMap).addOnCompleteListener(new OnCompleteListener() {
                @Override
                public void onComplete(@NonNull Task task) {
                    Toast.makeText(registerTeacher.this, "Saving", Toast.LENGTH_LONG).show();
                    if (task.isSuccessful()) {
                        SendUserToMainActivity();
                        Toast.makeText(registerTeacher.this, "IN", Toast.LENGTH_LONG).show();
//                        Intent intend = new Intent(registerTeacher.this, Main2ActivityTeacher.class);
//                        startActivity(intend);

                    } else {
                        String message = task.getException().toString();
                        Toast.makeText(registerTeacher.this, "Wrng", Toast.LENGTH_LONG).show();
                    }
                }


            });
        }

    }

    private void SendUserToMainActivity() {
        Intent mainIntent = new Intent(registerTeacher.this, Main2ActivityTeacher.class);
        mainIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK| Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(mainIntent);
        finish();
    }*/

}
