package com.ireadercity.b2.h;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.ireadercity.b2.a;
import com.ireadercity.b2.bean.NetBookInfo;
import com.ireadercity.b2.bean.c;
import com.ireadercity.b2.e.h;
import com.ireadercity.b2.store.ak;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class p
{
  public static String a = "NetUtils";
  
  public static String a(String paramString1, String paramString2)
  {
    Object localObject = a.z + "/IOSServices/ValidateUser.aspx";
    for (;;)
    {
      try
      {
        localObject = new HttpPost((String)localObject);
        ((HttpPost)localObject).setHeader("User-Agent", "books by AireaderCity");
        List localList = y.a();
        localList.add(new BasicNameValuePair("BookStore_uID", paramString1));
        localList.add(new BasicNameValuePair("BookStore_pWD", paramString2));
        ((HttpPost)localObject).setEntity(new UrlEncodedFormEntity(localList, "UTF-8"));
        HttpConnectionParams.setConnectionTimeout(new BasicHttpParams(), 200000);
        paramString1 = h.a().execute((HttpUriRequest)localObject);
        if (paramString1.getStatusLine().getStatusCode() == 200)
        {
          paramString1 = EntityUtils.toString(paramString1.getEntity());
          return paramString1;
        }
      }
      catch (Exception paramString2)
      {
        try
        {
          new StringBuilder("strResult=").append(paramString1).toString();
          if (paramString1 != null) {
            break label171;
          }
          return null;
        }
        catch (Exception paramString2)
        {
          continue;
        }
        paramString2 = paramString2;
        paramString1 = null;
        paramString2.printStackTrace();
        continue;
      }
      label171:
      paramString1 = null;
    }
  }
  
  public static String a(String paramString1, String paramString2, String paramString3)
  {
    Object localObject = a.z + "/iOSServices/GetProgressByUserID.aspx";
    try
    {
      localObject = new HttpPost((String)localObject);
      ((HttpPost)localObject).setHeader("User-Agent", "books by AireaderCity");
      List localList = y.a();
      localList.add(new BasicNameValuePair("userid", paramString1));
      localList.add(new BasicNameValuePair("password", paramString2));
      localList.add(new BasicNameValuePair("jsonData", paramString3));
      localList.add(new BasicNameValuePair("AppID", "com.youloft.glsc"));
      ((HttpPost)localObject).setEntity(new UrlEncodedFormEntity(localList, "UTF-8"));
      HttpConnectionParams.setConnectionTimeout(new BasicHttpParams(), 200000);
      paramString1 = h.a().execute((HttpUriRequest)localObject);
      if (paramString1.getStatusLine().getStatusCode() == 200)
      {
        paramString1 = EntityUtils.toString(paramString1.getEntity());
        if (paramString1 != null) {
          return paramString1;
        }
        return null;
      }
    }
    catch (Exception paramString1)
    {
      for (;;)
      {
        paramString1.printStackTrace();
        paramString1 = null;
      }
    }
    return paramString1;
  }
  
  public static String a(String paramString1, String paramString2, String paramString3, Context paramContext)
  {
    Object localObject2 = null;
    Object localObject3 = null;
    new StringBuilder().append(paramString1).append(":").append(paramString2).append(":").append(paramString3).toString();
    Object localObject4 = a.z + "/iOSServices/RateABook.aspx";
    Object localObject1 = localObject2;
    try
    {
      localObject4 = new HttpPost((String)localObject4);
      localObject1 = localObject2;
      ((HttpPost)localObject4).setHeader("User-Agent", "books by AireaderCity");
      localObject1 = localObject2;
      List localList = y.a();
      localObject1 = localObject2;
      localList.add(new BasicNameValuePair("bookID", paramString1));
      localObject1 = localObject2;
      localList.add(new BasicNameValuePair("rate", paramString2));
      localObject1 = localObject2;
      localList.add(new BasicNameValuePair("BookStore_uID", PreferenceManager.getDefaultSharedPreferences(paramContext).getString("userName", null)));
      localObject1 = localObject2;
      localList.add(new BasicNameValuePair("Comments", URLEncoder.encode(paramString3)));
      localObject1 = localObject2;
      ((HttpPost)localObject4).setEntity(new UrlEncodedFormEntity(localList, "UTF-8"));
      localObject1 = localObject2;
      HttpConnectionParams.setConnectionTimeout(new BasicHttpParams(), 200000);
      localObject1 = localObject2;
      paramString2 = h.a().execute((HttpUriRequest)localObject4);
      localObject1 = localObject2;
      new StringBuilder("httpResponse.getStatusLine().getStatusCode()=").append(paramString2.getStatusLine().getStatusCode()).toString();
      paramString1 = (String)localObject3;
      localObject1 = localObject2;
      if (paramString2.getStatusLine().getStatusCode() == 200)
      {
        localObject1 = localObject2;
        paramString1 = EntityUtils.toString(paramString2.getEntity());
        localObject1 = paramString1;
        new StringBuilder("strResult=").append(paramString1).toString();
      }
      return paramString1;
    }
    catch (Exception paramString1)
    {
      paramString1.printStackTrace();
    }
    return (String)localObject1;
  }
  
  public static boolean a(String paramString)
  {
    if ((paramString == null) || (paramString.length() < 8)) {
      paramString = a;
    }
    for (;;)
    {
      return false;
      Object localObject = a.z + "/iOSServices/UserLogReceiver.aspx";
      try
      {
        localObject = new HttpPost((String)localObject);
        ((HttpPost)localObject).setHeader("User-Agent", "books by AireaderCity");
        List localList = y.a();
        localList.add(new BasicNameValuePair("PostData", paramString));
        ((HttpPost)localObject).setEntity(new UrlEncodedFormEntity(localList, "UTF-8"));
        HttpConnectionParams.setConnectionTimeout(new BasicHttpParams(), 200000);
        paramString = h.a().execute((HttpUriRequest)localObject);
        new StringBuilder("httpResponse.getStatusLine().getStatusCode()=").append(paramString.getStatusLine().getStatusCode()).toString();
        if (paramString.getStatusLine().getStatusCode() == 200)
        {
          paramString = EntityUtils.toString(paramString.getEntity());
          new StringBuilder("strResult=").append(paramString).toString();
          boolean bool = "1".equals(paramString);
          if (bool) {
            return true;
          }
        }
      }
      catch (Exception paramString)
      {
        paramString.printStackTrace();
      }
    }
    return false;
  }
  
  public static List<NetBookInfo> b(String paramString)
  {
    new StringBuilder("getRelatedBooksById: ").append(paramString).toString();
    Object localObject = a.z + "/IOSServices/GetRelatedBooks.aspx?bookid=" + paramString;
    for (;;)
    {
      try
      {
        localObject = new HttpPost((String)localObject);
        ((HttpPost)localObject).setHeader("User-Agent", "books by AireaderCity");
        List localList = y.a();
        localList.add(new BasicNameValuePair("bookid", paramString));
        ((HttpPost)localObject).setEntity(new UrlEncodedFormEntity(localList, "UTF-8"));
        HttpConnectionParams.setConnectionTimeout(new BasicHttpParams(), 200000);
        paramString = h.a().execute((HttpUriRequest)localObject);
        new StringBuilder("httpResponse.getStatusLine().getStatusCode()=").append(paramString.getStatusLine().getStatusCode()).toString();
        if (paramString.getStatusLine().getStatusCode() == 200)
        {
          paramString = EntityUtils.toString(paramString.getEntity());
          return ak.b(paramString);
        }
      }
      catch (Exception localException1)
      {
        try
        {
          new StringBuilder("strResult=").append(paramString).toString();
          if (paramString != null) {
            break label202;
          }
          return null;
        }
        catch (Exception localException2)
        {
          continue;
        }
        localException1 = localException1;
        paramString = null;
        localException1.printStackTrace();
        continue;
      }
      label202:
      paramString = null;
    }
  }
  
  public static List<c> c(String paramString)
  {
    return e(d(paramString));
  }
  
  private static String d(String paramString)
  {
    Object localObject2 = null;
    Object localObject3 = null;
    Object localObject4 = a.z + "/iOSServices/GetComments.aspx";
    new StringBuilder("storeBookId=").append(paramString).append(" url_=").append((String)localObject4).toString();
    Object localObject1 = localObject2;
    try
    {
      localObject4 = new HttpPost((String)localObject4);
      localObject1 = localObject2;
      ((HttpPost)localObject4).setHeader("User-Agent", "books by AireaderCity");
      localObject1 = localObject2;
      List localList = y.a();
      localObject1 = localObject2;
      localList.add(new BasicNameValuePair("bookID", paramString));
      localObject1 = localObject2;
      ((HttpPost)localObject4).setEntity(new UrlEncodedFormEntity(localList, "UTF-8"));
      localObject1 = localObject2;
      HttpConnectionParams.setConnectionTimeout(new BasicHttpParams(), 200000);
      localObject1 = localObject2;
      localObject4 = h.a().execute((HttpUriRequest)localObject4);
      localObject1 = localObject2;
      new StringBuilder("httpResponse.getStatusLine().getStatusCode()=").append(((HttpResponse)localObject4).getStatusLine().getStatusCode()).toString();
      paramString = (String)localObject3;
      localObject1 = localObject2;
      if (((HttpResponse)localObject4).getStatusLine().getStatusCode() == 200)
      {
        localObject1 = localObject2;
        paramString = EntityUtils.toString(((HttpResponse)localObject4).getEntity());
        localObject1 = paramString;
        new StringBuilder("strResult=").append(paramString).toString();
      }
      return paramString;
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
    }
    return (String)localObject1;
  }
  
  private static List<c> e(String paramString)
  {
    localArrayList = new ArrayList();
    try
    {
      paramString = new JSONObject(paramString).getJSONArray("returnJSON");
      int i = 0;
      while (i < paramString.length())
      {
        JSONObject localJSONObject = paramString.getJSONObject(i);
        c localc = new c();
        if (localJSONObject != null)
        {
          localc.a(localJSONObject.getString("BookComments"));
          localc.b(localJSONObject.getString("BookCommentsByUserID"));
          localc.c(localJSONObject.getString("BookCommentsDate"));
          localc.a(localJSONObject.getInt("BookRating"));
        }
        localArrayList.add(localc);
        i += 1;
      }
      return localArrayList;
    }
    catch (JSONException paramString)
    {
      paramString.printStackTrace();
      return localArrayList;
    }
    catch (NullPointerException paramString)
    {
      paramString.printStackTrace();
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\h\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */