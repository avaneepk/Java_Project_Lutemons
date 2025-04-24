package com.example.javaprojectlutemons;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;

/**
 * Draws its text on a circular path.
 *  • if app:isTop="true"  → text sits on the upper half‑arc (reads left‑to‑right)
 *  • if app:isTop="false" → text sits on the lower half‑arc
 *
 * Usage example in XML:
 * <com.example...CurvedTextView
 *        app:isTop="true"
 *        app:radius="140dp" .../>
 */
public class CurvedTextView extends AppCompatTextView {

    private boolean isTop = true;          // upper or lower arc
    private float radiusPx = 140f;         // circle radius in PX, overridable

    public CurvedTextView(Context c, @Nullable AttributeSet a) {
        super(c, a);
        if (a != null) {
            TypedArray ta = c.obtainStyledAttributes(a, R.styleable.CurvedTextView);
            isTop = ta.getBoolean(R.styleable.CurvedTextView_isTop, true);
            radiusPx = ta.getDimension(R.styleable.CurvedTextView_radius, radiusPx);
            ta.recycle();
        }
        setIncludeFontPadding(false);      // tighter fit
        setPadding(0,0,0,0);
    }

    @Override protected void onMeasure(int wSpec, int hSpec) {
        // enforce a square that comfortably contains the arc
        int size = (int) (radiusPx * 2);
        setMeasuredDimension(size, size);
    }

    @Override protected void onDraw(Canvas canvas) {
        // build an arc path each time we draw (cheap)
        Path path = new Path();
        float sweep = 160f;                // degrees worth of text
        float start = isTop ? 200f : 20f;  // place nicely around logo
        if (isTop) sweep = -sweep;         // reverse for upper arc

        RectF oval = new RectF(
                (getWidth()  - 2*radiusPx) / 2f,
                (getHeight() - 2*radiusPx) / 2f,
                (getWidth()  + 2*radiusPx) / 2f,
                (getHeight() + 2*radiusPx) / 2f
        );
        path.addArc(oval, start, sweep);

        // centre the text along the path
        getPaint().setTextAlign(android.graphics.Paint.Align.CENTER);
        canvas.drawTextOnPath(getText().toString(), path, 0, 0, getPaint());
    }
}
