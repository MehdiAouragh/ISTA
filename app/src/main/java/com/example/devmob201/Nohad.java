package com.example.devmob201;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Nohad extends AppCompatActivity {
    private Button retourner1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nohad);

        retourner1= findViewById(R.id.retourner1);
        retourner1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent( Nohad.this,MainActivity.class));
            }
        });



    }
}


