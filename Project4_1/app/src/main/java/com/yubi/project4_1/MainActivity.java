package com.yubi.project4_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText Edit1, Edit2;
    Button BtnAdd, BtnSub, BtnMul, BtnDiv;
    TextView TextResult;
    String num1, num2;
    Integer result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("초간단 계산기");

        Edit1 = (EditText)findViewById(R.id.Edit1);
        Edit2 = (EditText)findViewById(R.id.Edit2);

        BtnAdd = (Button)findViewById(R.id.BtnAdd);
        BtnSub = (Button)findViewById(R.id.BtnSub);
        BtnMul = (Button)findViewById(R.id.BtnMul);
        BtnDiv = (Button)findViewById(R.id.BtnDiv);

        TextResult = (TextView)findViewById(R.id.TextResult);

        BtnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Edit1.getText().toString();
                num2 = Edit2.getText().toString();
                result = Integer.parseInt(num1) + Integer.parseInt(num2);
                TextResult.setText("계산결과 : " + result.toString());
            }
        });

        BtnSub.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                num1 = Edit1.getText().toString();
                num2 = Edit2.getText().toString();
                result = Integer.parseInt(num1) - Integer.parseInt(num2);
                TextResult.setText("계산결과 : " + result.toString());
                return false;
            }
        });

        BtnMul.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                num1 = Edit1.getText().toString();
                num2 = Edit2.getText().toString();
                result = Integer.parseInt(num1) * Integer.parseInt(num2);
                TextResult.setText("계산결과 : " + result.toString());
                return false;
            }
        });

        BtnDiv.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                num1 = Edit1.getText().toString();
                num2 = Edit2.getText().toString();
                result = Integer.parseInt(num1) / Integer.parseInt(num2);
                TextResult.setText("계산결과 : " + result.toString());
                return false;
            }
        });
    }

}