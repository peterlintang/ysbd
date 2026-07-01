package com.umeng.newxp.view;

import android.content.Context;
import android.widget.ListView;
import com.umeng.newxp.Promoter;
import com.umeng.newxp.common.ExchangeConstants;
import com.umeng.newxp.controller.ExchangeDataService;
import com.umeng.newxp.controller.XpListenersCenter.AdapterListener;
import com.umeng.newxp.controller.XpListenersCenter.ListClickListener;
import com.umeng.newxp.controller.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class b
{
  private int a;
  private a b;
  private ListView c;
  private List<Promoter> d;
  private ExchangeDataService e;
  
  public b(ListView paramListView, Context paramContext, int paramInt1, ExHeader paramExHeader, List<Promoter> paramList, int paramInt2, ExchangeDataService paramExchangeDataService)
  {
    this.a = paramInt2;
    this.c = paramListView;
    this.e = paramExchangeDataService;
    this.d = new ArrayList();
    this.d.addAll(paramList);
    this.b = new b.1(this, paramContext, 17367045, this.d, paramInt1, this.a, this.e);
    if (paramExHeader != null)
    {
      paramListView = paramExHeader.getExDataService().getPreloadData();
      if ((paramListView != null) && (paramListView.b())) {
        a(paramContext, paramExHeader, paramListView);
      }
    }
    else
    {
      a();
      return;
    }
    paramExHeader.preload(paramContext, new b.2(this, paramExHeader, paramContext));
  }
  
  private void a(Context paramContext, ExHeader paramExHeader, d paramd)
  {
    try
    {
      if (paramd.a("display_type", "1") > 0) {
        paramExHeader.attachToList(paramContext, this.c);
      }
      return;
    }
    catch (Throwable paramContext)
    {
      paramContext = ExchangeConstants.LOG_TAG;
    }
  }
  
  public void a()
  {
    this.c.setAdapter(this.b);
    this.c.setItemsCanFocus(true);
  }
  
  public void a(int paramInt) {}
  
  public void a(XpListenersCenter.AdapterListener paramAdapterListener)
  {
    if (this.b != null) {
      this.b.a(paramAdapterListener);
    }
  }
  
  public void a(XpListenersCenter.ListClickListener paramListClickListener)
  {
    this.b.a = paramListClickListener;
  }
  
  public void a(List<Promoter> paramList)
  {
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      Promoter localPromoter = (Promoter)paramList.next();
      if (localPromoter.display_type != 1)
      {
        this.d.add(localPromoter);
        this.b.notifyDataSetChanged();
      }
    }
  }
  
  public a b()
  {
    return this.b;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */