package com.umeng.newxp.view.handler;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.umeng.common.ufp.Log;
import com.umeng.common.ufp.b;
import com.umeng.newxp.Promoter;
import com.umeng.newxp.a.d;
import com.umeng.newxp.common.ExchangeConstants;
import com.umeng.newxp.controller.ExchangeDataService;
import com.umeng.newxp.controller.XpListenersCenter.ExchangeDataRequestListener;
import com.umeng.newxp.controller.XpListenersCenter.InitializeListener;
import com.umeng.newxp.view.ExHeader;
import com.umeng.newxp.view.common.e;
import com.umeng.newxp.view.templates.GridTemplate;
import com.umeng.newxp.view.templates.GridTemplateConfig;
import java.util.List;

public class c
  extends Dialog
{
  private static c o = null;
  public e a;
  private Context b;
  private ExchangeDataService c;
  private List<Promoter> d;
  private ViewGroup e;
  private boolean f;
  private ExHeader g;
  private RelativeLayout h;
  private RelativeLayout i;
  private Animation j;
  private XpListenersCenter.ExchangeDataRequestListener k;
  private GridTemplate l;
  private GridTemplateConfig m;
  private int n;
  
  private c(Context paramContext) {}
  
  private void a(Context paramContext)
  {
    this.b = paramContext;
    this.h = ((RelativeLayout)View.inflate(this.b, d.k(this.b), null));
    getWindow().setContentView(this.h, new ViewGroup.LayoutParams(-1, -1));
    this.e = ((ViewGroup)findViewById(16908290));
    this.a = new e(this.b, this.h);
    this.a.b();
    this.i = ((RelativeLayout)this.h.findViewById(com.umeng.common.ufp.c.a(this.b).b("umeng_xp_template_content")));
    this.j = AnimationUtils.loadAnimation(this.b, com.umeng.newxp.a.a.a(this.b));
    this.j.setAnimationListener(new c.2(this));
    this.h.findViewById(com.umeng.newxp.a.c.e(this.b)).setOnClickListener(new c.3(this));
    setCancelable(true);
  }
  
  public static void a(Context paramContext, ExchangeDataService paramExchangeDataService, List<Promoter> paramList, GridTemplateConfig paramGridTemplateConfig, ExHeader paramExHeader)
  {
    if ((b.a(paramContext, "android.permission.ACCESS_NETWORK_STATE")) && (!b.z(paramContext)))
    {
      Toast.makeText(paramContext, paramContext.getResources().getString(com.umeng.common.ufp.a.c.a(paramContext)), 1).show();
      return;
    }
    if ((o != null) && (o.isShowing())) {}
    try
    {
      o.dismiss();
      o = new c(paramContext);
      if (paramGridTemplateConfig != null) {
        o.a(paramGridTemplateConfig);
      }
      if (paramExHeader != null) {
        o.g = paramExHeader;
      }
      if (paramExchangeDataService.initializeListener != null) {
        paramExchangeDataService.initializeListener.onStartRequestData(paramExchangeDataService.layoutType);
      }
      o.a(paramExchangeDataService, paramList);
      o.show();
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Log.c(ExchangeConstants.LOG_TAG, "Reset list dialog...", localException);
      }
    }
  }
  
  private void a(ExHeader paramExHeader)
  {
    this.g = paramExHeader;
  }
  
  public static boolean a()
  {
    c localc = o;
    return (localc != null) && (localc.isShowing());
  }
  
  private void b()
  {
    if (com.umeng.newxp.c.d == this.c.template) {
      this.l = new GridTemplate(this.d, this.c, this.b, this.m);
    }
    for (View localView = this.l.contentView;; localView = new com.umeng.newxp.view.templates.a(this.b, this.c, this.d, this.g).a)
    {
      this.i.addView(localView);
      return;
    }
  }
  
  private void c()
  {
    Animation localAnimation = AnimationUtils.loadAnimation(this.b, com.umeng.newxp.a.a.b(this.b));
    localAnimation.setAnimationListener(new c.4(this));
    this.e.startAnimation(localAnimation);
  }
  
  public void a(ExchangeDataService paramExchangeDataService, List<Promoter> paramList)
  {
    this.c = paramExchangeDataService;
    if (this.c == null) {
      this.c = new ExchangeDataService();
    }
    if (this.i.getChildCount() > 0) {
      this.i.removeAllViews();
    }
    this.d = null;
    if (!paramExchangeDataService.show_progress_wheel)
    {
      this.a.b();
      if ((paramList == null) || (paramList.size() <= 0) || (TextUtils.isEmpty(paramExchangeDataService.sessionId))) {
        break label121;
      }
      this.d = com.umeng.newxp.common.c.a(this.d, paramList);
      this.n = 1;
      b();
      this.a.b();
    }
    label121:
    do
    {
      return;
      this.a.a();
      break;
      this.d = null;
      this.n = 0;
    } while (TextUtils.isEmpty(this.c.sessionId));
    this.c.sessionId = "";
  }
  
  public void a(GridTemplateConfig paramGridTemplateConfig)
  {
    if (paramGridTemplateConfig != null) {
      this.m = paramGridTemplateConfig;
    }
  }
  
  public void dismiss()
  {
    super.dismiss();
    o = null;
    if (this.g != null) {
      this.g.hide();
    }
    if (this.c.broadcast)
    {
      Intent localIntent = new Intent(this.c.getBroadCastAction(this.b));
      localIntent.putExtra("boradcast_action_key", 18);
      this.b.sendBroadcast(localIntent);
    }
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    switch (paramKeyEvent.getKeyCode())
    {
    default: 
      return super.dispatchKeyEvent(paramKeyEvent);
    }
    if ((isShowing()) && (!this.f)) {
      try
      {
        this.f = true;
        c();
        return true;
      }
      finally
      {
        paramKeyEvent = finally;
        throw paramKeyEvent;
      }
    }
    return false;
  }
  
  public void show()
  {
    super.show();
    this.h.startAnimation(this.j);
    if (this.c.broadcast)
    {
      Intent localIntent = new Intent(this.c.getBroadCastAction(this.b));
      localIntent.putExtra("boradcast_action_key", 17);
      this.b.sendBroadcast(localIntent);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\handler\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */