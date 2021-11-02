package com.yubi.ex1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout baseLayout;
    ImageView img;
    EditText edt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("이미지변경");

        img = (ImageView)findViewById(R.id.img);
        edt = (EditText)findViewById(R.id.edt);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater mInflater = getMenuInflater();
        mInflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onOptionsItemSelected(item);
        switch (item.getItemId()){
            case R.id.item45:
                img.setRotation(Integer.parseInt(edt.getText().toString()));
                return true;
            case R.id.itemDog:
                img.setImageResource(R.drawable.dog);
                return true;
            case R.id.itemCat:
                img.setImageResource(R.drawable.cat);
                return true;
            case R.id.itemRabbit:
                img.setImageResource(R.drawable.rabbit);
                return true;
        }
        return false;
    }
}





