package com.ireadercity.b2.bean;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import android.preference.PreferenceManager;
import com.ireadercity.b2.a;
import com.ireadercity.b2.h.v;
import java.io.Serializable;

public final class j
  implements Serializable
{
  public static j p;
  int a;
  String b;
  int c;
  int d;
  int e;
  int f;
  int g;
  int h;
  int i;
  int j;
  int k;
  int l;
  int m;
  int n;
  String o;
  
  public static j a(Context paramContext)
  {
    SharedPreferences localSharedPreferences = PreferenceManager.getDefaultSharedPreferences(paramContext);
    j localj = new j();
    localj.a = localSharedPreferences.getInt("fontSize", Math.round(v.b(paramContext) * 24.0F));
    localj.b = localSharedPreferences.getString("fontstyle", "默认(新版)");
    localj.c = localSharedPreferences.getInt("isBlod", 0);
    localj.d = localSharedPreferences.getInt("is3dBackGround", 0);
    localj.e = localSharedPreferences.getInt("daythemeNumber", 1);
    localj.f = localSharedPreferences.getInt("nightThemeNumber", 6);
    localj.g = localSharedPreferences.getInt("isDay", 0);
    localj.h = localSharedPreferences.getInt("pagePadding", a.D / 20);
    localj.i = localSharedPreferences.getInt("lineHeight", 150);
    if (Build.VERSION.SDK_INT > 7) {}
    for (int i1 = 2;; i1 = 4)
    {
      localj.j = localSharedPreferences.getInt("pageeffect", i1);
      localj.k = localSharedPreferences.getInt("isTurnBySoundControl", 0);
      localj.l = localSharedPreferences.getInt("simpleorTraditional", 0);
      localj.m = localSharedPreferences.getInt("isCustomSetting", 0);
      localj.n = localSharedPreferences.getInt("customFontColor", -1);
      localj.o = localSharedPreferences.getString("customBgPath", "");
      p = localj;
      return localj;
    }
  }
  
  public static void a(j paramj, Context paramContext)
  {
    paramContext = PreferenceManager.getDefaultSharedPreferences(paramContext).edit();
    new StringBuilder().append(paramj.a).append("fontsize").toString();
    paramContext.putInt("fontSize", paramj.a);
    paramContext.putString("fontstyle", paramj.b);
    paramContext.putInt("isBlod", paramj.c);
    paramContext.putInt("is3dBackGround", paramj.d);
    paramContext.putInt("daythemeNumber", paramj.e);
    paramContext.putInt("nightThemeNumber", paramj.f);
    paramContext.putInt("isDay", paramj.g);
    paramContext.putInt("pageeffect", paramj.j);
    paramContext.putInt("isTurnBySoundControl", paramj.k);
    paramContext.putInt("simpleorTraditional", paramj.l);
    paramContext.putInt("isCustomSetting", paramj.m);
    paramContext.putInt("customFontColor", paramj.n);
    paramContext.putString("customBgPath", paramj.o);
    if (paramj.h == 0)
    {
      paramContext.putInt("pagePadding", a.D / 20);
      if (paramj.i != 0) {
        break label271;
      }
      paramContext.putInt("lineHeight", 130);
    }
    for (;;)
    {
      p = paramj;
      paramContext.commit();
      return;
      paramContext.putInt("pagePadding", paramj.h);
      break;
      label271:
      paramContext.putInt("lineHeight", paramj.i);
    }
  }
  
  public static void b(Context paramContext)
  {
    SharedPreferences.Editor localEditor = PreferenceManager.getDefaultSharedPreferences(paramContext).edit();
    localEditor.putInt("fontSize", Math.round(v.b(paramContext) * 24.0F));
    localEditor.putString("fontstyle", "默认(新版)");
    localEditor.putInt("isBlod", 0);
    localEditor.putInt("daythemeNumber", 1);
    localEditor.putInt("nightThemeNumber", 6);
    localEditor.putInt("isDay", 0);
    localEditor.putInt("pagePadding", a.D / 20);
    localEditor.putInt("lineHeight", 150);
    if (Build.VERSION.SDK_INT > 7) {}
    for (int i1 = 2;; i1 = 4)
    {
      localEditor.putInt("pageeffect", i1);
      localEditor.putInt("isTurnBySoundControl", 0);
      localEditor.putInt("simpleorTraditional", 0);
      localEditor.putInt("isCustomSetting", 0);
      localEditor.putInt("customFontColor", -1);
      localEditor.putString("customBgPath", "");
      localEditor.commit();
      return;
    }
  }
  
  public final int a()
  {
    return this.h;
  }
  
  public final void a(int paramInt)
  {
    this.j = paramInt;
  }
  
  public final void a(String paramString)
  {
    this.b = paramString;
  }
  
  public final int b()
  {
    return this.j;
  }
  
  public final void b(int paramInt)
  {
    this.i = paramInt;
  }
  
  public final void b(String paramString)
  {
    this.o = paramString;
  }
  
  public final int c()
  {
    return this.i;
  }
  
  public final void c(int paramInt)
  {
    this.h = paramInt;
  }
  
  public final int d()
  {
    return this.a;
  }
  
  public final void d(int paramInt)
  {
    this.a = paramInt;
  }
  
  public final String e()
  {
    return this.b;
  }
  
  public final void e(int paramInt)
  {
    this.c = paramInt;
  }
  
  public final int f()
  {
    return this.c;
  }
  
  public final void f(int paramInt)
  {
    this.d = paramInt;
  }
  
  public final int g()
  {
    return this.d;
  }
  
  public final void g(int paramInt)
  {
    this.e = paramInt;
  }
  
  public final int h()
  {
    return this.e;
  }
  
  public final void h(int paramInt)
  {
    this.f = paramInt;
  }
  
  public final int i()
  {
    return this.f;
  }
  
  public final void i(int paramInt)
  {
    this.g = paramInt;
  }
  
  public final int j()
  {
    return this.g;
  }
  
  public final void j(int paramInt)
  {
    this.k = paramInt;
  }
  
  public final int k()
  {
    return this.k;
  }
  
  public final void k(int paramInt)
  {
    this.l = paramInt;
  }
  
  public final int l()
  {
    return this.l;
  }
  
  public final void l(int paramInt)
  {
    this.m = paramInt;
  }
  
  public final int m()
  {
    return this.m;
  }
  
  public final void m(int paramInt)
  {
    this.n = paramInt;
  }
  
  public final int n()
  {
    return this.n;
  }
  
  public final String o()
  {
    return this.o;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\bean\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */