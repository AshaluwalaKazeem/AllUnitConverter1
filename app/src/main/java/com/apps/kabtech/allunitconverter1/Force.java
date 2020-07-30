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


public class Force extends AppCompatActivity {
    private ActionBar actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(Constant.theme);
        setContentView(R.layout.activity_force);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        actionBar = getSupportActionBar();
        String f = "Force";
        actionBar.setTitle(f);


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

    public void Calculate_force(View view){
        DecimalFormat textformat = new DecimalFormat("###,###,###,###,###,###.############");
        try{
            EditText text = (EditText) findViewById(R.id.distance_editText);
            TextView tview = (TextView)findViewById(R.id.distance_textView);
            // this is if we press the cancel button
            if(view.getId() == R.id.clear_button){
                text.setText("");tview.setText("");
                // this is if we press the convert button
            }else if (view.getId() == R.id.calulate_button){
                RadioButton dyne = (RadioButton)findViewById(R.id.dyne_radio);
                RadioButton dyne2 = (RadioButton)findViewById(R.id.dyne_radio2);
                RadioButton newton = (RadioButton)findViewById(R.id.newton_radio);
                RadioButton newton2 = (RadioButton)findViewById(R.id.newton_radio2);
                RadioButton decanewton = (RadioButton)findViewById(R.id.decanewton_radio);
                RadioButton decanewton2 = (RadioButton)findViewById(R.id.decanewton_radio2);
                RadioButton kilonewton = (RadioButton)findViewById(R.id.kilonewton_radio);
                RadioButton kilonewton2 = (RadioButton)findViewById(R.id.kilonewton_radio2);
                RadioButton gram_force = (RadioButton)findViewById(R.id.gram_force);
                RadioButton gram_force2 = (RadioButton)findViewById(R.id.gram_force2);
                RadioButton kilogram_force = (RadioButton)findViewById(R.id.kilogram_force_radio);
                RadioButton kilogram_force2 = (RadioButton)findViewById(R.id.kilogram_force_radio2);
                RadioButton pound_force = (RadioButton)findViewById(R.id.pound_force_radio);
                RadioButton pound_force2 = (RadioButton)findViewById(R.id.pound_force_radio2);
                RadioButton kip_force = (RadioButton)findViewById(R.id.kip_force_radio);
                RadioButton kip_force2 = (RadioButton)findViewById(R.id.kip_force_radio2);







                // this is if our text is empty
                if (text.getText().length()== 0){
                    Toast.makeText(this, "Please enter a valid number",
                            Toast.LENGTH_LONG ).show();
                    return;
                }else if (dyne.isChecked()&&dyne2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" + " dyn");
                }else if (newton.isChecked()&&newton2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +" n");
                }else if (decanewton.isChecked()&&decanewton2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +" daN");
                }else if (kilonewton.isChecked()&&kilonewton2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" + " kN");
                }else if (gram_force.isChecked()&&gram_force2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +" gf");
                }else if (kilogram_force.isChecked()&&kilogram_force2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +" kgf");
                }else if (pound_force.isChecked()&&pound_force2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" + " lbf");
                }else if (kip_force.isChecked()&&kip_force2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(value)) + "\t" +" kipf");
                }






                // if dyne and other radio button is click in second scroll

                else if (dyne.isChecked()&&newton2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(force_Converter.dyne_tonewton(value))) + "\t n" );
                }else if (dyne.isChecked()&&decanewton2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(force_Converter.dyne_todecanewton(value))) + "\t daN");
                }else if (dyne.isChecked()&&kilonewton2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(force_Converter.dyne_tokilonewton(value))) + "\t kN" );
                }else if (dyne.isChecked()&&gram_force2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(force_Converter.dyne_togram_force(value))) + "\t gf");
                }else if (dyne.isChecked()&&kilogram_force2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(force_Converter.dyne_tokilogram_force(value))) + "\t kgf" );
                }else if (dyne.isChecked()&&pound_force2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(force_Converter.dyne_topound_force(value))) + "\t lbf");
                }else if (dyne.isChecked()&&kip_force2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(force_Converter.dyne_tokip_force(value))) + "\t kipf" );
                }






                // if newton and other radio button is click in second scroll

                else if (newton.isChecked()&&dyne2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(force_Converter.newton_todyne(value))) + "\t dyn" );
                }else if (newton.isChecked()&&decanewton2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(force_Converter.newton_todecanewton(value))) + "\t daN");
                }else if (newton.isChecked()&&kilonewton2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(force_Converter.newton_tokilonewton(value))) + "\t kN" );
                }else if (newton.isChecked()&&gram_force2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(force_Converter.newton_togram_force(value))) + "\t gf");
                }else if (newton.isChecked()&&kilogram_force2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(force_Converter.newton_tokilogram_force(value))) + "\t kgf" );
                }else if (newton.isChecked()&&pound_force2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(force_Converter.newton_topound_force(value))) + "\t lbf");
                }else if (newton.isChecked()&&kip_force2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(force_Converter.newton_tokip_force(value))) + "\t kipf" );
                }







                // if decanewton and other radio button is click in second scroll

                else if (decanewton.isChecked()&&dyne2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(force_Converter.decanewton_todyne(value))) + "\t dyn" );
                }else if (decanewton.isChecked()&&newton2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(force_Converter.decanewton_tonewton(value))) + "\t n");
                }else if (decanewton.isChecked()&&kilonewton2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(force_Converter.decanewton_tokilonewton(value))) + "\t kN" );
                }else if (decanewton.isChecked()&&gram_force2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(force_Converter.decanewton_togram_force(value))) + "\t gf");
                }else if (decanewton.isChecked()&&kilogram_force2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(force_Converter.decanewton_tokilogram_force(value))) + "\t kgf" );
                }else if (decanewton.isChecked()&&pound_force2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(force_Converter.decanewton_topound_force(value))) + "\t lbf");
                }else if (decanewton.isChecked()&&kip_force2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(force_Converter.decanewton_tokip_force(value))) + "\t kipf" );
                }






                // if kilonewton and other radio button is click in second scroll

                else if (kilonewton.isChecked()&&dyne2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(force_Converter.kilonewton_todyne(value))) + "\t dyn" );
                }else if (kilonewton.isChecked()&&newton2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(force_Converter.kilonewton_tonewton(value))) + "\t n");
                }else if (kilonewton.isChecked()&&decanewton2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(force_Converter.kilonewton_todecanewton(value))) + "\t daN" );
                }else if (kilonewton.isChecked()&&gram_force2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(force_Converter.kilonewton_togram_force(value))) + "\t gf");
                }else if (kilonewton.isChecked()&&kilogram_force2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(force_Converter.kilonewton_tokilogram_force(value))) + "\t kgf" );
                }else if (kilonewton.isChecked()&&pound_force2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(force_Converter.kilonewton_topound_force(value))) + "\t lbf");
                }else if (kilonewton.isChecked()&&kip_force2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(force_Converter.kilonewton_tokip_force(value))) + "\t kipf" );
                }







                // if gram_force and other radio button is click in second scroll

                else if (gram_force.isChecked()&&dyne2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(force_Converter.gram_force_todyne(value))) + "\t dyn" );
                }else if (gram_force.isChecked()&&newton2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(force_Converter.gram_force_tonewton(value))) + "\t n");
                }else if (gram_force.isChecked()&&decanewton2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(force_Converter.gram_force_todecanewton(value))) + "\t daN" );
                }else if (gram_force.isChecked()&&kilonewton2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(force_Converter.gram_force_tokilonewton(value))) + "\t kN");
                }else if (gram_force.isChecked()&&kilogram_force2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(force_Converter.gram_force_tokilogram_force(value))) + "\t kgf" );
                }else if (gram_force.isChecked()&&pound_force2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(force_Converter.gram_force_topound_force(value))) + "\t lbf");
                }else if (gram_force.isChecked()&&kip_force2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(force_Converter.gram_force_tokip_force(value))) + "\t kipf" );
                }







                // if kilogram_force and other radio button is click in second scroll

                else if (kilogram_force.isChecked()&&dyne2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(force_Converter.kilogram_force_todyne(value))) + "\t dyn" );
                }else if (kilogram_force.isChecked()&&newton2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(force_Converter.kilogram_force_tonewton(value))) + "\t n");
                }else if (kilogram_force.isChecked()&&decanewton2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(force_Converter.kilogram_force_todecanewton(value))) + "\t daN" );
                }else if (kilogram_force.isChecked()&&kilonewton2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(force_Converter.kilogram_force_tokilonewton(value))) + "\t kN");
                }else if (kilogram_force.isChecked()&&gram_force2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(force_Converter.kilogram_force_togram_force(value))) + "\t gf" );
                }else if (kilogram_force.isChecked()&&pound_force2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(force_Converter.kilogram_force_topound_force(value))) + "\t lbf");
                }else if (kilogram_force.isChecked()&&kip_force2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(force_Converter.kilogram_force_tokip_force(value))) + "\t kipf" );
                }






                // if pound_force and other radio button is click in second scroll

                else if (pound_force.isChecked()&&dyne2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(force_Converter.pound_force_todyne(value))) + "\t dyn" );
                }else if (pound_force.isChecked()&&newton2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(force_Converter.pound_force_tonewton(value))) + "\t n");
                }else if (pound_force.isChecked()&&decanewton2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(force_Converter.pound_force_todecanewton(value))) + "\t daN" );
                }else if (pound_force.isChecked()&&kilonewton2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(force_Converter.pound_force_tokilonewton(value))) + "\t kN");
                }else if (pound_force.isChecked()&&gram_force2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(force_Converter.pound_force_togram_force(value))) + "\t gf" );
                }else if (pound_force.isChecked()&&kilogram_force2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(force_Converter.pound_force_tokilogram_force(value))) + "\t kgf");
                }else if (pound_force.isChecked()&&kip_force2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(force_Converter.pound_force_tokip_force(value))) + "\t kipf" );
                }






                // if kip_force and other radio button is click in second scroll

                else if (kip_force.isChecked()&&dyne2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(force_Converter.kip_force_todyne(value))) + "\t dyn" );
                }else if (kip_force.isChecked()&&newton2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(force_Converter.kip_force_tonewton(value))) + "\t n");
                }else if (kip_force.isChecked()&&decanewton2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(force_Converter.kip_force_todecanewton(value))) + "\t daN" );
                }else if (kip_force.isChecked()&&kilonewton2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(force_Converter.kip_force_tokilonewton(value))) + "\t kN");
                }else if (kip_force.isChecked()&&gram_force2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(force_Converter.kip_force_togram_force(value))) + "\t gf" );
                }else if (kip_force.isChecked()&&kilogram_force2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(force_Converter.kip_force_tokilogram_force(value))) + "\t kgf");
                }else if (kip_force.isChecked()&&pound_force2.isChecked()){
                    double value = Double.parseDouble(text.getText().toString());
                    tview.setText(String.valueOf(textformat.format(force_Converter.kip_force_topound_force(value))) + "\t lbf" );
                }












            }
        }catch (Exception e){

        }


    }
}
