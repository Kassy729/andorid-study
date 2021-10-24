package com.yubi.mini_calculator_study;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edt1, edt2;
    Button btnAdd, btnSub, btnMul, btnDiv;
    Button[]btnNum = new Button[10];
    Integer[]btnIds = {R.id.btn0, R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4, R.id.btn5, R.id.btn6,
                        R.id.btn7, R.id.btn8, R.id.btn9};
    TextView textResult;
    String num1, num2;
    Integer result;

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
        textResult = (TextView)findViewById(R.id.result);

        for(int i=0; i<btnIds.length; i++){
            btnNum[i] = (Button)findViewById(btnIds[i]);
        }

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = edt1.getText().toString();
                num2 = edt2.getText().toString();
                result = Integer.parseInt(num1) + Integer.parseInt(num2);
                textResult.setText("계산결과 : " + result.toString());
                return;
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = edt1.getText().toString();
                num2 = edt2.getText().toString();
                result = Integer.parseInt(num1) - Integer.parseInt(num2);
                textResult.setText("계산결과 : " + result.toString());
                return;
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = edt1.getText().toString();
                num2 = edt2.getText().toString();
                result = Integer.parseInt(num1) * Integer.parseInt(num2);
                textResult.setText("계산결과 : " + result.toString());
                return;
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = edt1.getText().toString();
                num2 = edt2.getText().toString();
                result = Integer.parseInt(num1) / Integer.parseInt(num2);
                textResult.setText("계산결과 : " + result.toString());
                return;
            }
        });

        for(int i=0; i<btnIds.length; i++){
            final int index;
            index = i;
            btnNum[index].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(edt1.isFocused() == false || edt2.isFocused() == false){
                        Toast.makeText(getApplicationContext(), "먼저 에디트를 지정해주세요", Toast.LENGTH_SHORT).show();
                    }else{
                        num1 = edt1.getText().toString() + btnNum[index].getText().toString();
                        num2 = edt2.getText().toString() + btnNum[index].getText().toString();
                        edt1.setText(num1);
                        edt2.setText(num2);
                    }
                }
            });
        }
    }
}