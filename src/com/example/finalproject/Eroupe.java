package com.example.finalproject;

import android.net.Uri;
import android.os.Bundle;
import android.app.ListActivity;
import android.content.Intent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Eroupe extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		String[] attraction = {"United Kingdom", "Franch", "Norway", 
				"Spain", "Italy", "Switzerland", "Austrain" };
		setListAdapter(new ArrayAdapter<String>(this,R.layout.europe, R.id.travel, attraction));	
	}

	protected void onListItemClick(ListView l, View v, int position, long id) {
		switch (position){
			case 0:
				startActivity(new Intent(Eroupe.this, UK.class));
				break;
			case 1:
				startActivity(new Intent(Eroupe.this, FR.class));
				break;
		}
	}
}