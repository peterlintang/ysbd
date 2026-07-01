package com.youloft.imagezoom;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;

public final class j
{
  private Bitmap a;
  private int b;
  private int c;
  private int d;
  private int e;
  private int f;
  
  public j(Bitmap paramBitmap, int paramInt)
  {
    this.b = (paramInt % 360);
    a(paramBitmap);
  }
  
  private void f()
  {
    Matrix localMatrix = new Matrix();
    int i = this.e / 2;
    int j = this.f / 2;
    localMatrix.preTranslate(-i, -j);
    localMatrix.postRotate(this.b);
    localMatrix.postTranslate(i, i);
    RectF localRectF = new RectF(0.0F, 0.0F, this.e, this.f);
    localMatrix.mapRect(localRectF);
    this.c = ((int)localRectF.width());
    this.d = ((int)localRectF.height());
    new StringBuilder("invalidate : mWidth = ").append(this.c).toString();
    new StringBuilder("invalidate : mHeight = ").append(this.d).toString();
  }
  
  public final int a()
  {
    return this.b % 360;
  }
  
  public final void a(int paramInt)
  {
    this.b = paramInt;
    f();
  }
  
  public final void a(Bitmap paramBitmap)
  {
    this.a = paramBitmap;
    if (this.a != null)
    {
      this.e = paramBitmap.getWidth();
      this.f = paramBitmap.getHeight();
      f();
    }
  }
  
  public final Bitmap b()
  {
    return this.a;
  }
  
  public final Matrix c()
  {
    Matrix localMatrix = new Matrix();
    if (this.b != 0)
    {
      int i = this.e / 2;
      int j = this.f / 2;
      new StringBuilder("getRotateMatrix : cx = ").append(i).toString();
      new StringBuilder("getRotateMatrix : cy = ").append(j).toString();
      localMatrix.preTranslate(-i, -j);
      localMatrix.postRotate(this.b);
      localMatrix.postTranslate(this.c / 2, this.d / 2);
    }
    return localMatrix;
  }
  
  public final int d()
  {
    return this.d;
  }
  
  public final int e()
  {
    return this.c;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\youloft\imagezoom\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */