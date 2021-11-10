package com.yubi.study;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);

        TextView tvId = (TextView)findViewById(R.id.tvId);
        TextView tvPassword = (TextView)findViewById(R.id.tvPassword);
        Button btnReturn = (Button)findViewById(R.id.btnReturn);

        Intent intent = getIntent();

        String idId = intent.getStringExtra("id");
        Integer idPwd = intent.getIntExtra("password", 0);

        tvId.setText(idId.toString());
        tvPassword.setText(idPwd.toString());

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}