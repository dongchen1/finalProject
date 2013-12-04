package com.example.finalproject;

import java.util.Calendar;

import android.os.Bundle;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class TabChina2 extends Activity {
	private int currentYear;
	private int currentMonth;
	private int currentDay;
	static final int DATE_DIALOG_ID = 0;
	private Button btDate;
	private TextView reservation;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tabchina2);
		reservation = (TextView) findViewById(R.id.txtReservation);
		btDate = (Button) findViewById (R.id.butDate);
		btDate.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				showDialog(DATE_DIALOG_ID);
			}
		});
		final Calendar c = Calendar.getInstance();
		currentYear = c.get(Calendar.YEAR);
		currentMonth = c.get(Calendar.MONTH);
		currentDay = c.get(Calendar.DAY_OF_MONTH);
	}
	
	protected Dialog onCreateDialog(int id){
		switch (id) {
			case DATE_DIALOG_ID:
				return new DatePickerDialog(this, reservationDate, currentYear, currentMonth, currentDay);				
		}
		return null;
	}
	

	private DatePickerDialog.OnDateSetListener reservationDate = 
			new DatePickerDialog.OnDateSetListener() {
		
				
				@Override
				public void onDateSet(DatePicker view, int year, int month, int day) {
					// TODO Auto-generated method stub
					reservation.setText("Your reservation is set for " + (month + 1) + ( "-" ) + day +( "-" ) + year);
				}
			};
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}

