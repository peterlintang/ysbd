package com.umeng.newxp.view.feed;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class ItemClickViewPager
  extends ViewPager
{
  float a;
  float b;
  int c = 10;
  volatile boolean d = false;
  ItemClickViewPager.a e;
  
  public ItemClickViewPager(Context paramContext)
  {
    super(paramContext);
  }
  
  public ItemClickViewPager(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public ItemClickViewPager.a getOnItemClickListener()
  {
    return this.e;
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
        this.a = paramMotionEvent.getX();
        this.b = paramMotionEvent.getY();
        this.d = true;
        break;
      } while ((Math.abs(paramMotionEvent.getX() - this.a) <= this.c) && (Math.abs(paramMotionEvent.getY() - this.b) <= this.c));
      this.d = false;
      this.a = 0.0F;
      this.b = 0.0F;
      continue;
      if ((this.d) && (this.e != null)) {}
      try
      {
        int i = getCurrentItem();
        View localView = getChildAt(i);
        this.e.onItemClick(localView, i);
        this.d = false;
        this.a = 0.0F;
        this.b = 0.0F;
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        for (;;) {}
      }
    }
  }
  
  public void setOnItemClickListener(ItemClickViewPager.a parama)
  {
    this.e = parama;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\feed\ItemClickViewPager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */