package com.example.finalproject;

import android.os.Bundle;
import android.app.TabActivity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

@SuppressWarnings("deprecation")
public class Argentina extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.argentina);
		TabHost tabHost = getTabHost();
		//FIRST TAB
		TabSpec photospec = tabHost.newTabSpec("Photos");
		photospec.setIndicator("Photos", getResources().getDrawable(R.drawable.canadasign));
		Intent photosIntent = new Intent(Argentina.this, TabAgt1.class);
		photospec.setContent(photosIntent);
		//SECOND TAB
		TabSpec tourspec = tabHost.newTabSpec("Into");
		tourspec.setIndicator("Into", getResources().getDrawable(R.drawable.canadasign));
		Intent tourIntent = new Intent(this, TabAgt2.class);
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