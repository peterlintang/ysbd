package com.umeng.newxp.controller;

import android.os.AsyncTask;
import com.umeng.newxp.net.c;
import com.umeng.newxp.net.d;
import com.umeng.newxp.net.f;

class ExchangeDataService$5
  extends AsyncTask<Void, Void, f>
{
  ExchangeDataService$5(ExchangeDataService paramExchangeDataService, int paramInt, XpListenersCenter.UMCreditListener paramUMCreditListener) {}
  
  protected f a(Void... paramVarArgs)
  {
    return (f)new c().execute(new d(ExchangeDataService.e(this.c), this.c.slot_id, this.a), f.class);
  }
  
  protected void a(f paramf)
  {
    int i;
    if (paramf == null)
    {
      i = -1;
      if (paramf != null) {
        break label33;
      }
    }
    label33:
    for (paramf = "";; paramf = paramf.d)
    {
      this.b.onComplete(i, paramf);
      return;
      i = paramf.b;
      break;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\controller\ExchangeDataService$5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */