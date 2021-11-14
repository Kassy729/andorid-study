package com.yubi.a1701302_mini_project;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView image[] = new ImageView[9];
        Integer imageId[] = { R.id.coffee1, R.id.coffee2, R.id.coffee3, R.id.coffee4,
                                R.id.coffee5, R.id.coffee6, R.id.coffee7, R.id.coffee8, R.id.coffee9};

        final String coffeeName[] = {"에스프레소", "아메리카노", "카페라떼", "카라멜라떼", "모카라떼", "바닐라라떼",
                                        "헤이즐넛라떼", "핫초코", "민트초코칩프라페"};

        for(int i=0; i<imageId.length; i++){
            final int index;
            index = i;
            image[index] = (ImageView)findViewById(imageId[index]);
            image[index].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                    dlg.setTitle("주문창");
                    dlg.setIcon(R.drawable.ic_coffee);
                    dlg.setMessage("수량을 선택해 주세요");
                    dlg.setPositiveButton("주문", null);
                    dlg.setNegativeButton("취소", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Toast.makeText(getApplicationContext(), "주문을 취소합니다", Toast.LENGTH_SHORT).show();
                        }
                    });
                    dlg.show();
                    Toast.makeText(getApplicationContext(), coffeeName[index] + " 선택 했습니다", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}