package com.youloft.imagezoom;

import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.SimpleOnScaleGestureListener;

final class d
  extends ScaleGestureDetector.SimpleOnScaleGestureListener
{
  d(ImageViewTouch paramImageViewTouch) {}
  
  public final boolean onScale(ScaleGestureDetector paramScaleGestureDetector)
  {
    if (ImageViewTouch.a(this.a)) {
      return false;
    }
    paramScaleGestureDetector.getCurrentSpan();
    paramScaleGestureDetector.getPreviousSpan();
    float f1 = this.a.d;
    float f2 = paramScaleGestureDetector.getScaleFactor();
    f1 = Math.min(this.a.c(), Math.max(f1 * f2, 0.6F));
    this.a.a(f1, paramScaleGestureDetector.getFocusX(), paramScaleGestureDetector.getFocusY());
    this.a.d = Math.min(this.a.c(), Math.max(f1, 0.6F));
    this.a.f = -1;
    this.a.invalidate();
    return true;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\youloft\imagezoom\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */