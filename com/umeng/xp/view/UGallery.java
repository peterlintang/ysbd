package com.umeng.xp.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.Gallery;
import com.umeng.common.Log;

public class UGallery
  extends Gallery
{
  private static final String b = UGallery.class.getName();
  private boolean a;
  
  public UGallery(Context paramContext)
  {
    super(paramContext);
    a();
  }
  
  public UGallery(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a();
  }
  
  public UGallery(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a();
  }
  
  private void a() {}
  
  private boolean a(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2)
  {
    return paramMotionEvent2.getX() > paramMotionEvent1.getX();
  }
  
  public boolean isTouch()
  {
    return this.a;
  }
  
  public boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    if (a(paramMotionEvent1, paramMotionEvent2)) {
      Log.c(b, "fling Left");
    }
    for (int i = 21;; i = 22)
    {
      onKeyDown(i, null);
      return true;
      Log.c(b, "fling Right");
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    switch (paramMotionEvent.getAction())
    {
    }
    for (;;)
    {
      return super.onTouchEvent(paramMotionEvent);
      this.a = true;
      continue;
      this.a = false;
    }
  }
  
  public void postDelayedScrollNext()
  {
    Log.c(b, "postDelayedScrollNext Right");
    onKeyDown(22, null);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\view\UGallery.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */