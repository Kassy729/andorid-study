package com.yubi.a1102_ch08_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnRead, btnWrite;
        btnRead = (Button)findViewById(R.id.btnRead);
        btnWrite = (Button)findViewById(R.id.btnWrite);

        btnWrite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    FileOutputStream outFs = openFileOutput("file.txt", Context.MODE_PRIVATE);
                    String str = "황현종";
                    outFs.write(str.getBytes());
                    outFs.close();
                    Toast.makeText(getApplicationContext(), "file.txt가 생성됨", Toast.LENGTH_SHORT).show();
                }catch (IOException e){

                }
            }
        });
    }
}