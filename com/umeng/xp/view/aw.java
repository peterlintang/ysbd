package com.umeng.xp.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.ViewSwitcher;
import com.umeng.common.b.i;
import com.umeng.xp.Promoter;
import com.umeng.xp.a.c;
import com.umeng.xp.a.d;
import com.umeng.xp.common.f;
import com.umeng.xp.controller.ExchangeDataService;
import com.umeng.xp.controller.a.a;
import com.umeng.xp.controller.b;
import com.umeng.xp.controller.f.a;
import com.umeng.xp.net.XpReportClient;
import com.umeng.xp.net.e.a;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class aw
  implements f.a
{
  private static final int c = 3;
  private static boolean d = false;
  private static int k = 1000;
  int a;
  View b;
  private Context e;
  private ViewGroup f;
  private ExchangeDataService g;
  private com.umeng.xp.controller.a h;
  private List<Promoter> i;
  private ViewSwitcher j;
  private int l = 0;
  private GridView m;
  private GridView n;
  private Map<Integer, aw.a> o;
  private Animation p;
  private View.OnClickListener q;
  private aw.b r;
  private GridView s;
  
  public aw(Context paramContext, ViewGroup paramViewGroup, int paramInt, ExchangeDataService paramExchangeDataService)
  {
    this.e = paramContext;
    this.f = paramViewGroup;
    this.a = paramInt;
    if (d)
    {
      d();
      this.p = AnimationUtils.loadAnimation(this.e, com.umeng.xp.a.a.o(this.e));
      this.p.setDuration(2000L);
    }
    this.g = paramExchangeDataService;
    paramContext = new ax(this);
    this.g.requestDataAsyn(this.e, paramContext);
  }
  
  private void a(int paramInt)
  {
    this.s = null;
    List localList;
    if (paramInt == c.K(this.e))
    {
      localList = this.h.a(3);
      this.s = this.m;
      this.s.setNumColumns(3);
    }
    for (paramInt = 0; (localList == null) || (localList.size() == 0); paramInt = 1)
    {
      return;
      localList = this.h.a(3);
      this.s = this.n;
    }
    Iterator localIterator = localList.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (a.a)localIterator.next();
      localObject = new e.a(this.e).a(0).b(0).c(this.g.getTimeConsuming()).d(1).c(this.a).a(new Promoter[] { ((a.a)localObject).a }).a(this.g.slot_id).b(this.g.sessionId).a();
      new XpReportClient(this.e).sendAsync((com.umeng.common.net.g)localObject, null);
    }
    this.r = ((aw.b)this.s.getAdapter());
    if (this.r == null)
    {
      this.r = new aw.b(this, this.e, localList, paramInt);
      this.s.setAdapter(this.r);
      return;
    }
    this.r.a = localList;
    this.r.notifyDataSetChanged();
  }
  
  private void a(a.a parama, View paramView)
  {
    if (this.q != null) {
      this.q.onClick(paramView);
    }
    if (parama == null) {
      return;
    }
    b.a(parama, this.e, this.g, this.a, false, 0);
  }
  
  private void d()
  {
    this.o = new HashMap();
    this.o.put(Integer.valueOf(3), new aw.a(this, AnimationUtils.loadAnimation(this.e, com.umeng.xp.a.a.e(this.e)), AnimationUtils.loadAnimation(this.e, com.umeng.xp.a.a.j(this.e))));
    this.o.put(Integer.valueOf(4), new aw.a(this, AnimationUtils.loadAnimation(this.e, com.umeng.xp.a.a.f(this.e)), AnimationUtils.loadAnimation(this.e, com.umeng.xp.a.a.i(this.e))));
    this.o.put(Integer.valueOf(1), new aw.a(this, AnimationUtils.loadAnimation(this.e, com.umeng.xp.a.a.g(this.e)), AnimationUtils.loadAnimation(this.e, com.umeng.xp.a.a.l(this.e))));
    this.o.put(Integer.valueOf(2), new aw.a(this, AnimationUtils.loadAnimation(this.e, com.umeng.xp.a.a.h(this.e)), AnimationUtils.loadAnimation(this.e, com.umeng.xp.a.a.k(this.e))));
    this.o.put(Integer.valueOf(6), new aw.a(this, AnimationUtils.loadAnimation(this.e, com.umeng.xp.a.a.m(this.e)), AnimationUtils.loadAnimation(this.e, com.umeng.xp.a.a.n(this.e))));
    Object localObject = ((WindowManager)this.e.getSystemService("window")).getDefaultDisplay();
    new i(this.e);
    int i1 = i.a(55.0F);
    f localf1 = new f(-90.0F, 0.0F, ((Display)localObject).getWidth() / 2, i1 / 2, true, true);
    localf1.setInterpolator(new AccelerateInterpolator());
    f localf2 = new f(0.0F, 90.0F, ((Display)localObject).getWidth() / 2, i1 / 2, false, true);
    localf2.setInterpolator(new AccelerateInterpolator());
    this.o.put(Integer.valueOf(7), new aw.a(this, localf1, localf2, k));
    localf1 = new f(-90.0F, 0.0F, ((Display)localObject).getWidth() / 2, i1 / 2, true, false);
    localf1.setInterpolator(new AccelerateInterpolator());
    localObject = new f(0.0F, 90.0F, ((Display)localObject).getWidth() / 2, i1 / 2, false, false);
    ((f)localObject).setInterpolator(new AccelerateInterpolator());
    this.o.put(Integer.valueOf(8), new aw.a(this, localf1, (Animation)localObject, k));
  }
  
  private aw.a e()
  {
    if ((this.o == null) || (this.o.size() == 0)) {
      return new aw.a(this, AnimationUtils.loadAnimation(this.e, com.umeng.xp.a.a.e(this.e)), AnimationUtils.loadAnimation(this.e, com.umeng.xp.a.a.j(this.e)));
    }
    Collection localCollection = this.o.values();
    int i1 = this.o.size();
    return ((aw.a[])localCollection.toArray(new aw.a[0]))[new java.util.Random().nextInt(i1)];
  }
  
  public void a()
  {
    int i1;
    if ((this.b != null) && (this.b.getLocalVisibleRect(new Rect())) && (this.b.getWindowVisibility() == 0) && (!ao.a()))
    {
      i1 = this.l;
      this.l = (i1 + 1);
      if (i1 % 2 != 0) {
        break label151;
      }
      i1 = 1;
      if (d)
      {
        aw.a locala = e();
        this.j.setInAnimation(locala.a);
        this.j.setOutAnimation(locala.b);
      }
      this.j.setDisplayedChild(i1);
      if (!d) {
        switch (i1)
        {
        default: 
          a(c.K(this.e));
        }
      }
    }
    for (;;)
    {
      new com.umeng.xp.controller.g(this).start();
      return;
      label151:
      i1 = 0;
      break;
      a(c.J(this.e));
    }
  }
  
  public void a(View.OnClickListener paramOnClickListener)
  {
    this.q = paramOnClickListener;
  }
  
  protected void b()
  {
    this.b = View.inflate(this.e, d.z(this.e), null);
    this.j = ((ViewSwitcher)this.b.findViewById(c.L(this.e)));
    this.j.setDisplayedChild(0);
    this.m = ((GridView)this.j.findViewById(c.K(this.e)).findViewById(c.x(this.e)));
    this.n = ((GridView)this.j.findViewById(c.J(this.e)).findViewById(c.x(this.e)));
    Object localObject = new ay(this);
    this.m.setOnItemClickListener((AdapterView.OnItemClickListener)localObject);
    this.n.setOnItemClickListener((AdapterView.OnItemClickListener)localObject);
    a(c.K(this.e));
    a(c.J(this.e));
    if (d)
    {
      localObject = e();
      this.j.setInAnimation(((aw.a)localObject).a);
      this.j.setOutAnimation(((aw.a)localObject).b);
    }
    new i(this.e);
    int i1 = i.a(55.0F);
    localObject = new RelativeLayout(this.e);
    ((RelativeLayout)localObject).setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
    ((RelativeLayout)localObject).setBackgroundColor(Color.alpha(0));
    this.f.addView((View)localObject);
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, i1);
    ((RelativeLayout)localObject).addView(this.b, localLayoutParams);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\view\aw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */