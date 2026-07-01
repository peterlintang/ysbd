package com.umeng.xp.net;

import com.umeng.common.net.j;

public class b
  extends j
{
  private static String[] a = { "http://ex.puata.info/api/q?", "http://ex.umengcloud.com/api/q?", "http://ex.mobmore.com/api/q?" };
  
  public g a(f paramf)
  {
    g localg = null;
    int i = 0;
    for (;;)
    {
      if (i < a.length)
      {
        paramf.a(a[i]);
        localg = (g)new j().setHeader(com.umeng.xp.common.g.a()).execute(paramf, g.class);
        if ((localg == null) || (localg.m == null)) {}
      }
      else
      {
        return localg;
      }
      i += 1;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\net\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */