package com.umeng.xp.view;

import android.graphics.drawable.Drawable;
import com.umeng.xp.common.ExchangeConstants;

public class GridTemplateConfig
{
  Drawable a;
  Drawable b;
  boolean c = true;
  boolean d = true;
  public int maxPsize = 15;
  public int numColumns = 3;
  public int verticalSpacing = 7;
  
  public GridTemplateConfig setActivePointer(Drawable paramDrawable)
  {
    this.a = paramDrawable;
    return this;
  }
  
  public GridTemplateConfig setInactivePointer(Drawable paramDrawable)
  {
    this.b = paramDrawable;
    return this;
  }
  
  public GridTemplateConfig setMaxPsize(int paramInt)
  {
    if (paramInt <= 0) {
      this.maxPsize = 1;
    }
    if (paramInt > 15)
    {
      this.maxPsize = 15;
      String str = ExchangeConstants.LOG_TAG;
    }
    this.maxPsize = paramInt;
    return this;
  }
  
  public GridTemplateConfig setNumColumns(int paramInt)
  {
    if (paramInt <= 0) {
      this.numColumns = 1;
    }
    this.numColumns = paramInt;
    return this;
  }
  
  public GridTemplateConfig setPaging(boolean paramBoolean)
  {
    this.c = paramBoolean;
    return this;
  }
  
  public GridTemplateConfig setPointer(boolean paramBoolean)
  {
    this.d = paramBoolean;
    return this;
  }
  
  public GridTemplateConfig setVerticalSpacing(int paramInt)
  {
    this.verticalSpacing = paramInt;
    return this;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\view\GridTemplateConfig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */