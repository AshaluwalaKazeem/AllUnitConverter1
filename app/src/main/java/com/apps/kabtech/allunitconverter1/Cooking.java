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
public class Cooking extends AppCompatActivity {
    private ActionBar actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(Constant.theme);
        setContentView(R.layout.activity_cooking);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        actionBar = getSupportActionBar();
        actionBar.setTitle("Cooking");


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

    public void Calculate_cooking(View view){
        DecimalFormat textformat = new DecimalFormat("###,###,###,###,###,###.############");
        try{
            EditText text = (EditText) findViewById(R.id.distance_editText);
            TextView tview = (TextView)findViewById(R.id.distance_textView);
            // this is if we press the cancel button
            if(view.getId() == R.id.clear_button){
                text.setText("");tview.setText("");
                // this is if we press the convert button
            }else if (view.getId() == R.id.calulate_button){
                RadioButton millilitre = (RadioButton) findViewById(R.id.millilitre_radio);
                RadioButton millilitre2 = (RadioButton) findViewById(R.id.millilitre_radio2);
                RadioButton teaspoon = (RadioButton)findViewById(R.id.teaspoon_radio);
                RadioButton teaspoon2 = (RadioButton)findViewById(R.id.teaspoon_radio2);
                RadioButton tablespooon = (RadioButton)findViewById(R.id.tablespoon_radio);
                RadioButton tablespooon2 = (RadioButton)findViewById(R.id.tablespoon_radio2);
                RadioButton cup = (RadioButton)findViewById(R.id.cup_radio);
                RadioButton cup2 = (RadioButton)findViewById(R.id.cup_radio2);
                RadioButton cup_metric = (RadioButton)findViewById(R.id.cup_metric_radio);
                RadioButton cup_metric2 = (RadioButton)findViewById(R.id.cup_metric_radio2);
                RadioButton litre = (RadioButton) findViewById(R.id.litre_radio);
                RadioButton litre2 = (RadioButton) findViewById(R.id.litre_radio2);
                RadioButton fluid_ounce_us = (RadioButton)findViewById(R.id.fluidounce_us_radio);
                RadioButton fluid_ounce_us2 = (RadioButton)findViewById(R.id.fluidounce_us_radio2);
                RadioButton fluid_ounce_uk = (RadioButton)findViewById(R.id.fluidounce_uk_radio);
                RadioButton fluid_ounce_uk2 = (RadioButton)findViewById(R.id.fluidounce_uk_radio2);
                RadioButton pint_us = (RadioButton)findViewById(R.id.pint_us_radio);
                RadioButton pint_us2 = (RadioButton)findViewById(R.id.pint_us_radio2);
                RadioButton pint_uk = (RadioButton) findViewById(R.id.pint_uk_radio);
                RadioButton pint_uk2 = (RadioButton) findViewById(R.id.pint_uk_radio2);








                // this is if our text is empty
                if (text.getText().length()== 0){
                    Toast.makeText(this, "Please enter a valid number",
                            Toast.LENGTH_LONG ).show();
                    return;
                }else if (millilitre.isChecked()&&millilitre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value))+ "\t"  + " mL");
                }else if (teaspoon.isChecked()&&teaspoon2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" + " tsp");
                } else if (tablespooon.isChecked()&&tablespooon2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +" tbsp");
                } else if (cup.isChecked()&&cup2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +" c (Us)");
                } else if (cup_metric.isChecked()&&cup_metric2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +" c (metric)");
                }else if (litre.isChecked()&&litre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value))+ "\t"  + " L");
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
                }






                // if millilitre and other radio button is click in second scroll
                else if (millilitre.isChecked()&&teaspoon2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.millilitre_toteaspoon(value))) + "\t tsp" );
                }else if (millilitre.isChecked()&&tablespooon2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.millilitre_totablespoon(value))) + "\t tbsp");
                }else if (millilitre.isChecked()&&cup2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.millilitre_tocup_us(value))) + "\t c (Us)");
                } else if (millilitre.isChecked()&&cup_metric2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.millilitre_tocup_metric(value))) + "\t c (metric)");
                }else if (millilitre.isChecked()&&litre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.millilitre_tolitre(value))) + "\t L");
                }else if (millilitre.isChecked()&&fluid_ounce_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.millilitre_tofluidounce_us(value))) + "\t fl oz(US)");
                }else if (millilitre.isChecked()&&fluid_ounce_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.millilitre_fluidounce_uk(value))) + "\t fl oz(UK)");
                }else if (millilitre.isChecked()&&pint_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.millilitre_topint_us(value))) + "\t pt (US)");
                }else if (millilitre.isChecked()&&pint_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.millilitre_topint_uk(value))) + "\t pt (UK)");
                }






                // if teaspoon and other radio button is click in second scroll
                else if (teaspoon.isChecked()&&millilitre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.teaspoon_tomillilitre(value))) + "\t mL");
                } else if (teaspoon.isChecked()&&tablespooon2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.teaspoon_totablespoon(value))) + "\t tbsp" );
                }else if (teaspoon.isChecked()&&cup2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.teaspoon_tocup_us(value))) + "\t c (Us)");
                }else if (teaspoon.isChecked()&&cup_metric2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.teaspoon_tocup_metric(value))) + "\t c (metric) ");
                }else if (teaspoon.isChecked()&&litre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.teaspoon_tolitre(value))) + "\t L");
                }else if (teaspoon.isChecked()&&fluid_ounce_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.teaspoon_tofluidounce_us(value))) + "\t fl oz(US)");
                }else if (teaspoon.isChecked()&&fluid_ounce_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.teaspoon_tofluidounce_uk(value))) + "\t fl oz(UK)");
                }else if (teaspoon.isChecked()&&pint_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.teaspoon_topint_us(value))) + "\t pt (US)");
                }else if (teaspoon.isChecked()&&pint_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.teaspoon_topint_uk(value))) + "\t pt (UK)");
                }




                // if tablespoon and other radio button is click in second scroll
                else if (tablespooon.isChecked()&&millilitre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.tablespoon_tomillilitre(value))) + "\t mL");
                } else if (tablespooon.isChecked()&&teaspoon2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.tablespoon_toteaspoon(value))) + "\t tsp" );
                }else if (tablespooon.isChecked()&&cup2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.tablespoon_tocup_us(value))) + "\t c (Us)");
                }else if (tablespooon.isChecked()&&cup_metric2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.tablespoon_tocup_metric(value))) + "\t c (metric)");
                }else if (tablespooon.isChecked()&&litre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.tablespoon_tolitre(value))) + "\t L");
                }else if (tablespooon.isChecked()&&fluid_ounce_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.tablespoon_tofluidounce_us(value))) + "\t fl oz(US)");
                }else if (tablespooon.isChecked()&&fluid_ounce_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.tablespoon_tofluidounce_uk(value))) + "\t fl oz(UK)");
                }else if (tablespooon.isChecked()&&pint_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.tablespoon_topint_us(value))) + "\t pt (US)");
                }else if (tablespooon.isChecked()&&pint_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.tablespoon_topint_uk(value))) + "\t pt (UK)");
                }





                // if cup and other radio button is click in second scroll
                else if (cup.isChecked()&&millilitre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.cup_tomillilitre(value))) + "\t mL");
                }else if (cup.isChecked()&&teaspoon2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.cup_toteaspoon(value))) + "\t tsp" );
                }else if (cup.isChecked()&&tablespooon2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.cup_totablespoon(value))) + "\t tbsp");
                }else if (cup.isChecked()&&cup_metric2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.cup_tocup_metric(value))) + "\t c (metric)");
                }else if (cup.isChecked()&&litre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.cup_tolitre(value))) + "\t L");
                }else if (cup.isChecked()&&fluid_ounce_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.cup_tofluidounce_us(value))) + "\t fl oz(US)");
                }else if (cup.isChecked()&&fluid_ounce_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.cup_tofluidounce_uk(value))) + "\t fl oz(UK)");
                }else if (cup.isChecked()&&pint_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.cup_topint_us(value))) + "\t pt (US)");
                }else if (cup.isChecked()&&pint_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.cup_topint_uk(value))) + "\t pt (UK)");
                }








                // if cup and other radio button is click in second scroll
                else if (cup.isChecked()&&millilitre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cup_tomillilitre(value))) + "\t mL");
                }else if (cup.isChecked()&&teaspoon2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cup_toteaspoon(value))) + "\t tsp" );
                }else if (cup.isChecked()&&tablespooon2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cup_totablespoon(value))) + "\t tbsp");
                }else if (cup.isChecked()&&cup_metric2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.cup_tocup_metric(value))) + "\t c (metric)");
                }else if (cup.isChecked()&&litre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Volume_Converter.cup_tolitre(value))) + "\t L");
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
                }






                // if cup_metric and other radio button is click in second scroll
                else if (cup_metric.isChecked()&&millilitre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.cup_metric_tomillilitre(value))) + "\t mL");
                }else if (cup_metric.isChecked()&&teaspoon2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.cup_metric_toteaspoon(value))) + "\t tsp" );
                }else if (cup_metric.isChecked()&&tablespooon2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.cup_metric_totablespoon(value))) + "\t tbsp");
                }else if (cup_metric.isChecked()&&cup.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.cup_metric_tocup_us(value))) + "\t c (Us)");
                }else if (cup_metric.isChecked()&&litre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.cup_metric_tolitre(value))) + "\t L");
                }else if (cup_metric.isChecked()&&fluid_ounce_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.cup_metric_tofluidounce_us(value))) + "\t fl oz(US)");
                }else if (cup_metric.isChecked()&&fluid_ounce_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.cup_metric_tofluidounce_uk(value))) + "\t fl oz(UK)");
                }else if (cup_metric.isChecked()&&pint_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.cup_metric_topint_us(value))) + "\t pt (US)");
                }else if (cup_metric.isChecked()&&pint_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.cup_metric_topint_uk(value))) + "\t pt (UK)");
                }






                // if litre and other radio button is click in second scroll
                else if (litre.isChecked()&&millilitre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.litre_tomillilitre(value))) + "\t mL");
                }
                else if (litre.isChecked()&&teaspoon2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.litre_toteaspoon(value))) + "\t tsp" );
                }else if (litre.isChecked()&&tablespooon2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.litre_totablespoon(value))) + "\t tbsp");
                }else if (litre.isChecked()&&cup2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.litre_tocup_us(value))) + "\t c (Us)");
                }else if (litre.isChecked()&&cup_metric2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.litre_tocup_metric(value))) + "\t c (metric)");
                }else if (litre.isChecked()&&fluid_ounce_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.litre_tofluidounce_us(value))) + "\t fl oz(US)");
                }else if (litre.isChecked()&&fluid_ounce_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.litre_fluidounce_uk(value))) + "\t fl oz(UK)");
                }else if (litre.isChecked()&&pint_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.litre_topint_us(value))) + "\t pt (US)");
                }else if (litre.isChecked()&&pint_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.litre_topint_uk(value))) + "\t pt (UK)");
                }






                // if fluidounce_us and other radio button is click in second scroll
                else if (fluid_ounce_us.isChecked()&&millilitre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.fluidounce_us_tomillilitre(value))) + "\t mL");
                } else if (fluid_ounce_us.isChecked()&&teaspoon2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.fluidounce_us_toteaspoon(value))) + "\t tsp" );
                }else if (fluid_ounce_us.isChecked()&&tablespooon2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.fluidounce_us_totablespoon(value))) + "\t tbsp");
                }else if (fluid_ounce_us.isChecked()&&cup2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.fluidounce_us_tocup_us(value))) + "\t c (Us)");
                }else if (fluid_ounce_us.isChecked()&&cup_metric2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.fluidounce_us_tocup_metric(value))) + "\t c (metric)");
                }else if (fluid_ounce_us.isChecked()&&litre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.fluidounce_us_tolitre(value))) + "\t L");
                }else if (fluid_ounce_us.isChecked()&&fluid_ounce_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.fluidounce_us_tofluidounce_uk(value))) + "\t fl oz(UK)");
                }else if (fluid_ounce_us.isChecked()&&pint_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.fluidounce_us_topint_us(value))) + "\t pt (US)");
                }else if (fluid_ounce_us.isChecked()&&pint_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.fluidounce_us_topint_uk(value))) + "\t pt (UK)");
                }






                // if fluidounce_uk and other radio button is click in second scroll
                else if (fluid_ounce_uk.isChecked()&&millilitre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.fluidounce_uk_tomillilitre(value))) + "\t mL");
                } else if (fluid_ounce_uk.isChecked()&&teaspoon2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.fluidounce_uk_toteaspoon(value))) + "\t tsp" );
                }else if (fluid_ounce_uk.isChecked()&&tablespooon2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.fluidounce_uk_totablespoon(value))) + "\t tbsp");
                }else if (fluid_ounce_uk.isChecked()&&cup2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.fluidounce_uk_tocup_us(value))) + "\t c (Us)");
                }else if (fluid_ounce_uk.isChecked()&&cup_metric2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.fluidounce_uk_tocup_metric(value))) + "\t c (metric)");
                } else if (fluid_ounce_uk.isChecked()&&litre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.fluidounce_uk_tolitre(value))) + "\t L");
                }else if (fluid_ounce_uk.isChecked()&&fluid_ounce_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.fluidounce_uk_tofluidounce_us(value))) + "\t fl oz(US)");
                }else if (fluid_ounce_uk.isChecked()&&pint_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.fluidounce_uk_topint_us(value))) + "\t pt (US)");
                }else if (fluid_ounce_uk.isChecked()&&pint_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.fluidounce_uk_topint_uk(value))) + "\t pt (UK)");
                }






                // if pint_us and other radio button is click in second scroll
                else if (pint_us.isChecked()&&millilitre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.pint_us_tomillilitre(value))) + "\t mL");
                }else if (pint_us.isChecked()&&teaspoon2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.pint_us_toteaspoon(value))) + "\t tsp" );
                }else if (pint_us.isChecked()&&tablespooon2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.pint_us_totablespoon(value))) + "\t tbsp");
                }else if (pint_us.isChecked()&&cup2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.pint_us_tocup_us(value))) + "\t c (Us)");
                }else if (pint_us.isChecked()&&cup_metric2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.pint_us_tocup_metric(value))) + "\t c (metric)");
                }else if (pint_us.isChecked()&&litre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.pint_us_tolitre(value))) + "\t L");
                }else if (pint_us.isChecked()&&fluid_ounce_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.pint_us_tofluidounce_us(value))) + "\t fl oz(US)");
                }else if (pint_us.isChecked()&&fluid_ounce_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.pint_us_fluidounce_uk(value))) + "\t fl oz(UK)");
                }else if (pint_us.isChecked()&&pint_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.pint_us_topint_uk(value))) + "\t pt (UK)");
                }










                // if pint_uk and other radio button is click in second scroll
                else if (pint_uk.isChecked()&&millilitre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.pint_uk_tomillilitre(value))) + "\t mL");
                }else if (pint_uk.isChecked()&&teaspoon2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.pint_uk_toteaspoon(value))) + "\t tsp" );
                }else if (pint_uk.isChecked()&&tablespooon2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.pint_uk_totablespoon(value))) + "\t tbsp");
                }else if (pint_uk.isChecked()&&cup2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.pint_uk_tocup_us(value))) + "\t c (Us)");
                }else if (pint_uk.isChecked()&&cup_metric2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.pint_uk_tocup_metric(value))) + "\t c (metric)");
                }else if (pint_uk.isChecked()&&litre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.pint_uk_tolitre(value))) + "\t L");
                }else if (pint_uk.isChecked()&&fluid_ounce_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.pint_uk_tofluidounce_us(value))) + "\t fl oz(US)");
                }else if (pint_uk.isChecked()&&fluid_ounce_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.pint_uk_fluidounce_uk(value))) + "\t fl oz(UK)");
                }else if (pint_uk.isChecked()&&pint_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Cooking_converter.pint_uk_topint_us(value))) + "\t pt (US)");
                }



            }
        }catch (Exception e){

        }


    }
}
