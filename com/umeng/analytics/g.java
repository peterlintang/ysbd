package com.umeng.analytics;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import java.util.Vector;

class g
{
  private static final int b = 4;
  private Vector<Long> a;
  private String c;
  private Context d;
  
  public g(Context paramContext, String paramString)
  {
    this.a = new Vector(4);
    this.d = paramContext;
    this.c = paramString;
  }
  
  public g(Context paramContext, String paramString, int paramInt)
  {
    this.c = paramString;
    this.d = paramContext;
    if (paramInt < 0)
    {
      this.a = new Vector(4);
      return;
    }
    this.a = new Vector(paramInt);
  }
  
  public static g a(Context paramContext, String paramString)
  {
    String str = f.e(paramContext).getString(paramString, null);
    paramContext = new g(paramContext, paramString);
    if (TextUtils.isEmpty(str)) {}
    for (;;)
    {
      return paramContext;
      paramString = str.split(",");
      int j = paramString.length;
      int i = 0;
      while (i < j)
      {
        str = paramString[i].trim();
        if (!TextUtils.isEmpty(str)) {}
        try
        {
          long l = Long.parseLong(str);
          paramContext.a(Long.valueOf(l));
        }
        catch (Exception localException)
        {
          for (;;) {}
        }
        i += 1;
      }
    }
  }
  
  public Long a()
  {
    int i = this.a.size();
    if (i <= 0) {
      return Long.valueOf(-1L);
    }
    return (Long)this.a.remove(i - 1);
  }
  
  public void a(Long paramLong)
  {
    while (this.a.size() >= 4) {
      this.a.remove(0);
    }
    this.a.add(paramLong);
  }
  
  public int b()
  {
    return this.a.size();
  }
  
  public void c()
  {
    String str = toString();
    SharedPreferences.Editor localEditor = f.e(this.d).edit();
    if (TextUtils.isEmpty(str))
    {
      localEditor.remove(this.c).commit();
      return;
    }
    localEditor.putString(this.c, str).commit();
  }
  
  public String toString()
  {
    int j = this.a.size();
    if (j <= 0) {
      return null;
    }
    StringBuffer localStringBuffer = new StringBuffer(4);
    int i = 0;
    while (i < j)
    {
      localStringBuffer.append(this.a.get(i));
      if (i != j - 1) {
        localStringBuffer.append(",");
      }
      i += 1;
    }
    this.a.clear();
    return localStringBuffer.toString();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\analytics\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */