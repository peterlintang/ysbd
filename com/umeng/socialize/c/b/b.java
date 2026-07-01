package com.umeng.socialize.c.b;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.umeng.socialize.bean.SocializeEntity;
import com.umeng.socialize.common.SocializeConstants;
import com.umeng.socialize.common.m;
import com.umeng.socialize.controller.RequestType;
import com.umeng.socialize.exception.SocializeException;
import com.umeng.socom.b.g;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class b
{
  private static final String a = b.class.getName();
  
  public static String a(String paramString, Map<String, Object> paramMap)
  {
    if ((TextUtils.isEmpty(paramString)) || (paramMap == null) || (paramMap.size() == 0)) {
      return paramString;
    }
    Object localObject2 = new StringBuilder(paramString);
    Object localObject1 = localObject2;
    if (!paramString.endsWith("?")) {
      localObject1 = ((StringBuilder)localObject2).append("?");
    }
    localObject2 = paramMap.keySet().iterator();
    paramString = (String)localObject1;
    for (;;)
    {
      if (!((Iterator)localObject2).hasNext()) {
        return paramString.substring(0, paramString.length() - 1);
      }
      localObject1 = (String)((Iterator)localObject2).next();
      if (paramMap.get(localObject1) != null) {
        paramString = paramString.append(localObject1 + "=" + URLEncoder.encode(paramMap.get(localObject1).toString()) + "&");
      }
    }
  }
  
  public static Map<String, Object> a(Context paramContext, SocializeEntity paramSocializeEntity, int paramInt)
  {
    HashMap localHashMap = new HashMap();
    String str = com.umeng.socom.b.f(paramContext);
    if (!TextUtils.isEmpty(str))
    {
      localHashMap.put("imei", str);
      localHashMap.put("md5imei", g.a(str));
    }
    str = com.umeng.socom.b.q(paramContext);
    if (TextUtils.isEmpty(str))
    {
      str = a;
      new StringBuilder("Get MacAddress failed. Check permission android.permission.ACCESS_WIFI_STATE [").append(com.umeng.socom.b.a(paramContext, "android.permission.ACCESS_WIFI_STATE")).append("]").toString();
    }
    for (;;)
    {
      if (!TextUtils.isEmpty(SocializeConstants.UID)) {
        localHashMap.put("uid", SocializeConstants.UID);
      }
      try
      {
        localHashMap.put("en", com.umeng.socom.b.j(paramContext)[0]);
        localHashMap.put("de", Build.MODEL);
        localHashMap.put("sdkv", "3.6.20130326");
        localHashMap.put("os", "Android");
        localHashMap.put("dt", Long.valueOf(System.currentTimeMillis()));
        localHashMap.put("opid", Integer.valueOf(paramInt));
        paramContext = m.a(paramContext);
        if (TextUtils.isEmpty(paramContext))
        {
          throw new SocializeException("No found appkey.");
          localHashMap.put("mac", str);
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          localHashMap.put("en", "Unknown");
        }
        localHashMap.put("ak", paramContext);
        if (!TextUtils.isEmpty(paramSocializeEntity.entityKey)) {
          localHashMap.put("ek", paramSocializeEntity.entityKey);
        }
        if (!TextUtils.isEmpty(paramSocializeEntity.sessionID)) {
          localHashMap.put("sid", paramSocializeEntity.sessionID);
        }
        localHashMap.put(c.D, "2.0");
        try
        {
          localHashMap.put("tp", paramSocializeEntity.getRequestType().toString());
          return localHashMap;
        }
        catch (Exception paramContext) {}
      }
    }
    return localHashMap;
  }
  
  /* Error */
  public static byte[] a(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aconst_null
    //   4: astore_3
    //   5: aconst_null
    //   6: astore 5
    //   8: aload_0
    //   9: invokestatic 27	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   12: ifeq +5 -> 17
    //   15: aconst_null
    //   16: areturn
    //   17: new 237	java/io/ByteArrayOutputStream
    //   20: dup
    //   21: invokespecial 238	java/io/ByteArrayOutputStream:<init>	()V
    //   24: astore_2
    //   25: aload 4
    //   27: astore_3
    //   28: aload_2
    //   29: astore 4
    //   31: new 240	java/net/URL
    //   34: dup
    //   35: aload_0
    //   36: invokespecial 241	java/net/URL:<init>	(Ljava/lang/String;)V
    //   39: invokevirtual 245	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   42: invokevirtual 250	java/net/URLConnection:getContent	()Ljava/lang/Object;
    //   45: checkcast 252	java/io/InputStream
    //   48: astore_0
    //   49: sipush 4096
    //   52: newarray <illegal type>
    //   54: astore_3
    //   55: aload_0
    //   56: aload_3
    //   57: invokevirtual 256	java/io/InputStream:read	([B)I
    //   60: istore_1
    //   61: iload_1
    //   62: iconst_m1
    //   63: if_icmpne +22 -> 85
    //   66: aload_2
    //   67: invokevirtual 260	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   70: astore_3
    //   71: aload_0
    //   72: ifnull +11 -> 83
    //   75: aload_0
    //   76: invokevirtual 263	java/io/InputStream:close	()V
    //   79: aload_2
    //   80: invokevirtual 264	java/io/ByteArrayOutputStream:close	()V
    //   83: aload_3
    //   84: areturn
    //   85: aload_2
    //   86: aload_3
    //   87: iconst_0
    //   88: iload_1
    //   89: invokevirtual 268	java/io/ByteArrayOutputStream:write	([BII)V
    //   92: goto -37 -> 55
    //   95: astore 4
    //   97: aload_0
    //   98: astore_3
    //   99: aload 4
    //   101: astore_0
    //   102: aload_2
    //   103: astore 4
    //   105: new 270	java/lang/RuntimeException
    //   108: dup
    //   109: aload_0
    //   110: invokespecial 273	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   113: athrow
    //   114: astore_0
    //   115: aload 4
    //   117: astore_2
    //   118: aload_3
    //   119: ifnull +15 -> 134
    //   122: aload_3
    //   123: invokevirtual 263	java/io/InputStream:close	()V
    //   126: aload_2
    //   127: ifnull +7 -> 134
    //   130: aload_2
    //   131: invokevirtual 264	java/io/ByteArrayOutputStream:close	()V
    //   134: aload_0
    //   135: athrow
    //   136: astore_0
    //   137: aload_2
    //   138: invokevirtual 264	java/io/ByteArrayOutputStream:close	()V
    //   141: goto -58 -> 83
    //   144: astore_0
    //   145: goto -62 -> 83
    //   148: astore_0
    //   149: aload_2
    //   150: invokevirtual 264	java/io/ByteArrayOutputStream:close	()V
    //   153: aload_0
    //   154: athrow
    //   155: astore_3
    //   156: aload_2
    //   157: ifnull -23 -> 134
    //   160: aload_2
    //   161: invokevirtual 264	java/io/ByteArrayOutputStream:close	()V
    //   164: goto -30 -> 134
    //   167: astore_2
    //   168: goto -34 -> 134
    //   171: astore_0
    //   172: aload_2
    //   173: ifnull +7 -> 180
    //   176: aload_2
    //   177: invokevirtual 264	java/io/ByteArrayOutputStream:close	()V
    //   180: aload_0
    //   181: athrow
    //   182: astore_2
    //   183: goto -30 -> 153
    //   186: astore_0
    //   187: goto -104 -> 83
    //   190: astore_2
    //   191: goto -11 -> 180
    //   194: astore_2
    //   195: goto -61 -> 134
    //   198: astore_0
    //   199: aconst_null
    //   200: astore_2
    //   201: goto -83 -> 118
    //   204: astore 4
    //   206: aload_0
    //   207: astore_3
    //   208: aload 4
    //   210: astore_0
    //   211: goto -93 -> 118
    //   214: astore_0
    //   215: aconst_null
    //   216: astore_2
    //   217: aload 5
    //   219: astore_3
    //   220: goto -118 -> 102
    //   223: astore_0
    //   224: aload 5
    //   226: astore_3
    //   227: goto -125 -> 102
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	230	0	paramString	String
    //   60	29	1	i	int
    //   24	137	2	localObject1	Object
    //   167	10	2	localIOException1	java.io.IOException
    //   182	1	2	localIOException2	java.io.IOException
    //   190	1	2	localIOException3	java.io.IOException
    //   194	1	2	localIOException4	java.io.IOException
    //   200	17	2	localObject2	Object
    //   4	119	3	localObject3	Object
    //   155	1	3	localIOException5	java.io.IOException
    //   207	20	3	localObject4	Object
    //   1	29	4	localObject5	Object
    //   95	5	4	localException	Exception
    //   103	13	4	localObject6	Object
    //   204	5	4	localObject7	Object
    //   6	219	5	localObject8	Object
    // Exception table:
    //   from	to	target	type
    //   49	55	95	java/lang/Exception
    //   55	61	95	java/lang/Exception
    //   66	71	95	java/lang/Exception
    //   85	92	95	java/lang/Exception
    //   31	49	114	finally
    //   105	114	114	finally
    //   75	79	136	java/io/IOException
    //   137	141	144	java/io/IOException
    //   75	79	148	finally
    //   122	126	155	java/io/IOException
    //   160	164	167	java/io/IOException
    //   122	126	171	finally
    //   149	153	182	java/io/IOException
    //   79	83	186	java/io/IOException
    //   176	180	190	java/io/IOException
    //   130	134	194	java/io/IOException
    //   17	25	198	finally
    //   49	55	204	finally
    //   55	61	204	finally
    //   66	71	204	finally
    //   85	92	204	finally
    //   17	25	214	java/lang/Exception
    //   31	49	223	java/lang/Exception
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\c\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */