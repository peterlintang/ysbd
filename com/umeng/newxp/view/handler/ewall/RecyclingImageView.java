package com.umeng.newxp.view.handler.ewall;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.ImageView;
import com.umeng.newxp.view.widget.RecyclingBitmapDrawable;

public class RecyclingImageView
  extends ImageView
{
  public static int a = 0;
  
  public RecyclingImageView(Context paramContext)
  {
    super(paramContext);
  }
  
  public RecyclingImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  private static void a(Drawable paramDrawable, boolean paramBoolean)
  {
    if ((paramDrawable instanceof RecyclingBitmapDrawable)) {
      ((RecyclingBitmapDrawable)paramDrawable).a(paramBoolean);
    }
    for (;;)
    {
      return;
      if ((paramDrawable instanceof LayerDrawable))
      {
        paramDrawable = (LayerDrawable)paramDrawable;
        int i = 0;
        int j = paramDrawable.getNumberOfLayers();
        while (i < j)
        {
          a(paramDrawable.getDrawable(i), paramBoolean);
          i += 1;
        }
      }
    }
  }
  
  protected void onDetachedFromWindow()
  {
    setImageDrawable(null);
    super.onDetachedFromWindow();
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if (a == 0) {
      a = View.MeasureSpec.getSize(paramInt1);
    }
  }
  
  public void setImageDrawable(Drawable paramDrawable)
  {
    Drawable localDrawable = getDrawable();
    super.setImageDrawable(paramDrawable);
    a(paramDrawable, true);
    a(localDrawable, false);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\handler\ewall\RecyclingImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */