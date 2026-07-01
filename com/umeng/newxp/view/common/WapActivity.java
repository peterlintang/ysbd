package com.umeng.newxp.view.common;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Environment;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.umeng.common.ufp.Log;
import com.umeng.common.ufp.b;
import com.umeng.newxp.common.ExchangeConstants;
import com.umeng.newxp.common.c;
import com.umeng.newxp.controller.ExchangeDataService;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class WapActivity
  extends Activity
{
  public static final String a = "url_key";
  public static final String b = "configs";
  private static final String c = WapActivity.class.getName();
  private static ExchangeDataService d;
  private int A;
  private int B;
  private int C;
  private int D;
  private WebView e;
  private ImageView f;
  private ImageView g;
  private ImageView h;
  private ImageView i;
  private ViewGroup j;
  private ViewGroup k;
  private ProgressBar l;
  private Context m;
  private View n;
  private String o;
  private h p;
  private int q;
  private int r;
  private int s;
  private int t;
  private int u;
  private int v;
  private int w;
  private int x;
  private int y;
  private int z;
  
  public static int a(Context paramContext, String paramString1, String paramString2)
  {
    Resources localResources = paramContext.getResources();
    paramContext = paramContext.getPackageName();
    int i1 = localResources.getIdentifier(paramString2, paramString1, paramContext);
    if (i1 <= 0) {
      throw new RuntimeException("获取资源ID失败:(packageName=" + paramContext + " type=" + paramString1 + " name=" + paramString2);
    }
    return i1;
  }
  
  public static void a(Context paramContext, ExchangeDataService paramExchangeDataService, h paramh)
  {
    Intent localIntent = new Intent(paramContext, WapActivity.class);
    h localh = paramh;
    if (paramh == null) {
      localh = new h();
    }
    localIntent.putExtra("configs", localh);
    d = paramExchangeDataService;
    paramh = new StringBuilder("http://w.m.taobao.com/api/wap?").append("sdk_version=" + b.n(paramContext));
    if (!TextUtils.isEmpty(paramExchangeDataService.slot_id))
    {
      paramh.append("&slot_id=" + paramExchangeDataService.slot_id);
      if (!TextUtils.isEmpty(c.a(paramContext, paramExchangeDataService))) {
        paramh.append("&app_key=" + c.a(paramContext, paramExchangeDataService));
      }
      if (!TextUtils.isEmpty(paramh.toString())) {
        localIntent.putExtra("url_key", paramh.toString());
      }
      paramContext.startActivity(localIntent);
    }
  }
  
  private void a(WebSettings paramWebSettings)
  {
    try
    {
      WebSettings.class.getMethod("setAppCacheEnabled", new Class[] { Boolean.TYPE }).invoke(paramWebSettings, new Object[] { Boolean.valueOf(true) });
      Method localMethod = WebSettings.class.getMethod("setAppCachePath", new Class[] { String.class });
      if (b.g()) {}
      for (String str = Environment.getExternalStorageDirectory().getAbsolutePath() + ExchangeConstants.WEB_CACHE_NAME;; str = this.m.getCacheDir().getAbsolutePath() + ExchangeConstants.WEB_CACHE_NAME)
      {
        File localFile = new File(str);
        if (!localFile.exists()) {
          localFile.mkdirs();
        }
        localMethod.invoke(paramWebSettings, new Object[] { str });
        WebSettings.class.getMethod("setAppCacheMaxSize", new Class[] { Long.TYPE }).invoke(paramWebSettings, new Object[] { Integer.valueOf(1048576) });
        return;
      }
      return;
    }
    catch (SecurityException paramWebSettings)
    {
      Log.b(c, "ClouldDialog DynamicSelectionSetting Error:" + paramWebSettings);
      return;
    }
    catch (IllegalArgumentException paramWebSettings)
    {
      throw paramWebSettings;
    }
    catch (IllegalAccessException paramWebSettings)
    {
      Log.b(c, "ClouldDialog DynamicSelectionSetting Error:" + paramWebSettings);
      return;
    }
    catch (InvocationTargetException paramWebSettings)
    {
      Log.b(c, "ClouldDialog DynamicSelectionSetting Error:" + paramWebSettings);
      return;
    }
    catch (NoSuchMethodException paramWebSettings) {}
  }
  
  private void b()
  {
    if (d == null) {
      return;
    }
    WapActivity.1 local1 = new WapActivity.1(this);
    d.requestDataAsyn(this.m, local1);
  }
  
  private void c()
  {
    this.q = c.a(this.m, "layout", "umeng_xp_clould_dialog");
    this.w = c.a(this.m, "id", "umeng_xp_loading_view");
    this.v = c.a(this.m, "id", "webView");
    this.r = c.a(this.m, "id", "umeng_xp_cancel");
    this.u = c.a(this.m, "id", "umeng_xp_reflesh");
    this.s = c.a(this.m, "id", "umeng_xp_pre");
    this.t = c.a(this.m, "id", "umeng_xp_next");
    this.B = c.a(this.m, "id", "umeng_xp_web_main");
    this.C = c.a(this.m, "id", "umeng_xp_loading_progress");
    this.D = c.a(this.m, "id", "umeng_xp_actionBar");
    this.x = c.a(this.m, "drawable", "umeng_xp_pre");
    this.y = c.a(this.m, "drawable", "umeng_xp_pre_no");
    this.z = c.a(this.m, "drawable", "umeng_xp_next");
    this.A = c.a(this.m, "drawable", "umeng_xp_next_no");
  }
  
  private void d()
  {
    setContentView(this.q);
    this.k = ((ViewGroup)findViewById(this.w));
    this.e = ((WebView)findViewById(this.v));
    this.j = ((ViewGroup)findViewById(this.B));
    this.l = ((ProgressBar)findViewById(this.C));
    this.j.setVisibility(0);
    this.n = findViewById(this.D);
    if (!this.p.a) {
      this.n.setVisibility(8);
    }
    if (this.p.a)
    {
      this.f = ((ImageView)findViewById(this.r));
      this.f.setOnClickListener(new WapActivity.2(this));
      this.i = ((ImageView)findViewById(this.u));
      this.i.setOnClickListener(new WapActivity.3(this));
      this.g = ((ImageView)findViewById(this.s));
      this.g.setOnClickListener(new WapActivity.4(this));
      this.h = ((ImageView)findViewById(this.t));
      this.h.setOnClickListener(new WapActivity.5(this));
    }
  }
  
  private void e()
  {
    this.e.setScrollBarStyle(0);
    WebSettings localWebSettings = this.e.getSettings();
    localWebSettings.setCacheMode(1);
    a(localWebSettings);
    localWebSettings.setJavaScriptEnabled(true);
    this.e.setWebChromeClient(new WapActivity.6(this));
    this.e.setWebViewClient(new WapActivity.7(this));
    this.e.setDownloadListener(new WapActivity.8(this));
  }
  
  protected void a()
  {
    if (this.e.canGoBack())
    {
      this.g.setImageResource(this.x);
      this.g.setClickable(true);
    }
    while (this.e.canGoForward())
    {
      this.h.setImageResource(this.z);
      this.h.setClickable(true);
      return;
      this.g.setImageResource(this.y);
      this.g.setClickable(false);
    }
    this.h.setImageResource(this.A);
    this.h.setClickable(false);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    this.p = ((h)getIntent().getParcelableExtra("configs"));
    if (!this.p.d) {
      setTheme(16973829);
    }
    super.onCreate(paramBundle);
    this.m = this;
    switch (this.p.e)
    {
    }
    for (;;)
    {
      if (ExchangeConstants.full_screen)
      {
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
      }
      c();
      setContentView(this.q);
      d();
      e();
      this.o = getIntent().getStringExtra("url_key");
      if (TextUtils.isEmpty(this.o)) {
        break;
      }
      this.e.loadUrl(this.o);
      return;
      setRequestedOrientation(0);
      continue;
      setRequestedOrientation(1);
    }
    b();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\common\WapActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */