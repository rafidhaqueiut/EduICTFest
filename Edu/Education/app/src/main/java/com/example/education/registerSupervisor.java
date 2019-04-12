package com.example.education;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class registerSupervisor extends AppCompatActivity implements View.OnClickListener {

    private Button datasubmit;
    private FirebaseAuth firebaseAuth;
    private EditText email, name, id;

    DatabaseReference databaseAr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_supervisor);


        name= (EditText) findViewById(R.id.name);
        email= (EditText)findViewById(R.id.email) ;
        id= (EditText)findViewById(R.id.id);

        databaseAr = FirebaseDatabase.getInstance().getReference("artists");

        FirebaseApp.initializeApp(this);
        firebaseAuth= FirebaseAuth.getInstance();
        datasubmit= (Button)findViewById(R.id.sup_reg_submit);
        datasubmit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.sup_reg_submit){

            addArtist();

            /*
            FirebaseDatabase database = FirebaseDatabase.getInstance();
            DatabaseReference myRef = database.getReference("message");

            myRef.setValue("Hello, World!");
            myRef.setValue("iuhrfif");
            myRef.setValue("oijfjsdfdjfkf");
            Toast.makeText(getApplicationContext(),"OKAY",Toast.LENGTH_LONG).show();
*/
        }

    }

    private void addArtist() {
        /*
        String nam = name.getText().toString().trim();
        String mail = email.getText().toString().trim();
        String i = id.getText().toString().trim();

        if(!TextUtils.isEmpty(mail)){
            String id = databaseAr.push().getKey();

            Artist firebaseTest= new Artist(mail,nam,id);
            databaseAr.child(mail).setValue(firebaseTest);

            Toast.makeText(getApplicationContext(),"ok",Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(getApplicationContext(),"you should",Toast.LENGTH_LONG).show();

        }*/
    }
}
