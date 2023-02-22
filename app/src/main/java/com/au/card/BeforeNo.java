package com.au.card;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;



//public class BeforeNo {


public class BeforeNo extends AppCompatActivity {

      TextView lbl1,lbl2;
      EditText num;
      Button button;
      ImageView iv,iv1;
      String n1[] = {"10","95","10","83","12","16","70","29","61","7","39","53","46","17","19","3","100"};
      int i=0,j;

      //int i,j;
      MediaPlayer mediaPlayer,mediaPlayer1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bn);

        getSupportActionBar().setTitle("Before No.");

          lbl1 = findViewById(R.id.lbl1);
          lbl2 = findViewById(R.id.lbl2);
          num = findViewById(R.id.num);
          button = findViewById(R.id.button);
          iv = findViewById(R.id.imageView);
        iv1 = findViewById(R.id.imageView2);
            lbl2.setText(n1[i]);
            j = Integer.parseInt(n1[i])-1;


         mediaPlayer = MediaPlayer.create(this, R.raw.alert);
         mediaPlayer1 = MediaPlayer.create(this, R.raw.ohno);

             button.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {

                     if(num.getText().toString().equals(j+""))
                     {
						 Toast.makeText(getApplicationContext(), "Correct !", Toast.LENGTH_SHORT).show();
                         iv.setVisibility(View.VISIBLE);
                         mediaPlayer.start();

                         Handler handler = new Handler();
                         handler.postDelayed(new Runnable() {
                             @Override
                             public void run() {

                                 i+=1;
                                 lbl2.setText(n1[i]);
                                 j = Integer.parseInt(n1[i])-1;
                                 iv.setVisibility(View.INVISIBLE);
                                 num.setText("");

                             }
                         }, 1500);
                     }
                     else {

						 Toast.makeText(getApplicationContext(), "Incorrect !", Toast.LENGTH_SHORT).show();

                         iv1.setVisibility(View.VISIBLE);
                        mediaPlayer1.start();
                         num.setText("");

                         Handler handler = new Handler();
                         handler.postDelayed(new Runnable() {
                             @Override
                             public void run() {
                                 iv1.setVisibility(View.INVISIBLE);
                             }
                         }, 1500);

                    }

                 }
             });
    }
}

