package com.umeng.fb.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.umeng.common.b.g;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class c
{
  /* Error */
  public static String a(Context paramContext, JSONArray paramJSONArray)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: aload_1
    //   4: ifnull +10 -> 14
    //   7: aload_1
    //   8: invokevirtual 19	org/json/JSONArray:length	()I
    //   11: ifne +13 -> 24
    //   14: ldc 21
    //   16: astore 5
    //   18: ldc 2
    //   20: monitorexit
    //   21: aload 5
    //   23: areturn
    //   24: ldc 21
    //   26: astore 4
    //   28: iconst_0
    //   29: istore_2
    //   30: aload_1
    //   31: invokevirtual 19	org/json/JSONArray:length	()I
    //   34: istore_3
    //   35: aload 4
    //   37: astore 5
    //   39: iload_2
    //   40: iload_3
    //   41: if_icmpge -23 -> 18
    //   44: aload 4
    //   46: astore 5
    //   48: aload_1
    //   49: iload_2
    //   50: invokevirtual 25	org/json/JSONArray:getJSONArray	(I)Lorg/json/JSONArray;
    //   53: astore 7
    //   55: iconst_0
    //   56: istore_3
    //   57: aload 4
    //   59: astore 5
    //   61: aload 4
    //   63: astore 6
    //   65: iload_3
    //   66: aload 7
    //   68: invokevirtual 19	org/json/JSONArray:length	()I
    //   71: if_icmpge +116 -> 187
    //   74: aload 4
    //   76: astore 6
    //   78: aload 4
    //   80: astore 5
    //   82: aload 7
    //   84: iload_3
    //   85: invokevirtual 29	org/json/JSONArray:getString	(I)Ljava/lang/String;
    //   88: ldc 31
    //   90: invokevirtual 37	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   93: ifne +72 -> 165
    //   96: aload 4
    //   98: astore 5
    //   100: aload 7
    //   102: iload_3
    //   103: invokevirtual 41	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   106: astore 8
    //   108: aload 4
    //   110: astore 6
    //   112: aload 4
    //   114: astore 5
    //   116: ldc 43
    //   118: aload 8
    //   120: ldc 45
    //   122: invokevirtual 51	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   125: invokevirtual 55	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   128: ifeq +37 -> 165
    //   131: aload 4
    //   133: astore 6
    //   135: aload 4
    //   137: astore 5
    //   139: aload_0
    //   140: aload 8
    //   142: invokestatic 59	com/umeng/fb/util/c:b	(Landroid/content/Context;Lorg/json/JSONObject;)Z
    //   145: ifeq +20 -> 165
    //   148: aload 4
    //   150: astore 5
    //   152: aload_0
    //   153: aload 8
    //   155: ldc 61
    //   157: invokevirtual 51	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   160: invokestatic 65	com/umeng/fb/util/c:d	(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    //   163: astore 6
    //   165: iload_3
    //   166: iconst_1
    //   167: iadd
    //   168: istore_3
    //   169: aload 6
    //   171: astore 4
    //   173: goto -116 -> 57
    //   176: astore 4
    //   178: aload 4
    //   180: invokevirtual 68	java/lang/Exception:printStackTrace	()V
    //   183: aload 5
    //   185: astore 6
    //   187: iload_2
    //   188: iconst_1
    //   189: iadd
    //   190: istore_2
    //   191: aload 6
    //   193: astore 4
    //   195: goto -165 -> 30
    //   198: astore_0
    //   199: ldc 2
    //   201: monitorexit
    //   202: aload_0
    //   203: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	204	0	paramContext	Context
    //   0	204	1	paramJSONArray	JSONArray
    //   29	162	2	i	int
    //   34	135	3	j	int
    //   26	146	4	localObject1	Object
    //   176	3	4	localException	Exception
    //   193	1	4	localObject2	Object
    //   16	168	5	localObject3	Object
    //   63	129	6	localObject4	Object
    //   53	48	7	localJSONArray	JSONArray
    //   106	48	8	localJSONObject	JSONObject
    // Exception table:
    //   from	to	target	type
    //   48	55	176	java/lang/Exception
    //   65	74	176	java/lang/Exception
    //   82	96	176	java/lang/Exception
    //   100	108	176	java/lang/Exception
    //   116	131	176	java/lang/Exception
    //   139	148	176	java/lang/Exception
    //   152	165	176	java/lang/Exception
    //   7	14	198	finally
    //   30	35	198	finally
    //   48	55	198	finally
    //   65	74	198	finally
    //   82	96	198	finally
    //   100	108	198	finally
    //   116	131	198	finally
    //   139	148	198	finally
    //   152	165	198	finally
    //   178	183	198	finally
  }
  
  /* Error */
  public static java.util.List<com.umeng.fb.b> a(Context paramContext)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: new 71	java/util/ArrayList
    //   6: dup
    //   7: invokespecial 72	java/util/ArrayList:<init>	()V
    //   10: astore_1
    //   11: aload_0
    //   12: ldc 74
    //   14: iconst_0
    //   15: invokevirtual 80	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   18: invokeinterface 86 1 0
    //   23: invokeinterface 92 1 0
    //   28: invokeinterface 98 1 0
    //   33: astore_0
    //   34: aload_0
    //   35: invokeinterface 104 1 0
    //   40: ifeq +41 -> 81
    //   43: aload_1
    //   44: new 106	com/umeng/fb/b
    //   47: dup
    //   48: new 15	org/json/JSONArray
    //   51: dup
    //   52: aload_0
    //   53: invokeinterface 110 1 0
    //   58: checkcast 33	java/lang/String
    //   61: invokespecial 113	org/json/JSONArray:<init>	(Ljava/lang/String;)V
    //   64: invokespecial 116	com/umeng/fb/b:<init>	(Lorg/json/JSONArray;)V
    //   67: invokeinterface 121 2 0
    //   72: pop
    //   73: goto -39 -> 34
    //   76: astore_0
    //   77: aload_0
    //   78: invokevirtual 68	java/lang/Exception:printStackTrace	()V
    //   81: ldc 2
    //   83: monitorexit
    //   84: aload_1
    //   85: areturn
    //   86: astore_0
    //   87: ldc 2
    //   89: monitorexit
    //   90: aload_0
    //   91: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	92	0	paramContext	Context
    //   10	75	1	localArrayList	java.util.ArrayList
    // Exception table:
    //   from	to	target	type
    //   11	34	76	java/lang/Exception
    //   34	73	76	java/lang/Exception
    //   3	11	86	finally
    //   11	34	86	finally
    //   34	73	86	finally
    //   77	81	86	finally
  }
  
  public static void a(Context paramContext, com.umeng.fb.b paramb, int paramInt)
  {
    int i = 0;
    for (;;)
    {
      Object localObject1;
      String str;
      Object localObject2;
      try
      {
        localObject1 = paramContext.getSharedPreferences("feedback", 0);
        paramContext = ((SharedPreferences)localObject1).edit();
        str = paramb.c;
        localObject2 = ((SharedPreferences)localObject1).getString(str, null);
        try
        {
          localObject1 = new JSONArray();
          localObject2 = new JSONArray((String)localObject2);
          if (((JSONArray)localObject2).length() != 1) {
            continue;
          }
          paramContext.remove(paramb.c);
          paramContext.commit();
        }
        catch (JSONException paramContext)
        {
          paramContext.printStackTrace();
          continue;
        }
        paramb.b(paramInt);
        return;
      }
      finally {}
      if (i <= ((JSONArray)localObject2).length() - 1)
      {
        if (i != paramInt) {
          ((JSONArray)localObject1).put(((JSONArray)localObject2).getJSONObject(i));
        }
      }
      else
      {
        paramContext.putString(str, ((JSONArray)localObject1).toString());
        continue;
      }
      i += 1;
    }
  }
  
  public static void a(Context paramContext, String paramString)
  {
    for (;;)
    {
      int i;
      Object localObject;
      try
      {
        SharedPreferences localSharedPreferences = paramContext.getSharedPreferences("UmengFb_Nums", 0);
        if (!g.c(paramString))
        {
          String[] arrayOfString = localSharedPreferences.getString("newReplyIds", "").split(",");
          int j = arrayOfString.length;
          paramContext = "";
          i = 0;
          if (i < j)
          {
            String str = arrayOfString[i];
            localObject = paramContext;
            if (!g.c(str))
            {
              localObject = paramContext;
              if (!str.equals(paramString)) {
                localObject = paramContext + "," + str.trim();
              }
            }
          }
          else
          {
            a(localSharedPreferences, "newReplyIds", paramContext);
          }
        }
        else
        {
          return;
        }
      }
      finally {}
      i += 1;
      paramContext = (Context)localObject;
    }
  }
  
  public static void a(Context paramContext, String paramString1, String paramString2)
  {
    try
    {
      paramContext.getSharedPreferences(paramString1, 0).edit().remove(paramString2).commit();
      return;
    }
    finally
    {
      paramContext = finally;
      throw paramContext;
    }
  }
  
  private static void a(SharedPreferences paramSharedPreferences, String paramString1, String paramString2)
  {
    try
    {
      paramSharedPreferences.edit().putString(paramString1, paramString2).commit();
      return;
    }
    finally
    {
      paramSharedPreferences = finally;
      throw paramSharedPreferences;
    }
  }
  
  public static boolean a(Context paramContext, com.umeng.fb.b paramb)
  {
    return paramContext.getSharedPreferences("UmengFb_Nums", 0).getString("newReplyIds", "").contains(paramb.c);
  }
  
  public static boolean a(Context paramContext, JSONObject paramJSONObject)
  {
    boolean bool = false;
    try
    {
      String str = paramJSONObject.optString("feedback_id");
      paramContext = paramContext.getSharedPreferences("feedback", 0);
      if (!g.c(str))
      {
        a(paramContext, str, "[" + paramJSONObject.toString() + "]");
        bool = true;
      }
      return bool;
    }
    finally {}
  }
  
  /* Error */
  public static com.umeng.fb.b b(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: aload_0
    //   4: ldc 74
    //   6: iconst_0
    //   7: invokevirtual 80	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   10: aload_1
    //   11: aconst_null
    //   12: invokeinterface 137 3 0
    //   17: astore_0
    //   18: new 106	com/umeng/fb/b
    //   21: dup
    //   22: new 15	org/json/JSONArray
    //   25: dup
    //   26: aload_0
    //   27: invokespecial 113	org/json/JSONArray:<init>	(Ljava/lang/String;)V
    //   30: invokespecial 116	com/umeng/fb/b:<init>	(Lorg/json/JSONArray;)V
    //   33: astore_0
    //   34: ldc 2
    //   36: monitorexit
    //   37: aload_0
    //   38: areturn
    //   39: astore_0
    //   40: aload_0
    //   41: invokevirtual 68	java/lang/Exception:printStackTrace	()V
    //   44: aconst_null
    //   45: astore_0
    //   46: goto -12 -> 34
    //   49: astore_0
    //   50: ldc 2
    //   52: monitorexit
    //   53: aload_0
    //   54: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	55	0	paramContext	Context
    //   0	55	1	paramString	String
    // Exception table:
    //   from	to	target	type
    //   18	34	39	java/lang/Exception
    //   3	18	49	finally
    //   18	34	49	finally
    //   40	44	49	finally
  }
  
  public static boolean b(Context paramContext, JSONObject paramJSONObject)
  {
    bool = true;
    for (;;)
    {
      String str1;
      SharedPreferences localSharedPreferences;
      try
      {
        str1 = paramJSONObject.optString("feedback_id");
        localSharedPreferences = paramContext.getSharedPreferences("feedback", 0);
        try
        {
          localJSONArray = new JSONArray(localSharedPreferences.getString(str1, null));
          if (!"user_reply".equals(paramJSONObject.opt("type"))) {
            continue;
          }
          localObject = new com.umeng.fb.b(localJSONArray);
          i = localJSONArray.length() - 1;
          if (i >= 0)
          {
            str2 = localJSONArray.getJSONObject(i).optString("reply_id", null);
            str3 = paramJSONObject.optString("reply_id", null);
            if ((str2 == null) || (!str2.equalsIgnoreCase(str3))) {
              continue;
            }
            a(paramContext, (com.umeng.fb.b)localObject, i);
          }
          paramContext = new JSONArray(localSharedPreferences.getString(str1, null));
          paramContext.put(paramJSONObject);
          a(localSharedPreferences, str1, paramContext.toString());
        }
        catch (Exception paramContext)
        {
          JSONArray localJSONArray;
          Object localObject;
          int i;
          String str2;
          String str3;
          paramContext.printStackTrace();
          bool = false;
          continue;
        }
        return bool;
      }
      finally {}
      i -= 1;
      continue;
      localObject = paramContext.getSharedPreferences("umeng_reply_index", 0);
      str2 = ((SharedPreferences)localObject).getString(str1, "RP0");
      str3 = paramJSONObject.optString("reply_id");
      if (a.a(str2, str3)) {
        continue;
      }
      paramJSONObject.put("datetime", g.a());
      localJSONArray.put(paramJSONObject);
      a(localSharedPreferences, str1, localJSONArray.toString());
      a((SharedPreferences)localObject, str1, str3);
      a(paramContext.getSharedPreferences("UmengFb_Nums", 0), "maxReplyID", str3);
    }
  }
  
  public static void c(Context paramContext, String paramString)
  {
    try
    {
      paramContext.getSharedPreferences("feedback", 0).edit().remove(paramString).commit();
      return;
    }
    finally
    {
      paramContext = finally;
      throw paramContext;
    }
  }
  
  public static void c(Context paramContext, JSONObject paramJSONObject)
  {
    try
    {
      b.d(paramJSONObject);
      e(paramContext, paramJSONObject);
      return;
    }
    finally
    {
      paramContext = finally;
      throw paramContext;
    }
  }
  
  /* Error */
  private static String d(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: aload_0
    //   4: ldc -90
    //   6: iconst_0
    //   7: invokevirtual 80	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   10: astore_3
    //   11: aload_3
    //   12: ldc -84
    //   14: ldc 21
    //   16: invokeinterface 137 3 0
    //   21: astore_0
    //   22: aload_0
    //   23: aload_1
    //   24: invokevirtual 198	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   27: istore_2
    //   28: iload_2
    //   29: ifeq +8 -> 37
    //   32: ldc 2
    //   34: monitorexit
    //   35: aload_0
    //   36: areturn
    //   37: new 180	java/lang/StringBuilder
    //   40: dup
    //   41: invokespecial 181	java/lang/StringBuilder:<init>	()V
    //   44: aload_0
    //   45: invokevirtual 185	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   48: ldc -82
    //   50: invokevirtual 185	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   53: aload_1
    //   54: invokevirtual 185	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   57: invokevirtual 189	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   60: astore_0
    //   61: aload_3
    //   62: ldc -84
    //   64: aload_0
    //   65: invokestatic 192	com/umeng/fb/util/c:a	(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;)V
    //   68: goto -36 -> 32
    //   71: astore_0
    //   72: ldc 2
    //   74: monitorexit
    //   75: aload_0
    //   76: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	77	0	paramContext	Context
    //   0	77	1	paramString	String
    //   27	2	2	bool	boolean
    //   10	52	3	localSharedPreferences	SharedPreferences
    // Exception table:
    //   from	to	target	type
    //   3	28	71	finally
    //   37	68	71	finally
  }
  
  public static void d(Context paramContext, JSONObject paramJSONObject)
  {
    try
    {
      b.c(paramJSONObject);
      e(paramContext, paramJSONObject);
      return;
    }
    finally
    {
      paramContext = finally;
      throw paramContext;
    }
  }
  
  public static boolean e(Context paramContext, JSONObject paramJSONObject)
  {
    boolean bool = false;
    try
    {
      String str = paramJSONObject.optString("feedback_id");
      paramContext = paramContext.getSharedPreferences("feedback", 0);
      Object localObject = paramContext.getString(str, "[]");
      try
      {
        localObject = new JSONArray((String)localObject);
        ((JSONArray)localObject).put(paramJSONObject);
        a(paramContext, str, ((JSONArray)localObject).toString());
        bool = true;
      }
      catch (JSONException paramContext)
      {
        for (;;)
        {
          paramContext.printStackTrace();
        }
      }
      return bool;
    }
    finally {}
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\fb\util\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */