package com.umeng.fb.util;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

public class b
{
  public static JSONObject a(Context paramContext, String paramString, int paramInt1, int paramInt2, JSONObject paramJSONObject1, JSONObject paramJSONObject2)
  {
    for (;;)
    {
      try
      {
        paramContext = com.umeng.fb.g.c(paramContext);
        try
        {
          paramContext.put("user_id", paramContext.getString("idmd5"));
          paramContext.put("thread", paramString);
          paramContext.put("content", "Not supported on client yet");
          paramContext.put("datetime", com.umeng.common.b.g.a());
          paramContext.put("feedback_id", a.a("FB", paramContext.getString("appkey"), paramContext.getString("user_id")));
          paramContext.put("type", "new_feedback");
          paramString = new JSONObject();
          paramString.put("age_group", paramInt1);
          switch (paramInt2)
          {
          case 1: 
            paramString.put("contact", paramJSONObject1);
            paramString.put("remark", paramJSONObject2);
            paramContext.put("userinfo", paramString);
          }
        }
        catch (JSONException paramString)
        {
          paramString.printStackTrace();
          continue;
        }
        return paramContext;
      }
      finally {}
      paramString.put("gender", "male");
      continue;
      paramString.put("gender", "female");
    }
  }
  
  /* Error */
  public static JSONObject a(Context paramContext, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: aload_0
    //   4: invokestatic 89	com/umeng/common/b:p	(Landroid/content/Context;)Ljava/lang/String;
    //   7: astore_3
    //   8: aload_0
    //   9: invokestatic 92	com/umeng/common/b:g	(Landroid/content/Context;)Ljava/lang/String;
    //   12: astore 4
    //   14: new 25	org/json/JSONObject
    //   17: dup
    //   18: invokespecial 62	org/json/JSONObject:<init>	()V
    //   21: astore_0
    //   22: aload_0
    //   23: ldc 59
    //   25: ldc 94
    //   27: invokevirtual 33	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   30: pop
    //   31: aload_0
    //   32: ldc 52
    //   34: aload_3
    //   35: invokevirtual 33	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   38: pop
    //   39: aload_0
    //   40: ldc 37
    //   42: aload_1
    //   43: invokevirtual 33	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   46: pop
    //   47: aload_0
    //   48: ldc 21
    //   50: aload 4
    //   52: invokevirtual 33	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   55: pop
    //   56: aload_0
    //   57: ldc 41
    //   59: invokestatic 46	com/umeng/common/b/g:a	()Ljava/lang/String;
    //   62: invokevirtual 33	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   65: pop
    //   66: aload_0
    //   67: ldc 48
    //   69: aload_2
    //   70: invokevirtual 33	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   73: pop
    //   74: aload_0
    //   75: ldc 96
    //   77: invokestatic 97	com/umeng/fb/util/a:a	()Ljava/lang/String;
    //   80: invokevirtual 33	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   83: pop
    //   84: ldc 2
    //   86: monitorexit
    //   87: aload_0
    //   88: areturn
    //   89: astore_1
    //   90: aload_1
    //   91: invokevirtual 80	org/json/JSONException:printStackTrace	()V
    //   94: goto -10 -> 84
    //   97: astore_0
    //   98: ldc 2
    //   100: monitorexit
    //   101: aload_0
    //   102: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	103	0	paramContext	Context
    //   0	103	1	paramString1	String
    //   0	103	2	paramString2	String
    //   7	28	3	str1	String
    //   12	39	4	str2	String
    // Exception table:
    //   from	to	target	type
    //   22	84	89	org/json/JSONException
    //   3	22	97	finally
    //   22	84	97	finally
    //   90	94	97	finally
  }
  
  public static boolean a(JSONObject paramJSONObject)
  {
    if (paramJSONObject == null) {}
    for (;;)
    {
      return false;
      try
      {
        if (paramJSONObject.has("state"))
        {
          boolean bool = "ok".equals(paramJSONObject.getString("state"));
          if (bool) {
            return true;
          }
        }
      }
      catch (Exception paramJSONObject)
      {
        paramJSONObject.printStackTrace();
      }
    }
    return false;
  }
  
  public static boolean a(JSONObject paramJSONObject, String paramString1, String paramString2)
  {
    try
    {
      paramJSONObject.put(paramString1, paramString2);
      bool = true;
    }
    catch (JSONException paramJSONObject)
    {
      for (;;)
      {
        paramJSONObject.printStackTrace();
        boolean bool = false;
      }
    }
    finally {}
    return bool;
  }
  
  /* Error */
  public static boolean b(JSONObject paramJSONObject)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: aload_0
    //   4: ldc 102
    //   6: invokevirtual 106	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   9: ifeq +17 -> 26
    //   12: aload_0
    //   13: ldc 102
    //   15: invokevirtual 121	org/json/JSONObject:remove	(Ljava/lang/String;)Ljava/lang/Object;
    //   18: pop
    //   19: iconst_1
    //   20: istore_1
    //   21: ldc 2
    //   23: monitorexit
    //   24: iload_1
    //   25: ireturn
    //   26: iconst_0
    //   27: istore_1
    //   28: goto -7 -> 21
    //   31: astore_0
    //   32: ldc 2
    //   34: monitorexit
    //   35: aload_0
    //   36: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	37	0	paramJSONObject	JSONObject
    //   20	8	1	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   3	19	31	finally
  }
  
  public static boolean c(JSONObject paramJSONObject)
  {
    try
    {
      boolean bool = a(paramJSONObject, "state", "fail");
      return bool;
    }
    finally
    {
      paramJSONObject = finally;
      throw paramJSONObject;
    }
  }
  
  public static boolean d(JSONObject paramJSONObject)
  {
    try
    {
      boolean bool = a(paramJSONObject, "state", "sending");
      return bool;
    }
    finally
    {
      paramJSONObject = finally;
      throw paramJSONObject;
    }
  }
  
  public static boolean e(JSONObject paramJSONObject)
  {
    try
    {
      boolean bool = a(paramJSONObject, "state", "ok");
      return bool;
    }
    finally
    {
      paramJSONObject = finally;
      throw paramJSONObject;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\fb\util\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */