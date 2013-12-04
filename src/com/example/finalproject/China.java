package com.example.finalproject;

import android.os.Bundle;
import android.app.TabActivity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

@SuppressWarnings("deprecation")
public class China extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.china);
		TabHost tabHost = getTabHost();
		//FIRST TAB
		TabSpec photospec = tabHost.newTabSpec("city");
		photospec.setIndicator("city", getResources().getDrawable(R.drawable.ccy));
		Intent photosIntent = new Intent(China.this, TabChina1.class);
		photospec.setContent(photosIntent);
		//SECOND TAB
		TabSpec tourspec = tabHost.newTabSpec("Trip");
		tourspec.setIndicator("Trip", getResources().getDrawable(R.drawable.ccy));
		Intent tourIntent = new Intent(this, TabChina2.class);
		tourspec.setContent(tourIntent);
		//THIRD TAB
		//TabSpec webspec = tabHost.newTabSpec("Web Site");
		//webspec.setIndicator("Web Site", getResources().getDrawable(R.drawable.usasign));
		//Intent webIntent = new Intent(this, TabUsa3.class);
		//webspec.setContent(webIntent);
		//ADD TabSpec To TabHost
		tabHost.addTab(photospec);
		tabHost.addTab(tourspec);
		//tabHost.addTab(webspec);
		}
}