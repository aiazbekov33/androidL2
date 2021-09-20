package com.example.androidl2;

import static com.example.androidl2.R.id.change_image_btn1;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class MainActivity extends AppCompatActivity {


    ImageView imageView;
    Button dog, cat, squirrel, quoka;
    boolean isDog, isCat, isSquirrel, isQuoka;
    CountDownTimer countDownTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initClickers();

    }


    private void initClickers() {
        dog.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if (isDog) {
                    countDownTimer = new CountDownTimer(1000,1000) {
                        @Override
                        public void onTick(long l) {
                            YoYo.with(Techniques.Tada)
                                    .duration(300)
                                    .repeat(1)
                                    .playOn(findViewById(R.id.dog_btn));
                            dog.setBackgroundResource(R.drawable.correct_answer);
                        }

                        @Override
                        public void onFinish() {
                            dog.setBackgroundResource(R.drawable.no_answer);

                        }
                    }.start();




                    Toast.makeText(MainActivity.this, "Верно", Toast.LENGTH_SHORT).show();
                } else {
                    countDownTimer = new CountDownTimer(1000,1000) {
                        @Override
                        public void onTick(long l) {
                            YoYo.with(Techniques.Shake)
                                    .duration(300)
                                    .repeat(1)
                                    .playOn(findViewById(R.id.dog_btn));
                            dog.setBackgroundResource(R.drawable.incorrect_answer);
                        }

                        @Override
                        public void onFinish() {
                            dog.setBackgroundResource(R.drawable.no_answer);

                        }
                    }.start();
                    Toast.makeText(MainActivity.this, "Не Верно!!", Toast.LENGTH_SHORT).show();
                }

            }
        });
        cat.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (isCat) {
                    countDownTimer = new CountDownTimer(1000,1000) {
                        @Override
                        public void onTick(long l) {
                            YoYo.with(Techniques.Tada)
                                    .duration(300)
                                    .repeat(1)
                                    .playOn(findViewById(R.id.cat_btn));
                            cat.setBackgroundResource(R.drawable.correct_answer);
                        }

                        @Override
                        public void onFinish() {
                            cat.setBackgroundResource(R.drawable.no_answer);

                        }
                    }.start();



                    Toast.makeText(MainActivity.this, "Верно", Toast.LENGTH_SHORT).show();

                } else {
                    countDownTimer = new CountDownTimer(1000,1000) {
                    @Override
                    public void onTick(long l) {
                        YoYo.with(Techniques.Shake)
                                .duration(300)
                                .repeat(1)
                                .playOn(findViewById(R.id.cat_btn));
                        cat.setBackgroundResource(R.drawable.incorrect_answer);
                    }
                    @Override
                    public void onFinish() {
                        cat.setBackgroundResource(R.drawable.no_answer);
                    }
                }.start();
                    Toast.makeText(MainActivity.this, "Не Верно!!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        squirrel.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (isSquirrel) {
                    countDownTimer = new CountDownTimer(1000,1000) {
                        @Override
                        public void onTick(long l) {
                            YoYo.with(Techniques.Tada)
                                    .duration(300)
                                    .repeat(1)
                                    .playOn(findViewById(R.id.cat_btn));
                            squirrel.setBackgroundResource(R.drawable.correct_answer);
                        }

                        @Override
                        public void onFinish() {
                            squirrel.setBackgroundResource(R.drawable.no_answer);

                        }
                    }.start();



                    Toast.makeText(MainActivity.this, "Верно", Toast.LENGTH_SHORT).show();

                } else {
                    countDownTimer = new CountDownTimer(1000,1000) {
                        @Override
                        public void onTick(long l) {
                            YoYo.with(Techniques.Shake)
                                    .duration(300)
                                    .repeat(1)
                                    .playOn(findViewById(R.id.squirrel_btn));
                            squirrel.setBackgroundResource(R.drawable.incorrect_answer);
                        }
                        @Override
                        public void onFinish() {
                            squirrel.setBackgroundResource(R.drawable.no_answer);
                        }
                    }.start();

                    Toast.makeText(MainActivity.this, "Не Верно!!", Toast.LENGTH_SHORT).show();

                }
            }
        });
        quoka.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (isQuoka) {
                    countDownTimer = new CountDownTimer(1000,1000) {
                        @Override
                        public void onTick(long l) {
                            YoYo.with(Techniques.Tada)
                                    .duration(300)
                                    .repeat(1)
                                    .playOn(findViewById(R.id.quoka_btn));
                            quoka.setBackgroundResource(R.drawable.correct_answer);
                        }

                        @Override
                        public void onFinish() {
                            quoka.setBackgroundResource(R.drawable.no_answer);

                        }
                    }.start();

                    Toast.makeText(MainActivity.this, "Верно", Toast.LENGTH_SHORT).show();
                } else {
                    countDownTimer = new CountDownTimer(1000,1000) {
                        @Override
                        public void onTick(long l) {
                            YoYo.with(Techniques.Shake)
                                    .duration(300)
                                    .repeat(1)
                                    .playOn(findViewById(R.id.squirrel_btn));
                            quoka.setBackgroundResource(R.drawable.incorrect_answer);
                        }
                        @Override
                        public void onFinish() {
                            quoka.setBackgroundResource(R.drawable.no_answer);
                        }
                    }.start();

                    Toast.makeText(MainActivity.this, "Не Верно!!", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }

    private void initViews() {
        imageView = findViewById(R.id.image_animal);
        dog = findViewById(R.id.dog_btn);
        cat = findViewById(R.id.cat_btn);
        squirrel = findViewById(R.id.squirrel_btn);
        quoka = findViewById(R.id.quoka_btn);
    }


    public void changeImage(View view) {
        switch (view.getId()) {

            case change_image_btn1:
                imageView.setImageResource(R.drawable.dog);
                isDog = true;
                isCat = false;
                isSquirrel = false;
                break;

            case R.id.change_image_btn2:
                imageView.setImageResource(R.drawable.cat);
                isCat = true;
                isDog = false;
                isSquirrel = false;
                break;

            case R.id.change_image_btn3:
                imageView.setImageResource(R.drawable.squirrel);
                isSquirrel = true;
                isDog = false;
                isCat = false;
                break;

            case R.id.change_image_btn4:
                imageView.setImageResource(R.drawable.quoka);
                isQuoka = true;
                isSquirrel = false;
                isDog = false;
                isCat = false;
                break;

        }
    }
}