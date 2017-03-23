# datepicker

##使用方法


```
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

```

TYTimePickerView有四种类型ALL, YEAR_MONTH_DAY, HOURS_MINS, MONTH_DAY_HOUR_MIN, YEAR_MONTH， 四种选择模式，年月日时分，年月日，时分，月日时分

```
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
```
TYSingleCheckWheel2 自定义Wheel的用法。
