package com.taobao.munion.net;

import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

final class v$1
  implements X509TrustManager
{
  public final void checkClientTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString) {}
  
  public final void checkServerTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString) {}
  
  public final X509Certificate[] getAcceptedIssuers()
  {
    return new X509Certificate[0];
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\net\v$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */