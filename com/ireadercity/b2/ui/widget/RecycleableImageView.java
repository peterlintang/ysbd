package com.ireadercity.b2.ui.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.ireadercity.b2.a;
import com.ireadercity.b2.b.g;

public class RecycleableImageView
  extends ImageView
{
  boolean a = true;
  private Paint b;
  private Paint c;
  private Bitmap d;
  
  public RecycleableImageView(Context paramContext)
  {
    super(paramContext);
    c();
  }
  
  public RecycleableImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    c();
  }
  
  public RecycleableImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    c();
  }
  
  private void c()
  {
    this.b = new Paint();
    this.c = new Paint();
    this.c.setAntiAlias(true);
    this.c.setShadowLayer(2.0F, 5.0F, 5.0F, -16777216);
  }
  
  public final void a(Bitmap paramBitmap)
  {
    if ((this.d != null) && (!this.d.isRecycled()) && (this.d != g.a) && (this.d != g.b))
    {
      this.d.recycle();
      this.d = null;
      a.d();
    }
    this.d = paramBitmap;
    this.a = false;
    super.setImageBitmap(paramBitmap);
  }
  
  public final boolean a()
  {
    if ((this.d != null) && (!this.d.isRecycled())) {}
    try
    {
      this.d.recycle();
      this.d = null;
      a.d();
      return true;
    }
    catch (Throwable localThrowable)
    {
      localThrowable.printStackTrace();
    }
    return false;
  }
  
  public final void b()
  {
    setImageBitmap(this.d);
  }
  
  protected void finalize()
  {
    super.finalize();
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    RectF localRectF1;
    RectF localRectF2;
    Matrix localMatrix;
    if ((this.d != null) && (!this.d.isRecycled()))
    {
      localRectF1 = new RectF(0.0F, 0.0F, this.d.getWidth(), this.d.getHeight());
      localRectF2 = new RectF(2.0F, 2.0F, getWidth() - 2, getHeight() - 2);
      localMatrix = new Matrix();
      if (!this.a) {
        break label109;
      }
      localMatrix.setRectToRect(localRectF1, localRectF2, Matrix.ScaleToFit.FILL);
    }
    for (;;)
    {
      paramCanvas.drawBitmap(this.d, localMatrix, this.b);
      return;
      label109:
      localMatrix.setRectToRect(localRectF1, localRectF2, Matrix.ScaleToFit.CENTER);
    }
  }
  
  public void setImageBitmap(Bitmap paramBitmap)
  {
    if ((this.d != null) && (!this.d.isRecycled()) && (this.d != g.a) && (this.d != g.b))
    {
      this.d.recycle();
      this.d = null;
      a.d();
    }
    this.d = paramBitmap;
    super.setImageBitmap(paramBitmap);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\widget\RecycleableImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */