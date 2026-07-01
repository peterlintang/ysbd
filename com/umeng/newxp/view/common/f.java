package com.umeng.newxp.view.common;

import android.app.AlertDialog;
import android.content.Context;
import com.umeng.newxp.Promoter;
import com.umeng.newxp.controller.ExchangeDataService;

public class f
  extends AlertDialog
{
  private final Context a;
  private final Promoter b;
  private final int c;
  private final int d;
  
  public f(Context paramContext, Promoter paramPromoter, int paramInt1, int paramInt2, ExchangeDataService paramExchangeDataService)
  {
    super(paramContext);
    this.a = paramContext;
    this.b = paramPromoter;
    this.c = paramInt1;
    this.d = paramInt2;
    setMessage("下载" + this.b.title);
    setButton(-1, "下载", new f.1(this, paramExchangeDataService));
    setButton(-2, "下载", new f.2(this));
  }
  
  int a(Context paramContext)
  {
    switch (this.c)
    {
    case 0: 
    case 1: 
    case 2: 
    case 3: 
    case 6: 
    case 8: 
    case 9: 
    default: 
      return 2;
    case 7: 
      return 3;
    }
    return 3;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\common\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */