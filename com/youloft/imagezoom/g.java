package com.youloft.imagezoom;

import android.os.Handler;

final class g
  implements Runnable
{
  g(ImageViewTouchBase paramImageViewTouchBase, float paramFloat1, long paramLong, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5) {}
  
  public final void run()
  {
    long l = System.currentTimeMillis();
    new StringBuilder("zoomTo--3 : now = ").append(l).toString();
    float f1 = Math.min(this.a, (float)(l - this.b));
    float f2 = this.c + this.d * f1;
    new StringBuilder("zoomTo--3 : currentMs = ").append(f1).toString();
    new StringBuilder("zoomTo--3 : target = ").append(f2).toString();
    this.g.a(f2, this.e, this.f);
    if (f1 < this.a) {
      this.g.l.post(this);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\youloft\imagezoom\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */