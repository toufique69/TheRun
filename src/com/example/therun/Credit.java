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



public class Credit extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		//fullscreen
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		setContentView(R.layout.credit);
		Typeface tf = Typeface.createFromAsset(getAssets(), "comic.ttf");
		TextView tv = (TextView)findViewById(R.id.credit);
		tv.setTypeface(tf);
		
		Button backcreditbButton= (Button) findViewById(R.id.backcredit);
		backcreditbButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(new Intent(Credit.this,Menu.class));// TODO Auto-generated method stub
				
			}
		});
		
		
	}
	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		finish();
		super.onPause();
	}
	
	
	

}
