package com.ireadercity.b2.ui.widget;

import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;

final class h
  extends GestureDetector.SimpleOnGestureListener
{
  h(ScrollLayout_PDF paramScrollLayout_PDF) {}
  
  public final boolean onDoubleTap(MotionEvent paramMotionEvent)
  {
    ScrollLayout_PDF.a(this.a).a(paramMotionEvent, ScrollLayout_PDF.b());
    this.a.invalidate();
    if (ScrollLayout_PDF.b())
    {
      ScrollLayout_PDF.a(false);
      return false;
    }
    ScrollLayout_PDF.a(true);
    return false;
  }
  
  public final boolean onDoubleTapEvent(MotionEvent paramMotionEvent)
  {
    return false;
  }
  
  public final boolean onDown(MotionEvent paramMotionEvent)
  {
    return false;
  }
  
  public final boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    ScrollLayout_PDF.a(this.a, false);
    return false;
  }
  
  public final void onLongPress(MotionEvent paramMotionEvent) {}
  
  public final boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    int k = 1;
    ScrollLayout_PDF.a(this.a, true);
    if (ScrollLayout_PDF.b())
    {
      ScrollLayout_PDF.a(this.a).a(paramMotionEvent2);
      this.a.invalidate();
    }
    label106:
    label155:
    label161:
    label167:
    label180:
    for (;;)
    {
      return false;
      paramFloat1 = paramMotionEvent2.getX();
      int m = (int)(paramFloat1 - ScrollLayout_PDF.c());
      if (Math.abs(m) > ScrollLayout_PDF.d())
      {
        int i = this.a.getChildCount();
        int j;
        if (ScrollLayout_PDF.b(this.a) < i - 1)
        {
          i = 1;
          if (ScrollLayout_PDF.b(this.a) <= 0) {
            break label155;
          }
          j = 1;
          if (m <= 0) {
            break label167;
          }
          if (i == 0) {
            break label161;
          }
          i = k;
        }
        for (;;)
        {
          if (i == 0) {
            break label180;
          }
          this.a.scrollBy(m, 0);
          ScrollLayout_PDF.a(paramFloat1);
          this.a.invalidate();
          return false;
          i = 0;
          break;
          j = 0;
          break label106;
          i = 0;
          continue;
          i = k;
          if (j == 0) {
            i = 0;
          }
        }
      }
    }
  }
  
  public final void onShowPress(MotionEvent paramMotionEvent)
  {
    ScrollLayout_PDF.a(paramMotionEvent.getX());
  }
  
  public final boolean onSingleTapConfirmed(MotionEvent paramMotionEvent)
  {
    if (!ScrollLayout_PDF.b())
    {
      ScrollLayout_PDF.a(this.a).a();
      this.a.invalidate();
    }
    return false;
  }
  
  public final boolean onSingleTapUp(MotionEvent paramMotionEvent)
  {
    return false;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\widget\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */