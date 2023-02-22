package com.au.card;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Division extends AppCompatActivity {

    TextView que;
    Button o1,o2,o3,o4;
    String[] question = {"4 / 2","1 / 1","10 / 2","15 / 3","6 / 2","12 / 4","16 / 2","18 / 3"};
    String[][] answer = {{"4","2","9","8","2"},{"2","0","1","3","1"},{"7","3","5","7","5"},{"3","2","5","8","5"},{"3","5","4","8","3"},{"7","6","3","8","3"},{"6","4","3","8","8"},{"3","6","4","1","6"}};
    int i=0;
    //android.app.ActionBar actionBar;
    //ActionBar aBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_division);

        getSupportActionBar().setTitle("Division");

        /*aBar= getSupportActionBar();
        ColorDrawable cd = new ColorDrawable(Color.parseColor("#9CCEF3"));
        actionBar.setBackgroundDrawable(cd);*/

        que = findViewById(R.id.textView);
        o1 = findViewById(R.id.btn1);
        o2 = findViewById(R.id.btn2);
        o3 = findViewById(R.id.btn3);
        o4 = findViewById(R.id.btn4);


        que.setText(question[i]);
        o1.setText(answer[i][0]);
        o2.setText(answer[i][1]);
        o3.setText(answer[i][2]);
        o4.setText(answer[i][3]);


        o1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (o1.getText().toString().equals(answer[i][4]))
                {
                    o1.setBackgroundColor(Color.parseColor("#4CAF50"));

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            i++;
                            que.setText(question[i]);
                            o1.setText(answer[i][0]);
                            o2.setText(answer[i][1]);
                            o3.setText(answer[i][2]);
                            o4.setText(answer[i][3]);

                            o1.setBackgroundColor(Color.parseColor("#929FB3"));
                            o2.setBackgroundColor(Color.parseColor("#9CCEF3"));
                            o3.setBackgroundColor(Color.parseColor("#9CCEF3"));
                            o4.setBackgroundColor(Color.parseColor("#929FB3"));
                        }
                    },1500);
                }
                else
                {
                    o1.setBackgroundColor(Color.parseColor("#F44336"));
                }

            }
        });

        o2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (o2.getText().toString().equals(answer[i][4]))
                {
                    o2.setBackgroundColor(Color.parseColor("#4CAF50"));

                    Handler handler1 = new Handler();
                    handler1.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            i++;
                            que.setText(question[i]);
                            o1.setText(answer[i][0]);
                            o2.setText(answer[i][1]);
                            o3.setText(answer[i][2]);
                            o4.setText(answer[i][3]);

                            o2.setBackgroundColor(Color.parseColor("#9CCEF3"));
                            o3.setBackgroundColor(Color.parseColor("#9CCEF3"));
                            o4.setBackgroundColor(Color.parseColor("#929FB3"));
                            o1.setBackgroundColor(Color.parseColor("#929FB3"));
                        }
                    },1500);
                }
                else
                {
                    o2.setBackgroundColor(Color.parseColor("#F44336"));
                }
            }
        });

        o3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (o3.getText().toString().equals(answer[i][4]))
                {
                    o3.setBackgroundColor(Color.parseColor("#4CAF50"));

                    Handler handler2= new Handler();
                    handler2.postDelayed(new Runnable() {
                        @Override
                        public void run() {

                            i++;

                            que.setText(question[i]);
                            o1.setText(answer[i][0]);
                            o2.setText(answer[i][1]);
                            o3.setText(answer[i][2]);
                            o4.setText(answer[i][3]);

                            o3.setBackgroundColor(Color.parseColor("#9CCEF3"));
                            o4.setBackgroundColor(Color.parseColor("#929FB3"));
                            o1.setBackgroundColor(Color.parseColor("#929FB3"));
                            o2.setBackgroundColor(Color.parseColor("#9CCEF3"));
                        }
                    },1000);
                }
                else
                {
                    o3.setBackgroundColor(Color.parseColor("#F44336"));
                }
            }
        });

        o4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (o4.getText().toString().equals(answer[i][4]))
                {
                    o4.setBackgroundColor(Color.parseColor("#4CAF50"));

                    Handler handler=new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            i++;
                            que.setText(question[i]);
                            o1.setText(answer[i][0]);
                            o2.setText(answer[i][1]);
                            o3.setText(answer[i][2]);
                            o4.setText(answer[i][3]);

                            o4.setBackgroundColor(Color.parseColor("#929FB3"));
                            o1.setBackgroundColor(Color.parseColor("#929FB3"));
                            o2.setBackgroundColor(Color.parseColor("#9CCEF3"));
                            o3.setBackgroundColor(Color.parseColor("#9CCEF3"));
                        }
                    },1000);
                }
                else
                {
                    o4.setBackgroundColor(Color.parseColor("#F44336"));
                }
            }
        });

    }
}
