package com.yubi.radiotest;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    TextView text1, text2;
    Switch chkAgree;
    RadioGroup rGroup1;
    RadioButton rdoPie, rdoQ, rdoR;
    Button finishBtn, resetBtn;
    ImageView imgPet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("안드로이드 사진 보기");

        text1 = (TextView)findViewById(R.id.Text1);
        chkAgree = (Switch)findViewById(R.id.ChkAgree);

        text2 = (TextView)findViewById(R.id.Text2);
        rGroup1 = (RadioGroup)findViewById(R.id.Rgroup1);
        rdoPie = (RadioButton)findViewById(R.id.RdoPie);
        rdoQ = (RadioButton)findViewById(R.id.RdoQ);
        rdoR = (RadioButton)findViewById(R.id.RdoR);

        finishBtn = (Button)findViewById(R.id.finishBtn);
        resetBtn = (Button)findViewById(R.id.resetBtn);
        imgPet = (ImageView)findViewById(R.id.ImgPet);


        chkAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (chkAgree.isChecked() == true){
                    text2.setVisibility(View.VISIBLE);
                    rGroup1.setVisibility(View.VISIBLE);
                    finishBtn.setVisibility(View.VISIBLE);
                    resetBtn.setVisibility(View.VISIBLE);
                    imgPet.setVisibility(View.VISIBLE);
                }else{
                    text2.setVisibility(View.INVISIBLE);
                    rGroup1.setVisibility(View.INVISIBLE);
                    finishBtn.setVisibility(View.INVISIBLE);
                    resetBtn.setVisibility(View.INVISIBLE);
                    imgPet.setVisibility(View.INVISIBLE);
                }
            }
        });

        View.OnClickListener radio_listener = new View.OnClickListener(){
            public void onClick(View arg0){
                switch (rGroup1.getCheckedRadioButtonId()){
                    case R.id.RdoPie:
                        imgPet.setImageResource(R.drawable.pie);
                        break;
                    case R.id.RdoQ:
                        imgPet.setImageResource(R.drawable.q10);
                        break;
                    case R.id.RdoR:
                        imgPet.setImageResource(R.drawable.r11);
                        break;
                    default:
                        Toast.makeText(getApplicationContext(),
                                "안드로이드를 먼저 선택하세요", Toast.LENGTH_SHORT).show();
                }
            }
        };

        rdoPie.setOnClickListener(radio_listener);
        rdoQ.setOnClickListener(radio_listener);
        rdoR.setOnClickListener(radio_listener);

        finishBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chkAgree.setChecked(false);
            }
        });

//        btnOK.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                switch (rGroup1.getCheckedRadioButtonId()){
//                    case R.id.RdoDog:
//                        imgPet.setImageResource(R.drawable.dog);
//                        break;
//                    case R.id.RdoCat:
//                        imgPet.setImageResource(R.drawable.cat);
//                        break;
//                    case R.id.RdoRabbit:
//                        imgPet.setImageResource(R.drawable.rabbit);
//                        break;
//                    default:
//                        Toast.makeText(getApplicationContext(), "동물 먼저 선택하세요",
//                                Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
    }
}