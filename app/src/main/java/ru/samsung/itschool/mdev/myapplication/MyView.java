package ru.samsung.itschool.mdev.myapplication;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.view.View;

public class MyView extends View {

    public MyView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Paint paint = new Paint();

        paint.setColor(Color.BLUE);
        //paint.setColor(Color.parseColor("#000000"));
        paint.setStrokeWidth(10);

        canvas.drawLine(0,0,300,300,paint);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(400,400,100,paint);

        Path path = new Path();
        path.moveTo(400,400);
        path.lineTo(600,600);
        path.lineTo(500,400);

        canvas.drawPath(path,paint);



        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.drawable.download);
        canvas.drawBitmap(bitmap,800,800,paint);
        paint.setTextSize(40);
        canvas.drawText("Hello!",300,300,paint);

        //super.onDraw(canvas);
    }
}
