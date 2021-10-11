package com.yubi.project4_1_study;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edt1, edt2;
    Button btnAdd, btnSub, btnMul, btnDiv, btnRest;
    String num1, num2;
    Double result;
    TextView res;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt1 = (EditText)findViewById(R.id.edt1);
        edt2 = (EditText)findViewById(R.id.edt2);
        btnAdd = (Button)findViewById(R.id.btnAdd);
        btnSub = (Button)findViewById(R.id.btnSub);
        btnMul = (Button)findViewById(R.id.btnMul);
        btnDiv = (Button)findViewById(R.id.btnDiv);
        btnRest = (Button)findViewById(R.id.btnRest);
        res = (TextView)findViewById(R.id.res);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = edt1.getText().toString();
                num2 = edt2.getText().toString();

                if (num1.trim().equals("") || num2.trim().equals("")){
                    Toast.makeText(getApplicationContext(),"입력값이 비었습니다", Toast.LENGTH_LONG).show();
                }

                result = Double.parseDouble(num1) + Double.parseDouble(num2);
                res.setText("계산결과 : " + result);
                return;

            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = edt1.getText().toString();
                num2 = edt2.getText().toString();

                if (num1.trim().equals("") || num2.trim().equals("")){
                    Toast.makeText(getApplicationContext(),"입력값이 비었습니다", Toast.LENGTH_LONG).show();
                }

                result = Double.parseDouble(num1) - Double.parseDouble(num2);
                res.setText("계산결과 : " + result);
                return;
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = edt1.getText().toString();
                num2 = edt2.getText().toString();

                if (num1.trim().equals("") || num2.trim().equals("")){
                    Toast.makeText(getApplicationContext(),"입력값이 비었습니다", Toast.LENGTH_LONG).show();
                }

                result = Double.parseDouble(num1) * Double.parseDouble(num2);
                res.setText("계산결과 : " + result);
                return;

            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = edt1.getText().toString();
                num2 = edt2.getText().toString();

                if (num1.trim().equals("") || num2.trim().equals("")) {
                    Toast.makeText(getApplicationContext(), "입력값이 비었습니다", Toast.LENGTH_LONG).show();
                    return;
                }else{
                    if (num2.trim().equals("0")){
                        Toast.makeText(getApplicationContext(), "0으로는 나눌수 없습니다", Toast.LENGTH_LONG).show();
                        return;
                    }else{
                        result = Double.parseDouble(num1) / Double.parseDouble(num2);
                        res.setText("계산결과 : " + result);
                        return;
                    }
                }
            }
        });

        btnRest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = edt1.getText().toString();
                num2 = edt2.getText().toString();

                if (num1.trim().equals("") || num2.trim().equals("")){
                    Toast.makeText(getApplicationContext(),"입력값이 비었습니다", Toast.LENGTH_LONG).show();
                    return;
                }else{
                    if (num2.trim().equals("0")) {
                        Toast.makeText(getApplicationContext(), "0으로는 나눌수 없습니다", Toast.LENGTH_LONG).show();
                        return;
                    }else{
                        result = Double.parseDouble(num1) % Double.parseDouble(num2);
                        res.setText("계산결과 : " + result);
                        return;
                    }
                }
            }
        });
    }
}