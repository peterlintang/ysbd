package com.umeng.newxp.net;

import android.content.Context;
import com.umeng.newxp.common.c;
import com.umeng.newxp.common.persistence.PersistentCookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.DefaultHttpClient;

public class i
  extends com.umeng.common.ufp.net.h
{
  private static Context a;
  
  public static void a(Context paramContext)
  {
    a = paramContext;
  }
  
  public o a(n paramn)
  {
    o localo = null;
    int i = 0;
    for (;;)
    {
      if (i < h.e.length)
      {
        paramn.a(h.e[i]);
        localo = (o)setHeader(c.i()).execute(paramn, o.class);
        if ((localo == null) || (localo.q == null)) {}
      }
      else
      {
        return localo;
      }
      i += 1;
    }
  }
  
  protected void a(HttpClient paramHttpClient)
  {
    if ((paramHttpClient instanceof DefaultHttpClient)) {
      ((DefaultHttpClient)paramHttpClient).setCookieStore(new PersistentCookieStore(a));
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\net\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */