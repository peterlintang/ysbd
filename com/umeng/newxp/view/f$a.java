package com.umeng.newxp.view;

import android.graphics.drawable.Drawable;

public class f$a
{
  public String a;
  public Drawable b;
  public float c = 0.0F;
  
  public f$a(String paramString, Drawable paramDrawable)
  {
    this.a = paramString;
    this.b = paramDrawable;
    this.c = (paramDrawable.getIntrinsicHeight() * 100 / (paramDrawable.getIntrinsicWidth() * 100));
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\f$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */