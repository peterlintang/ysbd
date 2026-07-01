package com.umeng.xp.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.umeng.common.Log;
import com.umeng.common.b;
import com.umeng.common.c;
import com.umeng.xp.Promoter;
import com.umeng.xp.common.ExchangeConstants;
import com.umeng.xp.common.a;
import com.umeng.xp.common.g;
import com.umeng.xp.controller.ExchangeDataService;
import com.umeng.xp.controller.XpListenersCenter.AdapterListener;
import com.umeng.xp.controller.XpListenersCenter.EntryOnClickListener;
import com.umeng.xp.controller.XpListenersCenter.FloatDialogListener;
import com.umeng.xp.controller.XpListenersCenter.ReportListener;
import com.umeng.xp.net.XpReportClient;
import java.util.List;

public class ExchangeViewManager
{
  f a = null;
  aw b = null;
  Context c;
  int d;
  XpListenersCenter.EntryOnClickListener e;
  private String f = ExchangeViewManager.class.getName();
  private LargeGalleryConfig g = null;
  private FloatDialogConfig h = null;
  private GridTemplateConfig i = null;
  private ExchangeDataService j;
  private ImageView k;
  private View l;
  private TextView m;
  private ImageView n;
  public List<Promoter> predata;
  
  public ExchangeViewManager(Context paramContext)
  {
    this.c = paramContext;
    this.j = new ExchangeDataService();
  }
  
  public ExchangeViewManager(Context paramContext, ExchangeDataService paramExchangeDataService)
  {
    this.c = paramContext;
    if (paramExchangeDataService == null) {}
    for (this.j = new ExchangeDataService();; this.j = paramExchangeDataService)
    {
      this.j.layoutType = 7;
      return;
    }
  }
  
  public void addView(int paramInt, View paramView, Drawable... paramVarArgs)
  {
    if (paramView == null) {
      return;
    }
    if ((paramView instanceof ImageView)) {
      this.k = ((ImageView)paramView);
    }
    H localH;
    for (;;)
    {
      paramView = new G(this);
      localH = new H(this);
      this.j.layoutType = paramInt;
      this.d = paramInt;
      switch (paramInt)
      {
      default: 
        return;
      case 7: 
        if (paramVarArgs.length != 0) {
          break label225;
        }
        this.k.setVisibility(8);
        g.a(this.k, this.c, this.j, new I(this, localH));
        return;
        if ((paramView instanceof RelativeLayout))
        {
          paramView = (RelativeLayout)paramView;
          this.k = ((ImageView)paramView.findViewById(c.a(this.c).b("imageview")));
          this.l = paramView.findViewById(c.a(this.c).b("newtip_area"));
          this.m = ((TextView)paramView.findViewById(c.a(this.c).b("newtip_tv")));
          this.n = ((ImageView)paramView.findViewById(c.a(this.c).b("newtip_iv")));
        }
        break;
      }
    }
    label225:
    this.k.setImageDrawable(paramVarArgs[0]);
    this.j.preloadData(this.c, localH, 7);
    this.k.setOnClickListener(new K(this));
    return;
    if (paramVarArgs.length == 0)
    {
      g.a(this.k, this.c, this.j, new L(this, paramView));
      return;
    }
    this.k.setImageDrawable(paramVarArgs[0]);
    this.k.setOnClickListener(paramView);
  }
  
  public void addView(ViewGroup paramViewGroup, int paramInt, String... paramVarArgs)
  {
    this.j.layoutType = paramInt;
    this.d = paramInt;
    if (paramVarArgs != null) {}
    try
    {
      if ((paramVarArgs.length > 0) && (paramVarArgs.length > 0)) {
        ExchangeConstants.CHANNEL = paramVarArgs[0];
      }
      if ((ExchangeConstants.ONLY_CHINESE) && (!b.a(this.c)))
      {
        Log.b(ExchangeConstants.LOG_TAG, "English os can not show ads");
        return;
      }
      if (this.d == 7)
      {
        ao.a(this.c, this.j, null);
        return;
      }
    }
    catch (Exception paramViewGroup)
    {
      Log.b(ExchangeConstants.LOG_TAG, "add view error " + paramViewGroup.getMessage(), paramViewGroup);
      return;
    }
    if (this.d == 11)
    {
      paramViewGroup = new D(this, paramViewGroup);
      this.j.requestDataAsyn(this.c, paramViewGroup);
      return;
    }
    if (this.d == 12)
    {
      paramViewGroup = g.a(this.c, this.j.slot_id);
      if (paramViewGroup != null) {
        new i(this.c, paramViewGroup).show();
      }
    }
    else
    {
      if (this.d == 8)
      {
        paramViewGroup.addView(new GridTemplate(null, this.j, this.c, this.i).contentView);
        return;
      }
      if (this.d == 15)
      {
        long l1 = System.currentTimeMillis();
        if (this.h != null) {}
        for (paramViewGroup = this.h;; paramViewGroup = new FloatDialogConfig())
        {
          paramViewGroup.setStartTime(l1);
          if (paramViewGroup.getListener() != null) {
            paramViewGroup.getListener().onStart();
          }
          this.j.requestDataAsyn(this.c, new F(this, paramViewGroup));
          return;
        }
      }
      switch (this.d)
      {
      }
    }
    for (;;)
    {
      Log.b(ExchangeConstants.LOG_TAG, String.format("Paramter type  %1$s cannot be handled. It may be deprecated.", new Object[] { Integer.valueOf(this.d) }));
      return;
      this.a = new f(this.c, paramViewGroup, this.d, this.j);
      return;
      this.b = new aw(this.c, paramViewGroup, 11, this.j);
      return;
      if (this.g == null) {}
      for (paramVarArgs = new LargeGalleryConfig();; paramVarArgs = this.g)
      {
        new ag(this.c, paramViewGroup, this.j, paramVarArgs);
        return;
      }
      new X(this.c, paramViewGroup, this.d, 0, this.j);
      return;
    }
  }
  
  public void addView(ViewGroup paramViewGroup, ListView paramListView)
  {
    addView(paramViewGroup, paramListView, null);
  }
  
  public void addView(ViewGroup paramViewGroup, ListView paramListView, XpListenersCenter.AdapterListener paramAdapterListener)
  {
    new EmbededContainer(this.c, paramViewGroup, paramListView, this.j, paramAdapterListener, null, this.i);
  }
  
  public void hideBanner()
  {
    for (;;)
    {
      try
      {
        switch (this.d)
        {
        case 6: 
          Log.b(ExchangeConstants.LOG_TAG, "paramter type cannot be handled");
          return;
        }
      }
      catch (Exception localException)
      {
        Log.b(ExchangeConstants.LOG_TAG, "hideBanner error");
        return;
      }
      if (this.a == null) {
        break;
      }
      a.a(this.a.b);
      return;
      if (this.b == null) {
        break;
      }
      a.a(this.b.b);
      return;
    }
  }
  
  public void hideBanner(int paramInt)
  {
    new Handler().postDelayed(new M(this), paramInt * 1000);
  }
  
  public void setBannerOnClickListener(View.OnClickListener paramOnClickListener)
  {
    if (this.a != null) {
      this.a.a(paramOnClickListener);
    }
    while (this.b == null) {
      return;
    }
    this.b.a(paramOnClickListener);
  }
  
  public ExchangeViewManager setEntryOnClickListener(XpListenersCenter.EntryOnClickListener paramEntryOnClickListener)
  {
    if ((this.e != null) && (this.e != paramEntryOnClickListener))
    {
      Log.e(this.f, "EntryOnClickListener is exist, and make old listener invalid...");
      this.e = paramEntryOnClickListener;
    }
    while (this.e != null) {
      return this;
    }
    Log.a(this.f, "EntryOnClickListener set up...");
    this.e = paramEntryOnClickListener;
    return this;
  }
  
  public void setFloatDialogConfig(FloatDialogConfig paramFloatDialogConfig)
  {
    this.h = paramFloatDialogConfig;
  }
  
  public void setGridTemplateConfig(GridTemplateConfig paramGridTemplateConfig)
  {
    this.i = paramGridTemplateConfig;
  }
  
  public void setLargeGalleryConfig(LargeGalleryConfig paramLargeGalleryConfig)
  {
    this.g = paramLargeGalleryConfig;
  }
  
  public void setLoopInterval(int paramInt)
  {
    if (paramInt > 3000)
    {
      ExchangeConstants.REFRESH_INTERVAL = paramInt;
      ExchangeConstants.IGNORE_SERVER_INTERVAL = true;
    }
  }
  
  public void setReportListener(XpListenersCenter.ReportListener paramReportListener)
  {
    XpReportClient.registerReportListener(paramReportListener);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\view\ExchangeViewManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */