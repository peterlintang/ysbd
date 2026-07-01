package com.umeng.newxp.controller;

import android.os.AsyncTask;
import com.umeng.newxp.net.c;
import com.umeng.newxp.net.e;
import com.umeng.newxp.net.f;

class ExchangeDataService$4
  extends AsyncTask<Void, Void, f>
{
  ExchangeDataService$4(ExchangeDataService paramExchangeDataService, XpListenersCenter.UMCreditQueryListener paramUMCreditQueryListener) {}
  
  protected f a(Void... paramVarArgs)
  {
    return (f)new c().execute(new e(ExchangeDataService.e(this.b), this.b.slot_id), f.class);
  }
  
  protected void a(f paramf)
  {
    int i;
    int j;
    if (paramf == null)
    {
      i = -1;
      if (paramf != null) {
        break label40;
      }
      j = 0;
      label12:
      if (paramf != null) {
        break label48;
      }
    }
    label40:
    label48:
    for (paramf = "";; paramf = paramf.d)
    {
      this.a.onComplete(i, j, paramf);
      return;
      i = paramf.b;
      break;
      j = paramf.c;
      break label12;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\controller\ExchangeDataService$4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */