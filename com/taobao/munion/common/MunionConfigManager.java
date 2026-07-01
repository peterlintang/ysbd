package com.taobao.munion.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.taobao.munion.requests.j;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import org.json.JSONObject;

public class MunionConfigManager
{
  private static MunionConfigManager sInstance;
  public static String sSecret;
  public static String sTtid;
  private MunionConfigManager.AppEnvironment env = MunionConfigManager.AppEnvironment.PRODUCT;
  private IEnvVariableBox envVariableBox;
  private Context mAppContext;
  private String mItemIds;
  
  public static MunionConfigManager getInstance()
  {
    if (sInstance == null) {
      sInstance = new MunionConfigManager();
    }
    return sInstance;
  }
  
  public void InitParams()
  {
    Object localObject = new j().e();
    if ((localObject != null) && (((com.taobao.munion.net.l)localObject).a()))
    {
      localObject = ((com.taobao.munion.net.l)localObject).a("result");
      if (localObject != null)
      {
        SharedPreferences.Editor localEditor = this.mAppContext.getSharedPreferences("prefs", 0).edit();
        sSecret = ((JSONObject)localObject).optString("secret");
        sTtid = ((JSONObject)localObject).optString("ttid");
        localEditor.putString("secret", sSecret);
        localEditor.putString("ttid", sTtid);
        localEditor.commit();
        com.taobao.munion.utils.k.a("ttid = " + sTtid);
      }
    }
  }
  
  public void checkInitStatus()
  {
    String str1 = getSecretKey();
    String str2 = getTtid();
    if ((com.taobao.munion.utils.l.b(str1)) || (com.taobao.munion.utils.l.b(str2))) {
      InitParams();
    }
    while ((!com.taobao.munion.utils.l.b(sSecret)) && (!com.taobao.munion.utils.l.b(sTtid))) {
      return;
    }
    sSecret = str1;
    sTtid = str2;
  }
  
  public void clearUserInfo()
  {
    SharedPreferences.Editor localEditor = this.mAppContext.getSharedPreferences("prefs", 0).edit();
    localEditor.clear();
    localEditor.putString("nick", "");
    localEditor.commit();
  }
  
  public void destroy()
  {
    this.mAppContext = null;
  }
  
  public String getAppKey()
  {
    return this.envVariableBox.getAppKey();
  }
  
  public Context getContext()
  {
    return this.mAppContext;
  }
  
  public String getHost()
  {
    return this.envVariableBox.getHost();
  }
  
  public String getSecretKey()
  {
    return this.mAppContext.getSharedPreferences("prefs", 0).getString("secret", null);
  }
  
  public String getTopHost()
  {
    return this.envVariableBox.getTopHost();
  }
  
  public String getTopOauthHost()
  {
    return this.envVariableBox.getTopOauthHost();
  }
  
  public String getTopOauthRedirectUrl()
  {
    return this.envVariableBox.getTopOauthRedirectUrl();
  }
  
  public String getTtid()
  {
    return this.mAppContext.getSharedPreferences("prefs", 0).getString("ttid", null);
  }
  
  public String getUserAvatar()
  {
    return com.taobao.munion.utils.l.a(this.mAppContext.getSharedPreferences("prefs", 0).getString("avatar", null));
  }
  
  public String getUserName()
  {
    return com.taobao.munion.utils.l.a(this.mAppContext.getSharedPreferences("prefs", 0).getString("nick", null));
  }
  
  public String getmItemIds()
  {
    return this.mItemIds;
  }
  
  public void init(Context paramContext)
  {
    switch (MunionConfigManager.2.$SwitchMap$com$taobao$munion$common$MunionConfigManager$AppEnvironment[this.env.ordinal()])
    {
    }
    for (;;)
    {
      this.mAppContext = paramContext;
      new Thread(new MunionConfigManager.1(this)).start();
      return;
      this.envVariableBox = new TestEnvVariableBox();
      continue;
      this.envVariableBox = new ProductEnvVariableBox();
    }
  }
  
  public void setContext(Context paramContext)
  {
    this.mAppContext = paramContext;
  }
  
  public void setItemIds(String paramString)
  {
    this.mItemIds = paramString;
  }
  
  public void setUserInfo(String paramString1, String paramString2)
  {
    try
    {
      localObject = URLDecoder.decode(paramString1, "UTF-8");
      paramString1 = (String)localObject;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      for (;;)
      {
        Object localObject;
        localUnsupportedEncodingException.printStackTrace();
      }
    }
    localObject = this.mAppContext.getSharedPreferences("prefs", 0).edit();
    ((SharedPreferences.Editor)localObject).putString("nick", paramString1);
    ((SharedPreferences.Editor)localObject).putString("avatar", paramString2);
    ((SharedPreferences.Editor)localObject).commit();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\common\MunionConfigManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */