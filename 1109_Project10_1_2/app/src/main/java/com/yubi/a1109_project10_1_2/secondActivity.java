package com.yubi.a1109_project10_1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView tvId = (TextView)findViewById(R.id.tvId);
        TextView tvPassword = (TextView)findViewById(R.id.tvPassword);

        Button btnReturn = (Button)findViewById(R.id.btnReturn);

        Intent intent = getIntent();
        String inId = intent.getStringExtra("id");
        Integer inPassword = intent.getIntExtra("password", 0);

        tvId.setText(inId.toString());
        tvPassword.setText(inPassword.toString());

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}