package com.umeng.xp.view;

import android.app.AlertDialog;
import android.content.Context;
import com.umeng.xp.Promoter;
import com.umeng.xp.controller.ExchangeDataService;

public class aB
  extends AlertDialog
{
  private Context a;
  private Promoter b;
  private int c;
  private int d;
  
  public aB(Context paramContext, Promoter paramPromoter, int paramInt1, int paramInt2, ExchangeDataService paramExchangeDataService)
  {
    super(paramContext);
    this.a = paramContext;
    this.b = paramPromoter;
    this.c = paramInt1;
    this.d = paramInt2;
    setMessage("下载" + this.b.title);
    setButton(-1, "下载", new aC(this, paramExchangeDataService));
    setButton(-2, "下载", new aD(this));
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


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\view\aB.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */