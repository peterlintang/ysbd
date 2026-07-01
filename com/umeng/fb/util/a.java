package com.umeng.fb.util;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.umeng.fb.a.b;
import com.umeng.fb.a.c;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import org.apache.http.HttpEntity;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class a
{
  static final String a = "Helper";
  private static final int b = 30000;
  
  public static c a(String paramString1, String paramString2, JSONObject paramJSONObject)
  {
    return new com.umeng.fb.a.a().a(new b(paramString2, paramJSONObject, paramString1));
  }
  
  public static String a()
  {
    long l = System.currentTimeMillis();
    return "RP" + String.valueOf(l) + String.valueOf((int)(1000.0D + Math.random() * 9000.0D));
  }
  
  public static String a(String paramString)
  {
    return b(paramString, null, null);
  }
  
  public static String a(String paramString1, String paramString2, String paramString3)
  {
    long l = System.currentTimeMillis();
    return paramString1 + "[" + paramString2 + "_" + paramString3 + "]" + String.valueOf(l) + String.valueOf((int)(1000.0D + Math.random() * 9000.0D));
  }
  
  public static String a(Date paramDate, Context paramContext)
  {
    if (paramDate == null) {
      return "";
    }
    paramContext = paramContext.getResources().getConfiguration().locale;
    if (Locale.CHINA.equals(paramContext)) {}
    for (paramContext = new SimpleDateFormat("M月d日", paramContext);; paramContext = new SimpleDateFormat("dd MMMM", paramContext)) {
      return paramContext.format(paramDate);
    }
  }
  
  public static boolean a(String paramString1, String paramString2)
  {
    boolean bool = true;
    new StringBuilder("[reply_id_of_b]").append(paramString2).toString();
    if ((paramString1 == null) || (paramString2 == null)) {
      bool = false;
    }
    for (;;)
    {
      return bool;
      try
      {
        double d1 = Double.parseDouble(paramString1.substring(2));
        double d2 = Double.parseDouble(paramString2.substring(2));
        if (d1 < d2) {
          return false;
        }
      }
      catch (Exception localException)
      {
        new StringBuilder("reply id invalid.LocalMaxReplyId:").append(paramString1).append("reply_id_of_b:").append(paramString2).toString();
      }
    }
    return true;
  }
  
  private static String b(String paramString1, String paramString2, JSONObject paramJSONObject)
  {
    ArrayList localArrayList;
    if (paramString2 != null)
    {
      localArrayList = new ArrayList(1);
      localArrayList.add(new BasicNameValuePair(paramString2, paramJSONObject.toString()));
    }
    for (;;)
    {
      try
      {
        paramString2 = new UrlEncodedFormEntity(localArrayList, "UTF-8");
        paramString1 = new HttpPost(paramString1);
        paramString1.addHeader(paramString2.getContentType());
        ((HttpPost)paramString1).setEntity(paramString2);
        paramString2 = new DefaultHttpClient();
        paramJSONObject = paramString2.getParams();
        HttpConnectionParams.setConnectionTimeout(paramJSONObject, 30000);
        HttpConnectionParams.setSoTimeout(paramJSONObject, 30000);
        ConnManagerParams.setTimeout(paramJSONObject, 30000L);
        paramString1 = new HttpGet(paramString1);
      }
      catch (UnsupportedEncodingException paramString1)
      {
        try
        {
          paramString1 = paramString2.execute((HttpUriRequest)paramString1);
          if (paramString1.getStatusLine().getStatusCode() != 200) {
            break;
          }
          paramString1 = EntityUtils.toString(paramString1.getEntity());
          return paramString1;
        }
        catch (Exception paramString1)
        {
          paramString1.printStackTrace();
        }
        paramString1 = paramString1;
        throw new AssertionError(paramString1);
      }
    }
    return null;
  }
  
  public static String b(Date paramDate, Context paramContext)
  {
    if (paramDate == null) {
      return "";
    }
    return new SimpleDateFormat("yyyy-M-d HH:mm", paramContext.getResources().getConfiguration().locale).format(paramDate);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\fb\util\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */