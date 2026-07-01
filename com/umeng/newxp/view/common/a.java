package com.umeng.newxp.view.common;

import android.app.Dialog;
import android.content.Context;
import android.os.Build.VERSION;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebSettings.LayoutAlgorithm;
import android.webkit.WebSettings.PluginState;
import android.webkit.WebView;
import com.umeng.common.ufp.Log;
import com.umeng.newxp.common.ExchangeConstants;
import java.lang.reflect.Method;

public abstract class a
  extends Dialog
{
  public Context a;
  public WebView b;
  
  public a(Context paramContext) {}
  
  public a(Context paramContext, int paramInt)
  {
    super(paramContext, paramInt);
    this.a = paramContext;
    paramContext = getWindow().getAttributes();
    paramContext.height = -1;
    paramContext.width = -1;
    paramContext.gravity = 17;
    getWindow().setAttributes(paramContext);
  }
  
  public abstract void a();
  
  public void a(WebView paramWebView)
  {
    paramWebView = paramWebView.getSettings();
    paramWebView.setJavaScriptEnabled(true);
    if (Build.VERSION.SDK_INT < 8) {
      paramWebView.setPluginsEnabled(true);
    }
    for (;;)
    {
      paramWebView.setSupportZoom(true);
      paramWebView.setBuiltInZoomControls(true);
      paramWebView.setAllowFileAccess(true);
      paramWebView.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
      paramWebView.setUseWideViewPort(true);
      if (Build.VERSION.SDK_INT >= 8)
      {
        paramWebView.setLoadWithOverviewMode(true);
        paramWebView.setDatabaseEnabled(true);
        paramWebView.setDomStorageEnabled(true);
        paramWebView.setGeolocationEnabled(true);
        paramWebView.setAppCacheEnabled(true);
      }
      if (Build.VERSION.SDK_INT >= 11) {}
      try
      {
        Method localMethod = WebSettings.class.getDeclaredMethod("setDisplayZoomControls", new Class[] { Boolean.TYPE });
        localMethod.setAccessible(true);
        localMethod.invoke(paramWebView, new Object[] { Boolean.valueOf(false) });
        return;
      }
      catch (Exception paramWebView)
      {
        Log.e(ExchangeConstants.LOG_TAG, "", paramWebView);
      }
      paramWebView.setPluginState(WebSettings.PluginState.ON);
    }
  }
  
  public abstract void b();
  
  public void show()
  {
    super.show();
    b();
    if (this.b == null) {
      throw new NullPointerException("the webview is null.");
    }
    a(this.b);
    a();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\common\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */