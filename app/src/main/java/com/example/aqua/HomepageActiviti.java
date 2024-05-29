package com.example.aqua;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import android.widget.TextView;
import android.text.Html;


import com.google.android.material.navigation.NavigationView;


public class HomepageActiviti extends AppCompatActivity {

    Button extra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);

        Button group_869 = findViewById(R.id.group_869);

        group_869.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                openDrawer();
            }
        });
        //inisiasi komponen
        extra = findViewById(R.id.group_361);

        //event klik intent
        Intent intent = new Intent(HomepageActiviti.this, activity_extravaganza.class);
        startActivity(intent);


        // Menetapkan teks dengan format HTML ke TextView
        TextView textView = findViewById(R.id.scan_kode_d);
        String text = getResources().getString(R.string.scan_kode_d);
        textView.setText(Html.fromHtml(text, Html.FROM_HTML_MODE_COMPACT));
    }
    private void openDrawer() {
        DrawerLayout drawerLayout = findViewById(R.id.main);
        NavigationView navigationView = findViewById(R.id.hal_view);
        drawerLayout.openDrawer(GravityCompat.END);
    }
    public void scanbtl(View view) {
        Intent intent = new Intent(HomepageActiviti.this,scan_tutupbotolaqua.class);
        startActivity(intent);
    }
    public void reedem(View view){
        Intent intent = new Intent(HomepageActiviti.this,redeem_vaganza_katalog_page.class);
        startActivity(intent);
    }
    public void extra(View view){
        Intent intent = new Intent(HomepageActiviti.this,redeem_vaganza_katalog_page.class);
        startActivity(intent);
    }
    public void royal(View view){
        Intent intent = new Intent(HomepageActiviti.this,redeem_vaganza_katalog_page.class);
        startActivity(intent);
    }
}