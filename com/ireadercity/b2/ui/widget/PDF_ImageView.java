package com.ireadercity.b2.ui.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.ireadercity.b2.a;

public class PDF_ImageView
  extends ImageView
{
  private float a = 0.1F;
  private Paint b = new Paint();
  private Bitmap c;
  
  public PDF_ImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.b.setColor(-1);
    this.b.setTextSize(37.0F);
    this.b.setFakeBoldText(false);
    this.b.setLinearText(true);
    this.b.setStyle(Paint.Style.FILL_AND_STROKE);
    this.b.setAntiAlias(true);
  }
  
  private boolean a()
  {
    new StringBuilder("recycleResource()---------->bitmap = ").append(this.c).toString();
    if ((this.c != null) && (!this.c.isRecycled())) {}
    try
    {
      this.c.recycle();
      this.c = null;
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
  
  protected void finalize()
  {
    a();
    super.finalize();
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    if (this.c == null)
    {
      paramCanvas.drawText("加载中...", a.D / 3, a.E / 2, this.b);
      return;
    }
    super.onDraw(paramCanvas);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\widget\PDF_ImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */