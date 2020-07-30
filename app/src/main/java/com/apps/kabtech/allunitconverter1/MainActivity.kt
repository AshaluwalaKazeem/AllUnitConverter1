package com.apps.kabtech.allunitconverter1

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.content.SharedPreferences.Editor
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.webkit.WebView
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import com.apps.kabtech.allunitconverter1.MainActivity
import com.apptracker.android.track.AppTracker
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    private var mDrawerLayout: DrawerLayout? = null
    private var mToggle: ActionBarDrawerToggle? = null
    var editor: Editor? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var sharedPreferences: SharedPreferences? = null
        sharedPreferences = getSharedPreferences("setting", Context.MODE_PRIVATE)
        val color = sharedPreferences.getInt("color", Constant.color)
        val theme = sharedPreferences.getInt("theme", Constant.theme)
        Constant.color = color
        Constant.theme = theme
        setTheme(Constant.theme)
        setContentView(R.layout.activity_main)
        mDrawerLayout = findViewById<View>(R.id.drawer) as DrawerLayout
        mToggle = ActionBarDrawerToggle(this, mDrawerLayout, R.string.open, R.string.close)
        mDrawerLayout!!.addDrawerListener(mToggle!!)
        mToggle!!.syncState()
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        val navigationView = findViewById<NavigationView>(R.id.nav_view)
        navigationView.setNavigationItemSelectedListener(this)
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
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.setting_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (mToggle!!.onOptionsItemSelected(item)) {
            return true
        }
        when (item.itemId) {
            R.id.setting_id -> {
                val intent = Intent(this, SettinActivity::class.java)
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onBackPressed() {
        val builder = AlertDialog.Builder(this@MainActivity)
        builder.setMessage("Are you sure you want to close this app ?")
        builder.setCancelable(true)
        builder.setNegativeButton("No") { dialogInterface, i -> dialogInterface.cancel() }
        builder.setPositiveButton("Yes") { dialogInterface, i -> finish() }
        val alertDialog = builder.create()
        alertDialog.show()
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        val intent: Intent
        when (item.itemId) {
            R.id.home_menu -> {
                intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
            R.id.distance_menu -> {
                intent = Intent(this, Distance::class.java)
                startActivity(intent)
            }
            R.id.area_menu -> {
                intent = Intent(this, area::class.java)
                startActivity(intent)
            }
            R.id.volume_menu -> {
                intent = Intent(this, Volume::class.java)
                startActivity(intent)
            }
            R.id.weight_image -> {
                intent = Intent(this, Weight::class.java)
                startActivity(intent)
            }
            R.id.time_menu -> {
                intent = Intent(this, Time::class.java)
                startActivity(intent)
            }
            R.id.temperature_menu -> {
                intent = Intent(this, Temperature::class.java)
                startActivity(intent)
            }
            R.id.power_menu -> {
                intent = Intent(this, Power::class.java)
                startActivity(intent)
            }
            R.id.speed_menu -> {
                intent = Intent(this, Speed::class.java)
                startActivity(intent)
            }
            R.id.energy_menu -> {
                intent = Intent(this, Energy::class.java)
                startActivity(intent)
            }
            R.id.force_menu -> {
                intent = Intent(this, Force::class.java)
                startActivity(intent)
            }
            R.id.pressure_menu -> {
                intent = Intent(this, Pressure::class.java)
                startActivity(intent)
            }
            R.id.cooking_menu -> {
                intent = Intent(this, Cooking::class.java)
                startActivity(intent)
            }
            R.id.fuel_menu -> {
                intent = Intent(this, Fuel::class.java)
                startActivity(intent)
            }
            R.id.data_menu -> {
                intent = Intent(this, Data::class.java)
                startActivity(intent)
            }
        }
        return true
    }

    fun distance_onclick(view: View?) {
        val intent = Intent(this, Distance::class.java)
        startActivity(intent)
    }

    fun area_onclick(view: View?) {
        val intent = Intent(this, area::class.java)
        startActivity(intent)
    }

    fun volume_onclick(view: View?) {
        val intent = Intent(this, Volume::class.java)
        startActivity(intent)
    }

    fun weight_onclick(view: View?) {
        val intent = Intent(this, Weight::class.java)
        startActivity(intent)
    }

    fun time_onclick(view: View?) {
        val intent = Intent(this, Time::class.java)
        startActivity(intent)
    }

    fun temperature_onclick(view: View?) {
        val intent = Intent(this, Temperature::class.java)
        startActivity(intent)
    }

    fun power_onclick(view: View?) {
        val intent = Intent(this, Power::class.java)
        startActivity(intent)
    }

    fun speed_onclick(view: View?) {
        val intent = Intent(this, Speed::class.java)
        startActivity(intent)
    }

    fun energy_onclick(view: View?) {
        val intent = Intent(this, Energy::class.java)
        startActivity(intent)
    }

    fun force_onclick(view: View?) {
        val intent = Intent(this, Force::class.java)
        startActivity(intent)
    }

    fun pressure_onclick(view: View?) {
        val intent = Intent(this, Pressure::class.java)
        startActivity(intent)
    }

    fun cooking_onclick(view: View?) {
        val intent = Intent(this, Cooking::class.java)
        startActivity(intent)
    }

    fun fuel_onclick(view: View?) {
        val intent = Intent(this, Fuel::class.java)
        startActivity(intent)
    }

    fun data_onclick(view: View?) {
        val intent = Intent(this, Data::class.java)
        startActivity(intent)
    }
}