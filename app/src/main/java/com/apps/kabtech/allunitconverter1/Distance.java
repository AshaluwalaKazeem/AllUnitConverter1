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

public class Distance extends AppCompatActivity {

    private ActionBar actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setTheme(Constant.theme);
        setContentView(R.layout.activity_distance);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        actionBar = getSupportActionBar();
        actionBar.setTitle("Distance");

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
    public void calculate_distance(View view){
        DecimalFormat textformat = new DecimalFormat("###,###,###,###,###,###.############");
        try{
            EditText text = (EditText) findViewById(R.id.distance_editText);
            TextView tview = (TextView)findViewById(R.id.distance_textView);
            // this is if we press the cancel button
            if(view.getId() == R.id.clear_button){
                text.setText("");tview.setText("");
                // this is if we press the convert button
            }else if (view.getId() == R.id.calulate_button){
                RadioButton micro1 = (RadioButton)findViewById(R.id.micrometer_radio);
                RadioButton micro2 = (RadioButton)findViewById(R.id.micrometer_radio2);
                RadioButton milli = (RadioButton)findViewById(R.id.millimeter_radio);
                RadioButton milli2 = (RadioButton)findViewById(R.id.millimeter_radio2);
                RadioButton cent = (RadioButton)findViewById(R.id.centimeter_radio);
                RadioButton cent2 = (RadioButton)findViewById(R.id.centimeter_radio2);
                RadioButton deci = (RadioButton)findViewById(R.id.decimeter_radio);
                RadioButton deci2 = (RadioButton)findViewById(R.id.decimeter_radio2);
                RadioButton meter = (RadioButton)findViewById(R.id.meter_radio);
                RadioButton meter2 = (RadioButton)findViewById(R.id.meter_radio2);
                RadioButton kilome = (RadioButton)findViewById(R.id.kilometer_radio);
                RadioButton kilome2 = (RadioButton)findViewById(R.id.kilometer_radio2);
                RadioButton mile = (RadioButton) findViewById(R.id.mile_radio);
                RadioButton mile2 = (RadioButton) findViewById(R.id.mile_radio2);
                RadioButton inch = (RadioButton) findViewById(R.id.inch_radio);
                RadioButton inch2 = (RadioButton) findViewById(R.id.inch_radio2);
                RadioButton yard = (RadioButton) findViewById(R.id.yard_radio);
                RadioButton yard2 = (RadioButton) findViewById(R.id.yard_radio2);
                RadioButton foot = (RadioButton) findViewById(R.id.foot_radio);
                RadioButton foot2 = (RadioButton) findViewById(R.id.foot_radio2);

                // this is if our text is empty
                if (text.getText().length()== 0){
                    Toast.makeText(this, "Please enter a valid number",
                            Toast.LENGTH_LONG ).show();
                    return;
                }else if (micro1.isChecked()&&micro2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t micrometer");
                } else if (milli.isChecked()&&milli2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t mm");
                } else if (cent.isChecked()&&cent2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t cm");
                }else if (deci.isChecked()&&deci2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t dm");
                }else if (meter.isChecked()&&meter2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t m");
                }else if (kilome.isChecked()&&kilome2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t km");
                }else if (mile.isChecked()&&mile2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t mi");
                }else if (inch.isChecked()&&inch2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t in");
                }else if (foot.isChecked()&&foot2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t ft");
                }else if (yard.isChecked()&&yard2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t yd");
                }
                // if micro and other radio button is click in second scroll
                else if (micro1.isChecked()&&milli2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.micro_tomilli(value))) + "\t mm");
                }else if (micro1.isChecked()&&cent2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.micro_tocent(value))) + "\t cm");
                }else if (micro1.isChecked()&&deci2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.micro_todeci(value))) + "\t dm");
                }else if (micro1.isChecked()&&meter2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.micro_tometer(value))) + "\t m");
                }else if (micro1.isChecked()&&kilome2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.micro_tokilo(value))) + "\t km");
                }else if (micro1.isChecked()&&mile2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.micro_tomile(value))) + "\t mi");
                }else if (micro1.isChecked()&&inch2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.micro_toinch(value))) + "\t in");
                }else if (micro1.isChecked()&&foot2.isChecked()) {
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.micro_tofoot(value))) + "\t ft");
                }else if (micro1.isChecked()&&yard2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.micro_toyard(value))) + "\t yd");

                }
                // if milli and other radio button is click in second scroll
                else if (milli.isChecked()&&micro2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.milli_tomicro(value))) + "\t micrometer");

                }else if (milli.isChecked()&&cent2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.milli_tocent(value))) + "\t cm");

                }else if (milli.isChecked()&&deci2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.milli_todeci(value))) + "\t dm");

                }else if (milli.isChecked()&&meter2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.milli_tometer(value))) + "\t m");

                }else if (milli.isChecked()&&kilome2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.milli_tokilometer(value))) + "\t km");

                }else if (milli.isChecked()&&mile2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.milli_tomile(value))) + "\t mi");

                }else if (milli.isChecked()&&inch2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.milli_toinch(value))) + "\t in");

                }else if (milli.isChecked()&&foot2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.milli_tofoot(value))) + "\t ft");

                }else if (milli.isChecked()&&yard2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.milli_toyard(value))) + "\t yd");

                }




                // if cent and other radio button is click in second scroll
                else if (cent.isChecked()&&micro2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.cent_tomicro(value))) + "\t micrometer");

                }else if (cent.isChecked()&&milli2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.cent_tomilli(value))) + "\t mm");

                }else if (cent.isChecked()&&deci2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.cent_todeci(value))) + "\t dm");

                }else if (cent.isChecked()&&meter2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.cent_tometer(value))) + "\t m");

                }else if (cent.isChecked()&&kilome2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.cent_tokilometer(value))) + "\t km");

                }else if (cent.isChecked()&&mile2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.cent_tomile(value))) + "\t mi");

                }else if (cent.isChecked()&&inch2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.cent_toinch(value))) + "\t in");

                }else if (cent.isChecked()&&foot2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.cent_tofoot(value))) + "\t ft");

                }else if (cent.isChecked()&&yard2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.cent_toyard(value))) + "\t yd");

                }



                // if deci and other radio button is click in second scroll
                else if (deci.isChecked()&&micro2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.deci_tomicro(value))) + "\t micrometer");

                }else if (deci.isChecked()&&milli2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.deci_tomilli(value))) + "\t mm");

                }else if (deci.isChecked()&&cent2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.deci_tocent(value))) + "\t cm");

                }else if (deci.isChecked()&&meter2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.deci_tometer(value))) + "\t m");

                }else if (deci.isChecked()&&kilome2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.deci_tokilometer(value))) + "\t km");

                }else if (deci.isChecked()&&mile2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.deci_tomile(value))) + "\t mi");

                }else if (deci.isChecked()&&inch2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.deci_toinch(value))) + "\t in");

                }else if (deci.isChecked()&&foot2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.deci_tofoot(value))) + "\t ft");

                }else if (deci.isChecked()&&yard2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.deci_toyard(value))) + "\t yd");

                }



                // if meter and other radio button is click in second scroll
                else if (meter.isChecked()&&micro2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.meter_tomicro(value))) + "\t micrometer");

                }else if (meter.isChecked()&&milli2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.meter_tomilli(value))) + "\t mm");

                }else if (meter.isChecked()&&cent2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.meter_tocent(value))) + "\t cm");

                }else if (meter.isChecked()&&deci2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.meter_todeci(value))) + "\t dm");

                }else if (meter.isChecked()&&kilome2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.meter_tokilometer(value))) + "\t km");

                }else if (meter.isChecked()&&mile2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.meter_tomile(value))) + "\t mi");

                }else if (meter.isChecked()&&inch2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.meter_toinch(value))) + "\t in");

                }else if (meter.isChecked()&&foot2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.meter_tofoot(value))) + "\t ft");

                }else if (meter.isChecked()&&yard2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.meter_toyard(value))) + "\t yd");

                }



                // if kilometer and other radio button is click in second scroll
                else if (kilome.isChecked()&&micro2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.kilo_tomicro(value))) + "\t micrometer");

                }else if (kilome.isChecked()&&milli2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.kilo_tomilli(value))) + "\t mm");

                }else if (kilome.isChecked()&&cent2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.kilo_tocent(value))) + "\t cm");

                }else if (kilome.isChecked()&&deci2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.kilo_todeci(value))) + "\t dm");

                }else if (kilome.isChecked()&&meter2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.kilo_tometer(value))) + "\t m");

                }else if (kilome.isChecked()&&mile2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.kilo_tomile(value))) + "\t mi");

                }else if (kilome.isChecked()&&inch2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.kilo_toinch(value))) + "\t in");

                }else if (kilome.isChecked()&&foot2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.kilo_tofoot(value))) + "\t ft");

                }else if (kilome.isChecked()&&yard2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.kilo_toyard(value))) + "\t yd");

                }




                // if mile and other radio button is click in second scroll
                else if (mile.isChecked()&&micro2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.mile_tomicro(value))) + "\t micrometer");

                }else if (mile.isChecked()&&milli2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.mile_tomilli(value))) + "\t mm");

                }else if (mile.isChecked()&&cent2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.mile_tocent(value))) + "\t cm");

                }else if (mile.isChecked()&&deci2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.mile_todeci(value))) + "\t dm");

                }else if (mile.isChecked()&&meter2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.mile_tometer(value))) + "\t m");

                }else if (mile.isChecked()&&kilome2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.mile_tokilom(value))) + "\t km");

                }else if (mile.isChecked()&&inch2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.mile_toinch(value))) + "\t in");

                }else if (mile.isChecked()&&foot2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.mile_tofoot(value))) + "\t ft");

                }else if (mile.isChecked()&&yard2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.mile_toyard(value))) + "\t yd");

                }



                // if inch and other radio button is click in second scroll
                else if (inch.isChecked()&&micro2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.inch_tomicro(value))) + "\t micrometer");

                }else if (inch.isChecked()&&milli2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.inch_tomilli(value))) + "\t mm");

                }else if (inch.isChecked()&&cent2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.inch_tocent(value))) + "\t cm");

                }else if (inch.isChecked()&&deci2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.inch_todeci(value))) + "\t dm");

                }else if (inch.isChecked()&&meter2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.inch_tometer(value))) + "\t m");

                }else if (inch.isChecked()&&kilome2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.inch_tokilom(value))) + "\t km");

                }else if (inch.isChecked()&&mile2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.inch_tomile(value))) + "\t mi");

                }else if (inch.isChecked()&&foot2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.inch_tofoot(value))) + "\t ft");

                }else if (inch.isChecked()&&yard2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.inch_toyard(value))) + "\t yd");

                }



                // if foot and other radio button is click in second scroll
                else if (foot.isChecked()&&micro2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.foot_tomicro(value))) + "\t micrometer");

                }else if (foot.isChecked()&&milli2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.foot_tomilli(value))) + "\t mm");

                }else if (foot.isChecked()&&cent2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.foot_tocent(value))) + "\t cm");

                }else if (foot.isChecked()&&deci2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.foot_todeci(value))) + "\t dm");

                }else if (foot.isChecked()&&meter2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.foot_tometer(value))) + "\t m");

                }else if (foot.isChecked()&&kilome2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.foot_tokilom(value))) + "\t km");

                }else if (foot.isChecked()&&mile2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.foot_tomile(value))) + "\t mi");

                }else if (foot.isChecked()&&inch2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.foot_toinch(value))) + "\t in");

                }else if (foot.isChecked()&&yard2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.foot_toyard(value))) + "\t yd");

                }




                // if yard and other radio button is click in second scroll
                else if (yard.isChecked()&&micro2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.yard_tomicro(value))) + "\t micrometer");

                }else if (yard.isChecked()&&milli2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.yard_tomilli(value))) + "\t mm");

                }else if (yard.isChecked()&&cent2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.yard_tocent(value))) + "\t cm");

                }else if (yard.isChecked()&&deci2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.yard_todeci(value))) + "\t dm");

                }else if (yard.isChecked()&&meter2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.yard_tometer(value))) + "\t m");

                }else if (yard.isChecked()&&kilome2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.yard_tokilom(value))) + "\t km");

                }else if (yard.isChecked()&&mile2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.yard_tomile(value))) + "\t mi");

                }else if (yard.isChecked()&&inch2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.yard_toinch(value))) + "\t in");

                }else if (yard.isChecked()&&foot2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(Distance_Converter.yard_tofoot(value))) + "\t yd");

                }







            }


        }catch (Exception e){

        }

    }
}
