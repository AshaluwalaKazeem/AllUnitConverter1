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

public class Speed extends AppCompatActivity {
    private ActionBar actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(Constant.theme);
        setContentView(R.layout.activity_speed);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        actionBar = getSupportActionBar();
        actionBar.setTitle("Speed");


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
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

    public void Calculate_speed(View view){
        DecimalFormat textformat = new DecimalFormat("###,###,###,###,###,###.############");
        try{
            EditText text = (EditText) findViewById(R.id.distance_editText);
            TextView tview = (TextView)findViewById(R.id.distance_textView);
            // this is if we press the cancel button
            if(view.getId() == R.id.clear_button){
                text.setText("");tview.setText("");
                // this is if we press the convert button
            }else if (view.getId() == R.id.calulate_button){
                RadioButton meter_second = (RadioButton)findViewById(R.id.meter_second_radio);
                RadioButton meter_second2 = (RadioButton)findViewById(R.id.meter_second_radio2);
                RadioButton meter_minute = (RadioButton)findViewById(R.id.meter_minute_radio);
                RadioButton meter_minute2 = (RadioButton)findViewById(R.id.meter_minute_radio2);
                RadioButton meter_hour = (RadioButton)findViewById(R.id.meter_hour_radio);
                RadioButton meter_hour2 = (RadioButton)findViewById(R.id.meter_hour_radio22);
                RadioButton foot_second = (RadioButton)findViewById(R.id.foot_second_radio);
                RadioButton foot_second2 = (RadioButton)findViewById(R.id.foot_second_radio2);
                RadioButton foot_minute = (RadioButton)findViewById(R.id.foot_minute_radio);
                RadioButton foot_minute2 = (RadioButton)findViewById(R.id.foot_minute_radio2);
                RadioButton kilometer_minute = (RadioButton)findViewById(R.id.kilometer_minute_radio);
                RadioButton kilometer_minute2 = (RadioButton)findViewById(R.id.kilometer_minute_radio2);
                RadioButton kilometer_hour = (RadioButton)findViewById(R.id.kilometer_hour_radio);
                RadioButton kilometer_hour2 = (RadioButton)findViewById(R.id.kilometer_hour_radio2);
                RadioButton mile_hour = (RadioButton)findViewById(R.id.mile_hour);
                RadioButton mile_hour2 = (RadioButton)findViewById(R.id.mile_hour2);
                RadioButton knot = (RadioButton)findViewById(R.id.knot_radio);
                RadioButton knot2 = (RadioButton)findViewById(R.id.knot_radio2);
                RadioButton mach = (RadioButton)findViewById(R.id.mach_radio);
                RadioButton mach2 = (RadioButton)findViewById(R.id.mach_radio2);
                RadioButton light_speed = (RadioButton)findViewById(R.id.light_speed_radio);
                RadioButton light_speed2 = (RadioButton)findViewById(R.id.light_speed_radio2);





                // this is if our text is empty
                if (text.getText().length()== 0){
                    Toast.makeText(this, "Please enter a valid number",
                            Toast.LENGTH_LONG ).show();
                    return;
                }else if (meter_second.isChecked()&&meter_second2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" + " m/s");
                } else if (meter_minute.isChecked()&&meter_minute2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +" m/min");
                } else if (meter_hour.isChecked()&&meter_hour2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +" m/h");
                }else if (foot_second.isChecked()&&foot_second2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" + " ft/s");
                } else if (foot_minute.isChecked()&&foot_minute2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +" ft/min");
                } else if (kilometer_minute.isChecked()&&kilometer_minute2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +" km/min");
                }else if (kilometer_hour.isChecked()&&kilometer_hour2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" + " km/h");
                } else if (mile_hour.isChecked()&&mile_hour2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +" mi/h");
                } else if (knot.isChecked()&&knot2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +" kt");
                }else if (mach.isChecked()&&mach2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" + " Ma");
                } else if (light_speed.isChecked()&&light_speed2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +" c");
                }






                // if meter_second and other radio button is click in second scroll

                else if (meter_second.isChecked()&&meter_minute2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.meter_second_tometer_minute(value))) + "\t m/min" );
                }else if (meter_second.isChecked()&&meter_hour2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.meter_second_tometer_hour(value))) + "\t m/h");
                }else if (meter_second.isChecked()&&foot_second2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.meter_second_tofoot_second(value))) + "\t ft/s" );
                }else if (meter_second.isChecked()&&foot_minute2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.meter_second_tofoot_minute(value))) + "\t ft/min");
                }else if (meter_second.isChecked()&&kilometer_minute2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.meter_second_tokilometer_minute(value))) + "\t km/min" );
                }else if (meter_second.isChecked()&&kilometer_hour2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.meter_second_tokilometer_hour(value))) + "\t km/h");
                }else if (meter_second.isChecked()&&mile_hour2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.meter_second_tomile_hour(value))) + "\t mi/h" );
                }else if (meter_second.isChecked()&&knot2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.meter_second_toknot(value))) + "\t kt");
                }else if (meter_second.isChecked()&&mach2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.meter_second_tomach(value))) + "\t Ma");
                }else if (meter_second.isChecked()&&light_speed2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.meter_second_tolight_speed(value))) + "\t c");
                }






                // if meter_minute and other radio button is click in second scroll

                else if (meter_minute.isChecked()&&meter_second2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.meter_minute_tometer_second(value))) + "\t m/s" );
                }else if (meter_minute.isChecked()&&meter_hour.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.meter_minute_tometer_hour(value))) + "\t m/h");
                }else if (meter_minute.isChecked()&&foot_second2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.meter_minute_tofoot_second(value))) + "\t ft/s" );
                }else if (meter_minute.isChecked()&&foot_minute2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.meter_minute_tofoot_minute(value))) + "\t ft/min");
                }else if (meter_minute.isChecked()&&kilometer_minute2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.meter_minute_tokilometer_minute(value))) + "\t km/min" );
                }else if (meter_minute.isChecked()&&kilometer_hour2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.meter_minute_tokilometer_hour(value))) + "\t km/h");
                }else if (meter_minute.isChecked()&&mile_hour2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.meter_minute_tomile_hour(value))) + "\t mi/h" );
                }else if (meter_minute.isChecked()&&knot2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.meter_minute_toknot(value))) + "\t kt");
                }else if (meter_minute.isChecked()&&mach2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.meter_minute_tomach(value))) + "\t Ma");
                }else if (meter_minute.isChecked()&&light_speed2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.meter_minute_tolight_speed(value))) + "\t c");
                }









                // if meter_hour and other radio button is click in second scroll

                else if (meter_hour.isChecked()&&meter_second2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.meter_hour_tometer_second(value))) + "\t m/s" );
                }else if (meter_hour.isChecked()&&meter_minute2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.meter_hour_tometer_minute(value))) + "\t m/min");
                }else if (meter_hour.isChecked()&&foot_second2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.meter_hour_tofoot_second(value))) + "\t ft/s" );
                }else if (meter_hour.isChecked()&&foot_minute2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.meter_hour_tofoot_minute(value))) + "\t ft/min");
                }else if (meter_hour.isChecked()&&kilometer_minute2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.meter_hour_tokilometer_minute(value))) + "\t km/min" );
                }else if (meter_hour.isChecked()&&kilometer_hour2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.meter_hour_tokilometer_hour(value))) + "\t km/h");
                }else if (meter_hour.isChecked()&&mile_hour2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.meter_hour_tomile_hour(value))) + "\t mi/h" );
                }else if (meter_hour.isChecked()&&knot2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.meter_hour_toknot(value))) + "\t kt");
                }else if (meter_hour.isChecked()&&mach2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.meter_hour_tomach(value))) + "\t Ma");
                }else if (meter_hour.isChecked()&&light_speed2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.meter_hour_tolight_speed(value))) + "\t c");
                }







                // if foot_second and other radio button is click in second scroll

                else if (foot_second.isChecked()&&meter_second2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.foot_second_tometer_second(value))) + "\t m/s" );
                }else if (foot_second.isChecked()&&meter_minute2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.foot_second_tometer_minute(value))) + "\t m/min");
                }else if (foot_second.isChecked()&&meter_hour2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.foot_second_tometer_hour(value))) + "\t m/h" );
                }else if (foot_second.isChecked()&&foot_minute2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.foot_second_tofoot_minute(value))) + "\t ft/min");
                }else if (foot_second.isChecked()&&kilometer_minute2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.foot_second_tokilometer_minute(value))) + "\t km/min" );
                }else if (foot_second.isChecked()&&kilometer_hour2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.foot_second_tokilometer_hour(value))) + "\t km/h");
                }else if (foot_second.isChecked()&&mile_hour2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.foot_second_tomile_hour(value))) + "\t mi/h" );
                }else if (foot_second.isChecked()&&knot2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.foot_second_toknot(value))) + "\t kt");
                }else if (foot_second.isChecked()&&mach2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.foot_second_tomach(value))) + "\t Ma");
                }else if (foot_second.isChecked()&&light_speed2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.foot_second_tolight_speed(value))) + "\t c");
                }







                // if foot_minute and other radio button is click in second scroll

                else if (foot_minute.isChecked()&&meter_second2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.foot_minute_tometer_second(value))) + "\t m/s" );
                }else if (foot_minute.isChecked()&&meter_minute2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.foot_minute_tometer_minute(value))) + "\t m/min");
                }else if (foot_minute.isChecked()&&meter_hour2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.foot_minute_tometer_hour(value))) + "\t m/h" );
                }else if (foot_minute.isChecked()&&foot_second2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.foot_minute_tofoot_second(value))) + "\t ft/s");
                }else if (foot_minute.isChecked()&&kilometer_minute2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.foot_minute_tokilometer_minute(value))) + "\t km/min" );
                }else if (foot_minute.isChecked()&&kilometer_hour2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.foot_minute_tokilometer_hour(value))) + "\t km/h");
                }else if (foot_minute.isChecked()&&mile_hour2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.foot_minute_tomile_hour(value))) + "\t mi/h" );
                }else if (foot_minute.isChecked()&&knot2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.foot_minute_toknot(value))) + "\t kt");
                }else if (foot_minute.isChecked()&&mach2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.foot_minute_tomach(value))) + "\t Ma");
                }else if (foot_minute.isChecked()&&light_speed2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.foot_minute_tolight_speed(value))) + "\t c");
                }






                // if kilometer_minute and other radio button is click in second scroll

                else if (kilometer_minute.isChecked()&&meter_second2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.kilometer_minute_tometer_second(value))) + "\t m/s" );
                }else if (kilometer_minute.isChecked()&&meter_minute2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.kilometer_minute_tometer_minute(value))) + "\t m/min");
                }else if (kilometer_minute.isChecked()&&meter_hour2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.kilometer_minute_tometer_hour(value))) + "\t m/h" );
                }else if (kilometer_minute.isChecked()&&foot_second2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.kilometer_minute_tofoot_second(value))) + "\t ft/s");
                }else if (kilometer_minute.isChecked()&&foot_minute2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.kilometer_minute_tofoot_minute(value))) + "\t ft/min" );
                }else if (kilometer_minute.isChecked()&&kilometer_hour2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.kilometer_minute_tokilometer_hour(value))) + "\t km/h");
                }else if (kilometer_minute.isChecked()&&mile_hour2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.kilometer_minute_tomile_hour(value))) + "\t mi/h" );
                }else if (kilometer_minute.isChecked()&&knot2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.kilometer_minute_toknot(value))) + "\t kt");
                }else if (kilometer_minute.isChecked()&&mach2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.kilometer_minute_tomach(value))) + "\t Ma");
                }else if (kilometer_minute.isChecked()&&light_speed2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.kilometer_minute_tolight_speed(value))) + "\t c");
                }






                // if kilometer_hour and other radio button is click in second scroll

                else if (kilometer_hour.isChecked()&&meter_second2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.kilometer_hour_tometer_second(value))) + "\t m/s" );
                }else if (kilometer_hour.isChecked()&&meter_minute2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.kilometer_hour_tometer_minute(value))) + "\t m/min");
                }else if (kilometer_hour.isChecked()&&meter_hour2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.kilometer_hour_tometer_hour(value))) + "\t m/h" );
                }else if (kilometer_hour.isChecked()&&foot_second2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.kilometer_hour_tofoot_second(value))) + "\t ft/s");
                }else if (kilometer_hour.isChecked()&&foot_minute2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.kilometer_hour_tofoot_minute(value))) + "\t ft/min" );
                }else if (kilometer_hour.isChecked()&&kilometer_minute2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.kilometer_hour_tokilometer_minute(value))) + "\t km/s");
                }else if (kilometer_hour.isChecked()&&mile_hour2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.kilometer_hour_tomile_hour(value))) + "\t mi/h" );
                }else if (kilometer_hour.isChecked()&&knot2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.kilometer_hour_toknot(value))) + "\t kt");
                }else if (kilometer_hour.isChecked()&&mach2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.kilometer_hour_tomach(value))) + "\t Ma");
                }else if (kilometer_hour.isChecked()&&light_speed2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.kilometer_hour_tolight_speed(value))) + "\t c");
                }







                // if mile_hour and other radio button is click in second scroll

                else if (mile_hour.isChecked()&&meter_second2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.mile_hour_tometer_second(value))) + "\t m/s" );
                }else if (mile_hour.isChecked()&&meter_minute2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.mile_hour_tometer_minute(value))) + "\t m/min");
                }else if (mile_hour.isChecked()&&meter_hour2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.mile_hour_tometer_hour(value))) + "\t m/h" );
                }else if (mile_hour.isChecked()&&foot_second2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.mile_hour_tofoot_second(value))) + "\t ft/s");
                }else if (mile_hour.isChecked()&&foot_minute2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.mile_hour_tofoot_minute(value))) + "\t ft/min" );
                }else if (mile_hour.isChecked()&&kilometer_minute2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.mile_hour_tokilometer_minute(value))) + "\t km/s");
                }else if (mile_hour.isChecked()&&kilometer_hour2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.mile_hour_tokilometer_hour(value))) + "\t km/h" );
                }else if (mile_hour.isChecked()&&knot2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.mile_hour_toknot(value))) + "\t kt");
                }else if (mile_hour.isChecked()&&mach2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.mile_hour_tomach(value))) + "\t Ma");
                }else if (mile_hour.isChecked()&&light_speed2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.mile_hour_tolight_speed(value))) + "\t c");
                }







                // if knot and other radio button is click in second scroll

                else if (knot.isChecked()&&meter_second2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.knot_tometer_second(value))) + "\t m/s" );
                }else if (knot.isChecked()&&meter_minute2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.knot_tometer_minute(value))) + "\t m/min");
                }else if (knot.isChecked()&&meter_hour2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.knot_tometer_hour(value))) + "\t m/h" );
                }else if (knot.isChecked()&&foot_second2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.knot_tofoot_second(value))) + "\t ft/s");
                }else if (knot.isChecked()&&foot_minute2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.knot_tofoot_minute(value))) + "\t ft/min" );
                }else if (knot.isChecked()&&kilometer_minute2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.knot_tokilometer_minute(value))) + "\t km/s");
                }else if (knot.isChecked()&&kilometer_hour2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.knot_tokilometer_hour(value))) + "\t km/h" );
                }else if (knot.isChecked()&&mile_hour2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.knot_tomile_hour(value))) + "\t m/h");
                }else if (knot.isChecked()&&mach2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.knot_tomach(value))) + "\t Ma");
                }else if (knot.isChecked()&&light_speed2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.knot_tolight_speed(value))) + "\t c");
                }






                // if mach and other radio button is click in second scroll

                else if (mach.isChecked()&&meter_second2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.mach_tometer_second(value))) + "\t m/s" );
                }else if (mach.isChecked()&&meter_minute2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.mach_tometer_minute(value))) + "\t m/min");
                }else if (mach.isChecked()&&meter_hour2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.mach_tometer_hour(value))) + "\t m/h" );
                }else if (mach.isChecked()&&foot_second2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.mach_tofoot_second(value))) + "\t ft/s");
                }else if (mach.isChecked()&&foot_minute2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.mach_tofoot_minute(value))) + "\t ft/min" );
                }else if (mach.isChecked()&&kilometer_minute2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.mach_tokilometer_minute(value))) + "\t km/s");
                }else if (mach.isChecked()&&kilometer_hour2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.mach_tokilometer_hour(value))) + "\t km/h" );
                }else if (mach.isChecked()&&mile_hour2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.mach_tomile_hour(value))) + "\t m/h");
                }else if (mach.isChecked()&&knot2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.mach_toknot(value))) + "\t kt");
                }else if (mach.isChecked()&&light_speed2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.mach_tolight_speed(value))) + "\t c");
                }










                // if light_speed and other radio button is click in second scroll

                else if (light_speed.isChecked()&&meter_second2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.light_speed_tometer_second(value))) + "\t m/s" );
                }else if (light_speed.isChecked()&&meter_minute2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.light_speed_tometer_minute(value))) + "\t m/min");
                }else if (light_speed.isChecked()&&meter_hour2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.light_speed_tometer_hour(value))) + "\t m/h" );
                }else if (light_speed.isChecked()&&foot_second2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.light_speed_tofoot_second(value))) + "\t ft/s");
                }else if (light_speed.isChecked()&&foot_minute2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.light_speed_tofoot_minute(value))) + "\t ft/min" );
                }else if (light_speed.isChecked()&&kilometer_minute2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.light_speed_tokilometer_minute(value))) + "\t km/s");
                }else if (light_speed.isChecked()&&kilometer_hour2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.light_speed_tokilometer_hour(value))) + "\t km/h" );
                }else if (light_speed.isChecked()&&mile_hour2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.light_speed_tomile_hour(value))) + "\t m/h");
                }else if (light_speed.isChecked()&&knot2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.light_speed_toknot(value))) + "\t kt");
                }else if (light_speed.isChecked()&&mach2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(speed_Converter.light_speed_tomach(value))) + "\t Ma");
                }





            }


        }catch (Exception e){

        }


    }


}
