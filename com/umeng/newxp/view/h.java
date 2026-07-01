package com.umeng.newxp.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

public class h
  extends ImageView
{
  public h(Context paramContext)
  {
    super(paramContext);
  }
  
  public void a(Drawable paramDrawable)
  {
    setScaleType(ImageView.ScaleType.FIT_XY);
    setImageDrawable(paramDrawable);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */