package com.umeng.newxp.view.widget;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.widget.RelativeLayout;

public class KeyboardListenRelativeLayout
  extends RelativeLayout
{
  public static final byte a = -3;
  public static final byte b = -2;
  public static final byte c = -1;
  private static final String d = KeyboardListenRelativeLayout.class.getSimpleName();
  private boolean e = false;
  private boolean f = false;
  private int g;
  private KeyboardListenRelativeLayout.IOnKeyboardStateChangedListener h;
  
  public KeyboardListenRelativeLayout(Context paramContext)
  {
    super(paramContext);
  }
  
  public KeyboardListenRelativeLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public KeyboardListenRelativeLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public void a(KeyboardListenRelativeLayout.IOnKeyboardStateChangedListener paramIOnKeyboardStateChangedListener)
  {
    this.h = paramIOnKeyboardStateChangedListener;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (!this.e)
    {
      this.e = true;
      this.g = paramInt4;
      if (this.h != null) {
        this.h.onKeyboardStateChanged(-1);
      }
      paramInt1 = Math.abs(this.g - paramInt4);
      if (!(getContext() instanceof Activity)) {
        break label227;
      }
      Activity localActivity = (Activity)getContext();
      Rect localRect = new Rect();
      localActivity.getWindow().getDecorView().getWindowVisibleDisplayFrame(localRect);
      if (paramInt1 == localRect.top) {
        this.g = paramInt4;
      }
    }
    for (;;)
    {
      if ((this.e) && (this.g > paramInt4))
      {
        this.f = true;
        if (this.h != null) {
          this.h.onKeyboardStateChanged(-3);
        }
      }
      if ((this.e) && (this.f) && (this.g == paramInt4))
      {
        this.f = false;
        if (this.h != null) {
          this.h.onKeyboardStateChanged(-2);
        }
      }
      return;
      if (this.g < paramInt4) {}
      for (paramInt1 = paramInt4;; paramInt1 = this.g)
      {
        this.g = paramInt1;
        break;
      }
      label227:
      if (paramInt1 < 100) {
        this.g = paramInt4;
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\widget\KeyboardListenRelativeLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */