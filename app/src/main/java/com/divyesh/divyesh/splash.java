package com.divyesh.divyesh;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.content.Intent;
import android.view.WindowManager;


public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(1);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS ,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS );
        getWindow().setStatusBarColor(Color.TRANSPARENT);

        setContentView(R.layout.activity_splash);


        Thread thread =new Thread(){

            public void run(){
                try{
                    sleep(5000);
                }
                catch(Exception e){
                    e.printStackTrace();
                }
                finally{
                    Intent intent = new Intent(splash.this,login.class);
                    startActivity(intent);

                }
            }
        };thread.start();


    }
}