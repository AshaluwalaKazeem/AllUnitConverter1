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


public class Data extends AppCompatActivity {
    private ActionBar actionbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(Constant.theme);
        setContentView(R.layout.activity_data);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        actionbar = getSupportActionBar();
        actionbar.setTitle("Digital Storage");

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
    public void Calculate_data(View view){
        DecimalFormat textformat = new DecimalFormat("###,###.##########");
        try{
            EditText text = (EditText) findViewById(R.id.distance_editText);
            TextView tview = (TextView)findViewById(R.id.distance_textView);
            // this is if we press the cancel button
            if(view.getId() == R.id.clear_button){
                text.setText("");tview.setText("");
                // this is if we press the convert button
            }else if (view.getId() == R.id.calulate_button){
                RadioButton bit = (RadioButton) findViewById(R.id.bit_radio);
                RadioButton bit2 = (RadioButton) findViewById(R.id.bit_radio2);
                RadioButton bytes = (RadioButton)findViewById(R.id.byte_radio);
                RadioButton bytes2 = (RadioButton)findViewById(R.id.byte_radio2);
                RadioButton kilobyte = (RadioButton)findViewById(R.id.kilobyte_radio);
                RadioButton kilobyte2 = (RadioButton)findViewById(R.id.kilobyte_radio2);
                RadioButton megabyte = (RadioButton)findViewById(R.id.megabyte_radio);
                RadioButton megabyte2 = (RadioButton)findViewById(R.id.megabyte_radio2);
                RadioButton gigabyte = (RadioButton)findViewById(R.id.gigabyte_radio);
                RadioButton gigabyte2 = (RadioButton)findViewById(R.id.gigabyte_radio2);
                RadioButton terabyte = (RadioButton) findViewById(R.id.terabyte_radio);
                RadioButton terabyte2 = (RadioButton) findViewById(R.id.terabyte_radio2);
                RadioButton petabyte = (RadioButton)findViewById(R.id.petabyte_radio);
                RadioButton petabyte2 = (RadioButton)findViewById(R.id.petabyte_radio2);
                RadioButton kilobit = (RadioButton)findViewById(R.id.kilobit_radio);
                RadioButton kilobit2 = (RadioButton)findViewById(R.id.kilobit_radio2);
                RadioButton megabit = (RadioButton) findViewById(R.id.megabit_radio);
                RadioButton megabit2 = (RadioButton) findViewById(R.id.megabit_radio2);
                RadioButton gigabit = (RadioButton)findViewById(R.id.gigabit_radio);
                RadioButton gigabit2 = (RadioButton)findViewById(R.id.gigabit_radio2);
                RadioButton terabit = (RadioButton)findViewById(R.id.terabit_radio);
                RadioButton terabit2 = (RadioButton)findViewById(R.id.terabit_radio2);
                RadioButton block = (RadioButton) findViewById(R.id.block_radio);
                RadioButton block2 = (RadioButton) findViewById(R.id.block_radio2);









                // this is if our text is empty
                if (text.getText().length()== 0){
                    Toast.makeText(this, "Please enter a valid number",
                            Toast.LENGTH_LONG ).show();
                    return;
                }else if (bit.isChecked()&&bit2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value))+ "\t"  + " b");
                }else if (bytes.isChecked()&&bytes2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" + " B");
                } else if (kilobyte.isChecked()&&kilobyte2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +" KB");
                } else if (megabyte.isChecked()&&megabyte2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +" MB");
                } else if (gigabyte.isChecked()&&gigabyte2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +"GB");
                }else if ( terabyte.isChecked()&&terabyte2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value))+ "\t"  + " TB");

                }else if (petabyte.isChecked()&&petabyte2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value))+ "\t"  + " PB");
                }else if (kilobit.isChecked()&&kilobit2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" + " Kb");
                } else if (megabit.isChecked()&&megabit2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +" Mb");
                } else if (gigabit.isChecked()&&gigabit2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +" Gb");
                } else if (terabit.isChecked()&&terabit2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +"Tb");
                }else if ( block.isChecked()&&block2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value))+ "\t"  + " block");

                }






                // if bit and other radio button is click in second scroll
                else if (bit.isChecked()&&bytes2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.bit_tobyte(value))) + "\t B" );
                }else if (bit.isChecked()&&kilobyte2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.bit_tokilobyte(value))) + "\t KB");
                }else if (bit.isChecked()&&megabyte2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.bit_tomegabyte(value))) + "\t MB" );
                } else if (bit.isChecked()&&gigabyte2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.bit_togigabyte(value))) + "\t GB");
                }else if (bit.isChecked()&&terabyte2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.bit_toterabyte(value))) + "\t TB");
                }else if (bit.isChecked()&&petabyte2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.bit_topetabyte(value))) + "\t PB" );
                }else if (bit.isChecked()&&kilobit2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.bit_tokilobit(value))) + "\t Kb");
                }else if (bit.isChecked()&&megabit2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.bit_tomegabit(value))) + "\t Mb");
                } else if (bit.isChecked()&&gigabit2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.bit_togigabit(value))) + "\t Gb");
                } else if (bit.isChecked()&&terabit2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.bit_toterabit(value))) + "\t Tb");
                }else if (bit.isChecked()&&block2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.bit_toblock(value))) + "\t block");
                }





                // if byte and other radio button is click in second scroll
                else if (bytes.isChecked()&&bit2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.byte_tobit(value))) + "\t b" );
                }else if (bytes.isChecked()&&kilobyte2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.byte_tokilobyte(value))) + "\t KB");
                }else if (bytes.isChecked()&&megabyte2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.byte_tomegabyte(value))) + "\t MB" );
                } else if (bytes.isChecked()&&gigabyte2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.byte_togigabyte(value))) + "\t GB");
                }else if (bytes.isChecked()&&terabyte2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.byte_toterabyte(value))) + "\t TB");
                }else if (bytes.isChecked()&&petabyte2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.byte_topetabyte(value))) + "\t PB" );
                }else if (bytes.isChecked()&&kilobit2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.byte_tokilobit(value))) + "\t Kb");
                }else if (bytes.isChecked()&&megabit2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.byte_tomegabit(value))) + "\t Mb");
                } else if (bytes.isChecked()&&gigabit2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.byte_togigabit(value))) + "\t Gb");
                } else if (bytes.isChecked()&&gigabit2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.byte_toterabit(value))) + "\t Gb");
                }else if (bytes.isChecked()&&block2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.byte_toblock(value))) + "\t block");
                }







                // if kilobyte and other radio button is click in second scroll
                else if (kilobyte.isChecked()&&bit2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.kilobyte_tobit(value))) + "\t b" );
                }else if (kilobyte.isChecked()&&bytes2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.kilobyte_tobyte(value))) + "\t B");
                }else if (kilobyte.isChecked()&&megabyte2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.kilobyte_tomegabyte(value))) + "\t MB" );
                } else if (kilobyte.isChecked()&&gigabyte2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.kilobyte_togigabyte(value))) + "\t GB");
                }else if (kilobyte.isChecked()&&terabyte2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.kilobyte_toterabyte(value))) + "\t TB");
                }else if (kilobyte.isChecked()&&petabyte2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.kilobyte_topetabyte(value))) + "\t PB" );
                }else if (kilobyte.isChecked()&&kilobit2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.kilobyte_tokilobit(value))) + "\t Kb");
                }else if (kilobyte.isChecked()&&megabit2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.kilobyte_tomegabit(value))) + "\t Mb");
                } else if (kilobyte.isChecked()&&gigabit2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.kilobyte_togigabit(value))) + "\t Gb");
                } else if (kilobyte.isChecked()&&gigabit2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.kilobyte_toterabit(value))) + "\t Gb");
                }else if (kilobyte.isChecked()&&block2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.kilobyte_toblock(value))) + "\t block");
                }








                // if megabyte and other radio button is click in second scroll
                else if (megabyte.isChecked()&&bit2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.megabyte_tobit(value))) + "\t b" );
                }else if (megabyte.isChecked()&&bytes2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.kilobyte_tobyte(value))) + "\t B");
                }else if (megabyte.isChecked()&&kilobyte2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.megabyte_tokilobyte(value))) + "\t KB" );
                } else if (megabyte.isChecked()&&gigabyte2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.megabyte_togigabyte(value))) + "\t GB");
                }else if (megabyte.isChecked()&&terabyte2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.megabyte_toterabyte(value))) + "\t TB");
                }else if (megabyte.isChecked()&&petabyte2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.megabyte_topetabyte(value))) + "\t PB" );
                }else if (megabyte.isChecked()&&kilobit2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.megabyte_tokilobit(value))) + "\t Kb");
                }else if (megabyte.isChecked()&&megabit2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.megabyte_tomegabit(value))) + "\t Mb");
                } else if (megabyte.isChecked()&&gigabit2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.megabyte_togigabit(value))) + "\t Gb");
                } else if (megabyte.isChecked()&&gigabit2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.megabyte_toterabit(value))) + "\t Gb");
                }else if (megabyte.isChecked()&&block2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.megabyte_toblock(value))) + "\t block");
                }










                // if gigabyte and other radio button is click in second scroll
                else if (gigabyte.isChecked()&&bit2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.gigabyte_tobit(value))) + "\t b" );
                }else if (gigabyte.isChecked()&&bytes2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.gigabyte_tobyte(value))) + "\t B");
                }else if (gigabyte.isChecked()&&kilobyte2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.gigabyte_tokilobyte(value))) + "\t KB" );
                } else if (gigabyte.isChecked()&&megabyte2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.gigabyte_tomegabyte(value))) + "\t MB");
                }else if (gigabyte.isChecked()&&terabyte2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.gigabyte_toterabyte(value))) + "\t TB");
                }else if (gigabyte.isChecked()&&petabyte2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.gigabyte_topetabyte(value))) + "\t PB" );
                }else if (gigabyte.isChecked()&&kilobit2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.gigabyte_tokilobit(value))) + "\t Kb");
                }else if (gigabyte.isChecked()&&megabit2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.gigabyte_tomegabit(value))) + "\t Mb");
                } else if (gigabyte.isChecked()&&gigabit2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.gigabyte_togigabit(value))) + "\t Gb");
                } else if (gigabyte.isChecked()&&gigabit2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.gigabyte_toterabit(value))) + "\t Gb");
                }else if (gigabyte.isChecked()&&block2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.gigabyte_toblock(value))) + "\t block");
                }









                // if terabyte and other radio button is click in second scroll
                else if (terabyte.isChecked()&&bit2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.terabyte_tobit(value))) + "\t b" );
                }else if (terabyte.isChecked()&&bytes2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.terabyte_tobyte(value))) + "\t B");
                }else if (terabyte.isChecked()&&kilobyte2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.terabyte_tokilobyte(value))) + "\t KB" );
                } else if (terabyte.isChecked()&&megabyte2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.terabyte_tomegabyte(value))) + "\t MB");
                }else if (terabyte.isChecked()&&gigabyte2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.terabyte_togigabyte(value))) + "\t GB");
                }else if (terabyte.isChecked()&&petabyte2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.terabyte_topetabyte(value))) + "\t PB" );
                }else if (terabyte.isChecked()&&kilobit2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.terabyte_tokilobit(value))) + "\t Kb");
                }else if (terabyte.isChecked()&&megabit2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.terabyte_tomegabit(value))) + "\t Mb");
                } else if (terabyte.isChecked()&&gigabit2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.terabyte_togigabit(value))) + "\t Gb");
                } else if (terabyte.isChecked()&&gigabit2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.terabyte_toterabit(value))) + "\t Gb");
                }else if (terabyte.isChecked()&&block2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.terabyte_toblock(value))) + "\t block");
                }









                // if petabyte and other radio button is click in second scroll
                else if (petabyte.isChecked()&&bit2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.petabyte_tobit(value))) + "\t b" );
                }else if (petabyte.isChecked()&&bytes2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.petabyte_tobyte(value))) + "\t B");
                }else if (petabyte.isChecked()&&kilobyte2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.petabyte_tokilobyte(value))) + "\t KB" );
                } else if (petabyte.isChecked()&&megabyte2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.petabyte_tomegabyte(value))) + "\t MB");
                }else if (petabyte.isChecked()&&gigabyte2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.petabyte_togigabyte(value))) + "\t GB");
                }else if (petabyte.isChecked()&&terabyte2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.petabyte_toterabyte(value))) + "\t TB" );
                }else if (petabyte.isChecked()&&kilobit2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.petabyte_tokilobit(value))) + "\t Kb");
                }else if (petabyte.isChecked()&&megabit2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.petabyte_tomegabit(value))) + "\t Mb");
                } else if (petabyte.isChecked()&&gigabit2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.petabyte_togigabit(value))) + "\t Gb");
                } else if (petabyte.isChecked()&&gigabit2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.petabyte_toterabit(value))) + "\t Gb");
                }else if (petabyte.isChecked()&&block2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.petabyte_toblock(value))) + "\t block");
                }








                // if kilobit and other radio button is click in second scroll
                else if (kilobit.isChecked()&&bit2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.kilobit_tobit(value))) + "\t b" );
                }else if (kilobit.isChecked()&&bytes2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.kilobit_tobyte(value))) + "\t B");
                }else if (kilobit.isChecked()&&kilobyte2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.kilobit_tokilobyte(value))) + "\t KB" );
                } else if (kilobit.isChecked()&&megabyte2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.kilobit_tomegabyte(value))) + "\t MB");
                }else if (kilobit.isChecked()&&gigabyte2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.kilobit_togigabyte(value))) + "\t GB");
                }else if (kilobit.isChecked()&&terabyte2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.kilobit_toterabyte(value))) + "\t TB" );
                }else if (kilobit.isChecked()&&petabyte2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.kilobit_topetabyte(value))) + "\t PB");
                }else if (kilobit.isChecked()&&megabit2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.kilobit_tomegabit(value))) + "\t Mb");
                } else if (kilobit.isChecked()&&gigabit2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.kilobit_togigabit(value))) + "\t Gb");
                } else if (kilobit.isChecked()&&gigabit2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.kilobit_toterabit(value))) + "\t Gb");
                }else if (kilobit.isChecked()&&block2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.kilobit_toblock(value))) + "\t block");
                }










                // if megabit and other radio button is click in second scroll
                else if (megabit.isChecked()&&bit2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.megabit_tobit(value))) + "\t b" );
                }else if (megabit.isChecked()&&bytes2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.megabit_tobyte(value))) + "\t B");
                }else if (megabit.isChecked()&&kilobyte2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.megabit_tokilobyte(value))) + "\t KB" );
                } else if (megabit.isChecked()&&megabyte2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.megabit_tomegabyte(value))) + "\t MB");
                }else if (megabit.isChecked()&&gigabyte2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.megabit_togigabyte(value))) + "\t GB");
                }else if (megabit.isChecked()&&terabyte2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.megabit_toterabyte(value))) + "\t TB" );
                }else if (megabit.isChecked()&&petabyte2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.megabit_topetabyte(value))) + "\t PB");
                }else if (megabit.isChecked()&&kilobit2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.megabit_tokilobit(value))) + "\t Kb");
                } else if (megabit.isChecked()&&gigabit2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.megabit_togigabit(value))) + "\t Gb");
                } else if (megabit.isChecked()&&gigabit2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.megabit_toterabit(value))) + "\t Gb");
                }else if (megabit.isChecked()&&block2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.megabit_toblock(value))) + "\t block");
                }







                // if gigabit and other radio button is click in second scroll
                else if (gigabit.isChecked()&&bit2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.gigabit_tobit(value))) + "\t b" );
                }else if (gigabit.isChecked()&&bytes2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.gigabit_tobyte(value))) + "\t B");
                }else if (gigabit.isChecked()&&kilobyte2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.gigabit_tokilobyte(value))) + "\t KB" );
                } else if (gigabit.isChecked()&&megabyte2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.gigabit_tomegabyte(value))) + "\t MB");
                }else if (gigabit.isChecked()&&gigabyte2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.gigabit_togigabyte(value))) + "\t GB");
                }else if (gigabit.isChecked()&&terabyte2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.gigabit_toterabyte(value))) + "\t TB" );
                }else if (gigabit.isChecked()&&petabyte2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.gigabit_topetabyte(value))) + "\t PB");
                }else if (gigabit.isChecked()&&kilobit2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.gigabit_tokilobit(value))) + "\t Kb");
                } else if (gigabit.isChecked()&&megabit2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.gigabit_tomegabit(value))) + "\t Mb");
                } else if (gigabit.isChecked()&&terabit2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.gigabit_toterabit(value))) + "\t Tb");
                }else if (gigabit.isChecked()&&block2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.gigabit_toblock(value))) + "\t block");
                }








                // if terabit and other radio button is click in second scroll
                else if (terabit.isChecked()&&bit2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.terabit_tobit(value))) + "\t b" );
                }else if (terabit.isChecked()&&bytes2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.terabit_tobyte(value))) + "\t B");
                }else if (terabit.isChecked()&&kilobyte2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.terabit_tokilobyte(value))) + "\t KB" );
                } else if (terabit.isChecked()&&megabyte2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.terabit_tomegabyte(value))) + "\t MB");
                }else if (terabit.isChecked()&&gigabyte2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.terabit_togigabyte(value))) + "\t GB");
                }else if (terabit.isChecked()&&terabyte2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.terabit_toterabyte(value))) + "\t TB" );
                }else if (terabit.isChecked()&&petabyte2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.terabit_topetabyte(value))) + "\t PB");
                }else if (terabit.isChecked()&&kilobit2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.terabit_tokilobit(value))) + "\t Kb");
                } else if (terabit.isChecked()&&megabit2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.terabit_tomegabit(value))) + "\t Mb");
                } else if (terabit.isChecked()&&gigabit2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.terabit_togigabit(value))) + "\t Gb");
                }else if (terabit.isChecked()&&block2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.terabit_toblock(value))) + "\t block");
                }








                // if block and other radio button is click in second scroll
                else if (block.isChecked()&&bit2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.block_tobit(value))) + "\t b" );
                }else if (block.isChecked()&&bytes2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.block_tobyte(value))) + "\t B");
                }else if (block.isChecked()&&kilobyte2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.block_tokilobyte(value))) + "\t KB" );
                } else if (block.isChecked()&&megabyte2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.block_tomegabyte(value))) + "\t MB");
                }else if (block.isChecked()&&gigabyte2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.block_togigabyte(value))) + "\t GB");
                }else if (block.isChecked()&&terabyte2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.block_toterabyte(value))) + "\t TB" );
                }else if (block.isChecked()&&petabyte2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.block_topetabyte(value))) + "\t PB");
                }else if (block.isChecked()&&kilobit2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.block_tokilobit(value))) + "\t Kb");
                } else if (block.isChecked()&&megabit2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.block_tomegabit(value))) + "\t Mb");
                } else if (block.isChecked()&&gigabit2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.block_togigabit(value))) + "\t Gb");
                }else if (block.isChecked()&&terabit2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(data_Converter.block_toterabit(value))) + "\t Tb");
                }











            }
        }catch (Exception e){

        }


    }


}


















