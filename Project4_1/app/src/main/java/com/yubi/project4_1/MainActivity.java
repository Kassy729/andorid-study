package com.yubi.project4_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText Edit1, Edit2;
    Button BtnAdd, BtnSub, BtnMul, BtnDiv, BtnDiv2;
    TextView TextResult;
    String num1, num2;
    Double result;

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
        BtnDiv2 = (Button)findViewById(R.id.BtnDiv2);

        TextResult = (TextView)findViewById(R.id.TextResult);


        BtnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Edit1.getText().toString();
                num2 = Edit2.getText().toString();
                if(num1.trim().equals("") || num2.trim().equals("")){
                    Toast.makeText(getApplicationContext(),
                            "입력 값이 비었습니다", Toast.LENGTH_SHORT).show();
                    return;
                }

                result = Double.parseDouble(num1) + Double.parseDouble(num2);

                TextResult.setText("계산결과 : " + result.toString());
            }
        });

        BtnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Edit1.getText().toString();
                num2 = Edit2.getText().toString();
                if(num1.trim().equals("") || num2.trim().equals("")){
                    Toast.makeText(getApplicationContext(),
                            "입력 값이 비었습니다", Toast.LENGTH_SHORT).show();
                    return;
                }
                result = Double.parseDouble(num1) - Double.parseDouble(num2);
                TextResult.setText("계산결과 : " + result.toString());
            }
        });

        BtnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Edit1.getText().toString();
                num2 = Edit2.getText().toString();
                if(num1.trim().equals("") || num2.trim().equals("")){
                    Toast.makeText(getApplicationContext(),
                            "입력 값이 비었습니다", Toast.LENGTH_SHORT).show();
                    return;
                }
                result = Double.parseDouble(num1) * Double.parseDouble(num2);
                TextResult.setText("계산결과 : " + result.toString());
            }
        });

        BtnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Edit1.getText().toString();
                num2 = Edit2.getText().toString();
                if(num1.trim().equals("") || num2.trim().equals("")){
                    Toast.makeText(getApplicationContext(),
                            "입력 값이 비었습니다", Toast.LENGTH_SHORT).show();
                    return;
                }else{
                    if(num2.trim().equals("0")){
                        Toast.makeText(getApplicationContext(),
                                "0으로 나눌수 없습니다!", Toast.LENGTH_SHORT).show();
                        return;
                    }else{
                        result = Double.parseDouble(num1) / Double.parseDouble(num2);
                        TextResult.setText("계산결과 : " + result.toString());
                    }
                }
            }
        });

        BtnDiv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Edit1.getText().toString();
                num2 = Edit2.getText().toString();
                if(num1.trim().equals("") || num2.trim().equals("")){
                    Toast.makeText(getApplicationContext(),
                            "입력 값이 비었습니다", Toast.LENGTH_SHORT).show();
                    return;
                }else{
                    if(num2.trim().equals("0")){
                        Toast.makeText(getApplicationContext(),
                                "0으로 나머지 값 안됩니다!", Toast.LENGTH_SHORT).show();
                        return;
                    }else{
                        result = Double.parseDouble(num1) % Double.parseDouble(num2);
                        TextResult.setText("계산결과 : " + result.toString());
                    }
                }
            }
        });
    }

}