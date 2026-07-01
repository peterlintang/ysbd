package com.taobao.munion.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import com.taobao.munion.utils.p;
import java.io.File;
import java.io.FileOutputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class f
  implements Handler.Callback
{
  public static final int a = 1;
  public static final int b = 2;
  public static final int c = 3;
  static int f = 5000;
  static int g = 11000;
  private static f o = null;
  Context d;
  p e = new p(Looper.getMainLooper(), this);
  int h = f;
  int i = f;
  int j = 3000;
  int k = g;
  int l = 30000;
  g m = new g();
  g n = new g();
  private boolean p = false;
  private BroadcastReceiver q = new f.1(this);
  
  private f()
  {
    this.n.a(1);
  }
  
  public static f a()
  {
    if (o == null) {
      o = new f();
    }
    return o;
  }
  
  public static void a(c paramc)
  {
    b.a(paramc);
  }
  
  public d a(m paramm, i parami, e parame)
  {
    e locale = parame;
    if (parame == null) {
      locale = new e();
    }
    parame = new b(paramm.c(), locale);
    parame.a(new f.c(this, parami, paramm, locale));
    return new d(this.m.a(parame, locale), parame);
  }
  
  public d a(String paramString, i parami)
  {
    return a(paramString, parami, null);
  }
  
  public d a(String paramString, i parami, e parame)
  {
    e locale = parame;
    if (parame == null) {
      locale = new e();
    }
    paramString = new b(paramString, locale);
    paramString.a(parami);
    return new d(this.m.a(paramString, locale), paramString);
  }
  
  public d a(String paramString1, i parami, String paramString2)
  {
    e locale = new e();
    locale.a(3);
    paramString2 = new File(paramString2);
    locale.p = paramString2.length();
    locale.r = 524288000;
    locale.q = new FileOutputStream(paramString2, true);
    locale.s = 20;
    return a(paramString1, new f.b(this, parami, locale.q), locale);
  }
  
  public h a(String paramString)
  {
    return a(paramString, null);
  }
  
  public h a(String paramString, e parame)
  {
    paramString = new b(paramString, parame);
    e locale = paramString.c();
    switch (locale.f())
    {
    default: 
      if (locale.f() != 1) {
        paramString = this.m.a(paramString, parame);
      }
      break;
    case 3: 
    case 2: 
    case 1: 
      try
      {
        paramString = (h)paramString.get();
        return paramString;
      }
      catch (InterruptedException paramString)
      {
        paramString.printStackTrace();
        return new h(64536, paramString.getMessage(), null);
      }
      catch (ExecutionException paramString)
      {
        paramString.printStackTrace();
        return new h(64536, paramString.getMessage(), null);
      }
      paramString = this.n.a(paramString, parame);
      if (paramString == null) {
        return new h(63536, "mSingleRequestQueue return null", null);
      }
      try
      {
        paramString = (h)paramString.get();
        return paramString;
      }
      catch (InterruptedException paramString)
      {
        paramString.printStackTrace();
        return new h(64536, paramString.getMessage(), null);
      }
      catch (ExecutionException paramString)
      {
        paramString.printStackTrace();
        return new h(64536, paramString.getMessage(), null);
      }
      paramString = this.m.a(paramString, parame);
      try
      {
        paramString = (h)paramString.get();
        return paramString;
      }
      catch (InterruptedException paramString)
      {
        paramString.printStackTrace();
        return new h(64536, paramString.getMessage(), null);
      }
      catch (ExecutionException paramString)
      {
        paramString.printStackTrace();
        return new h(64536, paramString.getMessage(), null);
      }
      return paramString.b();
    }
    return paramString.b();
  }
  
  public Object a(m paramm, e parame)
  {
    e locale = parame;
    if (parame == null) {
      locale = new e();
    }
    parame = a(paramm.c(), locale);
    if (!parame.a()) {
      return paramm.a(new byte[0]);
    }
    paramm = paramm.a(parame.k);
    parame.k = null;
    return paramm;
  }
  
  public void a(int paramInt)
  {
    this.m.a(paramInt);
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3)
  {
    this.h = paramInt1;
    this.i = paramInt1;
    this.j = paramInt2;
    this.k = paramInt3;
  }
  
  void a(long paramLong)
  {
    this.i = f;
  }
  
  boolean a(Context paramContext)
  {
    paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
    if (paramContext != null) {
      return paramContext.isAvailable();
    }
    return false;
  }
  
  public boolean a(d paramd)
  {
    b localb = paramd.b;
    if (localb != null) {
      localb.a();
    }
    paramd = paramd.a;
    if (paramd != null) {
      return paramd.cancel(true);
    }
    return false;
  }
  
  Context b()
  {
    return this.d;
  }
  
  public d b(String paramString, i parami)
  {
    e locale = new e();
    locale.a(2);
    locale.r = 1048576;
    locale.s = 10;
    return a(paramString, parami, locale);
  }
  
  public d b(String paramString1, i parami, String paramString2)
  {
    return null;
  }
  
  public void b(Context paramContext)
  {
    this.d = paramContext;
    try
    {
      IntentFilter localIntentFilter = new IntentFilter();
      localIntentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
      paramContext.registerReceiver(this.q, localIntentFilter);
      this.p = true;
      c();
      return;
    }
    catch (Exception paramContext)
    {
      paramContext.printStackTrace();
    }
  }
  
  public void c()
  {
    if (this.d == null) {
      return;
    }
    NetworkInfo localNetworkInfo = ((ConnectivityManager)this.d.getSystemService("connectivity")).getActiveNetworkInfo();
    if (localNetworkInfo != null)
    {
      if (localNetworkInfo.getType() == 0)
      {
        if ((localNetworkInfo.getSubtype() == 1) || (localNetworkInfo.getSubtype() == 4) || (localNetworkInfo.getSubtype() == 2))
        {
          this.m.a(false);
          return;
        }
        this.m.a(true);
        return;
      }
      if (localNetworkInfo.getType() == 1)
      {
        this.m.a(true);
        return;
      }
    }
    this.m.a(false);
  }
  
  int d()
  {
    return this.i + this.l;
  }
  
  void e()
  {
    if (this.i < this.k)
    {
      this.i += this.j;
      return;
    }
    this.i = this.k;
  }
  
  public void f()
  {
    try
    {
      if ((this.d != null) && (this.p))
      {
        this.d.unregisterReceiver(this.q);
        this.p = false;
      }
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  public boolean handleMessage(Message paramMessage)
  {
    paramMessage = (f.e)paramMessage.obj;
    if ((paramMessage != null) && (paramMessage.a != null)) {
      paramMessage.a.a(paramMessage.b);
    }
    return true;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\net\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */