package com.example.pranav.finalcalc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b5,b6,b7,b9,b10,b11,b12,b14;
    EditText edit;
    float i, j, c;
    String s,h,sb;
    char op;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.button1);
        b2=findViewById(R.id.button2);
        b3=findViewById(R.id.button3);
        b5=findViewById(R.id.button5);
        b6=findViewById(R.id.button6);
        b7=findViewById(R.id.button7);
        b9=findViewById(R.id.button9);
        b10=findViewById(R.id.button10);
        b11=findViewById(R.id.button11);
        b12=findViewById(R.id.button12);
        edit = findViewById(R.id.Text1);
    }

    public void one(View view) {

        s=edit.getText().toString();
        sb=b1.getText().toString();
        sb=b1.getText().toString();
        edit.setText(s+sb);

    }

    public void two(View view) {

        s=edit.getText().toString();
        sb=b2.getText().toString();
        edit.setText(s+sb);

    }

    public void three(View view) {

        s=edit.getText().toString();
        sb=b3.getText().toString();
        edit.setText(s+sb);

    }

    public void four(View view) {

        s=edit.getText().toString();
        sb=b5.getText().toString();
        edit.setText(s+sb);

    }

    public void five(View view) {

        s=edit.getText().toString();
        sb=b6.getText().toString();
        edit.setText(s+sb);

    }

    public void six(View view) {

        s=edit.getText().toString();
        sb=b7.getText().toString();
        edit.setText(s+sb);

    }

    public void seven(View view) {

        s=edit.getText().toString();
        sb=b9.getText().toString();
        edit.setText(s+sb);

    }

    public void eight(View view) {

        s=edit.getText().toString();
        sb=b10.getText().toString();
        edit.setText(s+sb);

    }

    public void nine(View view) {

        s=edit.getText().toString();
        sb=b11.getText().toString();
        edit.setText(s+sb);

    }

    public void zero(View view) {

        s=edit.getText().toString();
        sb=b14.getText().toString();
        edit.setText(s+sb);

    }

    public void reset(View view) {

        edit.setText("");

    }

    public void addition(View view) {

        h = edit.getText().toString();
        edit.setText("");
        op='+';
    }

    public void subtract(View view) {

        h= edit.getText().toString();
        edit.setText("");
        op='-';
    }

    public void multiply(View view) {

        h= edit.getText().toString();
        edit.setText("");
        op='*';

    }

    public void divide(View view) {

        h= edit.getText().toString();
        edit.setText("");
        op='/';

    }

    public void result(View view) {

        if (op == '+') {

            i=Float.parseFloat(h);
            j=Float.parseFloat(s+sb);
            c=i+j;
            edit.setText(c+"");

        } else if (op == '-') {

            i=Float.parseFloat(h);
            j=Float.parseFloat(s+sb);
            c=i-j;
            edit.setText(c+"");

        } else if (op == '*') {

            i=Float.parseFloat(h);
            j=Float.parseFloat(s+sb);
            c=i*j;
            edit.setText(c+"");

        } else if (op == '/') {

            i=Float.parseFloat(h);
            j=Float.parseFloat(s+sb);
            if (j==0){
                edit.setText("Error");
            }
            else
                c=i/j;
            edit.setText(c+"");

        }
    }
}
