package com.youloft.imagezoom;

import android.content.Context;
import android.content.Intent;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.ireadercity.b2.a;

final class c
  extends GestureDetector.SimpleOnGestureListener
{
  c(ImageViewTouch paramImageViewTouch) {}
  
  public final boolean onDoubleTap(MotionEvent paramMotionEvent)
  {
    if (ImageViewTouch.a(this.a)) {
      return false;
    }
    float f = this.a.d();
    new StringBuilder("onDoubleTapm : scale = ").append(f).toString();
    f = this.a.a(f, this.a.c());
    f = Math.min(this.a.c(), Math.max(f, 0.6F));
    this.a.d = f;
    new StringBuilder("onDoubleTapm : mCurrentScaleFactor = ").append(this.a.d).toString();
    this.a.a(this.a.d, paramMotionEvent.getX(), paramMotionEvent.getY(), 300.0F);
    this.a.invalidate();
    return super.onDoubleTap(paramMotionEvent);
  }
  
  public final boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    if ((paramMotionEvent1.getPointerCount() > 1) || (paramMotionEvent2.getPointerCount() > 1)) {}
    do
    {
      do
      {
        return false;
      } while ((this.a.a.isInProgress()) || (ImageViewTouch.a(this.a)));
      if ((ImageViewTouch.b(this.a)) || (this.a.d() > 1.05F)) {
        break;
      }
      ImageViewTouch.c(this.a);
      if (paramMotionEvent1.getX() - paramMotionEvent2.getX() > 5.0F)
      {
        paramMotionEvent1 = new Intent("turning_next");
        ImageViewTouch.d(this.a).sendBroadcast(paramMotionEvent1);
        return false;
      }
    } while (paramMotionEvent2.getX() - paramMotionEvent1.getX() <= 5.0F);
    paramMotionEvent1 = new Intent("turning_last");
    ImageViewTouch.d(this.a).sendBroadcast(paramMotionEvent1);
    return false;
    float f1 = paramMotionEvent2.getX() - paramMotionEvent1.getX();
    float f2 = paramMotionEvent2.getY() - paramMotionEvent1.getY();
    new StringBuilder("onFling : diffX = ").append(f1).toString();
    new StringBuilder("onFling : diffY = ").append(f2).toString();
    float f3 = this.a.d();
    new StringBuilder("onFling : scale = ").append(f3).toString();
    if ((Math.abs(paramFloat1) > 800.0F) || (Math.abs(paramFloat2) > 800.0F))
    {
      this.a.d(f1 / 2.0F, f2 / 2.0F);
      this.a.invalidate();
    }
    return super.onFling(paramMotionEvent1, paramMotionEvent2, paramFloat1, paramFloat2);
  }
  
  public final boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    if ((paramMotionEvent1 == null) || (paramMotionEvent2 == null)) {}
    for (;;)
    {
      return false;
      if ((paramMotionEvent1.getPointerCount() <= 1) && (paramMotionEvent2.getPointerCount() <= 1) && (!this.a.a.isInProgress()))
      {
        Intent localIntent;
        if (this.a.d() == 1.0F)
        {
          if (ImageViewTouch.b(this.a)) {
            continue;
          }
          ImageViewTouch.c(this.a);
          if (paramFloat1 >= -5.0F) {
            break label175;
          }
          localIntent = new Intent("turning_last");
          ImageViewTouch.d(this.a).sendBroadcast(localIntent);
        }
        while (!ImageViewTouch.a(this.a))
        {
          new StringBuilder("onScroll : -distanceX = ").append(-paramFloat1).toString();
          new StringBuilder("onScroll : -distanceY = ").append(-paramFloat2).toString();
          this.a.b(-paramFloat1, -paramFloat2);
          this.a.invalidate();
          return super.onScroll(paramMotionEvent1, paramMotionEvent2, paramFloat1, paramFloat2);
          label175:
          if (paramFloat1 > 5.0F)
          {
            localIntent = new Intent("turning_next");
            ImageViewTouch.d(this.a).sendBroadcast(localIntent);
          }
        }
      }
    }
  }
  
  public final boolean onSingleTapConfirmed(MotionEvent paramMotionEvent)
  {
    float f = paramMotionEvent.getX();
    Intent localIntent;
    if (f < a.D / 4)
    {
      localIntent = new Intent("turning_last");
      ImageViewTouch.d(this.a).sendBroadcast(localIntent);
    }
    for (;;)
    {
      return super.onSingleTapConfirmed(paramMotionEvent);
      if (f > a.D * 3 / 4)
      {
        localIntent = new Intent("turning_next");
        ImageViewTouch.d(this.a).sendBroadcast(localIntent);
      }
      else
      {
        localIntent = new Intent("show_you_sisiter");
        ImageViewTouch.d(this.a).sendBroadcast(localIntent);
        if (ImageViewTouch.a(this.a)) {
          ImageViewTouch.a(this.a, false);
        } else {
          ImageViewTouch.a(this.a, true);
        }
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\youloft\imagezoom\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */