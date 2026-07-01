package com.umeng.newxp.view.handler.umwall;

import android.content.res.Resources;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.taobao.munion.utils.k;
import com.umeng.newxp.common.a.a;
import com.umeng.newxp.controller.ExchangeDataService;
import com.umeng.newxp.view.common.actionbar.ActionBar;
import com.umeng.newxp.view.common.actionbar.ActionBar.a;
import com.umeng.newxp.view.handler.umwall.tab.TabPageIndicator;
import com.umeng.newxp.view.widget.KeyboardListenRelativeLayout;

public class d
{
  private static final String r = UMWall.class.getCanonicalName();
  View a;
  FragmentActivity b;
  ActionBar c;
  com.umeng.newxp.view.common.actionbar.b d;
  ImageView e;
  ViewGroup f;
  ViewGroup g;
  d.a h;
  int i = -1;
  View j;
  View k;
  EditText l;
  View m;
  View n;
  int o;
  InputMethodManager p;
  c q;
  private UMWall.ServiceZygote s;
  private com.umeng.newxp.view.common.actionbar.d t;
  
  public d(View paramView, FragmentActivity paramFragmentActivity, d.a parama)
  {
    this.a = paramView;
    this.b = paramFragmentActivity;
    this.h = parama;
    this.f = ((ViewGroup)paramView.findViewById(UMWallRes.umeng_xp_ew_title_layout(this.b)));
    this.g = ((ViewGroup)paramView.findViewById(UMWallRes.umeng_xp_content(this.b)));
  }
  
  private void a(TabPageIndicator paramTabPageIndicator)
  {
    int[] arrayOfInt;
    switch (d.8.a[this.h.ordinal()])
    {
    default: 
      arrayOfInt = new int[3];
      arrayOfInt[0] = UMWallRes.drawable_umeng_xp_hl_indicator_default(this.b);
      arrayOfInt[1] = -12303292;
      arrayOfInt[2] = -16777216;
    }
    for (;;)
    {
      paramTabPageIndicator.setTabBackground(arrayOfInt[0]);
      paramTabPageIndicator.setTextColor(arrayOfInt[1]);
      paramTabPageIndicator.setColorSelected(arrayOfInt[2]);
      return;
      arrayOfInt = new int[3];
      arrayOfInt[0] = UMWallRes.drawable_umeng_xp_hl_indicator_tb(this.b);
      arrayOfInt[1] = this.b.getResources().getColor(UMWallRes.color_indicator_text_color(this.b));
      arrayOfInt[2] = this.b.getResources().getColor(UMWallRes.color_indicator_text_color_selected(this.b));
    }
  }
  
  private void a(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.m.setVisibility(0);
      this.j.setVisibility(8);
      return;
    }
    this.m.setVisibility(8);
    this.j.setVisibility(0);
    this.l.requestFocus();
    new Handler().postDelayed(new d.6(this), 300L);
  }
  
  private void f()
  {
    this.p = ((InputMethodManager)this.b.getSystemService("input_method"));
    this.l = ((EditText)this.a.findViewById(UMWallRes.umeng_xp_ew_search_edit(this.b)));
    this.j = this.a.findViewById(UMWallRes.umeng_xp_ew_layout_search(this.b));
    ImageButton localImageButton = (ImageButton)this.a.findViewById(UMWallRes.umeng_xp_ew_voice_search(this.b));
    this.m = this.a.findViewById(UMWallRes.umeng_xp_ew_layout_logo(this.b));
    this.n = this.a.findViewById(UMWallRes.umeng_xp_ew_title_back(this.b));
    this.n.setOnClickListener(new d.1(this));
    ((KeyboardListenRelativeLayout)this.a).a(new d.2(this));
    this.k = this.a.findViewById(UMWallRes.umeng_xp_ew_title_search(this.b));
    this.q = new c(this.b);
    boolean bool;
    if (this.k != null)
    {
      this.k.setOnClickListener(new d.3(this));
      bool = this.q.c();
      if (!bool) {
        break label272;
      }
      localImageButton.setImageResource(UMWallRes.drawable_umeng_xp_ew_voice_search(this.b));
    }
    for (;;)
    {
      localImageButton.setOnClickListener(new d.4(this, bool));
      if (this.l != null)
      {
        this.l.setRawInputType(1);
        this.l.setImeOptions(2);
        this.l.setOnEditorActionListener(new d.5(this));
      }
      return;
      label272:
      localImageButton.setImageResource(UMWallRes.drawable_umeng_xp_ew_title_delete(this.b));
    }
  }
  
  public View a()
  {
    this.f.removeAllViews();
    switch (d.8.a[this.h.ordinal()])
    {
    default: 
      com.umeng.newxp.view.common.actionbar.c.a(this.b);
      View.inflate(this.b, UMWallRes.layout_umeng_xp_cm_actionbar_title(this.b), this.f);
      this.c = ((ActionBar)this.a.findViewById(UMWallRes.munion_actionbar(this.b)));
      com.umeng.newxp.view.common.actionbar.a locala = new com.umeng.newxp.view.common.actionbar.a(this.b);
      this.c.setLeftAction(locala);
      if (this.i == 10) {
        this.c.setTitle("返利任务");
      }
      break;
    }
    for (;;)
    {
      return this.a;
      View.inflate(this.b, UMWallRes.layout_umeng_xp_hl_title_tb(this.b), this.f);
      f();
      continue;
      this.c.setTitle("精彩推荐");
    }
  }
  
  public void a(int paramInt)
  {
    this.i = paramInt;
  }
  
  public void a(com.umeng.newxp.common.a parama)
  {
    if ((this.c != null) && (parama.b(a.a.a)))
    {
      if (this.d == null)
      {
        localObject = View.inflate(this.b, UMWallRes.layout_umeng_xp_hl_city_indicator(this.b), null);
        this.d = new com.umeng.newxp.view.common.actionbar.b(this.b, (View)localObject);
      }
      Object localObject = com.umeng.newxp.view.common.actionbar.b.a(this.b);
      this.d.a((String)localObject);
      this.c.addAction(this.d, ActionBar.a.b);
    }
    if ((com.umeng.newxp.c.b == parama.f) || (com.umeng.newxp.c.c == parama.f))
    {
      k.a("waterfall add fav box");
      if (this.e == null)
      {
        this.e = new ImageView(this.b);
        this.e.setImageResource(UMWallRes.drawable_munion_fav_box(this.b));
        i1 = this.b.getResources().getDimensionPixelSize(UMWallRes.dimen_fav_box_height(this.b));
        parama = new FrameLayout.LayoutParams(this.b.getResources().getDimensionPixelSize(UMWallRes.dimen_fav_box_width(this.b)), i1);
        parama.rightMargin = this.b.getResources().getDimensionPixelSize(com.umeng.newxp.view.handler.ewall.c.Q(this.b));
        parama.bottomMargin = this.b.getResources().getDimensionPixelSize(com.umeng.newxp.view.handler.ewall.c.Q(this.b));
        parama.gravity = 85;
        this.e.setLayoutParams(parama);
        this.e.setClickable(true);
        this.e.setOnClickListener(new d.7(this));
        this.e.setLayoutParams(parama);
      }
      if ((this.e.getParent() == null) && (this.g != null)) {
        this.g.addView(this.e);
      }
    }
    while ((this.e == null) || (this.e.getParent() == null))
    {
      int i1;
      return;
    }
    ((ViewGroup)this.e.getParent()).removeView(this.e);
  }
  
  public void a(UMWall.ServiceZygote paramServiceZygote)
  {
    this.s = paramServiceZygote;
  }
  
  public void a(String paramString)
  {
    Object localObject = new com.umeng.newxp.common.a(paramString, paramString, "", com.umeng.newxp.b.b, com.umeng.newxp.c.b);
    localObject = this.s.fork(2, (com.umeng.newxp.common.a)localObject);
    this.q.a(paramString, this.b.getSupportFragmentManager(), (ExchangeDataService)localObject);
    a(true);
    if (this.o == -3) {
      this.p.hideSoftInputFromWindow(this.b.getWindow().peekDecorView().getWindowToken(), 0);
    }
    this.l.setText("");
  }
  
  public void b()
  {
    if (this.o == -3)
    {
      this.p.hideSoftInputFromWindow(this.b.getWindow().peekDecorView().getWindowToken(), 0);
      a(true);
      if (this.q != null) {
        this.q.a();
      }
    }
    do
    {
      return;
      if ((this.q == null) || (!this.q.b())) {
        break;
      }
      a(true);
    } while (this.q == null);
    this.q.a();
    return;
    this.b.finish();
  }
  
  public void b(String paramString)
  {
    if ((this.c != null) && (!TextUtils.isEmpty(paramString))) {
      this.c.setTitle(paramString);
    }
  }
  
  public View c()
  {
    this.g.removeAllViews();
    switch (d.8.a[this.h.ordinal()])
    {
    default: 
      View.inflate(this.b, UMWallRes.layout_umeng_xp_hl_body_default(this.b), this.g);
    }
    for (;;)
    {
      a((TabPageIndicator)this.g.findViewById(UMWallRes.umeng_xp_ew_pageIndicator(this.b)));
      return this.a;
      View.inflate(this.b, UMWallRes.layout_umeng_xp_hl_body_tb(this.b), this.g);
      f();
    }
  }
  
  public void d()
  {
    if ((this.c != null) && (this.d != null))
    {
      this.c.removeAction(this.d);
      this.d = null;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\handler\umwall\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */