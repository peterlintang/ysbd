package com.umeng.newxp.view.templates;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.umeng.common.ufp.Log;
import com.umeng.common.ufp.net.f;
import com.umeng.newxp.Promoter;
import com.umeng.newxp.a.d;
import com.umeng.newxp.controller.ExchangeDataService;
import com.umeng.newxp.controller.XpListenersCenter.InitializeListener;
import com.umeng.newxp.net.XpReportClient;
import com.umeng.newxp.net.m.a;
import com.umeng.newxp.view.widget.GridPage;
import com.umeng.newxp.view.widget.GridPage.PageInfo;
import com.umeng.newxp.view.widget.SwipeView;
import com.umeng.newxp.view.widget.SwipeViewPointer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GridTemplate
{
  private static final String a = GridTemplate.class.getName();
  private SwipeViewPointer b;
  private List<Promoter> c;
  public View contentView;
  private final Context d;
  private List<GridPage.PageInfo> e;
  private SwipeView f;
  private final ExchangeDataService g;
  private final int h;
  private final GridTemplateConfig i;
  private final Map<Integer, GridPage> j = new HashMap();
  
  public GridTemplate(List<Promoter> paramList, ExchangeDataService paramExchangeDataService, Context paramContext)
  {
    this(paramList, paramExchangeDataService, paramContext, null);
  }
  
  public GridTemplate(List<Promoter> paramList, ExchangeDataService paramExchangeDataService, Context paramContext, GridTemplateConfig paramGridTemplateConfig)
  {
    if ((paramList != null) && (paramList.size() > 0))
    {
      this.c = new ArrayList();
      this.c.addAll(paramList);
    }
    this.d = paramContext;
    this.g = paramExchangeDataService;
    paramList = paramGridTemplateConfig;
    if (paramGridTemplateConfig == null) {
      paramList = new GridTemplateConfig();
    }
    this.i = paramList;
    this.h = paramExchangeDataService.layoutType;
    this.contentView = e();
    if ((this.c != null) && (this.c.size() > 0))
    {
      b();
      return;
    }
    this.g.sessionId = "";
    this.g.requestDataAsyn(this.d, new GridTemplate.1(this));
  }
  
  private View a(Context paramContext, GridPage.PageInfo paramPageInfo)
  {
    paramContext = new GridPage(paramContext, new GridTemplate.3(this, this.c, paramPageInfo, paramContext), this.i);
    paramContext.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    return paramContext;
  }
  
  private List<GridPage.PageInfo> a(List<Promoter> paramList, int paramInt1, int paramInt2, int paramInt3)
  {
    ArrayList localArrayList = new ArrayList();
    if ((paramInt1 > 0) && (!this.i.c) && (paramList == null)) {
      return localArrayList;
    }
    int k;
    int m;
    label79:
    int n;
    if (paramList == null)
    {
      k = 0;
      m = k;
      if (paramInt2 - paramInt1 < k) {
        m = paramInt2 - paramInt1;
      }
      if (m % this.i.maxPsize != 0) {
        break label203;
      }
      k = m / this.i.maxPsize;
      n = 0;
      m = paramInt1;
      paramInt1 = n;
      label88:
      if (!this.i.c) {
        break label220;
      }
      n = k;
      label102:
      if (paramInt1 >= n) {
        break label238;
      }
      n = paramInt2 - 1 - (this.i.maxPsize + m - 1);
      if (n >= 0) {
        break label226;
      }
      n += this.i.maxPsize;
    }
    for (;;)
    {
      paramList = new GridPage.PageInfo(m, n);
      localArrayList.add(paramList);
      paramList.c = (paramInt3 + paramInt1);
      m = paramList.d + 1;
      paramList.e = true;
      paramInt1 += 1;
      break label88;
      k = paramList.size();
      break;
      label203:
      k = m / this.i.maxPsize + 1;
      break label79;
      label220:
      n = 1;
      break label102;
      label226:
      n = this.i.maxPsize;
    }
    label238:
    if (((paramInt3 > 0) && (localArrayList.size() > 0)) || (localArrayList.size() > 1))
    {
      paramList = (GridPage.PageInfo)localArrayList.get(localArrayList.size() - 1);
      if (paramList.b < this.i.maxPsize) {
        paramList.e = false;
      }
    }
    return localArrayList;
  }
  
  private void a(int paramInt1, int paramInt2, int paramInt3)
  {
    Object localObject = new ArrayList();
    int k = 0;
    for (;;)
    {
      if (k < paramInt2 - paramInt1 + 1) {
        try
        {
          ((List)localObject).add(this.c.get(paramInt1 + k));
          Log.c(a, "Report :" + ((Promoter)this.c.get(paramInt1 + k)).title);
          k += 1;
        }
        catch (Exception localException)
        {
          for (;;)
          {
            Log.b(a, "report error ", localException);
          }
        }
      }
    }
    Log.c(a, "============" + paramInt3 + "=============");
    if (((List)localObject).size() > 0)
    {
      localObject = new m.a(this.d).a(0).b(paramInt3).g(this.g.getTimeConsuming()).d(3).c(this.g.layoutType).a((Promoter[])((List)localObject).toArray(new Promoter[0])).f(com.umeng.newxp.common.c.a(this.d, this.g)).a(this.g.slot_id).a(this.g.sessionId, this.g.psid).a();
      new XpReportClient(this.d).sendAsync((f)localObject, null);
      return;
    }
    Log.b(a, "report error no promoter need report.");
  }
  
  private void b()
  {
    Object localObject;
    int k;
    if (this.g.initializeListener != null)
    {
      localObject = this.g.initializeListener;
      if (this.c != null) {
        break label109;
      }
      k = 0;
    }
    for (;;)
    {
      ((XpListenersCenter.InitializeListener)localObject).onReceived(k);
      localObject = this.c;
      if (this.c == null)
      {
        k = 0;
        this.e = a((List)localObject, 0, k, 0);
      }
      try
      {
        localObject = (GridPage.PageInfo)this.e.get(0);
        a(((GridPage.PageInfo)localObject).a, ((GridPage.PageInfo)localObject).d, ((GridPage.PageInfo)localObject).c);
        c();
        if (this.i.c) {
          requestNextPage();
        }
        return;
        label109:
        k = this.c.size();
        continue;
        k = this.c.size();
      }
      catch (Exception localException)
      {
        for (;;)
        {
          Log.b(a, "can`t send init page report ", localException);
        }
      }
    }
  }
  
  private void c()
  {
    int k = 0;
    if (k < this.e.size())
    {
      GridPage.PageInfo localPageInfo = (GridPage.PageInfo)this.e.get(k);
      GridPage localGridPage;
      if (localPageInfo.e)
      {
        if (!this.j.containsKey(Integer.valueOf(localPageInfo.c))) {
          break label99;
        }
        localGridPage = (GridPage)this.j.get(Integer.valueOf(localPageInfo.c));
        if (localPageInfo.f)
        {
          localGridPage.a(false);
          localPageInfo.f = false;
        }
      }
      for (;;)
      {
        k += 1;
        break;
        label99:
        localGridPage = (GridPage)a(this.d, localPageInfo);
        localGridPage.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.j.put(Integer.valueOf(localPageInfo.c), localGridPage);
        this.f.addView(localGridPage);
        if (this.i.d) {
          if (this.f.getPageControl() != null) {
            this.f.getPageControl().addPageCount(1);
          } else {
            this.f.setPageControl(this.b);
          }
        }
      }
    }
  }
  
  private int d()
  {
    Iterator localIterator = this.e.iterator();
    int k = 0;
    if (localIterator.hasNext())
    {
      if (!((GridPage.PageInfo)localIterator.next()).e) {
        break label45;
      }
      k += 1;
    }
    label45:
    for (;;)
    {
      break;
      return k;
    }
  }
  
  private View e()
  {
    View localView = View.inflate(this.d, d.g(this.d), null);
    this.f = ((SwipeView)localView.findViewById(com.umeng.common.ufp.c.a(this.d).b("umeng_xp_gallery")));
    this.f.setOnPageChangedListener(new GridTemplate.2(this));
    this.b = ((SwipeViewPointer)localView.findViewById(com.umeng.common.ufp.c.a(this.d).b("umeng_xp_gallery_page_pointer")));
    if (this.i.d)
    {
      this.b.setVisibility(0);
      if (this.i.a != null) {
        this.b.setActiveDrawable(this.i.a);
      }
      if (this.i.b != null) {
        this.b.setInactiveDrawable(this.i.b);
      }
      return localView;
    }
    this.b.setVisibility(8);
    return localView;
  }
  
  public void changed()
  {
    Iterator localIterator = this.j.keySet().iterator();
    while (localIterator.hasNext())
    {
      Integer localInteger = (Integer)localIterator.next();
      ((GridPage)this.j.get(localInteger)).a(true);
    }
  }
  
  public void debugNextPage(List<Promoter> paramList)
  {
    this.c.addAll(paramList);
    notifyTotalDataChanged();
    Log.c(a, "Total Data changed " + this.c.size());
  }
  
  public void notifyTotalDataChanged()
  {
    Object localObject = (GridPage.PageInfo)this.e.get(this.e.size() - 1);
    if (this.e.size() == 1) {}
    for (int k = ((GridPage.PageInfo)this.e.get(0)).d;; k = 0)
    {
      if (((GridPage.PageInfo)localObject).d + 1 >= this.c.size())
      {
        Log.c(a, "No data update....");
        ((GridPage.PageInfo)localObject).e = true;
        localObject = (GridPage.PageInfo)this.e.get(0);
        if ((k > 0) && (k < ((GridPage.PageInfo)localObject).d)) {
          a(k + 1, ((GridPage.PageInfo)localObject).d, ((GridPage.PageInfo)localObject).c);
        }
        Log.c(a, "new PageSize " + this.e.size() + " show size :" + d() + " ");
        c();
        return;
      }
      int m;
      if (((GridPage.PageInfo)localObject).b < this.i.maxPsize)
      {
        int n = this.i.maxPsize;
        int i1 = ((GridPage.PageInfo)localObject).b;
        m = this.c.size();
        n = n - i1 + ((GridPage.PageInfo)localObject).d;
        if (n >= m) {
          break label389;
        }
        ((GridPage.PageInfo)localObject).d = n;
        ((GridPage.PageInfo)localObject).e = true;
      }
      for (;;)
      {
        ((GridPage.PageInfo)localObject).b = (((GridPage.PageInfo)localObject).d - ((GridPage.PageInfo)localObject).a + 1);
        ((GridPage.PageInfo)localObject).f = true;
        m = ((GridPage.PageInfo)localObject).d;
        if ((this.e.size() > 0) && (!this.i.c)) {
          break;
        }
        localObject = a(this.c, m + 1, this.c.size(), ((GridPage.PageInfo)localObject).c + 1);
        if (localObject == null) {
          break;
        }
        localObject = ((List)localObject).iterator();
        while (((Iterator)localObject).hasNext())
        {
          GridPage.PageInfo localPageInfo = (GridPage.PageInfo)((Iterator)localObject).next();
          this.e.add(localPageInfo);
        }
        break;
        label389:
        ((GridPage.PageInfo)localObject).d = (m - 1);
      }
    }
  }
  
  public void requestNextPage()
  {
    new Handler().postDelayed(new GridTemplate.4(this), 300L);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\templates\GridTemplate.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */