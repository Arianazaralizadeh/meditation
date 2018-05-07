package com.example.aria_nazaralizadeh.meditation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.aria_nazaralizadeh.meditation.CustomIntent.customType;

public class CompleteProfileActivity extends AppCompatActivity {

    Button Activity_complete_profole_button_start;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete_profile);


        init();
        click();

    }

    public void click() {
        Activity_complete_profole_button_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(CompleteProfileActivity.this,goalsActivity.class);
                startActivity(intent);
                customType(CompleteProfileActivity.this,"fadein-to-fadeout");
            }
        });
    }

    public void init() {
        Activity_complete_profole_button_start=(Button)findViewById(R.id.Activity_complete_profole_button_start);
    }


}
