package com.example.noor.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView ivImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ivImage =findViewById(R.id.ivImage);

        Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.alpha);

        ivImage.startAnimation(animation);

    }
}

