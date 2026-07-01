package com.umeng.common.ufp;

public class Log
{
  public static boolean LOG = false;
  static boolean a = false;
  
  public static void a(String paramString)
  {
    boolean bool = a;
  }
  
  public static void a(String paramString1, String paramString2)
  {
    boolean bool = LOG;
  }
  
  public static void a(String paramString1, String paramString2, Exception paramException)
  {
    if (LOG) {
      new StringBuilder().append(paramException.toString()).append(":  [").append(paramString2).append("]").toString();
    }
  }
  
  public static void b(String paramString1, String paramString2)
  {
    boolean bool = LOG;
  }
  
  public static void b(String paramString1, String paramString2, Exception paramException)
  {
    if (LOG)
    {
      new StringBuilder().append(paramException.toString()).append(":  [").append(paramString2).append("]").toString();
      paramString1 = paramException.getStackTrace();
      int j = paramString1.length;
      int i = 0;
      while (i < j)
      {
        paramString2 = paramString1[i];
        new StringBuilder("        at\t ").append(paramString2.toString()).toString();
        i += 1;
      }
    }
  }
  
  public static void c(String paramString1, String paramString2)
  {
    boolean bool = LOG;
  }
  
  public static void c(String paramString1, String paramString2, Exception paramException)
  {
    if (LOG) {
      new StringBuilder().append(paramException.toString()).append(":  [").append(paramString2).append("]").toString();
    }
  }
  
  public static void d(String paramString1, String paramString2)
  {
    boolean bool = LOG;
  }
  
  public static void d(String paramString1, String paramString2, Exception paramException)
  {
    if (LOG) {
      new StringBuilder().append(paramException.toString()).append(":  [").append(paramString2).append("]").toString();
    }
  }
  
  public static void e(String paramString1, String paramString2)
  {
    boolean bool = LOG;
  }
  
  public static void e(String paramString1, String paramString2, Exception paramException)
  {
    if (LOG)
    {
      new StringBuilder().append(paramException.toString()).append(":  [").append(paramString2).append("]").toString();
      paramString1 = paramException.getStackTrace();
      int j = paramString1.length;
      int i = 0;
      while (i < j)
      {
        paramString2 = paramString1[i];
        new StringBuilder("        at\t ").append(paramString2.toString()).toString();
        i += 1;
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\common\ufp\Log.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */