package com.example.ringlibrary_by_ashraful;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class RingView extends View
{
    private float centerX,centerY,radius;

    private Paint paint = new Paint();


    public RingView(Context context) {
        super(context);
    }

    public RingView(Context context, @Nullable AttributeSet attrs) {

        super(context, attrs);

        TypedArray a = context.getTheme().obtainStyledAttributes(attrs, R.styleable.RingView,0,0);

        try {
            centerX = a.getFloat(R.styleable.RingView_centerX,0);
            centerY = a.getFloat(R.styleable.RingView_centerY,0);
            radius = a.getFloat(R.styleable.RingView_radius,0);
        }finally
        {
            a.recycle();
        }

    }



    public RingView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }



    @Override
    protected void onDraw(Canvas canvas)
    {
        paint.setStrokeWidth(25);

        paint.setStyle(Paint.Style.STROKE);

        paint.setColor(Color.GREEN);

        canvas.drawCircle(centerX,centerY,radius,paint);

        super.onDraw(canvas);
    }
}