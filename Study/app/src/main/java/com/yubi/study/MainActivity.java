package com.yubi.study;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Switch swit;
    TextView text;
    RadioGroup rdoGroup;
    RadioButton rdoPie, rdoQ, rdoR;
    ImageView img;
    Button btnEnd, btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        swit = (Switch)findViewById(R.id.swit);
        text = (TextView)findViewById(R.id.text);
        rdoGroup = (RadioGroup)findViewById(R.id.rdoGroup);
        rdoPie = (RadioButton)findViewById(R.id.rdoPie);
        rdoQ = (RadioButton)findViewById(R.id.rdoQ);
        rdoR = (RadioButton)findViewById(R.id.rdoR);

        swit.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (swit.isChecked() == true){
                    text.setVisibility(View.VISIBLE);
                    rdoGroup.setVisibility(View.VISIBLE);
                    img.setVisibility(View.VISIBLE);
                    btnEnd.setVisibility(View.VISIBLE);
                    btnReset.setVisibility(View.VISIBLE);
                }else{
                    text.setVisibility(View.INVISIBLE);
                    rdoGroup.setVisibility(View.INVISIBLE);
                    img.setVisibility(View.INVISIBLE);
                    btnEnd.setVisibility(View.INVISIBLE);
                    btnReset.setVisibility(View.INVISIBLE);
                }

            }
        });

        btnEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (rdoGroup.getCheckedRadioButtonId()){
                    case rdoPie:
                        img.setImageResource(R.drawable.pie);
                        break;
                }
            }
        });


    }
}