package com.taobao.munion.utils;

import android.content.Intent;
import android.os.Bundle;
import java.util.HashMap;

public class j
{
  private static final long a = -1L;
  private static long b = 0L;
  private static final String c = "key_intent_data";
  private static HashMap<Object, Object> d = new HashMap();
  
  public static Object a(Intent paramIntent)
  {
    return a(paramIntent, "key_intent_data");
  }
  
  public static Object a(Intent paramIntent, String paramString)
  {
    if (paramString != null)
    {
      long l = paramIntent.getLongExtra(paramString, -1L);
      k.a(paramString + " get = " + l);
      if (l != -1L) {
        return a(Long.valueOf(l));
      }
    }
    return null;
  }
  
  public static Object a(Bundle paramBundle, String paramString)
  {
    if (paramString != null)
    {
      long l = paramBundle.getLong(paramString, -1L);
      if (l != -1L) {
        return a(Long.valueOf(l));
      }
    }
    return null;
  }
  
  private static Object a(Object paramObject)
  {
    if (paramObject != null) {
      return d.remove(paramObject);
    }
    return null;
  }
  
  public static void a(Intent paramIntent, Object paramObject)
  {
    a(paramIntent, "key_intent_data", paramObject);
  }
  
  public static void a(Intent paramIntent, String paramString, Object paramObject)
  {
    if ((paramString != null) && (paramObject != null)) {}
    try
    {
      b += 1L;
      paramIntent.putExtra(paramString, b);
      a(Long.valueOf(b), paramObject);
      k.a(paramString + "  = " + b);
      return;
    }
    finally
    {
      paramIntent = finally;
      throw paramIntent;
    }
  }
  
  public static void a(Bundle paramBundle, String paramString, Object paramObject)
  {
    if ((paramString != null) && (paramObject != null)) {}
    try
    {
      b += 1L;
      paramBundle.putLong(paramString, b);
      a(Long.valueOf(b), paramObject);
      return;
    }
    finally
    {
      paramBundle = finally;
      throw paramBundle;
    }
  }
  
  private static void a(Object paramObject1, Object paramObject2)
  {
    if ((paramObject1 != null) && (paramObject2 != null)) {
      d.put(paramObject1, paramObject2);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\utils\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */