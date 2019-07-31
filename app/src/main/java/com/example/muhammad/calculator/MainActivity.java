package com.example.muhammad.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static android.R.id.message;

public class MainActivity extends AppCompatActivity {
 String y = "0";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void num1(View view) {
        y="1";
        displayText(y);
    }
    public void num2(View view) {
        y="2";
        displayText(y);
    }
    public void num3(View view) {
        y="3";
        displayText(y);
    }
    public void num4(View view) {
        y="4";
        displayText(y);
    }

    public void num5(View view) {
        y="5";
        displayText(y);
    }

    public void num6(View view) {
        y="6";
        displayText(y);
    }

    public void num7(View view) {
        y="7";
        displayText(y);
    }
    public void num8(View view) {
        y="8";
        displayText(y);
    }
    public void num9(View view) {
        y="9";
        displayText(y);
    }
    public void num0(View view) {
        y="0";
        displayText(y);
    }
    public void divid(View view) {
        y="/";
        displayText(y);
    }
    public void mult(View view) {
        y="*";
        displayText(y);
    }
    public void add(View view) {
        y="+";
        displayText(y);
    }
    public void sub(View view) {
        y="-";
        displayText(y);
    }
    public void equal(View view) {
        y="";
        displayText(y);
    }
    public void num22(View view) {
        y=".";
        displayText(y);
    }
    public void reset(View view) {
        y="";
        displayText(y);
    }


    private void displayText(String x) {
        TextView result = (TextView) findViewById(R.id.result);
        CharSequence output =result.getText();
        result.setText(output + x);
    }
}
