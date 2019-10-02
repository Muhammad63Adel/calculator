package com.example.muhammad.calculator;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class start extends AppCompatActivity {
    TextView name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //Remove title bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_start);

        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/free2.otf");
        name = findViewById(R.id.text);
        name.setTypeface(tf);

        new Timer().schedule(new TimerTask(){
            public void run() {
                startActivity(new Intent(start.this, MainActivity.class));
                finish();

            }
        }, 1500 );
    }
}
