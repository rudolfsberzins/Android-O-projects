package com.rbe.animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void fade (View view) {

        ImageView bart = findViewById(R.id.bartImageView);

        bart.animate()
                .translationXBy(1000f)
                .translationYBy(1000f)
                .rotation(3600f)
                .scaleX(1f)
                .scaleY(1f)
                .setDuration(2000);



//        ImageView homer = findViewById(R.id.homerImageView);
//        homer.animate().alpha(1f).setDuration(1000);
//        bart.animate().rotation(1800f).setDuration(2000);
//        bart.animate().translationXBy(1000f).setDuration(2000);
//        bart.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000);

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

        ImageView bart = findViewById(R.id.bartImageView);
        bart.setTranslationX(-1000f);
        bart.setTranslationY(-1000f);
        bart.setScaleX(0.5f);
        bart.setScaleY(0.5f);

    }
}
