package com.ireadercity.b2.e;

import java.net.Socket;
import java.security.KeyStore;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import org.apache.http.HttpVersion;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.scheme.SocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpProtocolParams;

public final class h
  extends org.apache.http.conn.ssl.SSLSocketFactory
{
  SSLContext a = SSLContext.getInstance("TLS");
  
  private h(KeyStore paramKeyStore)
  {
    super(paramKeyStore);
    paramKeyStore = new i(this);
    this.a.init(null, new TrustManager[] { paramKeyStore }, null);
  }
  
  public static DefaultHttpClient a()
  {
    try
    {
      Object localObject = KeyStore.getInstance(KeyStore.getDefaultType());
      ((KeyStore)localObject).load(null, null);
      localObject = new h((KeyStore)localObject);
      ((org.apache.http.conn.ssl.SSLSocketFactory)localObject).setHostnameVerifier(org.apache.http.conn.ssl.SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
      BasicHttpParams localBasicHttpParams = new BasicHttpParams();
      HttpProtocolParams.setVersion(localBasicHttpParams, HttpVersion.HTTP_1_1);
      HttpProtocolParams.setContentCharset(localBasicHttpParams, "UTF-8");
      SchemeRegistry localSchemeRegistry = new SchemeRegistry();
      localSchemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
      localSchemeRegistry.register(new Scheme("https", (SocketFactory)localObject, 443));
      localObject = new DefaultHttpClient(new ThreadSafeClientConnManager(localBasicHttpParams, localSchemeRegistry), localBasicHttpParams);
      return (DefaultHttpClient)localObject;
    }
    catch (Exception localException) {}
    return new DefaultHttpClient();
  }
  
  public final Socket createSocket()
  {
    return this.a.getSocketFactory().createSocket();
  }
  
  public final Socket createSocket(Socket paramSocket, String paramString, int paramInt, boolean paramBoolean)
  {
    return this.a.getSocketFactory().createSocket(paramSocket, paramString, paramInt, paramBoolean);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\e\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */