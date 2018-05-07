package com.example.aria_nazaralizadeh.meditation;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.aria_nazaralizadeh.meditation.CustomIntent.customType;

public class Splash_screenActivity extends AppCompatActivity {

    ImageView logo;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        logo = (ImageView) findViewById(R.id.logo);
        text = (TextView) findViewById(R.id.text);

        Thread splashtime = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(3000);
                } catch (Exception e) {
                } finally {
                    Intent intent = new Intent(Splash_screenActivity.this, RegisterActivity.class);
//                    Pair[] pairs = new Pair[2];
//                    pairs[0] = new Pair<View, String>(logo, "LogoTransition");
//                    pairs[1] = new Pair<View, String>(text, "TextTransition");
//                    ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(Splash_screenActivity.this, pairs);
                    startActivity(intent);
                    customType(Splash_screenActivity.this,"fadein-to-fadeout");
                }
            }
        };

        splashtime.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }


}
