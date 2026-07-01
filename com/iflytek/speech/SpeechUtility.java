package com.iflytek.speech;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class SpeechUtility
{
  private static final String APP_ID = "app.appid";
  private static final String APP_NAME = "app.name";
  private static final String APP_PKG = "app.pkg";
  private static final String APP_VER_CODE = "app.ver.code";
  private static final String APP_VER_NAME = "app.ver.name";
  public static final String KEY_CHANNEL_ID = "channel.id";
  public static final String KEY_CHANNEL_NAME = "channel.name";
  public static final String KEY_REQUEST_PACKAGE = "request.package";
  private static final String SDK_CHANNEL_ID = "sdk.channel.id";
  private static final String SDK_VER_CODE = "sdk.ver.code";
  private static String mAppId = null;
  private static String mDefaultComponent = "com.iflytek.speechcloud";
  private static SpeechUtility mInstance = null;
  private HashMap<String, String> callerHashMap = new HashMap();
  private ArrayList<SpeechComponent> mAllComponents = new ArrayList();
  private Context mContext = null;
  private int mVersionCode = -1;
  
  private SpeechUtility(Context paramContext)
  {
    this.mContext = paramContext;
    initComponentInfo();
  }
  
  private void appendHttpParam(StringBuffer paramStringBuffer, String paramString1, String paramString2)
  {
    if ((paramStringBuffer != null) && (paramString1 != null) && (paramString2 != null) && (paramString2.length() > 0))
    {
      paramStringBuffer.append('&');
      paramStringBuffer.append(paramString1);
      paramStringBuffer.append('=');
      paramStringBuffer.append(paramString2);
    }
  }
  
  private SpeechComponent getComponentByPackage(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return null;
    }
    Iterator localIterator = this.mAllComponents.iterator();
    while (localIterator.hasNext())
    {
      SpeechComponent localSpeechComponent = (SpeechComponent)localIterator.next();
      if (localSpeechComponent.getPackageName().contains(paramString)) {
        return localSpeechComponent;
      }
    }
    return null;
  }
  
  private void getComponentInfo(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
    {
      label7:
      return;
    }
    else
    {
      do
      {
        paramString = this.mContext.getPackageManager().queryIntentServices(new Intent(paramString), 224);
      } while ((paramString == null) || (paramString.size() <= 0));
      paramString = paramString.iterator();
    }
    for (;;)
    {
      if (!paramString.hasNext()) {
        break label7;
      }
      Object localObject = (ResolveInfo)paramString.next();
      SpeechComponent localSpeechComponent = putSpeechComponent(((ResolveInfo)localObject).serviceInfo.packageName);
      if (localSpeechComponent == null) {
        break;
      }
      try
      {
        localObject = ((ResolveInfo)localObject).serviceInfo.metaData.getString("enginetype").split(",");
        int j = localObject.length;
        int i = 0;
        while (i < j)
        {
          localSpeechComponent.addEngine(localObject[i]);
          i += 1;
        }
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
      }
    }
  }
  
  public static SpeechUtility getUtility(Context paramContext)
  {
    if (mInstance == null) {
      mInstance = new SpeechUtility(paramContext);
    }
    return mInstance;
  }
  
  private void initComponentInfo()
  {
    getComponentInfo("com.iflytek.component.speechrecognizer");
    getComponentInfo("com.iflytek.component.speechsynthesizer");
    getComponentInfo("com.iflytek.component.speechunderstander");
    getComponentInfo("com.iflytek.component.textunderstander");
  }
  
  public static boolean isServiceInstalled(Context paramContext, String paramString)
  {
    if ((paramContext == null) || (TextUtils.isEmpty(paramString))) {}
    while (paramContext.getPackageManager().resolveService(new Intent(paramString), 0) == null) {
      return false;
    }
    return true;
  }
  
  private SpeechComponent putSpeechComponent(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return null;
    }
    Iterator localIterator = this.mAllComponents.iterator();
    do
    {
      if (!localIterator.hasNext()) {
        break;
      }
    } while (!paramString.equals(((SpeechComponent)localIterator.next()).getPackageName()));
    for (int i = 1;; i = 0)
    {
      if (i == 0)
      {
        paramString = new SpeechComponent(paramString);
        this.mAllComponents.add(paramString);
      }
      for (;;)
      {
        return paramString;
        paramString = null;
      }
    }
  }
  
  public String getAppid()
  {
    return mAppId;
  }
  
  String getCallerInfo(Context paramContext, String paramString)
  {
    if (this.callerHashMap.containsKey(paramString)) {
      return (String)this.callerHashMap.get(paramString);
    }
    try
    {
      Object localObject = paramContext.getPackageName();
      PackageInfo localPackageInfo = paramContext.getPackageManager().getPackageInfo((String)localObject, 0);
      localObject = paramContext.getPackageManager().getApplicationInfo((String)localObject, 0);
      this.callerHashMap.put("caller.name", ((ApplicationInfo)localObject).loadLabel(paramContext.getPackageManager()).toString());
      this.callerHashMap.put("caller.pkg", ((ApplicationInfo)localObject).packageName);
      this.callerHashMap.put("caller.ver.name", localPackageInfo.versionName);
      this.callerHashMap.put("caller.ver.code", String.valueOf(localPackageInfo.versionCode));
      return (String)this.callerHashMap.get(paramString);
    }
    catch (Exception paramContext)
    {
      for (;;)
      {
        paramContext.printStackTrace();
      }
    }
  }
  
  public String getComponentUrl()
  {
    String str1 = getAppid();
    String str2 = getCallerInfo(this.mContext, "caller.name");
    String str3 = getCallerInfo(this.mContext, "caller.pkg");
    String str4 = getCallerInfo(this.mContext, "caller.ver.name");
    String str5 = getCallerInfo(this.mContext, "caller.ver.code");
    StringBuffer localStringBuffer = new StringBuffer("http://open.voicecloud.cn/s?");
    localStringBuffer.append("channel.id");
    localStringBuffer.append('=');
    localStringBuffer.append("16010000");
    appendHttpParam(localStringBuffer, "channel.name", "dev.voicecloud");
    appendHttpParam(localStringBuffer, "request.package", "com.iflytek.speechcloud");
    appendHttpParam(localStringBuffer, "sdk.ver.code", Version.getVersionName());
    appendHttpParam(localStringBuffer, "app.name", str2);
    appendHttpParam(localStringBuffer, "app.pkg", str3);
    appendHttpParam(localStringBuffer, "app.ver.name", str4);
    appendHttpParam(localStringBuffer, "app.ver.code", str5);
    appendHttpParam(localStringBuffer, "app.appid", str1);
    return localStringBuffer.toString();
  }
  
  public String getPackage(String paramString)
  {
    Object localObject = getComponentByPackage(mDefaultComponent);
    if ((localObject != null) && (((SpeechComponent)localObject).isEngineAvaible(paramString))) {
      return ((SpeechComponent)localObject).getPackageName();
    }
    localObject = this.mAllComponents.iterator();
    while (((Iterator)localObject).hasNext())
    {
      SpeechComponent localSpeechComponent = (SpeechComponent)((Iterator)localObject).next();
      if (localSpeechComponent.isEngineAvaible(paramString)) {
        return localSpeechComponent.getPackageName();
      }
    }
    return null;
  }
  
  public int getVersionCode()
  {
    List localList;
    int i;
    if (this.mVersionCode < 0)
    {
      localList = this.mContext.getPackageManager().getInstalledPackages(0);
      i = 0;
    }
    for (;;)
    {
      if (i < localList.size())
      {
        PackageInfo localPackageInfo = (PackageInfo)localList.get(i);
        if (localPackageInfo.packageName.equals("com.iflytek.speechcloud")) {
          this.mVersionCode = localPackageInfo.versionCode;
        }
      }
      else
      {
        return this.mVersionCode;
      }
      i += 1;
    }
  }
  
  public int notifyEngineDownload(String[] paramArrayOfString)
  {
    return 21002;
  }
  
  public String[] queryAvailableEngines()
  {
    this.mAllComponents.clear();
    initComponentInfo();
    ArrayList localArrayList = new ArrayList();
    Object localObject = this.mAllComponents.iterator();
    while (((Iterator)localObject).hasNext()) {
      localArrayList.addAll(((SpeechComponent)((Iterator)localObject).next()).getEngines());
    }
    localObject = new String[localArrayList.size()];
    int i = 0;
    while (i < localArrayList.size())
    {
      localObject[i] = ((String)localArrayList.get(i));
      i += 1;
    }
    return (String[])localObject;
  }
  
  public void requestComponentUrl(ISpeechModule paramISpeechModule, SpeechUtility.RequestComponentUrlListener paramRequestComponentUrlListener)
  {
    if (paramISpeechModule == null) {}
    while (paramRequestComponentUrlListener == null) {
      return;
    }
    paramRequestComponentUrlListener.onResult(getComponentUrl(), 0);
  }
  
  public void setAppid(String paramString)
  {
    mAppId = paramString;
  }
  
  public void setDefaultComponent(String paramString)
  {
    mDefaultComponent = paramString;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\iflytek\speech\SpeechUtility.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */