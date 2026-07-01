package com.umeng.common.ufp.net;

import com.umeng.common.ufp.Log;
import com.umeng.common.ufp.util.f;
import com.umeng.common.ufp.util.g;
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
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.json.JSONException;
import org.json.JSONObject;

public class h
{
  private static final String a = h.class.getName();
  private Map<String, String> b;
  
  private static String a(InputStream paramInputStream)
  {
    BufferedReader localBufferedReader = new BufferedReader(new InputStreamReader(paramInputStream), 8192);
    StringBuilder localStringBuilder = new StringBuilder();
    try
    {
      for (;;)
      {
        String str2 = localBufferedReader.readLine();
        if (str2 == null) {
          break;
        }
        localStringBuilder.append(str2 + "\n");
      }
      Log.b(str1, "Caught IOException in convertStreamToString()", paramInputStream);
    }
    catch (IOException localIOException)
    {
      Log.b(a, "Caught IOException in convertStreamToString()", localIOException);
    }
    finally
    {
      try
      {
        paramInputStream.close();
        return null;
      }
      catch (IOException paramInputStream)
      {
        for (;;)
        {
          str1 = a;
        }
      }
      localObject = finally;
      try
      {
        paramInputStream.close();
        throw ((Throwable)localObject);
      }
      catch (IOException paramInputStream)
      {
        try
        {
          paramInputStream.close();
          return localStringBuilder.toString();
        }
        catch (IOException paramInputStream)
        {
          for (;;)
          {
            String str1 = a;
          }
        }
        paramInputStream = paramInputStream;
        str1 = a;
      }
    }
    return null;
  }
  
  private JSONObject a(String paramString)
  {
    int i = new Random().nextInt(1000);
    label538:
    label540:
    for (;;)
    {
      Object localObject2;
      try
      {
        String str = System.getProperty("line.separator");
        if (paramString.length() <= 1)
        {
          Log.b(a, i + ":\tInvalid baseUrl.");
          return null;
        }
        Log.a(a, i + ":\tget: " + paramString);
        HttpGet localHttpGet = new HttpGet(paramString);
        Object localObject3;
        if ((this.b != null) && (this.b.size() > 0))
        {
          localObject2 = this.b.keySet().iterator();
          if (((Iterator)localObject2).hasNext())
          {
            localObject3 = (String)((Iterator)localObject2).next();
            localHttpGet.addHeader((String)localObject3, (String)this.b.get(localObject3));
            continue;
          }
        }
        Object localObject1;
        return new JSONObject(localException);
      }
      catch (ClientProtocolException localClientProtocolException)
      {
        Log.c(a, i + ":\tClientProtocolException,Failed to send message." + paramString, localClientProtocolException);
        return null;
        localObject3 = new DefaultHttpClient(a());
        a((HttpClient)localObject3);
        localObject2 = ((HttpClient)localObject3).execute(localClientProtocolException);
        b((HttpClient)localObject3);
        if (((HttpResponse)localObject2).getStatusLine().getStatusCode() == 200)
        {
          localObject1 = ((HttpResponse)localObject2).getEntity();
          if (localObject1 == null) {
            break label538;
          }
          localObject1 = ((HttpEntity)localObject1).getContent();
          localObject2 = ((HttpResponse)localObject2).getFirstHeader("Content-Encoding");
          if ((localObject2 != null) && (((Header)localObject2).getValue().equalsIgnoreCase("gzip")))
          {
            Log.a(a, i + "  Use GZIPInputStream get data....");
            localObject1 = new GZIPInputStream((InputStream)localObject1);
            localObject1 = a((InputStream)localObject1);
            Log.a(a, i + ":\tresponse: " + str + (String)localObject1);
            if (localObject1 == null) {
              return null;
            }
          }
          else
          {
            if ((localObject2 == null) || (!((Header)localObject2).getValue().equalsIgnoreCase("deflate"))) {
              break label540;
            }
            Log.a(a, i + "  Use InflaterInputStream get data....");
            localObject1 = new InflaterInputStream((InputStream)localObject1);
            continue;
          }
        }
      }
      catch (Exception localException)
      {
        Log.c(a, i + ":\tIOException,Failed to send message." + paramString, localException);
        return null;
      }
      Log.c(a, i + ":\tFailed to send message. StatusCode = " + ((HttpResponse)localObject2).getStatusLine().getStatusCode() + g.a + paramString);
      return null;
    }
  }
  
  private JSONObject a(String paramString, JSONObject paramJSONObject)
  {
    Object localObject2 = paramJSONObject.toString();
    int i = new Random().nextInt(1000);
    Log.c(a, i + ":\trequest: " + paramString + g.a + (String)localObject2);
    Object localObject1 = new HttpPost(paramString);
    paramJSONObject = new DefaultHttpClient(a());
    try
    {
      if (shouldCompressData())
      {
        localObject2 = f.a("content=" + (String)localObject2, Charset.defaultCharset().toString());
        ((HttpPost)localObject1).addHeader("Content-Encoding", "deflate");
        ((HttpPost)localObject1).setEntity(new InputStreamEntity(new ByteArrayInputStream((byte[])localObject2), localObject2.length));
        a(paramJSONObject);
        localObject1 = paramJSONObject.execute((HttpUriRequest)localObject1);
        b(paramJSONObject);
        if (((HttpResponse)localObject1).getStatusLine().getStatusCode() != 200) {
          break label386;
        }
        paramJSONObject = ((HttpResponse)localObject1).getEntity();
        if (paramJSONObject == null) {
          break label507;
        }
        paramJSONObject = paramJSONObject.getContent();
        localObject1 = ((HttpResponse)localObject1).getFirstHeader("Content-Encoding");
        if ((localObject1 == null) || (!((Header)localObject1).getValue().equalsIgnoreCase("deflate"))) {
          break label504;
        }
        paramJSONObject = new InflaterInputStream(paramJSONObject);
      }
      label386:
      for (;;)
      {
        paramJSONObject = a(paramJSONObject);
        Log.a(a, i + ":\tresponse: " + g.a + paramJSONObject);
        if (paramJSONObject == null)
        {
          return null;
          ArrayList localArrayList = new ArrayList(1);
          localArrayList.add(new BasicNameValuePair("content", (String)localObject2));
          ((HttpPost)localObject1).setEntity(new UrlEncodedFormEntity(localArrayList, "UTF-8"));
          break;
        }
      }
    }
    catch (ClientProtocolException paramJSONObject)
    {
      Log.c(a, i + ":\tClientProtocolException,Failed to send message." + paramString, paramJSONObject);
      return null;
      return new JSONObject(paramJSONObject);
      Log.c(a, i + ":\tFailed to send message. StatusCode = " + ((HttpResponse)localObject1).getStatusLine().getStatusCode() + g.a + paramString);
      return null;
    }
    catch (IOException paramJSONObject)
    {
      Log.c(a, i + ":\tIOException,Failed to send message." + paramString, paramJSONObject);
      return null;
    }
    catch (JSONException paramJSONObject)
    {
      Log.c(a, i + ":\tIOException,Failed to send message." + paramString, paramJSONObject);
      return null;
    }
    label504:
    label507:
    return null;
  }
  
  private void b(String paramString)
  {
    if ((g.d(paramString)) || (!(i.b.equals(paramString.trim()) ^ i.a.equals(paramString.trim())))) {
      throw new RuntimeException("验证请求方式失败[" + paramString + "]");
    }
  }
  
  protected HttpParams a()
  {
    BasicHttpParams localBasicHttpParams = new BasicHttpParams();
    HttpConnectionParams.setConnectionTimeout(localBasicHttpParams, 10000);
    HttpConnectionParams.setSoTimeout(localBasicHttpParams, 20000);
    HttpProtocolParams.setUserAgent(localBasicHttpParams, System.getProperty("http.agent"));
    return localBasicHttpParams;
  }
  
  protected void a(HttpClient paramHttpClient) {}
  
  protected void b(HttpClient paramHttpClient) {}
  
  public <T extends j> T execute(i parami, Class<T> paramClass)
  {
    String str = parami.c().trim();
    b(str);
    if (i.b.equals(str)) {
      parami = a(parami.b());
    }
    for (;;)
    {
      if (parami == null)
      {
        return null;
        if (i.a.equals(str)) {
          parami = a(parami.c, parami.a());
        }
      }
      else
      {
        try
        {
          parami = (j)paramClass.getConstructor(new Class[] { JSONObject.class }).newInstance(new Object[] { parami });
          return parami;
        }
        catch (SecurityException parami)
        {
          Log.b(a, "SecurityException", parami);
          return null;
        }
        catch (NoSuchMethodException parami)
        {
          for (;;)
          {
            Log.b(a, "NoSuchMethodException", parami);
          }
        }
        catch (IllegalArgumentException parami)
        {
          for (;;)
          {
            Log.b(a, "IllegalArgumentException", parami);
          }
        }
        catch (InstantiationException parami)
        {
          for (;;)
          {
            Log.b(a, "InstantiationException", parami);
          }
        }
        catch (IllegalAccessException parami)
        {
          for (;;)
          {
            Log.b(a, "IllegalAccessException", parami);
          }
        }
        catch (InvocationTargetException parami)
        {
          for (;;)
          {
            Log.b(a, "InvocationTargetException", parami);
          }
        }
      }
      parami = null;
    }
  }
  
  public h setHeader(Map<String, String> paramMap)
  {
    this.b = paramMap;
    return this;
  }
  
  public boolean shouldCompressData()
  {
    return false;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\common\ufp\net\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */