package com.anthony_powell.citadel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class LoginActivity extends AppCompatActivity {

    EditText email,pword;
    Button registerbtn, login;
    TextView passres;


 @Override
 protected void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_login);

     email = (EditText) findViewById(R.id.email);
     pword = (EditText) findViewById(R.id.pword);
     registerbtn = (Button) findViewById(R.id.registerbtn);
     login = (Button) findViewById(R.id.login);
     passres = (TextView)findViewById(R.id.passres);


     login = (Button) findViewById(R.id.login);
  login.setOnClickListener(new View.OnClickListener() {


   @Override
   public void onClick(View v) {
    if (  ( !email.getText().toString().equals("")) && ( !pword.getText().toString().equals("")) )
    {
        Intent loginIntent = new Intent(LoginActivity.this,RegistrationActivity.class);
        startActivity(loginIntent);
    }
    else if ( ( !email.getText().toString().equals("")) )
    {
     Toast.makeText(getApplicationContext(),
             "Password field empty", Toast.LENGTH_SHORT).show();
    }
    else if ( ( !pword.getText().toString().equals("")) )
    {
     Toast.makeText(getApplicationContext(),
             "Email field empty", Toast.LENGTH_SHORT).show();
    }
    else
    {
     Toast.makeText(getApplicationContext(),
             "Email and Password field are empty", Toast.LENGTH_SHORT).show();
    }

   }
  });


  Button register = (Button) findViewById(R.id.registerbtn);
  register.setOnClickListener(new View.OnClickListener() {

   @Override
   public void onClick(View v) {
    Intent regIntent = new Intent(LoginActivity.this, RegistrationActivity.class);
    startActivity(regIntent);
   }
  });
  passres = (TextView) findViewById(R.id.passres);
  passres.setOnClickListener(new View.OnClickListener() {

   @Override
   public void onClick(View v) {
    Intent resetIntent = new Intent(LoginActivity.this,RegistrationActivity.class);
    startActivity(resetIntent);
   }
  });
 }
}
