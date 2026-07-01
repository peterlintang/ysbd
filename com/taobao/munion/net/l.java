package com.taobao.munion.net;

import com.taobao.munion.common.MunionConfigManager;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class l
  implements Cloneable
{
  public static final String a = "BizResponse";
  public static final boolean b = false;
  public static final int c = 1;
  public static final int d = -1;
  public static final int e = -100;
  public static final int f = 0;
  public static final int g = 200;
  public static final String h = "800";
  public static final String i = "response";
  protected JSONObject j;
  protected int k = 0;
  protected e l;
  
  public l(int paramInt)
  {
    this.k = paramInt;
  }
  
  public l(JSONObject paramJSONObject, e parame)
  {
    this.j = paramJSONObject;
    if ((this.j != null) && (this.j.optString("code").equals("800"))) {
      MunionConfigManager.getInstance().InitParams();
    }
    a(parame);
  }
  
  public static JSONObject a(InputStream paramInputStream)
  {
    if (paramInputStream == null) {
      return null;
    }
    paramInputStream = b(paramInputStream);
    try
    {
      paramInputStream = new JSONObject(paramInputStream);
      return paramInputStream;
    }
    catch (JSONException paramInputStream) {}
    return null;
  }
  
  /* Error */
  public static String b(InputStream paramInputStream)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnonnull +5 -> 6
    //   4: aconst_null
    //   5: areturn
    //   6: new 86	java/io/BufferedReader
    //   9: dup
    //   10: new 88	java/io/InputStreamReader
    //   13: dup
    //   14: aload_0
    //   15: invokespecial 91	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   18: invokespecial 94	java/io/BufferedReader:<init>	(Ljava/io/Reader;)V
    //   21: astore_2
    //   22: new 96	java/lang/StringBuffer
    //   25: dup
    //   26: ldc 98
    //   28: invokespecial 99	java/lang/StringBuffer:<init>	(Ljava/lang/String;)V
    //   31: astore_1
    //   32: ldc 101
    //   34: invokestatic 106	java/lang/System:getProperty	(Ljava/lang/String;)Ljava/lang/String;
    //   37: astore_3
    //   38: aload_2
    //   39: invokevirtual 110	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   42: astore 4
    //   44: aload 4
    //   46: ifnull +48 -> 94
    //   49: aload_1
    //   50: new 112	java/lang/StringBuilder
    //   53: dup
    //   54: invokespecial 113	java/lang/StringBuilder:<init>	()V
    //   57: aload 4
    //   59: invokevirtual 117	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   62: aload_3
    //   63: invokevirtual 117	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   66: invokevirtual 120	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   69: invokevirtual 123	java/lang/StringBuffer:append	(Ljava/lang/String;)Ljava/lang/StringBuffer;
    //   72: pop
    //   73: goto -35 -> 38
    //   76: astore_3
    //   77: aload_0
    //   78: ifnull +7 -> 85
    //   81: aload_0
    //   82: invokevirtual 128	java/io/InputStream:close	()V
    //   85: aload_2
    //   86: invokevirtual 129	java/io/BufferedReader:close	()V
    //   89: aload_1
    //   90: invokevirtual 130	java/lang/StringBuffer:toString	()Ljava/lang/String;
    //   93: areturn
    //   94: aload_0
    //   95: ifnull +7 -> 102
    //   98: aload_0
    //   99: invokevirtual 128	java/io/InputStream:close	()V
    //   102: aload_2
    //   103: invokevirtual 129	java/io/BufferedReader:close	()V
    //   106: goto -17 -> 89
    //   109: astore_0
    //   110: goto -21 -> 89
    //   113: astore_3
    //   114: aload_0
    //   115: ifnull +7 -> 122
    //   118: aload_0
    //   119: invokevirtual 128	java/io/InputStream:close	()V
    //   122: aload_2
    //   123: invokevirtual 129	java/io/BufferedReader:close	()V
    //   126: goto -37 -> 89
    //   129: astore_0
    //   130: goto -41 -> 89
    //   133: astore_1
    //   134: aload_0
    //   135: ifnull +7 -> 142
    //   138: aload_0
    //   139: invokevirtual 128	java/io/InputStream:close	()V
    //   142: aload_2
    //   143: invokevirtual 129	java/io/BufferedReader:close	()V
    //   146: aload_1
    //   147: athrow
    //   148: astore_0
    //   149: goto -3 -> 146
    //   152: astore_0
    //   153: goto -64 -> 89
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	156	0	paramInputStream	InputStream
    //   31	59	1	localStringBuffer	StringBuffer
    //   133	14	1	localObject	Object
    //   21	122	2	localBufferedReader	java.io.BufferedReader
    //   37	26	3	str1	String
    //   76	1	3	localOutOfMemoryError	OutOfMemoryError
    //   113	1	3	localIOException	java.io.IOException
    //   42	16	4	str2	String
    // Exception table:
    //   from	to	target	type
    //   38	44	76	java/lang/OutOfMemoryError
    //   49	73	76	java/lang/OutOfMemoryError
    //   98	102	109	java/io/IOException
    //   102	106	109	java/io/IOException
    //   38	44	113	java/io/IOException
    //   49	73	113	java/io/IOException
    //   118	122	129	java/io/IOException
    //   122	126	129	java/io/IOException
    //   38	44	133	finally
    //   49	73	133	finally
    //   138	142	148	java/io/IOException
    //   142	146	148	java/io/IOException
    //   81	85	152	java/io/IOException
    //   85	89	152	java/io/IOException
  }
  
  public JSONObject a(String paramString)
  {
    if (this.j != null) {
      return this.j.optJSONObject(paramString);
    }
    return null;
  }
  
  public JSONObject a(JSONObject paramJSONObject)
  {
    this.j = paramJSONObject;
    return paramJSONObject;
  }
  
  public void a(int paramInt)
  {
    this.k = paramInt;
  }
  
  public void a(e parame)
  {
    this.l = parame;
  }
  
  public boolean a()
  {
    if ((this.l.k() != null) && (Integer.valueOf((String)this.l.k().get("response-code")).intValue() == 302)) {}
    for (int m = 1; (m != 0) || ((this.j != null) && (this.j.optBoolean("success"))); m = 0) {
      return true;
    }
    return false;
  }
  
  public int b()
  {
    return this.k;
  }
  
  public Object b(String paramString)
  {
    if (this.j != null) {
      return this.j.opt(paramString);
    }
    return null;
  }
  
  public Map<String, Object> b(JSONObject paramJSONObject)
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = paramJSONObject.keys();
    while (localIterator.hasNext())
    {
      String str = localIterator.next().toString();
      localHashMap.put(str, paramJSONObject.optString(str));
    }
    return localHashMap;
  }
  
  public JSONObject c()
  {
    return this.j;
  }
  
  public boolean c(String paramString)
  {
    if (this.j != null) {
      return this.j.has(paramString);
    }
    return false;
  }
  
  public Object clone()
  {
    return (l)super.clone();
  }
  
  public void d()
  {
    this.j = null;
    this.k = 0;
  }
  
  public e e()
  {
    return this.l;
  }
  
  public String toString()
  {
    if (this.j != null) {
      return this.j.toString();
    }
    return "";
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\net\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */