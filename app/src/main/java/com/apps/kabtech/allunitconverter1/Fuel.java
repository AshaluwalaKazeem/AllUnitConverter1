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

public class Fuel extends AppCompatActivity {
    private ActionBar actionbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(Constant.theme);
        setContentView(R.layout.activity_fuel);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        actionbar = getSupportActionBar();
        actionbar.setTitle("Fuel");


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


    public void Calculate_fuel(View view){
        DecimalFormat textformat = new DecimalFormat("###,###.##########");
        try{
            EditText text = (EditText) findViewById(R.id.distance_editText);
            TextView tview = (TextView)findViewById(R.id.distance_textView);
            // this is if we press the cancel button
            if(view.getId() == R.id.clear_button){
                text.setText("");tview.setText("");
                // this is if we press the convert button
            }else if (view.getId() == R.id.calulate_button){
                RadioButton kilometer_litre = (RadioButton) findViewById(R.id.kilometer_litre_radio);
                RadioButton kilometer_litre2 = (RadioButton) findViewById(R.id.kilometer_litre_radio2);
                RadioButton mile_litre = (RadioButton)findViewById(R.id.mile_litre_radio);
                RadioButton mile_litre2 = (RadioButton)findViewById(R.id.mile_litre_radio2);
                RadioButton kilometer_gallon_us = (RadioButton)findViewById(R.id.kilometer_gallon_us_radio);
                RadioButton kilometer_gallon_us2 = (RadioButton)findViewById(R.id.kilometer_gallon_us_radio2);
                RadioButton mile_gallon_us = (RadioButton)findViewById(R.id.mile_gallon_us_radio);
                RadioButton mile_gallon_us2 = (RadioButton)findViewById(R.id.mile_gallon_us_radio2);
                RadioButton mile_gallon_uk = (RadioButton)findViewById(R.id.mile_gallon_uk_radio);
                RadioButton mile_gallon_uk2 = (RadioButton)findViewById(R.id.mile_gallon_uk_radio2);
                RadioButton litre_100km = (RadioButton) findViewById(R.id.litre100km_radio);
                RadioButton litre_100km2 = (RadioButton) findViewById(R.id.litre100km_radio2);









                // this is if our text is empty
                if (text.getText().length()== 0){
                    Toast.makeText(this, "Please enter a valid number",
                            Toast.LENGTH_LONG ).show();
                    return;
                }else if (kilometer_litre.isChecked()&&kilometer_litre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value))+ "\t"  + " Km/L");
                }else if (mile_litre.isChecked()&&mile_litre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" + " mi/L");
                } else if (kilometer_gallon_us.isChecked()&&kilometer_gallon_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +" Km/gal(Us)");
                } else if (mile_gallon_us.isChecked()&&mile_gallon_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +" mi/gal(Us)");
                } else if (mile_gallon_uk.isChecked()&&mile_gallon_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +" mi/gal(Uk)");
                }else if (litre_100km.isChecked()&&litre_100km2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value))+ "\t"  + " L/Km");
                }






                // if kilometer_litre and other radio button is click in second scroll
                else if (kilometer_litre.isChecked()&&mile_litre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(feul_Converter.kilometer_litre_tomile_litre(value))) + "\t mi/L" );
                }else if (kilometer_litre.isChecked()&&kilometer_gallon_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(feul_Converter.kilometer_litre_tokilometer_gallon_us(value))) + "\t Km/gal(Us)");
                }else if (kilometer_litre.isChecked()&&mile_gallon_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(feul_Converter.kilometer_litre_tomile_gallon_us(value))) + "\t mi/gal(Us)");
                } else if (kilometer_litre.isChecked()&&mile_gallon_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(feul_Converter.kilometer_litre_tomile_gallon_uk(value))) + "\t mi/gal(Uk)");
                }else if (kilometer_litre.isChecked()&&litre_100km2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(feul_Converter.kilometer_litre_tolitre100km(value))) + "\t L/Km");
                }








                // if mile_lite and other radio button is click in second scroll
                else if (mile_litre.isChecked()&&kilometer_litre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(feul_Converter.mile_litre_tokilometer_litre(value))) + "\t Km/L" );
                }else if (kilometer_litre.isChecked()&&kilometer_gallon_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(feul_Converter.mile_litre_tokilometer_gallon_us(value))) + "\t Km/gal(Us)");
                }else if (kilometer_litre.isChecked()&&mile_gallon_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(feul_Converter.mile_litre_tomile_gallon_us(value))) + "\t mi/gal(Us)");
                } else if (kilometer_litre.isChecked()&&mile_gallon_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(feul_Converter.mile_litre_tomile_gallon_uk(value))) + "\t mi/gal(Uk)");
                }else if (kilometer_litre.isChecked()&&litre_100km2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(feul_Converter.mile_litre_tolitre100km(value))) + "\t L/Km");
                }








                // if mile_lite and other radio button is click in second scroll
                else if (mile_litre.isChecked()&&kilometer_litre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(feul_Converter.mile_litre_tokilometer_litre(value))) + "\t Km/L" );
                }else if (mile_litre.isChecked()&&kilometer_gallon_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(feul_Converter.mile_litre_tokilometer_gallon_us(value))) + "\t Km/gal(Us)");
                }else if (mile_litre.isChecked()&&mile_gallon_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(feul_Converter.mile_litre_tomile_gallon_us(value))) + "\t mi/gal(Us)");
                } else if (mile_litre.isChecked()&&mile_gallon_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(feul_Converter.mile_litre_tomile_gallon_uk(value))) + "\t mi/gal(Uk)");
                }else if (mile_litre.isChecked()&&litre_100km2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(feul_Converter.mile_litre_tolitre100km(value))) + "\t L/Km");
                }






                // if mile_lite and other radio button is click in second scroll
                else if (mile_litre.isChecked()&&kilometer_litre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(feul_Converter.mile_litre_tokilometer_litre(value))) + "\t Km/L" );
                }else if (mile_litre.isChecked()&&kilometer_gallon_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(feul_Converter.mile_litre_tokilometer_gallon_us(value))) + "\t Km/gal(Us)");
                }else if (mile_litre.isChecked()&&mile_gallon_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(feul_Converter.mile_litre_tomile_gallon_us(value))) + "\t mi/gal(Us)");
                } else if (mile_litre.isChecked()&&mile_gallon_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(feul_Converter.mile_litre_tomile_gallon_uk(value))) + "\t mi/gal(Uk)");
                }else if (mile_litre.isChecked()&&litre_100km2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(feul_Converter.mile_litre_tolitre100km(value))) + "\t L/Km");
                }






                // if kilometer_gallon_us and other radio button is click in second scroll
                else if (kilometer_gallon_us.isChecked()&&kilometer_litre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(feul_Converter.kilometer_gallon_us_tokilometer_litre(value))) + "\t Km/L" );
                }else if (kilometer_gallon_us.isChecked()&&mile_litre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(feul_Converter.kilometer_gallon_us_tomile_litre(value))) + "\t mi/L");
                }else if (kilometer_gallon_us.isChecked()&&mile_gallon_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(feul_Converter.kilometer_gallon_us_tomile_gallon_us(value))) + "\t mi/gal(Us)");
                } else if (kilometer_gallon_us.isChecked()&&mile_gallon_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(feul_Converter.kilometer_gallon_us_tomile_gallon_uk(value))) + "\t mi/gal(Uk)");
                }else if (kilometer_gallon_us.isChecked()&&litre_100km2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(feul_Converter.kilometer_gallon_us_tolitre100km(value))) + "\t L/Km");
                }






                // if mile_gallon_us and other radio button is click in second scroll
                else if (mile_gallon_us.isChecked()&&kilometer_litre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(feul_Converter.mile_gallon_us_tokilometer_litre(value))) + "\t Km/L" );
                }else if (mile_gallon_us.isChecked()&&mile_litre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(feul_Converter.mile_gallon_us_tomile_litre(value))) + "\t mi/L");
                }else if (mile_gallon_us.isChecked()&&kilometer_gallon_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(feul_Converter.mile_gallon_us_tokilometer_gallon_us(value))) + "\t mi/gal(Us)");
                } else if (mile_gallon_us.isChecked()&&mile_gallon_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(feul_Converter.mile_gallon_us_tomile_gallon_uk(value))) + "\t mi/gal(Uk)");
                }else if (mile_gallon_us.isChecked()&&litre_100km2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(feul_Converter.mile_gallon_us_tolitre100km(value))) + "\t L/Km");
                }






                // if mile_gallon_us and other radio button is click in second scroll
                else if (mile_gallon_us.isChecked()&&kilometer_litre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(feul_Converter.mile_gallon_us_tokilometer_litre(value))) + "\t Km/L" );
                }else if (mile_gallon_us.isChecked()&&mile_litre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(feul_Converter.mile_gallon_us_tomile_litre(value))) + "\t mi/L");
                }else if (mile_gallon_us.isChecked()&&kilometer_gallon_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(feul_Converter.mile_gallon_us_tokilometer_gallon_us(value))) + "\t mi/gal(Us)");
                } else if (mile_gallon_us.isChecked()&&mile_gallon_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(feul_Converter.mile_gallon_us_tomile_gallon_uk(value))) + "\t mi/gal(Uk)");
                }else if (mile_gallon_us.isChecked()&&litre_100km2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(feul_Converter.mile_gallon_us_tolitre100km(value))) + "\t L/Km");
                }





                // if mile_gallon_uk and other radio button is click in second scroll
                else if (mile_gallon_uk.isChecked()&&kilometer_litre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(feul_Converter.mile_gallon_uk_tokilometer_litre(value))) + "\t Km/L" );
                }else if (mile_gallon_uk.isChecked()&&mile_litre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(feul_Converter.mile_gallon_uk_tomile_litre(value))) + "\t mi/L");
                }else if (mile_gallon_uk.isChecked()&&kilometer_gallon_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(feul_Converter.mile_gallon_uk_tokilometer_gallon_us(value))) + "\t mi/gal(Us)");
                } else if (mile_gallon_uk.isChecked()&&mile_gallon_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(feul_Converter.mile_gallon_uk_tomile_gallon_us(value))) + "\t mi/gal(Us)");
                }else if (mile_gallon_uk.isChecked()&&litre_100km2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(feul_Converter.mile_gallon_uk_tolitre100km(value))) + "\t L/Km");
                }







                // if litre_100km and other radio button is click in second scroll
                else if (litre_100km.isChecked()&&kilometer_litre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(feul_Converter.litre100km_tokilometer_litre(value))) + "\t Km/L" );
                }else if (litre_100km.isChecked()&&mile_litre2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(feul_Converter.litre100km_tomile_litre(value))) + "\t mi/L");
                }else if (litre_100km.isChecked()&&kilometer_gallon_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(feul_Converter.litre100km_tokilometer_gallon_us(value))) + "\t Km/gal(Us)");
                } else if (litre_100km.isChecked()&&mile_gallon_us2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(feul_Converter.litre100km_tomile_gallon_us(value))) + "\t mi/gal(Us)");
                }else if (litre_100km.isChecked()&&mile_gallon_uk2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(feul_Converter.litre100km_tomile_gallon_uk(value))) + "\t mi/gal (Uk)");
                }








            }
        }catch (Exception e){

        }


    }


}
