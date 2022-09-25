package com.example.therun;



import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.view.View;

public class GameView extends View{
	
	Context mContext;

	Bitmap aCar, streeta, streetb,streetaa, streetbb, eCar,fCar, gCar, hCar;
	float changeYe = -100, changeYf = -600, changeYg = -1100,changeYh = -1600, changeXe = 45, changeXf = 415, changeXg = 220,changeXh = 590, acarY = 900 , acarX = 170,acc, accx = 0, score = 0;
	float se = 10,sf = 10,sg = 10,sh = 10;
	int e,f,g=1,h,i = 0, j = 0, m = 0, sp =0, v = Track.getVa();
	
	
	public GameView(Context context) {
		super(context);
		
		// TODO Auto-generated constructor stub
		aCar = BitmapFactory.decodeResource(getResources(), R.drawable.playercaro);
		eCar = BitmapFactory.decodeResource(getResources(),R.drawable.op);
		fCar = BitmapFactory.decodeResource(getResources(),R.drawable.opp);		
		gCar = BitmapFactory.decodeResource(getResources(),R.drawable.oppp);
		hCar = BitmapFactory.decodeResource(getResources(),R.drawable.opppp);
		streeta = BitmapFactory.decodeResource(getResources(), R.drawable.streeta);
		streetb = BitmapFactory.decodeResource(getResources(), R.drawable.streetb);
		streetaa = BitmapFactory.decodeResource(getResources(), R.drawable.streetaa);
		streetbb = BitmapFactory.decodeResource(getResources(), R.drawable.streetbb);
		
	}

	@SuppressLint("DrawAllocation")
	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);
		
		if ( v == 1)
		{
			
			if (j%12 == 0)   // background
			{	
				i++;	
			}
			if (i%2==0) {
				canvas.drawBitmap(streeta, 0, 0, null);
				
			} else {
				canvas.drawBitmap(streetb, 0, 0, null);
			}
			
		} 
		
		if(v==2) 
		{
			if (j%12 == 0)   // background
			{	
				i++;	
			}
			if (i%2==0) {
				canvas.drawBitmap(streetaa, 0, 0, null);
				
			} else {
				canvas.drawBitmap(streetbb, 0, 0, null);
			}
		}
		
		
		
		
		
		
		
		
		Paint textPaint = new Paint();  //  score
		textPaint.setARGB(100, 255, 255, 0);
		textPaint.setTextAlign(Align.LEFT);
		textPaint.setTextSize(50);
		canvas.drawText("Score: " +score, 45, 50, textPaint);
		
		
		
		
		canvas.drawBitmap(eCar, changeXe, changeYe, null);  //   car
		canvas.drawBitmap(fCar, changeXf, changeYf, null);	
		canvas.drawBitmap(gCar, changeXg, changeYg, null);	
		canvas.drawBitmap(hCar, changeXh, changeYh, null);
		canvas.drawBitmap(aCar, acarX, acarY, null);
		
		
		
		
		
		//breakcondition
		
		if((((changeXe -75 <= acarX) && (changeXe + 70 >= acarX)) && ((changeYe <= acarY) &&(changeYe + 140 >= acarY)))   || (((changeYe-150 <= acarY) && (changeYe + 140 >= acarY)) && ((changeXe <= acarX) && (changeXe+70 >= acarX))))
		{	
			
		    mContext=getContext();

		  mContext.startActivity(new Intent(mContext,GameOver.class));
		} // e  
		
		if((((changeXf -75 <= acarX) && (changeXf + 70 >= acarX)) && ((changeYf <= acarY) &&(changeYf + 140 >= acarY)))   || (((changeYf-150 <= acarY) && (changeYf + 140 >= acarY)) && ((changeXf <= acarX) && (changeXf+70 >= acarX))))
		{	
				
			
		    mContext=getContext();

		   mContext.startActivity(new Intent(mContext,GameOver.class));
		} //f
		
		if((((changeXg -75 <= acarX) && (changeXg + 70 >= acarX)) && ((changeYg <= acarY) &&(changeYg + 140 >= acarY)))   || (((changeYg-150 <= acarY) && (changeYg + 140 >= acarY)) && ((changeXg <= acarX) && (changeXg+70 >= acarX))))
		{	
			
		    mContext=getContext();

		   mContext.startActivity(new Intent(mContext,GameOver.class));
		} //g
		
		if((((changeXh -75 <= acarX) && (changeXh + 70 >= acarX)) && ((changeYh <= acarY) &&(changeYh + 140 >= acarY)))   || (((changeYh-150 <= acarY) && (changeYh + 140 >= acarY)) && ((changeXh <= acarX) && (changeXh+70 >= acarX))))
		{		
			
		   mContext=getContext();

		    mContext.startActivity(new Intent(mContext,GameOver.class));
		}//h
		
		
		
		
		
		
		
		
		
		
		
		
		
		//  tilte  car  
		
		acarY = acarY  + Game.getgY();
		acc = Game.getgX();
		
		//accx = acc;
		
		if ((accx-acc)>.7) 
		{/*
			
			if (10 > (acc + accx ) && 625 < (acc+ accx)) {
				
				acarX = accx;
				
			} else {
				if ((10 <= acarX) && (625 >= acarX)) {
					acarX =270 + (100 * acc);
					accx = acc;
				}
			}*/
			acarX =270 + (100 * acc);
			accx = acc;
			
		}
		
		else if ((accx-acc)<.7) 
		{/*
			if (10 > (acc + accx ) && 625 < (acc+ accx)) {
			
			acarX = accx;
			
		} else {
			if ((10 <= acarX) && (625 >= acarX)) {
				acarX =270 + (100 * acc);
				accx = acc;
			}

		}*/
			acarX =270 + (100 * acc);
			accx = acc;
		}
		else {
			acarX = accx;
		}
		
		/*  // border car
		if (acarX < 10 || acarX > 625) {
			
			 mContext=getContext();

			  mContext.startActivity(new Intent(mContext,GameOver.class));
			
		}
		
		if (acarY > 1280 || 0  > acarY) {
			
			 mContext=getContext();

			  mContext.startActivity(new Intent(mContext,GameOver.class));
			
		}
		*/
		
		
		
		//level  1
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		if(changeYe < canvas.getHeight())
		{
			changeYe = changeYe + se;
		}else
		{
			if(changeXe == 45)
			{
			score = score + 10;
			
			changeXe = 415;
			changeYe = -100;
			}
			
			
			else if(changeXe == 415)
			{
			score = score + 10;
			
			changeXe = 220;
			changeYe = -100;
			}
			
			else if(changeXe == 220)
			{
			score = score + 10;
			
			changeXe = 590;
			changeYe = -100;
			}
			else if(changeXe == 590)
			{
			score = score + 10;
			
			changeXe = 45;
			changeYe = -100;
			
			se++;
			}
			
		}
		
		
		
		if(changeYf < canvas.getHeight())
		{
			changeYf = changeYf + sf;
		}else
		{
			if(changeXf == 415)
			{
			score = score + 10;
			
			changeXf = 220;
			changeYf = -100;
			}
			else if(changeXf == 220)
			{
			score = score + 10;
			
			changeXf = 590;
			changeYf = -100;
			}
			else if(changeXf == 590)
			{
			score = score + 10;
			
			changeXf = 45;
			changeYf = -100;
			}
			else if(changeXf == 45)
			{
			score = score + 10;
			
			changeXf = 415;
			changeYf = -100;
			sf++;
			}
			
		}
		
		
		
		if(changeYg < canvas.getHeight())
		{
			changeYg = changeYg + sg;
		}else
		{
			if(changeXg == 220)
			{
			score = score + 10;
			
			changeXg = 590;
			changeYg = -100;
			}
			
			else if(changeXg == 590)
			{
			score = score + 10;
			
			changeXg = 45;
			changeYg = -100;
			}
			else if(changeXg == 45)
			{
			score = score + 10;
			
			changeXg = 415;
			changeYg = -100;
			}
			else if(changeXg == 415)
			{
			score = score + 10;
			
			changeXg = 220;
			changeYg = -100;
			sg++;
			}
			
			
		}
		
		
		
		if(changeYh < canvas.getHeight())
		{
			changeYh = changeYh + sh;
		}else
		{
			if(changeXh == 590)
			{
			score = score + 10;
			
			changeXh = 45;
			changeYh = -100;
			}
			
			else if(changeXh == 45)
			{
			score = score + 10;
			
			changeXh = 415;
			changeYh = -100;
			}
			else if(changeXh == 415)
			{
			score = score + 10;
			
			changeXh = 220;
			changeYh = -100;
			}
			else if(changeXh == 220)
			{
			score = score + 10;
			
			changeXh = 590;
			changeYh = -100;
			sh++;
			}
		}
		
		
		
		
		j++;
		
		invalidate();
	}
	
	

}
