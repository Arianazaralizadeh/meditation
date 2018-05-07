package com.example.aria_nazaralizadeh.meditation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.aria_nazaralizadeh.meditation.CustomIntent.customType;

public class RegisterActivity extends AppCompatActivity {

    Button RegisterActivity_button_start;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        init();

        click();
    }


    public void init(){
        RegisterActivity_button_start=(Button)findViewById(R.id.RegisterActivity_button_start);
    }


    public void click(){
        RegisterActivity_button_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(RegisterActivity.this,CompleteProfileActivity.class);
                startActivity(intent);
                customType(RegisterActivity.this,"fadein-to-fadeout");
            }
        });
    }

}
