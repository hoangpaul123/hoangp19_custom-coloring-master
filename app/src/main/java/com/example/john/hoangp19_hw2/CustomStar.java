package com.example.john.hoangp19_hw2;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;

/**
 * Created by Paul on 3/26/17.
 */

public class CustomStar extends CustomElement
{
    Point in1,in2,in3,in4,in5;          //in and out are the in and out coordinates to make
    Point out1, out2, out3, out4, out5; //a star
    private Rect myRect;
    /**
     * the ctor requires that you give the object a name and a color
     *
     * @param name
     * @param color
     */
    public CustomStar(String name, int color, int posX, int posY, int size) {
        super(name, color);
        myRect = new Rect(posX,posY + size/2 + TAP_MARGIN/2,posX + size/2 + 2*TAP_MARGIN,posY + size - TAP_MARGIN);

        int hMargin = size/9;
        int vMargin = size/4;

        in1 = new Point((int)(posX + size/2), (int)posY);
        out1 = new Point((int)(posX + size/2 + hMargin), (int)(posY + vMargin));
        in2 = new Point((int)(posX + size), (int)(posY + vMargin));
        out2 = new Point((int)(posX + size/2 + 2*hMargin), (int)(posY + size/2 + vMargin/2));
        in3 = new Point((int)(posX + size/2 + 3*hMargin), (int)(posY + size));
        out3 = new Point((int)(posX + size/2), (int)(posY + size - vMargin));
        in4 = new Point((int)(posX + size/2 - 3*hMargin), (int)(posY + size));
        out4 = new Point((int)(posX + size/2 - 2*hMargin), (int)(posY + size/2 + vMargin/2));
        in5 = new Point((int)posX, (int)(posY + vMargin));
        out5 = new Point((int)(posX + size/2 - hMargin), (int)(posY + vMargin));
    }

    @Override
    public void drawMe(Canvas canvas) {
        Path path = new Path();
        path.moveTo(in1.x, in1.y);
        path.lineTo(out1.x, out1.y);
        path.lineTo(in2.x, in2.y);
        path.lineTo(out2.x, out2.y);
        path.lineTo(in3.x, in3.y);
        path.lineTo(out3.x,out3.y);
        path.lineTo(out3.x, out3.y);
        path.lineTo(in4.x, in4.y);
        path.lineTo(out4.x, out4.y);
        path.lineTo(in5.x, in5.y);
        path.lineTo(out5.x, out5.y);
        path.lineTo(in1.x, in1.y);
        path.close();

        canvas.drawPath(path, myPaint);
        canvas.drawPath(path, outlinePaint);
    }

    @Override
    public boolean containsPoint(int x, int y) {
        //Taken from the CustomRect class made by Professor Nuxoll
        int left = this.myRect.left - TAP_MARGIN;
        int top = this.myRect.top - TAP_MARGIN;
        int right = this.myRect.right + TAP_MARGIN;
        int bottom = this.myRect.bottom + TAP_MARGIN;
        Rect r = new Rect(left, top, right, bottom);

        return r.contains(x, y);
    }

    @Override
    public int getSize() { return 0; }

    @Override
    public void drawHighlight(Canvas canvas) {
        //when the element is selected, it will outline the entire element in yellow
        Path path = new Path();
        path.moveTo(in1.x, in1.y);
        path.lineTo(out1.x, out1.y);
        path.lineTo(in2.x, in2.y);
        path.lineTo(out2.x, out2.y);
        path.lineTo(in3.x, in3.y);
        path.lineTo(out3.x,out3.y);
        path.lineTo(out3.x, out3.y);
        path.lineTo(in4.x, in4.y);
        path.lineTo(out4.x, out4.y);
        path.lineTo(in5.x, in5.y);
        path.lineTo(out5.x, out5.y);
        path.lineTo(in1.x, in1.y);
        path.close();

        canvas.drawPath(path, highlightPaint);
        canvas.drawPath(path, outlinePaint);
    }
}
