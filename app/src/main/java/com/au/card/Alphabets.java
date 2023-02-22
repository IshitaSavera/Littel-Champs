package com.au.card;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

public class Alphabets extends AppCompatActivity {

    ImageButton img1,img2,img3,img4,img5;
    Button btn1,btn2,btn3,btn4,btn5;
    Boolean clicked=false;
    int click=0 , i=0;
    int var=0;
    int bc=0;
    int a=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabets);

        getSupportActionBar().setTitle("Alphabets");

        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);
        img4 = findViewById(R.id.img4);
        img5 = findViewById(R.id.img5);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);

        click=1;
        click();

        
    }

    public void click()
    {
        if(click==1) {
            img1.setClickable(false);
            img2.setClickable(false);
            img3.setClickable(false);
            img4.setClickable(false);
            img5.setClickable(false);
        }
        else
        {
            img1.setClickable(true);
            img2.setClickable(true);
            img3.setClickable(true);
            img4.setClickable(true);
            img5.setClickable(true);
        }
    }

}
