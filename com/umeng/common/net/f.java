package com.umeng.common.net;

public class f
  extends j
{
  public h.a send(g paramg)
  {
    paramg = (h)execute(paramg, h.class);
    if (paramg == null) {
      return h.a.b;
    }
    return paramg.a;
  }
  
  public void sendAsync(g paramg, f.a parama)
  {
    new f.b(this, paramg, parama).execute(new Integer[0]);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\common\net\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */