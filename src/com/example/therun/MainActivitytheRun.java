package com.example.therun;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import android.app.Activity;
public class MainActivitytheRun extends Activity {

	@Override
	protected void onCreate(Bundle present) {
		super.onCreate(present);
		//fullscreen
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_main_activitythe_run);
		
		
	}
}
