package com.umeng.newxp.net;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.umeng.newxp.common.persistence.PersistentCookieStore;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.cookie.BasicClientCookie;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

public class j
  extends i
{
  private static Context a;
  
  private void a(CookieStore paramCookieStore)
  {
    CookieSyncManager.createInstance(a);
    CookieManager localCookieManager = CookieManager.getInstance();
    if (localCookieManager != null)
    {
      localCookieManager.setAcceptCookie(true);
      Iterator localIterator = paramCookieStore.getCookies().iterator();
      while (localIterator.hasNext())
      {
        Object localObject1 = (Cookie)localIterator.next();
        Object localObject2 = ((Cookie)localObject1).getDomain();
        String str2 = ((Cookie)localObject1).getName();
        String str3 = ((Cookie)localObject1).getPath();
        String str4 = ((Cookie)localObject1).getValue();
        Date localDate = ((Cookie)localObject1).getExpiryDate();
        String str1 = "";
        if (localDate != null) {
          str1 = ((Cookie)localObject1).getExpiryDate().toString();
        }
        int i = ((Cookie)localObject1).getVersion();
        if (((String)localObject2).contains("mmstat.com"))
        {
          localObject2 = new BasicClientCookie(str2, ((Cookie)localObject1).getValue());
          ((BasicClientCookie)localObject2).setVersion(((Cookie)localObject1).getVersion());
          ((BasicClientCookie)localObject2).setDomain(".taobao.com");
          ((BasicClientCookie)localObject2).setPath(((Cookie)localObject1).getPath());
          ((BasicClientCookie)localObject2).setExpiryDate(((Cookie)localObject1).getExpiryDate());
          paramCookieStore.addCookie((Cookie)localObject2);
          localObject2 = new BasicClientCookie(str2, ((Cookie)localObject1).getValue());
          ((BasicClientCookie)localObject2).setVersion(((Cookie)localObject1).getVersion());
          ((BasicClientCookie)localObject2).setDomain(".tmall.com");
          ((BasicClientCookie)localObject2).setPath(((Cookie)localObject1).getPath());
          ((BasicClientCookie)localObject2).setExpiryDate(((Cookie)localObject1).getExpiryDate());
          paramCookieStore.addCookie((Cookie)localObject2);
          localObject2 = new BasicClientCookie(str2, ((Cookie)localObject1).getValue());
          ((BasicClientCookie)localObject2).setVersion(((Cookie)localObject1).getVersion());
          ((BasicClientCookie)localObject2).setDomain(".etao.com");
          ((BasicClientCookie)localObject2).setPath(((Cookie)localObject1).getPath());
          ((BasicClientCookie)localObject2).setExpiryDate(((Cookie)localObject1).getExpiryDate());
          paramCookieStore.addCookie((Cookie)localObject2);
          if ("cna".equals(str2)) {
            a(true);
          }
          localObject1 = new StringBuilder(str2);
          ((StringBuilder)localObject1).append("=").append(str4).append(";domain=taobao.com;path=").append(str3).append(";expiry=").append(str1).append(";version=").append(i);
          localCookieManager.setCookie("taobao.com", ((StringBuilder)localObject1).toString());
          localObject2 = new StringBuilder(str2);
          ((StringBuilder)localObject2).append("=").append(str4).append(";domain=etao.com;path=").append(str3).append(";expiry=").append(str1).append(";version=").append(i);
          localCookieManager.setCookie("etao.com", ((StringBuilder)localObject2).toString());
          new StringBuilder(str2).append("=").append(str4).append(";domain=tmall.com;path=").append(str3).append(";expiry=").append(str1).append(";version=").append(i);
          localCookieManager.setCookie("tmall.com", ((StringBuilder)localObject1).toString());
          new StringBuilder(str2).append("=").append(str4).append(";domain=mmstat.com;path=").append(str3).append(";expiry=").append(str1).append(";version=").append(i);
          localCookieManager.setCookie("mmstat.com", ((StringBuilder)localObject1).toString());
        }
      }
      CookieSyncManager.getInstance().sync();
    }
  }
  
  public static void a(boolean paramBoolean)
  {
    SharedPreferences.Editor localEditor = a.getSharedPreferences("persistentCookie", 0).edit();
    localEditor.putBoolean("ali_cookie_ready", paramBoolean);
    localEditor.commit();
  }
  
  public static void b(Context paramContext)
  {
    a = paramContext;
  }
  
  public static boolean b()
  {
    return a.getSharedPreferences("persistentCookie", 0).getBoolean("ali_cookie_ready", false);
  }
  
  public o a(n paramn)
  {
    execute(paramn, o.class);
    return null;
  }
  
  protected HttpParams a()
  {
    BasicHttpParams localBasicHttpParams = new BasicHttpParams();
    HttpConnectionParams.setConnectionTimeout(localBasicHttpParams, 2000);
    HttpConnectionParams.setSoTimeout(localBasicHttpParams, 2000);
    return localBasicHttpParams;
  }
  
  protected void a(HttpClient paramHttpClient)
  {
    if ((paramHttpClient instanceof DefaultHttpClient)) {
      ((DefaultHttpClient)paramHttpClient).setCookieStore(new PersistentCookieStore(a));
    }
  }
  
  protected void b(HttpClient paramHttpClient)
  {
    if ((paramHttpClient instanceof DefaultHttpClient)) {
      a(((DefaultHttpClient)paramHttpClient).getCookieStore());
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\net\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */