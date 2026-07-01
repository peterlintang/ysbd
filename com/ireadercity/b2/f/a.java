package com.ireadercity.b2.f;

import com.ireadercity.b2.b.q;
import com.ireadercity.b2.b.t;

public final class a
{
  public static int a()
  {
    try
    {
      int i = Integer.parseInt(t.b(q.a(com.ireadercity.b2.a.v)));
      return i;
    }
    catch (Exception localException1)
    {
      try
      {
        localException1.printStackTrace();
        return 0;
      }
      catch (Exception localException2)
      {
        localException2.printStackTrace();
      }
    }
    return 0;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\f\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */