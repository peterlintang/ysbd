package com.ireadercity.b2.ui.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.ireadercity.b2.a;
import com.youloft.imagezoom.ImageViewTouchBase;

public class PDFView
  extends ImageViewTouchBase
{
  private Paint a;
  private Bitmap b;
  private float c;
  private float d;
  private float e;
  private float f;
  
  public PDFView(Context paramContext)
  {
    super(paramContext);
    b();
  }
  
  public PDFView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    b();
  }
  
  public final void a(Bitmap paramBitmap)
  {
    this.b = paramBitmap;
    setImageBitmap(this.b);
  }
  
  public final void a(MotionEvent paramMotionEvent)
  {
    switch (paramMotionEvent.getAction())
    {
    case 1: 
    default: 
      return;
    case 0: 
      this.e = paramMotionEvent.getX();
      this.f = paramMotionEvent.getY();
      return;
    }
    this.c = paramMotionEvent.getX();
    this.d = paramMotionEvent.getY();
    int i = (int)(this.c - this.e);
    int j = (int)(this.d - this.f);
    setFrame(getLeft() + i, getTop() + j, i + getRight(), j + getBottom());
    this.e = this.c;
    this.f = this.d;
  }
  
  public final boolean a()
  {
    new StringBuilder("recycleResource()---------->bitmap = ").append(this.b).toString();
    if ((this.b != null) && (!this.b.isRecycled())) {}
    try
    {
      this.b.recycle();
      this.b = null;
      System.gc();
      invalidate();
      return true;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return false;
  }
  
  protected final void b()
  {
    super.b();
    this.a = new Paint();
    this.a.setColor(-1);
    this.a.setTextSize(37.0F);
    this.a.setFakeBoldText(false);
    this.a.setLinearText(true);
    this.a.setStyle(Paint.Style.FILL_AND_STROKE);
    this.a.setAntiAlias(true);
  }
  
  protected void finalize()
  {
    a();
    super.finalize();
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    if (this.b == null)
    {
      paramCanvas.drawText("加载中...", a.D / 3, a.E / 2, this.a);
      return;
    }
    super.onDraw(paramCanvas);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    return super.onTouchEvent(paramMotionEvent);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\widget\PDFView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */