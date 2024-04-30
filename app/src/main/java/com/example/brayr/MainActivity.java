package com.example.brayr;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

                final Button button1 = findViewById(R.id.button1);
                final Button button2 = findViewById(R.id.button2);
                final Button button3 = findViewById(R.id.button3);

                final Animation anim = AnimationUtils.loadAnimation(this, R.anim.button_anim);

                button1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                                button1.startAnimation(anim);
                                button1.setBackgroundColor(getResources().getColor(R.color.colorButtonPressed));
                        }
                });

                button2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                                button2.startAnimation(anim);
                                button2.setBackgroundColor(getResources().getColor(R.color.colorButtonPressed));
                        }
                });

                button3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                                button3.startAnimation(anim);
                                button3.setBackgroundColor(getResources().getColor(R.color.colorButtonPressed));
                        }
                });
        }
}