package com.divyesh.divyesh;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.WindowManager;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class login extends AppCompatActivity {

    EditText user;
    EditText pass;
    Button bt;

    boolean isValid = false;
    String user1="Admin";
    String pass1="12345";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(1);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS ,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS );
        getWindow().setStatusBarColor(Color.TRANSPARENT);

        setContentView(R.layout.activity_login);

        user=(EditText)findViewById(R.id.username);
        pass=(EditText)findViewById(R.id.password);
        bt=(Button)findViewById(R.id.btnlogin);




        bt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                String inputName = user.getText().toString();
                String inputPassword = pass.getText().toString();{

                    if(inputName.isEmpty() || inputPassword.isEmpty()) {

                        Toast toast = Toast.makeText(getApplicationContext(),
                                "Enter Detail",
                                Toast.LENGTH_SHORT);

                        toast.show();
                    }
                    else
                    {
                        isValid = validate ( inputName , inputPassword);
                        if(isValid)
                        {
                            Toast toast = Toast.makeText(getApplicationContext(),
                                    "Login Successfully",
                                    Toast.LENGTH_SHORT);

                            toast.show();

                            Intent intent= new Intent(login.this,Detail2.class);
                            startActivity(intent);
                        }
                        else
                        {
                            Toast toast = Toast.makeText(getApplicationContext(),
                                    "Enter Correct Detail",
                                    Toast.LENGTH_SHORT);

                            toast.show();
                        }
                    }
                }
            }
        });
    }
    private boolean validate(String name,String password)
    {
        if(name.equals(user1) && password.equals(pass1)){

            return true;
        }

        return false;
    }

}