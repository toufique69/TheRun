package com.example.therun;



import android.app.Activity;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;

public class Game extends Activity{

	GameView  ourGameView;
	SensorManager sensorManager;
	SensorEventListener sensorEventListener;
	Sensor accelerometerSensor;
	public static float getgY() {
		return gY;
	}

	public static void setgY(float gY) {
		Game.gY = gY;
	}

	private static float gX,gY;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
		getWindow().addFlags(LayoutParams.FLAG_KEEP_SCREEN_ON);
		
		ourGameView = new GameView(this);
		initializeSensor();
		
		setContentView(ourGameView);
		
	}

	private void initializeSensor() {
		// TODO Auto-generated method stub
		sensorManager =(SensorManager) getSystemService(SENSOR_SERVICE);
		
		sensorEventListener = new SensorEventListener() {
			
			@Override
			public void onSensorChanged(SensorEvent event) {
				// TODO Auto-generated method stub
			if(event.sensor.getType()==Sensor.TYPE_ACCELEROMETER)	
				gX = -event.values[0];
				gY = event.values[1];
			}
			
			@Override
			public void onAccuracyChanged(Sensor arg0, int arg1) {
				// TODO Auto-generated method stub
				
			}
		};
		
		accelerometerSensor = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
		startUsingSensor();
		
		
		
		
		
		
	}

	private void startUsingSensor() {
		// TODO Auto-generated method stub
		
		sensorManager.registerListener(sensorEventListener, accelerometerSensor, SensorManager.SENSOR_DELAY_NORMAL);
		
		
	}
	
	
	private void stopUsingSensor() {
		sensorManager.unregisterListener(sensorEventListener);
		
	}
	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		stopUsingSensor();
		super.onPause();
	}
	
	public static float getgX() {
		return gX;
	}

	public static void setgX(float gX) {
		Game.gX = gX;
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		startUsingSensor();
		super.onResume();
	}
	
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		stopUsingSensor();
		super.onStart();
	}
	

	
	

}
