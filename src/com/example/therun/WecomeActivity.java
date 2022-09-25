package com.example.therun;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.TextView;

public class WecomeActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		setContentView(R.layout.activity_wecome);
		Typeface tf = Typeface.createFromAsset(getAssets(), "comic.ttf");
		TextView tv = (TextView)findViewById(R.id.StartText);
		tv.setTypeface(tf);
		
		final Button StartButton =(Button) findViewById(R.id.StartButton);
		
		StartButton.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				switch (event.getAction()) {
				case MotionEvent.ACTION_DOWN:
					
					StartButton.getBackground().setAlpha(100);
					
					break;
                case MotionEvent.ACTION_UP:
					Intent intent = new Intent(WecomeActivity.this, com.example.therun.Menu.class);
					startActivity(intent);
					StartButton.getBackground().setAlpha(255);
					
					break;
                case MotionEvent.ACTION_MOVE:
	
	                break;
				default:
					break;
				}
				return false;
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.wecome, menu);
		return true;
	}
	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		finish();
		super.onPause();
	}
	
	

}
