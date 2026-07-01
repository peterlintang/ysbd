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

public class DetailImageView
  extends ImageView
{
  private Paint a;
  private Bitmap b;
  
  public DetailImageView(Context paramContext)
  {
    super(paramContext);
    a();
  }
  
  public DetailImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a();
  }
  
  public DetailImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a();
  }
  
  private void a()
  {
    this.a = new Paint();
  }
  
  protected void finalize()
  {
    super.finalize();
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    if ((this.b != null) && (!this.b.isRecycled()))
    {
      RectF localRectF1 = new RectF(0.0F, 0.0F, this.b.getWidth(), this.b.getHeight());
      RectF localRectF2 = new RectF(0.0F, 0.0F, a.ac - 8, a.ab - 5);
      Matrix localMatrix = new Matrix();
      localMatrix.setRectToRect(localRectF1, localRectF2, Matrix.ScaleToFit.FILL);
      paramCanvas.drawBitmap(this.b, localMatrix, this.a);
    }
  }
  
  public void setImageBitmap(Bitmap paramBitmap)
  {
    if ((this.b != null) && (!this.b.isRecycled()))
    {
      this.b.recycle();
      System.gc();
      this.b = null;
    }
    this.b = paramBitmap;
    super.setImageBitmap(paramBitmap);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\widget\DetailImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */