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

public class Energy extends AppCompatActivity {
    private ActionBar actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(Constant.theme);
        setContentView(R.layout.activity_energy);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        actionBar = getSupportActionBar();
        actionBar.setTitle("Energy");


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

    public void Calculate_energy(View view){
        DecimalFormat textformat = new DecimalFormat("###,###,###,###,###,###.############");
            try{
            EditText text = (EditText) findViewById(R.id.distance_editText);
            TextView tview = (TextView)findViewById(R.id.distance_textView);
            // this is if we press the cancel button
            if(view.getId() == R.id.clear_button){
                text.setText("");tview.setText("");
                // this is if we press the convert button
            }else if (view.getId() == R.id.calulate_button){
                RadioButton joule = (RadioButton)findViewById(R.id.joule_radio);
                RadioButton joule2 = (RadioButton)findViewById(R.id.joule_radio2);
                RadioButton kilojoule = (RadioButton)findViewById(R.id.kilojoule_radio);
                RadioButton kilojoule2 = (RadioButton)findViewById(R.id.kilojoule_radio2);
                RadioButton calorie = (RadioButton)findViewById(R.id.calorie_radio);
                RadioButton calorie2 = (RadioButton)findViewById(R.id.calorie_radio2);
                RadioButton kilocalorie = (RadioButton)findViewById(R.id.kilocalorie_radio);
                RadioButton kilocalorie2 = (RadioButton)findViewById(R.id.kilocalorie_radio2);
                RadioButton kilowatt_hour = (RadioButton)findViewById(R.id.kilowatt_hour_radio);
                RadioButton kilowatt_hour2 = (RadioButton)findViewById(R.id.kilowatt_hour_radio2);
                RadioButton kilogram_force = (RadioButton)findViewById(R.id.kilogram_force_meter_radio);
                RadioButton kilogram_force2 = (RadioButton)findViewById(R.id.kilogram_force_meter_radio2);
                RadioButton inch_pound = (RadioButton)findViewById(R.id.inch_pound_radio);
                RadioButton inch_pound2 = (RadioButton)findViewById(R.id.inch_pound_radio2);
                RadioButton foot_pound = (RadioButton)findViewById(R.id.foot_pound_radio);
                RadioButton foot_pound2 = (RadioButton)findViewById(R.id.foot_pound_radio2);
                RadioButton btu = (RadioButton)findViewById(R.id.btu_radio);
                RadioButton btu2 = (RadioButton)findViewById(R.id.btu_radio2);






                // this is if our text is empty
                if (text.getText().length()== 0){
                    Toast.makeText(this, "Please enter a valid number",
                            Toast.LENGTH_LONG ).show();
                    return;
                }else if (joule.isChecked()&&joule2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" + " j");
                }else if (kilojoule.isChecked()&&kilojoule2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +" kj");
                }else if (calorie.isChecked()&&calorie2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +" cal");
                }else if (kilocalorie.isChecked()&&kilocalorie2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" + " kcal");
                }else if (kilowatt_hour.isChecked()&&kilowatt_hour2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +" kW-h");
                }else if (kilogram_force.isChecked()&&kilogram_force2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +" kgf-m");
                }else if (inch_pound.isChecked()&&inch_pound2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" + " in-lb");
                }else if (foot_pound.isChecked()&&foot_pound2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +" ft-lb");
                }else if (btu.isChecked()&&btu2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +" BTU");
                }






                // if joule and other radio button is click in second scroll

                else if (joule.isChecked()&&kilojoule2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.joule_tokilojoule(value))) + "\t kj" );
                }else if (joule.isChecked()&&calorie2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.joule_tocalorie(value))) + "\t cal");
                }else if (joule.isChecked()&&kilocalorie2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.joule_tokilocalorie(value))) + "\t kcal" );
                }else if (joule.isChecked()&&kilowatt_hour2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.joule_tokilowatt_hour(value))) + "\t kW-h");
                }else if (joule.isChecked()&&kilogram_force2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.joule_tokilogram_force(value))) + "\t kgf-m" );
                }else if (joule.isChecked()&&inch_pound2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.joule_toinch_pound(value))) + "\t in-lb");
                }else if (joule.isChecked()&&foot_pound2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.joule_tofoot_pound(value))) + "\t ft-lb" );
                }else if (joule.isChecked()&&btu2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.joule_tobtu(value))) + "\t BTU");
                }





                // if kilojoule and other radio button is click in second scroll

                else if (kilojoule.isChecked()&&joule2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.kilojoule_tojoule(value))) + "\t j" );
                }else if (kilojoule.isChecked()&&calorie2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.kilojoule_tocalorie(value))) + "\t cal");
                }else if (kilojoule.isChecked()&&kilocalorie2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.kilojoule_tokilocalorie(value))) + "\t kcal" );
                }else if (kilojoule.isChecked()&&kilowatt_hour2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.kilojoule_tokilowatt_hour(value))) + "\t kW-h");
                }else if (kilojoule.isChecked()&&kilogram_force2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.kilojoule_tokilogram_force(value))) + "\t kgf-m" );
                }else if (kilojoule.isChecked()&&inch_pound2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.kilojoule_toinch_pound(value))) + "\t in-lb");
                }else if (kilojoule.isChecked()&&foot_pound2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.kilojoule_tofoot_pound(value))) + "\t ft-lb" );
                }else if (kilojoule.isChecked()&&btu2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.kilojoule_tobtu(value))) + "\t BTU");
                }






                // if calorie and other radio button is click in second scroll

                else if (calorie.isChecked()&&joule2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.calorie_tojoule(value))) + "\t j" );
                }else if (calorie.isChecked()&&kilojoule2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.calorie_tokilojoule(value))) + "\t kj");
                }else if (calorie.isChecked()&&kilocalorie2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.calorie_tokilocalorie(value))) + "\t kcal" );
                }else if (calorie.isChecked()&&kilowatt_hour2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.calorie_tokilowatt_hour(value))) + "\t kW-h");
                }else if (calorie.isChecked()&&kilogram_force2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.calorie_tokilogram_force(value))) + "\t kgf-m" );
                }else if (calorie.isChecked()&&inch_pound2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.calorie_toinch_pound(value))) + "\t in-lb");
                }else if (calorie.isChecked()&&foot_pound2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.calorie_tofoot_pound(value))) + "\t ft-lb" );
                }else if (calorie.isChecked()&&btu2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.calorie_tobtu(value))) + "\t BTU");
                }





                // if kilocalorie and other radio button is click in second scroll

                else if (kilocalorie.isChecked()&&joule2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.kilocalorie_tojoule(value))) + "\t j" );
                }else if (kilocalorie.isChecked()&&kilojoule2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.kilocalorie_tokilojoule(value))) + "\t kj");
                }else if (kilocalorie.isChecked()&&calorie2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.kilocalorie_tocalorie(value))) + "\t cal" );
                }else if (kilocalorie.isChecked()&&kilowatt_hour2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.kilocalorie_tokilowatt_hour(value))) + "\t kW-h");
                }else if (kilocalorie.isChecked()&&kilogram_force2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.kilocalorie_tokilogram_force(value))) + "\t kgf-m" );
                }else if (kilocalorie.isChecked()&&inch_pound2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.kilocalorie_toinch_pound(value))) + "\t in-lb");
                }else if (kilocalorie.isChecked()&&foot_pound2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.kilocalorie_tofoot_pound(value))) + "\t ft-lb" );
                }else if (kilocalorie.isChecked()&&btu2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.kilocalorie_tobtu(value))) + "\t BTU");
                }







                // if kilowatt_hour and other radio button is click in second scroll

                else if (kilowatt_hour.isChecked()&&joule2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.kilowatt_hour_tojoule(value))) + "\t j" );
                }else if (kilowatt_hour.isChecked()&&kilojoule2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.kilowatt_hour_tokilojoule(value))) + "\t kj");
                }else if (kilowatt_hour.isChecked()&&calorie2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.kilowatt_hour_tocalorie(value))) + "\t cal" );
                }else if (kilowatt_hour.isChecked()&&kilocalorie2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.kilowatt_hour_tokilocalorie(value))) + "\t kcal");
                }else if (kilowatt_hour.isChecked()&&kilogram_force2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.kilowatt_hour_tokilogram_force(value))) + "\t kgf-m" );
                }else if (kilowatt_hour.isChecked()&&inch_pound2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.kilowatt_hour_toinch_pound(value))) + "\t in-lb");
                }else if (kilowatt_hour.isChecked()&&foot_pound2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.kilowatt_hour_tofoot_pound(value))) + "\t ft-lb" );
                }else if (kilowatt_hour.isChecked()&&btu2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.kilowatt_hour_tobtu(value))) + "\t BTU");
                }






                // if kilogram_force and other radio button is click in second scroll

                else if (kilogram_force.isChecked()&&joule2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.kilogram_force_tojoule(value))) + "\t j" );
                }else if (kilogram_force.isChecked()&&kilojoule2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.kilogram_force_tokilojoule(value))) + "\t kj");
                }else if (kilogram_force.isChecked()&&calorie2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.kilogram_force_tocalorie(value))) + "\t cal" );
                }else if (kilogram_force.isChecked()&&kilocalorie2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.kilogram_force_tokilocalorie(value))) + "\t kcal");
                }else if (kilogram_force.isChecked()&&kilowatt_hour2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.kilogram_force_tokilowatt_hour(value))) + "\t kW-h" );
                }else if (kilogram_force.isChecked()&&inch_pound2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.kilogram_force_toinch_pound(value))) + "\t in-lb");
                }else if (kilogram_force.isChecked()&&foot_pound2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.kilogram_force_tofoot_pound(value))) + "\t ft-lb" );
                }else if (kilogram_force.isChecked()&&btu2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.kilogram_force_tobtu(value))) + "\t BTU");
                }







                // if inch_pound and other radio button is click in second scroll

                else if (inch_pound.isChecked()&&joule2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.inch_pound_tojoule(value))) + "\t j" );
                }else if (inch_pound.isChecked()&&kilojoule2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.inch_pound_tokilojoule(value))) + "\t kj");
                }else if (inch_pound.isChecked()&&calorie2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.inch_pound_tocalorie(value))) + "\t cal" );
                }else if (inch_pound.isChecked()&&kilocalorie2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.inch_pound_tokilocalorie(value))) + "\t kcal");
                }else if (inch_pound.isChecked()&&kilowatt_hour2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.inch_pound_tokilowatt_hour(value))) + "\t kW-h" );
                }else if (inch_pound.isChecked()&&kilogram_force2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.inch_pound_tokilogram_force(value))) + "\t kgf-m");
                }else if (inch_pound.isChecked()&&foot_pound2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.inch_pound_tofoot_pound(value))) + "\t ft-lb" );
                }else if (inch_pound.isChecked()&&btu2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.inch_pound_tobtu(value))) + "\t BTU");
                }






                // if foot_pound and other radio button is click in second scroll

                else if (foot_pound.isChecked()&&joule2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.foot_pound_tojoule(value))) + "\t j" );
                }else if (foot_pound.isChecked()&&kilojoule2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.foot_pound_tokilojoule(value))) + "\t kj");
                }else if (foot_pound.isChecked()&&calorie2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.foot_pound_tocalorie(value))) + "\t cal" );
                }else if (foot_pound.isChecked()&&kilocalorie2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.foot_pound_tokilocalorie(value))) + "\t kcal");
                }else if (foot_pound.isChecked()&&kilowatt_hour2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.foot_pound_tokilowatt_hour(value))) + "\t kW-h" );
                }else if (foot_pound.isChecked()&&kilogram_force2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.foot_pound_tokilogram_force(value))) + "\t kgf-m");
                }else if (foot_pound.isChecked()&&inch_pound2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.foot_pound_toinch_pound(value))) + "\t in-lb" );
                }else if (foot_pound.isChecked()&&btu2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.foot_pound_tobtu(value))) + "\t BTU");
                }





                // if btu and other radio button is click in second scroll

                else if (btu.isChecked()&&joule2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.btu_tojoule(value))) + "\t j" );
                }else if (btu.isChecked()&&kilojoule2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.btu_tokilojoule(value))) + "\t kj");
                }else if (btu.isChecked()&&calorie2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.btu_tocalorie(value))) + "\t cal" );
                }else if (btu.isChecked()&&kilocalorie2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.btu_tokilocalorie(value))) + "\t kcal");
                }else if (btu.isChecked()&&kilowatt_hour2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.btu_tokilowatt_hour(value))) + "\t kW-h" );
                }else if (btu.isChecked()&&kilogram_force2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.btu_tokilogram_force(value))) + "\t kgf-m");
                }else if (btu.isChecked()&&inch_pound2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.btu_toinch_pound(value))) + "\t in-lb" );
                }else if (btu.isChecked()&&foot_pound2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(energy_Converter.btu_tofoot_pound(value))) + "\t ft-lb");
                }










            }
        }catch (Exception e){

        }


    }
}
