package com.umeng.socom.net;

import android.text.TextUtils;
import com.umeng.socom.Log;
import com.umeng.socom.b.f;
import com.umeng.socom.b.g;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.InflaterInputStream;
import org.a.b.a.a.a.b;
import org.a.b.a.a.a.e;
import org.a.b.a.a.h;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.json.JSONException;
import org.json.JSONObject;

public class r
{
  private static final String a = r.class.getName();
  private Map<String, String> b;
  private StringBuilder c;
  
  private static String a(InputStream paramInputStream)
  {
    BufferedReader localBufferedReader = new BufferedReader(new InputStreamReader(paramInputStream), 8192);
    StringBuilder localStringBuilder = new StringBuilder();
    for (;;)
    {
      try
      {
        str = localBufferedReader.readLine();
        if (str != null) {}
      }
      catch (IOException localIOException)
      {
        String str;
        Log.b(a, "Caught IOException in convertStreamToString()", localIOException);
        try
        {
          paramInputStream.close();
          return null;
        }
        catch (IOException paramInputStream)
        {
          Log.b(a, "Caught IOException in convertStreamToString()", paramInputStream);
          return null;
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
          Log.b(a, "Caught IOException in convertStreamToString()", paramInputStream);
          return null;
        }
      }
      try
      {
        paramInputStream.close();
        return localStringBuilder.toString();
      }
      catch (IOException paramInputStream)
      {
        Log.b(a, "Caught IOException in convertStreamToString()", paramInputStream);
      }
      localStringBuilder.append(str + "\n");
    }
    return null;
  }
  
  private JSONObject a(s params)
  {
    int i = new Random().nextInt(1000);
    String str1 = params.e();
    label498:
    label527:
    label529:
    for (;;)
    {
      try
      {
        str2 = System.getProperty("line.separator");
        if (str1.length() <= 1)
        {
          Log.b(a, i + ":\tInvalid baseUrl.");
          return null;
        }
        a(i + ":\tget: " + str1);
        params = new HttpGet(str1);
        if ((this.b != null) && (this.b.size() > 0))
        {
          localObject = this.b.keySet().iterator();
          if (((Iterator)localObject).hasNext()) {
            continue;
          }
        }
        localObject = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout((HttpParams)localObject, 10000);
        HttpConnectionParams.setSoTimeout((HttpParams)localObject, 20000);
        localObject = new DefaultHttpClient((HttpParams)localObject).execute(params);
        if (((HttpResponse)localObject).getStatusLine().getStatusCode() != 200) {
          break label498;
        }
        params = ((HttpResponse)localObject).getEntity();
        if (params == null) {
          break label527;
        }
        params = params.getContent();
        localObject = ((HttpResponse)localObject).getFirstHeader("Content-Encoding");
        if ((localObject == null) || (!((Header)localObject).getValue().equalsIgnoreCase("gzip"))) {
          continue;
        }
        Log.a(a, i + "  Use GZIPInputStream get data....");
        params = new GZIPInputStream(params);
      }
      catch (ClientProtocolException params)
      {
        String str2;
        Object localObject;
        String str3;
        Log.c(a, i + ":\tClientProtocolException,Failed to send message." + str1, params);
        return null;
        if ((localObject == null) || (!((Header)localObject).getValue().equalsIgnoreCase("deflate"))) {
          break label529;
        }
        Log.a(a, i + "  Use InflaterInputStream get data....");
        params = new InflaterInputStream(params);
        continue;
      }
      catch (Exception params)
      {
        Log.c(a, i + ":\tIOException,Failed to send message." + str1, params);
        return null;
      }
      params = a(params);
      Log.a(a, i + ":\tresponse: " + str2 + params);
      if (params == null)
      {
        return null;
        str3 = (String)((Iterator)localObject).next();
        params.addHeader(str3, (String)this.b.get(str3));
      }
      else
      {
        return new JSONObject(params);
        Log.c(a, i + ":\tFailed to get message." + str1);
        return null;
      }
    }
  }
  
  private JSONObject a(String paramString, s params)
  {
    Object localObject1;
    int i;
    String str1;
    HttpPost localHttpPost;
    Object localObject2;
    if (params.d() == null)
    {
      localObject1 = "";
      i = new Random().nextInt(1000);
      str1 = System.getProperty("line.separator");
      Log.a(a, i + ":\trequest: " + paramString + str1 + (String)localObject1);
      localHttpPost = new HttpPost(paramString);
      localObject2 = new BasicHttpParams();
      HttpConnectionParams.setConnectionTimeout((HttpParams)localObject2, 10000);
      HttpConnectionParams.setSoTimeout((HttpParams)localObject2, 20000);
      localObject2 = new DefaultHttpClient((HttpParams)localObject2);
    }
    try
    {
      localMap = params.b();
      if ((localMap == null) || (localMap.size() <= 0)) {
        break label670;
      }
      localObject1 = new h();
      localIterator = localMap.keySet().iterator();
      label161:
      if (localIterator.hasNext()) {
        break label368;
      }
      localMap = params.c();
      if ((localMap == null) || (localMap.size() <= 0)) {
        break label216;
      }
      localIterator = localMap.keySet().iterator();
    }
    catch (ClientProtocolException params)
    {
      for (;;)
      {
        Map localMap;
        Iterator localIterator;
        Log.c(a, i + ":\tClientProtocolException,Failed to send message." + paramString, params);
        return null;
        str2 = (String)localIterator.next();
        params = (s.a)localMap.get(str2);
        arrayOfByte = params.b;
        if ((arrayOfByte != null) && (arrayOfByte.length > 0))
        {
          if (!TextUtils.isEmpty(params.a)) {
            break;
          }
          params = System.currentTimeMillis();
          ((h)localObject1).a(str2, new b(arrayOfByte, params));
          a(i + ":\tbody:  " + str2 + "=[" + params + "]");
        }
      }
    }
    catch (IOException params)
    {
      for (;;)
      {
        Log.c(a, i + ":\tIOException,Failed to send message." + paramString, params);
        return null;
        params = params.a;
        continue;
        if (!a()) {
          break;
        }
        params = f.a("content=" + (String)localObject1, Charset.defaultCharset().toString());
        localHttpPost.addHeader("Content-Encoding", "deflate");
        localHttpPost.setEntity(new InputStreamEntity(new ByteArrayInputStream(params), params.length));
      }
    }
    catch (JSONException params)
    {
      label216:
      label223:
      Log.c(a, i + ":\tIOException,Failed to send message." + paramString, params);
      return null;
    }
    if (!localIterator.hasNext())
    {
      localHttpPost.setEntity((HttpEntity)localObject1);
      localObject1 = ((HttpClient)localObject2).execute(localHttpPost);
      if (((HttpResponse)localObject1).getStatusLine().getStatusCode() != 200) {
        break label829;
      }
      params = ((HttpResponse)localObject1).getEntity();
      if (params == null) {
        break label864;
      }
      params = params.getContent();
      localObject1 = ((HttpResponse)localObject1).getFirstHeader("Content-Encoding");
      if ((localObject1 == null) || (!((Header)localObject1).getValue().equalsIgnoreCase("deflate"))) {
        break label861;
      }
      params = new InflaterInputStream(params);
    }
    label368:
    label670:
    label829:
    label861:
    for (;;)
    {
      params = a(params);
      Log.a(a, i + ":\tresponse: " + str1 + params);
      if (params == null)
      {
        return null;
        localObject1 = params.d().toString();
        break;
        String str2 = (String)localIterator.next();
        ((h)localObject1).a(str2, new e(localMap.get(str2).toString(), Charset.defaultCharset()));
        a(i + ":\tbody:  " + str2 + "=" + localMap.get(str2).toString());
        break label161;
        byte[] arrayOfByte;
        params = new ArrayList(1);
        params.add(new BasicNameValuePair("content", (String)localObject1));
        localHttpPost.setEntity(new UrlEncodedFormEntity(params, "UTF-8"));
        break label223;
      }
      return new JSONObject(params);
      Log.c(a, i + ":\tFailed to send message." + paramString);
      return null;
    }
    label864:
    return null;
  }
  
  private void a(String paramString)
  {
    Log.a(a, paramString);
    this.c.append(paramString);
  }
  
  private void b(String paramString)
  {
    if ((g.c(paramString)) || (!(s.e.equals(paramString.trim()) ^ s.d.equals(paramString.trim())))) {
      throw new RuntimeException("验证请求方式失败[" + paramString + "]");
    }
  }
  
  public r a(Map<String, String> paramMap)
  {
    this.b = paramMap;
    return this;
  }
  
  public <T extends t> T a(s params, Class<T> paramClass)
  {
    String str = params.f().trim();
    b(str);
    this.c = new StringBuilder();
    if (s.e.equals(str)) {
      params = a(params);
    }
    for (;;)
    {
      if (params == null)
      {
        return null;
        if (s.d.equals(str)) {
          params = a(params.f, params);
        }
      }
      else
      {
        try
        {
          params = (t)paramClass.getConstructor(new Class[] { JSONObject.class }).newInstance(new Object[] { params });
          return params;
        }
        catch (SecurityException params)
        {
          Log.b(a, "SecurityException", params);
          return null;
        }
        catch (NoSuchMethodException params)
        {
          for (;;)
          {
            Log.b(a, "NoSuchMethodException", params);
          }
        }
        catch (IllegalArgumentException params)
        {
          for (;;)
          {
            Log.b(a, "IllegalArgumentException", params);
          }
        }
        catch (InstantiationException params)
        {
          for (;;)
          {
            Log.b(a, "InstantiationException", params);
          }
        }
        catch (IllegalAccessException params)
        {
          for (;;)
          {
            Log.b(a, "IllegalAccessException", params);
          }
        }
        catch (InvocationTargetException params)
        {
          for (;;)
          {
            Log.b(a, "InvocationTargetException", params);
          }
        }
      }
      params = null;
    }
  }
  
  public boolean a()
  {
    return false;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socom\net\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */