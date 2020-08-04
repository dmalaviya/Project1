package com.divyesh.divyesh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class Detail2 extends AppCompatActivity {
    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(1);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS ,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS );
        getWindow().setStatusBarColor(Color.TRANSPARENT);

        setContentView(R.layout.activity_detail2);

        bt=(Button)findViewById(R.id.about);
        bt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                Intent intent= new Intent(Detail2.this,Detail.class);
                startActivity(intent);
            }

        });
    }
}