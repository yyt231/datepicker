package com.bigademo.datetimepicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.bigademo.datetimepicker.wheel.view.TYSingleCheckWheel2;
import com.bigademo.datetimepicker.wheel.view.TYTimePickerView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    TextView tvTitle, tvProvice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTitle= (TextView) findViewById(R.id.tvTitle);
        tvProvice= (TextView) findViewById(R.id.tv_provice);
        tvTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectDate();
            }
        });

        tvProvice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectPayTypes();
            }
        });
    }

    private void selectDate(){
            TYTimePickerView time = new TYTimePickerView(MainActivity.this, TYTimePickerView.Type.YEAR_MONTH_DAY);
            time.setTime(new Date());
            time.setCancelable(true);
            time.setOnTimeSelectListener(new TYTimePickerView.OnTimeSelectListener() {
                @Override
                public void onTimeSelect(Date date) {
                    SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
                    tvTitle.setText(dateFormatter.format(date));
                }
            });
            time.show();
    }

    //选择缴费类型
    private void selectPayTypes() {
        final List<String> list = new ArrayList<>();
        list.add("趸交");
        list.add("期交");

        final TYSingleCheckWheel2 singleCheckWheel2 = new TYSingleCheckWheel2(this);
        singleCheckWheel2.setData(list);
        singleCheckWheel2.show();
        singleCheckWheel2.setJobSelectListener2(new TYSingleCheckWheel2.OnJobSelectListener2() {
            @Override
            public void onJobSelect(int index) {
                tvProvice.setText(list.get(index));


            }
        });
    }


}
