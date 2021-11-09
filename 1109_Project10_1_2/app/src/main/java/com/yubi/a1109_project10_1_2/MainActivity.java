package com.yubi.a1109_project10_1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edtId = (EditText)findViewById(R.id.edtId);
        EditText edtPassword = (EditText)findViewById(R.id.editPassword);
        Button btnLogin = (Button)findViewById(R.id.btnInput);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), secondActivity.class);

                intent.putExtra("id", edtId.getText().toString());
                intent.putExtra("password", Integer.parseInt(edtPassword.getText().toString()));

                startActivity(intent);
            }
        });
    }
}
