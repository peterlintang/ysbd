package com.iflytek.speech;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

abstract class SpeechModule<I extends IInterface>
  implements ISpeechModule
{
  private String mBindAction = null;
  private ServiceConnection mConnection = null;
  protected Context mContext = null;
  private String mEngine = null;
  private InitListener mInitListener = null;
  private HashMap<String, String> mParams = new HashMap();
  protected I mService;
  protected Object mSynLock = new Object();
  
  public SpeechModule(Context paramContext, InitListener paramInitListener, String paramString1, String paramString2)
  {
    this.mContext = paramContext;
    this.mInitListener = paramInitListener;
    this.mBindAction = paramString1;
    this.mEngine = paramString2;
    bindService();
  }
  
  private void bindService()
  {
    if (!SpeechUtility.isServiceInstalled(this.mContext, this.mBindAction))
    {
      if (this.mInitListener != null) {
        this.mInitListener.onInit(this, 21001);
      }
      return;
    }
    Intent localIntent = getIntent();
    localIntent.setAction(this.mBindAction);
    String str = SpeechUtility.getUtility(this.mContext).getPackage(this.mEngine);
    if (!TextUtils.isEmpty(str)) {
      localIntent.setPackage(str);
    }
    this.mConnection = new SpeechModule.1(this);
    this.mContext.bindService(localIntent, this.mConnection, 1);
  }
  
  private I getService(IBinder paramIBinder)
  {
    try
    {
      String str = ((Class)((java.lang.reflect.ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0]).getName();
      getTag();
      new StringBuilder("className = ").append(str).toString();
      paramIBinder = (IInterface)Class.forName(str + "$Stub").getDeclaredMethod("asInterface", new Class[] { IBinder.class }).invoke(null, new Object[] { paramIBinder });
      return paramIBinder;
    }
    catch (ClassNotFoundException paramIBinder)
    {
      paramIBinder.printStackTrace();
      return null;
    }
    catch (SecurityException paramIBinder)
    {
      for (;;)
      {
        paramIBinder.printStackTrace();
      }
    }
    catch (NoSuchMethodException paramIBinder)
    {
      for (;;)
      {
        paramIBinder.printStackTrace();
      }
    }
    catch (IllegalArgumentException paramIBinder)
    {
      for (;;)
      {
        paramIBinder.printStackTrace();
      }
    }
    catch (IllegalAccessException paramIBinder)
    {
      for (;;)
      {
        paramIBinder.printStackTrace();
      }
    }
    catch (InvocationTargetException paramIBinder)
    {
      for (;;)
      {
        paramIBinder.printStackTrace();
      }
    }
    catch (Exception paramIBinder)
    {
      for (;;)
      {
        paramIBinder.printStackTrace();
      }
    }
  }
  
  public boolean destory()
  {
    try
    {
      if (this.mConnection != null)
      {
        this.mContext.unbindService(this.mConnection);
        this.mConnection = null;
      }
      return true;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      localIllegalArgumentException.printStackTrace();
    }
    return false;
  }
  
  public Intent getIntent()
  {
    Intent localIntent = new Intent();
    if (!this.mParams.isEmpty())
    {
      localObject = this.mParams.keySet().iterator();
      while (((Iterator)localObject).hasNext())
      {
        String str = (String)((Iterator)localObject).next();
        localIntent.putExtra(str, (String)this.mParams.get(str));
      }
    }
    Object localObject = SpeechUtility.getUtility(this.mContext);
    localIntent.putExtra("caller.appid", ((SpeechUtility)localObject).getAppid());
    localIntent.putExtra("caller.name", ((SpeechUtility)localObject).getCallerInfo(this.mContext, "caller.name"));
    localIntent.putExtra("caller.pkg", ((SpeechUtility)localObject).getCallerInfo(this.mContext, "caller.pkg"));
    localIntent.putExtra("caller.ver.name", ((SpeechUtility)localObject).getCallerInfo(this.mContext, "caller.ver.name"));
    localIntent.putExtra("caller.ver.code", ((SpeechUtility)localObject).getCallerInfo(this.mContext, "caller.ver.code"));
    return localIntent;
  }
  
  public String getParameter(String paramString)
  {
    return (String)this.mParams.get(paramString);
  }
  
  protected final String getTag()
  {
    return getClass().toString();
  }
  
  public int setParameter(String paramString1, String paramString2)
  {
    if (TextUtils.isEmpty(paramString1)) {
      return 20012;
    }
    if (TextUtils.isEmpty(paramString2))
    {
      this.mParams.remove(paramString1);
      return 0;
    }
    this.mParams.put(paramString1, paramString2);
    return 0;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\iflytek\speech\SpeechModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */