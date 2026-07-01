package com.umeng.xp.net;

import com.umeng.common.net.f;
import com.umeng.common.net.h.a;

public class a
  extends f
{
  private static String[] a = { "http://ex.puata.info/api/r?", "http://ex.umengcloud.com/api/r?", "http://ex.mobmore.com/api/r?" };
  
  public static final String[] getReprotList()
  {
    return a;
  }
  
  public h.a send(com.umeng.common.net.g paramg)
  {
    int i = 0;
    while (i < a.length)
    {
      paramg.a(a[i]);
      setHeader(com.umeng.xp.common.g.a());
      h.a locala = super.send(paramg);
      if (locala == h.a.a) {
        return locala;
      }
      i += 1;
    }
    return h.a.b;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\net\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */