package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
EditText e1,e2,e3,e4,e5,e6,e7;
AppCompatButton b1,b2;
String getName,getAddress,getPhoneNumber,getEmailId,getUserName,getPassword,getConfirmPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        e1=(EditText) findViewById(R.id.name);
        e2=(EditText) findViewById(R.id.address);
        e3=(EditText) findViewById(R.id.phone_number);
        e4=(EditText) findViewById(R.id.email_id);
        e5=(EditText) findViewById(R.id.user_name);
        e6=(EditText) findViewById(R.id.password);
        e7=(EditText) findViewById(R.id.confirm_password);
        b1=(AppCompatButton) findViewById(R.id.register);
        b2=(AppCompatButton) findViewById(R.id.backtologin);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getName=e1.getText().toString();
                Toast.makeText(getApplicationContext(),getName,Toast.LENGTH_LONG).show();
                getAddress=e2.getText().toString();
                Toast.makeText(getApplicationContext(),getAddress,Toast.LENGTH_LONG).show();
                getPhoneNumber=e3.getText().toString();
                Toast.makeText(getApplicationContext(),getPhoneNumber,Toast.LENGTH_LONG).show();
                getEmailId=e4.getText().toString();
                Toast.makeText(getApplicationContext(),getEmailId,Toast.LENGTH_LONG).show();
                getUserName=e5.getText().toString();
                Toast.makeText(getApplicationContext(),getUserName,Toast.LENGTH_LONG).show();
                getPassword=e6.getText().toString();
                Toast.makeText(getApplicationContext(),getPassword,Toast.LENGTH_LONG).show();
                getConfirmPassword=e7.getText().toString();
                Toast.makeText(getApplicationContext(),getConfirmPassword,Toast.LENGTH_LONG).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
    }
}