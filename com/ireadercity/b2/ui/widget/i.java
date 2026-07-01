package com.ireadercity.b2.ui.widget;

import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.SimpleOnScaleGestureListener;

final class i
  extends ScaleGestureDetector.SimpleOnScaleGestureListener
{
  i(ScrollLayout_PDF paramScrollLayout_PDF) {}
  
  public final boolean onScale(ScaleGestureDetector paramScaleGestureDetector)
  {
    paramScaleGestureDetector.getCurrentSpan();
    paramScaleGestureDetector.getPreviousSpan();
    float f = Math.min(2.0F, Math.max(this.a.f * paramScaleGestureDetector.getScaleFactor(), 0.6F));
    ScrollLayout_PDF.a(this.a).a(f, paramScaleGestureDetector.getFocusX(), paramScaleGestureDetector.getFocusY());
    this.a.f = Math.min(2.0F, Math.max(f, 0.6F));
    ScrollLayout_PDF.a(true);
    this.a.invalidate();
    return true;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\widget\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */