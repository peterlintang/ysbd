package com.taobao.munion.utils;

import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.Application;
import android.os.Build.VERSION;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class f
{
  private static f g = null;
  private Application a = null;
  private ActivityManager b = null;
  private String c;
  private int d = 0;
  private int e = 0;
  private HashMap<String, f.a> f = null;
  
  public static f a()
  {
    try
    {
      if (g == null) {
        g = new f();
      }
      f localf = g;
      return localf;
    }
    finally {}
  }
  
  private f.b b(String paramString)
  {
    int j = 0;
    int k = 0;
    int i;
    if (Build.VERSION.SDK_INT >= 14)
    {
      j = 0;
      i = 0;
    }
    for (;;)
    {
      return new f.b(this, k, i, this.d, j);
      Object localObject = new StringBuffer();
      try
      {
        paramString = "dumpsys meminfo " + paramString;
        paramString = new InputStreamReader(Runtime.getRuntime().exec(paramString).getInputStream());
        char[] arrayOfChar = new char['Ѐ'];
        for (;;)
        {
          i = paramString.read(arrayOfChar);
          if (i == -1) {
            break;
          }
          ((StringBuffer)localObject).append(new String(arrayOfChar, 0, i));
        }
        paramString = ((StringBuffer)localObject).toString();
      }
      catch (IOException paramString)
      {
        paramString.printStackTrace();
        return new f.b(this, 0, 0, this.d, 0);
      }
      int m = paramString.indexOf("alloc");
      if (m == -1)
      {
        j = 0;
        i = 0;
      }
      else
      {
        k = paramString.indexOf("size");
        i = j;
        if (k >= 0)
        {
          i = j;
          if (k < m)
          {
            localObject = paramString.substring(k, m).split("\\s+");
            i = j;
            if (localObject != null)
            {
              i = j;
              if (localObject.length >= 6) {
                i = Integer.valueOf(localObject[5]).intValue();
              }
            }
          }
        }
        paramString = paramString.substring(m, paramString.indexOf("free")).split("\\s+");
        m = Integer.valueOf(paramString[1]).intValue();
        k = Integer.valueOf(paramString[2]).intValue();
        j = i;
        i = m;
      }
    }
  }
  
  private void j()
  {
    Iterator localIterator = this.f.entrySet().iterator();
    while (localIterator.hasNext()) {
      ((f.a)((Map.Entry)localIterator.next()).getValue()).b();
    }
  }
  
  public void a(Application paramApplication, String paramString, int paramInt1, int paramInt2)
  {
    this.a = paramApplication;
    this.b = ((ActivityManager)paramApplication.getSystemService("activity"));
    this.c = paramString;
    paramApplication = b(this.c);
    this.d = (paramApplication.d * 1024 / 100 * paramInt1);
    this.e = (paramApplication.d * 1024 / 100 * paramInt2);
  }
  
  public void a(String paramString)
  {
    this.f.remove(paramString);
  }
  
  public void a(String paramString, f.a parama)
  {
    this.f.put(paramString, parama);
  }
  
  public int b()
  {
    Iterator localIterator = this.b.getRunningAppProcesses().iterator();
    while (localIterator.hasNext())
    {
      ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)localIterator.next();
      if (this.c.equals(localRunningAppProcessInfo.processName)) {
        return localRunningAppProcessInfo.pid;
      }
    }
    return -1;
  }
  
  public long c()
  {
    long l2 = 0L;
    long l1 = l2;
    try
    {
      BufferedReader localBufferedReader = new BufferedReader(new FileReader("/proc/meminfo"), 8192);
      l1 = l2;
      String str = localBufferedReader.readLine();
      long l3 = l2;
      if (str != null)
      {
        l3 = l2;
        l1 = l2;
        if (!"".equals(str))
        {
          l1 = l2;
          l3 = Integer.valueOf(str.split("\\s+")[1]).intValue() * 1024;
          l1 = l3;
          localBufferedReader.close();
        }
      }
      return l3;
    }
    catch (IOException localIOException) {}
    return l1;
  }
  
  public long d()
  {
    ActivityManager.MemoryInfo localMemoryInfo = new ActivityManager.MemoryInfo();
    this.b.getMemoryInfo(localMemoryInfo);
    return localMemoryInfo.availMem;
  }
  
  public f.b e()
  {
    return b(this.c);
  }
  
  public int f()
  {
    return c.c(this.a);
  }
  
  public int g()
  {
    Iterator localIterator = this.f.entrySet().iterator();
    for (int i = 0; localIterator.hasNext(); i = ((f.a)((Map.Entry)localIterator.next()).getValue()).a() + i) {}
    return i;
  }
  
  public void h()
  {
    if (e().b() >= this.e) {
      System.gc();
    }
    if (e().b() >= this.e) {
      i();
    }
    e().b();
    int i = this.e;
  }
  
  public void i()
  {
    j();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\utils\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */