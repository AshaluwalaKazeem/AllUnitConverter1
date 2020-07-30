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

public class Power extends AppCompatActivity {
    private ActionBar actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(Constant.theme);
        setContentView(R.layout.activity_power);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        actionBar = getSupportActionBar();
        actionBar.setTitle("Power");


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

    public void Calculate_power(View view){
        DecimalFormat textformat = new DecimalFormat("###,###,###,###,###,###.############");
        try{
            EditText text = (EditText) findViewById(R.id.distance_editText);
            TextView tview = (TextView)findViewById(R.id.distance_textView);
            // this is if we press the cancel button
            if(view.getId() == R.id.clear_button){
                text.setText("");tview.setText("");
                // this is if we press the convert button
            }else if (view.getId() == R.id.calulate_button){
                RadioButton watt = (RadioButton)findViewById(R.id.watt_radio);
                RadioButton watt2 = (RadioButton)findViewById(R.id.watt_radio2);
                RadioButton kilowatt = (RadioButton)findViewById(R.id.kilowatt_radio);
                RadioButton kilowatt2 = (RadioButton)findViewById(R.id.kilowatt_radio2);
                RadioButton megawatt = (RadioButton)findViewById(R.id.megawatt_radio);
                RadioButton megawatt2 = (RadioButton)findViewById(R.id.megawatt_radio2);
                RadioButton calorie_second = (RadioButton)findViewById(R.id.calorie_second_radio);
                RadioButton calorie_second2 = (RadioButton)findViewById(R.id.calorie_second_radio2);
                RadioButton kilocalorie_second = (RadioButton)findViewById(R.id.kilocalorie_second_radio);
                RadioButton kilocalorie_second2 = (RadioButton)findViewById(R.id.kilocalorie_second_radio2);
                RadioButton kilocalorie_hour = (RadioButton)findViewById(R.id.kilocalorie_hour_radio);
                RadioButton kilocalorie_hour2 = (RadioButton)findViewById(R.id.kilocalorie_hour_radio2);
                RadioButton horsepower = (RadioButton)findViewById(R.id.horsepower);
                RadioButton horsepower2 = (RadioButton)findViewById(R.id.horsepower2);
                RadioButton pferdestarke = (RadioButton)findViewById(R.id.pferdestarke_radio);
                RadioButton pferdestarke2 = (RadioButton)findViewById(R.id.pferdestarke_radio2);
                RadioButton btu = (RadioButton)findViewById(R.id.btu_hour_radio);
                RadioButton btu2 = (RadioButton)findViewById(R.id.btu_hour_radio2);
                RadioButton tonofrefrigeration = (RadioButton)findViewById(R.id.tonofrefrigeration_radio);
                RadioButton tonofrefrigeration2 = (RadioButton)findViewById(R.id.tonofrefrigeration_radio2);





                // this is if our text is empty
                if (text.getText().length()== 0){
                    Toast.makeText(this, "Please enter a valid number",
                            Toast.LENGTH_LONG ).show();
                    return;
                }else if (watt.isChecked()&&watt2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" + " W");
                } else if (kilowatt.isChecked()&&kilowatt2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +" kW");
                } else if (megawatt.isChecked()&&megawatt2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +" MW");
                }else if (calorie_second.isChecked()&&calorie_second2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" + " cal/s");
                } else if (kilocalorie_second.isChecked()&&kilocalorie_second2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +" kcal/s");
                } else if (kilocalorie_hour.isChecked()&&kilocalorie_hour2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +" kcal/h");
                }else if (calorie_second.isChecked()&&calorie_second2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" + " cal/s");
                } else if (kilocalorie_second.isChecked()&&kilocalorie_second2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +" kcal/s");
                } else if (kilocalorie_hour.isChecked()&&kilocalorie_hour2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +" kcal/h");
                }else if (horsepower.isChecked()&&horsepower2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" + " hp");
                } else if (pferdestarke.isChecked()&&pferdestarke2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +" Ps");
                } else if (btu.isChecked()&&btu2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +" BTU/h");
                } else if (tonofrefrigeration.isChecked()&&tonofrefrigeration2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +" RT");
                }






                // if watt and other radio button is click in second scroll

                else if (watt.isChecked()&&kilowatt2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.watt_tokilowatt(value))) + "\t kW" );
                }else if (watt.isChecked()&&megawatt2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.watt_tomegawatt(value))) + "\t MW");
                }else if (watt.isChecked()&&calorie_second2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.watt_tocalorie_second(value))) + "\t cal/s" );
                }else if (watt.isChecked()&&kilocalorie_second2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.watt_tokilocalorie_second(value))) + "\t kcal/s");
                }else if (watt.isChecked()&&kilocalorie_hour2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.watt_tokilocalorie_hour(value))) + "\t kcal/h" );
                }else if (watt.isChecked()&&horsepower2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.watt_tohorsepower(value))) + "\t hp");
                }else if (watt.isChecked()&&pferdestarke2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.watt_topf(value))) + "\t Ps" );
                }else if (watt.isChecked()&&btu2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.watt_tobtuhour(value))) + "\t BTU/h");
                }else if (watt.isChecked()&&tonofrefrigeration2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.watt_totonofr(value))) + "\t RT");
                }







                // if kilowatt and other radio button is click in second scroll

                else if (kilowatt.isChecked()&&watt2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.kilowatt_towatt(value))) + "\t W" );
                }else if (kilowatt.isChecked()&&megawatt2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.kilowatt_tomegawatt(value))) + "\t MW");
                }else if (kilowatt.isChecked()&&calorie_second2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.kilowatt_tocalorie_second(value))) + "\t cal/s" );
                }else if (kilowatt.isChecked()&&kilocalorie_second2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.kilowatt_tokilocalorie_second(value))) + "\t kcal/s");
                }else if (kilowatt.isChecked()&&kilocalorie_hour2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.kilowatt_tokilocalorie_hour(value))) + "\t kcal/h" );
                }else if (kilowatt.isChecked()&&horsepower2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.kilowatt_tohorsepower(value))) + "\t hp");
                }else if (kilowatt.isChecked()&&pferdestarke2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.kilowatt_topf(value))) + "\t Ps" );
                }else if (kilowatt.isChecked()&&btu2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.kilowatt_tobtuhour(value))) + "\t BTU/h");
                }else if (kilowatt.isChecked()&&tonofrefrigeration2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.kilowatt_totonofr(value))) + "\t RT");
                }







                // if megawatt and other radio button is click in second scroll

                else if (megawatt.isChecked()&&watt2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.megawatt_towatt(value))) + "\t W" );
                }else if (megawatt.isChecked()&&kilowatt2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.megawatt_tokilowatt(value))) + "\t kW");
                }else if (megawatt.isChecked()&&calorie_second2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.megawatt_tocalorie_second(value))) + "\t cal/s" );
                }else if (megawatt.isChecked()&&kilocalorie_second2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.megawatt_tokilocalorie_second(value))) + "\t kcal/s");
                }else if (megawatt.isChecked()&&kilocalorie_hour2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.megawatt_tokilocalorie_hour(value))) + "\t kcal/h" );
                }else if (megawatt.isChecked()&&horsepower2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.megawatt_tohorsepower(value))) + "\t hp");
                }else if (megawatt.isChecked()&&pferdestarke2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.megawatt_topf(value))) + "\t Ps" );
                }else if (megawatt.isChecked()&&btu2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.megawatt_tobtuhour(value))) + "\t BTU/h");
                }else if (megawatt.isChecked()&&tonofrefrigeration2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.megawatt_totonofr(value))) + "\t RT");
                }








                // if calorie_second and other radio button is click in second scroll

                else if (calorie_second.isChecked()&&watt2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.calorie_second_towatt(value))) + "\t W" );
                }else if (calorie_second.isChecked()&&kilowatt2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.calorie_second_tokilowatt(value))) + "\t kW");
                }else if (calorie_second.isChecked()&&megawatt2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.calorie_second_tomegawatt(value))) + "\t MW" );
                }else if (calorie_second.isChecked()&&kilocalorie_second2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.calorie_second_tokilocalorie_second(value))) + "\t kcal/s");
                }else if (calorie_second.isChecked()&&kilocalorie_hour2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.calorie_second_tokilocalorie_hour(value))) + "\t kcal/h" );
                }else if (calorie_second.isChecked()&&horsepower2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.calorie_second_tohorsepower(value))) + "\t hp");
                }else if (calorie_second.isChecked()&&pferdestarke2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.calorie_second_topf(value))) + "\t Ps" );
                }else if (calorie_second.isChecked()&&btu2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.calorie_second_tobtuhour(value))) + "\t BTU/h");
                }else if (calorie_second.isChecked()&&tonofrefrigeration2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.calorie_second_totonofr(value))) + "\t RT");
                }








                // if kilocalorie_second and other radio button is click in second scroll

                else if (kilocalorie_second.isChecked()&&watt2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.kilocalorie_second_towatt(value))) + "\t W" );
                }else if (kilocalorie_second.isChecked()&&kilowatt2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.kilocalorie_second_tokilowatt(value))) + "\t kW");
                }else if (kilocalorie_second.isChecked()&&megawatt2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.kilocalorie_second_tomegawatt(value))) + "\t MW" );
                }else if (kilocalorie_second.isChecked()&&calorie_second2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.kilocalorie_second_tocalorie_second(value))) + "\t cal/s");
                }else if (kilocalorie_second.isChecked()&&kilocalorie_hour2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.kilocalorie_second_tokilocalorie_hour(value))) + "\t kcal/h" );
                }else if (kilocalorie_second.isChecked()&&horsepower2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.kilocalorie_second_tohorsepower(value))) + "\t hp");
                }else if (kilocalorie_second.isChecked()&&pferdestarke2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.kilocalorie_second_topf(value))) + "\t Ps" );
                }else if (kilocalorie_second.isChecked()&&btu2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.kilocalorie_second_tobtuhour(value))) + "\t BTU/h");
                }else if (kilocalorie_second.isChecked()&&tonofrefrigeration2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.kilocalorie_second_totonofr(value))) + "\t RT");
                }







                // if kilocalorie_hour and other radio button is click in second scroll

                else if (kilocalorie_hour.isChecked()&&watt2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.kilocalorie_hour_towatt(value))) + "\t W" );
                }else if (kilocalorie_hour.isChecked()&&kilowatt2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.kilocalorie_hour_tokilowatt(value))) + "\t kW");
                }else if (kilocalorie_hour.isChecked()&&megawatt2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.kilocalorie_hour_tomegawatt(value))) + "\t MW" );
                }else if (kilocalorie_hour.isChecked()&&calorie_second2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.kilocalorie_hour_tocalorie_second(value))) + "\t cal/s");
                }else if (kilocalorie_hour.isChecked()&&kilocalorie_second2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.kilocalorie_hour_tokilocalorie_second(value))) + "\t kcal/s" );
                }else if (kilocalorie_hour.isChecked()&&horsepower2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.kilocalorie_hour_tohorsepower(value))) + "\t hp");
                }else if (kilocalorie_hour.isChecked()&&pferdestarke2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.kilocalorie_hour_topf(value))) + "\t Ps" );
                }else if (kilocalorie_hour.isChecked()&&btu2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.kilocalorie_hour_tobtuhour(value))) + "\t BTU/h");
                }else if (kilocalorie_hour.isChecked()&&tonofrefrigeration2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.kilocalorie_hour_totonofr(value))) + "\t RT");
                }








                // if horsepower and other radio button is click in second scroll

                else if (horsepower.isChecked()&&watt2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.horsepower_towatt(value))) + "\t W" );
                }else if (horsepower.isChecked()&&kilowatt2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.horsepower_tokilowatt(value))) + "\t kW");
                }else if (horsepower.isChecked()&&megawatt2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.horsepower_tomegawatt(value))) + "\t MW" );
                }else if (horsepower.isChecked()&&calorie_second2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.horsepower_tocalorie_second(value))) + "\t cal/s");
                }else if (horsepower.isChecked()&&kilocalorie_second2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.horsepower_tokilocalorie_second(value))) + "\t kcal/s" );
                }else if (horsepower.isChecked()&&kilocalorie_hour2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.horsepower_tokilocalorie_hour(value))) + "\t kcal/h");
                }else if (horsepower.isChecked()&&pferdestarke2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.horsepower_topf(value))) + "\t Ps" );
                }else if (horsepower.isChecked()&&btu2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.horsepower_tobtuhour(value))) + "\t BTU/h");
                }else if (horsepower.isChecked()&&tonofrefrigeration2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.horsepower_totonofr(value))) + "\t RT");
                }









                // if pferdestarke and other radio button is click in second scroll

                else if (pferdestarke.isChecked()&&watt2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.pf_towatt(value))) + "\t W" );
                }else if (pferdestarke.isChecked()&&kilowatt2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.pf_tokilowatt(value))) + "\t kW");
                }else if (pferdestarke.isChecked()&&megawatt2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.pf_tomegawatt(value))) + "\t MW" );
                }else if (pferdestarke.isChecked()&&calorie_second2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.pf_tocalorie_second(value))) + "\t cal/s");
                }else if (pferdestarke.isChecked()&&kilocalorie_second2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.pf_tokilocalorie_second(value))) + "\t kcal/s" );
                }else if (pferdestarke.isChecked()&&kilocalorie_hour2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.pf_tokilocalorie_hour(value))) + "\t kcal/h");
                }else if (pferdestarke.isChecked()&&horsepower2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.pf_tohorsepower(value))) + "\t hp" );
                }else if (pferdestarke.isChecked()&&btu2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.pf_tobtuhour(value))) + "\t BTU/h");
                }else if (pferdestarke.isChecked()&&tonofrefrigeration2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.pf_totonofr(value))) + "\t RT");
                }








                // if btu and other radio button is click in second scroll

                else if (btu.isChecked()&&watt2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.btuhour_towatt(value))) + "\t W" );
                }else if (btu.isChecked()&&kilowatt2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.btuhour_tokilowatt(value))) + "\t kW");
                }else if (btu.isChecked()&&megawatt2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.btuhour_tomegawatt(value))) + "\t MW" );
                }else if (btu.isChecked()&&calorie_second2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.btuhour_tocalorie_second(value))) + "\t cal/s");
                }else if (btu.isChecked()&&kilocalorie_second2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.btuhour_tokilocalorie_second(value))) + "\t kcal/s" );
                }else if (btu.isChecked()&&kilocalorie_hour2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.btuhour_tokilocalorie_hour(value))) + "\t kcal/h");
                }else if (btu.isChecked()&&horsepower2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.btuhour_tohorsepower(value))) + "\t hp" );
                }else if (btu.isChecked()&&pferdestarke2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.btuhour_topf(value))) + "\t Ps");
                }else if (btu.isChecked()&&tonofrefrigeration2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.btuhour_totonofr(value))) + "\t RT");
                }






                // if tonofrefrigeration and other radio button is click in second scroll

                else if (tonofrefrigeration.isChecked()&&watt2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.tonofr_towatt(value))) + "\t W" );
                }else if (tonofrefrigeration.isChecked()&&kilowatt2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.tonofr_tokilowatt(value))) + "\t kW");
                }else if (tonofrefrigeration.isChecked()&&megawatt2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.tonofr_tomegawatt(value))) + "\t MW" );
                }else if (tonofrefrigeration.isChecked()&&calorie_second2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.tonofr_tocalorie_second(value))) + "\t cal/s");
                }else if (tonofrefrigeration.isChecked()&&kilocalorie_second2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.tonofr_tokilocalorie_second(value))) + "\t kcal/s" );
                }else if (tonofrefrigeration.isChecked()&&kilocalorie_hour2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.tonofr_tokilocalorie_hour(value))) + "\t kcal/h");
                }else if (tonofrefrigeration.isChecked()&&horsepower2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.tonofr_tohorsepower(value))) + "\t hp" );
                }else if (tonofrefrigeration.isChecked()&&pferdestarke2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.tonofr_topf(value))) + "\t Ps");
                }else if (tonofrefrigeration.isChecked()&&btu2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(power_Converter.tonofr_tobtuhour(value))) + "\t BTU/h");
                }










            }


        }catch (Exception e){

        }
    }
}
