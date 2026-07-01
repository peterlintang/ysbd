package com.umeng.newxp.controller;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.umeng.common.ufp.Log;
import com.umeng.common.ufp.net.g;
import com.umeng.newxp.Promoter;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class ExchangeDataService$1$1
  extends AsyncTask<Void, Void, List<Promoter>>
{
  ExchangeDataService$1$1(ExchangeDataService.1 param1, List paramList, int paramInt) {}
  
  protected List<Promoter> a(Void... paramVarArgs)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      Promoter localPromoter = (Promoter)localIterator.next();
      if (!TextUtils.isEmpty(localPromoter.img))
      {
        try
        {
          paramVarArgs = g.b(this.c.b.mContext, localPromoter.img);
          if ((paramVarArgs != null) && (paramVarArgs.exists())) {
            localArrayList.add(localPromoter);
          }
        }
        catch (IOException paramVarArgs)
        {
          for (;;)
          {
            Log.b(ExchangeDataService.a(this.c.b), "", paramVarArgs);
            paramVarArgs = null;
          }
          paramVarArgs = g.a(this.c.b.mContext, localPromoter.img);
        }
        if ((!TextUtils.isEmpty(paramVarArgs)) && (new File(paramVarArgs).exists())) {
          localArrayList.add(localPromoter);
        }
      }
    }
    return localArrayList;
  }
  
  protected void a(List<Promoter> paramList)
  {
    if (this.c.a != null) {
      this.c.a.dataReceived(this.b, paramList);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\controller\ExchangeDataService$1$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */