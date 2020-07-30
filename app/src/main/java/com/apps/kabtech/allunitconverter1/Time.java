package com.apps.kabtech.allunitconverter1;


import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.apptracker.android.track.AppTracker;

import java.text.DecimalFormat;

public class Time extends AppCompatActivity {
    private ActionBar actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(Constant.theme);
        setContentView(R.layout.activity_time);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        actionBar = getSupportActionBar();
        actionBar.setTitle("Time");

        if(savedInstanceState == null) {
            // Initialize Leadbolt SDK with your api key
            AppTracker.startSession(getApplicationContext(), "s0QoNt6vk2jG68pCHAnrWvu1q1NqvWKz", true);

            //AppTracker.loadModuleToCache(getApplicationContext(), "inapp");



        }

        AppTracker.loadModule(getApplicationContext(), "inapp");


        WebView leadBoltAd = findViewById(R.id.leadBoltBanner);
        String leadBoltAdHtmlString = "<script type=\"text/javascript\" src=\"http://ad.leadbolt.net/show_app_ad.js?section_id=762478312\"></script>";
        leadBoltAd.getSettings().setJavaScriptEnabled(true);
        leadBoltAd.loadData(leadBoltAdHtmlString,"text/html","utf-8");




        TextView edit = (TextView)findViewById(R.id.distance_editText);
        edit.setTextColor(Constant.color);
        TextView view = (TextView)findViewById(R.id.distance_textView);
        view.setTextColor(Constant.color);

        LinearLayout cont1 = (LinearLayout) findViewById(R.id.content1);
        LinearLayout cont2 = (LinearLayout) findViewById(R.id.content2);
        cont1.setBackgroundColor(Constant.color);
        cont2.setBackgroundColor(Constant.color);



        Button clear_but = (Button) findViewById(R.id.clear_button);
        clear_but.setDrawingCacheBackgroundColor(Constant.color);
        Button clear_buttext = (Button) findViewById(R.id.clear_button);
        clear_buttext.setTextColor(Constant.color);


        Button cal_but = (Button) findViewById(R.id.calulate_button);
        cal_but.setDrawingCacheBackgroundColor(Constant.color);
        Button cal_buttext = (Button) findViewById(R.id.calulate_button);
        cal_buttext.setTextColor(Constant.color);
    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
    public void Calculate_time(View view){
        DecimalFormat textformat = new DecimalFormat("###,###,###,###,###,###.############");
        try{
            EditText text = (EditText) findViewById(R.id.distance_editText);
            TextView tview = (TextView)findViewById(R.id.distance_textView);
            // this is if we press the cancel button
            if(view.getId() == R.id.clear_button){
                text.setText("");tview.setText("");
                // this is if we press the convert button
            }else if (view.getId() == R.id.calulate_button){
                RadioButton millisecond = (RadioButton)findViewById(R.id.millisecond_radio);
                RadioButton millisecond2 = (RadioButton)findViewById(R.id.millisecond_radio2);
                RadioButton second = (RadioButton)findViewById(R.id.second_radio);
                RadioButton second2 = (RadioButton)findViewById(R.id.second_radio2);
                RadioButton minute = (RadioButton)findViewById(R.id.minute_radio);
                RadioButton minute2 = (RadioButton)findViewById(R.id.minute_radio2);
                RadioButton hour = (RadioButton)findViewById(R.id.hour_radio);
                RadioButton hour2 = (RadioButton)findViewById(R.id.hour_radio2);
                RadioButton day = (RadioButton)findViewById(R.id.day_radio);
                RadioButton day2 = (RadioButton)findViewById(R.id.day_radio2);
                RadioButton week = (RadioButton)findViewById(R.id.week_radio);
                RadioButton week2 = (RadioButton)findViewById(R.id.week_radio2);
                RadioButton month = (RadioButton) findViewById(R.id.month_radio);
                RadioButton month2 = (RadioButton) findViewById(R.id.month_radio2);
                RadioButton year = (RadioButton) findViewById(R.id.year_radio);
                RadioButton year2 = (RadioButton) findViewById(R.id.year_radio2);




                // this is if our text is empty
                if (text.getText().length()== 0){
                    Toast.makeText(this, "Please enter a valid number",
                            Toast.LENGTH_LONG ).show();
                    return;
                }else if (millisecond.isChecked()&&millisecond2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" + " ms");
                } else if (second.isChecked()&&second2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +" s");
                } else if (minute.isChecked()&&minute2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +" min");
                }else if (hour.isChecked()&&hour2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +" h");
                }else if (day.isChecked()&&day2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +" d");
                }else if (week.isChecked()&&week2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +" wk");
                }else if (month.isChecked()&&month2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +" mon");
                }else if (year.isChecked()&&year2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +" y ");
                }






                // if millisecond and other radio button is click in second scroll

                else if (millisecond.isChecked()&&second2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(time_converter.millisecond_tosecond(value))) + "\t s" );
                }else if (millisecond.isChecked()&&minute2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(time_converter.millisecond_tominute(value))) + "\t min");
                }else if (millisecond.isChecked()&&hour2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(time_converter.millisecond_tohour(value))) + "\t h");
                }else if (millisecond.isChecked()&&day2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(time_converter.millisecond_today(value))) + "\t d");
                }else if (millisecond.isChecked()&&week2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(time_converter.millisecond_toweek(value))) + "\t w");
                }else if (millisecond.isChecked()&&month2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(time_converter.millisecond_tomonth(value))) + "\t mon");
                }else if (millisecond.isChecked()&&year2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(time_converter.millisecond_toyear(value))) + "\t y");
                }






                // if second and other radio button is click in second scroll

                else if (second.isChecked()&&millisecond2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(time_converter.second_tomillisecond(value))) + "\t ms" );
                }else if (second.isChecked()&&minute2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(time_converter.second_tominute(value))) + "\t min");
                }else if (second.isChecked()&&hour2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(time_converter.second_tohour(value))) + "\t h");
                }else if (second.isChecked()&&day2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(time_converter.second_today(value))) + "\t d");
                }else if (second.isChecked()&&week2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(time_converter.second_toweek(value))) + "\t w");
                }else if (second.isChecked()&&month2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(time_converter.second_tomonth(value))) + "\t mon");
                }else if (second.isChecked()&&year2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(time_converter.second_toyear(value))) + "\t y");
                }





                // if minute and other radio button is click in second scroll

                else if (minute.isChecked()&&millisecond2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(time_converter.minute_tomillisecon(value))) + "\t ms" );
                }else if (minute.isChecked()&&second2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(time_converter.minute_tosecond(value))) + "\t s");
                }else if (minute.isChecked()&&hour2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(time_converter.minute_tohour(value))) + "\t h");
                }else if (minute.isChecked()&&day2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(time_converter.minute_today(value))) + "\t d");
                }else if (minute.isChecked()&&week2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(time_converter.minute_toweek(value))) + "\t w");
                }else if (minute.isChecked()&&month2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(time_converter.minute_tomonth(value))) + "\t mon");
                }else if (minute.isChecked()&&year2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(time_converter.minute_toyear(value))) + "\t y");
                }






                // if hour and other radio button is click in second scroll

                else if (hour.isChecked()&&millisecond2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(time_converter.hour_tomillisecon(value))) + "\t ms" );
                }else if (hour.isChecked()&&second2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(time_converter.hour_tosecond(value))) + "\t s");
                }else if (hour.isChecked()&&minute2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(time_converter.hour_tominute(value))) + "\t m");
                }else if (hour.isChecked()&&day2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(time_converter.hour_today(value))) + "\t d");
                }else if (hour.isChecked()&&week2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(time_converter.hour_toweek(value))) + "\t w");
                }else if (hour.isChecked()&&month2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(time_converter.hour_tomonth(value))) + "\t mon");
                }else if (hour.isChecked()&&year2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(time_converter.hour_toyear(value))) + "\t y");
                }









                // if day and other radio button is click in second scroll

                else if (day.isChecked()&&millisecond2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(time_converter.day_tomillisecon(value))) + "\t ms" );
                }else if (day.isChecked()&&second2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(time_converter.day_tosecond(value))) + "\t s");
                }else if (day.isChecked()&&minute2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(time_converter.day_tominute(value))) + "\t min");
                }else if (day.isChecked()&&hour2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(time_converter.day_tohour(value))) + "\t h");
                }else if (day.isChecked()&&week2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(time_converter.day_toweek(value))) + "\t w");
                }else if (day.isChecked()&&month2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(time_converter.day_tomonth(value))) + "\t mon");
                }else if (day.isChecked()&&year2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(time_converter.day_toyear(value))) + "\t y");
                }








                // if week and other radio button is click in second scroll

                else if (week.isChecked()&&millisecond2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(time_converter.week_tomillisecon(value))) + "\t ms" );
                }else if (week.isChecked()&&second2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(time_converter.week_tosecond(value))) + "\t s");
                }else if (week.isChecked()&&minute2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(time_converter.week_tominute(value))) + "\t min");
                }else if (week.isChecked()&&hour2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(time_converter.week_tohour(value))) + "\t h");
                }else if (week.isChecked()&&day2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(time_converter.week_today(value))) + "\t d");
                }else if (week.isChecked()&&month2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(time_converter.week_tomonth(value))) + "\t mon");
                }else if (week.isChecked()&&year2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(time_converter.week_toyear(value))) + "\t y");
                }








                // if month and other radio button is click in second scroll

                else if (month.isChecked()&&millisecond2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(time_converter.month_tomillisecon(value))) + "\t ms" );
                }else if (month.isChecked()&&second2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(time_converter.month_tosecond(value))) + "\t s");
                }else if (month.isChecked()&&minute2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(time_converter.month_tominute(value))) + "\t min");
                }else if (month.isChecked()&&hour2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(time_converter.month_tohour(value))) + "\t h");
                }else if (month.isChecked()&&day2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(time_converter.month_today(value))) + "\t d");
                }else if (month.isChecked()&&week2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(time_converter.month_toweek(value))) + "\t w");
                }else if (month.isChecked()&&year2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(time_converter.month_toyear(value))) + "\t y");
                }






                // if year and other radio button is click in second scroll

                else if (year.isChecked()&&millisecond2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(time_converter.year_tomillisecon(value))) + "\t ms" );
                }else if (year.isChecked()&&second2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(time_converter.year_tosecond(value))) + "\t s");
                }else if (year.isChecked()&&minute2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(time_converter.year_tominute(value))) + "\t min");
                }else if (year.isChecked()&&hour2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(time_converter.year_tohour(value))) + "\t h");
                }else if (year.isChecked()&&day2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(time_converter.year_today(value))) + "\t d");
                }else if (year.isChecked()&&week2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(time_converter.year_toweek(value))) + "\t w");
                }else if (year.isChecked()&&month2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(time_converter.year_tomonth(value))) + "\t mon");
                }













            }


        }catch (Exception e){

        }
    }
}
