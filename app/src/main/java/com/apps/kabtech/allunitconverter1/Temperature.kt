package com.apps.kabtech.allunitconverter1

import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.widget.*
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import com.apps.kabtech.allunitconverter1.temperature_Converter.celsius_tofah
import com.apps.kabtech.allunitconverter1.temperature_Converter.celsius_tokel
import com.apps.kabtech.allunitconverter1.temperature_Converter.fah_tocelsius
import com.apps.kabtech.allunitconverter1.temperature_Converter.fah_tokel
import com.apps.kabtech.allunitconverter1.temperature_Converter.kel_tocelsius
import com.apps.kabtech.allunitconverter1.temperature_Converter.kel_tofah
import com.apptracker.android.track.AppTracker
import java.text.DecimalFormat

class Temperature : AppCompatActivity() {
    private var actionBar: ActionBar? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(Constant.theme)
        setContentView(R.layout.activity_temperature)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        actionBar = supportActionBar
        actionBar!!.title = "Temperature"
        if (savedInstanceState == null) {
            // Initialize Leadbolt SDK with your api key
            AppTracker.startSession(applicationContext, "s0QoNt6vk2jG68pCHAnrWvu1q1NqvWKz", true)

            //AppTracker.loadModuleToCache(getApplicationContext(), "inapp");
        }
        AppTracker.loadModule(applicationContext, "inapp")
        val leadBoltAd = findViewById<WebView>(R.id.leadBoltBanner)
        val leadBoltAdHtmlString = "<script type=\"text/javascript\" src=\"http://ad.leadbolt.net/show_app_ad.js?section_id=762478312\"></script>"
        leadBoltAd.settings.javaScriptEnabled = true
        leadBoltAd.loadData(leadBoltAdHtmlString, "text/html", "utf-8")
        val edit = findViewById<View>(R.id.distance_editText) as TextView
        edit.setTextColor(Constant.color)
        val view = findViewById<View>(R.id.distance_textView) as TextView
        view.setTextColor(Constant.color)
        val cont1 = findViewById<View>(R.id.content1) as LinearLayout
        val cont2 = findViewById<View>(R.id.content2) as LinearLayout
        cont1.setBackgroundColor(Constant.color)
        cont2.setBackgroundColor(Constant.color)
        val clear_but = findViewById<View>(R.id.clear_button) as Button
        clear_but.drawingCacheBackgroundColor = Constant.color
        val clear_buttext = findViewById<View>(R.id.clear_button) as Button
        clear_buttext.setTextColor(Constant.color)
        val cal_but = findViewById<View>(R.id.calulate_button) as Button
        cal_but.drawingCacheBackgroundColor = Constant.color
        val cal_buttext = findViewById<View>(R.id.calulate_button) as Button
        cal_buttext.setTextColor(Constant.color)
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }

    fun Calculate_temperature(view: View) {
        val textformat = DecimalFormat("###,###,###,###,###,###.############")
        try {
            val text = findViewById<View>(R.id.distance_editText) as EditText
            val tview = findViewById<View>(R.id.distance_textView) as TextView
            // this is if we press the cancel button
            if (view.id == R.id.clear_button) {
                text.setText("")
                tview.text = ""
                // this is if we press the convert button
            } else if (view.id == R.id.calulate_button) {
                val celsius = findViewById<View>(R.id.celsius_radio) as RadioButton
                val celsius2 = findViewById<View>(R.id.celsius_radio2) as RadioButton
                val fah = findViewById<View>(R.id.fahrenheit_radio) as RadioButton
                val fah2 = findViewById<View>(R.id.fahrenheit_radio2) as RadioButton
                val kel = findViewById<View>(R.id.kelvin_radio) as RadioButton
                val kel2 = findViewById<View>(R.id.kelvin_radio2) as RadioButton


                // this is if our text is empty
                if (text.text.length == 0) {
                    Toast.makeText(this, "Please enter a valid number",
                            Toast.LENGTH_LONG).show()
                    return
                } else if (celsius.isChecked && celsius2.isChecked) {
                    val value = text.text.toString().toDouble()
                    tview.text = textformat.format(value).toString() + "\t" + " celcuis"
                } else if (fah.isChecked && fah2.isChecked) {
                    val value = text.text.toString().toDouble()
                    tview.text = textformat.format(value).toString() + "\t" + " fahrenheit"
                } else if (kel.isChecked && kel2.isChecked) {
                    val value = text.text.toString().toDouble()
                    tview.text = textformat.format(value).toString() + "\t" + " kelvin"
                } else if (celsius.isChecked && fah2.isChecked) {
                    val value = text.text.toString().toDouble()
                    tview.text = textformat.format(celsius_tofah(value)).toString() + "\t fahrenheit"
                } else if (celsius.isChecked && kel2.isChecked) {
                    val value = text.text.toString().toDouble()
                    tview.text = textformat.format(celsius_tokel(value)).toString() + "\t kelvin"
                } else if (fah.isChecked && celsius2.isChecked) {
                    val value = text.text.toString().toDouble()
                    tview.text = textformat.format(fah_tocelsius(value)).toString() + "\t celsius"
                } else if (fah.isChecked && kel2.isChecked) {
                    val value = text.text.toString().toDouble()
                    tview.text = textformat.format(fah_tokel(value)).toString() + "\t kelvin"
                } else if (kel.isChecked && celsius2.isChecked) {
                    val value = text.text.toString().toDouble()
                    tview.text = textformat.format(kel_tocelsius(value)).toString() + "\t celsius"
                } else if (kel.isChecked && fah2.isChecked) {
                    val value = text.text.toString().toDouble()
                    tview.text = textformat.format(kel_tofah(value)).toString() + "\t fahrenheit"
                }
            }
        } catch (e: Exception) {
        }
    }
}