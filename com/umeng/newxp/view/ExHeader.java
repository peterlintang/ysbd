package com.umeng.newxp.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.widget.AbsListView.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ListView;
import com.umeng.newxp.controller.ExchangeDataService;
import com.umeng.newxp.controller.XpListenersCenter.ExchangeDataRequestListener;
import com.umeng.newxp.controller.d;

public class ExHeader
{
  private static final String a = ExHeader.class.getName();
  private ExchangeDataService b;
  private int c;
  private FrameLayout d;
  
  public ExHeader(ExchangeDataService paramExchangeDataService, int paramInt)
  {
    this.b = paramExchangeDataService;
    this.c = paramInt;
  }
  
  public final boolean attachToList(Context paramContext, ListView paramListView)
  {
    try
    {
      this.d = new FrameLayout(paramContext);
      AbsListView.LayoutParams localLayoutParams = new AbsListView.LayoutParams(-1, (int)(paramContext.getResources().getDisplayMetrics().density * this.c + 0.5F));
      this.d.setLayoutParams(localLayoutParams);
      paramContext = new ExchangeViewManager(paramContext, this.b);
      onAttchContent(this.d, paramContext);
      paramListView.addHeaderView(this.d);
      show();
      return true;
    }
    catch (Exception paramContext)
    {
      paramContext = a;
    }
    return false;
  }
  
  public ExchangeDataService getExDataService()
  {
    return this.b;
  }
  
  public void hide()
  {
    if (this.d != null) {
      this.d.setVisibility(8);
    }
  }
  
  public boolean onAttchContent(FrameLayout paramFrameLayout, ExchangeViewManager paramExchangeViewManager)
  {
    boolean bool = false;
    if (paramExchangeViewManager != null)
    {
      paramExchangeViewManager.addView(paramFrameLayout, 43, new String[0]);
      bool = true;
    }
    return bool;
  }
  
  public void preload(Context paramContext, XpListenersCenter.ExchangeDataRequestListener paramExchangeDataRequestListener)
  {
    d locald = this.b.getPreloadData();
    if ((locald != null) && (locald.b()))
    {
      if (paramExchangeDataRequestListener != null) {
        paramExchangeDataRequestListener.dataReceived(1, locald.a());
      }
      paramContext = a;
      return;
    }
    this.b.requestDataAsyn(paramContext, new ExHeader.1(this, paramContext, paramExchangeDataRequestListener), true);
  }
  
  public void show()
  {
    if (this.d != null) {
      this.d.setVisibility(0);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\ExHeader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */