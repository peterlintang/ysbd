package com.umeng.socom.net;

import com.umeng.socom.b.g;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

class i
  implements Runnable
{
  i(String[] paramArrayOfString, boolean paramBoolean, Map paramMap) {}
  
  public void run()
  {
    j = new Random().nextInt(1000);
    if (this.a == null)
    {
      DownloadingService.a();
      new StringBuilder(String.valueOf(j)).append("service report: urls is null").toString();
      return;
    }
    String[] arrayOfString = this.a;
    int k = arrayOfString.length;
    int i = 0;
    label58:
    Object localObject1;
    Object localObject2;
    String str2;
    if (i < k)
    {
      str1 = arrayOfString[i];
      localObject1 = g.a();
      localObject2 = localObject1.split(" ")[0];
      str2 = localObject1.split(" ")[1];
      long l = System.currentTimeMillis();
      localObject1 = new StringBuilder(str1);
      ((StringBuilder)localObject1).append("&data=" + (String)localObject2);
      ((StringBuilder)localObject1).append("&time=" + str2);
      ((StringBuilder)localObject1).append("&ts=" + l);
      if (!this.b) {
        break label386;
      }
      ((StringBuilder)localObject1).append("&action_type=1");
      label196:
      if (this.c != null) {
        localObject2 = this.c.keySet().iterator();
      }
    }
    for (;;)
    {
      if (!((Iterator)localObject2).hasNext()) {}
      try
      {
        DownloadingService.a();
        new StringBuilder(String.valueOf(j)).append(": service report:\tget: ").append(((StringBuilder)localObject1).toString()).toString();
        localObject1 = new HttpGet(((StringBuilder)localObject1).toString());
        localObject2 = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout((HttpParams)localObject2, 10000);
        HttpConnectionParams.setSoTimeout((HttpParams)localObject2, 20000);
        localObject1 = new DefaultHttpClient((HttpParams)localObject2).execute((HttpUriRequest)localObject1);
        DownloadingService.a();
        new StringBuilder(String.valueOf(j)).append(": service report:status code:  ").append(((HttpResponse)localObject1).getStatusLine().getStatusCode()).toString();
        int m = ((HttpResponse)localObject1).getStatusLine().getStatusCode();
        if (m == 200) {
          break;
        }
      }
      catch (ClientProtocolException localClientProtocolException)
      {
        for (;;)
        {
          DownloadingService.a();
          new StringBuilder(String.valueOf(j)).append(": service report:\tClientProtocolException,Failed to send message.").append(str1).toString();
        }
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          DownloadingService.a();
          new StringBuilder(String.valueOf(j)).append(": service report:\tIOException,Failed to send message.").append(str1).toString();
        }
      }
      i += 1;
      break label58;
      break;
      label386:
      ((StringBuilder)localObject1).append("&action_type=-2");
      break label196;
      str2 = (String)((Iterator)localObject2).next();
      ((StringBuilder)localObject1).append("&" + str2 + "=" + (String)this.c.get(str2));
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socom\net\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */