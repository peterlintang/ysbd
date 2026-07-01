package com.umeng.newxp.view.handler.umwall;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.umeng.newxp.b;
import com.umeng.newxp.common.a;
import com.umeng.newxp.controller.ExchangeDataService;
import java.util.Iterator;
import java.util.List;

public class c
{
  public static final int a = 2199;
  View b;
  View c;
  View d;
  FrameLayout e;
  TextView f;
  View g;
  Activity h;
  
  public c(Activity paramActivity)
  {
    this.h = paramActivity;
    this.g = View.inflate(paramActivity, UMWallRes.layout_umeng_xp_hl_ew_search(this.h), null);
    this.c = this.g.findViewById(UMWallRes.umeng_xp_ew_curtain(paramActivity));
    this.e = ((FrameLayout)this.g.findViewById(UMWallRes.umeng_xp_ew_search_result_content(paramActivity)));
    this.b = this.g.findViewById(UMWallRes.umeng_xp_ew_search_result_layout(paramActivity));
    this.f = ((TextView)this.g.findViewById(UMWallRes.umeng_xp_ew_search_text(paramActivity)));
    this.d = this.g.findViewById(UMWallRes.umeng_xp_ew_search_delete(paramActivity));
    this.d.setOnClickListener(new c.1(this));
  }
  
  public void a(String paramString, FragmentManager paramFragmentManager, ExchangeDataService paramExchangeDataService)
  {
    this.b.setVisibility(0);
    this.f.setText(paramString);
    this.e.removeAllViews();
    paramFragmentManager = paramFragmentManager.beginTransaction();
    a locala = new a(paramString, paramString, "", b.b, com.umeng.newxp.c.b);
    paramExchangeDataService.setKeywords(paramString);
    paramString = UMWallFragment.newInstance(paramExchangeDataService, locala, -1);
    paramFragmentManager.add(UMWallRes.umeng_xp_ew_search_result_content(this.h), paramString);
    paramFragmentManager.commitAllowingStateLoss();
  }
  
  public boolean a()
  {
    if (b())
    {
      ((ViewGroup)this.g.getParent()).removeView(this.g);
      return true;
    }
    return false;
  }
  
  public boolean a(ViewGroup paramViewGroup, ViewGroup.LayoutParams paramLayoutParams)
  {
    ViewGroup.LayoutParams localLayoutParams = paramLayoutParams;
    if (paramLayoutParams == null) {
      localLayoutParams = new ViewGroup.LayoutParams(-1, -1);
    }
    if (!b())
    {
      this.b.setVisibility(4);
      paramViewGroup.addView(this.g, localLayoutParams);
      return true;
    }
    return false;
  }
  
  public boolean b()
  {
    return this.g.getParent() != null;
  }
  
  public boolean c()
  {
    Object localObject = this.h.getPackageManager().queryIntentActivities(new Intent("android.speech.action.RECOGNIZE_SPEECH"), 0);
    if (localObject != null) {
      try
      {
        if (((List)localObject).size() > 0)
        {
          localObject = ((List)localObject).iterator();
          while (((Iterator)localObject).hasNext())
          {
            boolean bool = "com.google.android.googlequicksearchbox".equals(((ResolveInfo)((Iterator)localObject).next()).activityInfo.packageName);
            if (bool) {
              return true;
            }
          }
        }
      }
      catch (Exception localException)
      {
        return false;
      }
    }
    return false;
  }
  
  public boolean d()
  {
    boolean bool = false;
    if (c()) {}
    try
    {
      Intent localIntent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
      localIntent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
      localIntent.putExtra("android.speech.extra.PROMPT", "请开始说话");
      this.h.startActivityForResult(localIntent, 2199);
      bool = true;
      return bool;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      new StringBuilder("start exist voiceInput service failed.   ").append(localActivityNotFoundException.toString()).toString();
    }
    return false;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\handler\umwall\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */