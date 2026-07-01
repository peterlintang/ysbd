package com.youloft.imagezoom;

import android.graphics.RectF;
import android.os.Handler;

final class f
  implements Runnable
{
  float a = 0.0F;
  float b = 0.0F;
  
  f(ImageViewTouchBase paramImageViewTouchBase, long paramLong, float paramFloat1, float paramFloat2) {}
  
  public final void run()
  {
    long l = System.currentTimeMillis();
    float f1 = Math.min(this.c, (float)(l - this.d));
    float f2 = a.a(f1, this.e, this.c);
    float f3 = a.a(f1, this.f, this.c);
    new StringBuilder("scrollBy : currentMs = ").append(f1).toString();
    new StringBuilder("scrollBy : x = ").append(f2).toString();
    new StringBuilder("scrollBy : y = ").append(f3).toString();
    this.g.c(f2 - this.a, f3 - this.b);
    this.a = f2;
    this.b = f3;
    if (f1 < this.c)
    {
      this.g.l.post(this);
      return;
    }
    RectF localRectF = this.g.e();
    if ((localRectF.left != 0.0F) || (localRectF.top != 0.0F)) {
      this.g.b(localRectF.left, localRectF.top);
    }
    new StringBuilder("scrollBy : centerRect.left = ").append(localRectF.left).toString();
    new StringBuilder("scrollBy : centerRect.top) = ").append(localRectF.top).toString();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\youloft\imagezoom\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */