package com.taobao.munion.net;

import java.security.SecureRandom;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

class v
{
  protected static X509TrustManager a = null;
  
  public static X509TrustManager a()
  {
    return a;
  }
  
  public static void a(X509TrustManager paramX509TrustManager)
  {
    a = paramX509TrustManager;
  }
  
  public static void b()
  {
    v.1 local1 = new v.1();
    try
    {
      SSLContext localSSLContext = SSLContext.getInstance("TLS");
      SecureRandom localSecureRandom = new SecureRandom();
      localSSLContext.init(null, new TrustManager[] { local1 }, localSecureRandom);
      HttpsURLConnection.setDefaultSSLSocketFactory(localSSLContext.getSocketFactory());
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\net\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */