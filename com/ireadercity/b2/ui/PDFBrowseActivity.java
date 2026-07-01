package com.ireadercity.b2.ui;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask.Status;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.provider.Settings.System;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import android.widget.ImageSwitcher;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewSwitcher.ViewFactory;
import com.ireadercity.b2.b.n;
import com.ireadercity.b2.bean.b;
import com.ireadercity.b2.bean.i;
import com.ireadercity.b2.h.s;
import com.umeng.analytics.MobclickAgent;
import com.youloft.imagezoom.ImageViewTouch;
import java.lang.reflect.Field;
import java.util.List;

public class PDFBrowseActivity
  extends Activity
  implements ViewSwitcher.ViewFactory
{
  private boolean A = false;
  private ec B;
  private ec C;
  private ec D;
  private i E = new i();
  com.ireadercity.b2.c.a a;
  public BroadcastReceiver b = new eb(this);
  private PowerManager.WakeLock c;
  private RelativeLayout d;
  private ImageButton e;
  private TextView f;
  private TextView g;
  private TextView h;
  private FrameLayout i;
  private ImageButton j;
  private SeekBar k;
  private SeekBar l;
  private ImageButton m;
  private boolean n = false;
  private RelativeLayout.LayoutParams o;
  private n p;
  private ImageSwitcher q;
  private b r;
  private List<String> s;
  private String t;
  private int u = 0;
  private int v = 0;
  private boolean w = false;
  private Rect x;
  private volatile int y;
  private boolean z = false;
  
  public static String a(b paramb)
  {
    if (paramb.g() == null) {
      paramb.b(com.ireadercity.b2.b.t.a(paramb));
    }
    return paramb.g();
  }
  
  public final void a()
  {
    try
    {
      new StringBuilder("data is ready...").append(this.s.size()).toString();
      String str = (String)this.s.get(this.y);
      if ((this.B != null) && (!this.B.getStatus().equals(AsyncTask.Status.FINISHED))) {
        this.B.cancel(true);
      }
      this.B = new ec(this);
      this.B.execute(new Object[] { str + ".dcpt" });
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  protected final void a(int paramInt)
  {
    if (paramInt == 0)
    {
      this.q.setInAnimation(AnimationUtils.loadAnimation(this, 2130968607));
      this.q.setOutAnimation(AnimationUtils.loadAnimation(this, 2130968608));
    }
    if (paramInt == 1)
    {
      this.q.setInAnimation(AnimationUtils.loadAnimation(this, 2130968610));
      this.q.setOutAnimation(AnimationUtils.loadAnimation(this, 2130968609));
    }
    if (paramInt == 2)
    {
      this.q.setInAnimation(AnimationUtils.loadAnimation(this, 17432576));
      this.q.setOutAnimation(AnimationUtils.loadAnimation(this, 17432577));
    }
  }
  
  protected final void a(Bitmap paramBitmap)
  {
    paramBitmap = new BitmapDrawable(paramBitmap);
    this.q.setImageDrawable(paramBitmap);
  }
  
  public final void b()
  {
    getWindow().addFlags(2048);
  }
  
  public final void c()
  {
    getWindow().clearFlags(2048);
  }
  
  public View makeView()
  {
    ImageViewTouch localImageViewTouch = new ImageViewTouch(this);
    localImageViewTouch.setBackgroundColor(-16777216);
    localImageViewTouch.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    return localImageViewTouch;
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
        new StringBuilder("onConfigurationChanged").append(com.ireadercity.b2.a.E).toString();
        return;
      } while ((paramConfiguration.orientation != 1) || (com.ireadercity.b2.a.E >= com.ireadercity.b2.a.D));
      i1 = com.ireadercity.b2.a.E;
      com.ireadercity.b2.a.E = com.ireadercity.b2.a.D;
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    if (com.ireadercity.b2.a.i) {}
    for (;;)
    {
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
        this.A = com.ireadercity.b2.h.t.a(getContentResolver());
        com.ireadercity.b2.a.b(this);
        setContentView(2130903126);
        paramBundle = new IntentFilter();
        paramBundle.addAction("turning_next");
        paramBundle.addAction("turning_last");
        paramBundle.addAction("show_you_sisiter");
        paramBundle.addAction("set_bitmap");
        paramBundle.addAction("set_cur_bitmap");
        registerReceiver(this.b, paramBundle);
        this.a = com.ireadercity.b2.c.a.a(getApplicationContext());
        this.r = ((b)getIntent().getSerializableExtra("xdata"));
        if ((this.r == null) || (this.r.l() == null))
        {
          Toast.makeText(this, "Book is broken", 1).show();
          finish();
          return;
        }
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
        continue;
        this.r = this.a.g(this.r.j());
        this.p = n.a();
        this.u = this.p.a(this.r);
        if (this.u <= 0)
        {
          Toast.makeText(this, "Book is broken", 1).show();
          finish();
          return;
        }
        this.v = this.r.e();
        new StringBuilder("lastreading page ").append(this.v).toString();
        this.y = this.v;
        this.x = new Rect(0, 0, com.ireadercity.b2.a.D, com.ireadercity.b2.a.E);
        this.q = ((ImageSwitcher)findViewById(2131362209));
        this.q.setFactory(this);
        this.i = ((FrameLayout)findViewById(2131362213));
        this.d = ((RelativeLayout)findViewById(2131362028));
        this.e = ((ImageButton)findViewById(2131362030));
        this.f = ((TextView)findViewById(2131362031));
        this.k = ((SeekBar)findViewById(2131362085));
        this.l = ((SeekBar)findViewById(2131362211));
        this.g = ((TextView)findViewById(2131362035));
        this.h = ((TextView)findViewById(2131362036));
        this.j = ((ImageButton)findViewById(2131362212));
        this.e.setOnClickListener(new dv(this));
        this.j.setOnClickListener(new dw(this));
        this.i.setOnClickListener(new dx(this));
        this.l.setMax(this.u - 1);
        this.l.setProgress(this.y);
        this.l.setOnSeekBarChangeListener(new dy(this));
        this.k.setOnSeekBarChangeListener(new dz(this));
        this.m = ((ImageButton)findViewById(2131362215));
        this.m.setOnClickListener(new ea(this));
      }
      try
      {
        paramBundle = Class.forName("com.android.internal.R$dimen");
        Object localObject = paramBundle.newInstance();
        int i1 = Integer.parseInt(paramBundle.getField("status_bar_height").get(localObject).toString());
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
        this.o = new RelativeLayout.LayoutParams(-1, -2);
        this.o.setMargins(0, i2, 0, 0);
        this.d.setLayoutParams(this.o);
        this.f.setText(this.r.k());
        this.h.setText(" / " + this.u);
        this.g.setText(this.v + 1);
        new ed(this).execute(new Void[0]);
        this.n = s.a(getApplicationContext(), "pdfvieweractivity");
        if (!this.n) {
          continue;
        }
        this.i.setVisibility(0);
        this.d.setVisibility(0);
        b();
        s.b(getApplicationContext(), "pdfvieweractivity");
        return;
      }
      catch (Exception paramBundle)
      {
        for (;;)
        {
          paramBundle.printStackTrace();
          int i2 = 0;
        }
      }
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    this.p.b();
    int i1 = 0;
    while (i1 < this.u) {
      i1 += 1;
    }
    try
    {
      if (this.B != null) {
        this.B.a();
      }
      if (this.C != null) {
        this.C.a();
      }
      if (this.D != null) {
        this.D.a();
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
    while ((this.E.q() == 1) && ((paramInt == 25) || (paramInt == 24))) {
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if (this.E.q() == 1)
    {
      if (paramInt == 25) {}
      while (paramInt == 24) {
        return true;
      }
      return super.onKeyUp(paramInt, paramKeyEvent);
    }
    return super.onKeyUp(paramInt, paramKeyEvent);
  }
  
  protected void onPause()
  {
    super.onPause();
    this.a.a(this.r.j(), this.y);
    if (com.ireadercity.b2.a.E < com.ireadercity.b2.a.D)
    {
      int i1 = com.ireadercity.b2.a.E;
      com.ireadercity.b2.a.E = com.ireadercity.b2.a.D;
      com.ireadercity.b2.a.D = i1;
    }
    if ((this.c != null) && (this.c.isHeld())) {
      this.c.release();
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
    this.E.a(getApplicationContext());
    int i1 = Settings.System.getInt(getContentResolver(), "screen_brightness", 255);
    this.k.setProgress(i1);
    try
    {
      if (com.ireadercity.b2.a.i) {
        MobclickAgent.onResume(this);
      }
      if (this.c == null) {
        this.c = ((PowerManager)getSystemService("power")).newWakeLock(536870922, "ShowContent");
      }
      this.c.setReferenceCounted(false);
      if (!this.c.isHeld()) {
        this.c.acquire(com.ireadercity.b2.a.j);
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


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\PDFBrowseActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */