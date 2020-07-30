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
public class Pressure extends AppCompatActivity {
    private ActionBar actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(Constant.theme);
        setContentView(R.layout.activity_pressure);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        actionBar = getSupportActionBar();
        actionBar.setTitle("Pressure");


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

    public void Calculate_pressure(View view){
        DecimalFormat textformat = new DecimalFormat("###,###,###,###,###,###.############");
        try{
            EditText text = (EditText) findViewById(R.id.distance_editText);
            TextView tview = (TextView)findViewById(R.id.distance_textView);
            // this is if we press the cancel button
            if(view.getId() == R.id.clear_button){
                text.setText("");tview.setText("");
                // this is if we press the convert button
            }else if (view.getId() == R.id.calulate_button){
                RadioButton standard_atm = (RadioButton)findViewById(R.id.standard_atm_radio);
                RadioButton standard_atm2 = (RadioButton)findViewById(R.id.standard_atm_radio2);
                RadioButton pascal = (RadioButton)findViewById(R.id.pascal_radio);
                RadioButton pascal2 = (RadioButton)findViewById(R.id.pascal_radio2);
                RadioButton hectopascal = (RadioButton)findViewById(R.id.hectopascal_radio);
                RadioButton hectopascal2 = (RadioButton)findViewById(R.id.hectopascal_radio2);
                RadioButton kilopascal = (RadioButton)findViewById(R.id.kilopascal_radio);
                RadioButton kilopascal2 = (RadioButton)findViewById(R.id.kilopascal_radio2);
                RadioButton megapascal = (RadioButton)findViewById(R.id.megapascal_radio);
                RadioButton megapascal2 = (RadioButton)findViewById(R.id.megapascal_radio2);
                RadioButton bar = (RadioButton)findViewById(R.id.bar_radio);
                RadioButton bar2 = (RadioButton)findViewById(R.id.bar_radio2);
                RadioButton kg_force_sq_cm = (RadioButton)findViewById(R.id.kg_force_sq_cm_radio);
                RadioButton kg_force_sq_cm2 = (RadioButton)findViewById(R.id.kg_force_sq_cm_radio2);
                RadioButton kg_force_sq_m = (RadioButton)findViewById(R.id.kg_force_sq_m_radio);
                RadioButton kg_force_sq_m2 = (RadioButton)findViewById(R.id.kg_force_sq_m_radio2);
                RadioButton psi = (RadioButton)findViewById(R.id.psi_radio);
                RadioButton psi2 = (RadioButton)findViewById(R.id.psi_radio2);
                RadioButton ksi = (RadioButton)findViewById(R.id.ksi_radio);
                RadioButton ksi2 = (RadioButton)findViewById(R.id.ksi_radio2);
                RadioButton torr = (RadioButton)findViewById(R.id.torr_radio);
                RadioButton torr2 = (RadioButton)findViewById(R.id.torr_radio2);
                RadioButton inch_mecury = (RadioButton)findViewById(R.id.inch_mecury_radio);
                RadioButton inch_mecury2 = (RadioButton)findViewById(R.id.inch_mecury_radio2);
                RadioButton millimeter_water = (RadioButton)findViewById(R.id.millimeter_water_radio);
                RadioButton millimeter_water2 = (RadioButton)findViewById(R.id.millimeter_water_radio2);
                RadioButton centimeter_water = (RadioButton)findViewById(R.id.centimeter_water_radio);
                RadioButton centimeter_water2 = (RadioButton)findViewById(R.id.centimeter_water_radio2);
                RadioButton inch_water = (RadioButton)findViewById(R.id.inch_water_radio);
                RadioButton inch_water2 = (RadioButton)findViewById(R.id.inch_water_radio2);







                // this is if our text is empty
                if (text.getText().length()== 0){
                    Toast.makeText(this, "Please enter a valid number",
                            Toast.LENGTH_LONG ).show();
                    return;
                }else if (standard_atm.isChecked()&&standard_atm2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" + " atm");
                }else if (pascal.isChecked()&&pascal2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +" Pa");
                }else if (hectopascal.isChecked()&&hectopascal2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +" hPa");
                }else if (kilopascal.isChecked()&&kilopascal2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" + " kPa");
                }else if (megapascal.isChecked()&&megapascal2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +" MPa");
                }else if (bar.isChecked()&&bar2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +" bar");
                }else if (kg_force_sq_cm.isChecked()&&kg_force_sq_cm2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" + " kgf/cm^2");
                }else if (kg_force_sq_m.isChecked()&&kg_force_sq_m2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +" kgf/m^2");
                }else if (psi.isChecked()&&psi2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +" psi");
                }else if (ksi.isChecked()&&ksi2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +" ksi");
                }else if (torr.isChecked()&&torr2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" + " Torr");
                }else if (inch_mecury.isChecked()&&inch_mecury2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +" inchHg");
                }else if (millimeter_water.isChecked()&&millimeter_water2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +" mmH2O");
                }else if (centimeter_water.isChecked()&&centimeter_water2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +" cmH2O");
                }else if (inch_water.isChecked()&&inch_water2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" + " inchH2O");
                }






                // if standard_atm and other radio button is click in second scroll

                else if (standard_atm.isChecked()&&pascal2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.standard_atm_topascal(value))) + "\t pa" );
                }else if (standard_atm.isChecked()&&hectopascal2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.standard_atm_tohectopascal(value))) + "\t hPa");
                }else if (standard_atm.isChecked()&&kilopascal2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.standard_atm_tokilopascal(value))) + "\t kPa" );
                }else if (standard_atm.isChecked()&&megapascal2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.standard_atm_tomegapascal(value))) + "\t MPa");
                }else if (standard_atm.isChecked()&&bar2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.standard_atm_tobar(value))) + "\t bar" );
                }else if (standard_atm.isChecked()&&kg_force_sq_cm2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.standard_atm_tokg_force_sqcm(value))) + "\t kgf/cm^2");
                }else if (standard_atm.isChecked()&&kg_force_sq_m2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.standard_atm_tokg_force_sqm(value))) + "\t kgf/m^2" );
                }else if (standard_atm.isChecked()&&psi2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.standard_atm_topsi(value))) + "\t psi" );
                }else if (standard_atm.isChecked()&&ksi2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.standard_atm_toksi(value))) + "\t ksi");
                }else if (standard_atm.isChecked()&&torr2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.standard_atm_totorr(value))) + "\t Torr");
                }else if (standard_atm.isChecked()&&inch_mecury2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.standard_atm_toinch_mecury(value))) + "\t inchHg" );
                }else if (standard_atm.isChecked()&&millimeter_water2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.standard_atm_tomillimeter_water(value))) + "\t mmH2O");
                }else if (standard_atm.isChecked()&&centimeter_water2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.standard_atm_tocentimeter_water(value))) + "\t cmH2O" );
                }else if (standard_atm.isChecked()&&inch_water2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.standard_atm_toinch_water(value))) + "\t inchH2O" );
                }







                // if pascal and other radio button is click in second scroll

                else if (pascal.isChecked()&&standard_atm2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.pascal_tostandard_atm(value))) + "\t atm" );
                }else if (pascal.isChecked()&&hectopascal2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.pascal_tohectopascal(value))) + "\t hPa");
                }else if (pascal.isChecked()&&kilopascal2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.pascal_tokilopascal(value))) + "\t kPa" );
                }else if (pascal.isChecked()&&megapascal2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.pascal_tomegapascal(value))) + "\t MPa");
                }else if (pascal.isChecked()&&bar2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.pascal_tobar(value))) + "\t bar" );
                }else if (pascal.isChecked()&&kg_force_sq_cm2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.pascal_tokg_force_sqcm(value))) + "\t kgf/cm^2");
                }else if (pascal.isChecked()&&kg_force_sq_m2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.pascal_tokg_force_sqm(value))) + "\t kgf/m^2" );
                }else if (pascal.isChecked()&&psi2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.pascal_topsi(value))) + "\t psi" );
                }else if (pascal.isChecked()&&ksi2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.pascal_toksi(value))) + "\t ksi");
                }else if (pascal.isChecked()&&torr2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.pascal_totorr(value))) + "\t Torr");
                }else if (pascal.isChecked()&&inch_mecury2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.pascal_toinch_mecury(value))) + "\t inchHg" );
                }else if (pascal.isChecked()&&millimeter_water2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.pascal_tomillimeter_water(value))) + "\t mmH2O");
                }else if (pascal.isChecked()&&centimeter_water2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.pascal_tocentimeter_water(value))) + "\t cmH2O" );
                }else if (pascal.isChecked()&&inch_water2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.pascal_toinch_water(value))) + "\t inchH2O" );
                }








                // if hectopascal and other radio button is click in second scroll

                else if (hectopascal.isChecked()&&standard_atm2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.hectopascal_tostandard_atm(value))) + "\t atm" );
                }else if (hectopascal.isChecked()&&pascal.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.hectopascal_topascal(value))) + "\t Pa");
                }else if (hectopascal.isChecked()&&kilopascal2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.hectopascal_tokilopascal(value))) + "\t kPa" );
                }else if (hectopascal.isChecked()&&megapascal2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.hectopascal_tomegapascal(value))) + "\t MPa");
                }else if (hectopascal.isChecked()&&bar2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.hectopascal_tobar(value))) + "\t bar" );
                }else if (hectopascal.isChecked()&&kg_force_sq_cm2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.hectopascal_tokg_force_sqcm(value))) + "\t kgf/cm^2");
                }else if (hectopascal.isChecked()&&kg_force_sq_m2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.hectopascal_tokg_force_sqm(value))) + "\t kgf/m^2" );
                }else if (hectopascal.isChecked()&&psi2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.hectopascal_topsi(value))) + "\t psi" );
                }else if (hectopascal.isChecked()&&ksi2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.hectopascal_toksi(value))) + "\t ksi");
                }else if (hectopascal.isChecked()&&torr2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.hectopascal_totorr(value))) + "\t Torr");
                }else if (hectopascal.isChecked()&&inch_mecury2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.hectopascal_toinch_mecury(value))) + "\t inchHg" );
                }else if (hectopascal.isChecked()&&millimeter_water2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.hectopascal_tomillimeter_water(value))) + "\t mmH2O");
                }else if (hectopascal.isChecked()&&centimeter_water2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.hectopascal_tocentimeter_water(value))) + "\t cmH2O" );
                } else if (hectopascal.isChecked()&&inch_water2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.hectopascal_toinch_water(value))) + "\t inchH2O" );
                }







                // if kilopascal and other radio button is click in second scroll

                else if (kilopascal.isChecked()&&standard_atm2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.kilopascal_tostandard_atm(value))) + "\t atm" );
                }else if (kilopascal.isChecked()&&pascal.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.kilopascal_topascal(value))) + "\t Pa");
                }else if (kilopascal.isChecked()&&hectopascal2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.kilopascal_tohectopascal(value))) + "\t hPa" );
                }else if (kilopascal.isChecked()&&megapascal2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.kilopascal_tomegapascal(value))) + "\t MPa");
                }else if (kilopascal.isChecked()&&bar2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.kilopascal_tobar(value))) + "\t bar" );
                }else if (kilopascal.isChecked()&&kg_force_sq_cm2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.kilopascal_tokg_force_sqcm(value))) + "\t kgf/cm^2");
                }else if (kilopascal.isChecked()&&kg_force_sq_m2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.kilopascal_tokg_force_sqm(value))) + "\t kgf/m^2" );
                }else if (kilopascal.isChecked()&&psi2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.kilopascal_topsi(value))) + "\t psi" );
                }else if (kilopascal.isChecked()&&ksi2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.kilopascal_toksi(value))) + "\t ksi");
                }else if (kilopascal.isChecked()&&torr2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.kilopascal_totorr(value))) + "\t Torr");
                }else if (kilopascal.isChecked()&&inch_mecury2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.kilopascal_toinch_mecury(value))) + "\t inchHg" );
                }else if (kilopascal.isChecked()&&millimeter_water2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.kilopascal_tomillimeter_water(value))) + "\t mmH2O");
                }else if (kilopascal.isChecked()&&centimeter_water2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.kilopascal_tocentimeter_water(value))) + "\t cmH2O" );
                }else if (kilopascal.isChecked()&&inch_water2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.kilopascal_toinch_water(value))) + "\t inchH2O" );
                }










                // if megapascal and other radio button is click in second scroll

                else if (megapascal.isChecked()&&standard_atm2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.megapascal_tostandard_atm(value))) + "\t atm" );
                }else if (megapascal.isChecked()&&pascal.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.megapascal_topascal(value))) + "\t Pa");
                }else if (megapascal.isChecked()&&hectopascal2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.megapascal_tohectopascal(value))) + "\t hPa" );
                }else if (megapascal.isChecked()&&kilopascal2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.megapascal_tokilopascal(value))) + "\t kPa");
                }else if (megapascal.isChecked()&&bar2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.megapascal_tobar(value))) + "\t bar" );
                }else if (megapascal.isChecked()&&kg_force_sq_cm2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.megapascal_tokg_force_sqcm(value))) + "\t kgf/cm^2");
                }else if (megapascal.isChecked()&&kg_force_sq_m2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.megapascal_tokg_force_sqm(value))) + "\t kgf/m^2" );
                }else if (megapascal.isChecked()&&psi2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.megapascal_topsi(value))) + "\t psi" );
                }else if (megapascal.isChecked()&&ksi2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.megapascal_toksi(value))) + "\t ksi");
                }else if (megapascal.isChecked()&&torr2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.megapascal_totorr(value))) + "\t Torr");
                }else if (megapascal.isChecked()&&inch_mecury2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.megapascal_toinch_mecury(value))) + "\t inchHg" );
                }else if (megapascal.isChecked()&&millimeter_water2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.megapascal_tomillimeter_water(value))) + "\t mmH2O");
                }else if (megapascal.isChecked()&&centimeter_water2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.megapascal_tocentimeter_water(value))) + "\t cmH2O" );
                }else if (megapascal.isChecked()&&inch_water2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.megapascal_toinch_water(value))) + "\t inchH2O" );
                }









                // if bar and other radio button is click in second scroll

                else if (bar.isChecked()&&standard_atm2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.bar_tostandard_atm(value))) + "\t atm" );
                }else if (bar.isChecked()&&pascal.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.bar_topascal(value))) + "\t Pa");
                }else if (bar.isChecked()&&hectopascal2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.bar_tohectopascal(value))) + "\t hPa" );
                }else if (bar.isChecked()&&kilopascal2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.bar_tokilopascal(value))) + "\t kPa");
                }else if (bar.isChecked()&&megapascal2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.bar_tomegapascal(value))) + "\t MPa" );
                }else if (bar.isChecked()&&kg_force_sq_cm2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.bar_tokg_force_sqcm(value))) + "\t kgf/cm^2");
                }else if (bar.isChecked()&&kg_force_sq_m2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.bar_tokg_force_sqm(value))) + "\t kgf/m^2" );
                }else if (bar.isChecked()&&psi2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.bar_topsi(value))) + "\t psi" );
                }else if (bar.isChecked()&&ksi2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.bar_toksi(value))) + "\t ksi");
                }else if (bar.isChecked()&&torr2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.bar_totorr(value))) + "\t Torr");
                }else if (bar.isChecked()&&inch_mecury2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.bar_toinch_mecury(value))) + "\t inchHg" );
                }else if (bar.isChecked()&&millimeter_water2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.bar_tomillimeter_water(value))) + "\t mmH2O");
                }else if (bar.isChecked()&&centimeter_water2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.bar_tocentimeter_water(value))) + "\t cmH2O" );
                }else if (bar.isChecked()&&inch_water2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.bar_toinch_water(value))) + "\t inchH2O" );
                }










                // if kg_force_sqcm and other radio button is click in second scroll

                else if (kg_force_sq_cm2.isChecked()&&standard_atm2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.kg_force_sqcm_tostandard_atm(value))) + "\t atm" );
                }else if (kg_force_sq_cm2.isChecked()&&pascal.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.kg_force_sqcm_topascal(value))) + "\t Pa");
                }else if (kg_force_sq_cm2.isChecked()&&hectopascal2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.kg_force_sqcm_tohectopascal(value))) + "\t hPa" );
                }else if (kg_force_sq_cm2.isChecked()&&kilopascal2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.kg_force_sqcm_tokilopascal(value))) + "\t kPa");
                }else if (kg_force_sq_cm2.isChecked()&&megapascal2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.kg_force_sqcm_tomegapascal(value))) + "\t MPa" );
                }else if (kg_force_sq_cm2.isChecked()&&bar2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.kg_force_sqcm_tobar(value))) + "\t bar");
                }else if (kg_force_sq_cm2.isChecked()&&kg_force_sq_m2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.kg_force_sqcm_tokg_force_sqm(value))) + "\t kgf/m^2" );
                }else if (kg_force_sq_cm2.isChecked()&&psi2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.kg_force_sqcm_topsi(value))) + "\t psi" );
                }else if (kg_force_sq_cm2.isChecked()&&ksi2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.kg_force_sqcm_toksi(value))) + "\t ksi");
                }else if (kg_force_sq_cm2.isChecked()&&torr2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.kg_force_sqcm_totorr(value))) + "\t Torr");
                }else if (kg_force_sq_cm2.isChecked()&&inch_mecury2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.kg_force_sqcm_toinch_mecury(value))) + "\t inchHg" );
                }else if (kg_force_sq_cm2.isChecked()&&millimeter_water2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.kg_force_sqcm_tomillimeter_water(value))) + "\t mmH2O");
                }else if (kg_force_sq_cm2.isChecked()&&centimeter_water2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.kg_force_sqcm_tocentimeter_water(value))) + "\t cmH2O" );
                }else if (kg_force_sq_cm2.isChecked()&&inch_water2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.kg_force_sqcm_toinch_water(value))) + "\t inchH2O" );
                }











                // if kg_force_sq_m2 and other radio button is click in second scroll

                else if (kg_force_sq_m2.isChecked()&&standard_atm2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.kg_force_sqm_tostandard_atm(value))) + "\t atm" );
                }else if (kg_force_sq_m2.isChecked()&&pascal.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.kg_force_sqm_topascal(value))) + "\t Pa");
                }else if (kg_force_sq_m2.isChecked()&&hectopascal2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.kg_force_sqm_tohectopascal(value))) + "\t hPa" );
                }else if (kg_force_sq_m2.isChecked()&&kilopascal2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.kg_force_sqm_tokilopascal(value))) + "\t kPa");
                }else if (kg_force_sq_m2.isChecked()&&megapascal2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.kg_force_sqm_tomegapascal(value))) + "\t MPa" );
                }else if (kg_force_sq_m2.isChecked()&&bar2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.kg_force_sqm_tobar(value))) + "\t bar");
                }else if (kg_force_sq_m2.isChecked()&&kg_force_sq_cm2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.kg_force_sqm_tokg_force_sqcm(value))) + "\t kgf/cm^2" );
                }else if (kg_force_sq_m2.isChecked()&&psi2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.kg_force_sqm_topsi(value))) + "\t psi" );
                }else if (kg_force_sq_m2.isChecked()&&ksi2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.kg_force_sqm_toksi(value))) + "\t ksi");
                }else if (kg_force_sq_m2.isChecked()&&torr2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.kg_force_sqm_totorr(value))) + "\t Torr");
                }else if (kg_force_sq_m2.isChecked()&&inch_mecury2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.kg_force_sqm_toinch_mecury(value))) + "\t inchHg" );
                }else if (kg_force_sq_m2.isChecked()&&millimeter_water2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.kg_force_sqm_tomillimeter_water(value))) + "\t mmH2O");
                }else if (kg_force_sq_m2.isChecked()&&centimeter_water2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.kg_force_sqm_tocentimeter_water(value))) + "\t cmH2O" );
                }else if (kg_force_sq_m2.isChecked()&&inch_water2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.kg_force_sqm_toinch_water(value))) + "\t inchH2O" );
                }









                // if psi and other radio button is click in second scroll

                else if (psi.isChecked()&&standard_atm2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.psi_tostandard_atm(value))) + "\t atm" );
                }else if (psi.isChecked()&&pascal.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.psi_topascal(value))) + "\t Pa");
                }else if (psi.isChecked()&&hectopascal2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.psi_tohectopascal(value))) + "\t hPa" );
                }else if (psi.isChecked()&&kilopascal2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.psi_tokilopascal(value))) + "\t kPa");
                }else if (psi.isChecked()&&megapascal2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.psi_tomegapascal(value))) + "\t MPa" );
                }else if (psi.isChecked()&&bar2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.psi_tobar(value))) + "\t bar");
                }else if (psi.isChecked()&&kg_force_sq_cm2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.psi_tokg_force_sqcm(value))) + "\t kgf/cm^2" );
                }else if (psi.isChecked()&&kg_force_sq_m2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.psi_tokg_force_sqm(value))) + "\t kgf/m^2" );
                }else if (psi.isChecked()&&ksi2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.psi_toksi(value))) + "\t ksi");
                }else if (psi.isChecked()&&torr2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.psi_totorr(value))) + "\t Torr");
                }else if (psi.isChecked()&&inch_mecury2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.psi_toinch_mecury(value))) + "\t inchHg" );
                }else if (psi.isChecked()&&millimeter_water2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.psi_tomillimeter_water(value))) + "\t mmH2O");
                }else if (psi.isChecked()&&centimeter_water2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.psi_tocentimeter_water(value))) + "\t cmH2O" );
                }else if (psi.isChecked()&&inch_water2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.psi_toinch_water(value))) + "\t inchH2O" );
                }










                // if ksi and other radio button is click in second scroll

                else if (ksi.isChecked()&&standard_atm2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.ksi_tostandard_atm(value))) + "\t atm" );
                }else if (ksi.isChecked()&&pascal.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.ksi_topascal(value))) + "\t Pa");
                }else if (ksi.isChecked()&&hectopascal2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.ksi_tohectopascal(value))) + "\t hPa" );
                }else if (ksi.isChecked()&&kilopascal2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.ksi_tokilopascal(value))) + "\t kPa");
                }else if (ksi.isChecked()&&megapascal2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.ksi_tomegapascal(value))) + "\t MPa" );
                }else if (ksi.isChecked()&&bar2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.ksi_tobar(value))) + "\t bar");
                }else if (ksi.isChecked()&&kg_force_sq_cm2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.ksi_tokg_force_sqcm(value))) + "\t kgf/cm^2" );
                }else if (ksi.isChecked()&&kg_force_sq_m2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.ksi_tokg_force_sqm(value))) + "\t kgf/m^2" );
                }else if (ksi.isChecked()&&psi2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.ksi_topsi(value))) + "\t psi");
                }else if (ksi.isChecked()&&torr2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.ksi_totorr(value))) + "\t Torr");
                }else if (ksi.isChecked()&&inch_mecury2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.ksi_toinch_mecury(value))) + "\t inchHg" );
                }else if (ksi.isChecked()&&millimeter_water2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.ksi_tomillimeter_water(value))) + "\t mmH2O");
                }else if (ksi.isChecked()&&centimeter_water2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.ksi_tocentimeter_water(value))) + "\t cmH2O" );
                }else if (ksi.isChecked()&&inch_water2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.ksi_toinch_water(value))) + "\t inchH2O" );
                }










                // if torr and other radio button is click in second scroll

                else if (torr.isChecked()&&standard_atm2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.torr_tostandard_atm(value))) + "\t atm" );
                }else if (torr.isChecked()&&pascal.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.torr_topascal(value))) + "\t Pa");
                }else if (torr.isChecked()&&hectopascal2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.torr_tohectopascal(value))) + "\t hPa" );
                }else if (torr.isChecked()&&kilopascal2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.torr_tokilopascal(value))) + "\t kPa");
                }else if (torr.isChecked()&&megapascal2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.torr_tomegapascal(value))) + "\t MPa" );
                }else if (torr.isChecked()&&bar2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.torr_tobar(value))) + "\t bar");
                }else if (torr.isChecked()&&kg_force_sq_cm2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.torr_tokg_force_sqcm(value))) + "\t kgf/cm^2" );
                }else if (torr.isChecked()&&kg_force_sq_m2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.torr_tokg_force_sqm(value))) + "\t kgf/m^2" );
                }else if (torr.isChecked()&&psi2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.torr_topsi(value))) + "\t psi");
                }else if (torr.isChecked()&&ksi2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.torr_toksi(value))) + "\t ksi");
                }else if (torr.isChecked()&&inch_mecury2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.torr_toinch_mecury(value))) + "\t inchHg" );
                }else if (torr.isChecked()&&millimeter_water2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.torr_tomillimeter_water(value))) + "\t mmH2O");
                }else if (torr.isChecked()&&centimeter_water2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.torr_tocentimeter_water(value))) + "\t cmH2O" );
                }else if (torr.isChecked()&&inch_water2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.torr_toinch_water(value))) + "\t inchH2O" );
                }









                // if inch_mecury and other radio button is click in second scroll

                else if (inch_mecury.isChecked()&&standard_atm2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.inch_mecury_tostandard_atm(value))) + "\t atm" );
                }else if (inch_mecury.isChecked()&&pascal.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.inch_mecury_topascal(value))) + "\t Pa");
                }else if (inch_mecury.isChecked()&&hectopascal2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.inch_mecury_tohectopascal(value))) + "\t hPa" );
                }else if (inch_mecury.isChecked()&&kilopascal2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.inch_mecury_tokilopascal(value))) + "\t kPa");
                }else if (inch_mecury.isChecked()&&megapascal2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.inch_mecury_tomegapascal(value))) + "\t MPa" );
                }else if (inch_mecury.isChecked()&&bar2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.inch_mecury_tobar(value))) + "\t bar");
                }else if (inch_mecury.isChecked()&&kg_force_sq_cm2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.inch_mecury_tokg_force_sqcm(value))) + "\t kgf/cm^2" );
                }else if (inch_mecury.isChecked()&&kg_force_sq_m2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.inch_mecury_tokg_force_sqm(value))) + "\t kgf/m^2" );
                }else if (inch_mecury.isChecked()&&psi2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.inch_mecury_topsi(value))) + "\t psi");
                }else if (inch_mecury.isChecked()&&ksi2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.inch_mecury_toksi(value))) + "\t ksi");
                }else if (inch_mecury.isChecked()&&torr2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.inch_mecury_totorr(value))) + "\t Torr" );
                }else if (inch_mecury.isChecked()&&millimeter_water2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.inch_mecury_tomillimeter_water(value))) + "\t mmH2O");
                }else if (inch_mecury.isChecked()&&centimeter_water2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.inch_mecury_tocentimeter_water(value))) + "\t cmH2O" );
                }else if (inch_mecury.isChecked()&&inch_water2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.inch_mecury_toinch_water(value))) + "\t inchH2O" );
                }









                // if millimeter_water and other radio button is click in second scroll

                else if (millimeter_water.isChecked()&&standard_atm2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.millimeter_water_tostandard_atm(value))) + "\t atm" );
                }else if (millimeter_water.isChecked()&&pascal.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.millimeter_water_topascal(value))) + "\t Pa");
                }else if (millimeter_water.isChecked()&&hectopascal2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.millimeter_water_tohectopascal(value))) + "\t hPa" );
                }else if (millimeter_water.isChecked()&&kilopascal2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.millimeter_water_tokilopascal(value))) + "\t kPa");
                }else if (millimeter_water.isChecked()&&megapascal2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.millimeter_water_tomegapascal(value))) + "\t MPa" );
                }else if (millimeter_water.isChecked()&&bar2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.millimeter_water_tobar(value))) + "\t bar");
                }else if (millimeter_water.isChecked()&&kg_force_sq_cm2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.millimeter_water_tokg_force_sqcm(value))) + "\t kgf/cm^2" );
                }else if (millimeter_water.isChecked()&&kg_force_sq_m2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.millimeter_water_tokg_force_sqm(value))) + "\t kgf/m^2" );
                }else if (millimeter_water.isChecked()&&psi2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.millimeter_water_topsi(value))) + "\t psi");
                }else if (millimeter_water.isChecked()&&ksi2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.millimeter_water_toksi(value))) + "\t ksi");
                }else if (millimeter_water.isChecked()&&torr2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.millimeter_water_totorr(value))) + "\t Torr" );
                }else if (millimeter_water.isChecked()&&inch_mecury2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.millimeter_water_toinch_mecury(value))) + "\t inchHg");
                }else if (millimeter_water.isChecked()&&centimeter_water2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.millimeter_water_tocentimeter_water(value))) + "\t cmH2O" );
                }else if (millimeter_water.isChecked()&&inch_water2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.millimeter_water_toinch_water(value))) + "\t inchH2O" );
                }










                // if centimeter_water and other radio button is click in second scroll

                else if (centimeter_water.isChecked()&&standard_atm2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.centimeter_water_tostandard_atm(value))) + "\t atm" );
                }else if (centimeter_water.isChecked()&&pascal.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.centimeter_water_topascal(value))) + "\t Pa");
                }else if (centimeter_water.isChecked()&&hectopascal2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.centimeter_water_tohectopascal(value))) + "\t hPa" );
                }else if (centimeter_water.isChecked()&&kilopascal2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.centimeter_water_tokilopascal(value))) + "\t kPa");
                }else if (centimeter_water.isChecked()&&megapascal2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.centimeter_water_tomegapascal(value))) + "\t MPa" );
                }else if (centimeter_water.isChecked()&&bar2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.centimeter_water_tobar(value))) + "\t bar");
                }else if (centimeter_water.isChecked()&&kg_force_sq_cm2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.centimeter_water_tokg_force_sqcm(value))) + "\t kgf/cm^2" );
                }else if (centimeter_water.isChecked()&&kg_force_sq_m2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.centimeter_water_tokg_force_sqm(value))) + "\t kgf/m^2" );
                }else if (centimeter_water.isChecked()&&psi2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.centimeter_water_topsi(value))) + "\t psi");
                }else if (centimeter_water.isChecked()&&ksi2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.centimeter_water_toksi(value))) + "\t ksi");
                }else if (centimeter_water.isChecked()&&torr2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.centimeter_water_totorr(value))) + "\t Torr" );
                }else if (centimeter_water.isChecked()&&inch_mecury2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.centimeter_water_toinch_mecury(value))) + "\t inchHg");
                }else if (centimeter_water.isChecked()&&millimeter_water2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.centimeter_water_tomillimeter_water(value))) + "\t mmH2O" );
                }else if (centimeter_water.isChecked()&&inch_water2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.centimeter_water_toinch_water(value))) + "\t inchH2O" );
                }











                // if inch_water and other radio button is click in second scroll

                else if (inch_water.isChecked()&&standard_atm2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.inch_water_tostandard_atm(value))) + "\t atm" );
                }else if (inch_water.isChecked()&&pascal.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.inch_water_topascal(value))) + "\t Pa");
                }else if (inch_water.isChecked()&&hectopascal2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.inch_water_tohectopascal(value))) + "\t hPa" );
                }else if (inch_water.isChecked()&&kilopascal2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.inch_water_tokilopascal(value))) + "\t kPa");
                }else if (inch_water.isChecked()&&megapascal2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.inch_water_tomegapascal(value))) + "\t MPa" );
                }else if (inch_water.isChecked()&&bar2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.inch_water_tobar(value))) + "\t bar");
                }else if (inch_water.isChecked()&&kg_force_sq_cm2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.inch_water_tokg_force_sqcm(value))) + "\t kgf/cm^2" );
                }else if (inch_water.isChecked()&&kg_force_sq_m2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.inch_water_tokg_force_sqm(value))) + "\t kgf/m^2" );
                }else if (inch_water.isChecked()&&psi2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.inch_water_topsi(value))) + "\t psi");
                }else if (inch_water.isChecked()&&ksi2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.inch_water_toksi(value))) + "\t ksi");
                }else if (inch_water.isChecked()&&torr2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.inch_water_totorr(value))) + "\t Torr" );
                }else if (inch_water.isChecked()&&inch_mecury2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.inch_water_toinch_mecury(value))) + "\t inchHg");
                }else if (inch_water.isChecked()&&millimeter_water2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.inch_water_tomillimeter_water(value))) + "\t mmH2O" );
                }else if (inch_water.isChecked()&&centimeter_water2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(pressure_Converter.inch_water_tocentimeter_water(value))) + "\t cmH2O" );
                }















            }
        }catch (Exception e){

        }


    }
}
