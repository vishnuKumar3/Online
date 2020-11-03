package com.example.online

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.widget.Toolbar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),NavigationView.OnNavigationItemSelectedListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().replace(R.id.framelayout,home()).commit()
        val t:Toolbar=findViewById(R.id.toolbar)
        t.setTitle(R.string.app_name)
        t.setTitleTextColor(Color.WHITE)
        val d:DrawerLayout=findViewById(R.id.drawerlayout)
        val n:NavigationView=findViewById(R.id.navview)
        n.setNavigationItemSelectedListener(this)
        val a:ActionBarDrawerToggle= ActionBarDrawerToggle(
            this,
            drawerlayout,
            toolbar,
            R.string.open,
            R.string.close
        )

        d.addDrawerListener(a)
        a.syncState()
    }

    override fun onBackPressed() {
        val d:DrawerLayout=findViewById(R.id.drawerlayout)
        if(d.isDrawerOpen(GravityCompat.START)){
            d.closeDrawer(GravityCompat.START)
        }
        else{
        super.onBackPressed()
    }}

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
            when(item.itemId){
                R.id.searchengine ->
                supportFragmentManager.beginTransaction().replace(R.id.framelayout,engines()).commit()
                R.id.home ->
                    supportFragmentManager.beginTransaction().replace(R.id.framelayout,home()).commit()
                R.id.webdesign ->
                    supportFragmentManager.beginTransaction().replace(R.id.framelayout,Webdesigning()).commit()
                R.id.appdesign ->
                    supportFragmentManager.beginTransaction().replace(R.id.framelayout,Appdesigning()).commit()
            }
        val d:DrawerLayout=findViewById(R.id.drawerlayout)
        d.closeDrawer(GravityCompat.START)
        return true
    }
}