package com.umeng.xp.net;

import android.content.Context;
import com.umeng.xp.Promoter;

public class c
{
  static final String a = "xp";
  private static final String b = c.class.getName();
  private Context c;
  private com.umeng.common.net.a d;
  private e e;
  private Promoter f;
  
  public c(Context paramContext, Promoter paramPromoter, e.a parama)
  {
    this.c = paramContext;
    this.f = paramPromoter;
    this.e = parama.a();
    this.d = new com.umeng.common.net.a(this.c.getApplicationContext(), "xp", paramPromoter.title, paramPromoter.url, new c.a(this));
    paramContext = parama.a(1).a();
    if (paramContext != null)
    {
      paramPromoter = paramContext.e();
      paramContext = paramPromoter;
      if (paramPromoter.startsWith("?")) {
        paramContext = paramPromoter.substring(1);
      }
      paramPromoter = a.getReprotList();
      parama = new String[paramPromoter.length];
      int i = 0;
      while (i < paramPromoter.length)
      {
        parama[i] = (paramPromoter[i] + paramContext);
        i += 1;
      }
      this.d.a(parama);
    }
  }
  
  public void a()
  {
    String str = b;
    this.d.a();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\net\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */