package com.ireadercity.b2.e;

import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Message;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.StatusLine;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.BufferedHttpEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.DefaultHttpRequestRetryHandler;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.util.EntityUtils;

public final class g
  implements Runnable
{
  private static String a = "MyHttpConnection";
  private String b;
  private int c;
  private Handler d;
  private String e;
  private HashMap<String, String> f;
  private List<NameValuePair> g;
  private int h;
  private StatusLine i;
  private DefaultHttpClient j;
  
  public g()
  {
    this(new Handler());
  }
  
  public g(Handler paramHandler)
  {
    this.d = paramHandler;
  }
  
  private void a(int paramInt, String paramString)
  {
    this.c = paramInt;
    this.b = paramString;
    this.e = null;
    f.a().a(this);
  }
  
  private void a(HttpRequest paramHttpRequest)
  {
    if (this.f != null)
    {
      Iterator localIterator = this.f.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        paramHttpRequest.setHeader(str, (String)this.f.get(str));
      }
    }
  }
  
  private void a(HttpPost paramHttpPost)
  {
    if (this.g != null) {
      paramHttpPost.setEntity(new UrlEncodedFormEntity(this.g, "UTF-8"));
    }
  }
  
  public final List<NameValuePair> a()
  {
    return this.g;
  }
  
  public final void a(int paramInt)
  {
    this.h = paramInt;
  }
  
  public final void a(String paramString)
  {
    a(0, paramString);
  }
  
  public final void a(HashMap<String, String> paramHashMap)
  {
    this.f = paramHashMap;
  }
  
  public final void a(List<NameValuePair> paramList)
  {
    this.g = paramList;
  }
  
  public final void b(String paramString)
  {
    a(1, paramString);
  }
  
  public final void run()
  {
    this.d.sendMessage(Message.obtain(this.d, 0));
    this.j = h.a();
    if (this.h == 0) {
      this.h = 30000;
    }
    this.j.setHttpRequestRetryHandler(new DefaultHttpRequestRetryHandler(3, false));
    HttpConnectionParams.setConnectionTimeout(this.j.getParams(), this.h);
    HttpConnectionParams.setSoTimeout(this.j.getParams(), this.h);
    Object localObject1 = a;
    new StringBuilder("REQUEST:").append(this.b).toString();
    localObject1 = null;
    try
    {
      switch (this.c)
      {
      case 0: 
      case 1: 
      case 2: 
      case 3: 
      case 4: 
        for (;;)
        {
          this.i = ((HttpResponse)localObject1).getStatusLine();
          if (this.c < 4)
          {
            localObject1 = EntityUtils.toString(((HttpResponse)localObject1).getEntity());
            localObject1 = Message.obtain(this.d, 2, localObject1);
            this.d.sendMessage((Message)localObject1);
          }
          f.a().b(this);
          return;
          localObject1 = this.j.execute(new HttpGet(this.b));
          continue;
          localObject1 = new HttpPost(this.b);
          a((HttpRequest)localObject1);
          a((HttpPost)localObject1);
          if (this.e != null) {
            ((HttpPost)localObject1).setEntity(new StringEntity(this.e));
          }
          localObject1 = this.j.execute((HttpUriRequest)localObject1);
          continue;
          localObject1 = new HttpPut(this.b);
          ((HttpPut)localObject1).setEntity(new StringEntity(this.e));
          localObject1 = this.j.execute((HttpUriRequest)localObject1);
          continue;
          localObject1 = this.j.execute(new HttpDelete(this.b));
          continue;
          localObject1 = new HttpPost(this.b);
          a((HttpRequest)localObject1);
          a((HttpPost)localObject1);
          if (this.e != null) {
            ((HttpPost)localObject1).setEntity(new StringEntity(this.e));
          }
          localObject1 = this.j.execute((HttpUriRequest)localObject1);
          localObject2 = BitmapFactory.decodeStream(new BufferedHttpEntity(((HttpResponse)localObject1).getEntity()).getContent());
          this.d.sendMessage(Message.obtain(this.d, 2, localObject2));
        }
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localException.printStackTrace();
        Object localObject2 = a;
        localException.getMessage();
        this.d.sendMessage(Message.obtain(this.d, 1, localException));
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\e\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */