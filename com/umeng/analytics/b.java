package com.umeng.analytics;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.umeng.common.Log;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class b
{
  private final String A = "session_id";
  private final String B = "date";
  private final String C = "time";
  private final String D = "start_millis";
  private final String E = "end_millis";
  private final String F = "duration";
  private final String G = "activities";
  private final String H = "header";
  private final String I = "uptr";
  private final String J = "dntr";
  private final String K = "acc";
  private final String L = "tag";
  private final String M = "label";
  private final String N = "id";
  private final String O = "ts";
  private final String P = "du";
  private final String Q = "context";
  private final String R = "last_config_time";
  private final String S = "report_policy";
  private final String T = "online_params";
  String a = null;
  String b = null;
  UmengOnlineConfigureListener c = null;
  String d = "";
  String e = "";
  private final a f = new a();
  private int g = 1;
  private Context h;
  private final Handler i;
  private final int j = 0;
  private final int k = 1;
  private final int l = 2;
  private final int m = 3;
  private final int n = 4;
  private final int o = 5;
  private final int p = 6;
  private final String q = "type";
  private final String r = "error";
  private final String s = "event";
  private final String t = "ekv";
  private final String u = "launch";
  private final String v = "flush";
  private final String w = "terminate";
  private final String x = "online_config";
  private final String y = "appkey";
  private final String z = "body";
  
  b()
  {
    HandlerThread localHandlerThread = new HandlerThread("MobclickAgent");
    localHandlerThread.start();
    this.i = new Handler(localHandlerThread.getLooper());
  }
  
  private String a(Context paramContext, String paramString, long paramLong)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramLong).append(paramString).append(com.umeng.common.b.g.b(com.umeng.common.b.f(paramContext)));
    return com.umeng.common.b.g.a(localStringBuilder.toString());
  }
  
  private String a(Context paramContext, String paramString, SharedPreferences paramSharedPreferences)
  {
    d(paramContext, paramSharedPreferences);
    long l1 = System.currentTimeMillis();
    String str = a(paramContext, paramString, l1);
    SharedPreferences.Editor localEditor = paramSharedPreferences.edit();
    localEditor.putString("appkey", paramString);
    localEditor.putString("session_id", str);
    localEditor.putLong("start_millis", l1);
    localEditor.putLong("end_millis", -1L);
    localEditor.putLong("duration", 0L);
    localEditor.putString("activities", "");
    localEditor.remove("last_terminate_location_time");
    localEditor.commit();
    c(paramContext, paramSharedPreferences);
    return str;
  }
  
  private String a(Context paramContext, JSONObject paramJSONObject, String paramString1, boolean paramBoolean, String paramString2)
  {
    paramString2 = new HttpPost(paramString1);
    Object localObject1 = new BasicHttpParams();
    HttpConnectionParams.setConnectionTimeout((HttpParams)localObject1, 10000);
    HttpConnectionParams.setSoTimeout((HttpParams)localObject1, 30000);
    localObject1 = new DefaultHttpClient((HttpParams)localObject1);
    paramString2.addHeader("X-Umeng-Sdk", l(paramContext));
    try
    {
      Object localObject2 = e.a(paramContext);
      if (localObject2 != null)
      {
        localObject2 = new HttpHost((String)localObject2, 80);
        ((HttpClient)localObject1).getParams().setParameter("http.route.default-proxy", localObject2);
      }
      paramJSONObject = paramJSONObject.toString();
      Log.a("MobclickAgent", paramJSONObject);
      if ((d.q) && (!paramBoolean))
      {
        paramJSONObject = com.umeng.common.b.f.a("content=" + paramJSONObject, "utf-8");
        paramString2.addHeader("Content-Encoding", "deflate");
        paramString2.setEntity(new InputStreamEntity(new ByteArrayInputStream(paramJSONObject), com.umeng.common.b.f.a));
      }
      for (;;)
      {
        paramContext = f.c(paramContext).edit();
        paramJSONObject = new Date();
        paramString2 = ((HttpClient)localObject1).execute(paramString2);
        long l1 = new Date().getTime();
        long l2 = paramJSONObject.getTime();
        if (paramString2.getStatusLine().getStatusCode() != 200) {
          break;
        }
        Log.a("MobclickAgent", "Sent message to " + paramString1);
        paramContext.putLong("req_time", l1 - l2);
        paramContext.commit();
        paramContext = paramString2.getEntity();
        if (paramContext == null) {
          break label400;
        }
        return a(paramContext.getContent());
        localObject2 = new ArrayList(1);
        ((List)localObject2).add(new BasicNameValuePair("content", paramJSONObject));
        paramString2.setEntity(new UrlEncodedFormEntity((List)localObject2, "UTF-8"));
      }
      return null;
    }
    catch (ClientProtocolException paramContext)
    {
      Log.a("MobclickAgent", "ClientProtocolException,Failed to send message.", paramContext);
      return null;
      paramContext.putLong("req_time", -1L);
      return null;
    }
    catch (IOException paramContext)
    {
      Log.a("MobclickAgent", "IOException,Failed to send message.", paramContext);
    }
  }
  
  private String a(InputStream paramInputStream)
  {
    BufferedReader localBufferedReader = new BufferedReader(new InputStreamReader(paramInputStream), 8192);
    StringBuilder localStringBuilder = new StringBuilder();
    try
    {
      for (;;)
      {
        String str = localBufferedReader.readLine();
        if (str == null) {
          break;
        }
        localStringBuilder.append(str + "\n");
      }
      return null;
    }
    catch (IOException localIOException)
    {
      Log.b("MobclickAgent", "Caught IOException in convertStreamToString()", localIOException);
      for (;;)
      {
        try
        {
          paramInputStream.close();
          return null;
        }
        catch (IOException paramInputStream)
        {
          Log.b("MobclickAgent", "Caught IOException in convertStreamToString()", paramInputStream);
          return null;
        }
        try
        {
          paramInputStream.close();
          return localStringBuilder.toString();
        }
        catch (IOException paramInputStream)
        {
          Log.b("MobclickAgent", "Caught IOException in convertStreamToString()", paramInputStream);
          return null;
        }
      }
    }
    finally
    {
      try
      {
        paramInputStream.close();
        throw ((Throwable)localObject);
      }
      catch (IOException paramInputStream)
      {
        Log.b("MobclickAgent", "Caught IOException in convertStreamToString()", paramInputStream);
      }
    }
  }
  
  private JSONArray a(JSONObject paramJSONObject, JSONArray paramJSONArray)
  {
    for (;;)
    {
      try
      {
        String str2 = paramJSONObject.getString("tag");
        if (!paramJSONObject.has("label")) {
          break label246;
        }
        String str1 = paramJSONObject.getString("label");
        String str3 = paramJSONObject.getString("date");
        int i1 = paramJSONArray.length() - 1;
        if (i1 >= 0)
        {
          JSONObject localJSONObject = (JSONObject)paramJSONArray.get(i1);
          if ((str1 == null) && (!localJSONObject.has("label")))
          {
            if ((str2.equals(localJSONObject.get("tag"))) && (str3.equals(localJSONObject.get("date"))))
            {
              localJSONObject.put("acc", localJSONObject.getInt("acc") + 1);
              i1 = 1;
              if (i1 != 0) {
                break label244;
              }
              paramJSONArray.put(paramJSONObject);
              return paramJSONArray;
            }
          }
          else if ((str1 != null) && (localJSONObject.has("label")) && (str2.equals(localJSONObject.get("tag"))) && (str1.equals(localJSONObject.get("label"))) && (str3.equals(localJSONObject.get("date"))))
          {
            localJSONObject.put("acc", localJSONObject.getInt("acc") + 1);
            i1 = 1;
            continue;
          }
          i1 -= 1;
          continue;
        }
        i1 = 0;
      }
      catch (Exception localException)
      {
        Log.a("MobclickAgent", "custom log merge error in tryToSendMessage", localException);
        paramJSONArray.put(paramJSONObject);
        return paramJSONArray;
      }
      continue;
      label244:
      return paramJSONArray;
      label246:
      Object localObject = null;
    }
  }
  
  private void a(Context paramContext, SharedPreferences paramSharedPreferences)
  {
    long l1 = System.currentTimeMillis();
    if ((d.g) && (l1 - paramSharedPreferences.getLong("last_terminate_location_time", 0L) > 10000L))
    {
      paramContext = com.umeng.common.b.l(paramContext);
      if (paramContext != null)
      {
        long l2 = paramSharedPreferences.getLong("gps_time", 0L);
        if (paramContext.getTime() != l2) {
          paramSharedPreferences.edit().putFloat("lng", (float)paramContext.getLongitude()).putFloat("lat", (float)paramContext.getLatitude()).putLong("gps_time", paramContext.getTime()).putLong("last_terminate_location_time", l1).commit();
        }
      }
    }
  }
  
  private void a(Context paramContext, SharedPreferences paramSharedPreferences, String paramString1, String paramString2, long paramLong, int paramInt)
  {
    paramSharedPreferences = paramSharedPreferences.getString("session_id", "");
    String str2 = com.umeng.common.b.g.a();
    String str1 = str2.split(" ")[0];
    str2 = str2.split(" ")[1];
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("type", "event");
      localJSONObject.put("session_id", paramSharedPreferences);
      localJSONObject.put("date", str1);
      localJSONObject.put("time", str2);
      localJSONObject.put("tag", paramString1);
      if (!TextUtils.isEmpty(paramString2)) {
        localJSONObject.put("label", paramString2);
      }
      if (paramLong > 0L) {
        localJSONObject.put("du", paramLong);
      }
      localJSONObject.put("acc", paramInt);
      this.i.post(new b.b(this, this, paramContext, localJSONObject));
      return;
    }
    catch (JSONException paramContext)
    {
      Log.a("MobclickAgent", "json error in emitCustomLogReport", paramContext);
    }
  }
  
  private void a(Context paramContext, SharedPreferences paramSharedPreferences, String paramString, JSONObject paramJSONObject)
  {
    paramSharedPreferences = paramSharedPreferences.getString("session_id", "");
    JSONObject localJSONObject = new JSONObject();
    JSONArray localJSONArray = new JSONArray();
    try
    {
      paramJSONObject.put("id", paramString);
      paramJSONObject.put("ts", System.currentTimeMillis() / 1000L);
      localJSONArray.put(paramJSONObject);
      localJSONObject.put("type", "ekv");
      localJSONObject.put(paramSharedPreferences, localJSONArray);
      this.i.post(new b.b(this, this, paramContext, localJSONObject));
      return;
    }
    catch (JSONException paramContext)
    {
      Log.a("MobclickAgent", "json error in emitCustomLogReport", paramContext);
      paramContext.printStackTrace();
    }
  }
  
  private void a(Context paramContext, JSONArray paramJSONArray)
  {
    int i1 = 0;
    for (;;)
    {
      if (i1 < paramJSONArray.length()) {
        try
        {
          JSONObject localJSONObject = paramJSONArray.getJSONObject(i1);
          if ((localJSONObject == null) || (!localJSONObject.has("date")) || (!localJSONObject.has("time")) || (!localJSONObject.has("context"))) {
            break label138;
          }
          if (localJSONObject.has("version"))
          {
            if ((localJSONObject.getString("version") != null) && (localJSONObject.getString("version").equals(com.umeng.common.b.d(paramContext)))) {
              localJSONObject.remove("version");
            }
          }
          else {
            this.i.post(new b.b(this, this, paramContext, localJSONObject));
          }
        }
        catch (Exception localException)
        {
          localException.printStackTrace();
        }
      }
      return;
      label138:
      i1 += 1;
    }
  }
  
  private void a(String paramString)
  {
    Log.a("MobclickAgent", paramString);
  }
  
  private boolean a(SharedPreferences paramSharedPreferences)
  {
    long l1 = paramSharedPreferences.getLong("end_millis", -1L);
    return System.currentTimeMillis() - l1 > d.d;
  }
  
  private boolean a(String paramString, Context paramContext)
  {
    if ((paramContext.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", paramContext.getPackageName()) == 0) && (!com.umeng.common.b.m(paramContext))) {}
    do
    {
      do
      {
        do
        {
          return false;
          if (paramString == "online_config") {
            return true;
          }
          if (com.umeng.common.b.k(paramContext)) {
            return true;
          }
          this.g = q(paramContext);
          if (this.g != 3) {
            break;
          }
        } while (paramString != "flush");
        return true;
        if (paramString == "error") {
          return true;
        }
        if ((this.g == 1) && (paramString == "launch")) {
          return true;
        }
        if ((this.g == 2) && (paramString == "terminate")) {
          return true;
        }
        if (this.g == 0) {
          return true;
        }
        if (this.g != 4) {
          break;
        }
      } while ((f.d(paramContext).getString(com.umeng.common.b.c(), "false").equals("true")) || (!paramString.equals("launch")));
      return true;
    } while (this.g != 5);
    return com.umeng.common.b.k(paramContext);
  }
  
  private String b(Context paramContext, SharedPreferences paramSharedPreferences)
  {
    long l1 = System.currentTimeMillis();
    paramContext = paramSharedPreferences.edit();
    paramContext.putLong("start_millis", Long.valueOf(l1).longValue());
    paramContext.putLong("end_millis", -1L);
    paramContext.commit();
    return paramSharedPreferences.getString("session_id", null);
  }
  
  private JSONArray b(JSONObject paramJSONObject, JSONArray paramJSONArray)
  {
    if ((paramJSONArray == null) || (paramJSONObject == null)) {
      return paramJSONArray;
    }
    for (;;)
    {
      int i1;
      try
      {
        String str = (String)paramJSONObject.keys().next();
        i1 = paramJSONArray.length() - 1;
        if (i1 < 0) {
          break;
        }
        JSONObject localJSONObject = (JSONObject)paramJSONArray.get(i1);
        if (localJSONObject.has(str))
        {
          paramJSONObject = paramJSONObject.getJSONArray(str);
          localJSONObject.getJSONArray(str).put((JSONObject)paramJSONObject.get(0));
          return paramJSONArray;
        }
      }
      catch (Exception paramJSONObject)
      {
        Log.a("MobclickAgent", "custom log merge error in tryToSendMessage", paramJSONObject);
        return paramJSONArray;
      }
      i1 -= 1;
    }
    paramJSONArray.put(paramJSONObject);
    return paramJSONArray;
  }
  
  private void b(Context paramContext, int paramInt)
  {
    if ((paramInt < 0) || (paramInt > 5))
    {
      Log.b("MobclickAgent", "Illegal value of report policy");
      return;
    }
    f.b(paramContext).edit().putInt("umeng_local_report_policy", paramInt).commit();
  }
  
  /* Error */
  private void b(Context paramContext, String paramString1, String paramString2, long paramLong, int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: invokestatic 732	com/umeng/analytics/f:e	(Landroid/content/Context;)Landroid/content/SharedPreferences;
    //   6: astore 7
    //   8: aload 7
    //   10: ifnonnull +6 -> 16
    //   13: aload_0
    //   14: monitorexit
    //   15: return
    //   16: aload_0
    //   17: aload_1
    //   18: aload 7
    //   20: aload_2
    //   21: aload_3
    //   22: lload 4
    //   24: iload 6
    //   26: invokespecial 734	com/umeng/analytics/b:a	(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;JI)V
    //   29: goto -16 -> 13
    //   32: astore_1
    //   33: aload_0
    //   34: monitorexit
    //   35: aload_1
    //   36: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	37	0	this	b
    //   0	37	1	paramContext	Context
    //   0	37	2	paramString1	String
    //   0	37	3	paramString2	String
    //   0	37	4	paramLong	long
    //   0	37	6	paramInt	int
    //   6	13	7	localSharedPreferences	SharedPreferences
    // Exception table:
    //   from	to	target	type
    //   2	8	32	finally
    //   16	29	32	finally
  }
  
  /* Error */
  private void b(Context paramContext, String paramString, Map<String, String> paramMap, long paramLong)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: invokestatic 732	com/umeng/analytics/f:e	(Landroid/content/Context;)Landroid/content/SharedPreferences;
    //   6: astore 7
    //   8: aload 7
    //   10: ifnonnull +6 -> 16
    //   13: aload_0
    //   14: monitorexit
    //   15: return
    //   16: new 361	org/json/JSONObject
    //   19: dup
    //   20: invokespecial 586	org/json/JSONObject:<init>	()V
    //   23: astore 8
    //   25: aload_3
    //   26: invokeinterface 740 1 0
    //   31: invokeinterface 745 1 0
    //   36: astore_3
    //   37: iconst_0
    //   38: istore 6
    //   40: aload_3
    //   41: invokeinterface 748 1 0
    //   46: ifeq +56 -> 102
    //   49: iload 6
    //   51: bipush 10
    //   53: if_icmpge +49 -> 102
    //   56: aload_3
    //   57: invokeinterface 713 1 0
    //   62: checkcast 750	java/util/Map$Entry
    //   65: astore 9
    //   67: aload 8
    //   69: aload 9
    //   71: invokeinterface 753 1 0
    //   76: checkcast 524	java/lang/String
    //   79: aload 9
    //   81: invokeinterface 756 1 0
    //   86: checkcast 524	java/lang/String
    //   89: invokevirtual 589	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   92: pop
    //   93: iload 6
    //   95: iconst_1
    //   96: iadd
    //   97: istore 6
    //   99: goto -59 -> 40
    //   102: lload 4
    //   104: lconst_0
    //   105: lcmp
    //   106: ifle +13 -> 119
    //   109: aload 8
    //   111: ldc -62
    //   113: lload 4
    //   115: invokevirtual 598	org/json/JSONObject:put	(Ljava/lang/String;J)Lorg/json/JSONObject;
    //   118: pop
    //   119: aload_0
    //   120: aload_1
    //   121: aload 7
    //   123: aload_2
    //   124: aload 8
    //   126: invokespecial 758	com/umeng/analytics/b:a	(Landroid/content/Context;Landroid/content/SharedPreferences;Ljava/lang/String;Lorg/json/JSONObject;)V
    //   129: goto -116 -> 13
    //   132: astore_1
    //   133: ldc -40
    //   135: ldc_w 760
    //   138: invokestatic 366	com/umeng/common/Log:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   141: goto -128 -> 13
    //   144: astore_1
    //   145: aload_0
    //   146: monitorexit
    //   147: aload_1
    //   148: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	149	0	this	b
    //   0	149	1	paramContext	Context
    //   0	149	2	paramString	String
    //   0	149	3	paramMap	Map<String, String>
    //   0	149	4	paramLong	long
    //   38	60	6	i1	int
    //   6	116	7	localSharedPreferences	SharedPreferences
    //   23	102	8	localJSONObject	JSONObject
    //   65	15	9	localEntry	java.util.Map.Entry
    // Exception table:
    //   from	to	target	type
    //   16	37	132	java/lang/Exception
    //   40	49	132	java/lang/Exception
    //   56	93	132	java/lang/Exception
    //   109	119	132	java/lang/Exception
    //   119	129	132	java/lang/Exception
    //   2	8	144	finally
    //   16	37	144	finally
    //   40	49	144	finally
    //   56	93	144	finally
    //   109	119	144	finally
    //   119	129	144	finally
    //   133	141	144	finally
  }
  
  /* Error */
  private void b(Context paramContext, String paramString1, Map<String, String> paramMap, String paramString2)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: invokestatic 732	com/umeng/analytics/f:e	(Landroid/content/Context;)Landroid/content/SharedPreferences;
    //   6: astore 6
    //   8: aload 6
    //   10: ifnonnull +6 -> 16
    //   13: aload_0
    //   14: monitorexit
    //   15: return
    //   16: aload_0
    //   17: aload_1
    //   18: new 237	java/lang/StringBuilder
    //   21: dup
    //   22: ldc_w 764
    //   25: invokespecial 374	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   28: aload_2
    //   29: invokevirtual 245	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   32: aload 4
    //   34: invokevirtual 245	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   37: invokevirtual 259	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   40: invokespecial 766	com/umeng/analytics/b:f	(Landroid/content/Context;Ljava/lang/String;)V
    //   43: new 361	org/json/JSONObject
    //   46: dup
    //   47: invokespecial 586	org/json/JSONObject:<init>	()V
    //   50: astore_1
    //   51: aload_3
    //   52: invokeinterface 740 1 0
    //   57: invokeinterface 745 1 0
    //   62: astore_3
    //   63: iconst_0
    //   64: istore 5
    //   66: aload_3
    //   67: invokeinterface 748 1 0
    //   72: ifeq +55 -> 127
    //   75: iload 5
    //   77: bipush 10
    //   79: if_icmpge +48 -> 127
    //   82: aload_3
    //   83: invokeinterface 713 1 0
    //   88: checkcast 750	java/util/Map$Entry
    //   91: astore 7
    //   93: aload_1
    //   94: aload 7
    //   96: invokeinterface 753 1 0
    //   101: checkcast 524	java/lang/String
    //   104: aload 7
    //   106: invokeinterface 756 1 0
    //   111: checkcast 524	java/lang/String
    //   114: invokevirtual 589	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   117: pop
    //   118: iload 5
    //   120: iconst_1
    //   121: iadd
    //   122: istore 5
    //   124: goto -58 -> 66
    //   127: aload 6
    //   129: invokeinterface 279 1 0
    //   134: new 237	java/lang/StringBuilder
    //   137: dup
    //   138: ldc_w 768
    //   141: invokespecial 374	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   144: aload_2
    //   145: invokevirtual 245	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   148: aload 4
    //   150: invokevirtual 245	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   153: invokevirtual 259	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   156: aload_1
    //   157: invokevirtual 362	org/json/JSONObject:toString	()Ljava/lang/String;
    //   160: invokeinterface 285 3 0
    //   165: invokeinterface 301 1 0
    //   170: pop
    //   171: goto -158 -> 13
    //   174: astore_1
    //   175: aload_1
    //   176: invokevirtual 628	java/lang/Exception:printStackTrace	()V
    //   179: goto -166 -> 13
    //   182: astore_1
    //   183: aload_0
    //   184: monitorexit
    //   185: aload_1
    //   186: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	187	0	this	b
    //   0	187	1	paramContext	Context
    //   0	187	2	paramString1	String
    //   0	187	3	paramMap	Map<String, String>
    //   0	187	4	paramString2	String
    //   64	59	5	i1	int
    //   6	122	6	localSharedPreferences	SharedPreferences
    //   91	14	7	localEntry	java.util.Map.Entry
    // Exception table:
    //   from	to	target	type
    //   16	63	174	java/lang/Exception
    //   66	75	174	java/lang/Exception
    //   82	118	174	java/lang/Exception
    //   127	171	174	java/lang/Exception
    //   2	8	182	finally
    //   16	63	182	finally
    //   66	75	182	finally
    //   82	118	182	finally
    //   127	171	182	finally
    //   175	179	182	finally
  }
  
  private void b(Context paramContext, JSONObject paramJSONObject)
  {
    String str = f.g(paramContext);
    try
    {
      paramJSONObject = paramJSONObject.getJSONObject("body");
      paramContext = paramContext.openFileOutput(str, 0);
      paramContext.write(paramJSONObject.toString().getBytes());
      paramContext.close();
      return;
    }
    catch (FileNotFoundException paramContext)
    {
      Log.b("MobclickAgent", "cache message error", paramContext);
      return;
    }
    catch (IOException paramContext)
    {
      Log.b("MobclickAgent", "cache message error", paramContext);
      return;
    }
    catch (Exception paramContext)
    {
      Log.b("MobclickAgent", "message is null", paramContext);
    }
  }
  
  private void c(Context paramContext, SharedPreferences paramSharedPreferences)
  {
    Object localObject1 = paramSharedPreferences.getString("session_id", null);
    if (localObject1 == null)
    {
      Log.a("MobclickAgent", "Missing session_id, ignore message");
      return;
    }
    Object localObject2 = com.umeng.common.b.g.a();
    String str1 = localObject2.split(" ")[0];
    String str2 = localObject2.split(" ")[1];
    localObject2 = new JSONObject();
    try
    {
      ((JSONObject)localObject2).put("type", "launch");
      ((JSONObject)localObject2).put("session_id", localObject1);
      ((JSONObject)localObject2).put("date", str1);
      ((JSONObject)localObject2).put("time", str2);
      if (d.g)
      {
        localObject1 = com.umeng.common.b.l(paramContext);
        if (localObject1 != null)
        {
          double d1 = ((Location)localObject1).getLongitude();
          double d2 = ((Location)localObject1).getAltitude();
          long l1 = ((Location)localObject1).getTime();
          if (l1 != paramSharedPreferences.getLong("gps_time", 0L))
          {
            ((JSONObject)localObject2).put("lng", d1);
            ((JSONObject)localObject2).put("lat", d2);
            ((JSONObject)localObject2).put("gps_time", l1);
            paramSharedPreferences.edit().putLong("gps_time", l1).commit();
          }
        }
      }
      this.i.post(new b.b(this, this, paramContext, (JSONObject)localObject2));
      return;
    }
    catch (JSONException paramContext)
    {
      Log.b("MobclickAgent", "json error in emitNewSessionReport", paramContext);
    }
  }
  
  private void c(Context paramContext, JSONObject paramJSONObject)
  {
    if (a("online_config", paramContext))
    {
      Log.a("MobclickAgent", "start to check onlineConfig info ...");
      String str2 = a(paramContext, paramJSONObject, "http://oc.umeng.com/check_config_update", true, "online_config");
      String str1 = str2;
      if (str2 == null) {
        str1 = a(paramContext, paramJSONObject, "http://oc.umeng.co/check_config_update", true, "online_config");
      }
      if (str1 != null)
      {
        Log.a("MobclickAgent", "get onlineConfig info succeed !");
        d(paramContext, str1);
      }
    }
    else
    {
      return;
    }
    if (this.c != null) {
      this.c.onDataReceived(null);
    }
    Log.a("MobclickAgent", "get onlineConfig info failed !");
  }
  
  private void d(Context paramContext, SharedPreferences paramSharedPreferences)
  {
    Object localObject3 = paramSharedPreferences.getString("session_id", null);
    if (localObject3 == null)
    {
      Log.a("MobclickAgent", "Missing session_id, ignore message in emitLastEndSessionReport");
      return;
    }
    Object localObject2 = Long.valueOf(paramSharedPreferences.getLong("duration", -1L));
    Object localObject1 = localObject2;
    if (((Long)localObject2).longValue() <= 0L) {
      localObject1 = Long.valueOf(0L);
    }
    localObject2 = com.umeng.common.b.g.a();
    String str1 = localObject2.split(" ")[0];
    String str2 = localObject2.split(" ")[1];
    localObject2 = new JSONObject();
    try
    {
      ((JSONObject)localObject2).put("type", "terminate");
      ((JSONObject)localObject2).put("session_id", localObject3);
      ((JSONObject)localObject2).put("date", str1);
      ((JSONObject)localObject2).put("time", str2);
      ((JSONObject)localObject2).put("duration", String.valueOf(((Long)localObject1).longValue() / 1000L));
      if (d.h)
      {
        localObject1 = paramSharedPreferences.getString("activities", "");
        if (!"".equals(localObject1))
        {
          localObject1 = ((String)localObject1).split(";");
          localObject3 = new JSONArray();
          int i1 = 0;
          while (i1 < localObject1.length)
          {
            ((JSONArray)localObject3).put(new JSONArray(localObject1[i1]));
            i1 += 1;
          }
          ((JSONObject)localObject2).put("activities", localObject3);
        }
      }
      localObject1 = e(paramContext, paramSharedPreferences);
      if (localObject1 != null)
      {
        ((JSONObject)localObject2).put("uptr", localObject1[1]);
        ((JSONObject)localObject2).put("dntr", localObject1[0]);
      }
      if ((d.g) && (paramSharedPreferences.contains("last_terminate_location_time")))
      {
        ((JSONObject)localObject2).put("lat", paramSharedPreferences.getFloat("lat", 0.0F));
        ((JSONObject)localObject2).put("lng", paramSharedPreferences.getFloat("lng", 0.0F));
        ((JSONObject)localObject2).put("gps_time", paramSharedPreferences.getLong("gps_time", 0L));
      }
      this.i.post(new b.b(this, this, paramContext, (JSONObject)localObject2));
      return;
    }
    catch (JSONException paramContext)
    {
      Log.b("MobclickAgent", "json error in emitLastEndSessionReport", paramContext);
    }
  }
  
  /* Error */
  private void d(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic 724	com/umeng/analytics/f:b	(Landroid/content/Context;)Landroid/content/SharedPreferences;
    //   4: astore_3
    //   5: new 361	org/json/JSONObject
    //   8: dup
    //   9: aload_2
    //   10: invokespecial 853	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   13: astore_2
    //   14: aload_2
    //   15: ldc -54
    //   17: invokevirtual 510	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   20: ifeq +29 -> 49
    //   23: aload_3
    //   24: invokeinterface 279 1 0
    //   29: ldc_w 855
    //   32: aload_2
    //   33: ldc -54
    //   35: invokevirtual 506	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   38: invokeinterface 285 3 0
    //   43: invokeinterface 301 1 0
    //   48: pop
    //   49: aload_2
    //   50: ldc -50
    //   52: invokevirtual 510	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   55: ifeq +29 -> 84
    //   58: aload_3
    //   59: invokeinterface 279 1 0
    //   64: ldc_w 857
    //   67: aload_2
    //   68: ldc -50
    //   70: invokevirtual 531	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   73: invokeinterface 730 3 0
    //   78: invokeinterface 301 1 0
    //   83: pop
    //   84: aconst_null
    //   85: astore_1
    //   86: aload_2
    //   87: ldc -46
    //   89: invokevirtual 510	org/json/JSONObject:has	(Ljava/lang/String;)Z
    //   92: ifeq +143 -> 235
    //   95: new 361	org/json/JSONObject
    //   98: dup
    //   99: aload_2
    //   100: ldc -46
    //   102: invokevirtual 506	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   105: invokespecial 853	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   108: astore_1
    //   109: aload_1
    //   110: invokevirtual 707	org/json/JSONObject:keys	()Ljava/util/Iterator;
    //   113: astore_2
    //   114: aload_3
    //   115: invokeinterface 279 1 0
    //   120: astore_3
    //   121: aload_2
    //   122: invokeinterface 748 1 0
    //   127: ifeq +79 -> 206
    //   130: aload_2
    //   131: invokeinterface 713 1 0
    //   136: checkcast 524	java/lang/String
    //   139: astore 4
    //   141: aload_3
    //   142: aload 4
    //   144: aload_1
    //   145: aload 4
    //   147: invokevirtual 506	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   150: invokeinterface 285 3 0
    //   155: pop
    //   156: goto -35 -> 121
    //   159: astore_1
    //   160: ldc -40
    //   162: ldc_w 859
    //   165: aload_1
    //   166: invokestatic 474	com/umeng/common/Log:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V
    //   169: return
    //   170: astore_1
    //   171: ldc -40
    //   173: ldc_w 861
    //   176: invokestatic 366	com/umeng/common/Log:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   179: return
    //   180: astore_1
    //   181: ldc -40
    //   183: ldc_w 863
    //   186: aload_1
    //   187: invokestatic 474	com/umeng/common/Log:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V
    //   190: goto -141 -> 49
    //   193: astore_1
    //   194: ldc -40
    //   196: ldc_w 865
    //   199: aload_1
    //   200: invokestatic 474	com/umeng/common/Log:a	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V
    //   203: goto -119 -> 84
    //   206: aload_3
    //   207: invokeinterface 301 1 0
    //   212: pop
    //   213: ldc -40
    //   215: new 237	java/lang/StringBuilder
    //   218: dup
    //   219: ldc_w 867
    //   222: invokespecial 374	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   225: aload_1
    //   226: invokevirtual 870	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   229: invokevirtual 259	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   232: invokestatic 366	com/umeng/common/Log:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   235: aload_0
    //   236: getfield 86	com/umeng/analytics/b:c	Lcom/umeng/analytics/UmengOnlineConfigureListener;
    //   239: ifnull -70 -> 169
    //   242: aload_0
    //   243: getfield 86	com/umeng/analytics/b:c	Lcom/umeng/analytics/UmengOnlineConfigureListener;
    //   246: aload_1
    //   247: invokeinterface 826 2 0
    //   252: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	253	0	this	b
    //   0	253	1	paramContext	Context
    //   0	253	2	paramString	String
    //   4	203	3	localObject	Object
    //   139	7	4	str	String
    // Exception table:
    //   from	to	target	type
    //   86	121	159	java/lang/Exception
    //   121	156	159	java/lang/Exception
    //   206	235	159	java/lang/Exception
    //   235	252	159	java/lang/Exception
    //   5	14	170	java/lang/Exception
    //   14	49	180	java/lang/Exception
    //   49	84	193	java/lang/Exception
  }
  
  private void d(Context paramContext, String paramString1, String paramString2)
  {
    for (;;)
    {
      SharedPreferences localSharedPreferences;
      int i1;
      try
      {
        localSharedPreferences = f.e(paramContext);
        if (localSharedPreferences == null) {
          return;
        }
        try
        {
          i1 = g(paramContext, "_kvts" + paramString1 + paramString2);
          if (i1 >= 0) {
            break label75;
          }
          a("event duration less than 0 in ekvEvnetEnd");
        }
        catch (Exception paramContext)
        {
          a("exception in onLogDurationInternalEnd");
        }
        continue;
        paramString2 = new JSONObject(localSharedPreferences.getString("_kvvl" + paramString1 + paramString2, null));
      }
      finally {}
      label75:
      paramString2.put("du", i1);
      a(paramContext, localSharedPreferences, paramString1, paramString2);
    }
  }
  
  private void e(Context paramContext, String paramString)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject();
      try
      {
        localJSONObject.put("type", "online_config");
        localJSONObject.put("appkey", paramString);
        localJSONObject.put("version_code", com.umeng.common.b.d(paramContext));
        localJSONObject.put("package", com.umeng.common.b.u(paramContext));
        localJSONObject.put("sdk_version", "4.3");
        localJSONObject.put("idmd5", com.umeng.common.b.g.b(com.umeng.common.b.f(paramContext)));
        localJSONObject.put("channel", h(paramContext));
        localJSONObject.put("report_policy", q(paramContext));
        localJSONObject.put("last_config_time", r(paramContext));
        this.i.post(new b.b(this, this, paramContext, localJSONObject));
      }
      catch (Exception paramContext)
      {
        for (;;)
        {
          Log.b("MobclickAgent", "exception in onlineConfigInternal");
        }
      }
      return;
    }
    finally {}
  }
  
  private long[] e(Context paramContext, SharedPreferences paramSharedPreferences)
  {
    try
    {
      Object localObject = Class.forName("android.net.TrafficStats");
      Method localMethod = ((Class)localObject).getMethod("getUidRxBytes", new Class[] { Integer.TYPE });
      localObject = ((Class)localObject).getMethod("getUidTxBytes", new Class[] { Integer.TYPE });
      int i1 = paramContext.getApplicationInfo().uid;
      if (i1 == -1) {
        return null;
      }
      paramContext = new long[2];
      paramContext[0] = ((Long)localMethod.invoke(null, new Object[] { Integer.valueOf(i1) })).longValue();
      paramContext[1] = ((Long)((Method)localObject).invoke(null, new Object[] { Integer.valueOf(i1) })).longValue();
      if ((paramContext[0] > 0L) && (paramContext[1] > 0L))
      {
        long l1 = paramSharedPreferences.getLong("traffics_up", -1L);
        long l2 = paramSharedPreferences.getLong("traffics_down", -1L);
        paramSharedPreferences.edit().putLong("traffics_up", paramContext[1]).putLong("traffics_down", paramContext[0]).commit();
        if ((l1 <= 0L) || (l2 <= 0L)) {
          break label272;
        }
        paramContext[0] -= l2;
        paramContext[1] -= l1;
        if (paramContext[0] > 0L)
        {
          l1 = paramContext[1];
          if (l1 > 0L) {}
        }
        else
        {
          return null;
        }
        return paramContext;
      }
    }
    catch (Exception paramContext)
    {
      Log.a("MobclickAgent", "sdk less than 2.2 has get no traffic");
      return null;
    }
    return null;
    label272:
    return null;
  }
  
  private void f(Context paramContext)
  {
    for (;;)
    {
      try
      {
        this.h = paramContext;
        SharedPreferences localSharedPreferences = f.e(paramContext);
        if (localSharedPreferences == null) {
          return;
        }
        if (a(localSharedPreferences))
        {
          paramContext = a(paramContext, g(paramContext), localSharedPreferences);
          Log.a("MobclickAgent", "Start new session: " + paramContext);
          continue;
        }
        paramContext = b(paramContext, localSharedPreferences);
      }
      finally {}
      Log.a("MobclickAgent", "Extend current session: " + paramContext);
    }
  }
  
  private void f(Context paramContext, String paramString)
  {
    paramContext = g.a(paramContext, paramString);
    paramContext.a(Long.valueOf(System.currentTimeMillis()));
    paramContext.c();
  }
  
  private int g(Context paramContext, String paramString)
  {
    paramContext = g.a(paramContext, paramString);
    long l1 = paramContext.a().longValue();
    int i1 = -1;
    if (l1 > 0L) {
      i1 = (int)(System.currentTimeMillis() - l1);
    }
    paramContext.c();
    return i1;
  }
  
  private String g(Context paramContext)
  {
    if (this.b == null) {
      return com.umeng.common.b.p(paramContext);
    }
    return this.b;
  }
  
  private String h(Context paramContext)
  {
    if (this.a == null) {
      return com.umeng.common.b.t(paramContext);
    }
    return this.a;
  }
  
  private void i(Context paramContext)
  {
    for (;;)
    {
      SharedPreferences localSharedPreferences;
      try
      {
        if (this.h != paramContext)
        {
          Log.b("MobclickAgent", "onPause() called without context from corresponding onResume()");
          return;
        }
        this.h = paramContext;
        localSharedPreferences = f.e(paramContext);
        if (localSharedPreferences == null) {
          continue;
        }
        l2 = localSharedPreferences.getLong("start_millis", -1L);
        if (l2 == -1L)
        {
          Log.b("MobclickAgent", "onEndSession called before onStartSession");
          a(paramContext, localSharedPreferences);
          continue;
        }
        l1 = System.currentTimeMillis();
      }
      finally {}
      long l1;
      long l2 = l1 - l2;
      long l3 = localSharedPreferences.getLong("duration", 0L);
      SharedPreferences.Editor localEditor = localSharedPreferences.edit();
      if (d.h)
      {
        String str2 = localSharedPreferences.getString("activities", "");
        String str3 = paramContext.getClass().getName();
        String str1 = str2;
        if (!"".equals(str2)) {
          str1 = str2 + ";";
        }
        str1 = str1 + "[" + str3 + "," + l2 / 1000L + "]";
        localEditor.remove("activities");
        localEditor.putString("activities", str1);
      }
      localEditor.putLong("start_millis", -1L);
      localEditor.putLong("end_millis", l1);
      localEditor.putLong("duration", l2 + l3);
      localEditor.commit();
    }
  }
  
  private void j(Context paramContext)
  {
    try
    {
      n(paramContext);
      return;
    }
    finally
    {
      paramContext = finally;
      throw paramContext;
    }
  }
  
  /* Error */
  private void k(Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 64	com/umeng/analytics/b:f	Lcom/umeng/analytics/a;
    //   6: astore_2
    //   7: aload_2
    //   8: ifnonnull +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_0
    //   15: getfield 64	com/umeng/analytics/b:f	Lcom/umeng/analytics/a;
    //   18: aload_1
    //   19: invokevirtual 999	com/umeng/analytics/a:b	(Landroid/content/Context;)Lorg/json/JSONArray;
    //   22: astore_2
    //   23: aload_2
    //   24: ifnull -13 -> 11
    //   27: aload_2
    //   28: invokevirtual 515	org/json/JSONArray:length	()I
    //   31: ifeq -20 -> 11
    //   34: aload_0
    //   35: aload_1
    //   36: aload_2
    //   37: invokespecial 1001	com/umeng/analytics/b:a	(Landroid/content/Context;Lorg/json/JSONArray;)V
    //   40: goto -29 -> 11
    //   43: astore_1
    //   44: aload_0
    //   45: monitorexit
    //   46: aload_1
    //   47: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	48	0	this	b
    //   0	48	1	paramContext	Context
    //   6	31	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	7	43	finally
    //   14	23	43	finally
    //   27	40	43	finally
  }
  
  private String l(Context paramContext)
  {
    StringBuffer localStringBuffer1 = new StringBuffer();
    localStringBuffer1.append("Android");
    localStringBuffer1.append("/");
    localStringBuffer1.append("4.3");
    localStringBuffer1.append(" ");
    try
    {
      StringBuffer localStringBuffer2 = new StringBuffer();
      localStringBuffer2.append(paramContext.getPackageManager().getApplicationLabel(paramContext.getApplicationInfo()).toString());
      localStringBuffer2.append("/");
      localStringBuffer2.append(paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0).versionName);
      localStringBuffer2.append(" ");
      localStringBuffer2.append(Build.MODEL);
      localStringBuffer2.append("/");
      localStringBuffer2.append(Build.VERSION.RELEASE);
      localStringBuffer2.append(" ");
      localStringBuffer2.append(com.umeng.common.b.g.b(com.umeng.common.b.f(paramContext)));
      localStringBuffer1.append(URLEncoder.encode(localStringBuffer2.toString()));
      return localStringBuffer1.toString();
    }
    catch (Exception paramContext)
    {
      for (;;)
      {
        paramContext.printStackTrace();
      }
    }
  }
  
  private JSONObject m(Context paramContext)
  {
    JSONObject localJSONObject = new JSONObject();
    String str;
    try
    {
      localObject = com.umeng.common.b.f(paramContext);
      if ((localObject == null) || (((String)localObject).equals("")))
      {
        Log.b("MobclickAgent", "No device id");
        return null;
      }
      str = g(paramContext);
      if (str == null)
      {
        Log.b("MobclickAgent", "No appkey");
        return null;
      }
    }
    catch (Exception paramContext)
    {
      Log.b("MobclickAgent", "getMessageHeader error", paramContext);
      return null;
    }
    localJSONObject.put("device_id", localObject);
    localJSONObject.put("idmd5", com.umeng.common.b.g.b((String)localObject));
    localJSONObject.put("mc", com.umeng.common.b.q(paramContext));
    localJSONObject.put("device_model", Build.MODEL);
    localJSONObject.put("appkey", str);
    localJSONObject.put("channel", h(paramContext));
    localJSONObject.put("app_version", com.umeng.common.b.e(paramContext));
    localJSONObject.put("version_code", com.umeng.common.b.d(paramContext));
    localJSONObject.put("sdk_type", "Android");
    localJSONObject.put("sdk_version", "4.3");
    localJSONObject.put("os", "Android");
    localJSONObject.put("os_version", Build.VERSION.RELEASE);
    localJSONObject.put("timezone", com.umeng.common.b.n(paramContext));
    Object localObject = com.umeng.common.b.o(paramContext);
    if (localObject != null)
    {
      localJSONObject.put("country", localObject[0]);
      localJSONObject.put("language", localObject[1]);
    }
    localJSONObject.put("resolution", com.umeng.common.b.r(paramContext));
    localObject = com.umeng.common.b.j(paramContext);
    if ((localObject != null) && (localObject[0].equals("2G/3G")))
    {
      localJSONObject.put("access", localObject[0]);
      localJSONObject.put("access_subtype", localObject[1]);
    }
    for (;;)
    {
      localJSONObject.put("carrier", com.umeng.common.b.s(paramContext));
      localJSONObject.put("cpu", com.umeng.common.b.a());
      if (!this.d.equals("")) {
        localJSONObject.put("gpu_vender", this.d);
      }
      if (!this.e.equals("")) {
        localJSONObject.put("gpu_renderer", this.e);
      }
      if (d.i)
      {
        localObject = f.h(paramContext);
        if (localObject != null) {
          localJSONObject.put("uinfo", localObject);
        }
      }
      localJSONObject.put("package", com.umeng.common.b.u(paramContext));
      return localJSONObject;
      if (localObject != null) {
        localJSONObject.put("access", localObject[0]);
      } else {
        localJSONObject.put("access", "Unknown");
      }
    }
  }
  
  private void n(Context paramContext)
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("type", "flush");
      this.i.post(new b.b(this, this, paramContext, localJSONObject));
      return;
    }
    catch (JSONException paramContext)
    {
      Log.b("MobclickAgent", "json error in emitCache");
    }
  }
  
  private JSONObject o(Context paramContext)
  {
    Object localObject = f.g(paramContext);
    try
    {
      FileInputStream localFileInputStream = paramContext.openFileInput((String)localObject);
      byte[] arrayOfByte = new byte['Ѐ'];
      for (localObject = "";; localObject = (String)localObject + new String(arrayOfByte, 0, i1))
      {
        i1 = localFileInputStream.read(arrayOfByte);
        if (i1 == -1) {
          break;
        }
      }
      localFileInputStream.close();
      int i1 = ((String)localObject).length();
      if (i1 == 0) {
        return null;
      }
      try
      {
        localObject = new JSONObject((String)localObject);
        return (JSONObject)localObject;
      }
      catch (JSONException localJSONException)
      {
        p(paramContext);
        localJSONException.printStackTrace();
        return null;
      }
      return null;
    }
    catch (FileNotFoundException paramContext)
    {
      return null;
    }
    catch (IOException paramContext) {}
  }
  
  private void p(Context paramContext)
  {
    paramContext.deleteFile(f.f(paramContext));
    paramContext.deleteFile(f.g(paramContext));
  }
  
  private int q(Context paramContext)
  {
    paramContext = f.b(paramContext);
    if ((paramContext.contains("umeng_net_report_policy")) && (paramContext.getInt("umeng_net_report_policy", -1) != -1)) {
      return paramContext.getInt("umeng_net_report_policy", this.g);
    }
    return paramContext.getInt("umeng_local_report_policy", this.g);
  }
  
  private String r(Context paramContext)
  {
    return f.b(paramContext).getString("umeng_last_config_time", "");
  }
  
  JSONObject a(Context paramContext, JSONObject paramJSONObject1, JSONObject paramJSONObject2, JSONObject paramJSONObject3, String paramString)
  {
    Object localObject = f.c(paramContext);
    long l1 = ((SharedPreferences)localObject).getLong("req_time", 0L);
    if (l1 != 0L) {}
    try
    {
      paramJSONObject2.put("req_time", l1);
      ((SharedPreferences)localObject).edit().putString("header", paramJSONObject2.toString()).commit();
      JSONObject localJSONObject = new JSONObject();
      if (paramString == null) {
        return null;
      }
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        Log.a("MobclickAgent", "json error in tryToSendMessage", localJSONException);
      }
      try
      {
        if (("flush".equals(paramString)) && (paramJSONObject1 == null))
        {
          Log.e("MobclickAgent", "No cache message to flush in constructMessage");
          return null;
        }
      }
      catch (JSONException paramJSONObject1)
      {
        Log.b("MobclickAgent", "Fail to construct json message in tryToSendMessage.", paramJSONObject1);
        p(paramContext);
        return null;
      }
      localObject = paramJSONObject1;
      if (!"flush".equals(paramString))
      {
        localObject = paramJSONObject1;
        if (paramJSONObject1 == null) {
          localObject = new JSONObject();
        }
        if (!((JSONObject)localObject).isNull(paramString)) {
          break label217;
        }
        paramJSONObject1 = new JSONArray();
        paramJSONObject1.put(paramJSONObject3);
        ((JSONObject)localObject).put(paramString, paramJSONObject1);
      }
    }
    for (;;)
    {
      localJSONException.put("header", paramJSONObject2);
      localJSONException.put("body", localObject);
      return localJSONException;
      label217:
      paramJSONObject1 = ((JSONObject)localObject).getJSONArray(paramString);
      if ("ekv".equals(paramString)) {
        b(paramJSONObject3, paramJSONObject1);
      } else {
        paramJSONObject1.put(paramJSONObject3);
      }
    }
  }
  
  void a(Context paramContext)
  {
    if (paramContext == null) {}
    try
    {
      Log.b("MobclickAgent", "unexpected null context in onPause");
      return;
    }
    catch (Exception paramContext)
    {
      Log.b("MobclickAgent", "Exception occurred in Mobclick.onRause(). ", paramContext);
    }
    new b.a(this, paramContext, 0).start();
    return;
  }
  
  void a(Context paramContext, int paramInt)
  {
    if ((paramInt < 0) || (paramInt > 5))
    {
      Log.b("MobclickAgent", "Illegal value of report policy");
      return;
    }
    this.g = paramInt;
    b(paramContext, paramInt);
  }
  
  void a(Context paramContext, String paramString)
  {
    if ((paramString == null) || (paramString == "") || (paramString.length() > 10240)) {}
    do
    {
      return;
      if (paramContext == null)
      {
        Log.b("MobclickAgent", "unexpected null context in reportError");
        return;
      }
    } while (this.f == null);
    this.f.a(paramContext, paramString);
  }
  
  void a(Context paramContext, String paramString1, String paramString2)
  {
    if ((paramContext == null) || (TextUtils.isEmpty(paramString1)) || (TextUtils.isEmpty(paramString2)))
    {
      Log.a("MobclickAgent", "invalid params in onEventBegin");
      return;
    }
    f(paramContext, "_tl" + paramString1 + paramString2);
  }
  
  void a(Context paramContext, String paramString1, String paramString2, long paramLong, int paramInt)
  {
    if (paramContext != null) {}
    try
    {
      if ((TextUtils.isEmpty(paramString1)) || (paramInt <= 0))
      {
        Log.a("MobclickAgent", "invalid params in onEvent");
        return;
      }
      new b.a(this, paramContext, paramString1, paramString2, paramLong, paramInt, 3).start();
      return;
    }
    catch (Exception paramContext)
    {
      Log.b("MobclickAgent", "Exception occurred in Mobclick.onEvent(). ", paramContext);
    }
  }
  
  void a(Context paramContext, String paramString, Map<String, String> paramMap, long paramLong)
  {
    if (paramContext != null) {}
    try
    {
      if (TextUtils.isEmpty(paramString))
      {
        Log.a("MobclickAgent", "invalid params in onKVEventEnd");
        return;
      }
      if ((paramMap == null) || (paramMap.isEmpty()))
      {
        Log.a("MobclickAgent", "map is null or empty in onEvent");
        return;
      }
    }
    catch (Exception paramContext)
    {
      Log.b("MobclickAgent", "Exception occurred in Mobclick.onEvent(). ", paramContext);
      return;
    }
    new b.a(this, paramContext, paramString, paramMap, paramLong, 4).start();
  }
  
  void a(Context paramContext, String paramString1, Map<String, String> paramMap, String paramString2)
  {
    if ((paramContext == null) || (TextUtils.isEmpty(paramString1)) || (TextUtils.isEmpty(paramString2)))
    {
      Log.a("MobclickAgent", "invalid params in onKVEventBegin");
      return;
    }
    if ((paramMap == null) || (paramMap.isEmpty()))
    {
      Log.a("MobclickAgent", "map is null or empty in onKVEventBegin");
      return;
    }
    new b.a(this, paramContext, paramString1, paramMap, paramString2, 5).start();
  }
  
  protected void a(Context paramContext, JSONObject paramJSONObject)
  {
    String str = (String)paramJSONObject.remove("type");
    JSONObject localJSONObject2 = a(paramContext, o(paramContext), m(paramContext), paramJSONObject, str);
    if ((localJSONObject2 == null) || (localJSONObject2.isNull("body"))) {}
    label110:
    do
    {
      return;
      if (!a(str, paramContext))
      {
        b(paramContext, localJSONObject2);
        return;
      }
      paramJSONObject = null;
      int i1 = 0;
      while (i1 < d.n.length)
      {
        paramJSONObject = a(paramContext, localJSONObject2, d.n[i1], false, str);
        localJSONObject1 = paramJSONObject;
        if (paramJSONObject != null) {
          break label110;
        }
        i1 += 1;
      }
      JSONObject localJSONObject1 = paramJSONObject;
      if (localJSONObject1 == null) {
        break;
      }
      Log.a("MobclickAgent", "send applog succeed :" + localJSONObject1);
      p(paramContext);
    } while (this.g != 4);
    paramContext = f.d(paramContext).edit();
    paramContext.putString(com.umeng.common.b.c(), "true");
    paramContext.commit();
    return;
    b(paramContext, localJSONObject2);
    Log.a("MobclickAgent", "send applog failed");
  }
  
  void b(Context paramContext)
  {
    try
    {
      String str = g(paramContext);
      if ((str == null) || (str.length() == 0))
      {
        Log.b("MobclickAgent", "unexpected empty appkey in onError");
        return;
      }
      if (paramContext == null)
      {
        Log.b("MobclickAgent", "unexpected null context in onError");
        return;
      }
    }
    catch (Exception paramContext)
    {
      Log.b("MobclickAgent", "Exception occurred in Mobclick.onError()", paramContext);
      return;
    }
    if (this.f != null) {
      this.f.a(paramContext);
    }
    new b.a(this, paramContext, 2).start();
  }
  
  void b(Context paramContext, String paramString)
  {
    if ((paramContext == null) || (TextUtils.isEmpty(paramString)))
    {
      Log.a("MobclickAgent", "invalid params in onEventBegin");
      return;
    }
    f(paramContext, "_t" + paramString);
  }
  
  void b(Context paramContext, String paramString1, String paramString2)
  {
    if ((paramContext == null) || (TextUtils.isEmpty(paramString2)))
    {
      Log.a("MobclickAgent", "invalid params in onEventEnd");
      return;
    }
    int i1 = g(paramContext, "_tl" + paramString1 + paramString2);
    if (i1 < 0)
    {
      a("event duration less than 0 in onEvnetEnd");
      return;
    }
    a(paramContext, paramString1, paramString2, i1, 1);
  }
  
  void c(Context paramContext)
  {
    if (paramContext == null) {}
    try
    {
      Log.b("MobclickAgent", "unexpected null context in onResume");
      return;
    }
    catch (Exception paramContext)
    {
      Log.b("MobclickAgent", "Exception occurred in Mobclick.onResume(). ", paramContext);
    }
    new b.a(this, paramContext, 1).start();
    return;
  }
  
  void c(Context paramContext, String paramString)
  {
    if ((paramContext == null) || (TextUtils.isEmpty(paramString)))
    {
      Log.a("MobclickAgent", "input Context is null or event_id is empty");
      return;
    }
    int i1 = g(paramContext, "_t" + paramString);
    if (i1 < 0)
    {
      Log.a("MobclickAgent", "event duration less than 0 in onEventEnd");
      return;
    }
    a(paramContext, paramString, null, i1, 1);
  }
  
  void c(Context paramContext, String paramString1, String paramString2)
  {
    if ((paramContext == null) || (TextUtils.isEmpty(paramString1)) || (TextUtils.isEmpty(paramString2)))
    {
      Log.a("MobclickAgent", "invalid params in onKVEventEnd");
      return;
    }
    new b.a(this, paramContext, paramString1, null, paramString2, 6).start();
  }
  
  void d(Context paramContext)
  {
    if (paramContext == null) {}
    try
    {
      Log.b("MobclickAgent", "unexpected null context in flush");
      j(paramContext);
      return;
    }
    catch (Exception paramContext)
    {
      Log.b("MobclickAgent", "Exception occurred in Mobclick.flush(). ", paramContext);
    }
  }
  
  public void e(Context paramContext)
  {
    if (paramContext == null) {}
    try
    {
      Log.b("MobclickAgent", "unexpected null context in updateOnlineConfig");
      return;
    }
    catch (Exception paramContext)
    {
      Log.b("MobclickAgent", "exception in updateOnlineConfig");
      return;
    }
    String str = g(paramContext);
    if (str == null)
    {
      Log.b("MobclickAgent", "unexpected null appkey in updateOnlineConfig");
      return;
    }
    new Thread(new c(this, paramContext, str)).start();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\analytics\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */