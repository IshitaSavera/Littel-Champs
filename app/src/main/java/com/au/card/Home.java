package com.au.card;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Home extends AppCompatActivity implements View.OnClickListener {

    public CardView c1,c2,c3,c4,c5,c6,c7,c8,c9,c10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        c1= (CardView) findViewById(R.id.c1);
        c2= (CardView) findViewById(R.id.c2);
        c3= (CardView) findViewById(R.id.c3);
        c4= (CardView) findViewById(R.id.c4);
        c5= (CardView) findViewById(R.id.c5);
        c6= (CardView) findViewById(R.id.c6);
        c7= (CardView) findViewById(R.id.c7);
        c8= (CardView) findViewById(R.id.c8);
        c9= (CardView) findViewById(R.id.c9);
        c10= (CardView) findViewById(R.id.c10);

        c1.setOnClickListener(this);
        c2.setOnClickListener(this);
        c3.setOnClickListener(this);
        c4.setOnClickListener(this);
        c5.setOnClickListener(this);
        c6.setOnClickListener(this);
        c7.setOnClickListener(this);
        c8.setOnClickListener(this);
        c9.setOnClickListener(this);
        c10.setOnClickListener(this);
        
    }

    @Override
    public void onClick(View view) {

        Intent i;

        switch (view.getId()){
            case R.id.c1:
                i=new Intent(this,RhWord.class);
                startActivity(i);
                break;

            case R.id.c2:
                i=new Intent(this,Countme.class);
                startActivity(i);
                break;

            case R.id.c3:
                i=new Intent(this,Alphabets.class);
                startActivity(i);
                break;

            case R.id.c4:
                i=new Intent(this,AfterNo.class);
                startActivity(i);
                break;

            case R.id.c5:
                i=new Intent(this,BeforeNo.class);
                startActivity(i);
                break;

            case R.id.c6:
                i=new Intent(this,MiddleNo.class);
                startActivity(i);
                break;

            case R.id.c7:
                i=new Intent(this,Addition.class);
                startActivity(i);
                break;

            case R.id.c8:
                i=new Intent(this,Subtraction.class);
                startActivity(i);
                break;

            case R.id.c9:
                i=new Intent(this,Multiplication.class);
                startActivity(i);
                break;

            case R.id.c10:
                i=new Intent(this,Division.class);
                startActivity(i);
                break;


        }

    }
}
