package com.yubi.testviewtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1;
        btn1 = findViewById(R.id.btn1);

//        MyListenerClass lis = new MyListenerClass();

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"클릭하셨네요",
                Toast.LENGTH_SHORT).show();
            }
        });
    }

//    class MyListenerClass implements View.OnClickListener{
//        @Override
//        public void onClick(View v) {
//            Toast.makeText(getApplicationContext(),"클릭하셨네요",
//            Toast.LENGTH_SHORT).show();
//        }
//    }





//    public void test(View view){
//        Toast.makeText(getApplicationContext(),"클릭하셨네요",
//            Toast.LENGTH_SHORT).show();
//    }


}