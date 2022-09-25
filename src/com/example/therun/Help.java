package com.example.therun;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.view.WindowManager.LayoutParams;
import android.widget.Button;
import android.widget.TextView;

public class Help extends Activity{

	@Override
	protected void onCreate(Bundle present2) {
		// TODO Auto-generated method stub
		super.onCreate(present2);
		//fullscreen
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
		getWindow().addFlags(LayoutParams.FLAG_KEEP_SCREEN_ON);
			setContentView(R.layout.help);
			Typeface tf = Typeface.createFromAsset(getAssets(), "comic.ttf");
			TextView tv = (TextView)findViewById(R.id.help);
			tv.setTypeface(tf);
			
			Button backhelpbButton= (Button) findViewById(R.id.backhelp);
			backhelpbButton.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					startActivity(new Intent(Help.this,Menu.class));// TODO Auto-generated method stub
					
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
