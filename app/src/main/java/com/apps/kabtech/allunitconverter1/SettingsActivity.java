package com.apps.kabtech.allunitconverter1;

import android.annotation.TargetApi;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.turkialkhateeb.materialcolorpicker.ColorChooserDialog;
import com.turkialkhateeb.materialcolorpicker.ColorListener;

public class SettingsActivity extends AppCompatActivity {
    private ActionBar actionBar;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    Button button;
    Methods methods;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(Constant.theme);
        setContentView(R.layout.activity_settings);
        actionBar = getSupportActionBar();
        actionBar.setTitle("Settings");

        final Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar_setting);
        toolbar.setTitle("Settings");
        toolbar.setBackgroundColor(Constant.color);

        methods = new Methods();
        button = (Button)findViewById(R.id.button_color);
        sharedPreferences = getSharedPreferences("setting", MODE_PRIVATE);
        editor = sharedPreferences.edit();

        colorize();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ColorChooserDialog dialog = new ColorChooserDialog(SettingsActivity.this);
                dialog.setTitle("Select");
                dialog.setColorListener(new ColorListener() {
                    @Override
                    public void OnColorClick(View v, int color) {
                        colorize();
                        Constant.color = color;
                        methods.setColorTheme();
                        editor.putInt("color", color);
                        editor.putInt("theme", Constant.theme);
                        editor.apply();
                        Intent intent = new Intent(SettingsActivity.this, MainActivity.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(intent);
                    }
                });
                dialog.show();
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                onBackPressed();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    private void colorize(){
        ShapeDrawable d = new ShapeDrawable(new OvalShape());
        d.setBounds(58, 58, 58, 58);
        d.getPaint().setStyle(Paint.Style.FILL);
        d.getPaint().setColor(Constant.color);
        button.setBackground(d);
    }
}
