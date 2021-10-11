package com.yubi.project4_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    CheckBox chk;
    RadioButton rdoOne, rdoAnd;
    Button btnOk;
    TextView text;
    ImageView img;
    RadioGroup rdoGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chk = (CheckBox)findViewById(R.id.chk);
        rdoOne = (RadioButton)findViewById(R.id.rdoOne);
        rdoAnd = (RadioButton)findViewById(R.id.rdoAnd);
        btnOk = (Button)findViewById(R.id.btnOk);
        text = (TextView)findViewById(R.id.text);
        img = (ImageView)findViewById(R.id.img);
        rdoGroup = (RadioGroup)findViewById(R.id.rdoGroup);

        chk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (chk.isChecked() == true){
                    text.setVisibility(View.VISIBLE);
                    rdoOne.setVisibility(View.VISIBLE);
                    rdoAnd.setVisibility(View.VISIBLE);
                    btnOk.setVisibility(View.VISIBLE);
                    img.setVisibility(View.VISIBLE);
                }else{
                    text.setVisibility(View.INVISIBLE);
                    rdoOne.setVisibility(View.INVISIBLE);
                    rdoAnd.setVisibility(View.INVISIBLE);
                    btnOk.setVisibility(View.INVISIBLE);
                    img.setVisibility(View.INVISIBLE);
                }
            }
        });

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (rdoGroup.getCheckedRadioButtonId()){
                    case R.id.rdoOne:
                        img.setImageResource(R.drawable.q10);
                        break;
                    case R.id.rdoAnd:
                        img.setImageResource(R.drawable.r11);
                        break;
                    default:
                        Toast.makeText(getApplicationContext(), "동물 먼저 선택하세요", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}