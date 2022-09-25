package com.example.therun;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.Button;

public class Menu extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		//fullscreen
		//requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.firstmenu);
	}

	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_activitythe_run, menu);
		Button StartGame= (Button) findViewById(R.id.startGame);
		Typeface tf = Typeface.createFromAsset(getAssets(), "comic.ttf");
		StartGame.setTypeface(tf);
		StartGame.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				startActivity(new Intent(Menu.this,Track.class));
			}
		});
		
		Button htp= (Button) findViewById(R.id.howtoplay);
		htp.setTypeface(tf);
		htp.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				startActivity(new Intent(Menu.this,Help.class));
				
			}
		});
		
		Button scoButton= (Button) findViewById(R.id.HighScore);
		scoButton.setTypeface(tf);
		scoButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				startActivity(new Intent(Menu.this,Scores.class));
				
			}
		});
		
		Button exitbButton= (Button) findViewById(R.id.exitbutton);
		exitbButton.setTypeface(tf);
		exitbButton.setOnClickListener(new OnClickListener() {
			
			
			
			@Override
			public void onClick(View v) {
				
				finish();
	            System.exit(0);
			}
			
		});
	
		Button about= (Button) findViewById(R.id.About);
		about.setTypeface(tf);
		about.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent(Menu.this,Credit.class));// TODO Auto-generated method stub
				
			}
		});
		return true;
		
	}

	
	
	

}
