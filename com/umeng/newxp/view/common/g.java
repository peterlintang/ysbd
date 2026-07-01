package com.umeng.newxp.view.common;

import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.webkit.WebView;
import android.widget.ProgressBar;
import com.umeng.common.ufp.Log;
import com.umeng.newxp.Promoter;
import com.umeng.newxp.a.d;
import com.umeng.newxp.view.common.actionbar.ActionBar;
import com.umeng.newxp.view.common.actionbar.e;
import com.umeng.newxp.view.handler.UMTuanPromoter;
import java.util.HashMap;
import java.util.Map;

public class g
  extends a
{
  private static final String n = g.class.getName();
  String c;
  String d;
  View e;
  View f;
  boolean g = true;
  ProgressBar h;
  boolean i = false;
  boolean j = true;
  boolean k = true;
  Map<String, String> l = new HashMap();
  Promoter m;
  
  public g(Context paramContext, String paramString, boolean paramBoolean)
  {
    super(paramContext);
    this.c = paramString;
    this.g = paramBoolean;
    this.l.put("Referer", "native null refer");
  }
  
  public g(Context paramContext, String paramString, boolean paramBoolean, Promoter paramPromoter)
  {
    super(paramContext);
    this.c = paramString;
    this.g = paramBoolean;
    this.m = paramPromoter;
    this.l.put("Referer", "native null refer");
  }
  
  public g a(Map<String, String> paramMap)
  {
    this.l.putAll(paramMap);
    return this;
  }
  
  public g a(boolean paramBoolean)
  {
    this.i = paramBoolean;
    return this;
  }
  
  public void a()
  {
    com.umeng.newxp.common.c.L(this.a);
    if (this.h != null) {
      this.h.setVisibility(0);
    }
    if (!TextUtils.isEmpty(this.c))
    {
      if ((Build.VERSION.SDK_INT < 8) || (this.l == null)) {
        break label88;
      }
      this.b.loadUrl(this.c, this.l);
    }
    for (;;)
    {
      Log.a(n, "load url: " + this.c);
      return;
      label88:
      this.b.loadUrl(this.c);
    }
  }
  
  public void a(WebView paramWebView)
  {
    super.a(paramWebView);
    paramWebView.setWebChromeClient(new g.3(this));
    paramWebView.setWebViewClient(new g.4(this));
    paramWebView.setDownloadListener(new g.5(this));
    paramWebView.setDownloadListener(new g.6(this));
  }
  
  public g b(boolean paramBoolean)
  {
    this.j = paramBoolean;
    return this;
  }
  
  public void b()
  {
    com.umeng.newxp.view.common.actionbar.c.a(this.a);
    int i1 = d.c(this.a);
    ViewGroup localViewGroup = (ViewGroup)LayoutInflater.from(this.a).inflate(i1, null);
    ActionBar localActionBar = (ActionBar)localViewGroup.findViewById(com.umeng.newxp.a.c.P(this.a));
    UMTuanPromoter localUMTuanPromoter;
    if (this.k)
    {
      localActionBar.setVisibility(0);
      localActionBar.setLeftAction(new e(this.a, this));
      if (this.m != null)
      {
        if (!(this.m instanceof UMTuanPromoter)) {
          break label347;
        }
        localUMTuanPromoter = (UMTuanPromoter)this.m;
        if ((!TextUtils.isEmpty(localUMTuanPromoter.publisher)) && (!TextUtils.isEmpty(localUMTuanPromoter.title))) {
          localActionBar.setTitle(localUMTuanPromoter.publisher + "-" + localUMTuanPromoter.title);
        }
      }
      else
      {
        getWindow().setContentView(localViewGroup, new ViewGroup.LayoutParams(-1, -1));
        this.b = ((WebView)findViewById(com.umeng.newxp.a.c.G(this.a)));
        this.e = findViewById(com.umeng.newxp.a.c.O(this.a));
        this.f = findViewById(com.umeng.newxp.a.c.R(this.a));
        this.h = ((ProgressBar)findViewById(com.umeng.newxp.a.c.x(this.a)));
        this.e.setOnClickListener(new g.1(this));
        if (!this.g) {
          break label370;
        }
        this.e.setVisibility(0);
        label270:
        if (!this.j) {
          break label382;
        }
        this.f.setVisibility(0);
      }
    }
    for (;;)
    {
      this.f.setOnClickListener(new g.2(this));
      return;
      if ((!TextUtils.isEmpty(localUMTuanPromoter.publisher)) && (TextUtils.isEmpty(localUMTuanPromoter.title)))
      {
        localActionBar.setTitle(localUMTuanPromoter.publisher);
        break;
      }
      localActionBar.setTitle(localUMTuanPromoter.title);
      break;
      label347:
      localActionBar.setTitle(this.m.title);
      break;
      localActionBar.setVisibility(8);
      break;
      label370:
      this.e.setVisibility(8);
      break label270;
      label382:
      this.f.setVisibility(8);
    }
  }
  
  public g c(boolean paramBoolean)
  {
    this.k = paramBoolean;
    return this;
  }
  
  public void onBackPressed()
  {
    if ((this.i) && (this.b.canGoBack()))
    {
      this.b.goBack();
      return;
    }
    super.onBackPressed();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\common\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */