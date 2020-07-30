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

public class Weight extends AppCompatActivity {
    private ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(Constant.theme);
        setContentView(R.layout.activity_weight);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        actionBar = getSupportActionBar();
        actionBar.setTitle("Weight");

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

    public void Calculate_weight(View view){
        DecimalFormat textformat = new DecimalFormat("###,###,###,###,###,###.############");
        try{
            EditText text = (EditText) findViewById(R.id.distance_editText);
            TextView tview = (TextView)findViewById(R.id.distance_textView);
            // this is if we press the cancel button
            if(view.getId() == R.id.clear_button){
                text.setText("");tview.setText("");
                // this is if we press the convert button
            }else if (view.getId() == R.id.calulate_button){
                RadioButton microgram = (RadioButton)findViewById(R.id.microgram_radio);
                RadioButton microgram2 = (RadioButton)findViewById(R.id.microgram_radio2);
                RadioButton milligram = (RadioButton)findViewById(R.id.milligram_radio);
                RadioButton milligram2 = (RadioButton)findViewById(R.id.milligram_radio2);
                RadioButton gram = (RadioButton)findViewById(R.id.gram_radio);
                RadioButton gram2 = (RadioButton)findViewById(R.id.gram_radio2);
                RadioButton kilogram = (RadioButton)findViewById(R.id.kilogram_radio);
                RadioButton kilogram2 = (RadioButton)findViewById(R.id.kilogram_radio2);
                RadioButton pound = (RadioButton)findViewById(R.id.Pound_radio);
                RadioButton pound2 = (RadioButton)findViewById(R.id.Pound_radio2);
                RadioButton ounce = (RadioButton)findViewById(R.id.ounce_radio);
                RadioButton ounce2 = (RadioButton)findViewById(R.id.ounce_radio2);
                RadioButton grain = (RadioButton) findViewById(R.id.grain_radio);
                RadioButton grain2 = (RadioButton) findViewById(R.id.grain_radio2);
                RadioButton tonmetric = (RadioButton) findViewById(R.id.tonmetric_radio);
                RadioButton tonmetric2 = (RadioButton) findViewById(R.id.tonmetric_radio2);
                RadioButton ton_us = (RadioButton) findViewById(R.id.ton_us_radio);
                RadioButton ton_us2 = (RadioButton) findViewById(R.id.ton_us_radio2);
                RadioButton ton_uk = (RadioButton) findViewById(R.id.ton_uk_radio);
                RadioButton ton_uk2 = (RadioButton) findViewById(R.id.ton_uk_radio2);
                RadioButton stone = (RadioButton) findViewById(R.id.stone_radio);
                RadioButton stone2 = (RadioButton) findViewById(R.id.stone_radio2);
                RadioButton carat = (RadioButton) findViewById(R.id.carat);
                RadioButton carat2 = (RadioButton) findViewById(R.id.carat2);



                // this is if our text is empty
                if (text.getText().length()== 0){
                    Toast.makeText(this, "Please enter a valid number",
                            Toast.LENGTH_LONG ).show();
                    return;
                }else if (microgram.isChecked()&&microgram2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" + " microgram");
                } else if (milligram.isChecked()&&milligram2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +" mg");
                } else if (gram.isChecked()&&gram2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +" g");
                }else if (kilogram.isChecked()&&kilogram2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +" kg");
                }else if (pound.isChecked()&&pound2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +" lb");
                }else if (ounce.isChecked()&&ounce2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +" oz");
                }else if (grain.isChecked()&&grain2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +" gr");
                }else if (tonmetric.isChecked()&&tonmetric2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +" t ");
                }else if (ton_us.isChecked()&&ton_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" + " t (US)");
                }else if (ton_uk.isChecked()&&ton_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value))+ "\t"  + " t (UK)");
                }else if (stone.isChecked()&&stone2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value))+ "\t"  + " st");
                }else if (carat.isChecked()&&carat2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value))+ "\t"  + " c");
                }






                // if microgram and other radio button is click in second scroll

                else if (microgram.isChecked()&&milligram2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.microgram_tomilligram(value))) + "\t mg" );
                }else if (microgram.isChecked()&&gram2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.microgram_togram(value))) + "\t g");
                }else if (microgram.isChecked()&&kilogram2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.microgram_tokilogram(value))) + "\t kg");
                }else if (microgram.isChecked()&&pound2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.microgram_topound(value))) + "\t lb");
                }else if (microgram.isChecked()&&ounce2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.microgram_toounce(value))) + "\t oz");
                }else if (microgram.isChecked()&&grain2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.microgram_tograin(value))) + "\t gr");
                }else if (microgram.isChecked()&&tonmetric2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.microgram_totonmetric(value))) + "\t t");
                }else if (microgram.isChecked()&&ton_us2.isChecked()) {
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.microgram_toton_us(value))) + "\t t (US)");
                }else if (microgram.isChecked()&&ton_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.microgram_toton_uk(value))) + "\t t (UK)");
                }
                else if (microgram.isChecked()&&stone2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.microgram_tostone(value))) + "\t st");

                }else if (microgram.isChecked()&&carat2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.microgram_tocarat(value))) + "\t c" );

                }







                // if milligram and other radio button is click in second scroll

                else if (milligram.isChecked()&&microgram2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.milligram_tomicrogram(value))) + "\t microgram" );
                }else if (milligram.isChecked()&&gram2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.milligram_togram(value))) + "\t g");
                }else if (milligram.isChecked()&&kilogram2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.milligram_tokilogram(value))) + "\t kg");
                }else if (milligram.isChecked()&&pound2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.milligram_topound(value))) + "\t lb");
                }else if (milligram.isChecked()&&ounce2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.milligram_toounce(value))) + "\t oz");
                }else if (milligram.isChecked()&&grain2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.milligram_tograin(value))) + "\t gr");
                }else if (milligram.isChecked()&&tonmetric2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.milligram_totonmetric(value))) + "\t t");
                }else if (milligram.isChecked()&&ton_us2.isChecked()) {
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.milligram_toton_us(value))) + "\t t (US)");
                }else if (milligram.isChecked()&&ton_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.milligram_toton_uk(value))) + "\t t (UK)");
                }
                else if (milligram.isChecked()&&stone2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.milligram_tostone(value))) + "\t st");

                }else if (milligram.isChecked()&&carat2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.milligram_tocarat(value))) + "\t c" );

                }









                // if gram and other radio button is click in second scroll

                else if (gram.isChecked()&&microgram2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.gram_tomicrogram(value))) + "\t microgram" );
                }else if (gram.isChecked()&&milligram2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.gram_tomilligram(value))) + "\t mg");
                }else if (gram.isChecked()&&kilogram2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.gram_tokilogram(value))) + "\t kg");
                }else if (gram.isChecked()&&pound2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.gram_topound(value))) + "\t lb");
                }else if (gram.isChecked()&&ounce2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.gram_toounce(value))) + "\t oz");
                }else if (gram.isChecked()&&grain2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.gram_tograin(value))) + "\t gr");
                }else if (gram.isChecked()&&tonmetric2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.gram_totonmetric(value))) + "\t t");
                }else if (gram.isChecked()&&ton_us2.isChecked()) {
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.gram_toton_us(value))) + "\t t (US)");
                }else if (gram.isChecked()&&ton_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.gram_toton_uk(value))) + "\t t (UK)");
                }
                else if (gram.isChecked()&&stone2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.gram_tostone(value))) + "\t st");

                }else if (gram.isChecked()&&carat2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.gram_tocarat(value))) + "\t c" );

                }









                // if kilogram and other radio button is click in second scroll

                else if (kilogram.isChecked()&&microgram2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.kilogram_tomicrogram(value))) + "\t microgram" );
                }else if (kilogram.isChecked()&&milligram2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.kilogram_tomilligram(value))) + "\t mg");
                }else if (kilogram.isChecked()&&gram2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.kilogram_togram(value))) + "\t g");
                }else if (kilogram.isChecked()&&pound2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.kilogram_topound(value))) + "\t lb");
                }else if (kilogram.isChecked()&&ounce2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.kilogram_toounce(value))) + "\t oz");
                }else if (kilogram.isChecked()&&grain2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.kilogram_tograin(value))) + "\t gr");
                }else if (kilogram.isChecked()&&tonmetric2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.kilogram_totonmetric(value))) + "\t t");
                }else if (kilogram.isChecked()&&ton_us2.isChecked()) {
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.kilogram_toton_us(value))) + "\t t (US)");
                }else if (kilogram.isChecked()&&ton_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.kilogram_toton_uk(value))) + "\t t (UK)");
                }
                else if (kilogram.isChecked()&&stone2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.kilogram_tostone(value))) + "\t st");

                }else if (kilogram.isChecked()&&carat2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.kilogram_tocarat(value))) + "\t c" );

                }








                // if pound and other radio button is click in second scroll

                else if (pound.isChecked()&&microgram2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.pound_tomicrogram(value))) + "\t microgram" );
                }else if (pound.isChecked()&&milligram2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.pound_tomilligram(value))) + "\t mg");
                }else if (pound.isChecked()&&gram2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.pound_togram(value))) + "\t g");
                }else if (pound.isChecked()&&kilogram2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.pound_tokilogram(value))) + "\t kg");
                }else if (pound.isChecked()&&ounce2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.pound_toounce(value))) + "\t oz");
                }else if (pound.isChecked()&&grain2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.pound_tograin(value))) + "\t gr");
                }else if (pound.isChecked()&&tonmetric2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.pound_totonmetric(value))) + "\t t");
                }else if (pound.isChecked()&&ton_us2.isChecked()) {
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.pound_toton_us(value))) + "\t t (US)");
                }else if (pound.isChecked()&&ton_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.pound_toton_uk(value))) + "\t t (UK)");
                }
                else if (pound.isChecked()&&stone2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.pound_tostone(value))) + "\t st");

                }else if (pound.isChecked()&&carat2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.pound_tocarat(value))) + "\t c" );

                }








                // if ounce and other radio button is click in second scroll

                else if (ounce.isChecked()&&microgram2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.ounce_tomicrogram(value))) + "\t microgram" );
                }else if (ounce.isChecked()&&milligram2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.ounce_tomilligram(value))) + "\t mg");
                }else if (ounce.isChecked()&&gram2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.ounce_togram(value))) + "\t g");
                }else if (ounce.isChecked()&&kilogram2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.ounce_tokilogram(value))) + "\t kg");
                }else if (ounce.isChecked()&&pound2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.ounce_topound(value))) + "\t lb");
                }else if (ounce.isChecked()&&grain2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.ounce_tograin(value))) + "\t gr");
                }else if (ounce.isChecked()&&tonmetric2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.ounce_totonmetric(value))) + "\t t");
                }else if (ounce.isChecked()&&ton_us2.isChecked()) {
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.ounce_toton_us(value))) + "\t t (US)");
                }else if (ounce.isChecked()&&ton_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.ounce_toton_uk(value))) + "\t t (UK)");
                }
                else if (ounce.isChecked()&&stone2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.ounce_tostone(value))) + "\t st");

                }else if (ounce.isChecked()&&carat2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.ounce_tocarat(value))) + "\t c" );

                }








                // if grain and other radio button is click in second scroll

                else if (grain.isChecked()&&microgram2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.grain_tomicrogram(value))) + "\t microgram" );
                }else if (grain.isChecked()&&milligram2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.grain_tomilligram(value))) + "\t mg");
                }else if (grain.isChecked()&&gram2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.grain_togram(value))) + "\t g");
                }else if (grain.isChecked()&&kilogram2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.grain_tokilogram(value))) + "\t kg");
                }else if (grain.isChecked()&&pound2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.grain_topound(value))) + "\t lb");
                }else if (grain.isChecked()&&ounce2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.grain_toounce(value))) + "\t oz");
                }else if (grain.isChecked()&&tonmetric2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.grain_totonmetric(value))) + "\t t");
                }else if (grain.isChecked()&&ton_us2.isChecked()) {
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.grain_toton_us(value))) + "\t t (US)");
                }else if (grain.isChecked()&&ton_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.grain_toton_uk(value))) + "\t t (UK)");
                }
                else if (grain.isChecked()&&stone2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.grain_tostone(value))) + "\t st");

                }else if (grain.isChecked()&&carat2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.grain_tocarat(value))) + "\t c" );

                }








                // if tonmetric and other radio button is click in second scroll

                else if (tonmetric.isChecked()&&microgram2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.tonmetric_tomicrogram(value))) + "\t microgram" );
                }else if (tonmetric.isChecked()&&milligram2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.tonmetric_tomilligram(value))) + "\t mg");
                }else if (tonmetric.isChecked()&&gram2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.tonmetric_togram(value))) + "\t g");
                }else if (tonmetric.isChecked()&&kilogram2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.tonmetric_tokilogram(value))) + "\t kg");
                }else if (tonmetric.isChecked()&&pound2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.tonmetric_topound(value))) + "\t lb");
                }else if (tonmetric.isChecked()&&ounce2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.tonmetric_toounce(value))) + "\t oz");
                }else if (tonmetric.isChecked()&&grain2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.tonmetric_tograin(value))) + "\t gr");
                }else if (tonmetric.isChecked()&&ton_us2.isChecked()) {
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.tonmetric_toton_us(value))) + "\t t (US)");
                }else if (tonmetric.isChecked()&&ton_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.tonmetric_toton_uk(value))) + "\t t (UK)");
                }
                else if (tonmetric.isChecked()&&stone2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.tonmetric_tostone(value))) + "\t st");

                }else if (tonmetric.isChecked()&&carat2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.tonmetric_tocarat(value))) + "\t c" );

                }











                // if ton_us and other radio button is click in second scroll

                else if (ton_us.isChecked()&&microgram2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.ton_us_tomicrogram(value))) + "\t microgram" );
                }else if (ton_us.isChecked()&&milligram2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.ton_us_tomilligram(value))) + "\t mg");
                }else if (ton_us.isChecked()&&gram2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.ton_us_togram(value))) + "\t g");
                }else if (ton_us.isChecked()&&kilogram2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.ton_us_tokilogram(value))) + "\t kg");
                }else if (ton_us.isChecked()&&pound2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.ton_us_topound(value))) + "\t lb");
                }else if (ton_us.isChecked()&&ounce2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.ton_us_toounce(value))) + "\t oz");
                }else if (ton_us.isChecked()&&grain2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.ton_us_tograin(value))) + "\t gr");
                }else if (ton_us.isChecked()&&tonmetric2.isChecked()) {
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.ton_us_totonmetric(value))) + "\t t");
                }else if (ton_us.isChecked()&&ton_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.ton_us_toton_uk(value))) + "\t t (UK)");
                }
                else if (ton_us.isChecked()&&stone2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.ton_us_tostone(value))) + "\t st");

                }else if (ton_us.isChecked()&&carat2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.ton_us_tocarat(value))) + "\t c" );

                }








                // if ton_uk and other radio button is click in second scroll

                else if (ton_uk.isChecked()&&microgram2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.ton_uk_tomicrogram(value))) + "\t microgram" );
                }else if (ton_uk.isChecked()&&milligram2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.ton_uk_tomilligram(value))) + "\t mg");
                }else if (ton_uk.isChecked()&&gram2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.ton_uk_togram(value))) + "\t g");
                }else if (ton_uk.isChecked()&&kilogram2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.ton_uk_tokilogram(value))) + "\t kg");
                }else if (ton_uk.isChecked()&&pound2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.ton_uk_topound(value))) + "\t lb");
                }else if (ton_uk.isChecked()&&ounce2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.ton_uk_toounce(value))) + "\t oz");
                }else if (ton_uk.isChecked()&&grain2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.ton_uk_tograin(value))) + "\t gr");
                }else if (ton_uk.isChecked()&&tonmetric2.isChecked()) {
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.ton_uk_totonmetric(value))) + "\t t");
                }else if (ton_uk.isChecked()&&ton_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.ton_uk_toton_us(value))) + "\t t (US)");
                }
                else if (ton_uk.isChecked()&&stone2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.ton_uk_tostone(value))) + "\t st");

                }else if (ton_uk.isChecked()&&carat2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.ton_uk_tocarat(value))) + "\t c" );

                }









                // if stone and other radio button is click in second scroll

                else if (stone.isChecked()&&microgram2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.stone_tomicrogram(value))) + "\t microgram" );
                }else if (stone.isChecked()&&milligram2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.stone_tomilligram(value))) + "\t mg");
                }else if (stone.isChecked()&&gram2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.stone_togram(value))) + "\t g");
                }else if (stone.isChecked()&&kilogram2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.stone_tokilogram(value))) + "\t kg");
                }else if (stone.isChecked()&&pound2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.stone_topound(value))) + "\t lb");
                }else if (stone.isChecked()&&ounce2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.stone_toounce(value))) + "\t oz");
                }else if (stone.isChecked()&&grain2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.stone_tograin(value))) + "\t gr");
                }else if (stone.isChecked()&&tonmetric2.isChecked()) {
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.stone_totonmetric(value))) + "\t t");
                }else if (stone.isChecked()&&ton_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.stone_toton_us(value))) + "\t t (US)");
                }
                else if (stone.isChecked()&&ton_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.stone_toton_uk(value))) + "\t t (UK)");

                }else if (stone.isChecked()&&carat2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.stone_tocarat(value))) + "\t c" );

                }










                // if carat and other radio button is click in second scroll

                else if (carat.isChecked()&&microgram2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.carat_tomicrogram(value))) + "\t microgram" );
                }else if (carat.isChecked()&&milligram2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.carat_tomilligram(value))) + "\t mg");
                }else if (carat.isChecked()&&gram2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.carat_togram(value))) + "\t g");
                }else if (carat.isChecked()&&kilogram2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.carat_tokilogram(value))) + "\t kg");
                }else if (carat.isChecked()&&pound2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.carat_topound(value))) + "\t lb");
                }else if (carat.isChecked()&&ounce2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.carat_toounce(value))) + "\t oz");
                }else if (carat.isChecked()&&grain2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.carat_tograin(value))) + "\t gr");
                }else if (carat.isChecked()&&tonmetric2.isChecked()) {
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.carat_totonmetric(value))) + "\t t");
                }else if (carat.isChecked()&&ton_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.carat_toton_us(value))) + "\t t (US)");
                }
                else if (carat.isChecked()&&ton_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.carat_toton_uk(value))) + "\t t (UK)");

                }else if (carat.isChecked()&&stone2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(weight_Converter.carat_tostone(value))) + "\t c" );

                }






















            }


        }catch (Exception e){

        }
    }

}
