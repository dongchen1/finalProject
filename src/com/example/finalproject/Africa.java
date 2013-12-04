package com.example.finalproject;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.Toast;

public class Africa extends Activity {

	Integer[] Animals = {R.drawable.nafei, R.drawable.kenniya};
	ImageView imageView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.africa);
		
		Gallery ga = (Gallery)findViewById(R.id.gallery1);
		imageView = (ImageView)findViewById(R.id.imgAnimal);
		ga.setAdapter(new ImageAdapter(this));
		ga.setOnItemClickListener(new OnItemClickListener(){
			
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3){
				/*Toast.makeText(getBaseContext(), "You have selected picture " + (arg2 + 1) +
						" " + "of the country", Toast.LENGTH_SHORT).show();
				imageView.setImageResource(Animals[arg2]);
				*/
				if((arg2+1) == 1){
					Toast.makeText(getBaseContext(), "You have selected picture is South Africa", Toast.LENGTH_SHORT).show();
					imageView.setImageResource(Animals[arg2]);
					startActivity(new Intent(Africa.this,SouthAfrica.class));
				}
			
				if((arg2+1) == 2){
					Toast.makeText(getBaseContext(), "You have selected picture is Keniya", Toast.LENGTH_SHORT).show();
					imageView.setImageResource(Animals[arg2]);
					startActivity(new Intent(Africa.this,Kenya.class));
				}
			}
		});
	}
	
	public class ImageAdapter extends BaseAdapter{
		private Context context;
		public ImageAdapter(Context c){
			context = c;
		}
		
		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return Animals.length;
		}

		@Override
		public Object getItem(int arg0) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public long getItemId(int arg0) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public View getView(int arg0, View arg1, ViewGroup arg2) {
			// TODO Auto-generated method stub
			ImageView pic = new ImageView(context);
			pic.setImageResource(Animals[arg0]);
			pic.setScaleType(ImageView.ScaleType.FIT_XY);
			pic.setLayoutParams(new Gallery.LayoutParams(400, 350));
			return pic;
		}
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}