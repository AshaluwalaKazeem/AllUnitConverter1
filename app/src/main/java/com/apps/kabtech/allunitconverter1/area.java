package com.apps.kabtech.allunitconverter1;


import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
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

public class area extends AppCompatActivity {

    private ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(Constant.theme);
        setContentView(R.layout.activity_area);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        actionBar = getSupportActionBar();
        actionBar.setTitle("Area");

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

    public void Calculate_area(View view){
        DecimalFormat textformat = new DecimalFormat("###,###,###,###,###,###.############");
        try{
            EditText text = (EditText) findViewById(R.id.distance_editText);
            TextView tview = (TextView)findViewById(R.id.distance_textView);
            // this is if we press the cancel button
            if(view.getId() == R.id.clear_button){
                text.setText("");
                tview.setText("");
                // this is if we press the convert button
            }else if (view.getId() == R.id.calulate_button){
                RadioButton sqMilli = (RadioButton)findViewById(R.id.squareMillimeter_radio);
                RadioButton sqMilli2 = (RadioButton)findViewById(R.id.squareMillimeter_radio2);
                RadioButton sqCent = (RadioButton)findViewById(R.id.squareCentimeter_radio);
                RadioButton sqCent2 = (RadioButton)findViewById(R.id.squareCentimeter_radio2);
                RadioButton sqMeter = (RadioButton)findViewById(R.id.squareMeter_radio);
                RadioButton sqMeter2 = (RadioButton)findViewById(R.id.squareMeter_radio2);
                RadioButton sqKillom = (RadioButton)findViewById(R.id.squareKilometer_radio);
                RadioButton sqKillom2 = (RadioButton)findViewById(R.id.squareKilometer_radio2);
                RadioButton sqMile = (RadioButton)findViewById(R.id.squareMile_radio);
                RadioButton sqMile2 = (RadioButton)findViewById(R.id.squareMile_radio2);
                RadioButton sqInch = (RadioButton)findViewById(R.id.squareInch_radio);
                RadioButton sqInch2 = (RadioButton)findViewById(R.id.squareInch_radio2);
                RadioButton sqFoot = (RadioButton) findViewById(R.id.squareFoot_radio);
                RadioButton sqFoot2 = (RadioButton) findViewById(R.id.squareFoot_radio2);
                RadioButton sqYard = (RadioButton) findViewById(R.id.squareYard_radio);
                RadioButton sqYard2 = (RadioButton) findViewById(R.id.squareYard_radio2);
                RadioButton Hectare = (RadioButton) findViewById(R.id.hectare_radio);
                RadioButton Hectare2 = (RadioButton) findViewById(R.id.hectare_radio2);
                RadioButton Acre = (RadioButton) findViewById(R.id.acre_radio);
                RadioButton Acre2 = (RadioButton) findViewById(R.id.acre_radio2);

                // this is if our text is empty
                if (text.getText().length()== 0){
                    Toast.makeText(this, "Please enter a valid number",
                            Toast.LENGTH_LONG ).show();
                    return;
                }else if (sqMilli.isChecked()&&sqMilli2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" + Html.fromHtml(Helper.squareMilli));
                } else if (sqCent.isChecked()&&sqCent2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +Html.fromHtml(Helper.centimeterSq));
                } else if (sqMeter.isChecked()&&sqMeter2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +Html.fromHtml(Helper.metersq));
                }else if (sqKillom.isChecked()&&sqKillom2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +Html.fromHtml(Helper.kilomsq));
                }else if (sqMile.isChecked()&&sqMile2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +Html.fromHtml(Helper.squareMilli));
                }else if (sqInch.isChecked()&&sqInch2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +Html.fromHtml(Helper.inchsq));
                }else if (sqFoot.isChecked()&&sqFoot2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +Html.fromHtml(Helper.footsq));
                }else if (sqYard.isChecked()&&sqYard2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +Html.fromHtml(Helper.yardsq));
                }else if (Hectare.isChecked()&&Hectare2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t ha");
                }else if (Acre.isChecked()&&Acre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t ac");
                }
                // if sqMilli and other radio button is click in second scroll
                else if (sqMilli.isChecked()&&sqCent2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqMilli_tosqCent(value))) + "\t" +Html.fromHtml(Helper.centimeterSq));
                }else if (sqMilli.isChecked()&&sqMeter2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqMilli_tosqMeter(value))) + "\t" +Html.fromHtml(Helper.metersq));
                }else if (sqMilli.isChecked()&&sqKillom2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqMilli_tosqKilometer(value))) + "\t" +Html.fromHtml(Helper.kilomsq));
                }else if (sqMilli.isChecked()&&sqMile2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqMilli_tosqMile(value))) + "\t" +Html.fromHtml(Helper.milesq));
                }else if (sqMilli.isChecked()&&sqInch2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqMilli_tosqInch(value))) + "\t" +Html.fromHtml(Helper.inchsq));
                }else if (sqMilli.isChecked()&&sqFoot2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqMilli_tosqFoot(value))) + "\t" +Html.fromHtml(Helper.footsq));
                }else if (sqMilli.isChecked()&&sqYard2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqMilli_tosqYard(value))) + "\t" +Html.fromHtml(Helper.yardsq));
                }else if (sqMilli.isChecked()&&Hectare2.isChecked()) {
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqMilli_toHectare(value))) + "\t ha");
                }else if (sqMilli.isChecked()&&Acre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqMilli_toAcre(value))) + "\t ac");

                }
                // if sqcent and other radio button is click in second scroll
                else if (sqCent.isChecked()&&sqMilli2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqCent_tosqMill(value))) + "\t" +Html.fromHtml(Helper.squareMilli));

                }else if (sqCent.isChecked()&&sqMeter2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqCent_tosqMeter(value))) + "\t" +Html.fromHtml(Helper.metersq));

                }else if (sqCent.isChecked()&&sqKillom2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqCent_tosqKilometer(value))) + "\t" +Html.fromHtml(Helper.kilomsq));

                }else if (sqCent.isChecked()&&sqMile2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqCent_tosqMile(value))) + "\t" +Html.fromHtml(Helper.milesq));

                }else if (sqCent.isChecked()&&sqInch2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqCent_tosqInch(value))) + "\t" +Html.fromHtml(Helper.inchsq));

                }else if (sqCent.isChecked()&&sqFoot2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqCent_tosqFoot(value))) + "\t" +Html.fromHtml(Helper.footsq));

                }else if (sqCent.isChecked()&&sqYard2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqCent_tosqYard(value))) + "\t" +Html.fromHtml(Helper.yardsq));

                }else if (sqCent.isChecked()&&Hectare2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqCent_toHactare(value))) + "\t ha");

                }else if (sqCent.isChecked()&&Acre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqCent_toAcre(value))) + "\t ac");

                }




                // if sqMeter and other radio button is click in second scroll
                else if (sqMeter.isChecked()&&sqMilli2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqMeter_tosqMill(value))) + "\t" +Html.fromHtml(Helper.squareMilli));

                }else if (sqMeter.isChecked()&&sqCent2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqMeter_tosqCent(value))) + "\t" +Html.fromHtml(Helper.centimeterSq));

                }else if (sqMeter.isChecked()&&sqKillom2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqMeter_tosqKilometer(value))) + "\t" +Html.fromHtml(Helper.kilomsq));

                }else if (sqMeter.isChecked()&&sqMile2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqMeter_tosqMile(value))) + "\t" +Html.fromHtml(Helper.milesq));

                }else if (sqMeter.isChecked()&&sqInch2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqMeter_tosqInch(value))) + "\t" +Html.fromHtml(Helper.inchsq));

                }else if (sqMeter.isChecked()&&sqFoot2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqMeter_tosqFoot(value))) + "\t" +Html.fromHtml(Helper.footsq));

                }else if (sqMeter.isChecked()&&sqYard2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqMeter_tosqYard(value))) + "\t" +Html.fromHtml(Helper.yardsq));

                }else if (sqMeter.isChecked()&&Hectare2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqMeter_toHactare(value))) + "\t ha");

                }else if (sqMeter.isChecked()&&Acre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqMeter_toAcre(value))) + "\t ac");

                }



                // if sqKilometer and other radio button is click in second scroll
                else if (sqKillom.isChecked()&&sqMilli2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqKilometer_tosqMill(value))) + "\t" +Html.fromHtml(Helper.squareMilli));

                }else if (sqKillom.isChecked()&&sqCent2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqKilometer_tosqCent(value))) + "\t" +Html.fromHtml(Helper.centimeterSq));

                }else if (sqKillom.isChecked()&&sqMeter2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqKilometer_tosqMeter(value))) + "\t" +Html.fromHtml(Helper.metersq));

                }else if (sqKillom.isChecked()&&sqMile2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqKilometer_tosqMile(value))) + "\t" +Html.fromHtml(Helper.milesq));

                }else if (sqKillom.isChecked()&&sqInch2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqKilometer_tosqInch(value))) + "\t" +Html.fromHtml(Helper.inchsq));

                }else if (sqKillom.isChecked()&&sqFoot2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqKilometer_tosqFoot(value))) + "\t" +Html.fromHtml(Helper.footsq));

                }else if (sqKillom.isChecked()&&sqYard2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqKilometer_tosqYard(value))) + "\t" +Html.fromHtml(Helper.yardsq));

                }else if (sqKillom.isChecked()&&Hectare2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqKilometer_toHactare(value))) + "\t ha");

                }else if (sqKillom.isChecked()&&Acre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqKilometer_toAcre(value))) + "\t ac");

                }



                // if sqmile and other radio button is click in second scroll
                else if (sqMile.isChecked()&&sqMilli2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqMile_tosqMill(value))) + "\t" +Html.fromHtml(Helper.squareMilli));

                }else if (sqMile.isChecked()&&sqCent2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqMile_tosqCent(value))) + "\t" +Html.fromHtml(Helper.centimeterSq));

                }else if (sqMile.isChecked()&&sqMeter2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqMile_tosqMeter(value))) + "\t" +Html.fromHtml(Helper.metersq));

                }else if (sqMile.isChecked()&&sqKillom2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqMile_tosqKilometer(value))) + "\t" +Html.fromHtml(Helper.kilomsq));

                }else if (sqMile.isChecked()&&sqInch2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqMile_tosqInch(value))) + "\t" +Html.fromHtml(Helper.inchsq));

                }else if (sqMile.isChecked()&&sqFoot2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqMile_tosqFoot(value))) + "\t" +Html.fromHtml(Helper.footsq));

                }else if (sqMile.isChecked()&&sqYard2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqMile_tosqYard(value))) + "\t" +Html.fromHtml(Helper.yardsq));

                }else if (sqMile.isChecked()&&Hectare2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqMile_toHactare(value))) + "\t ha");

                }else if (sqMile.isChecked()&&Acre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqMile_toAcre(value))) + "\t ac");

                }



                // if sqinch and other radio button is click in second scroll
                else if (sqInch.isChecked()&&sqMilli2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqInch_tosqMill(value))) + "\t" +Html.fromHtml(Helper.squareMilli));

                }else if (sqInch.isChecked()&&sqCent2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqInch_tosqCent(value))) + "\t" +Html.fromHtml(Helper.centimeterSq));

                }else if (sqInch.isChecked()&&sqMeter2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqInch_tosqMeter(value))) + "\t" +Html.fromHtml(Helper.metersq));

                }else if (sqInch.isChecked()&&sqKillom2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqInch_tosqKilometer(value))) + "\t" +Html.fromHtml(Helper.kilomsq));

                }else if (sqInch.isChecked()&&sqMile2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqInch_tosqMile(value))) + "\t" +Html.fromHtml(Helper.milesq));

                }else if (sqInch.isChecked()&&sqFoot2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqInch_tosqFoot(value))) + "\t" +Html.fromHtml(Helper.footsq));

                }else if (sqInch.isChecked()&&sqYard2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqInch_tosqYard(value))) + "\t" +Html.fromHtml(Helper.yardsq));

                }else if (sqInch.isChecked()&&Hectare2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqInch_toHactare(value))) + "\t ha");

                }else if (sqInch.isChecked()&&Acre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqInch_toAcre(value))) + "\t ac");

                }





                // if sqFoot and other radio button is click in second scroll
                else if (sqFoot.isChecked()&&sqMilli2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqFoot_tosqMilli(value))) + "\t" +Html.fromHtml(Helper.squareMilli));

                }else if (sqFoot.isChecked()&&sqCent2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqFoot_tosqCent(value))) + "\t" +Html.fromHtml(Helper.centimeterSq));

                }else if (sqFoot.isChecked()&&sqMeter2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqFoot_tosqMeter(value))) + "\t" +Html.fromHtml(Helper.metersq));

                }else if (sqFoot.isChecked()&&sqKillom2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqFoot_tosqKilometer(value))) + "\t" +Html.fromHtml(Helper.kilomsq));

                }else if (sqFoot.isChecked()&&sqMile2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqFoot_tosqMile(value))) + "\t" +Html.fromHtml(Helper.milesq));

                }else if (sqFoot.isChecked()&&sqInch2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqFoot_tosqInch(value))) + "\t" +Html.fromHtml(Helper.inchsq));

                }else if (sqFoot.isChecked()&&sqYard2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqFoot_tosqYard(value))) + "\t" +Html.fromHtml(Helper.yardsq));

                }else if (sqFoot.isChecked()&&Hectare2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqFoot_toHectare(value))) + "\t ha");

                }else if (sqFoot.isChecked()&&Acre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqFoot_toAcre(value))) + "\t ac");

                }



                // if sqYard and other radio button is click in second scroll
                else if (sqYard.isChecked()&&sqMilli2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqYard_tosqMilli(value))) + "\t" +Html.fromHtml(Helper.squareMilli));

                }else if (sqYard.isChecked()&&sqCent2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqYard_tosqCent(value))) + "\t" +Html.fromHtml(Helper.centimeterSq));

                }else if (sqYard.isChecked()&&sqMeter2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqYard_tosqMeter(value))) + "\t" +Html.fromHtml(Helper.metersq));

                }else if (sqYard.isChecked()&&sqKillom2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqYard_tosqKilmeter(value))) + "\t" +Html.fromHtml(Helper.kilomsq));

                }else if (sqYard.isChecked()&&sqMile2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqYard_tosqMeter(value))) + "\t" +Html.fromHtml(Helper.metersq));

                }else if (sqYard.isChecked()&&sqInch2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqYard_tosqInch(value))) + "\t" +Html.fromHtml(Helper.inchsq));

                }else if (sqYard.isChecked()&&sqFoot2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqYard_tosqFoot(value))) + "\t" +Html.fromHtml(Helper.footsq));

                }else if (sqYard.isChecked()&&Hectare2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqYard_toHectare(value))) + "\t ha");

                }else if (sqYard.isChecked()&&Acre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.sqYard_toAcre(value))) + "\t ac");

                }



                // if Hectare and other radio button is click in second scroll
                else if (Hectare.isChecked()&&sqMilli2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.Hect_tosqMilli(value))) + "\t" +Html.fromHtml(Helper.squareMilli));

                }else if (Hectare.isChecked()&&sqCent2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.Hect_tosqCent(value))) + "\t" +Html.fromHtml(Helper.centimeterSq));

                }else if (Hectare.isChecked()&&sqMeter2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.Hect_tosqMeter(value))) + "\t" +Html.fromHtml(Helper.metersq));

                }else if (Hectare.isChecked()&&sqKillom2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.Hect_tosqKilometer(value))) + "\t" +Html.fromHtml(Helper.kilomsq));

                }else if (Hectare.isChecked()&&sqMile2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.Hect_tosqMile(value))) + "\t" +Html.fromHtml(Helper.milesq));

                }else if (Hectare.isChecked()&&sqInch2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.Hect_tosqInch(value))) + "\t" +Html.fromHtml(Helper.inchsq));

                }else if (Hectare.isChecked()&&sqFoot2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.Hect_tosqFoot(value))) + "\t" +Html.fromHtml(Helper.footsq));

                }else if (Hectare.isChecked()&&sqYard.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.Hect_tosqYard(value))) + "\t" +Html.fromHtml(Helper.yardsq));

                }else if (Hectare.isChecked()&&Acre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.Hect_toAcre(value))) + "\t ac");

                }




                // if Acre and other radio button is click in second scroll
                else if (Acre.isChecked()&&sqMilli2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.Acre_tosqMilli(value))) + "\t" +Html.fromHtml(Helper.squareMilli));

                }else if (Acre.isChecked()&&sqCent2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.Acre_tosqCent(value))) + "\t" +Html.fromHtml(Helper.centimeterSq));

                }else if (Acre.isChecked()&&sqMeter2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.Acre_tosqMeter(value))) + "\t" +Html.fromHtml(Helper.metersq));

                }else if (Acre.isChecked()&&sqKillom2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.Acre_tosqKilometer(value))) + "\t" +Html.fromHtml(Helper.kilomsq));

                }else if (Acre.isChecked()&&sqMile2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.Acre_tosqMile(value))) + "\t" +Html.fromHtml(Helper.milesq));

                }else if (Acre.isChecked()&&sqInch2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.Acre_tosqInch(value))) + "\t" +Html.fromHtml(Helper.inchsq));

                }else if (Acre.isChecked()&&sqFoot2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.Acre_tosqFoot(value))) + "\t" +Html.fromHtml(Helper.footsq));

                }else if (Acre.isChecked()&&sqYard2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.Acre_tosqyard(value))) + "\t" +Html.fromHtml(Helper.yardsq));

                }else if (Acre.isChecked()&&Hectare2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Area_Converter.Acre_toHectare(value))) + "\t ha");

                }








            }


        }catch (Exception e){

        }
    }
}
