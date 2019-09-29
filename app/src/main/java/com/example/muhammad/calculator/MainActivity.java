package com.example.muhammad.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import org.mariuszgromada.math.mxparser.*;


public class MainActivity extends AppCompatActivity {

    TextView tv;
    TextView resultTv;




    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.tv);
        resultTv = findViewById(R.id.result);

    }



    public void sqrt(View view) {

    }

    public void num1(View view) {
        WriteOnScreen("1");

    }
    public void num2(View view) {
        WriteOnScreen("2");


    }
    public void num3(View view) {
        WriteOnScreen("3");


    }
    public void num4(View view) {
        WriteOnScreen("4");


    }

    public void num5(View view) {
        WriteOnScreen("5");

    }

    public void num6(View view) {
        WriteOnScreen("6");


    }

    public void num7(View view) {
        WriteOnScreen("7");



    }
    public void num8(View view) {
        WriteOnScreen("8");


    }
    public void num9(View view) {
        WriteOnScreen("9");


    }
    public void num0(View view) {
        WriteOnScreen("0");


    }
    public void divid(View view) {
        WriteOnScreen("/");


    }
    public void mult(View view) {
        WriteOnScreen("*");


    }
    public void add(View view) {
        WriteOnScreen("+");


    }
    public void sub(View view) {
        WriteOnScreen("-");


    }
    public void equal(View view) {

        String expressioin  = tv.getText().toString();
        Expression e = new Expression(expressioin);

        String result = String.valueOf(e.calculate());

        resultTv.setText(result);

    }
    public void dot(View view) {
        WriteOnScreen(".");


    }
    public void reset(View view) {
        Reset();

    }

    void WriteOnScreen(String expression){
        String exp = tv.getText().toString();
        exp = exp + expression;
        tv.setText(exp);
    }

    void Reset (){
        tv.setText("");
        resultTv.setText("0");
    }
}
