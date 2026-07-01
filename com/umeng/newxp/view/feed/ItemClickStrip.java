package com.umeng.newxp.view.feed;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.umeng.newxp.view.HorizontalStrip;

public class ItemClickStrip
  extends HorizontalStrip
{
  float h;
  float i;
  int j = 10;
  volatile boolean k = false;
  ItemClickStrip.a l;
  
  public ItemClickStrip(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.j = ViewConfiguration.get(paramContext).getScaledTouchSlop();
  }
  
  public ItemClickStrip(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.j = ViewConfiguration.get(paramContext).getScaledTouchSlop();
  }
  
  public ItemClickStrip.a getOnItemClickListener()
  {
    return this.l;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = true;
    switch (paramMotionEvent.getAction() & 0xFF)
    {
    }
    for (;;)
    {
      bool = super.onTouchEvent(paramMotionEvent);
      do
      {
        return bool;
        this.h = paramMotionEvent.getX();
        this.i = paramMotionEvent.getY();
        this.k = true;
        break;
      } while ((Math.abs(paramMotionEvent.getX() - this.h) <= this.j) && (Math.abs(paramMotionEvent.getY() - this.i) <= this.j));
      this.k = false;
      this.h = 0.0F;
      this.i = 0.0F;
      continue;
      if ((this.k) && (this.l != null)) {}
      try
      {
        int m = getChildByX(this.h - getScrollPosition());
        View localView = getChildAt(m);
        this.l.onItemClick(localView, m);
        this.k = false;
        this.h = 0.0F;
        this.i = 0.0F;
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        for (;;) {}
      }
    }
  }
  
  public void setOnItemClickListener(ItemClickStrip.a parama)
  {
    this.l = parama;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\feed\ItemClickStrip.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */