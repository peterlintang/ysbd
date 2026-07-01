package com.taobao.munion.restool;

import android.content.Context;
import com.taobao.munion.utils.k;
import java.lang.reflect.Field;

public class a
{
  private static final String a = a.class.getName();
  private static Context b = null;
  private static Class c = null;
  private static Class d = null;
  private static Class e = null;
  private static Class f = null;
  private static Class g = null;
  private static Class h = null;
  private static Class i = null;
  private static Class j = null;
  private static Class k = null;
  private static Class l = null;
  private static Class m = null;
  
  private static int a(Class<?> paramClass, String paramString)
  {
    if (paramClass == null) {
      throw new IllegalArgumentException("ResClass is not initialized. Please make sure you have added neccessary resources. Also make sure you have " + b.getPackageName() + ".R$* configured in obfuscation. field=" + paramString);
    }
    try
    {
      int n = paramClass.getField(paramString).getInt(paramString);
      return n;
    }
    catch (Exception paramClass) {}
    return -1;
  }
  
  public static int a(String paramString)
  {
    return a(f, paramString);
  }
  
  public static void a(Context paramContext)
  {
    if (b != null) {
      return;
    }
    b = paramContext.getApplicationContext();
    try
    {
      d = Class.forName(b.getPackageName() + ".R$drawable");
    }
    catch (ClassNotFoundException paramContext)
    {
      try
      {
        e = Class.forName(b.getPackageName() + ".R$layout");
      }
      catch (ClassNotFoundException paramContext)
      {
        try
        {
          c = Class.forName(b.getPackageName() + ".R$id");
        }
        catch (ClassNotFoundException paramContext)
        {
          try
          {
            f = Class.forName(b.getPackageName() + ".R$anim");
          }
          catch (ClassNotFoundException paramContext)
          {
            try
            {
              g = Class.forName(b.getPackageName() + ".R$style");
            }
            catch (ClassNotFoundException paramContext)
            {
              try
              {
                i = Class.forName(b.getPackageName() + ".R$string");
              }
              catch (ClassNotFoundException paramContext)
              {
                try
                {
                  j = Class.forName(b.getPackageName() + ".R$array");
                }
                catch (ClassNotFoundException paramContext)
                {
                  try
                  {
                    k = Class.forName(b.getPackageName() + ".R$attr");
                  }
                  catch (ClassNotFoundException paramContext)
                  {
                    try
                    {
                      l = Class.forName(b.getPackageName() + ".R$dimen");
                    }
                    catch (ClassNotFoundException paramContext)
                    {
                      try
                      {
                        for (;;)
                        {
                          h = Class.forName(b.getPackageName() + ".R$styleable");
                          try
                          {
                            m = Class.forName(b.getPackageName() + ".R$color");
                            return;
                          }
                          catch (ClassNotFoundException paramContext)
                          {
                            k.b("res init exception = " + paramContext.getMessage());
                            return;
                          }
                          paramContext = paramContext;
                          k.b("res init exception = " + paramContext.getMessage());
                          continue;
                          paramContext = paramContext;
                          k.b("res init exception = " + paramContext.getMessage());
                          continue;
                          paramContext = paramContext;
                          k.b("res init exception = " + paramContext.getMessage());
                          continue;
                          paramContext = paramContext;
                          k.b("res init exception = " + paramContext.getMessage());
                          continue;
                          paramContext = paramContext;
                          k.b("res init exception = " + paramContext.getMessage());
                          continue;
                          paramContext = paramContext;
                          k.b("res init exception = " + paramContext.getMessage());
                          continue;
                          paramContext = paramContext;
                          k.b("res init exception = " + paramContext.getMessage());
                          continue;
                          paramContext = paramContext;
                          k.b("res init exception = " + paramContext.getMessage());
                          continue;
                          paramContext = paramContext;
                          k.b("res init exception = " + paramContext.getMessage());
                        }
                      }
                      catch (ClassNotFoundException paramContext)
                      {
                        for (;;)
                        {
                          k.b("res init exception = " + paramContext.getMessage());
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  public static int b(String paramString)
  {
    return a(m, paramString);
  }
  
  private static int[] b(Class<?> paramClass, String paramString)
  {
    if (paramClass == null) {
      throw new IllegalArgumentException("ResClass is not initialized. Please make sure you have added neccessary resources. Also make sure you have " + b.getPackageName() + ".R$* configured in obfuscation. field=" + paramString);
    }
    try
    {
      paramClass = (int[])paramClass.getField(paramString).get(paramString);
      return paramClass;
    }
    catch (Exception paramClass) {}
    return new int[1];
  }
  
  public static int c(String paramString)
  {
    return a(c, paramString);
  }
  
  public static int d(String paramString)
  {
    return a(k, paramString);
  }
  
  public static int e(String paramString)
  {
    return a(d, paramString);
  }
  
  public static int f(String paramString)
  {
    return a(l, paramString);
  }
  
  public static int[] g(String paramString)
  {
    return b(h, paramString);
  }
  
  public static int h(String paramString)
  {
    return a(h, paramString);
  }
  
  public static int i(String paramString)
  {
    return a(e, paramString);
  }
  
  public static int j(String paramString)
  {
    return a(g, paramString);
  }
  
  public static int k(String paramString)
  {
    return a(i, paramString);
  }
  
  public static int l(String paramString)
  {
    return a(j, paramString);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\restool\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */