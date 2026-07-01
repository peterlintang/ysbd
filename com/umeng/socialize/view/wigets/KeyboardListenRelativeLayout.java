package com.umeng.socialize.view.wigets;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

public class KeyboardListenRelativeLayout
  extends RelativeLayout
{
  public static final byte KEYBOARD_STATE_HIDE = -2;
  public static final byte KEYBOARD_STATE_INIT = -1;
  public static final byte KEYBOARD_STATE_SHOW = -3;
  private static final String a = KeyboardListenRelativeLayout.class.getSimpleName();
  private boolean b = false;
  private boolean c = false;
  private int d;
  private KeyboardListenRelativeLayout.a e;
  
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
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (!this.b)
    {
      this.b = true;
      this.d = paramInt4;
      if (this.e != null) {
        this.e.a(-1);
      }
      if ((this.b) && (this.d > paramInt4))
      {
        this.c = true;
        if (this.e != null) {
          this.e.a(-3);
        }
      }
      if ((this.b) && (this.c) && (this.d == paramInt4))
      {
        this.c = false;
        if (this.e != null) {
          this.e.a(-2);
        }
      }
      return;
    }
    if (this.d < paramInt4) {}
    for (paramInt1 = paramInt4;; paramInt1 = this.d)
    {
      this.d = paramInt1;
      break;
    }
  }
  
  public void setOnKeyboardStateChangedListener(KeyboardListenRelativeLayout.a parama)
  {
    this.e = parama;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\wigets\KeyboardListenRelativeLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */