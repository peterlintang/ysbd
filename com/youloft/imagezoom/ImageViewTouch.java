package com.youloft.imagezoom;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ViewConfiguration;

public class ImageViewTouch
  extends ImageViewTouchBase
{
  protected ScaleGestureDetector a;
  protected GestureDetector b;
  protected int c;
  protected float d;
  protected float e;
  protected int f;
  protected c g;
  protected d h;
  protected Bitmap i = null;
  private Context u;
  private boolean v = false;
  private boolean w = false;
  private boolean x = false;
  private Handler y = new b(this);
  
  public ImageViewTouch(Context paramContext)
  {
    super(paramContext);
    this.u = paramContext;
  }
  
  public ImageViewTouch(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.u = paramContext;
  }
  
  protected final float a(float paramFloat1, float paramFloat2)
  {
    if (this.f == 1)
    {
      if (this.e * 2.0F + paramFloat1 <= paramFloat2)
      {
        this.f = -1;
        return paramFloat1 + this.e;
      }
      this.f = -1;
      return paramFloat2;
    }
    this.f = 1;
    return 1.0F;
  }
  
  public final void a()
  {
    this.i.recycle();
    this.i = null;
  }
  
  protected final void a(float paramFloat)
  {
    super.a(paramFloat);
    if (!this.a.isInProgress()) {
      this.d = paramFloat;
    }
  }
  
  public final void a(j paramj, boolean paramBoolean)
  {
    super.a(paramj, paramBoolean);
    this.e = (c() / 3.0F);
    new StringBuilder("setImageRotateBitmapReset : mScaleFactor = ").append(this.e).toString();
  }
  
  protected final void b()
  {
    super.b();
    this.c = ViewConfiguration.getTouchSlop();
    this.g = new c(this);
    this.h = new d(this);
    this.a = new ScaleGestureDetector(getContext(), this.h);
    this.b = new GestureDetector(getContext(), this.g, null, true);
    this.b = new GestureDetector(getContext(), this.g, null);
    this.d = 1.0F;
    this.f = 1;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (paramMotionEvent.getPointerCount() >= 2) {
      this.a.onTouchEvent(paramMotionEvent);
    }
    if (!this.a.isInProgress()) {
      this.b.onTouchEvent(paramMotionEvent);
    }
    switch (paramMotionEvent.getAction() & 0xFF)
    {
    default: 
    case 2: 
      do
      {
        return true;
      } while ((this.x) || (d() >= 1.0F));
      f();
      this.x = true;
      return true;
    }
    if ((!this.x) && (d() < 1.0F)) {
      f();
    }
    this.x = false;
    this.w = false;
    return true;
  }
  
  public void setImageDrawable(Drawable paramDrawable)
  {
    super.setImageDrawable(paramDrawable);
    if (this.i == null)
    {
      this.i = ((BitmapDrawable)paramDrawable).getBitmap();
      new StringBuilder("setImageDrawable : bmp = ").append(this.i).toString();
      a(this.i, 0, false);
    }
    for (;;)
    {
      if (this.v) {
        this.v = false;
      }
      return;
      this.i = null;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\youloft\imagezoom\ImageViewTouch.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */