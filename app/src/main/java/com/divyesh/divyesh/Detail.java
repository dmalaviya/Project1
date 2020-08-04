package com.divyesh.divyesh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class Detail extends AppCompatActivity {
    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(1);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS ,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS );
        getWindow().setStatusBarColor(Color.TRANSPARENT);

        setContentView(R.layout.activity_detail);

        bt=(Button)findViewById(R.id.contact);
        bt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                Intent intent= new Intent(Detail.this,Detail2.class);
                startActivity(intent);
            }

        });
    }
}