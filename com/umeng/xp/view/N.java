package com.umeng.xp.view;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.umeng.common.Log;
import com.umeng.common.b;
import com.umeng.common.b.i;
import com.umeng.common.c;
import com.umeng.xp.a.e;
import com.umeng.xp.common.ExchangeConstants;
import com.umeng.xp.common.g;
import com.umeng.xp.controller.ExchangeDataService;
import com.umeng.xp.controller.XpListenersCenter.FloatDialogListener;
import org.json.JSONException;
import org.json.JSONObject;

public class N
  extends Dialog
{
  private static final String a = N.class.getName();
  private static N b = null;
  private Context c;
  private FloatDialogConfig d;
  private WebView e;
  private c f;
  private boolean g = false;
  private Boolean h = Boolean.valueOf(false);
  
  private N(Context paramContext, int paramInt, FloatDialogConfig paramFloatDialogConfig, String paramString)
  {
    super(paramContext, paramInt);
    this.c = paramContext;
    if (paramFloatDialogConfig != null) {}
    for (FloatDialogConfig localFloatDialogConfig = paramFloatDialogConfig;; localFloatDialogConfig = new FloatDialogConfig())
    {
      this.d = localFloatDialogConfig;
      Log.c(a, "FloatDialogConfig is " + paramFloatDialogConfig.toString());
      this.f = c.a(this.c);
      paramFloatDialogConfig = getWindow().getAttributes();
      paramFloatDialogConfig.height = -1;
      paramFloatDialogConfig.width = -1;
      paramFloatDialogConfig.gravity = 17;
      paramFloatDialogConfig.windowAnimations = this.f.e("umeng_xp_dialog_animations");
      getWindow().setAttributes(paramFloatDialogConfig);
      a(paramContext);
      b();
      paramContext = paramString + System.currentTimeMillis();
      this.e.loadUrl(paramContext);
      return;
    }
  }
  
  private void a(Context paramContext)
  {
    RelativeLayout localRelativeLayout = new RelativeLayout(this.c);
    localRelativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    paramContext = ((LayoutInflater)paramContext.getSystemService("layout_inflater")).inflate(this.f.d("umeng_xp_floatdialog_content"), null);
    ViewGroup.LayoutParams localLayoutParams = new ViewGroup.LayoutParams(-1, -1);
    paramContext.setLayoutParams(localLayoutParams);
    localRelativeLayout.addView(paramContext, localLayoutParams);
    this.e = ((WebView)paramContext.findViewById(this.f.b("webView")));
    paramContext.findViewById(this.f.b("umeng_xp_float_dialog_close")).setOnClickListener(new Q(this));
    paramContext.invalidate();
    setContentView(localRelativeLayout);
  }
  
  public static void a(Context paramContext, ExchangeDataService paramExchangeDataService, FloatDialogConfig paramFloatDialogConfig)
  {
    String str = g.a(paramContext, paramExchangeDataService.slot_id) + "&_random=";
    if ((b.a(paramContext, "android.permission.ACCESS_NETWORK_STATE")) && (!b.m(paramContext)))
    {
      Toast.makeText(paramContext, paramContext.getResources().getString(e.f(paramContext)), 1).show();
      return;
    }
    if ((b != null) && (b.isShowing())) {}
    try
    {
      b.dismiss();
      f1 = Float.parseFloat(paramExchangeDataService.opensize);
      if (f1 >= 1.0F) {
        if (ExchangeConstants.full_screen)
        {
          i = 16973841;
          b = new N(paramContext, i, paramFloatDialogConfig, str);
          paramExchangeDataService = new DisplayMetrics();
          ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay().getMetrics(paramExchangeDataService);
          new i(paramContext);
          i1 = paramExchangeDataService.heightPixels;
          n = paramExchangeDataService.widthPixels;
          k = -1;
          m = -1;
          i2 = paramContext.getResources().getConfiguration().orientation;
          if ((1.0F <= f1) || (0.8F > f1)) {
            break label340;
          }
          if (i2 != 1) {
            break label314;
          }
          j = (int)(i1 * 0.8F);
          i = n - i.a(7.0F) * 2;
          if ((paramFloatDialogConfig == null) || (!paramFloatDialogConfig.isDelay()))
          {
            b.show();
            Log.c(a, "show dialog on create...");
          }
          b.getWindow().setLayout(i, j);
          return;
        }
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        float f1;
        int i1;
        int n;
        int k;
        int m;
        int i2;
        Log.c(ExchangeConstants.LOG_TAG, "Reset list dialog...", localException);
        continue;
        int i = 16973840;
        continue;
        i = c.a(paramContext).e("umeng_xp_dialog_download_window");
        continue;
        label314:
        int j = i1 - i.a(10.0F) * 2;
        i = (int)(n * 0.8F);
        continue;
        label340:
        i = m;
        j = k;
        if (0.8F > f1)
        {
          i = m;
          j = k;
          if (0.6F <= f1) {
            if (i2 == 1)
            {
              j = (int)(i1 * 0.6F);
              i = n - i.a(7.0F) * 2;
            }
            else
            {
              j = i1 - i.a(10.0F) * 2;
              i = (int)(n * 0.6F);
            }
          }
        }
      }
    }
  }
  
  private void b()
  {
    this.e.setScrollBarStyle(0);
    WebSettings localWebSettings = this.e.getSettings();
    localWebSettings.setCacheMode(1);
    localWebSettings.setJavaScriptEnabled(true);
    localWebSettings.setSupportZoom(false);
    localWebSettings.setUseWideViewPort(true);
    this.e.setInitialScale(1);
    this.e.setWebChromeClient(new O(this));
    this.e.setWebViewClient(new P(this));
  }
  
  private JSONObject c()
  {
    JSONObject localJSONObject = new JSONObject();
    String str = b.f(this.c);
    if (!TextUtils.isEmpty(str)) {
      localJSONObject.put("device_id", str);
    }
    str = b.q(this.c);
    if (!TextUtils.isEmpty(str)) {
      localJSONObject.put("mac", str);
    }
    return localJSONObject;
  }
  
  protected void a(WebView paramWebView)
  {
    Object localObject = null;
    try
    {
      JSONObject localJSONObject = c();
      localObject = localJSONObject;
    }
    catch (JSONException localJSONException)
    {
      for (;;) {}
    }
    Log.c(a, "send device info " + ((JSONObject)localObject).toString());
    paramWebView.loadUrl("javascript:uGap.setDeviceInfo(" + localObject + ")");
  }
  
  public void dismiss()
  {
    super.dismiss();
    if (this.d.getListener() != null) {
      this.d.getListener().onClose();
    }
    b = null;
  }
  
  public void show()
  {
    boolean bool = this.d.isTimeout();
    if (this.d.getListener() != null) {
      this.d.getListener().onShow(bool);
    }
    if (!bool)
    {
      super.show();
      return;
    }
    Log.e(a, "FloatDialog timeout unshow.");
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\view\N.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */