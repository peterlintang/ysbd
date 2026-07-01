package com.youloft.imagezoom;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

public class ImageViewTouchBase
  extends ImageView
{
  protected static Matrix k = new Matrix();
  private i a;
  protected Matrix j = new Matrix();
  protected Handler l = new Handler();
  protected Runnable m = null;
  protected float n;
  protected final Matrix o = new Matrix();
  protected final float[] p = new float[9];
  protected int q = -1;
  protected int r = -1;
  protected final j s = new j(null, 0);
  protected final float t = 2.0F;
  
  public ImageViewTouchBase(Context paramContext)
  {
    super(paramContext);
    b();
  }
  
  public ImageViewTouchBase(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    b();
  }
  
  private Matrix a()
  {
    this.o.set(this.j);
    this.o.postConcat(k);
    return this.o;
  }
  
  private void a(float paramFloat1, float paramFloat2)
  {
    k.postTranslate(paramFloat1, paramFloat2);
    h localh = h.b;
    setImageMatrix(a());
  }
  
  private void a(Bitmap paramBitmap, int paramInt)
  {
    super.setImageBitmap(paramBitmap);
    Drawable localDrawable = getDrawable();
    if (localDrawable != null) {
      localDrawable.setDither(true);
    }
    this.s.a(paramBitmap);
    this.s.a(paramInt);
  }
  
  private void a(j paramj, Matrix paramMatrix)
  {
    float f1 = getWidth();
    float f2 = getHeight();
    float f3 = paramj.e();
    float f4 = paramj.d();
    paramMatrix.reset();
    float f5 = Math.min(f1 / f3, 2.0F);
    float f6 = Math.min(f2 / f4, 2.0F);
    float f7 = Math.min(f5, f6);
    paramMatrix.postConcat(paramj.c());
    paramMatrix.postScale(f7, f7);
    paramMatrix.postTranslate((f1 - f3 * f7) / 2.0F, (f2 - f4 * f7) / 2.0F);
    new StringBuilder("getProperBaseMatrix : viewWidth = ").append(f1).toString();
    new StringBuilder("getProperBaseMatrix : viewHeight = ").append(f2).toString();
    new StringBuilder("getProperBaseMatrix : w = ").append(f3).toString();
    new StringBuilder("getProperBaseMatrix : h = ").append(f4).toString();
    new StringBuilder("getProperBaseMatrix : widthScale = ").append(f5).toString();
    new StringBuilder("getProperBaseMatrix : heightScale = ").append(f6).toString();
    new StringBuilder("getProperBaseMatrix : scale = ").append(f7).toString();
  }
  
  private RectF g()
  {
    if (this.s.b() == null) {
      return null;
    }
    Matrix localMatrix = a();
    RectF localRectF = new RectF(0.0F, 0.0F, this.s.b().getWidth(), this.s.b().getHeight());
    localMatrix.mapRect(localRectF);
    return localRectF;
  }
  
  private void h()
  {
    if (this.s.b() == null) {}
    RectF localRectF;
    do
    {
      return;
      localRectF = e();
    } while ((localRectF.left == 0.0F) && (localRectF.top == 0.0F));
    a(localRectF.left, localRectF.top);
  }
  
  protected void a(float paramFloat) {}
  
  public final void a(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    float f = paramFloat1;
    if (paramFloat1 > this.n) {
      f = this.n;
    }
    paramFloat1 = f / d();
    k.postScale(paramFloat1, paramFloat1, paramFloat2, paramFloat3);
    h localh = h.c;
    setImageMatrix(a());
    a(d());
    h();
  }
  
  public final void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    long l1 = System.currentTimeMillis();
    new StringBuilder("zoomTo--3 : startTime = ").append(l1).toString();
    paramFloat1 = (paramFloat1 - d()) / paramFloat4;
    float f = d();
    this.l.post(new g(this, paramFloat4, l1, f, paramFloat1, paramFloat2, paramFloat3));
  }
  
  public final void a(Bitmap paramBitmap, int paramInt, boolean paramBoolean)
  {
    a(new j(paramBitmap, paramInt), paramBoolean);
  }
  
  public void a(j paramj, boolean paramBoolean)
  {
    if (getWidth() <= 0)
    {
      this.m = new e(this, paramj, paramBoolean);
      return;
    }
    label50:
    Object localObject;
    float f1;
    if (paramj.b() != null)
    {
      a(paramj, this.j);
      a(paramj.b(), paramj.a());
      if (paramBoolean) {
        k.reset();
      }
      localObject = h.e;
      setImageMatrix(a());
      if (this.s.b() != null) {
        break label124;
      }
      f1 = 1.0F;
    }
    for (;;)
    {
      this.n = f1;
      if (this.a == null) {
        break;
      }
      localObject = this.a;
      paramj.b();
      return;
      this.j.reset();
      setImageBitmap(null);
      break label50;
      label124:
      float f2 = this.s.e() / this.q;
      float f3 = this.s.d() / this.r;
      f1 = Math.max(f2, f3) * 4.0F;
      new StringBuilder("maxZoom : fw = ").append(f2).toString();
      new StringBuilder("maxZoom : fh = ").append(f3).toString();
      new StringBuilder("maxZoom : max = ").append(f1).toString();
    }
  }
  
  protected void b()
  {
    setScaleType(ImageView.ScaleType.MATRIX);
  }
  
  public final void b(float paramFloat1, float paramFloat2)
  {
    c(paramFloat1, paramFloat2);
  }
  
  public final float c()
  {
    return this.n;
  }
  
  protected final void c(float paramFloat1, float paramFloat2)
  {
    RectF localRectF1 = g();
    RectF localRectF2 = new RectF(paramFloat1, paramFloat2, 0.0F, 0.0F);
    paramFloat1 = getWidth();
    paramFloat2 = getHeight();
    new StringBuilder("updateRect : width = ").append(paramFloat1).toString();
    new StringBuilder("updateRect : height = ").append(paramFloat2).toString();
    new StringBuilder("updateRect : bitmapRect.top = ").append(localRectF1.top).toString();
    new StringBuilder("updateRect : bitmapRect.bottom = ").append(localRectF1.bottom).toString();
    new StringBuilder("updateRect : bitmapRect.left = ").append(localRectF1.left).toString();
    new StringBuilder("updateRect : bitmapRect.right = ").append(localRectF1.right).toString();
    new StringBuilder("updateRect : scrollRect.top = ").append(localRectF2.top).toString();
    new StringBuilder("updateRect : scrollRect.bottom = ").append(localRectF2.bottom).toString();
    new StringBuilder("updateRect : scrollRect.left = ").append(localRectF2.left).toString();
    new StringBuilder("updateRect : scrollRect.right = ").append(localRectF2.right).toString();
    if ((localRectF1.top >= 0.0F) && (localRectF1.bottom <= paramFloat2)) {
      localRectF2.top = 0.0F;
    }
    if ((localRectF1.left >= 0.0F) && (localRectF1.right <= paramFloat1)) {
      localRectF2.left = 0.0F;
    }
    if ((localRectF1.top + localRectF2.top >= 0.0F) && (localRectF1.bottom > paramFloat2)) {
      localRectF2.top = ((int)(0.0F - localRectF1.top));
    }
    if ((localRectF1.bottom + localRectF2.top <= paramFloat2 - 0.0F) && (localRectF1.top < 0.0F)) {
      localRectF2.top = ((int)(paramFloat2 - 0.0F - localRectF1.bottom));
    }
    if (localRectF1.left + localRectF2.left >= 0.0F) {
      localRectF2.left = ((int)(0.0F - localRectF1.left));
    }
    if (localRectF1.right + localRectF2.left <= paramFloat1 - 0.0F) {
      localRectF2.left = ((int)(paramFloat1 - 0.0F - localRectF1.right));
    }
    new StringBuilder("panBy : srect.left = ").append(localRectF2.left).toString();
    new StringBuilder("panBy : srect.top = ").append(localRectF2.top).toString();
    a(localRectF2.left, localRectF2.top);
    h();
  }
  
  public final float d()
  {
    k.getValues(this.p);
    return this.p[0];
  }
  
  protected final void d(float paramFloat1, float paramFloat2)
  {
    long l1 = System.currentTimeMillis();
    this.l.post(new f(this, l1, paramFloat1, paramFloat2));
  }
  
  protected final RectF e()
  {
    if (this.s.b() == null) {
      return new RectF(0.0F, 0.0F, 0.0F, 0.0F);
    }
    RectF localRectF = g();
    float f1 = localRectF.height();
    float f2 = localRectF.width();
    int i = getHeight();
    if (f1 < i) {
      f1 = (i - f1) / 2.0F - localRectF.top;
    }
    for (;;)
    {
      i = getWidth();
      if (f2 < i) {
        f2 = (i - f2) / 2.0F - localRectF.left;
      }
      for (;;)
      {
        return new RectF(f2, f1, 0.0F, 0.0F);
        if (localRectF.top > 0.0F)
        {
          f1 = -localRectF.top;
          break;
        }
        if (localRectF.bottom >= i) {
          break label196;
        }
        f1 = getHeight() - localRectF.bottom;
        break;
        if (localRectF.left > 0.0F) {
          f2 = -localRectF.left;
        } else if (localRectF.right < i) {
          f2 = i - localRectF.right;
        } else {
          f2 = 0.0F;
        }
      }
      label196:
      f1 = 0.0F;
    }
  }
  
  public final void f()
  {
    float f1 = getWidth() / 2.0F;
    float f2 = getHeight() / 2.0F;
    new StringBuilder("zoomTo--1 : cx =").append(f1).toString();
    new StringBuilder("zoomTo--1 : cy =").append(f2).toString();
    a(1.0F, f1, f2, 50.0F);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    this.q = (paramInt3 - paramInt1);
    this.r = (paramInt4 - paramInt2);
    Object localObject = this.m;
    if (localObject != null)
    {
      this.m = null;
      ((Runnable)localObject).run();
    }
    if (this.s.b() != null)
    {
      a(this.s, this.j);
      localObject = h.d;
      setImageMatrix(a());
    }
  }
  
  public void setImageBitmap(Bitmap paramBitmap)
  {
    a(paramBitmap, 0);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\youloft\imagezoom\ImageViewTouchBase.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */