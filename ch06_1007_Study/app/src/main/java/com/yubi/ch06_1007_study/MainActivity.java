package com.yubi.ch06_1007_study;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[]items = {"황현종", "황도경", "김태현", "김현지", "김주리"};

        AutoCompleteTextView auto = (AutoCompleteTextView)findViewById(R.id.autoComplete);
        ArrayAdapter<String>adapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, items);
        auto.setAdapter(adapter);

        MultiAutoCompleteTextView mult = (MultiAutoCompleteTextView)findViewById(R.id.multiAutoComplete);
        MultiAutoCompleteTextView.CommaTokenizer token = new MultiAutoCompleteTextView.CommaTokenizer();
        mult.setTokenizer(token);
        mult.setAdapter(adapter);
    }
}