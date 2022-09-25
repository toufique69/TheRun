package com.example.therun;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;



public class Track extends Activity{
	
	static int va = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		//fullscreen
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		setContentView(R.layout.activity_track);
		Typeface tf = Typeface.createFromAsset(getAssets(), "comic.ttf");
		TextView tv = (TextView)findViewById(R.id.buttont1);
		tv.setTypeface(tf);
		
		Button Buttont1= (Button) findViewById(R.id.buttont1);
		Buttont1.setOnClickListener(new OnClickListener() {
			
			
			@Override
			public void onClick(View v) {
				
				va = 1;
				startActivity(new Intent(Track.this,Game.class));// TODO Auto-generated method stub
				
			}
		});
		
		
		Button Buttont2= (Button) findViewById(R.id.buttont2);
		Buttont2.setTypeface(tf);
		Buttont2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				va = 2;
				startActivity(new Intent(Track.this,Game.class));// TODO Auto-generated method stub
				
			}
		});
		
		
		Button backtrackButton= (Button) findViewById(R.id.backtrack);
		backtrackButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent(Track.this,Menu.class));// TODO Auto-generated method stub
				
			}
		});
		
		
	}
	
	
	
	


	public static int getVa() {
		return va;
	}






	public static void setVa(int va) {
		Track.va = va;
	}







	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		finish();
		super.onPause();
	}
	
	
	

}
