package com.umeng.newxp.view.handler.ewall;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import com.taobao.munion.common.MunionInitializer;
import com.taobao.munion.ewall.EWallContainerActivity;
import com.taobao.munion.utils.j;
import com.umeng.newxp.common.a;
import com.umeng.newxp.controller.ExchangeDataService;
import com.umeng.newxp.view.widget.KeyboardListenRelativeLayout;
import java.util.ArrayList;
import java.util.List;

public class b
  extends FragmentActivity
{
  public static ViewPager a;
  public static List<a> q;
  private static final String r = b.class.getCanonicalName();
  private static final int s = 2199;
  private static b.a t;
  View b;
  View c;
  View d;
  View e;
  View f;
  View g;
  View h;
  ImageButton i;
  TextView j;
  FrameLayout k;
  EditText l;
  InputMethodManager m;
  int n;
  Handler o;
  boolean p;
  
  public static void a(Context paramContext, ExchangeDataService paramExchangeDataService)
  {
    Intent localIntent = new Intent(paramContext, EWallContainerActivity.class);
    j.a(localIntent, "bundle_main", paramExchangeDataService.getEWallMainBean());
    paramContext.startActivity(localIntent);
  }
  
  private void a(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.b.setVisibility(0);
      this.c.setVisibility(8);
      this.f.setVisibility(8);
      return;
    }
    this.b.setVisibility(8);
    this.c.setVisibility(0);
    this.f.setVisibility(0);
    this.l.requestFocus();
    this.o.postDelayed(new b.8(this), 300L);
  }
  
  private void c()
  {
    if (this.n == -3)
    {
      this.m.hideSoftInputFromWindow(getWindow().peekDecorView().getWindowToken(), 0);
      a(true);
      return;
    }
    if (this.c.getVisibility() == 0)
    {
      a(true);
      return;
    }
    finish();
  }
  
  public ExchangeDataService a(int paramInt, a parama)
  {
    ExchangeDataService localExchangeDataService = t.a(paramInt, parama);
    if (parama == null) {}
    for (parama = com.umeng.newxp.b.a;; parama = parama.e)
    {
      localExchangeDataService.resType = parama;
      return localExchangeDataService;
    }
  }
  
  public void a()
  {
    c();
  }
  
  protected void a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if ((paramInt1 == 2199) && (paramInt2 == -1))
    {
      paramIntent = paramIntent.getStringArrayListExtra("android.speech.extra.RESULTS");
      if ((paramIntent != null) && (paramIntent.size() > 0))
      {
        paramIntent = ((String)paramIntent.get(0)).trim();
        if (TextUtils.isEmpty(paramIntent)) {
          break label62;
        }
        a(paramIntent);
      }
    }
    return;
    label62:
    Toast.makeText(this, "无法识别输入内容哦，亲～", 0).show();
  }
  
  protected void a(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (!MunionInitializer.isInitialized()) {
      MunionInitializer.initialize(getApplication());
    }
    setContentView(c.a(this));
    this.o = new Handler();
    this.m = ((InputMethodManager)getSystemService("input_method"));
    this.b = findViewById(c.h(this));
    this.c = findViewById(c.i(this));
    this.f = findViewById(c.j(this));
    this.k = ((FrameLayout)findViewById(c.k(this)));
    this.g = findViewById(c.l(this));
    this.j = ((TextView)findViewById(c.m(this)));
    this.h = findViewById(c.o(this));
    this.i = ((ImageButton)findViewById(c.p(this)));
    this.i.setImageResource(c.O(this));
    this.p = false;
    this.i.setOnClickListener(new b.1(this));
    this.h.setOnClickListener(new b.2(this));
    ((KeyboardListenRelativeLayout)findViewById(c.u(this))).a(new b.3(this));
    this.d = findViewById(c.q(this));
    this.l = ((EditText)findViewById(c.r(this)));
    this.l.setRawInputType(1);
    this.l.setImeOptions(2);
    this.l.setOnEditorActionListener(new b.4(this));
    this.e = findViewById(c.s(this));
    this.e.setOnClickListener(new b.5(this));
    this.d.setOnClickListener(new b.6(this));
    paramBundle = q;
    Object localObject = (ViewPager)findViewById(c.t(this));
    a = (ViewPager)localObject;
    ((ViewPager)localObject).setOnPageChangeListener(new b.7(this));
    a.setAdapter(new b.b(this, getSupportFragmentManager(), paramBundle));
    localObject = (TabPageIndicator)findViewById(c.y(this));
    if ((paramBundle == null) || (paramBundle.size() < 2))
    {
      ((TabPageIndicator)localObject).setVisibility(8);
      return;
    }
    ((TabPageIndicator)localObject).setViewPager(a);
  }
  
  public void a(String paramString)
  {
    this.g.setVisibility(0);
    a(true);
    if (this.n == -3) {
      this.m.hideSoftInputFromWindow(getWindow().peekDecorView().getWindowToken(), 0);
    }
    this.j.setText(paramString);
    this.k.removeAllViews();
    getSupportFragmentManager().beginTransaction();
    new a(paramString, paramString, "", com.umeng.newxp.b.b, com.umeng.newxp.c.b);
    this.l.setText("");
  }
  
  public boolean a(MotionEvent paramMotionEvent)
  {
    return super.onTouchEvent(paramMotionEvent);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\handler\ewall\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */