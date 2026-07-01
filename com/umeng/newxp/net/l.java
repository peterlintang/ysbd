package com.umeng.newxp.net;

import android.content.Context;
import com.umeng.common.ufp.Log;
import com.umeng.common.ufp.net.a;
import com.umeng.newxp.Promoter;
import com.umeng.newxp.common.ExchangeConstants;
import com.umeng.newxp.common.c;

public class l
{
  static final String a = "xp";
  private static final String b = l.class.getName();
  private Context c;
  private a d;
  private m e;
  private Promoter f;
  
  public l(Context paramContext, Promoter paramPromoter, m.a parama)
  {
    this.c = paramContext;
    this.f = paramPromoter;
    this.e = parama.a();
    this.d = new a(this.c.getApplicationContext(), "xp", paramPromoter.title, paramPromoter.url, new l.a(this));
    paramContext = parama.a(1).a();
    if (paramContext != null)
    {
      paramPromoter = paramContext.e();
      paramContext = paramPromoter;
      if (paramPromoter.startsWith("?")) {
        paramContext = paramPromoter.substring(1);
      }
      paramPromoter = b.getReprotList();
      parama = new String[paramPromoter.length];
      int i = 0;
      while (i < paramPromoter.length)
      {
        parama[i] = (paramPromoter[i] + paramContext);
        i += 1;
      }
      this.d.a(parama);
      if ((ExchangeConstants.RICH_NOTIFICATION) && (13 < c.j())) {
        this.d.a(true);
      }
    }
    else
    {
      return;
    }
    this.d.a(false);
  }
  
  public void a()
  {
    Log.c(b, "start Download.");
    this.d.a();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\net\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */