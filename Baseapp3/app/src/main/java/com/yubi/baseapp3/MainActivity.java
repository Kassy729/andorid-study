package com.yubi.baseapp3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn_yju, btn_call, btn_gal, btn_end;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_yju = (Button)findViewById(R.id.btn_yju);
        btn_call = (Button)findViewById(R.id.btn_call);
        btn_gal = (Button)findViewById(R.id.btn_gal);
        btn_end = (Button)findViewById(R.id.btn_end);

        btn_yju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://yju.ac.kr"));
                startActivity(mIntent);
            }
        });

        btn_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:/01097622513"));
                startActivity(mIntent);
            }
        });

        btn_gal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("content://media/internal/images/media"));
                startActivity(mIntent);
            }
        });

        btn_end.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}