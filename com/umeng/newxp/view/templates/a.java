package com.umeng.newxp.view.templates;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.umeng.common.ufp.net.f;
import com.umeng.newxp.Promoter;
import com.umeng.newxp.a.d;
import com.umeng.newxp.controller.ExchangeDataService;
import com.umeng.newxp.controller.XpListenersCenter.AdapterListener;
import com.umeng.newxp.net.XpReportClient;
import com.umeng.newxp.net.m.a;
import com.umeng.newxp.view.ExHeader;
import com.umeng.newxp.view.b;
import java.util.List;

public class a
{
  public View a;
  private final ListView b;
  private final View c;
  private final TextView d;
  private final ImageView e;
  private b f;
  private final Animation g;
  private int h = 5;
  private final Context i;
  private final ExchangeDataService j;
  private final ExHeader k;
  private XpListenersCenter.AdapterListener l = null;
  private List<Promoter> m;
  private boolean n = false;
  
  public a(Context paramContext, ExchangeDataService paramExchangeDataService, List<Promoter> paramList, ExHeader paramExHeader)
  {
    this.i = paramContext;
    this.a = View.inflate(this.i, d.i(this.i), null);
    this.b = ((ListView)this.a.findViewById(com.umeng.newxp.a.c.w(this.i)));
    this.j = paramExchangeDataService;
    this.k = paramExHeader;
    this.n = false;
    this.c = b();
    this.d = ((TextView)this.c.findViewById(com.umeng.newxp.a.c.I(this.i)));
    this.e = ((ImageView)this.c.findViewById(com.umeng.newxp.a.c.z(this.i)));
    this.g = AnimationUtils.loadAnimation(this.i, com.umeng.newxp.a.a.c(this.i));
    this.l = new a.1(this);
    if ((paramList != null) && (paramList.size() > 0))
    {
      this.m = paramList;
      c();
      return;
    }
    this.j.sessionId = "";
    this.j.requestDataAsyn(this.i, new a.2(this));
  }
  
  private View b()
  {
    return ((LayoutInflater)this.i.getSystemService("layout_inflater")).inflate(d.f(this.i), null);
  }
  
  private void c()
  {
    this.j.timeLine[2] = System.currentTimeMillis();
    this.c.setVisibility(4);
    this.c.setClickable(false);
    this.b.addFooterView(this.c);
    this.f = new a.3(this, this.b, this.i, d.e(this.i), this.k, this.m, 7, this.j);
    this.f.a(this.l);
    Object localObject = new a.a(this);
    if (this.b != null)
    {
      this.b.setOnScrollListener((AbsListView.OnScrollListener)localObject);
      this.j.page_index = 0;
    }
    this.j.timeLine[3] = System.currentTimeMillis();
    localObject = new m.a(this.i).a(0).b(0).g(this.j.getTimeConsuming()).d(this.h).c(7).a((Promoter[])this.m.toArray(new Promoter[0])).f(com.umeng.newxp.common.c.a(this.i, this.j)).a(this.j.slot_id).a(this.j.sessionId, this.j.psid).a();
    new XpReportClient(this.i).sendAsync((f)localObject, null);
  }
  
  public void a()
  {
    a.4 local4 = new a.4(this);
    this.j.pagination = true;
    if (this.j.page_index <= 0) {
      this.j.page_index = 1;
    }
    ExchangeDataService localExchangeDataService = this.j;
    localExchangeDataService.page_index += 1;
    this.j.requestDataAsyn(this.i, local4);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\templates\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */