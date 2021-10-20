package com.yubi.study;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.CheckBox;
import android.widget.Chronometer;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Chronometer chrono;
    RadioGroup rdoGroup;
    RadioButton rdoCal, rdoTime;
    CalendarView cal;
    TimePicker time;
    TextView tvYear, tvMonth, tvDay, tvHour, tvMinute;
    int selectYear, selectMonth, selectDay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chrono = (Chronometer)findViewById(R.id.chrono);
        rdoGroup = (RadioGroup)findViewById(R.id.rdoGroup);
        rdoCal = (RadioButton)findViewById(R.id.rdoCal);
        rdoTime = (RadioButton)findViewById(R.id.rdoTime);
        cal = (CalendarView)findViewById(R.id.cal);
        time = (TimePicker)findViewById(R.id.time);
        tvYear = (TextView)findViewById(R.id.textYear);
        tvMonth = (TextView)findViewById(R.id.textMonth);
        tvDay = (TextView)findViewById(R.id.textDay);
        tvHour = (TextView)findViewById(R.id.textHour);
        tvMinute = (TextView)findViewById(R.id.textMinute);

        rdoGroup.setVisibility(View.INVISIBLE);
        cal.setVisibility(View.INVISIBLE);
        time.setVisibility(View.INVISIBLE);

        chrono.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chrono.setBase(SystemClock.elapsedRealtime());
                chrono.start();
                chrono.setTextColor(Color.RED);
                rdoGroup.setVisibility(View.VISIBLE);
            }
        });

        rdoCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cal.setVisibility(View.VISIBLE);
                time.setVisibility(View.INVISIBLE);
            }
        });

        rdoTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                time.setVisibility(View.VISIBLE);
                cal.setVisibility(View.INVISIBLE);
            }
        });

        cal.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                selectYear = year;
                selectMonth = month+1;
                selectDay = dayOfMonth;
            }
        });

        tvYear.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                tvYear.setText(Integer.toString(selectYear));
                tvMonth.setText(Integer.toString(selectMonth));
                tvDay.setText(Integer.toString(selectDay));
                tvHour.setText(Integer.toString(time.getCurrentHour()));
                tvMinute.setText(Integer.toString(time.getCurrentMinute()));

                rdoGroup.setVisibility(View.INVISIBLE);
                cal.setVisibility(View.INVISIBLE);
                time.setVisibility(View.INVISIBLE);

                chrono.setTextColor(Color.BLUE);
                chrono.stop();
                return false;
            }
        });


    }
}