package com.au.card;

import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public class RhWord extends AppCompatActivity {

    ImageView img;
    Button btn1,btn2,btn3,btn4;
    private FirebaseAuth mAuth;

    //int question[]={R.drawable.cat,R.drawable.dubai,R.drawable.fox,R.drawable.book,R.drawable.bread,R.drawable.ground,R.drawable.jeep,R.drawable.ring,R.drawable.round,R.drawable.school,R.drawable.hen,R.drawable.kite,R.drawable.sad,R.drawable.star,R.drawable.comp};
    String answer[][] = {{"Dog","Bat","Cow","Pen","1"},{"Fox","Book","Mumbai","Pen","2"},{"Declare","Box","Hard","Earn","1"},{"Cook","Hard","Pen","Chair","0"},{"Mail","Cook","Head","Tall","2"},{"Work","Sound","Hot","Jam","1"},{"Jump","Lamp","Map","Sheep","3"},{"Flow","Near","King","Right","2"},{"Found","Joke","Mail","Dog","0"},{"Deer","Ice","Cool","Fat","2"},{"Kite","Men","Bat","Duck","1"},{"Ice","Red","String","Night","3"},{"Swing","Red","Earn","Eye","1"},{"Admit","Sea","Car","Pond","2"},{"Raw","Bus","Declare","Pink","2"}};
    int i=0;
    //int color = ((ColorDrawable) btn2.getBackground()).getColor();

    public void images(int i){
        String images[] = {"cat.png","dubai.png","fox.png","book.png","bread.png","ground.png","jeep.png","ring.png","round.png","school.png","hen.png","kite.png","sad.png","star.png","compare.png"};
        //Reference to an image file in Cloud Storage
        StorageReference storageReference = FirebaseStorage.getInstance().getReference().child("image/"+images[i]);
        storageReference.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
            @Override
            public void onSuccess(Uri uri) {
                Glide.with(getApplicationContext()).load(uri).into(img);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rh_word);

        getSupportActionBar().setTitle("Rhyming Word");

        img = findViewById(R.id.imageView);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);

        btn1.setText(answer[i][0]);
        btn2.setText(answer[i][1]);
        btn3.setText(answer[i][2]);
        btn4.setText(answer[i][3]);
        images(i);
        btn1.setBackgroundColor(Color.parseColor("#C2255B"));
        btn2.setBackgroundColor(Color.parseColor("#C2255B"));
        btn3.setBackgroundColor(Color.parseColor("#C2255B"));
        btn4.setBackgroundColor(Color.parseColor("#C2255B"));

        // Intialize Firebase Auth
        mAuth = FirebaseAuth.getInstance();

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //answer[i][0].equals(answer[i][4])
                if(answer[i][0]==answer[i][Integer.parseInt(answer[i][4])])
                {
                    btn1.setBackgroundColor(Color.parseColor("#4CAF50"));

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            i+=1;
                            images(i);
                            //img.setImageResource(question[i]);
                            btn1.setText(answer[i][0]);
                            btn2.setText(answer[i][1]);
                            btn3.setText(answer[i][2]);
                            btn4.setText(answer[i][3]);
                            btn1.setBackgroundColor(Color.parseColor("#C2255B"));
                            btn2.setBackgroundColor(Color.parseColor("#C2255B"));
                            btn3.setBackgroundColor(Color.parseColor("#C2255B"));
                            btn4.setBackgroundColor(Color.parseColor("#C2255B"));
                        }
                    }, 2000);
                }
                else
                {
                    btn1.setBackgroundColor(Color.parseColor("#F44336"));
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(answer[i][1]==answer[i][Integer.parseInt(answer[i][4])]) {
                    btn2.setBackgroundColor(Color.parseColor("#4CAF50"));
                    //images(i);

                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            i+=1;
                            images(i);
                            //img.setImageResource(question[i]);
                            btn1.setText(answer[i][0]);
                            btn2.setText(answer[i][1]);
                            btn3.setText(answer[i][2]);
                            btn4.setText(answer[i][3]);
                            btn1.setBackgroundColor(Color.parseColor("#C2255B"));
                            btn2.setBackgroundColor(Color.parseColor("#C2255B"));
                            btn3.setBackgroundColor(Color.parseColor("#C2255B"));
                            btn4.setBackgroundColor(Color.parseColor("#C2255B"));
                        }
                    }, 2000);


                }
                else
                {
                    btn2.setBackgroundColor(Color.parseColor("#F44336"));
                }

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(answer[i][2]==answer[i][Integer.parseInt(answer[i][4])]) {
                    btn3.setBackgroundColor(Color.parseColor("#4CAF50"));
                    //images(i);
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            i+=1;
                            images(i);
                            //img.setImageResource(question[i]);
                            btn1.setText(answer[i][0]);
                            btn2.setText(answer[i][1]);
                            btn3.setText(answer[i][2]);
                            btn4.setText(answer[i][3]);
                            btn1.setBackgroundColor(Color.parseColor("#C2255B"));
                            btn2.setBackgroundColor(Color.parseColor("#C2255B"));
                            btn3.setBackgroundColor(Color.parseColor("#C2255B"));
                            btn4.setBackgroundColor(Color.parseColor("#C2255B"));
                        }
                    }, 2000);

                }
                else
                {
                    btn3.setBackgroundColor(Color.parseColor("#F44336"));
                }

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick(View v) {

                if(answer[i][3]==answer[i][Integer.parseInt(answer[i][4])]) {
                    btn4.setBackgroundColor(Color.parseColor("#4CAF50"));
                    //images(i);
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            i+=1;
                            images(i);
                           // img.setImageResource(question[i]);
                            btn1.setText(answer[i][0]);
                            btn2.setText(answer[i][1]);
                            btn3.setText(answer[i][2]);
                            btn4.setText(answer[i][3]);
                            btn1.setBackgroundColor(Color.parseColor("#C2255B"));
                            btn2.setBackgroundColor(Color.parseColor("#C2255B"));
                            btn3.setBackgroundColor(Color.parseColor("#C2255B"));
                            btn4.setBackgroundColor(Color.parseColor("#C2255B"));
                        }
                    }, 2000);
                }
                else
                {
                    btn4.setBackgroundColor(Color.parseColor("#F44336"));
                }

            }
        });

    }
}
