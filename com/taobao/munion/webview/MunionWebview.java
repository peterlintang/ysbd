package com.taobao.munion.webview;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.webkit.WebSettings;
import android.webkit.WebSettings.RenderPriority;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.io.File;

public class MunionWebview
  extends WebView
{
  Context a;
  protected WebViewClient b;
  
  public MunionWebview(Context paramContext)
  {
    super(paramContext);
    this.a = paramContext;
    a();
  }
  
  public MunionWebview(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.a = paramContext;
    a();
  }
  
  public MunionWebview(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.a = paramContext;
    a();
  }
  
  private void a()
  {
    setVerticalScrollBarEnabled(false);
    requestFocus();
    WebSettings localWebSettings = getSettings();
    localWebSettings.setAllowFileAccess(true);
    localWebSettings.setJavaScriptEnabled(true);
    localWebSettings.setRenderPriority(WebSettings.RenderPriority.HIGH);
    if (Build.VERSION.SDK_INT >= 5)
    {
      localWebSettings.setDatabaseEnabled(true);
      String str = this.a.getDir("database", 0).getPath();
      localWebSettings.setDatabasePath(str);
      localWebSettings.setGeolocationEnabled(true);
      localWebSettings.setGeolocationDatabasePath(str);
    }
    setDownloadListener(new MunionWebview.1(this));
  }
  
  public void a(b paramb)
  {
    if (this.b == null)
    {
      this.b = new a();
      setWebViewClient(this.b);
    }
    ((a)this.b).seUrlFilter(paramb);
  }
  
  public void setWebViewClient(WebViewClient paramWebViewClient)
  {
    this.b = paramWebViewClient;
    super.setWebViewClient(paramWebViewClient);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\webview\MunionWebview.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */