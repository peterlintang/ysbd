package com.umeng.socom;

public class Log
{
  public static boolean LOG = false;
  
  public static void a(String paramString1, String paramString2)
  {
    boolean bool = LOG;
  }
  
  public static void a(String paramString1, String paramString2, Exception paramException)
  {
    if (LOG) {
      new StringBuilder(String.valueOf(paramException.toString())).append(":  [").append(paramString2).append("]").toString();
    }
  }
  
  public static void b(String paramString1, String paramString2)
  {
    boolean bool = LOG;
  }
  
  public static void b(String paramString1, String paramString2, Exception paramException)
  {
    int j;
    int i;
    if (LOG)
    {
      new StringBuilder(String.valueOf(paramException.toString())).append(":  [").append(paramString2).append("]").toString();
      paramString1 = paramException.getStackTrace();
      j = paramString1.length;
      i = 0;
    }
    for (;;)
    {
      if (i >= j) {
        return;
      }
      paramString2 = paramString1[i];
      new StringBuilder("        at\t ").append(paramString2.toString()).toString();
      i += 1;
    }
  }
  
  public static void c(String paramString1, String paramString2)
  {
    boolean bool = LOG;
  }
  
  public static void c(String paramString1, String paramString2, Exception paramException)
  {
    if (LOG) {
      new StringBuilder(String.valueOf(paramException.toString())).append(":  [").append(paramString2).append("]").toString();
    }
  }
  
  public static void d(String paramString1, String paramString2)
  {
    boolean bool = LOG;
  }
  
  public static void d(String paramString1, String paramString2, Exception paramException)
  {
    if (LOG) {
      new StringBuilder(String.valueOf(paramException.toString())).append(":  [").append(paramString2).append("]").toString();
    }
  }
  
  public static void e(String paramString1, String paramString2)
  {
    boolean bool = LOG;
  }
  
  public static void e(String paramString1, String paramString2, Exception paramException)
  {
    int j;
    int i;
    if (LOG)
    {
      new StringBuilder(String.valueOf(paramException.toString())).append(":  [").append(paramString2).append("]").toString();
      paramString1 = paramException.getStackTrace();
      j = paramString1.length;
      i = 0;
    }
    for (;;)
    {
      if (i >= j) {
        return;
      }
      paramString2 = paramString1[i];
      new StringBuilder("        at\t ").append(paramString2.toString()).toString();
      i += 1;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socom\Log.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */