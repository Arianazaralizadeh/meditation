package com.example.aria_nazaralizadeh.meditation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.aria_nazaralizadeh.meditation.CustomIntent.customType;

public class goalsActivity extends AppCompatActivity {

    Button goalActivity_button_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goals);


        init();
        click();
    }

    public void click() {
        goalActivity_button_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(goalsActivity.this,Main2Activity.class);
                startActivity(intent);
                customType(goalsActivity.this,"fadein-to-fadeout");
            }
        });
    }

    public void init() {

        goalActivity_button_next=(Button) findViewById(R.id.goalActivity_button_next);
    }
}
