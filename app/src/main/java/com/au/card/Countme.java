package com.au.card;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Countme extends AppCompatActivity {

    ImageView img;
    Button btn1,btn2,btn3,btn4;

    int que[]={R.drawable.book1,R.drawable.cartoon1,R.drawable.balloon2,R.drawable.color,R.drawable.donuts,R.drawable.lollipops,R.drawable.cartoon,R.drawable.duck,R.drawable.fish,R.drawable.flower,R.drawable.food,R.drawable.ducks,R.drawable.ghost,R.drawable.lollipop,R.drawable.flowers,R.drawable.balloons,R.drawable.pabbles,R.drawable.plane,R.drawable.tree,R.drawable.umbrella};
    String answer[][] = {{"8","7","3","4","1"},{"2","6","1","3","0"},{"9","4","2","6","3"},{"8","5","2","7","3"},{"11","7","12","14","2"},{"3","4","5","6","0"},{"2","1","0","3","0"},{"8","5","7","3","1"},{"5","2","4","8","3"},{"10","14","11","15","2"},{"9","6","5","7","1"},{"7","5","6","8","1"},{"8","5","9","4","2"},{"3","4","5","6","1"},{"9","7","5","2","2"},{"10","12","14","16","0"},{"8","5","7","9","3"},{"1","6","2","3","0"},{"8","2","3","4","1"},{"4","5","2","1","0"}};
    int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countme);

        getSupportActionBar().setTitle("Count Me");

        img = findViewById(R.id.imageView);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);

        img.setImageResource(R.drawable.book1);
        btn1.setText(answer[i][0]);
        btn2.setText(answer[i][1]);
        btn3.setText(answer[i][2]);
        btn4.setText(answer[i][3]);

        btn1.setBackgroundColor(Color.parseColor("#C2255B"));
        btn2.setBackgroundColor(Color.parseColor("#C2255B"));
        btn3.setBackgroundColor(Color.parseColor("#C2255B"));
        btn4.setBackgroundColor(Color.parseColor("#C2255B"));


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //answer[i][0].equals(answer[i][4])
                if(answer[i][0]==answer[i][Integer.parseInt(answer[i][4])])
                {
                    btn1.setBackgroundColor(Color.parseColor("#4CAF50"));
                    unclickeble();
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            i+=1;
                            clickeble();
                            img.setImageResource(que[i]);
                            btn1.setText(answer[i][0]);
                            btn2.setText(answer[i][1]);
                            btn3.setText(answer[i][2]);
                            btn4.setText(answer[i][3]);
                            btn1.setBackgroundColor(Color.parseColor("#C2255B"));
                            btn2.setBackgroundColor(Color.parseColor("#C2255B"));
                            btn3.setBackgroundColor(Color.parseColor("#C2255B"));
                            btn4.setBackgroundColor(Color.parseColor("#C2255B"));
                        }
                    }, 1000);
                }
                else
                {
                    btn1.setBackgroundColor(Color.parseColor("#F44336"));
                }

                btn2.setBackgroundColor(Color.parseColor("#C2255B"));
                btn3.setBackgroundColor(Color.parseColor("#C2255B"));
                btn4.setBackgroundColor(Color.parseColor("#C2255B"));

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(answer[i][1]==answer[i][Integer.parseInt(answer[i][4])]) {
                    btn2.setBackgroundColor(Color.parseColor("#4CAF50"));
                    unclickeble();
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            i+=1;
                            clickeble();
                            img.setImageResource(que[i]);
                            btn1.setText(answer[i][0]);
                            btn2.setText(answer[i][1]);
                            btn3.setText(answer[i][2]);
                            btn4.setText(answer[i][3]);
                            btn1.setBackgroundColor(Color.parseColor("#C2255B"));
                            btn2.setBackgroundColor(Color.parseColor("#C2255B"));
                            btn3.setBackgroundColor(Color.parseColor("#C2255B"));
                            btn4.setBackgroundColor(Color.parseColor("#C2255B"));
                        }
                    }, 1000);


                }
                else
                {
                    btn2.setBackgroundColor(Color.parseColor("#F44336"));
                }

                btn1.setBackgroundColor(Color.parseColor("#C2255B"));
                btn3.setBackgroundColor(Color.parseColor("#C2255B"));
                btn4.setBackgroundColor(Color.parseColor("#C2255B"));

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(answer[i][2]==answer[i][Integer.parseInt(answer[i][4])]) {
                    btn3.setBackgroundColor(Color.parseColor("#4CAF50"));
                    unclickeble();
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            i+=1;
                            clickeble();
                            img.setImageResource(que[i]);
                            btn1.setText(answer[i][0]);
                            btn2.setText(answer[i][1]);
                            btn3.setText(answer[i][2]);
                            btn4.setText(answer[i][3]);
                            btn1.setBackgroundColor(Color.parseColor("#C2255B"));
                            btn2.setBackgroundColor(Color.parseColor("#C2255B"));
                            btn3.setBackgroundColor(Color.parseColor("#C2255B"));
                            btn4.setBackgroundColor(Color.parseColor("#C2255B"));
                        }
                    }, 1000);

                }
                else
                {
                    btn3.setBackgroundColor(Color.parseColor("#F44336"));
                }

                btn2.setBackgroundColor(Color.parseColor("#C2255B"));
                btn1.setBackgroundColor(Color.parseColor("#C2255B"));
                btn4.setBackgroundColor(Color.parseColor("#C2255B"));

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(answer[i][3]==answer[i][Integer.parseInt(answer[i][4])]) {
                    btn4.setBackgroundColor(Color.parseColor("#4CAF50"));
                    unclickeble();
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            i+=1;
                            clickeble();
                            img.setImageResource(que[i]);
                            btn1.setText(answer[i][0]);
                            btn2.setText(answer[i][1]);
                            btn3.setText(answer[i][2]);
                            btn4.setText(answer[i][3]);
                            btn1.setBackgroundColor(Color.parseColor("#C2255B"));
                            btn2.setBackgroundColor(Color.parseColor("#C2255B"));
                            btn3.setBackgroundColor(Color.parseColor("#C2255B"));
                            btn4.setBackgroundColor(Color.parseColor("#C2255B"));
                        }
                    }, 1000);
                }
                else
                {
                    btn4.setBackgroundColor(Color.parseColor("#F44336"));
                }

                btn2.setBackgroundColor(Color.parseColor("#C2255B"));
                btn3.setBackgroundColor(Color.parseColor("#C2255B"));
                btn1.setBackgroundColor(Color.parseColor("#C2255B"));

            }
        });

    }

    public void unclickeble()
    {
        btn1.setClickable(false);
        btn2.setClickable(false);
        btn3.setClickable(false);
        btn4.setClickable(false);
    }

    public void clickeble()
    {
        btn1.setClickable(true);
        btn2.setClickable(true);
        btn3.setClickable(true);
        btn4.setClickable(true);
    }
}
