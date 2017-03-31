package com.example.john.hoangp19_hw2;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;

/**
 * Created by Paul on 3/28/2017.
 */

public class CustomTree extends CustomElement {
    Point p1,p2,p3;
    private Rect myRect;
    /**
     * the ctor requires that you give the object a name and a color
     *
     * @param name
     * @param color
     */
    public CustomTree(String name, int color, int posX, int posY, int size) {
        super(name, color);

        myRect = new Rect(posX,posY + size/2 + TAP_MARGIN/2,posX + size/2 + 2*TAP_MARGIN,posY + size - TAP_MARGIN);

        int hMargin = size/9;

        //the three points are made to connect them to make a triangle, resembling a tree
        p1 = new Point((int)(posX + size/2), (int)posY);
        p2 = new Point((int)(posX + size/2 + 2*hMargin), (int)(posY + 4*size/5));
        p3 = new Point((int)(posX + size/2 - 2*hMargin), (int)(posY + 4*size/5));
    }

    @Override
    public void drawMe(Canvas canvas) {
        Path path = new Path();
        path.moveTo(p1.x, p1.y);
        path.lineTo(p2.x, p2.y);
        path.lineTo(p3.x, p3.y);
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
    public int getSize() {
        return 0;
    }

    @Override
    public void drawHighlight(Canvas canvas) {
        //when the element is selected, it will outline the entire element in yellow
        Path path = new Path();
        path.moveTo(p1.x, p1.y);
        path.lineTo(p2.x, p2.y);
        path.lineTo(p3.x, p3.y);
        path.close();

        canvas.drawPath(path, myPaint);
        canvas.drawPath(path, highlightPaint);
        canvas.drawPath(path, outlinePaint);
    }
}
