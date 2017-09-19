package com.myfirstapplication.annewangari18.dv;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        TextView FirstName = (TextView) findViewById(R.id.textView_Set_FirstName);
        TextView LastName = (TextView) findViewById(R.id.textView_Set_LastName);
        TextView Email = (TextView) findViewById(R.id.textView_Set_Email);
        TextView Phone = (TextView) findViewById(R.id.textView_Set_Phone);
        TextView Password = (TextView) findViewById(R.id.textView_Set_Password);

        Intent intent = getIntent();
        String TextView_FName = intent.getStringExtra("FirstName");
        String TextView_LName = intent.getStringExtra("LastName");
        String TextView_Email = intent.getStringExtra("Email");
        String TextView_Phone = intent.getStringExtra("Phone");
        String TextView_Password = intent.getStringExtra("Password");

        FirstName.setText(TextView_FName);
        LastName.setText(TextView_LName);
        Email.setText(TextView_Email);
        Phone.setText(TextView_Phone);
        Password.setText(TextView_Password);
    }

}
