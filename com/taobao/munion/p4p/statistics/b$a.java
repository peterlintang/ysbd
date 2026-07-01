package com.taobao.munion.p4p.statistics;

import java.io.IOException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.protocol.BasicHttpContext;

class b$a
  implements Runnable
{
  private String b;
  
  public b$a(b paramb, String paramString)
  {
    this.b = paramString;
  }
  
  public void run()
  {
    try
    {
      DefaultHttpClient localDefaultHttpClient = new DefaultHttpClient();
      BasicHttpContext localBasicHttpContext = new BasicHttpContext();
      localDefaultHttpClient.execute(new HttpGet(this.b), localBasicHttpContext);
      return;
    }
    catch (ClientProtocolException localClientProtocolException)
    {
      b.b();
      new StringBuilder("Failed on sending user datas, error code is: ").append(localClientProtocolException.toString()).toString();
      return;
    }
    catch (IOException localIOException)
    {
      b.b();
      new StringBuilder("Failed on sending user datas, error code is: ").append(localIOException.toString()).toString();
      return;
    }
    catch (Exception localException)
    {
      b.b();
      new StringBuilder("Failed on sending user datas, error code is: ").append(localException.toString()).toString();
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\p4p\statistics\b$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */