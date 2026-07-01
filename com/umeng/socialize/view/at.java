package com.umeng.socialize.view;

import android.app.Dialog;
import android.content.Context;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.bean.SocializeConfig;
import com.umeng.socialize.bean.SocializeEntity;
import com.umeng.socialize.common.b.a;
import com.umeng.socialize.common.l;
import com.umeng.socialize.common.m;
import com.umeng.socialize.controller.RequestType;
import com.umeng.socialize.controller.UMServiceFactory;
import com.umeng.socialize.controller.UMSocialService;
import com.umeng.socialize.controller.listener.SocializeListeners.MulStatusListener;
import com.umeng.socialize.controller.listener.SocializeListeners.OauthCallbackListener;
import com.umeng.socialize.exception.SocializeException;
import com.umeng.socom.Log;
import com.umeng.socom.b.i;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class at
  extends Dialog
{
  private static final String a = at.class.getName();
  private WebView b;
  private SocializeListeners.OauthCallbackListener c;
  private View d;
  private View e;
  private CheckBox f;
  private int g = 0;
  private Bundle h;
  private UMSocialService i;
  private String j = "error";
  private Context k;
  private SHARE_MEDIA l;
  private Set<String> m;
  private SocializeListeners.MulStatusListener n;
  private Handler o;
  
  public at(Context paramContext, SocializeEntity paramSocializeEntity, SHARE_MEDIA paramSHARE_MEDIA, SocializeListeners.OauthCallbackListener paramOauthCallbackListener)
  {
    super(paramContext, com.umeng.socialize.common.b.a(paramContext, b.a.d, "umeng_socialize_popup_dialog"));
    this.k = paramContext;
    this.c = paramOauthCallbackListener;
    this.l = paramSHARE_MEDIA;
    this.o = new au(this);
    this.i = UMServiceFactory.getUMSocialService(paramSocializeEntity.descriptor, RequestType.SOCIAL);
    paramContext = this.i.getConfig();
    this.m = paramContext.getFollowFids(paramSHARE_MEDIA);
    this.n = paramContext.getOauthDialogFollowListener();
    label238:
    int i1;
    switch (b()[paramSHARE_MEDIA.ordinal()])
    {
    default: 
      this.d = ((LayoutInflater)this.k.getSystemService("layout_inflater")).inflate(com.umeng.socialize.common.b.a(this.k, b.a.a, "umeng_socialize_oauth_dialog"), null);
      paramContext = this.d.findViewById(com.umeng.socialize.common.b.a(this.k, b.a.b, "umeng_socialize_follow"));
      this.f = ((CheckBox)this.d.findViewById(com.umeng.socialize.common.b.a(this.k, b.a.b, "umeng_socialize_follow_check")));
      if ((this.m != null) && (this.m.size() > 0))
      {
        paramContext.setVisibility(0);
        this.e = this.d.findViewById(com.umeng.socialize.common.b.a(this.k, b.a.b, "progress_bar_parent"));
        this.e.setVisibility(0);
        ((Button)this.d.findViewById(com.umeng.socialize.common.b.a(this.k, b.a.b, "umeng_socialize_title_bar_leftBt"))).setOnClickListener(new av(this));
        this.d.findViewById(com.umeng.socialize.common.b.a(this.k, b.a.b, "umeng_socialize_title_bar_rightBt")).setVisibility(8);
        ((TextView)this.d.findViewById(com.umeng.socialize.common.b.a(this.k, b.a.b, "umeng_socialize_title_bar_middleTv"))).setText("授权" + l.a(paramSHARE_MEDIA));
        c();
        paramSocializeEntity = this.d.findViewById(com.umeng.socialize.common.b.a(this.k, b.a.b, "umeng_socialize_titlebar"));
        i.a(this.k);
        i1 = i.a(200.0F);
        paramContext = new aw(this, this.k, paramContext, paramSocializeEntity, i1);
        paramContext.addView(this.d, -1, -1);
        setContentView(paramContext);
        paramContext = getWindow().getAttributes();
        if (!m.d(this.k)) {
          break label574;
        }
        paramSocializeEntity = m.c(this.k);
        paramContext.width = paramSocializeEntity[0];
        paramContext.height = paramSocializeEntity[1];
      }
      break;
    }
    for (;;)
    {
      paramContext.gravity = 17;
      i1 = com.umeng.socialize.common.b.a(getContext(), b.a.d, "umeng_socialize_dialog_anim_fade");
      getWindow().getAttributes().windowAnimations = i1;
      return;
      this.j = "http://sns.whalecloud.com/sina2/main?uid";
      break;
      this.j = "http://sns.whalecloud.com/tenc2/main?uid";
      break;
      this.j = "http://sns.whalecloud.com/renr2/main?uid";
      break;
      this.j = "http://sns.whalecloud.com/douban/main?uid";
      break;
      this.j = "http://sns.whalecloud.com/qzone/main?uid";
      break;
      paramContext.setVisibility(8);
      break label238;
      label574:
      paramContext.height = -1;
      paramContext.width = -1;
    }
  }
  
  private String a(SocializeEntity paramSocializeEntity, SHARE_MEDIA paramSHARE_MEDIA)
  {
    Object localObject = com.umeng.socialize.c.b.b.a(this.k, paramSocializeEntity, 10);
    paramSHARE_MEDIA = new StringBuilder("via=" + paramSHARE_MEDIA + "&");
    Iterator localIterator = ((Map)localObject).keySet().iterator();
    for (;;)
    {
      if (!localIterator.hasNext())
      {
        if (paramSHARE_MEDIA.length() > 0) {
          paramSHARE_MEDIA.deleteCharAt(paramSHARE_MEDIA.length() - 1);
        }
        localObject = m.a(this.k);
        paramSocializeEntity = "http://log.umsns.com/share/auth/" + (String)localObject + "/" + paramSocializeEntity.entityKey + "/?" + paramSHARE_MEDIA.toString();
        Log.c(a, "oauth url : " + paramSocializeEntity);
        return paramSocializeEntity;
      }
      String str = (String)localIterator.next();
      paramSHARE_MEDIA.append(str + "=" + ((Map)localObject).get(str) + "&");
    }
  }
  
  private boolean c()
  {
    this.b = ((WebView)this.d.findViewById(com.umeng.socialize.common.b.a(this.k, b.a.b, "webView")));
    this.b.setVerticalScrollBarEnabled(false);
    this.b.setHorizontalScrollBarEnabled(false);
    this.b.setWebViewClient(d());
    this.b.setWebChromeClient(new az(this));
    this.b.getSettings().setJavaScriptEnabled(true);
    try
    {
      if (this.l == SHARE_MEDIA.RENREN)
      {
        CookieSyncManager.createInstance(this.k);
        CookieManager.getInstance().removeAllCookie();
      }
      return true;
    }
    catch (Exception localException) {}
    return true;
  }
  
  private WebViewClient d()
  {
    int i1 = 1;
    try
    {
      Method localMethod = WebViewClient.class.getMethod("onReceivedSslError", new Class[] { WebView.class, SslErrorHandler.class, SslError.class });
      if (localMethod == null) {
        break label67;
      }
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;)
      {
        i1 = 0;
      }
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;)
      {
        label67:
        i1 = 0;
      }
      Log.a(a, "has no method onReceivedSslError : ");
    }
    if (i1 != 0)
    {
      Log.a(a, "has method onReceivedSslError : ");
      return new ba(this);
    }
    return new at.a(this, null, null);
  }
  
  private void e()
  {
    String[] arrayOfString;
    Iterator localIterator;
    int i1;
    if ((this.m != null) && (this.m.size() > 0))
    {
      arrayOfString = new String[this.m.size()];
      localIterator = this.m.iterator();
      i1 = 0;
    }
    for (;;)
    {
      if (!localIterator.hasNext())
      {
        this.i.follow(this.k, this.l, this.n, arrayOfString);
        return;
      }
      arrayOfString[i1] = ((String)localIterator.next());
      i1 += 1;
    }
  }
  
  public void dismiss()
  {
    if (this.h != null) {
      if (TextUtils.isEmpty(this.h.getString("uid"))) {
        if (this.c != null) {
          this.c.onError(new SocializeException("unfetch usid..."), this.l);
        }
      }
    }
    for (;;)
    {
      super.dismiss();
      return;
      if (this.c != null)
      {
        this.c.onComplete(this.h, this.l);
        if ((this.f != null) && (this.f.isChecked()))
        {
          this.o.sendEmptyMessage(2);
          continue;
          if (this.c != null) {
            this.c.onError(new SocializeException("interrupt oauth"), this.l);
          }
        }
      }
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public void show()
  {
    super.show();
    this.h = null;
    Object localObject = this.i.getEntity();
    if (((SocializeEntity)localObject).initialized)
    {
      localObject = a((SocializeEntity)localObject, this.l);
      this.b.loadUrl((String)localObject);
      return;
    }
    this.i.initEntity(this.k, new bb(this));
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */