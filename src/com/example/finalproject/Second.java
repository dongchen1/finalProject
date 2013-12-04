package com.example.finalproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Second extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second);
		
		Button northamerica = (Button) findViewById(R.id.northamerica);
		northamerica.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(Second.this, NorthAmerica.class));
			}
		});	
		
		Button africa = (Button) findViewById(R.id.africa);
		africa.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(Second.this, Africa.class));
			}
		});	
		
		Button europe = (Button) findViewById(R.id.europe);
		europe.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(Second.this, Eroupe.class));
			}
		});
		
		Button asia = (Button) findViewById(R.id.asia);
		asia.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(Second.this, Asia.class));
			}
		});	
	}
}

