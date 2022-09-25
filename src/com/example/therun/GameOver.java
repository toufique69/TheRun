package com.example.therun;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.Button;

public class GameOver extends Activity{

	@Override
	protected void onCreate(Bundle present2) {
		// TODO Auto-generated method stub
		super.onCreate(present2);
		//fullscreen
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
			setContentView(R.layout.activity_game_over);
			
			
			Button backhelpbButton= (Button) findViewById(R.id.backover);
			backhelpbButton.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					startActivity(new Intent(GameOver.this,Menu.class));// TODO Auto-generated method stub
					
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
