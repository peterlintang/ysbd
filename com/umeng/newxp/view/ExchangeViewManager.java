package com.umeng.newxp.view;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager.BadTokenException;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.umeng.common.ufp.Log;
import com.umeng.newxp.Promoter;
import com.umeng.newxp.common.ExchangeConstants;
import com.umeng.newxp.controller.ExchangeDataService;
import com.umeng.newxp.controller.XpListenersCenter.AdapterListener;
import com.umeng.newxp.controller.XpListenersCenter.EntryOnClickListener;
import com.umeng.newxp.controller.XpListenersCenter.FloatDialogListener;
import com.umeng.newxp.controller.XpListenersCenter.NTipsChangedListener;
import com.umeng.newxp.controller.XpListenersCenter.ReportListener;
import com.umeng.newxp.controller.XpListenersCenter.WelcomeAdsListener;
import com.umeng.newxp.net.XpReportClient;
import com.umeng.newxp.net.m;
import com.umeng.newxp.net.m.a;
import com.umeng.newxp.net.m.b;
import com.umeng.newxp.view.largeimage.LargeGallery;
import com.umeng.newxp.view.largeimage.LargeGalleryConfig;
import com.umeng.newxp.view.popup.FloatDialogConfig;
import com.umeng.newxp.view.templates.GridTemplate;
import com.umeng.newxp.view.templates.GridTemplateConfig;
import com.umeng.newxp.view.welcome.WelcomeView;
import com.umeng.newxp.view.welcome.i;
import com.umeng.newxp.view.welcome.j;
import com.umeng.newxp.view.widget.SwipeViewPointer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExchangeViewManager
{
  Context a;
  int b;
  XpListenersCenter.EntryOnClickListener c;
  private final String d = ExchangeViewManager.class.getName();
  private ExHeader e = null;
  private final Map<String, d> f = new HashMap();
  private ExchangeDataService g;
  private ImageView h;
  private View i;
  private View j;
  private TextView k;
  private TextView l;
  private ImageView m;
  private volatile boolean n = false;
  public List<Promoter> predata;
  
  public ExchangeViewManager(Context paramContext)
  {
    this(paramContext, new ExchangeDataService());
  }
  
  public ExchangeViewManager(Context paramContext, ExchangeDataService paramExchangeDataService)
  {
    this.a = paramContext;
    if (paramExchangeDataService == null) {}
    for (this.g = new ExchangeDataService();; this.g = paramExchangeDataService)
    {
      this.g.layoutType = 7;
      return;
    }
  }
  
  private <T extends d> T getFeatureConfig(Class<T> paramClass)
  {
    paramClass = paramClass.getSimpleName();
    if (this.f.containsKey(paramClass))
    {
      Log.a(this.d, "has exist config " + paramClass);
      return (d)this.f.get(paramClass);
    }
    return null;
  }
  
  private boolean isInterrupt(int paramInt)
  {
    return false;
  }
  
  private boolean isSupport(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return false;
    }
    try
    {
      Class.forName("com.umeng.newxp.view.wap.CloudDialog");
      return true;
    }
    catch (Exception localException) {}
    Class.forName("com.umeng.newxp.view.container.a");
    return true;
    Class.forName("com.umeng.newxp.view.popup.b");
    return true;
    Class.forName("com.umeng.newxp.view.text.a");
    return true;
    Class.forName("com.umeng.newxp.view.largeimage.LargeGallery");
    return true;
    Class.forName("com.umeng.newxp.view.handler.c");
    return true;
    Class.forName("com.umeng.newxp.view.banner.a");
    return true;
    return false;
  }
  
  private void matchHandlerList(XpListenersCenter.NTipsChangedListener paramNTipsChangedListener, Drawable... paramVarArgs)
  {
    if (paramVarArgs.length == 0)
    {
      this.j.setVisibility(4);
      this.j.setClickable(false);
      com.umeng.newxp.common.c.a(this.h, this.a, this.g, new ExchangeViewManager.11(this, paramNTipsChangedListener));
      return;
    }
    this.h.setImageDrawable(paramVarArgs[0]);
    this.h.setOnClickListener(new ExchangeViewManager.12(this));
  }
  
  private void pushMsgDialog(Promoter paramPromoter, XpListenersCenter.FloatDialogListener paramFloatDialogListener)
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this.a);
    localBuilder.setMessage(paramPromoter.title);
    localBuilder.setPositiveButton("确认", new ExchangeViewManager.13(this, paramPromoter, paramFloatDialogListener));
    localBuilder.setNegativeButton("取消", new ExchangeViewManager.14(this));
    try
    {
      localBuilder.create().show();
      paramPromoter = new m.a(this.a).a(0).b(0).d(0).g(this.g.getTimeConsuming()).c(this.b).a(new Promoter[] { paramPromoter }).f(com.umeng.newxp.common.c.a(this.a, this.g)).a(this.g.slot_id).a(this.g.sessionId, this.g.psid).a();
      new XpReportClient(this.a).sendAsync(paramPromoter, null);
      return;
    }
    catch (WindowManager.BadTokenException paramPromoter)
    {
      Log.e(this.d, "Can`t show dialog ", paramPromoter);
    }
  }
  
  private void reportAclick()
  {
    if (7 == this.g.layoutType)
    {
      m localm = new m.b(this.a).a(15).b(0).d(3).c(this.g.layoutType).g(this.g.getTimeConsuming()).f(com.umeng.newxp.common.c.a(this.a, this.g)).a(this.g.slot_id).b(this.g.module.toString()).a(this.g.sessionId, this.g.psid).a();
      new XpReportClient(this.a).sendAsync(localm, null);
    }
  }
  
  public static void setReportListener(XpListenersCenter.ReportListener paramReportListener)
  {
    XpReportClient.registerReportListener(paramReportListener);
  }
  
  private void showFirst(j paramj, XpListenersCenter.WelcomeAdsListener paramWelcomeAdsListener)
  {
    i locali = new i(this.a);
    ExchangeViewManager.6 local6 = new ExchangeViewManager.6(this, this.a, locali, paramWelcomeAdsListener);
    local6.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    if (local6.a(paramj))
    {
      locali.setContentView(local6);
      try
      {
        locali.show();
        this.g.reportImpression(new Promoter[] { paramj });
        if (paramWelcomeAdsListener != null) {
          paramWelcomeAdsListener.onShow(local6);
        }
        return;
      }
      catch (WindowManager.BadTokenException localBadTokenException)
      {
        for (;;)
        {
          String str = this.d;
        }
      }
    }
    paramWelcomeAdsListener.onError("the promoter is failed");
    paramWelcomeAdsListener.onFinish();
  }
  
  private void welcomeDataReceived(XpListenersCenter.WelcomeAdsListener paramWelcomeAdsListener, long paramLong1, long paramLong2, long paramLong3, boolean paramBoolean, List<Promoter> paramList)
  {
    Handler localHandler = new Handler();
    this.n = true;
    paramLong3 = System.currentTimeMillis() - paramLong3;
    if ((paramList == null) || (paramList.size() <= 0)) {
      if (paramWelcomeAdsListener != null)
      {
        if (paramLong3 < paramLong1) {
          localHandler.postDelayed(new ExchangeViewManager.4(this, paramWelcomeAdsListener), paramLong1 - paramLong3);
        }
      }
      else {
        paramWelcomeAdsListener = ExchangeConstants.LOG_TAG;
      }
    }
    do
    {
      return;
      paramWelcomeAdsListener.onDataReviced(null);
      paramWelcomeAdsListener.onFinish();
      break;
      paramList = (j)paramList.get(0);
      if (paramWelcomeAdsListener != null) {
        paramWelcomeAdsListener.onDataReviced(paramList);
      }
      if (paramBoolean)
      {
        showFirst(paramList, paramWelcomeAdsListener);
        return;
      }
      if (paramLong3 < paramLong1)
      {
        localHandler.postDelayed(new ExchangeViewManager.5(this, paramList, paramWelcomeAdsListener), paramLong1 - paramLong3);
        return;
      }
      if (paramLong3 < paramLong2)
      {
        showFirst(paramList, paramWelcomeAdsListener);
        return;
      }
      paramList = ExchangeConstants.LOG_TAG;
    } while (paramWelcomeAdsListener == null);
    paramWelcomeAdsListener.onError("Load outdated..");
    paramWelcomeAdsListener.onFinish();
  }
  
  public void addView(int paramInt, View paramView, Drawable... paramVarArgs)
  {
    if (isInterrupt(paramInt)) {}
    do
    {
      return;
      this.g.layoutType = paramInt;
      if ((paramInt == 10) && (TextUtils.isEmpty(this.g.getCreditUID()))) {
        throw new RuntimeException("Please set the uid for Credit Wall.");
      }
      if (paramView != null) {
        break;
      }
      switch (paramInt)
      {
      default: 
        return;
      case 7: 
      case 10: 
        do
        {
          this.g.template = com.umeng.newxp.c.a;
          com.umeng.newxp.view.handler.b.a(this.a, this.g, null);
          return;
        } while ((!com.umeng.common.ufp.b.a(this.a, "android.permission.ACCESS_NETWORK_STATE")) || (com.umeng.common.ufp.b.z(this.a)));
        Toast.makeText(this.a, this.a.getResources().getString(com.umeng.common.ufp.a.c.a(this.a)), 1).show();
        return;
      }
      paramView = this.g.getWapUrl(this.a);
    } while (paramView == null);
    new com.umeng.newxp.view.wap.a(this.a, paramView).show();
    return;
    if ((paramView instanceof ImageView))
    {
      this.h = ((ImageView)paramView);
      this.j = paramView;
    }
    for (;;)
    {
      paramView = new ExchangeViewManager.8(this);
      ExchangeViewManager.9 local9 = new ExchangeViewManager.9(this);
      this.b = paramInt;
      switch (paramInt)
      {
      default: 
        return;
      case 7: 
      case 10: 
        matchHandlerList(local9, paramVarArgs);
        return;
        if ((paramView instanceof RelativeLayout))
        {
          this.j = ((RelativeLayout)paramView);
          this.h = ((ImageView)this.j.findViewById(com.umeng.common.ufp.c.a(this.a).b("imageview")));
          this.i = this.j.findViewById(com.umeng.common.ufp.c.a(this.a).b("newtip_area"));
          this.k = ((TextView)this.j.findViewById(com.umeng.common.ufp.c.a(this.a).b("newtip_tv")));
          this.m = ((ImageView)this.j.findViewById(com.umeng.common.ufp.c.a(this.a).b("newtip_iv")));
          this.l = ((TextView)this.j.findViewById(com.umeng.common.ufp.c.a(this.a).b("textview")));
        }
        break;
      }
    }
    if (paramVarArgs.length == 0)
    {
      this.j.setVisibility(4);
      this.j.setClickable(false);
      com.umeng.newxp.common.c.a(this.h, this.a, this.g, new ExchangeViewManager.10(this, paramView));
      return;
    }
    this.h.setImageDrawable(paramVarArgs[0]);
    this.h.setOnClickListener(paramView);
  }
  
  public void addView(ViewGroup paramViewGroup, int paramInt, String... paramVarArgs)
  {
    if (isInterrupt(paramInt)) {
      return;
    }
    this.g.layoutType = paramInt;
    this.b = paramInt;
    try
    {
      if (!isSupport(paramInt))
      {
        Log.b(ExchangeConstants.LOG_TAG, "Your sdk is not support NO." + paramInt + " feature. ");
        return;
      }
    }
    catch (Exception paramViewGroup)
    {
      Log.b(ExchangeConstants.LOG_TAG, "add view error " + paramViewGroup.getMessage(), paramViewGroup);
      return;
    }
    if ((paramVarArgs != null) && (paramVarArgs.length > 0) && (paramVarArgs.length > 0)) {
      ExchangeConstants.CHANNEL = paramVarArgs[0];
    }
    if ((ExchangeConstants.ONLY_CHINESE) && (!com.umeng.common.ufp.b.k(this.a)))
    {
      Log.b(ExchangeConstants.LOG_TAG, "Only chinese language os can show ads");
      return;
    }
    if (this.b == 7)
    {
      com.umeng.newxp.view.handler.b.a(this.a, this.g, null);
      return;
    }
    if (this.b == 8)
    {
      paramVarArgs = (GridTemplateConfig)getFeatureConfig(GridTemplateConfig.class);
      paramViewGroup.addView(new GridTemplate(null, this.g, this.a, paramVarArgs).contentView);
      return;
    }
    if (this.b == 15)
    {
      long l1 = System.currentTimeMillis();
      paramViewGroup = (FloatDialogConfig)getFeatureConfig(FloatDialogConfig.class);
      if (paramViewGroup != null) {}
      for (;;)
      {
        paramViewGroup.setStartTime(l1);
        if (paramViewGroup.getListener() != null) {
          paramViewGroup.getListener().onStart();
        }
        paramViewGroup = new ExchangeViewManager.1(this, paramViewGroup);
        this.g.requestDataAsyn(this.a, paramViewGroup);
        return;
        paramViewGroup = new FloatDialogConfig();
      }
    }
    switch (this.b)
    {
    case 6: 
      Log.b(ExchangeConstants.LOG_TAG, String.format("Paramter type  %1$s cannot be handled. It may be deprecated.", new Object[] { Integer.valueOf(this.b) }));
      return;
      new com.umeng.newxp.view.banner.a(this.a, paramViewGroup, this.b, this.g);
      return;
    case 43: 
      paramVarArgs = (LargeGalleryConfig)getFeatureConfig(LargeGalleryConfig.class);
      if (paramVarArgs == null) {
        paramVarArgs = new LargeGalleryConfig();
      }
      break;
    }
    for (;;)
    {
      Object localObject = (LayoutInflater)this.a.getSystemService("layout_inflater");
      com.umeng.common.ufp.c localc = com.umeng.common.ufp.c.a(this.a);
      localObject = (ViewGroup)((LayoutInflater)localObject).inflate(com.umeng.newxp.a.d.o(this.a), null);
      paramVarArgs.setParent((View)localObject);
      LargeGallery localLargeGallery = (LargeGallery)((ViewGroup)localObject).findViewById(localc.b("umeng_xp_gallery"));
      SwipeViewPointer localSwipeViewPointer = (SwipeViewPointer)((ViewGroup)localObject).findViewById(localc.b("umeng_xp_gallery_pointer"));
      localLargeGallery.setLoadListener(new ExchangeViewManager.7(this, (ViewGroup)((ViewGroup)localObject).findViewById(localc.b("umeng_xp_gallery_entity")), (ViewGroup)((ViewGroup)localObject).findViewById(localc.b("umeng_xp_gallery_progress")), (ViewGroup)((ViewGroup)localObject).findViewById(localc.b("umeng_xp_gallery_errorpage"))));
      localLargeGallery.work(this.g, paramVarArgs);
      localLargeGallery.setForefathers(paramViewGroup);
      paramViewGroup.addView((View)localObject, -1, -1);
      localLargeGallery.setPageControl(localSwipeViewPointer);
      return;
      new com.umeng.newxp.view.text.a(this.a, paramViewGroup, this.b, 0, this.g);
      return;
      break;
    }
  }
  
  public void addView(ViewGroup paramViewGroup, ListView paramListView)
  {
    addView(paramViewGroup, paramListView, null);
  }
  
  public void addView(ViewGroup paramViewGroup, ListView paramListView, XpListenersCenter.AdapterListener paramAdapterListener)
  {
    if (isInterrupt(8)) {
      return;
    }
    this.g.layoutType = 8;
    GridTemplateConfig localGridTemplateConfig = (GridTemplateConfig)getFeatureConfig(GridTemplateConfig.class);
    new com.umeng.newxp.view.container.a(this.a, paramViewGroup, paramListView, this.g, paramAdapterListener, null, localGridTemplateConfig, this.e);
  }
  
  public void addWelcomeAds(String paramString, XpListenersCenter.WelcomeAdsListener paramWelcomeAdsListener, long paramLong1, long paramLong2)
  {
    long l1 = System.currentTimeMillis();
    this.n = false;
    this.g = new ExchangeDataService(paramString);
    new Handler().postDelayed(new ExchangeViewManager.2(this, paramWelcomeAdsListener, paramLong1, paramLong2, l1), paramLong2);
    this.g.cacheLiveData = true;
    this.g.setSpecificPromoterClz(j.class);
    this.g.requestRichImageDataAsyn(this.a, 9, new ExchangeViewManager.3(this, paramWelcomeAdsListener, paramLong1, paramLong2, l1), true);
  }
  
  public void onOrientationChanaged(int paramInt)
  {
    switch (this.g.layoutType)
    {
    default: 
      return;
    }
    com.umeng.newxp.view.popup.b.a(paramInt);
  }
  
  public ExchangeViewManager setEntryOnClickListener(XpListenersCenter.EntryOnClickListener paramEntryOnClickListener)
  {
    if ((this.c != null) && (this.c != paramEntryOnClickListener))
    {
      Log.e(this.d, "EntryOnClickListener is exist, and make old listener invalid...");
      this.c = paramEntryOnClickListener;
    }
    while (this.c != null) {
      return this;
    }
    Log.a(this.d, "EntryOnClickListener set up...");
    this.c = paramEntryOnClickListener;
    return this;
  }
  
  public void setFeatureConfig(d paramd)
  {
    String str = paramd.getClass().getSimpleName();
    if (this.f.containsKey(str)) {
      Log.e(this.d, "replace exchange feature config [" + str + "]");
    }
    this.f.put(str, paramd);
  }
  
  public void setListHeader(int paramInt, ExchangeDataService paramExchangeDataService)
  {
    if (paramExchangeDataService.layoutType == -1) {
      paramExchangeDataService.layoutType = 43;
    }
    this.e = new ExHeader(paramExchangeDataService, paramInt);
  }
  
  public void setListHeader(ExHeader paramExHeader)
  {
    this.e = paramExHeader;
  }
  
  public void setLoopInterval(int paramInt)
  {
    if (paramInt > 3000)
    {
      ExchangeConstants.REFRESH_INTERVAL = paramInt;
      ExchangeConstants.IGNORE_SERVER_INTERVAL = true;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\ExchangeViewManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */