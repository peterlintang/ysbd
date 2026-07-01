package com.umeng.xp.view;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.widget.ListView;
import android.widget.Toast;
import com.umeng.common.Log;
import com.umeng.common.b;
import com.umeng.common.b.i;
import com.umeng.xp.Promoter;
import com.umeng.xp.a;
import com.umeng.xp.a.a;
import com.umeng.xp.a.e;
import com.umeng.xp.common.ExchangeConstants;
import com.umeng.xp.controller.ExchangeDataService;
import com.umeng.xp.controller.XpListenersCenter.AdapterListener;
import com.umeng.xp.controller.XpListenersCenter.InitializeListener;
import java.util.List;

public class EmbededContainer
{
  private ViewGroup a;
  private ListView b;
  private Context c;
  private ExchangeDataService d;
  private List<Promoter> e;
  private XpListenersCenter.AdapterListener f;
  private int g = 5;
  private GridTemplateConfig h;
  private Animation i;
  private boolean j = false;
  private boolean k = false;
  private boolean l = false;
  public int mType = 8;
  
  public EmbededContainer(Context paramContext, ViewGroup paramViewGroup, ListView paramListView, ExchangeDataService paramExchangeDataService, XpListenersCenter.AdapterListener paramAdapterListener, List<Promoter> paramList, GridTemplateConfig paramGridTemplateConfig)
  {
    if ((b.a(paramContext, "android.permission.ACCESS_NETWORK_STATE")) && (!b.m(paramContext)))
    {
      Toast.makeText(paramContext, paramContext.getResources().getString(e.f(paramContext)), 1).show();
      return;
    }
    this.c = paramContext;
    this.h = paramGridTemplateConfig;
    this.f = paramAdapterListener;
    if ((paramViewGroup == null) && (paramListView == null))
    {
      Log.e(ExchangeConstants.LOG_TAG, "this container integrated approach is failed! [view params neither ListView nor ViewGroup]");
      return;
    }
    if (paramViewGroup != null)
    {
      this.l = true;
      this.a = paramViewGroup;
      if (paramListView == null) {
        break label268;
      }
      this.k = true;
      this.b = paramListView;
    }
    for (;;)
    {
      paramExchangeDataService.layoutType = 8;
      this.d = paramExchangeDataService;
      paramContext = new az(this.c, this.a);
      if (paramExchangeDataService.show_progress_wheel) {
        paramContext.a();
      }
      paramViewGroup = new r(this, paramContext);
      if (this.d.initializeListener != null) {
        this.d.initializeListener.onStartRequestData(this.mType);
      }
      if ((paramList == null) || (paramList.size() <= 0)) {
        break label279;
      }
      a(paramContext, 1, paramList);
      Log.c(ExchangeConstants.LOG_TAG, "init view use setData.... " + paramList.size());
      return;
      Log.e(ExchangeConstants.LOG_TAG, "this container integrated approach is not support grid template!");
      break;
      label268:
      Log.e(ExchangeConstants.LOG_TAG, "this container integrated approach is not support list template!");
    }
    label279:
    if ((this.d.preloadData != null) && (this.d.preloadData.a == a.a.a))
    {
      paramViewGroup = this.d.preloadData.b();
      a(paramContext, 1, paramViewGroup);
      Log.c(ExchangeConstants.LOG_TAG, "init view use preloadData.... " + paramViewGroup.size());
      return;
    }
    this.d.sessionId = "";
    this.d.requestDataAsyn(this.c, paramViewGroup);
    Log.c(ExchangeConstants.LOG_TAG, "init view use server data.... ");
  }
  
  private void a()
  {
    if (ExchangeConstants.CONTAINER_LIST_COUNT > this.e.size()) {}
    for (int m = this.e.size();; m = ExchangeConstants.CONTAINER_LIST_COUNT)
    {
      ViewGroup.LayoutParams localLayoutParams = this.a.getLayoutParams();
      new i(this.c);
      localLayoutParams.height = i.a(m * (ExchangeConstants.CONTAINER_HEIGHT + 1));
      this.a.setLayoutParams(localLayoutParams);
      return;
    }
  }
  
  private void a(az paramaz, int paramInt, List<Promoter> paramList)
  {
    XpListenersCenter.InitializeListener localInitializeListener;
    if (this.d.initializeListener != null)
    {
      localInitializeListener = this.d.initializeListener;
      if (paramList != null) {
        break label48;
      }
    }
    label48:
    for (int m = 0;; m = paramList.size())
    {
      localInitializeListener.onReceived(m);
      if (paramaz != null) {
        paramaz.b();
      }
      if (paramInt != 0) {
        break;
      }
      return;
    }
    this.e = paramList;
    setInteraction();
  }
  
  public void setInteraction()
  {
    View localView = null;
    switch (this.d.getTemplate())
    {
    default: 
      if (this.k) {
        new EmbededContainer.a(this, this.b, this.f);
      }
      break;
    }
    for (;;)
    {
      if (localView != null)
      {
        this.b.setVisibility(8);
        this.a.addView(localView);
      }
      return;
      if (this.l)
      {
        localView = new GridTemplate(this.e, this.d, this.c, this.h).contentView;
      }
      else
      {
        new EmbededContainer.a(this, this.b, this.f);
        continue;
        localView = new GridTemplate(this.e, this.d, this.c, this.h).contentView;
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\view\EmbededContainer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */