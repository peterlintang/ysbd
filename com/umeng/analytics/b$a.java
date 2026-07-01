package com.umeng.analytics;

import android.content.Context;
import com.umeng.common.Log;
import java.util.Map;

final class b$a
  extends Thread
{
  private final Object b = new Object();
  private Context c;
  private int d;
  private String e;
  private String f;
  private int g;
  private long h;
  private Map<String, String> i;
  private String j;
  
  b$a(b paramb, Context paramContext, int paramInt)
  {
    this.c = paramContext;
    this.d = paramInt;
  }
  
  b$a(b paramb, Context paramContext, String paramString1, String paramString2, long paramLong, int paramInt1, int paramInt2)
  {
    this.c = paramContext;
    this.e = paramString1;
    this.f = paramString2;
    this.g = paramInt1;
    this.d = paramInt2;
    this.h = paramLong;
  }
  
  b$a(Context paramContext, String paramString, Map<String, String> paramMap, long paramLong, int paramInt)
  {
    this.c = paramString;
    this.e = paramMap;
    this.i = paramLong;
    int k;
    this.d = k;
    this.h = ???;
  }
  
  b$a(Context paramContext, String paramString1, Map<String, String> paramMap, String paramString2, int paramInt)
  {
    this.c = paramString1;
    this.e = paramMap;
    this.i = paramString2;
    this.j = paramInt;
    int k;
    this.d = k;
  }
  
  public final void run()
  {
    for (;;)
    {
      try
      {
        synchronized (this.b)
        {
          int k = this.d;
          if (k == 0)
          {
            try
            {
              if (this.c == null)
              {
                Log.b("MobclickAgent", "unexpected null context in invokehander flag=0");
                return;
              }
              b.a(this.a, this.c);
            }
            catch (Exception localException2)
            {
              Log.b("MobclickAgent", "unexpected null context in invokehander flag=0", localException2);
              continue;
            }
            return;
          }
        }
        if (this.d != 1) {
          break label96;
        }
      }
      catch (Exception localException1)
      {
        Log.b("MobclickAgent", "Exception occurred in invokehander.", localException1);
        return;
      }
      b.b(this.a, this.c);
      continue;
      label96:
      if (this.d == 2) {
        b.c(this.a, this.c);
      } else if (this.d == 3) {
        b.a(this.a, this.c, this.e, this.f, this.h, this.g);
      } else if (this.d == 4) {
        b.a(this.a, this.c, this.e, this.i, this.h);
      } else if (this.d == 5) {
        b.a(this.a, this.c, this.e, this.i, this.j);
      } else if (this.d == 6) {
        b.a(this.a, this.c, this.e, this.j);
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\analytics\b$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */