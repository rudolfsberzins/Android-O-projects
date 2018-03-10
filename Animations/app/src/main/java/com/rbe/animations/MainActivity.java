package com.rbe.animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade (View view) {

        ImageView bart = findViewById(R.id.bartImageView);
        ImageView homer = findViewById(R.id.homerImageView);

        bart.animate().alpha(0f).setDuration(1000);
        homer.animate().alpha(1f).setDuration(1000);

    }

//    public void fadeBack (View view) {
//
//        ImageView bart = findViewById(R.id.bartImageView);
//        ImageView homer = findViewById(R.id.homerImageView);
//
//        homer.animate().alpha(0f).setDuration(1000);
//        bart.animate().alpha(1f).setDuration(1000);
//
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
