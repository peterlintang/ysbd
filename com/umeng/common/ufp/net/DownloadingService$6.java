package com.umeng.common.ufp.net;

import com.umeng.common.ufp.Log;
import com.umeng.common.ufp.util.g;
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

final class DownloadingService$6
  implements Runnable
{
  DownloadingService$6(String[] paramArrayOfString, boolean paramBoolean, Map paramMap) {}
  
  public final void run()
  {
    j = new Random().nextInt(1000);
    if (this.a == null) {
      Log.a(DownloadingService.a(), j + "service report: urls is null");
    }
    label458:
    for (;;)
    {
      return;
      String[] arrayOfString = this.a;
      int k = arrayOfString.length;
      int i = 0;
      for (;;)
      {
        if (i >= k) {
          break label458;
        }
        str1 = arrayOfString[i];
        Object localObject1 = g.a();
        Object localObject2 = localObject1.split(" ")[0];
        String str2 = localObject1.split(" ")[1];
        long l = System.currentTimeMillis();
        localObject1 = new StringBuilder(str1);
        ((StringBuilder)localObject1).append("&data=" + (String)localObject2);
        ((StringBuilder)localObject1).append("&time=" + str2);
        ((StringBuilder)localObject1).append("&ts=" + l);
        if (this.b) {
          ((StringBuilder)localObject1).append("&action_type=1");
        }
        while (this.c != null)
        {
          localObject2 = this.c.keySet().iterator();
          while (((Iterator)localObject2).hasNext())
          {
            str2 = (String)((Iterator)localObject2).next();
            ((StringBuilder)localObject1).append("&" + str2 + "=" + (String)this.c.get(str2));
          }
          ((StringBuilder)localObject1).append("&action_type=-2");
        }
        try
        {
          Log.a(DownloadingService.a(), j + ": service report:\tget: " + ((StringBuilder)localObject1).toString());
          localObject1 = new HttpGet(((StringBuilder)localObject1).toString());
          localObject2 = new BasicHttpParams();
          HttpConnectionParams.setConnectionTimeout((HttpParams)localObject2, 10000);
          HttpConnectionParams.setSoTimeout((HttpParams)localObject2, 20000);
          localObject1 = new DefaultHttpClient((HttpParams)localObject2).execute((HttpUriRequest)localObject1);
          Log.a(DownloadingService.a(), j + ": service report:status code:  " + ((HttpResponse)localObject1).getStatusLine().getStatusCode());
          int m = ((HttpResponse)localObject1).getStatusLine().getStatusCode();
          if (m == 200) {
            break;
          }
        }
        catch (ClientProtocolException localClientProtocolException)
        {
          for (;;)
          {
            Log.c(DownloadingService.a(), j + ": service report:\tClientProtocolException,Failed to send message." + str1, localClientProtocolException);
          }
        }
        catch (IOException localIOException)
        {
          for (;;)
          {
            Log.c(DownloadingService.a(), j + ": service report:\tIOException,Failed to send message." + str1, localIOException);
          }
        }
        i += 1;
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\common\ufp\net\DownloadingService$6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */