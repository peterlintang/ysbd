package com.umeng.xp.view;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.text.method.LinkMovementMethod;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.ViewFlipper;
import com.umeng.common.Log;
import com.umeng.xp.Promoter;
import com.umeng.xp.common.ExchangeConstants;
import com.umeng.xp.controller.ExchangeDataService;
import com.umeng.xp.controller.a.a;
import com.umeng.xp.net.XpReportClient;
import com.umeng.xp.net.e.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class X
{
  protected static Map<String, Float> d;
  private static final int e = 300;
  private static final int f = -16777216;
  public Context a;
  public ViewGroup b;
  public ExchangeDataService c;
  private int g;
  private ViewFlipper h;
  private TextView i;
  private TextView j;
  private a.a k;
  private a.a l;
  private List<Promoter> m;
  private int n;
  private com.umeng.xp.controller.a o;
  
  public X(Context paramContext, ViewGroup paramViewGroup, int paramInt1, int paramInt2, ExchangeDataService paramExchangeDataService)
  {
    this.a = paramContext;
    this.b = paramViewGroup;
    this.c = paramExchangeDataService;
    this.g = paramInt1;
    this.n = paramInt2;
    if ((d == null) || (d.size() == 0)) {
      b();
    }
    paramContext = new Y(this);
    this.c.requestDataAsyn(this.a, paramContext);
  }
  
  private SpannableString a(Promoter paramPromoter)
  {
    if ((TextUtils.isEmpty(paramPromoter.title)) || (TextUtils.isEmpty(paramPromoter.url))) {
      return null;
    }
    SpannableString localSpannableString = new SpannableString(paramPromoter.title);
    localSpannableString.setSpan(new aa(this, paramPromoter), 0, paramPromoter.title.length(), 33);
    return localSpannableString;
  }
  
  private void a(TextView paramTextView, Promoter paramPromoter)
  {
    paramTextView.setText(a(paramPromoter));
    if (this.n > 0)
    {
      paramTextView.setTextSize(2, this.n);
      return;
    }
    try
    {
      paramTextView.setTextSize(3, ((Float)d.get(paramPromoter.text_size)).floatValue());
      return;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      Log.e(ExchangeConstants.LOG_TAG, "Hypertextlink adapter textsize error:" + paramPromoter.text_size);
      paramTextView.setTextSize(2, this.n);
    }
  }
  
  private void a(ViewFlipper paramViewFlipper)
  {
    Animation localAnimation1 = AnimationUtils.loadAnimation(this.a, com.umeng.xp.a.a.e(this.a));
    Animation localAnimation2 = AnimationUtils.loadAnimation(this.a, com.umeng.xp.a.a.j(this.a));
    localAnimation2.setAnimationListener(new Z(this));
    localAnimation1.setDuration(300L);
    localAnimation2.setDuration(300L);
    paramViewFlipper.setInAnimation(localAnimation1);
    paramViewFlipper.setOutAnimation(localAnimation2);
  }
  
  private void a(a.a parama)
  {
    parama = new e.a(this.a).a(0).b(0).d(0).c(this.c.getTimeConsuming()).c(this.g).a(new Promoter[] { parama.a }).a(this.c.slot_id).b(this.c.sessionId).a();
    new XpReportClient(this.a).sendAsync(parama, null);
  }
  
  private void b()
  {
    HashMap localHashMap = new HashMap();
    d = localHashMap;
    localHashMap.put("初号", Float.valueOf(40.0F));
    d.put("小初", Float.valueOf(36.0F));
    d.put("一号", Float.valueOf(26.0F));
    d.put("小一", Float.valueOf(24.0F));
    d.put("二号", Float.valueOf(22.0F));
    d.put("小二", Float.valueOf(18.0F));
    d.put("三号", Float.valueOf(16.0F));
    d.put("小三", Float.valueOf(15.0F));
    d.put("四号", Float.valueOf(14.0F));
    d.put("小四", Float.valueOf(12.0F));
    d.put("五号", Float.valueOf(10.5F));
    d.put("小五", Float.valueOf(9.0F));
    d.put("六号", Float.valueOf(7.5F));
    d.put("小六", Float.valueOf(6.5F));
    d.put("七号", Float.valueOf(5.5F));
    d.put("八号", Float.valueOf(5.0F));
    d.put("5", Float.valueOf(5.0F));
    d.put("5.5", Float.valueOf(5.5F));
    d.put("6.5", Float.valueOf(6.5F));
    d.put("7.5", Float.valueOf(7.5F));
    d.put("8", Float.valueOf(8.0F));
    d.put("9", Float.valueOf(9.0F));
    d.put("10", Float.valueOf(10.0F));
    d.put("10.5", Float.valueOf(10.5F));
    d.put("11", Float.valueOf(11.0F));
    d.put("12", Float.valueOf(12.0F));
    d.put("14", Float.valueOf(14.0F));
    d.put("16", Float.valueOf(16.0F));
    d.put("18", Float.valueOf(18.0F));
    d.put("20", Float.valueOf(20.0F));
    d.put("22", Float.valueOf(22.0F));
    d.put("24", Float.valueOf(24.0F));
    d.put("26", Float.valueOf(26.0F));
    d.put("28", Float.valueOf(28.0F));
    d.put("36", Float.valueOf(36.0F));
    d.put("48", Float.valueOf(48.0F));
    d.put("72", Float.valueOf(72.0F));
  }
  
  private void c()
  {
    TextView localTextView1 = this.i;
    TextView localTextView2 = this.j;
    this.k = this.o.e();
    this.l = this.o.e();
    a(localTextView1, this.k.a);
    a(localTextView2, this.l.a);
    localTextView1.setLinksClickable(true);
    if (localTextView1.getLinksClickable()) {
      localTextView1.setMovementMethod(LinkMovementMethod.getInstance());
    }
    localTextView2.setLinksClickable(true);
    if (localTextView2.getLinksClickable()) {
      localTextView2.setMovementMethod(LinkMovementMethod.getInstance());
    }
  }
  
  protected List<Promoter> a(List<Promoter> paramList)
  {
    ArrayList localArrayList = new ArrayList();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      Promoter localPromoter = (Promoter)paramList.next();
      if ((localPromoter.display_type == 2) && (!TextUtils.isEmpty(localPromoter.title)) && (!TextUtils.isEmpty(localPromoter.url)) && (!TextUtils.isEmpty(localPromoter.text_size)) && (!TextUtils.isEmpty(localPromoter.text_color))) {
        localArrayList.add(localPromoter);
      }
    }
    return localArrayList;
  }
  
  protected void a()
  {
    TextView localTextView = (TextView)this.h.getCurrentView();
    a.a locala = this.o.e();
    if ((localTextView != null) && (localTextView == this.i))
    {
      localTextView = this.j;
      a(this.k);
      this.l = locala;
    }
    for (;;)
    {
      a(localTextView, locala.a);
      return;
      localTextView = this.i;
      a(this.l);
      this.k = locala;
    }
  }
  
  protected void a(ViewGroup paramViewGroup)
  {
    this.c.timeLine[2] = System.currentTimeMillis();
    this.h = new ViewFlipper(this.a);
    ViewGroup.LayoutParams localLayoutParams = new ViewGroup.LayoutParams(-1, -2);
    ViewFlipper localViewFlipper = this.h;
    if (ExchangeConstants.DEBUG_MODE) {}
    for (int i1 = 3000;; i1 = ExchangeConstants.REFRESH_INTERVAL)
    {
      localViewFlipper.setFlipInterval(i1);
      this.h.setLayoutParams(localLayoutParams);
      this.i = new TextView(this.a);
      localLayoutParams = new ViewGroup.LayoutParams(-2, -2);
      this.i.setSingleLine(true);
      this.i.setTextColor(-16777216);
      this.i.setEllipsize(TextUtils.TruncateAt.END);
      this.i.setLayoutParams(localLayoutParams);
      this.j = new TextView(this.a);
      localLayoutParams = new ViewGroup.LayoutParams(-2, -2);
      this.j.setSingleLine(true);
      this.j.setTextColor(-16777216);
      this.j.setEllipsize(TextUtils.TruncateAt.END);
      this.j.setLayoutParams(localLayoutParams);
      c();
      a(this.h);
      this.h.addView(this.i);
      this.h.addView(this.j);
      if (this.m.size() > 1) {
        this.h.startFlipping();
      }
      paramViewGroup.addView(this.h);
      this.c.timeLine[3] = System.currentTimeMillis();
      a(this.k);
      return;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\view\X.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */