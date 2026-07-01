package com.umeng.newxp.net;

import com.umeng.common.ufp.net.h;
import com.umeng.common.ufp.net.i;
import com.umeng.common.ufp.net.j;
import java.util.Map;

public class c
  extends h
{
  public <T extends j> T execute(i parami, Class<T> paramClass)
  {
    Map localMap = com.umeng.newxp.common.c.i();
    if ((parami instanceof a)) {
      localMap.put("MD", ((a)parami).e());
    }
    setHeader(localMap);
    return super.execute(parami, paramClass);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\net\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */