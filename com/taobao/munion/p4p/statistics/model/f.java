package com.taobao.munion.p4p.statistics.model;

import android.content.Context;
import android.os.Bundle;
import com.taobao.munion.p4p.statistics.a;
import com.umeng.common.ufp.b;
import java.net.URLEncoder;

public class f
{
  private static long e;
  private static int f = 1;
  public String a;
  public String b;
  public String c;
  public String d;
  private int g;
  private int h;
  private int i;
  private float j;
  private int k;
  private int l;
  private e m;
  
  private f(Bundle paramBundle)
  {
    paramBundle = a.a().b();
    if (paramBundle != null)
    {
      this.c = paramBundle.a;
      this.d = paramBundle.b;
      this.g = paramBundle.c;
      this.h = paramBundle.d;
      this.i = paramBundle.e;
      this.j = paramBundle.f;
    }
  }
  
  private int a(long paramLong)
  {
    long l1 = 0L;
    int i1 = 0;
    int i2 = 0;
    int n = i1;
    if (this.d != null)
    {
      n = i1;
      if (this.d.length() > 0)
      {
        n = i1;
        if (this.m != null)
        {
          if (this.m.i > 0L) {
            l1 = this.m.i;
          }
          if (this.m.a > 0) {}
          for (i1 = this.m.a;; i1 = 0)
          {
            int i3;
            for (n = 0; i2 < (l1 + paramLong) % 9L; n = i3)
            {
              int i4 = i2 * i1 % this.d.length();
              i3 = n;
              if (this.d.length() > i4) {
                i3 = n + this.d.charAt(i4);
              }
              i2 += 1;
            }
          }
        }
      }
    }
    return n;
  }
  
  public static f a(Bundle paramBundle)
  {
    return new f(paramBundle);
  }
  
  private String a()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.m.a);
    localStringBuilder.append(",");
    localStringBuilder.append(this.k);
    localStringBuilder.append(",");
    localStringBuilder.append(this.k + this.m.b);
    localStringBuilder.append(",");
    localStringBuilder.append(this.l);
    localStringBuilder.append(",");
    localStringBuilder.append(this.m.i);
    return localStringBuilder.toString();
  }
  
  private String a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return "";
    case 1: 
      return "e";
    case 2: 
      return "c";
    }
    return "t";
  }
  
  private String a(Context paramContext)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(this.g);
    localStringBuilder.append(",");
    localStringBuilder.append(this.j);
    localStringBuilder.append(",");
    localStringBuilder.append(this.h);
    localStringBuilder.append(",");
    localStringBuilder.append(this.i);
    localStringBuilder.append(",");
    if (b.m(paramContext)) {}
    for (paramContext = "0";; paramContext = "1")
    {
      localStringBuilder.append(paramContext);
      return localStringBuilder.toString();
    }
  }
  
  public String a(Context paramContext, int paramInt)
  {
    long l1 = System.currentTimeMillis() / 1000L;
    Object localObject = (g)a.a().b(1);
    this.m = ((g)localObject).a();
    new StringBuilder("Pingback Info ----------------->>>>>>>>>>>>>>> ").append(this.m.a).toString();
    this.k = ((g)localObject).d();
    this.l = ((g)localObject).c();
    if (paramInt == 1) {
      e = System.currentTimeMillis() / 1000L;
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("v=");
    ((StringBuilder)localObject).append("1.1");
    ((StringBuilder)localObject).append("&");
    ((StringBuilder)localObject).append("pt=");
    ((StringBuilder)localObject).append(e);
    ((StringBuilder)localObject).append("&");
    ((StringBuilder)localObject).append("t=");
    ((StringBuilder)localObject).append(l1);
    ((StringBuilder)localObject).append("&");
    ((StringBuilder)localObject).append("i=");
    ((StringBuilder)localObject).append(this.d);
    ((StringBuilder)localObject).append("|");
    ((StringBuilder)localObject).append(this.c);
    ((StringBuilder)localObject).append("&");
    ((StringBuilder)localObject).append("h=");
    ((StringBuilder)localObject).append(f);
    ((StringBuilder)localObject).append("&");
    ((StringBuilder)localObject).append("a=");
    ((StringBuilder)localObject).append(a(paramInt));
    ((StringBuilder)localObject).append("&");
    if (paramInt != 1)
    {
      ((StringBuilder)localObject).append("s=");
      ((StringBuilder)localObject).append(a(l1));
      ((StringBuilder)localObject).append("&");
      ((StringBuilder)localObject).append("d=");
      ((StringBuilder)localObject).append(a(paramContext));
      ((StringBuilder)localObject).append("&");
      ((StringBuilder)localObject).append("m=");
      ((StringBuilder)localObject).append(a());
      ((StringBuilder)localObject).append("&");
    }
    return URLEncoder.encode(((StringBuilder)localObject).toString().substring(0, ((StringBuilder)localObject).length() - 1), "UTF-8");
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\p4p\statistics\model\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */