package com.ireadercity.b2.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.provider.Settings.System;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import com.ireadercity.b2.b.n;
import com.ireadercity.b2.bean.b;
import com.ireadercity.b2.bean.i;
import com.ireadercity.b2.h.s;
import com.ireadercity.b2.ui.widget.PDFView;
import com.ireadercity.b2.ui.widget.ScrollLayout_PDF;
import com.ireadercity.b2.ui.widget.g;
import com.ireadercity.b2.ui.widget.j;
import com.umeng.analytics.MobclickAgent;
import java.lang.reflect.Field;
import java.util.List;

public class PDFViewerActivity
  extends Activity
{
  private boolean A = false;
  private boolean B = false;
  private em C;
  private em D;
  private em E;
  private i F = new i();
  com.ireadercity.b2.c.a a;
  private PowerManager.WakeLock b;
  private RelativeLayout c;
  private ImageButton d;
  private TextView e;
  private TextView f;
  private TextView g;
  private FrameLayout h;
  private ImageButton i;
  private SeekBar j;
  private SeekBar k;
  private ImageButton l;
  private boolean m = false;
  private RelativeLayout.LayoutParams n;
  private n o;
  private ScrollLayout_PDF p;
  private g q;
  private j r;
  private b s;
  private List<String> t;
  private String u;
  private int v = 0;
  private int w = 0;
  private boolean x = false;
  private Rect y;
  private volatile int z;
  
  public static String a(b paramb)
  {
    if (paramb.g() == null) {
      paramb.b(com.ireadercity.b2.b.t.a(paramb));
    }
    return paramb.g();
  }
  
  private void a(int paramInt)
  {
    if (paramInt == 1) {}
    for (float f1 = com.ireadercity.b2.a.D - 100;; f1 = 100.0F)
    {
      MotionEvent localMotionEvent1 = MotionEvent.obtain(0L, 0L, 0, f1, com.ireadercity.b2.a.E / 2, 0);
      MotionEvent localMotionEvent2 = MotionEvent.obtain(0L, 0L, 1, f1, com.ireadercity.b2.a.E / 2, 0);
      this.p.onTouchEvent(localMotionEvent1);
      this.p.onTouchEvent(localMotionEvent2);
      return;
    }
  }
  
  private void d()
  {
    this.y = new Rect(0, 0, com.ireadercity.b2.a.D, com.ireadercity.b2.a.E);
    this.p = ((ScrollLayout_PDF)findViewById(2131362209));
    this.q = new ee(this);
    Object localObject1 = new ViewGroup.LayoutParams(-1, -1);
    int i1 = 0;
    Object localObject2;
    while (i1 < this.v)
    {
      localObject2 = new PDFView(this);
      ((PDFView)localObject2).setBackgroundColor(-16777216);
      this.p.addView((View)localObject2, (ViewGroup.LayoutParams)localObject1);
      i1 += 1;
    }
    this.p.b(this.w);
    this.r = new ef(this);
    this.p.a(this.q);
    this.p.a(this.r);
    this.p.a(this.w);
    this.h = ((FrameLayout)findViewById(2131362213));
    this.c = ((RelativeLayout)findViewById(2131362028));
    this.d = ((ImageButton)findViewById(2131362030));
    this.e = ((TextView)findViewById(2131362031));
    this.j = ((SeekBar)findViewById(2131362085));
    this.k = ((SeekBar)findViewById(2131362211));
    this.f = ((TextView)findViewById(2131362035));
    this.g = ((TextView)findViewById(2131362036));
    this.i = ((ImageButton)findViewById(2131362212));
    this.d.setOnClickListener(new eg(this));
    this.i.setOnClickListener(new eh(this));
    this.h.setOnClickListener(new ei(this));
    this.k.setMax(this.v - 1);
    this.k.setProgress(this.z);
    this.k.setOnSeekBarChangeListener(new ej(this));
    this.j.setOnSeekBarChangeListener(new ek(this));
    this.l = ((ImageButton)findViewById(2131362215));
    this.l.setOnClickListener(new el(this));
    try
    {
      localObject1 = Class.forName("com.android.internal.R$dimen");
      localObject2 = ((Class)localObject1).newInstance();
      i1 = Integer.parseInt(((Class)localObject1).getField("status_bar_height").get(localObject2).toString());
      i2 = getResources().getDimensionPixelSize(i1);
      i1 = i2;
      if (i2 <= 0) {
        i1 = 45;
      }
      i2 = i1;
      if (Build.VERSION.SDK_INT > 10)
      {
        i2 = i1;
        if (Build.VERSION.SDK_INT < 14) {
          i2 = 0;
        }
      }
      this.n = new RelativeLayout.LayoutParams(-1, -2);
      this.n.setMargins(0, i2, 0, 0);
      this.c.setLayoutParams(this.n);
      this.e.setText(this.s.k());
      this.g.setText(" / " + this.v);
      this.f.setText(this.w + 1);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localException.printStackTrace();
        int i2 = 0;
      }
    }
  }
  
  public final void a()
  {
    try
    {
      new StringBuilder("data is ready...").append(this.t.size()).toString();
      String str = (String)this.t.get(this.z);
      new em(this).execute(new Object[] { this.p.getChildAt(this.z), str + ".dcpt" });
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  public final void b()
  {
    getWindow().addFlags(2048);
  }
  
  public final void c()
  {
    getWindow().clearFlags(2048);
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    int i1;
    if (paramConfiguration.orientation == 0) {
      if (com.ireadercity.b2.a.E > com.ireadercity.b2.a.D)
      {
        i1 = com.ireadercity.b2.a.E;
        com.ireadercity.b2.a.E = com.ireadercity.b2.a.D;
      }
    }
    for (com.ireadercity.b2.a.D = i1;; com.ireadercity.b2.a.D = i1)
    {
      do
      {
        this.p.invalidate();
        new StringBuilder("onConfigurationChanged").append(com.ireadercity.b2.a.E).toString();
        this.p.a(this.z);
        return;
      } while ((paramConfiguration.orientation != 1) || (com.ireadercity.b2.a.E >= com.ireadercity.b2.a.D));
      i1 = com.ireadercity.b2.a.E;
      com.ireadercity.b2.a.E = com.ireadercity.b2.a.D;
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    if (com.ireadercity.b2.a.i) {}
    try
    {
      MobclickAgent.onError(this);
      super.onCreate(paramBundle);
      paramBundle = getWindow().getAttributes();
      paramBundle.flags |= 0x400;
      getWindow().setAttributes(paramBundle);
      getWindow().addFlags(256);
      getWindow().addFlags(65536);
      getWindow().addFlags(512);
      this.B = com.ireadercity.b2.h.t.a(getContentResolver());
      com.ireadercity.b2.a.b(this);
      setContentView(2130903126);
      this.a = com.ireadercity.b2.c.a.a(getApplicationContext());
      this.s = ((b)getIntent().getSerializableExtra("xdata"));
      if ((this.s == null) || (this.s.l() == null))
      {
        Toast.makeText(this, "Book is broken", 1).show();
        finish();
        return;
      }
    }
    catch (Exception localException)
    {
      do
      {
        for (;;)
        {
          localException.printStackTrace();
        }
        this.s = this.a.g(this.s.j());
        this.o = n.a();
        this.v = this.o.a(this.s);
        if (this.v <= 0)
        {
          Toast.makeText(this, "Book is broken", 1).show();
          finish();
          return;
        }
        this.w = this.s.e();
        new StringBuilder("lastreading page ").append(this.w).toString();
        this.z = this.w;
        d();
        new en(this).execute(new Void[0]);
        this.m = s.a(getApplicationContext(), "pdfvieweractivity");
      } while (!this.m);
      this.h.setVisibility(0);
      this.c.setVisibility(0);
      b();
      s.b(getApplicationContext(), "pdfvieweractivity");
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    this.o.b();
    int i1 = 0;
    while (i1 < this.v)
    {
      PDFView localPDFView = (PDFView)this.p.getChildAt(i1);
      if (localPDFView != null) {
        localPDFView.a();
      }
      i1 += 1;
    }
    this.p.destroyDrawingCache();
    try
    {
      if (this.C != null) {
        this.C.a();
      }
      if (this.D != null) {
        this.D.a();
      }
      if (this.E != null) {
        this.E.a();
      }
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0)) {
      finish();
    }
    while ((this.F.q() == 1) && ((paramInt == 25) || (paramInt == 24))) {
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 82) {
      this.q.a();
    }
    if (this.F.q() == 1)
    {
      if (paramInt == 25)
      {
        a(1);
        return true;
      }
      if (paramInt == 24)
      {
        a(-1);
        return true;
      }
      return super.onKeyUp(paramInt, paramKeyEvent);
    }
    return super.onKeyUp(paramInt, paramKeyEvent);
  }
  
  protected void onPause()
  {
    super.onPause();
    this.a.a(this.s.j(), this.z);
    if (com.ireadercity.b2.a.E < com.ireadercity.b2.a.D)
    {
      int i1 = com.ireadercity.b2.a.E;
      com.ireadercity.b2.a.E = com.ireadercity.b2.a.D;
      com.ireadercity.b2.a.D = i1;
    }
    if ((this.b != null) && (this.b.isHeld())) {
      this.b.release();
    }
    if (com.ireadercity.b2.a.i) {
      MobclickAgent.onPause(this);
    }
  }
  
  protected void onRestart()
  {
    super.onRestart();
  }
  
  protected void onRestoreInstanceState(Bundle paramBundle)
  {
    super.onRestoreInstanceState(paramBundle);
  }
  
  protected void onResume()
  {
    super.onResume();
    this.F.a(getApplicationContext());
    int i1 = Settings.System.getInt(getContentResolver(), "screen_brightness", 255);
    this.j.setProgress(i1);
    try
    {
      if (com.ireadercity.b2.a.i) {
        MobclickAgent.onResume(this);
      }
      if (this.b == null) {
        this.b = ((PowerManager)getSystemService("power")).newWakeLock(536870922, "ShowContent");
      }
      this.b.setReferenceCounted(false);
      if (!this.b.isHeld()) {
        this.b.acquire(com.ireadercity.b2.a.j);
      }
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  protected void onStart()
  {
    super.onStart();
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    return super.onTouchEvent(paramMotionEvent);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\PDFViewerActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */