package com.umeng.analytics;

import android.graphics.Bitmap;
import android.os.Message;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

final class MobclickAgentJSInterface$a
  extends WebChromeClient
{
  WebChromeClient a = null;
  private final String c = "ekv";
  private final String d = "event";
  
  public MobclickAgentJSInterface$a(MobclickAgentJSInterface paramMobclickAgentJSInterface, WebChromeClient paramWebChromeClient)
  {
    if (paramWebChromeClient == null)
    {
      this.a = new WebChromeClient();
      return;
    }
    this.a = paramWebChromeClient;
  }
  
  public final void onCloseWindow(WebView paramWebView)
  {
    this.a.onCloseWindow(paramWebView);
  }
  
  public final boolean onCreateWindow(WebView paramWebView, boolean paramBoolean1, boolean paramBoolean2, Message paramMessage)
  {
    return this.a.onCreateWindow(paramWebView, paramBoolean1, paramBoolean2, paramMessage);
  }
  
  public final boolean onJsAlert(WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult)
  {
    return this.a.onJsAlert(paramWebView, paramString1, paramString2, paramJsResult);
  }
  
  public final boolean onJsBeforeUnload(WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult)
  {
    return this.a.onJsBeforeUnload(paramWebView, paramString1, paramString2, paramJsResult);
  }
  
  public final boolean onJsConfirm(WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult)
  {
    return this.a.onJsConfirm(paramWebView, paramString1, paramString2, paramJsResult);
  }
  
  public final boolean onJsPrompt(WebView paramWebView, String paramString1, String paramString2, String paramString3, JsPromptResult paramJsPromptResult)
  {
    int i;
    if ("ekv".equals(paramString2)) {
      try
      {
        paramWebView = new JSONObject(paramString3);
        paramString1 = new HashMap();
        paramString2 = (String)paramWebView.remove("id");
        if (paramWebView.isNull("duration"))
        {
          i = 0;
          paramString3 = paramWebView.keys();
          while (paramString3.hasNext())
          {
            String str = (String)paramString3.next();
            paramString1.put(str, paramWebView.getString(str));
            continue;
            paramJsPromptResult.confirm();
          }
        }
      }
      catch (Exception paramWebView)
      {
        paramWebView.printStackTrace();
      }
    }
    for (;;)
    {
      return true;
      i = ((Integer)paramWebView.remove("duration")).intValue();
      break;
      MobclickAgent.a().a(MobclickAgentJSInterface.a(this.b), paramString2, paramString1, i);
      continue;
      if (!"event".equals(paramString2)) {
        break label202;
      }
      try
      {
        paramWebView = new JSONObject(paramString3);
        MobclickAgent.a().a(MobclickAgentJSInterface.a(this.b), paramWebView.getString("tag"), paramWebView.optString("label"), paramWebView.optInt("duration"), 1);
      }
      catch (Exception paramWebView) {}
    }
    label202:
    return this.a.onJsPrompt(paramWebView, paramString1, paramString2, paramString3, paramJsPromptResult);
  }
  
  public final void onProgressChanged(WebView paramWebView, int paramInt)
  {
    this.a.onProgressChanged(paramWebView, paramInt);
  }
  
  public final void onReceivedIcon(WebView paramWebView, Bitmap paramBitmap)
  {
    this.a.onReceivedIcon(paramWebView, paramBitmap);
  }
  
  public final void onReceivedTitle(WebView paramWebView, String paramString)
  {
    this.a.onReceivedTitle(paramWebView, paramString);
  }
  
  public final void onRequestFocus(WebView paramWebView)
  {
    this.a.onRequestFocus(paramWebView);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\analytics\MobclickAgentJSInterface$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */