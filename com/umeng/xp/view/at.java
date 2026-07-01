package com.umeng.xp.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.TextView;

public class at
  extends TextView
{
  public at(Context paramContext)
  {
    super(paramContext);
  }
  
  public at(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public at(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public boolean isFocused()
  {
    return true;
  }
  
  protected void onFocusChanged(boolean paramBoolean, int paramInt, Rect paramRect)
  {
    if (paramBoolean) {
      super.onFocusChanged(paramBoolean, paramInt, paramRect);
    }
  }
  
  public void onWindowFocusChanged(boolean paramBoolean)
  {
    if (paramBoolean) {
      super.onWindowFocusChanged(paramBoolean);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\view\at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */