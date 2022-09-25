package com.example.therun;


import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class Splash extends Activity
{
	MediaPlayer ourSong;

	@Override
	protected void onCreate(Bundle rundo) {
		// TODO Auto-generated method stub
		super.onCreate(rundo);
		//fullscreen
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.splash);
		
		ourSong = MediaPlayer.create(Splash.this, R.raw.m1);
		ourSong.start();
		
		Thread timer = new Thread(){
				
				public void run(){
					
					try{
						sleep(3000);
						
					}catch(InterruptedException e){
						
						e.printStackTrace();
						
					}finally{
						Intent openStartingPoint = new Intent("com.example.therun.WECOMEACTIVITY");
						startActivity(openStartingPoint);
					}
					
					
				}
					
			};
			timer.start();
	}
		

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		
		ourSong.release();
		finish();
	
	}

}
