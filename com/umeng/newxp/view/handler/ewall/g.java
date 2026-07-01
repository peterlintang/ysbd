package com.umeng.newxp.view.handler.ewall;

import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;

public abstract interface g
  extends ViewPager.OnPageChangeListener
{
  public abstract void notifyDataSetChanged();
  
  public abstract void setCurrentItem(int paramInt);
  
  public abstract void setOnPageChangeListener(ViewPager.OnPageChangeListener paramOnPageChangeListener);
  
  public abstract void setViewPager(ViewPager paramViewPager);
  
  public abstract void setViewPager(ViewPager paramViewPager, int paramInt);
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\handler\ewall\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */