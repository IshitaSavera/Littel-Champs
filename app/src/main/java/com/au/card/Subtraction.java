package com.au.card;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Subtraction extends AppCompatActivity {

    TextView que;
    Button o1,o2,o3,o4;
    String[] question = {"12 - 5","7 - 4","17 - 4","5 - 0","14 - 3","13 - 7","12 - 9","1 - 1"};
    String[][] answer = {{"7","12","4","8","7"},{"12","16","13","3","3"},{"17","13","14","7","13"},{"7","2","5","8","5"},{"27","11","14","18","11"},{"7","6","14","8","6"},{"6","4","3","8","3"},{"2","0","4","1","0"}};
    int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subtraction);

        getSupportActionBar().setTitle("Subtraction");

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
