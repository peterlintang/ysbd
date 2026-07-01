package com.umeng.xp.view;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.umeng.common.c;
import com.umeng.common.net.g;
import com.umeng.xp.Promoter;
import com.umeng.xp.controller.ExchangeDataService;
import com.umeng.xp.net.XpReportClient;
import com.umeng.xp.net.e.a;
import com.umeng.xp.view.widget.SwipeView;
import com.umeng.xp.view.widget.SwipeViewPointer;
import com.umeng.xp.view.widget.a;
import com.umeng.xp.view.widget.a.b;
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
  private Context d;
  private List<a.b> e;
  private SwipeView f;
  private ExchangeDataService g;
  private int h;
  private GridTemplateConfig i;
  private Map<Integer, a> j = new HashMap();
  
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
    this.g.requestDataAsyn(this.d, new R(this));
  }
  
  private View a(Context paramContext, a.b paramb)
  {
    paramContext = new a(paramContext, new T(this, this.c, paramb, paramContext), this.i);
    paramContext.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    return paramContext;
  }
  
  private List<a.b> a(List<Promoter> paramList, int paramInt1, int paramInt2, int paramInt3)
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
      paramList = new a.b(m, n);
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
      paramList = (a.b)localArrayList.get(localArrayList.size() - 1);
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
          String str1 = a;
          new StringBuilder("Report :").append(((Promoter)this.c.get(paramInt1 + k)).title).toString();
          k += 1;
        }
        catch (Exception localException)
        {
          for (;;)
          {
            str2 = a;
          }
        }
      }
    }
    String str2 = a;
    new StringBuilder("============").append(paramInt3).append("=============").toString();
    if (((List)localObject).size() > 0)
    {
      localObject = new e.a(this.d).a(0).b(paramInt3).c(this.g.getTimeConsuming()).d(3).c(this.g.layoutType).a((Promoter[])((List)localObject).toArray(new Promoter[0])).a(this.g.slot_id).b(this.g.sessionId).a();
      new XpReportClient(this.d).sendAsync((g)localObject, null);
      return;
    }
    localObject = a;
  }
  
  private void b()
  {
    Object localObject = this.c;
    int k;
    if (this.c == null) {
      k = 0;
    }
    for (;;)
    {
      this.e = a((List)localObject, 0, k, 0);
      try
      {
        localObject = (a.b)this.e.get(0);
        a(((a.b)localObject).a, ((a.b)localObject).d, ((a.b)localObject).c);
        c();
        if (this.i.c) {
          requestNextPage();
        }
        return;
        k = this.c.size();
      }
      catch (Exception localException)
      {
        for (;;)
        {
          String str = a;
        }
      }
    }
  }
  
  private void c()
  {
    int k = 0;
    if (k < this.e.size())
    {
      a.b localb = (a.b)this.e.get(k);
      a locala;
      if (localb.e)
      {
        if (!this.j.containsKey(Integer.valueOf(localb.c))) {
          break label99;
        }
        locala = (a)this.j.get(Integer.valueOf(localb.c));
        if (localb.f)
        {
          locala.a(false);
          localb.f = false;
        }
      }
      for (;;)
      {
        k += 1;
        break;
        label99:
        locala = (a)a(this.d, localb);
        locala.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.j.put(Integer.valueOf(localb.c), locala);
        this.f.addView(locala);
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
      if (!((a.b)localIterator.next()).e) {
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
    View localView = View.inflate(this.d, c.a(this.d).d("umeng_xp_handler_gallery"), null);
    this.f = ((SwipeView)localView.findViewById(c.a(this.d).b("umeng_xp_gallery")));
    this.f.setOnPageChangedListener(new S(this));
    this.b = ((SwipeViewPointer)localView.findViewById(c.a(this.d).b("umeng_xp_gallery_page_pointer")));
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
      ((a)this.j.get(localInteger)).a(true);
    }
  }
  
  public void debugNextPage(List<Promoter> paramList)
  {
    this.c.addAll(paramList);
    notifyTotalDataChanged();
    paramList = a;
    new StringBuilder("Total Data changed ").append(this.c.size()).toString();
  }
  
  public void notifyTotalDataChanged()
  {
    Object localObject1 = (a.b)this.e.get(this.e.size() - 1);
    if (this.e.size() == 1) {}
    for (int k = ((a.b)this.e.get(0)).d;; k = 0)
    {
      Object localObject2;
      if (((a.b)localObject1).d + 1 >= this.c.size())
      {
        localObject2 = a;
        ((a.b)localObject1).e = true;
        localObject1 = (a.b)this.e.get(0);
        if ((k > 0) && (k < ((a.b)localObject1).d)) {
          a(k + 1, ((a.b)localObject1).d, ((a.b)localObject1).c);
        }
        localObject1 = a;
        new StringBuilder("new PageSize ").append(this.e.size()).append(" show size :").append(d()).append(" ").toString();
        c();
        return;
      }
      int m;
      if (((a.b)localObject1).b < this.i.maxPsize)
      {
        int n = this.i.maxPsize;
        int i1 = ((a.b)localObject1).b;
        m = this.c.size();
        n = n - i1 + ((a.b)localObject1).d;
        if (n >= m) {
          break label385;
        }
        ((a.b)localObject1).d = n;
        ((a.b)localObject1).e = true;
      }
      for (;;)
      {
        ((a.b)localObject1).b = (((a.b)localObject1).d - ((a.b)localObject1).a + 1);
        ((a.b)localObject1).f = true;
        m = ((a.b)localObject1).d;
        if ((this.e.size() > 0) && (!this.i.c)) {
          break;
        }
        localObject1 = a(this.c, m + 1, this.c.size(), ((a.b)localObject1).c + 1);
        if (localObject1 == null) {
          break;
        }
        localObject1 = ((List)localObject1).iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (a.b)((Iterator)localObject1).next();
          this.e.add(localObject2);
        }
        break;
        label385:
        ((a.b)localObject1).d = (m - 1);
      }
    }
  }
  
  public void requestNextPage()
  {
    new Handler().postDelayed(new V(this), 300L);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\view\GridTemplate.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */