package com.umeng.newxp.view;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.umeng.common.ufp.Log;
import com.umeng.common.ufp.net.g;
import com.umeng.newxp.Promoter;
import com.umeng.newxp.a.a;
import com.umeng.newxp.a.c;
import com.umeng.newxp.a.d;
import com.umeng.newxp.controller.ExchangeDataService;
import com.umeng.newxp.net.l;
import com.umeng.newxp.net.m.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class UMDetail
  extends Activity
{
  public static final String a = "promoter";
  private static final String q = UMDetail.class.getName();
  HorizontalStrip b;
  View c;
  Context d;
  Promoter e;
  int f;
  int g;
  String h;
  String i;
  String j;
  String k;
  String l;
  TextView m;
  volatile Map<String, Drawable> n = new HashMap();
  List<f.a> o;
  ExchangeDataService p;
  
  private void a(Promoter paramPromoter, int paramInt, ExchangeDataService paramExchangeDataService)
  {
    paramPromoter = Uri.parse(paramPromoter.url);
    if (!com.umeng.common.ufp.b.a(this.d, "android.permission.CALL_PHONE"))
    {
      Toast.makeText(this.d, "This App has no call_phone permission!", 0).show();
      return;
    }
    paramPromoter = paramPromoter.getAuthority();
    paramPromoter = new Intent("android.intent.action.CALL", Uri.parse("tel:" + paramPromoter));
    this.d.startActivity(paramPromoter);
  }
  
  private void b()
  {
    int i1 = com.umeng.newxp.view.common.b.a(this.d, this.f);
    m.a locala = new m.a(this.d).a(3).g(this.h).b(this.g).d(i1).c(this.f).a(new Promoter[] { this.e }).f(this.i).a(this.j).a(this.k, this.l);
    new l(this.d, this.e, locala).a();
  }
  
  private void c()
  {
    if (this.p != null)
    {
      this.p.setFilterInstalledApp(false);
      this.p.filterPromoter = this.e.promoter;
      View localView = findViewById(c.ab(this.d));
      localView.setVisibility(8);
      this.p.requestDataAsyn(this.d, new UMDetail.6(this, localView), true);
    }
  }
  
  private void d()
  {
    int i2 = 0;
    Object localObject = q;
    StringBuilder localStringBuilder = new StringBuilder("Start load imgs. [imgs.length");
    if (this.e.imgs == null) {}
    for (int i1 = 0;; i1 = this.e.imgs.length)
    {
      Log.a((String)localObject, i1 + "]");
      if ((this.e.imgs == null) || (this.e.imgs.length <= 0)) {
        break;
      }
      localObject = this.e.imgs;
      int i3 = localObject.length;
      i1 = i2;
      while (i1 < i3)
      {
        localStringBuilder = localObject[i1];
        g.a(this.d, localStringBuilder, new UMDetail.7(this, localStringBuilder));
        i1 += 1;
      }
    }
    findViewById(c.am(this.d)).setVisibility(8);
  }
  
  protected List<f.a> filterBadIMG()
  {
    ArrayList localArrayList = new ArrayList();
    String[] arrayOfString = this.e.imgs;
    int i2 = arrayOfString.length;
    int i1 = 0;
    while (i1 < i2)
    {
      Object localObject2 = arrayOfString[i1];
      Object localObject1 = (Drawable)this.n.get(localObject2);
      if ((localObject1 != null) && (((Drawable)localObject1).getIntrinsicHeight() > 0) && (((Drawable)localObject1).getIntrinsicWidth() > 0))
      {
        localArrayList.add(new f.a((String)localObject2, (Drawable)localObject1));
        i1 += 1;
      }
      else
      {
        String str = q;
        localObject2 = new StringBuilder("filter bad image [").append((String)localObject2).append("]   ");
        if (localObject1 == null) {}
        for (localObject1 = "null";; localObject1 = "Exist")
        {
          Log.a(str, (String)localObject1);
          break;
        }
      }
    }
    return localArrayList;
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.d = this;
    setContentView(d.s(this.d));
    paramBundle = getIntent().getExtras();
    if (paramBundle != null)
    {
      this.e = ((Promoter)paramBundle.getParcelable("promoter"));
      this.f = paramBundle.getInt("layout_type");
      this.g = paramBundle.getInt("action_index");
      this.h = paramBundle.getString("tcost");
      this.i = paramBundle.getString("app_key");
      this.j = paramBundle.getString("slot_id");
      this.k = paramBundle.getString("sid");
      this.l = paramBundle.getString("psid");
    }
    if (!TextUtils.isEmpty(this.j)) {
      this.p = new UMDetail.1(this, this.j);
    }
    for (;;)
    {
      this.p.layoutType = 16;
      this.p.psid = this.l;
      ((TextView)findViewById(c.V(this.d))).setText(this.e.title);
      findViewById(c.Q(this.d));
      ((TextView)findViewById(c.W(this.d))).setText(this.e.provider);
      this.m = ((TextView)findViewById(c.X(this.d)));
      this.m.setText(this.e.description);
      if (this.e.description.length() < 75) {
        findViewById(c.an(this.d)).setVisibility(8);
      }
      this.m.setMaxLines(3);
      paramBundle = (TextView)findViewById(c.an(this.d));
      paramBundle.setOnClickListener(new UMDetail.3(this, paramBundle));
      paramBundle = (ImageView)findViewById(c.Y(this.d));
      Animation localAnimation = AnimationUtils.loadAnimation(this.d, a.n(this.d));
      g.a(this.d, paramBundle, this.e.icon, false, null, localAnimation, true);
      this.b = ((HorizontalStrip)findViewById(c.Z(this.d)));
      this.c = findViewById(c.aa(this.d));
      findViewById(c.ao(this.d)).setOnClickListener(new UMDetail.4(this));
      findViewById(c.ap(this.d)).setOnClickListener(new UMDetail.5(this));
      c();
      return;
      this.p = new UMDetail.2(this);
      this.p.appkey = this.i;
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    this.b.setAdapter(null);
    Iterator localIterator = this.n.values().iterator();
    while (localIterator.hasNext())
    {
      Drawable localDrawable = (Drawable)localIterator.next();
      if (localDrawable != null) {
        localDrawable.setCallback(null);
      }
    }
    this.n.clear();
  }
  
  protected void onResume()
  {
    super.onResume();
    d();
  }
  
  protected void showStrip(List<f.a> paramList)
  {
    if (paramList.size() > 0)
    {
      paramList = f.a(paramList);
      this.b.setAdapter(paramList);
      this.c.setVisibility(8);
      this.b.setVisibility(0);
      return;
    }
    findViewById(c.am(this.d)).setVisibility(8);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\UMDetail.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */