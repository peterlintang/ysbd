package com.umeng.newxp.view.feed;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.common.ufp.Log;
import com.umeng.newxp.controller.ExchangeDataService;
import java.util.Collection;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class FeedsManager
{
  static final String a = FeedsManager.class.getCanonicalName();
  Queue<FeedsManager.a> b = new ConcurrentLinkedQueue();
  Queue<FeedsManager.a> c = new ConcurrentLinkedQueue();
  Queue<Feed> d = new ConcurrentLinkedQueue();
  FeedsManager.IncubatedListener e;
  volatile boolean f = false;
  Context g;
  
  public FeedsManager(Context paramContext)
  {
    this.g = paramContext;
  }
  
  public void addMaterial(String paramString, Object paramObject)
  {
    if (TextUtils.isEmpty(paramString)) {
      throw new c("the invalid slot id.");
    }
    paramString = new ExchangeDataService(paramString);
    paramString.layoutType = 12;
    paramString = new FeedsManager.a(paramString, paramObject);
    this.b.add(paramString);
  }
  
  public <T extends Collection<Feed>> T getProducts(T paramT)
  {
    T ?;
    if (paramT == null)
    {
      ? = null;
      return ?;
    }
    for (;;)
    {
      Feed localFeed = (Feed)this.d.poll();
      ? = paramT;
      if (localFeed == null) {
        break;
      }
      paramT.add(localFeed);
      Log.a(a, "get feed product " + String.valueOf(localFeed.getTag()));
    }
  }
  
  public final void incubate()
  {
    this.f = true;
    for (FeedsManager.a locala = (FeedsManager.a)this.b.poll(); locala != null; locala = (FeedsManager.a)this.b.poll())
    {
      this.c.add(locala);
      Log.a(a, "start make feed product " + String.valueOf(locala.b));
      locala.a.requestDataAsyn(this.g, new FeedsManager.1(this, locala), true);
    }
  }
  
  public void setIncubatedListener(FeedsManager.IncubatedListener paramIncubatedListener)
  {
    this.e = paramIncubatedListener;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\feed\FeedsManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */