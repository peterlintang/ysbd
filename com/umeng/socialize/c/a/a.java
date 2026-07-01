package com.umeng.socialize.c.a;

import com.umeng.socialize.common.SocializeConstants;
import com.umeng.socom.net.r;

public class a
  extends r
{
  public static final String a = "http://log.umsns.com/";
  
  public e a(b paramb)
  {
    if (SocializeConstants.DEBUG_MODE) {}
    try
    {
      Thread.sleep(3000L);
      paramb.a("http://log.umsns.com/");
      return (e)super.a(paramb, paramb.a);
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;) {}
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\c\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */