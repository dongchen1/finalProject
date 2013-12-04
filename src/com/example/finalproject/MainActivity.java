package com.example.finalproject;

import java.util.Timer;
import java.util.TimerTask;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.ImageView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final ImageView iv1 = (ImageView) findViewById(R.id.world07);
		TimerTask task = new TimerTask(){
			
			@Override
			public void run(){
				finish();
				startActivity(new Intent(MainActivity.this, Second.class));
			}
		};
		Timer opening = new Timer();
		opening.schedule(task, 2500);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
