package com.example.finalproject;

import android.os.Bundle;
import android.app.TabActivity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

@SuppressWarnings("deprecation")
public class America extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.america);
		TabHost tabHost = getTabHost();
		//FIRST TAB
		TabSpec photospec = tabHost.newTabSpec("CITIES");
		photospec.setIndicator("CITIES", getResources().getDrawable(R.drawable.usasign));
		Intent photosIntent = new Intent(America.this, TabUsa1.class);
		photospec.setContent(photosIntent);
		//SECOND TAB
		TabSpec tourspec = tabHost.newTabSpec("BOOKING TRIP");
		tourspec.setIndicator("BOOKING TRIP", getResources().getDrawable(R.drawable.usasign));
		Intent tourIntent = new Intent(this, TabUsa2.class);
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