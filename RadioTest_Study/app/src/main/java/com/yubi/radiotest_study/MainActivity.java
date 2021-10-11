package com.yubi.radiotest_study;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Switch chk;
    TextView text;
    RadioButton rdoPie, rdoQ, rdoR;
    RadioGroup rdoGroup;
    ImageView img;
    Button btnEnd, btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chk = (Switch)findViewById(R.id.swit);
        text = (TextView)findViewById(R.id.text);

        rdoGroup = (RadioGroup)findViewById(R.id.rdoGroup);
        rdoPie = (RadioButton)findViewById(R.id.rdoPie);
        rdoQ = (RadioButton)findViewById(R.id.rdoQ);
        rdoR = (RadioButton)findViewById(R.id.rdoR);
        img = (ImageView)findViewById(R.id.img);
        btnEnd = (Button)findViewById(R.id.btnEnd);
        btnReset = (Button)findViewById(R.id.btnReset);

        chk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (chk.isChecked()) {
                    text.setVisibility(View.VISIBLE);
                    rdoPie.setVisibility(View.VISIBLE);
                    rdoQ.setVisibility(View.VISIBLE);
                    rdoR.setVisibility(View.VISIBLE);
                    btnEnd.setVisibility(View.VISIBLE);
                    btnReset.setVisibility(View.VISIBLE);
                }else {
                    text.setVisibility(View.INVISIBLE);
                    rdoPie.setVisibility(View.INVISIBLE);
                    rdoQ.setVisibility(View.INVISIBLE);
                    rdoR.setVisibility(View.INVISIBLE);
                    img.setVisibility(View.INVISIBLE);
                    btnEnd.setVisibility(View.INVISIBLE);
                    btnReset.setVisibility(View.INVISIBLE);
                }
            }
        });

        View.OnClickListener radio_listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (rdoGroup.getCheckedRadioButtonId()){
                    case R.id.rdoPie:
                        img.setImageResource(R.drawable.pie);
                        break;
                    case R.id.rdoQ:
                        img.setImageResource(R.drawable.q10);
                        break;
                    case R.id.rdoR:
                        img.setImageResource(R.drawable.r11);
                        break;
                    default:
                        Toast.makeText(getApplicationContext(), "선택해주세요", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        };

        rdoPie.setOnClickListener(radio_listener);
        rdoQ.setOnClickListener(radio_listener);
        rdoR.setOnClickListener(radio_listener);

        btnEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chk.setChecked(false);
            }
        });


    }
}