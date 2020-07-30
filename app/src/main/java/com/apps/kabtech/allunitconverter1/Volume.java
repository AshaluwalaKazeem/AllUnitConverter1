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

public class Volume extends AppCompatActivity {
    private ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(Constant.theme);
        setContentView(R.layout.activity_volume);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        actionBar = getSupportActionBar();
        actionBar.setTitle("Volume");


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

    public void Calculate_volume(View view){
        DecimalFormat textformat = new DecimalFormat("###,###,###,###,###,###.############");
        try{
            EditText text = (EditText) findViewById(R.id.distance_editText);
            TextView tview = (TextView)findViewById(R.id.distance_textView);
            // this is if we press the cancel button
            if(view.getId() == R.id.clear_button){
                text.setText("");tview.setText("");
                // this is if we press the convert button
            }else if (view.getId() == R.id.calulate_button){
                RadioButton teaspoon = (RadioButton)findViewById(R.id.teaspoon_radio);
                RadioButton teaspoon2 = (RadioButton)findViewById(R.id.teaspoon_radio2);
                RadioButton tablespooon = (RadioButton)findViewById(R.id.tablespoon_radio);
                RadioButton tablespooon2 = (RadioButton)findViewById(R.id.tablespoon_radio2);
                RadioButton cup = (RadioButton)findViewById(R.id.cup_radio);
                RadioButton cup2 = (RadioButton)findViewById(R.id.cup_radio2);
                RadioButton fluid_ounce_us = (RadioButton)findViewById(R.id.fluidounce_us_radio);
                RadioButton fluid_ounce_us2 = (RadioButton)findViewById(R.id.fluidounce_us_radio2);
                RadioButton fluid_ounce_uk = (RadioButton)findViewById(R.id.fluidounce_uk_radio);
                RadioButton fluid_ounce_uk2 = (RadioButton)findViewById(R.id.fluidounce_uk_radio2);
                RadioButton pint_us = (RadioButton)findViewById(R.id.pint_us_radio);
                RadioButton pint_us2 = (RadioButton)findViewById(R.id.pint_us_radio2);
                RadioButton pint_uk = (RadioButton) findViewById(R.id.pint_uk_radio);
                RadioButton pint_uk2 = (RadioButton) findViewById(R.id.pint_uk_radio2);
                RadioButton quart_us = (RadioButton) findViewById(R.id.quart_us_radio);
                RadioButton quart_us2 = (RadioButton) findViewById(R.id.quart_us_radio2);
                RadioButton quart_uk = (RadioButton) findViewById(R.id.quart_uk_radio);
                RadioButton quart_uk2 = (RadioButton) findViewById(R.id.quart_uk_radio2);
                RadioButton gallon_us = (RadioButton) findViewById(R.id.gallon_us_radio);
                RadioButton gallon_us2 = (RadioButton) findViewById(R.id.gallon_us_radio2);
                RadioButton gallon_uk = (RadioButton) findViewById(R.id.gallon_uk_radio);
                RadioButton gallon_uk2 = (RadioButton) findViewById(R.id.gallon_uk_radio2);
                RadioButton barrel = (RadioButton) findViewById(R.id.barrel_radio);
                RadioButton barrel2 = (RadioButton) findViewById(R.id.barrel_radio2);
                RadioButton millilitre = (RadioButton) findViewById(R.id.millilitre_radio);
                RadioButton millilitre2 = (RadioButton) findViewById(R.id.millilitre_radio2);
                RadioButton litre = (RadioButton) findViewById(R.id.litre_radio);
                RadioButton litre2 = (RadioButton) findViewById(R.id.litre_radio2);
                RadioButton cubic_cm = (RadioButton) findViewById(R.id.cubic_cm_radio);
                RadioButton cubic_cm2 = (RadioButton) findViewById(R.id.cubic_cm_radio2);
                RadioButton cubic_meter = (RadioButton) findViewById(R.id.cubic_meter_radio);
                RadioButton cubic_meter2 = (RadioButton) findViewById(R.id.cubic_meter_radio2);
                RadioButton cubic_inch = (RadioButton) findViewById(R.id.cubic_inch_radio);
                RadioButton cubic_inch2 = (RadioButton) findViewById(R.id.cubic_inch_radio2);
                RadioButton cubic_foot = (RadioButton) findViewById(R.id.cubic_foot_radio);
                RadioButton cubic_foot2 = (RadioButton) findViewById(R.id.cubic_foot_radio2);
                RadioButton cubic_yard = (RadioButton) findViewById(R.id.cubic_yard_radio);
                RadioButton cubic_yard2 = (RadioButton) findViewById(R.id.cubic_yard_radio2);



                // this is if our text is empty
                if (text.getText().length()== 0){
                    Toast.makeText(this, "Please enter a valid number",
                            Toast.LENGTH_LONG ).show();
                    return;
                }else if (teaspoon.isChecked()&&teaspoon2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" + " tsp");
                } else if (tablespooon.isChecked()&&tablespooon2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +" tbsp");
                } else if (cup.isChecked()&&cup2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +" c");
                }else if (fluid_ounce_us.isChecked()&&fluid_ounce_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +" fl oz(US)");
                }else if (fluid_ounce_uk.isChecked()&&fluid_ounce_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +" fl oz(UK)");
                }else if (pint_us.isChecked()&&pint_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +" pt (US)");
                }else if (pint_uk.isChecked()&&pint_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +" pt (UK)");
                }else if (quart_us.isChecked()&&quart_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +" qt (US)");
                }else if (quart_uk.isChecked()&&quart_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" + " qt (UK)");
                }else if (gallon_us.isChecked()&&gallon_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value))+ "\t"  + " gal (US)");
                }else if (gallon_uk.isChecked()&&gallon_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value))+ "\t"  + " gal (UK)");
                }else if (barrel.isChecked()&&barrel2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value))+ "\t"  + " bbl");
                }else if (millilitre.isChecked()&&millilitre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value))+ "\t"  + " mL");
                }else if (litre.isChecked()&&litre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value))+ "\t"  + " L");
                }else if (cubic_cm.isChecked()&&cubic_cm2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t " + Html.fromHtml(Helper.cubic_cm));
                }else if (cubic_meter.isChecked()&&cubic_meter2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t " +Html.fromHtml(Helper.cubic_meter));
                }else if (cubic_inch.isChecked()&&cubic_inch2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t " +Html.fromHtml(Helper.cubic_inch));
                }else if (cubic_foot.isChecked()&&cubic_foot2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t " +Html.fromHtml(Helper.cubic_foot));
                }else if (cubic_yard.isChecked()&&cubic_yard2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t " +Html.fromHtml(Helper.cubic_yard));
                }







                // if teaspoon and other radio button is click in second scroll

                else if (teaspoon.isChecked()&&tablespooon2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.teaspoon_totablespoon(value))) + "\t tbsp" );
                }else if (teaspoon.isChecked()&&cup2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.teaspoon_tocup(value))) + "\t c");
                }else if (teaspoon.isChecked()&&fluid_ounce_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.teaspoon_tofluidounce_us(value))) + "\t fl oz(US)");
                }else if (teaspoon.isChecked()&&fluid_ounce_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.teaspoon_tofluidounce_uk(value))) + "\t fl oz(UK)");
                }else if (teaspoon.isChecked()&&pint_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.teaspoon_topint_us(value))) + "\t pt (US)");
                }else if (teaspoon.isChecked()&&pint_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.teaspoon_topint_uk(value))) + "\t pt (UK)");
                }else if (teaspoon.isChecked()&&quart_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.teaspoon_toquart_us(value))) + "\t qt (US)");
                }else if (teaspoon.isChecked()&&quart_uk2.isChecked()) {
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.teaspoon_toquart_uk(value))) + "\t qt (UK)");
                }else if (teaspoon.isChecked()&&gallon_us.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.teaspoon_togallon_us(value))) + "\t gal (US)");
                }
                else if (teaspoon.isChecked()&&gallon_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.teaspoon_togallon_uk(value))) + "\t gal (UK)");

                }else if (teaspoon.isChecked()&&barrel2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.teaspoon_tobarrel(value))) + "\t bbl" );

                }else if (teaspoon.isChecked()&&millilitre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.teaspoon_tomillilitre(value))) + "\t mL");

                }else if (teaspoon.isChecked()&&litre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.teaspoon_tolitre(value))) + "\t L");

                }else if (teaspoon.isChecked()&&cubic_cm2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.teaspoon_tocubic_cm(value))) + "\t " +Html.fromHtml(Helper.cubic_cm));

                }else if (teaspoon.isChecked()&&cubic_meter2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.teaspoon_tocubic_meter(value))) + "\t" +Html.fromHtml(Helper.cubic_meter));

                }else if (teaspoon.isChecked()&&cubic_inch2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.teaspoon_tocubic_inch(value))) + "\t" +Html.fromHtml(Helper.cubic_inch));

                }else if (teaspoon.isChecked()&&cubic_foot2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.teaspoon_tocubic_foot(value))) + "\t" +Html.fromHtml(Helper.cubic_foot));

                }else if (teaspoon.isChecked()&&cubic_yard2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.teaspoon_tocubic_yard(value))) + "\t" +Html.fromHtml(Helper.cubic_yard));

                }



                // if tablespoon and other radio button is click in second scroll
                else if (tablespooon.isChecked()&&teaspoon2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.tablespoon_toteaspoon(value))) + "\t tsp" );
                }else if (tablespooon.isChecked()&&cup2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.tablespoon_tocup(value))) + "\t c");
                }else if (tablespooon.isChecked()&&fluid_ounce_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.tablespoon_tofluidounce_us(value))) + "\t fl oz(US)");
                }else if (tablespooon.isChecked()&&fluid_ounce_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.tablespoon_tofluidounce_uk(value))) + "\t fl oz(UK)");
                }else if (tablespooon.isChecked()&&pint_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.tablespoon_topint_us(value))) + "\t pt (US)");
                }else if (tablespooon.isChecked()&&pint_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.tablespoon_topint_uk(value))) + "\t pt (UK)");
                }else if (tablespooon.isChecked()&&quart_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.tablespoon_toquart_us(value))) + "\t qt (US)");
                }else if (tablespooon.isChecked()&&quart_uk2.isChecked()) {
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.tablespoon_toquart_uk(value))) + "\t qt (UK)");
                }else if (tablespooon.isChecked()&&gallon_us.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.tablespoon_togallon_us(value))) + "\t gal (US)");
                }
                else if (tablespooon.isChecked()&&gallon_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.tablespoon_togallon_uk(value))) + "\t gal (UK)");

                }else if (tablespooon.isChecked()&&barrel2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.tablespoon_tobarrel(value))) + "\t bbl" );

                }else if (tablespooon.isChecked()&&millilitre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.tablespoon_tomillilitre(value))) + "\t mL");

                }else if (tablespooon.isChecked()&&litre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.tablespoon_tolitre(value))) + "\t L");

                }else if (tablespooon.isChecked()&&cubic_cm2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.tablespoon_tocubic_cm(value))) + "\t " +Html.fromHtml(Helper.cubic_cm));

                }else if (tablespooon.isChecked()&&cubic_meter2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.tablespoon_tocubic_meter(value))) + "\t" +Html.fromHtml(Helper.cubic_meter));

                }else if (tablespooon.isChecked()&&cubic_inch2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.tablespoon_tocubic_inch(value))) + "\t" +Html.fromHtml(Helper.cubic_inch));

                }else if (tablespooon.isChecked()&&cubic_foot2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.tablespoon_tocubic_foot(value))) + "\t" +Html.fromHtml(Helper.cubic_foot));

                }else if (tablespooon.isChecked()&&cubic_yard2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.tablespoon_tocubic_yard(value))) + "\t" +Html.fromHtml(Helper.cubic_yard));

                }




                // if cup and other radio button is click in second scroll
                else if (cup.isChecked()&&teaspoon2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cup_toteaspoon(value))) + "\t tsp" );
                }else if (cup.isChecked()&&tablespooon2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cup_totablespoon(value))) + "\t tbsp");
                }else if (cup.isChecked()&&fluid_ounce_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cup_tofluidounce_us(value))) + "\t fl oz(US)");
                }else if (cup.isChecked()&&fluid_ounce_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cup_tofluidounce_uk(value))) + "\t fl oz(UK)");
                }else if (cup.isChecked()&&pint_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cup_topint_us(value))) + "\t pt (US)");
                }else if (cup.isChecked()&&pint_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cup_topint_uk(value))) + "\t pt (UK)");
                }else if (cup.isChecked()&&quart_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cup_toquart_us(value))) + "\t qt (US)");
                }else if (cup.isChecked()&&quart_uk2.isChecked()) {
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cup_toquart_uk(value))) + "\t qt (UK)");
                }else if (cup.isChecked()&&gallon_us.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cup_togallon_us(value))) + "\t gal (US)");
                }
                else if (cup.isChecked()&&gallon_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cup_togallon_uk(value))) + "\t gal (UK)");

                }else if (cup.isChecked()&&barrel2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cup_tobarrel(value))) + "\t bbl" );

                }else if (cup.isChecked()&&millilitre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cup_tomillilitre(value))) + "\t mL");

                }else if (cup.isChecked()&&litre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cup_tolitre(value))) + "\t L");

                }else if (cup.isChecked()&&cubic_cm2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cup_tocubic_cm(value))) + "\t " +Html.fromHtml(Helper.cubic_cm));

                }else if (cup.isChecked()&&cubic_meter2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cup_tocubic_meter(value))) + "\t" +Html.fromHtml(Helper.cubic_meter));

                }else if (cup.isChecked()&&cubic_inch2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cup_tocubic_inch(value))) + "\t" +Html.fromHtml(Helper.cubic_inch));

                }else if (cup.isChecked()&&cubic_foot2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cup_tocubic_foot(value))) + "\t" +Html.fromHtml(Helper.cubic_foot));

                }else if (cup.isChecked()&&cubic_yard2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cup_tocubic_yard(value))) + "\t" +Html.fromHtml(Helper.cubic_yard));

                }








                // if fluidounce_us and other radio button is click in second scroll
                else if (fluid_ounce_us.isChecked()&&teaspoon2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.fluidounce_us_toteaspoon(value))) + "\t tsp" );
                }else if (fluid_ounce_us.isChecked()&&tablespooon2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.fluidounce_us_totablespoon(value))) + "\t tbsp");
                }else if (fluid_ounce_us.isChecked()&&cup2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.fluidounce_us_tocup(value))) + "\t c");
                }else if (fluid_ounce_us.isChecked()&&fluid_ounce_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.fluidounce_us_tofluidounce_uk(value))) + "\t fl oz(UK)");
                }else if (fluid_ounce_us.isChecked()&&pint_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.fluidounce_us_topint_us(value))) + "\t pt (US)");
                }else if (fluid_ounce_us.isChecked()&&pint_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.fluidounce_us_topint_uk(value))) + "\t pt (UK)");
                }else if (fluid_ounce_us.isChecked()&&quart_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.fluidounce_us_toquart_us(value))) + "\t qt (US)");
                }else if (fluid_ounce_us.isChecked()&&quart_uk2.isChecked()) {
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.fluidounce_us_toquart_uk(value))) + "\t qt (UK)");
                }else if (fluid_ounce_us.isChecked()&&gallon_us.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.fluidounce_us_togallon_us(value))) + "\t gal (US)");
                }
                else if (fluid_ounce_us.isChecked()&&gallon_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.fluidounce_us_togallon_uk(value))) + "\t gal (UK)");

                }else if (fluid_ounce_us.isChecked()&&barrel2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.fluidounce_us_tobarrel(value))) + "\t bbl" );

                }else if (fluid_ounce_us.isChecked()&&millilitre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.fluidounce_us_tomillilitre(value))) + "\t mL");

                }else if (fluid_ounce_us.isChecked()&&litre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.fluidounce_us_tolitre(value))) + "\t L");

                }else if (fluid_ounce_us.isChecked()&&cubic_cm2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.fluidounce_us_tocubic_cm(value))) + "\t " +Html.fromHtml(Helper.cubic_cm));

                }else if (fluid_ounce_us.isChecked()&&cubic_meter2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.fluidounce_us_tocubic_meter(value))) + "\t" +Html.fromHtml(Helper.cubic_meter));

                }else if (fluid_ounce_us.isChecked()&&cubic_inch2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.fluidounce_us_tocubic_inch(value))) + "\t" +Html.fromHtml(Helper.cubic_inch));

                }else if (fluid_ounce_us.isChecked()&&cubic_foot2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.fluidounce_us_tocubic_foot(value))) + "\t" +Html.fromHtml(Helper.cubic_foot));

                }else if (fluid_ounce_us.isChecked()&&cubic_yard2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.fluidounce_us_tocubic_yard(value))) + "\t" +Html.fromHtml(Helper.cubic_yard));

                }









                // if fluidounce_uk and other radio button is click in second scroll
                else if (fluid_ounce_uk.isChecked()&&teaspoon2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.fluidounce_uk_toteaspoon(value))) + "\t tsp" );
                }else if (fluid_ounce_uk.isChecked()&&tablespooon2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.fluidounce_uk_totablespoon(value))) + "\t tbsp");
                }else if (fluid_ounce_uk.isChecked()&&cup2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.fluidounce_uk_tocup(value))) + "\t c");
                }else if (fluid_ounce_uk.isChecked()&&fluid_ounce_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.fluidounce_uk_tofluidounce_us(value))) + "\t fl oz(US)");
                }else if (fluid_ounce_uk.isChecked()&&pint_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.fluidounce_uk_topint_us(value))) + "\t pt (US)");
                }else if (fluid_ounce_uk.isChecked()&&pint_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.fluidounce_uk_topint_uk(value))) + "\t pt (UK)");
                }else if (fluid_ounce_uk.isChecked()&&quart_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.fluidounce_uk_toquart_us(value))) + "\t qt (US)");
                }else if (fluid_ounce_uk.isChecked()&&quart_uk2.isChecked()) {
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.fluidounce_uk_toquart_uk(value))) + "\t qt (UK)");
                }else if (fluid_ounce_uk.isChecked()&&gallon_us.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.fluidounce_uk_togallon_us(value))) + "\t gal (US)");
                }
                else if (fluid_ounce_uk.isChecked()&&gallon_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.fluidounce_uk_togallon_uk(value))) + "\t gal (UK)");

                }else if (fluid_ounce_uk.isChecked()&&barrel2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.fluidounce_uk_tobarrel(value))) + "\t bbl" );

                }else if (fluid_ounce_uk.isChecked()&&millilitre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.fluidounce_uk_tomillilitre(value))) + "\t mL");

                }else if (fluid_ounce_uk.isChecked()&&litre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.fluidounce_uk_tolitre(value))) + "\t L");

                }else if (fluid_ounce_uk.isChecked()&&cubic_cm2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.fluidounce_uk_tocubic_cm(value))) + "\t " +Html.fromHtml(Helper.cubic_cm));

                }else if (fluid_ounce_uk.isChecked()&&cubic_meter2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.fluidounce_uk_tocubic_meter(value))) + "\t" +Html.fromHtml(Helper.cubic_meter));

                }else if (fluid_ounce_uk.isChecked()&&cubic_inch2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.fluidounce_uk_tocubic_inch(value))) + "\t" +Html.fromHtml(Helper.cubic_inch));

                }else if (fluid_ounce_uk.isChecked()&&cubic_foot2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.fluidounce_uk_tocubic_foot(value))) + "\t" +Html.fromHtml(Helper.cubic_foot));

                }else if (fluid_ounce_uk.isChecked()&&cubic_yard2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.fluidounce_uk_tocubic_yard(value))) + "\t" +Html.fromHtml(Helper.cubic_yard));

                }









                // if pint_us and other radio button is click in second scroll
                else if (pint_us.isChecked()&&teaspoon2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.pint_us_toteaspoon(value))) + "\t tsp" );
                }else if (pint_us.isChecked()&&tablespooon2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.pint_us_totablespoon(value))) + "\t tbsp");
                }else if (pint_us.isChecked()&&cup2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.pint_us_tocup(value))) + "\t c");
                }else if (pint_us.isChecked()&&fluid_ounce_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.pint_us_tofluidounce_us(value))) + "\t fl oz(US)");
                }else if (pint_us.isChecked()&&fluid_ounce_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.pint_us_fluidounce_uk(value))) + "\t fl oz(UK)");
                }else if (pint_us.isChecked()&&pint_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.pint_us_topint_uk(value))) + "\t pt (UK)");
                }else if (pint_us.isChecked()&&quart_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.pint_us_toquart_us(value))) + "\t qt (US)");
                }else if (pint_us.isChecked()&&quart_uk2.isChecked()) {
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.pint_us_toquart_uk(value))) + "\t qt (UK)");
                }else if (pint_us.isChecked()&&gallon_us.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.pint_us_togallon_us(value))) + "\t gal (US)");
                }
                else if (pint_us.isChecked()&&gallon_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.pint_us_togallon_uk(value))) + "\t gal (UK)");

                }else if (pint_us.isChecked()&&barrel2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.pint_us_tobarrel(value))) + "\t bbl" );

                }else if (pint_us.isChecked()&&millilitre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.pint_us_tomillilitre(value))) + "\t mL");

                }else if (pint_us.isChecked()&&litre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.pint_us_tolitre(value))) + "\t L");

                }else if (pint_us.isChecked()&&cubic_cm2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.pint_us_tocubic_cm(value))) + "\t " +Html.fromHtml(Helper.cubic_cm));

                }else if (pint_us.isChecked()&&cubic_meter2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.pint_us_tocubic_meter(value))) + "\t" +Html.fromHtml(Helper.cubic_meter));

                }else if (pint_us.isChecked()&&cubic_inch2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.pint_us_tocubic_inch(value))) + "\t" +Html.fromHtml(Helper.cubic_inch));

                }else if (pint_us.isChecked()&&cubic_foot2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.pint_us_tocubic_foot(value))) + "\t" +Html.fromHtml(Helper.cubic_foot));

                }else if (pint_us.isChecked()&&cubic_yard2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.pint_us_tocubic_yard(value))) + "\t" +Html.fromHtml(Helper.cubic_yard));

                }










                // if pint_uk and other radio button is click in second scroll
                else if (pint_uk.isChecked()&&teaspoon2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.pint_uk_toteaspoon(value))) + "\t tsp" );
                }else if (pint_uk.isChecked()&&tablespooon2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.pint_uk_totablespoon(value))) + "\t tbsp");
                }else if (pint_uk.isChecked()&&cup2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.pint_uk_tocup(value))) + "\t c");
                }else if (pint_uk.isChecked()&&fluid_ounce_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.pint_uk_tofluidounce_us(value))) + "\t fl oz(US)");
                }else if (pint_uk.isChecked()&&fluid_ounce_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.pint_uk_fluidounce_uk(value))) + "\t fl oz(UK)");
                }else if (pint_uk.isChecked()&&pint_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.pint_uk_topint_us(value))) + "\t pt (US)");
                }else if (pint_uk.isChecked()&&quart_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.pint_uk_toquart_us(value))) + "\t qt (US)");
                }else if (pint_uk.isChecked()&&quart_uk2.isChecked()) {
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.pint_uk_toquart_uk(value))) + "\t qt (UK)");
                }else if (pint_uk.isChecked()&&gallon_us.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.pint_uk_togallon_us(value))) + "\t gal (US)");
                }
                else if (pint_uk.isChecked()&&gallon_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.pint_uk_togallon_uk(value))) + "\t gal (UK)");

                }else if (pint_uk.isChecked()&&barrel2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.pint_uk_tobarrel(value))) + "\t bbl" );

                }else if (pint_uk.isChecked()&&millilitre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.pint_uk_tomillilitre(value))) + "\t mL");

                }else if (pint_uk.isChecked()&&litre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.pint_uk_tolitre(value))) + "\t L");

                }else if (pint_uk.isChecked()&&cubic_cm2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.pint_uk_tocubic_cm(value))) + "\t " +Html.fromHtml(Helper.cubic_cm));

                }else if (pint_uk.isChecked()&&cubic_meter2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.pint_uk_tocubic_meter(value))) + "\t" +Html.fromHtml(Helper.cubic_meter));

                }else if (pint_uk.isChecked()&&cubic_inch2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.pint_uk_tocubic_inch(value))) + "\t" +Html.fromHtml(Helper.cubic_inch));

                }else if (pint_uk.isChecked()&&cubic_foot2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.pint_uk_tocubic_foot(value))) + "\t" +Html.fromHtml(Helper.cubic_foot));

                }else if (pint_uk.isChecked()&&cubic_yard2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.pint_uk_tocubic_yard(value))) + "\t" +Html.fromHtml(Helper.cubic_yard));

                }











                // if quart_us and other radio button is click in second scroll
                else if (quart_us.isChecked()&&teaspoon2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.quart_us_toteaspoon(value))) + "\t tsp" );
                }else if (quart_us.isChecked()&&tablespooon2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.quart_us_totablespoon(value))) + "\t tbsp");
                }else if (quart_us.isChecked()&&cup2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.quart_us_tocup(value))) + "\t c");
                }else if (quart_us.isChecked()&&fluid_ounce_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.quart_us_tofluidounce_us(value))) + "\t fl oz(US)");
                }else if (quart_us.isChecked()&&fluid_ounce_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.quart_us_tofluidounce_uk(value))) + "\t fl oz(UK)");
                }else if (quart_us.isChecked()&&pint_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.quart_us_topint_us(value))) + "\t pt (US)");
                }else if (quart_us.isChecked()&&pint_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.quart_us_topint_uk(value))) + "\t pt (UK)");
                }else if (quart_us.isChecked()&&quart_uk2.isChecked()) {
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.quart_us_toquart_uk(value))) + "\t qt (UK)");
                }else if (quart_us.isChecked()&&gallon_us.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.quart_us_togallon_us(value))) + "\t gal (US)");
                }
                else if (quart_us.isChecked()&&gallon_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.quart_us_togallon_uk(value))) + "\t gal (UK)");

                }else if (quart_us.isChecked()&&barrel2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.quart_us_tobarrel(value))) + "\t bbl" );

                }else if (quart_us.isChecked()&&millilitre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.quart_us_tomillilitre(value))) + "\t mL");

                }else if (quart_us.isChecked()&&litre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.quart_us_tolitre(value))) + "\t L");

                }else if (quart_us.isChecked()&&cubic_cm2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.quart_us_tocubic_cm(value))) + "\t " +Html.fromHtml(Helper.cubic_cm));

                }else if (quart_us.isChecked()&&cubic_meter2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.quart_us_tocubic_meter(value))) + "\t" +Html.fromHtml(Helper.cubic_meter));

                }else if (quart_us.isChecked()&&cubic_inch2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.quart_us_tocubic_inch(value))) + "\t" +Html.fromHtml(Helper.cubic_inch));

                }else if (quart_us.isChecked()&&cubic_foot2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.quart_us_tocubic_foot(value))) + "\t" +Html.fromHtml(Helper.cubic_foot));

                }else if (quart_us.isChecked()&&cubic_yard2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.quart_us_tocubic_yard(value))) + "\t" +Html.fromHtml(Helper.cubic_yard));

                }












                // if quart_uk and other radio button is click in second scroll
                else if (quart_uk.isChecked()&&teaspoon2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.quart_uk_toteaspoon(value))) + "\t tsp" );
                }else if (quart_uk.isChecked()&&tablespooon2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.quart_uk_totablespoon(value))) + "\t tbsp");
                }else if (quart_uk.isChecked()&&cup2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.quart_uk_tocup(value))) + "\t c");
                }else if (quart_uk.isChecked()&&fluid_ounce_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.quart_uk_tofluidounce_us(value))) + "\t fl oz(US)");
                }else if (quart_uk.isChecked()&&fluid_ounce_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.quart_uk_tofluidounce_uk(value))) + "\t fl oz(UK)");
                }else if (quart_uk.isChecked()&&pint_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.quart_uk_topint_us(value))) + "\t pt (US)");
                }else if (quart_uk.isChecked()&&pint_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.quart_uk_topint_uk(value))) + "\t pt (UK)");
                }else if (quart_uk.isChecked()&&quart_us2.isChecked()) {
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.quart_uk_toquart_us(value))) + "\t qt (US)");
                }else if (quart_uk.isChecked()&&gallon_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.quart_uk_togallon_us(value))) + "\t gal (US)");
                }
                else if (quart_uk.isChecked()&&gallon_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.quart_uk_togallon_uk(value))) + "\t gal (UK)");

                }else if (quart_uk.isChecked()&&barrel2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.quart_uk_tobarrel(value))) + "\t bbl" );

                }else if (quart_uk.isChecked()&&millilitre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.quart_uk_tomillilitre(value))) + "\t mL");

                }else if (quart_uk.isChecked()&&litre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.quart_uk_tolitre(value))) + "\t L");

                }else if (quart_uk.isChecked()&&cubic_cm2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.quart_uk_tocubic_cm(value))) + "\t " +Html.fromHtml(Helper.cubic_cm));

                }else if (quart_uk.isChecked()&&cubic_meter2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.quart_uk_tocubic_meter(value))) + "\t" +Html.fromHtml(Helper.cubic_meter));

                }else if (quart_uk.isChecked()&&cubic_inch2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.quart_uk_tocubic_inch(value))) + "\t" +Html.fromHtml(Helper.cubic_inch));

                }else if (quart_uk.isChecked()&&cubic_foot2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.quart_uk_tocubic_foot(value))) + "\t" +Html.fromHtml(Helper.cubic_foot));

                }else if (quart_uk.isChecked()&&cubic_yard2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.quart_uk_tocubic_yard(value))) + "\t" +Html.fromHtml(Helper.cubic_yard));

                }












                // if gallon_us and other radio button is click in second scroll
                else if (gallon_us.isChecked()&&teaspoon2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.gallon_us_toteaspoon(value))) + "\t tsp" );
                }else if (gallon_us.isChecked()&&tablespooon2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.gallon_us_totablespoon(value))) + "\t tbsp");
                }else if (gallon_us.isChecked()&&cup2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.gallon_us_tocup(value))) + "\t c");
                }else if (gallon_us.isChecked()&&fluid_ounce_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.gallon_us_tofluidounce_us(value))) + "\t fl oz(US)");
                }else if (gallon_us.isChecked()&&fluid_ounce_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.gallon_us_fluidounce_uk(value))) + "\t fl oz(UK)");
                }else if (gallon_us.isChecked()&&pint_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.gallon_us_topint_us(value))) + "\t pt (US)");
                }else if (gallon_us.isChecked()&&pint_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.gallon_us_topint_uk(value))) + "\t pt (UK)");
                }else if (gallon_us.isChecked()&&quart_us2.isChecked()) {
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.gallon_us_toquart_us(value))) + "\t qt (US)");
                }else if (gallon_us.isChecked()&&quart_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.gallon_us_toquart_uk(value))) + "\t qt (UK)");
                }
                else if (gallon_us.isChecked()&&gallon_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.gallon_us_togallon_uk(value))) + "\t gal (UK)");

                }else if (gallon_us.isChecked()&&barrel2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.gallon_us_tobarrel(value))) + "\t bbl" );

                }else if (gallon_us.isChecked()&&millilitre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.gallon_us_tomillilitre(value))) + "\t mL");

                }else if (gallon_us.isChecked()&&litre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.gallon_us_tolitre(value))) + "\t L");

                }else if (gallon_us.isChecked()&&cubic_cm2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.gallon_us_tocubic_cm(value))) + "\t " +Html.fromHtml(Helper.cubic_cm));

                }else if (gallon_us.isChecked()&&cubic_meter2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.gallon_us_tocubic_meter(value))) + "\t" +Html.fromHtml(Helper.cubic_meter));

                }else if (gallon_us.isChecked()&&cubic_inch2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.gallon_us_tocubic_inch(value))) + "\t" +Html.fromHtml(Helper.cubic_inch));

                }else if (gallon_us.isChecked()&&cubic_foot2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.gallon_us_tocubic_foot(value))) + "\t" +Html.fromHtml(Helper.cubic_foot));

                }else if (gallon_us.isChecked()&&cubic_yard2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.gallon_us_tocubic_yard(value))) + "\t" +Html.fromHtml(Helper.cubic_yard));

                }











                // if gallon_uk and other radio button is click in second scroll
                else if (gallon_uk.isChecked()&&teaspoon2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.gallon_uk_toteaspoon(value))) + "\t tsp" );
                }else if (gallon_uk.isChecked()&&tablespooon2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.gallon_uk_totablespoon(value))) + "\t tbsp");
                }else if (gallon_uk.isChecked()&&cup2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.gallon_uk_tocup(value))) + "\t c");
                }else if (gallon_uk.isChecked()&&fluid_ounce_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.gallon_uk_tofluidounce_us(value))) + "\t fl oz(US)");
                }else if (gallon_uk.isChecked()&&fluid_ounce_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.gallon_uk_fluidounce_uk(value))) + "\t fl oz(UK)");
                }else if (gallon_uk.isChecked()&&pint_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.gallon_uk_topint_us(value))) + "\t pt (US)");
                }else if (gallon_uk.isChecked()&&pint_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.gallon_uk_topint_uk(value))) + "\t pt (UK)");
                }else if (gallon_uk.isChecked()&&quart_us2.isChecked()) {
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.gallon_uk_toquart_us(value))) + "\t qt (US)");
                }else if (gallon_uk.isChecked()&&quart_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.gallon_uk_toquart_uk(value))) + "\t qt (UK)");
                }
                else if (gallon_uk.isChecked()&&gallon_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.gallon_uk_togallon_us(value))) + "\t gal (US)");

                }else if (gallon_uk.isChecked()&&barrel2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.gallon_uk_tobarrel(value))) + "\t bbl" );

                }else if (gallon_uk.isChecked()&&millilitre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.gallon_uk_tomillilitre(value))) + "\t mL");

                }else if (gallon_uk.isChecked()&&litre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.gallon_uk_tolitre(value))) + "\t L");

                }else if (gallon_uk.isChecked()&&cubic_cm2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.gallon_uk_tocubic_cm(value))) + "\t " +Html.fromHtml(Helper.cubic_cm));

                }else if (gallon_uk.isChecked()&&cubic_meter2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.gallon_uk_tocubic_meter(value))) + "\t" +Html.fromHtml(Helper.cubic_meter));

                }else if (gallon_uk.isChecked()&&cubic_inch2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.gallon_uk_tocubic_inch(value))) + "\t " +Html.fromHtml(Helper.cubic_inch));

                }else if (gallon_uk.isChecked()&&cubic_foot2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.gallon_uk_tocubic_foot(value))) + "\t" +Html.fromHtml(Helper.cubic_foot));

                }else if (gallon_uk.isChecked()&&cubic_yard2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.gallon_uk_tocubic_yard(value))) + "\t" +Html.fromHtml(Helper.cubic_yard));

                }












                // if barrel and other radio button is click in second scroll
                else if (barrel.isChecked()&&teaspoon2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.barrel_toteaspoon(value))) + "\t tsp" );
                }else if (barrel.isChecked()&&tablespooon2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.barrel_totablespoon(value))) + "\t tbsp");
                }else if (barrel.isChecked()&&cup2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.barrel_tocup(value))) + "\t c");
                }else if (barrel.isChecked()&&fluid_ounce_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.barrel_tofluidounce_us(value))) + "\t fl oz(US)");
                }else if (barrel.isChecked()&&fluid_ounce_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.barrel_fluidounce_uk(value))) + "\t fl oz(UK)");
                }else if (barrel.isChecked()&&pint_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.barrel_topint_us(value))) + "\t pt (US)");
                }else if (barrel.isChecked()&&pint_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.barrel_topint_uk(value))) + "\t pt (UK)");
                }else if (barrel.isChecked()&&quart_us2.isChecked()) {
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.barrel_toquart_us(value))) + "\t qt (US)");
                }else if (barrel.isChecked()&&quart_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.barrel_toquart_uk(value))) + "\t qt (UK)");
                }
                else if (barrel.isChecked()&&gallon_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.barrel_togallon_us(value))) + "\t gal (US)");

                }else if (barrel.isChecked()&&gallon_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.barrel_togallon_uk(value))) + "\t gal (UK)" );

                }else if (barrel.isChecked()&&millilitre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.barrel_tomillilitre(value))) + "\t mL");

                }else if (barrel.isChecked()&&litre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.barrel_tolitre(value))) + "\t L");

                }else if (barrel.isChecked()&&cubic_cm2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.barrel_tocubic_cm(value))) + "\t " +Html.fromHtml(Helper.cubic_cm));

                }else if (barrel.isChecked()&&cubic_meter2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.barrel_tocubic_meter(value))) + "\t" +Html.fromHtml(Helper.cubic_meter));

                }else if (barrel.isChecked()&&cubic_inch2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.barrel_tocubic_inch(value))) + "\t" +Html.fromHtml(Helper.cubic_inch));

                }else if (barrel.isChecked()&&cubic_foot2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.barrel_tocubic_foot(value))) + "\t" +Html.fromHtml(Helper.cubic_foot));

                }else if (barrel.isChecked()&&cubic_yard2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.barrel_tocubic_yard(value))) + "\t" +Html.fromHtml(Helper.cubic_yard));

                }










                // if millilitre and other radio button is click in second scroll
                else if (millilitre.isChecked()&&teaspoon2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.millilitre_toteaspoon(value))) + "\t tsp" );
                }else if (millilitre.isChecked()&&tablespooon2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.millilitre_totablespoon(value))) + "\t tbsp");
                }else if (millilitre.isChecked()&&cup2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.millilitre_tocup(value))) + "\t c");
                }else if (millilitre.isChecked()&&fluid_ounce_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.millilitre_tofluidounce_us(value))) + "\t fl oz(US)");
                }else if (millilitre.isChecked()&&fluid_ounce_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.millilitre_fluidounce_uk(value))) + "\t fl oz(UK)");
                }else if (millilitre.isChecked()&&pint_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.millilitre_topint_us(value))) + "\t pt (US)");
                }else if (millilitre.isChecked()&&pint_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.millilitre_topint_uk(value))) + "\t pt (UK)");
                }else if (millilitre.isChecked()&&quart_us2.isChecked()) {
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.millilitre_toquart_us(value))) + "\t qt (US)");
                }else if (millilitre.isChecked()&&quart_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.millilitre_toquart_uk(value))) + "\t qt (UK)");
                }
                else if (millilitre.isChecked()&&gallon_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.millilitre_togallon_us(value))) + "\t gal (US)");

                }else if (millilitre.isChecked()&&gallon_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.millilitre_togallon_uk(value))) + "\t gal (UK)" );

                }else if (millilitre.isChecked()&&barrel2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.millilitre_tobarrel(value))) + "\t bbl");

                }else if (millilitre.isChecked()&&litre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.millilitre_tolitre(value))) + "\t L");

                }else if (millilitre.isChecked()&&cubic_cm2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.millilitre_tocubic_cm(value))) + "\t " +Html.fromHtml(Helper.cubic_cm));

                }else if (millilitre.isChecked()&&cubic_meter2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.millilitre_tocubic_meter(value))) + "\t" +Html.fromHtml(Helper.cubic_meter));

                }else if (millilitre.isChecked()&&cubic_inch2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.millilitre_tocubic_inch(value))) + "\t" +Html.fromHtml(Helper.cubic_inch));

                }else if (millilitre.isChecked()&&cubic_foot2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.millilitre_tocubic_foot(value))) + "\t" +Html.fromHtml(Helper.cubic_foot));

                }else if (millilitre.isChecked()&&cubic_yard2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.millilitre_tocubic_yard(value))) + "\t" +Html.fromHtml(Helper.cubic_yard));

                }










                // if litre and other radio button is click in second scroll
                else if (litre.isChecked()&&teaspoon2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.litre_toteaspoon(value))) + "\t tsp" );
                }else if (litre.isChecked()&&tablespooon2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.litre_totablespoon(value))) + "\t tbsp");
                }else if (litre.isChecked()&&cup2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.litre_tocup(value))) + "\t c");
                }else if (litre.isChecked()&&fluid_ounce_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.litre_tofluidounce_us(value))) + "\t fl oz(US)");
                }else if (litre.isChecked()&&fluid_ounce_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.litre_fluidounce_uk(value))) + "\t fl oz(UK)");
                }else if (litre.isChecked()&&pint_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.litre_topint_us(value))) + "\t pt (US)");
                }else if (litre.isChecked()&&pint_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.litre_topint_uk(value))) + "\t pt (UK)");
                }else if (litre.isChecked()&&quart_us2.isChecked()) {
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.litre_toquart_us(value))) + "\t qt (US)");
                }else if (litre.isChecked()&&quart_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.litre_toquart_uk(value))) + "\t qt (UK)");
                }
                else if (litre.isChecked()&&gallon_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.litre_togallon_us(value))) + "\t gal (US)");

                }else if (litre.isChecked()&&gallon_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.litre_togallon_uk(value))) + "\t gal (UK)" );

                }else if (litre.isChecked()&&barrel2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.litre_tobarrel(value))) + "\t bbl");

                }else if (litre.isChecked()&&millilitre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.litre_tomillilitre(value))) + "\t mL");

                }else if (litre.isChecked()&&cubic_cm2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.litre_tocubic_cm(value))) + "\t " +Html.fromHtml(Helper.cubic_cm));

                }else if (litre.isChecked()&&cubic_meter2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.litre_tocubic_meter(value))) + "\t" +Html.fromHtml(Helper.cubic_meter));

                }else if (litre.isChecked()&&cubic_inch2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.litre_tocubic_inch(value))) + "\t" +Html.fromHtml(Helper.cubic_inch));

                }else if (litre.isChecked()&&cubic_foot2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.litre_tocubic_foot(value))) + "\t" +Html.fromHtml(Helper.cubic_foot));

                }else if (litre.isChecked()&&cubic_yard2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.litre_tocubic_yard(value))) + "\t" +Html.fromHtml(Helper.cubic_yard));

                }












                // if cubic_cm and other radio button is click in second scroll
                else if (cubic_cm.isChecked()&&teaspoon2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_cm_toteaspoon(value))) + "\t tsp" );
                }else if (cubic_cm.isChecked()&&tablespooon2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_cm_totablespoon(value))) + "\t tbsp");
                }else if (cubic_cm.isChecked()&&cup2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_cm_tocup(value))) + "\t c");
                }else if (cubic_cm.isChecked()&&fluid_ounce_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_cm_tofluidounce_us(value))) + "\t fl oz(US)");
                }else if (cubic_cm.isChecked()&&fluid_ounce_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_cm_fluidounce_uk(value))) + "\t fl oz(UK)");
                }else if (cubic_cm.isChecked()&&pint_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_cm_topint_us(value))) + "\t pt (US)");
                }else if (cubic_cm.isChecked()&&pint_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_cm_topint_uk(value))) + "\t pt (UK)");
                }else if (cubic_cm.isChecked()&&quart_us2.isChecked()) {
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_cm_toquart_us(value))) + "\t qt (US)");
                }else if (cubic_cm.isChecked()&&quart_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_cm_toquart_uk(value))) + "\t qt (UK)");
                }
                else if (cubic_cm.isChecked()&&gallon_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_cm_togallon_us(value))) + "\t gal (US)");

                }else if (cubic_cm.isChecked()&&gallon_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_cm_togallon_uk(value))) + "\t gal (UK)" );

                }else if (cubic_cm.isChecked()&&barrel2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_cm_tobarrel(value))) + "\t bbl");

                }else if (cubic_cm.isChecked()&&millilitre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_cm_tomillilitre(value))) + "\t mL");

                }else if (cubic_cm.isChecked()&&litre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_cm_tolitre(value))) + "\t L");

                }else if (cubic_cm.isChecked()&&cubic_meter2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_cm_tocubic_meter(value))) + "\t" +Html.fromHtml(Helper.cubic_meter));

                }else if (cubic_cm.isChecked()&&cubic_inch2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_cm_tocubic_inch(value))) + "\t" +Html.fromHtml(Helper.cubic_inch));

                }else if (cubic_cm.isChecked()&&cubic_foot2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_cm_tocubic_foot(value))) + "\t" +Html.fromHtml(Helper.cubic_foot));

                }else if (cubic_cm.isChecked()&&cubic_yard2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_cm_tocubic_yard(value))) + "\t" +Html.fromHtml(Helper.cubic_yard));

                }











                // if cubic_meter and other radio button is click in second scroll
                else if (cubic_meter.isChecked()&&teaspoon2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_meter_toteaspoon(value))) + "\t tsp" );
                }else if (cubic_meter.isChecked()&&tablespooon2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_meter_totablespoon(value))) + "\t tbsp");
                }else if (cubic_meter.isChecked()&&cup2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_meter_tocup(value))) + "\t c");
                }else if (cubic_meter.isChecked()&&fluid_ounce_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_meter_tofluidounce_us(value))) + "\t fl oz(US)");
                }else if (cubic_meter.isChecked()&&fluid_ounce_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_meter_fluidounce_uk(value))) + "\t fl oz(UK)");
                }else if (cubic_meter.isChecked()&&pint_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_meter_topint_us(value))) + "\t pt (US)");
                }else if (cubic_meter.isChecked()&&pint_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_meter_topint_uk(value))) + "\t pt (UK)");
                }else if (cubic_meter.isChecked()&&quart_us2.isChecked()) {
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_meter_toquart_us(value))) + "\t qt (US)");
                }else if (cubic_meter.isChecked()&&quart_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_meter_toquart_uk(value))) + "\t qt (UK)");
                }
                else if (cubic_meter.isChecked()&&gallon_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_meter_togallon_uk(value))) + "\t gal (US)");

                }else if (cubic_meter.isChecked()&&gallon_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_meter_togallon_us(value))) + "\t gal (UK)" );

                }else if (cubic_meter.isChecked()&&barrel2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_meter_togallon_uk(value))) + "\t bbl");

                }else if (cubic_meter.isChecked()&&millilitre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_meter_tomillilitre(value))) + "\t mL");

                }else if (cubic_meter.isChecked()&&litre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_meter_tolitre(value))) + "\t L");

                }else if (cubic_meter.isChecked()&&cubic_cm2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_meter_tocubic_cm(value))) + "\t" +Html.fromHtml(Helper.cubic_cm));

                }else if (cubic_meter.isChecked()&&cubic_inch2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_meter_tocubic_inch(value))) + "\t" +Html.fromHtml(Helper.cubic_inch));

                }else if (cubic_meter.isChecked()&&cubic_foot2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_meter_tocubic_foot(value))) + "\t" +Html.fromHtml(Helper.cubic_foot));

                }else if (cubic_meter.isChecked()&&cubic_yard2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_meter_tocubic_yard(value))) + "\t" +Html.fromHtml(Helper.cubic_yard));

                }










                // if cubic_inch and other radio button is click in second scroll
                else if (cubic_inch.isChecked()&&teaspoon2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_inch_toteaspoon(value))) + "\t tsp" );
                }else if (cubic_inch.isChecked()&&tablespooon2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_inch_totablespoon(value))) + "\t tbsp");
                }else if (cubic_inch.isChecked()&&cup2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_inch_tocup(value))) + "\t c");
                }else if (cubic_inch.isChecked()&&fluid_ounce_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_inch_tofluidounce_us(value))) + "\t fl oz(US)");
                }else if (cubic_inch.isChecked()&&fluid_ounce_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_inch_fluidounce_uk(value))) + "\t fl oz(UK)");
                }else if (cubic_inch.isChecked()&&pint_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_inch_topint_us(value))) + "\t pt (US)");
                }else if (cubic_inch.isChecked()&&pint_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_inch_topint_uk(value))) + "\t pt (UK)");
                }else if (cubic_inch.isChecked()&&quart_us2.isChecked()) {
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_inch_toquart_us(value))) + "\t qt (US)");
                }else if (cubic_inch.isChecked()&&quart_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_inch_toquart_uk(value))) + "\t qt (UK)");
                }
                else if (cubic_inch.isChecked()&&gallon_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_inch_togallon_us(value))) + "\t gal (US)");

                }else if (cubic_inch.isChecked()&&gallon_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_inch_togallon_uk(value))) + "\t gal (UK)" );

                }else if (cubic_inch.isChecked()&&barrel2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_inch_tobarrel(value))) + "\t bbl");

                }else if (cubic_inch.isChecked()&&millilitre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_inch_tomillilitre(value))) + "\t mL");

                }else if (cubic_inch.isChecked()&&litre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_inch_tolitre(value))) + "\t L");

                }else if (cubic_inch.isChecked()&&cubic_cm2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_meter_tocubic_cm(value))) + "\t" +Html.fromHtml(Helper.cubic_cm));

                }else if (cubic_inch.isChecked()&&cubic_meter2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_inch_tocubic_meter(value))) + "\t" +Html.fromHtml(Helper.cubic_meter));

                }else if (cubic_inch.isChecked()&&cubic_foot2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_inch_tocubic_foot(value))) + "\t" +Html.fromHtml(Helper.cubic_foot));

                }else if (cubic_inch.isChecked()&&cubic_yard2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_inch_tocubic_yard(value))) + "\t" +Html.fromHtml(Helper.cubic_yard));

                }











                // if cubic_foot and other radio button is click in second scroll
                else if (cubic_foot.isChecked()&&teaspoon2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_foot_toteaspoon(value))) + "\t tsp" );
                }else if (cubic_foot.isChecked()&&tablespooon2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_foot_totablespoon(value))) + "\t tbsp");
                }else if (cubic_foot.isChecked()&&cup2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_foot_tocup(value))) + "\t c");
                }else if (cubic_foot.isChecked()&&fluid_ounce_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_foot_tofluidounce_us(value))) + "\t fl oz(US)");
                }else if (cubic_foot.isChecked()&&fluid_ounce_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_foot_fluidounce_uk(value))) + "\t fl oz(UK)");
                }else if (cubic_foot.isChecked()&&pint_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_foot_topint_us(value))) + "\t pt (US)");
                }else if (cubic_foot.isChecked()&&pint_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_foot_topint_uk(value))) + "\t pt (UK)");
                }else if (cubic_foot.isChecked()&&quart_us2.isChecked()) {
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_foot_toquart_us(value))) + "\t qt (US)");
                }else if (cubic_foot.isChecked()&&quart_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_foot_toquart_uk(value))) + "\t qt (UK)");
                }
                else if (cubic_foot.isChecked()&&gallon_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_foot_togallon_us(value))) + "\t gal (US)");

                }else if (cubic_foot.isChecked()&&gallon_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_foot_togallon_uk(value))) + "\t gal (UK)" );

                }else if (cubic_foot.isChecked()&&barrel2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_foot_tobarrel(value))) + "\t bbl");

                }else if (cubic_foot.isChecked()&&millilitre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_foot_tomillilitre(value))) + "\t mL");

                }else if (cubic_foot.isChecked()&&litre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_foot_tolitre(value))) + "\t L");

                }else if (cubic_foot.isChecked()&&cubic_cm2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_foot_tocubic_cm(value))) + "\t" +Html.fromHtml(Helper.cubic_cm));

                }else if (cubic_foot.isChecked()&&cubic_meter2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_foot_tocubic_meter(value))) + "\t" +Html.fromHtml(Helper.cubic_meter));

                }else if (cubic_foot.isChecked()&&cubic_inch2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_foot_tocubic_inch(value))) + "\t" +Html.fromHtml(Helper.cubic_foot));

                }else if (cubic_foot.isChecked()&&cubic_yard2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_inch_tocubic_yard(value))) + "\t" +Html.fromHtml(Helper.cubic_yard));

                }










                // if cubic_yard and other radio button is click in second scroll
                else if (cubic_yard.isChecked()&&teaspoon2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_yard_toteaspoon(value))) + "\t tsp" );
                }else if (cubic_yard.isChecked()&&tablespooon2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_yard_totablespoon(value))) + "\t tbsp");
                }else if (cubic_yard.isChecked()&&cup2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_yard_tocup(value))) + "\t c");
                }else if (cubic_yard.isChecked()&&fluid_ounce_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_yard_tofluidounce_us(value))) + "\t fl oz(US)");
                }else if (cubic_yard.isChecked()&&fluid_ounce_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_yard_fluidounce_uk(value))) + "\t fl oz(UK)");
                }else if (cubic_yard.isChecked()&&pint_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_yard_topint_us(value))) + "\t pt (US)");
                }else if (cubic_yard.isChecked()&&pint_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_yard_topint_uk(value))) + "\t pt (UK)");
                }else if (cubic_yard.isChecked()&&quart_us2.isChecked()) {
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_yard_toquart_us(value))) + "\t qt (US)");
                }else if (cubic_yard.isChecked()&&quart_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_yard_toquart_uk(value))) + "\t qt (UK)");
                }
                else if (cubic_yard.isChecked()&&gallon_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_yard_togallon_us(value))) + "\t gal (US)");

                }else if (cubic_yard.isChecked()&&gallon_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_yard_togallon_uk(value))) + "\t gal (UK)" );

                }else if (cubic_yard.isChecked()&&barrel2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_yard_tobarrel(value))) + "\t bbl");

                }else if (cubic_yard.isChecked()&&millilitre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_yard_tomillilitre(value))) + "\t mL");

                }else if (cubic_yard.isChecked()&&litre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_yard_tolitre(value))) + "\t L");

                }else if (cubic_yard.isChecked()&&cubic_cm2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_yard_tocubic_cm(value))) + "\t" +Html.fromHtml(Helper.cubic_cm));

                }else if (cubic_yard.isChecked()&&cubic_meter2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_yard_tocubic_meter(value))) + "\t" +Html.fromHtml(Helper.cubic_meter));

                }else if (cubic_yard.isChecked()&&cubic_inch2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_yard_tocubic_inch(value))) + "\t" +Html.fromHtml(Helper.cubic_foot));

                }else if (cubic_yard.isChecked()&&cubic_foot2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cubic_inch_tocubic_yard(value))) + "\t" +Html.fromHtml(Helper.cubic_foot));

                }











            }


        }catch (Exception e){

        }
    }
}
