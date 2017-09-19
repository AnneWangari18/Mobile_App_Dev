package com.myfirstapplication.annewangari18.dv;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        Button button_signup = (Button) findViewById(R.id.button_Create);
        final EditText FirstName = (EditText) findViewById(R.id.editText_FName);
        final EditText LastName = (EditText) findViewById(R.id.editText_LName);
        final EditText Email = (EditText) findViewById(R.id.editText_Email);
        final EditText Phone = (EditText) findViewById(R.id.editText_Phone);
        final EditText Password = (EditText) findViewById(R.id.editText_Password);


        button_signup.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

            Intent homeIntent = new Intent(Signup.this, HomeActivity.class);
            homeIntent.putExtra("FirstName", FirstName.getText().toString());
            homeIntent.putExtra("LastName", LastName.getText().toString());
            homeIntent.putExtra("Email", Email.getText().toString());
            homeIntent.putExtra("Phone", Phone.getText().toString());
            homeIntent.putExtra("Password", Password.getText().toString());
            startActivity(homeIntent);

            }
        });
    }


}
