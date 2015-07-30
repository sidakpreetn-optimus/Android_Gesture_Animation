package com.example.gesturedemo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class DrawingView extends View {

	private Paint paint = new Paint();
	private Path path = new Path();
	
	protected void onDraw(Canvas canvas) {
		canvas.drawPath(path, paint);
	}

	public boolean onTouchEvent(MotionEvent event) {
		float xvalue = event.getX();
		float yvalue = event.getY();
		
		switch(event.getActionMasked()) {
		case MotionEvent.ACTION_DOWN :
			path.moveTo(xvalue, yvalue);
			return true;
		case MotionEvent.ACTION_MOVE :
			path.lineTo(xvalue, yvalue);
			break;
		}
		invalidate();
		return true;
	}

	public DrawingView(Context context, AttributeSet attrs) {
		super(context, attrs);
		
		paint.setColor(Color.BLUE);
	    paint.setStyle(Paint.Style.STROKE);
	    paint.setStrokeWidth(5f);
	}

}
