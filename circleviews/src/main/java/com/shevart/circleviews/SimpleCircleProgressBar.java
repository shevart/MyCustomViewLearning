package com.shevart.circleviews;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;

import com.shevart.circleviews.utils.UiUtil;

public class SimpleCircleProgressBar extends BaseCircleView {
    private RectF circleRectF;
    private Paint circleActiveIndicatorPaint;
    private float circleStrokeWidth;

    public SimpleCircleProgressBar(Context context) {
        super(context);
    }

    public SimpleCircleProgressBar(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SimpleCircleProgressBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    protected void init() {
        circleRectF = new RectF();
        circleActiveIndicatorPaint = new Paint();

        circleStrokeWidth = UiUtil.convertDpToPixel(10, getContext());

        circleActiveIndicatorPaint.setColor(Color.YELLOW);
        circleActiveIndicatorPaint.setStyle(Paint.Style.STROKE);
        circleActiveIndicatorPaint.setStrokeWidth(circleStrokeWidth);
        circleActiveIndicatorPaint.setAntiAlias(true);
        circleActiveIndicatorPaint.setStrokeCap(Paint.Cap.ROUND);
    }

    @SuppressWarnings("SuspiciousNameCombination")
    @Override
    protected void onDraw(Canvas canvas) {

        // draw active circle indicator
        canvas.save();
        rotateCanvasForCircleIndicator(canvas, CIRCLE_INDICATOR_BOTTOM);
        circleRectF.set(circleStrokeWidth, circleStrokeWidth,
                getWidth() - circleStrokeWidth, getHeight() - circleStrokeWidth);
        canvas.drawArc(circleRectF, 0, 275, false, circleActiveIndicatorPaint);
        canvas.restore();
    }
}