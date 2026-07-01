package com.ireadercity.b2.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Debug;
import android.os.Handler;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.provider.Settings.System;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.webkit.WebSettings;
import android.webkit.WebSettings.LayoutAlgorithm;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import com.ireadercity.b2.b.d;
import com.ireadercity.b2.bean.b;
import com.ireadercity.b2.bean.i;
import com.ireadercity.b2.bean.j;
import com.ireadercity.b2.bean.l;
import com.ireadercity.b2.h.r;
import com.ireadercity.b2.h.s;
import com.ireadercity.b2.h.t;
import com.ireadercity.b2.h.v;
import com.ireadercity.b2.h.w;
import com.ireadercity.b2.h.y;
import com.ireadercity.b2.ui.widget.CustomerWebView;
import com.umeng.analytics.MobclickAgent;
import java.io.File;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class ShowContentScrollUpAndDown
  extends Activity
{
  private static int M;
  private static int N;
  private static i V;
  public static int c;
  public static int d;
  private ImageButton A;
  private ImageButton B;
  private ImageButton C;
  private ImageButton D;
  private FrameLayout E;
  private SeekBar F;
  private SeekBar G;
  private boolean H = false;
  private ImageButton I;
  private boolean J = false;
  private String K;
  private b L;
  private String O;
  private float P;
  private boolean Q = false;
  private String[] R = new String[2];
  private String S;
  private d T;
  private int U;
  private ArrayList<HashMap<String, String>> W;
  private String[] X;
  private EditText Y;
  private TextView Z;
  int a;
  private TextView aa;
  private String ab = "";
  private float ac = 0.0F;
  private float ad = 0.0F;
  private ArrayList<HashMap<String, String>> ae;
  private Boolean af = Boolean.valueOf(false);
  private float ag = 0.0F;
  private float ah = 0.0F;
  private RelativeLayout ai;
  private TextView aj;
  private TextView ak;
  private ImageView al;
  private Handler am;
  private boolean an = false;
  private Handler ao;
  private Runnable ap;
  private int aq = 0;
  private Handler ar = new fv(this);
  private Handler as = new fw(this);
  private boolean at = false;
  int b;
  public Boolean e = Boolean.valueOf(false);
  public Boolean f = Boolean.valueOf(false);
  boolean g = true;
  boolean h = false;
  boolean i = false;
  boolean j = false;
  boolean k = false;
  int l = 0;
  RelativeLayout m = null;
  PowerManager.WakeLock n;
  j o;
  private gi p;
  private CustomerWebView q;
  private RelativeLayout r;
  private LinearLayout s;
  private RelativeLayout t;
  private RelativeLayout u;
  private LinearLayout v;
  private TextView w;
  private ImageButton x;
  private ImageButton y;
  private ImageButton z;
  
  public ShowContentScrollUpAndDown()
  {
    d = 1;
    this.O = "";
    V = new i();
    this.W = new ArrayList();
    this.ae = new ArrayList();
  }
  
  private int b(int paramInt)
  {
    int i1 = 0;
    if (this.L.t().equalsIgnoreCase("txt")) {
      return paramInt;
    }
    String str = (String)((HashMap)this.W.get(paramInt)).get("src");
    if (str.indexOf("#") >= 0) {
      str = str.substring(0, str.indexOf("#"));
    }
    for (;;)
    {
      int i2 = -1;
      while (i1 < this.ae.size())
      {
        if (((String)((HashMap)this.ae.get(i1)).get("src")).toString().equalsIgnoreCase(str))
        {
          new StringBuilder("getSpineIndexFromNavIndex navIndex=").append(paramInt).append(" new spineIndex=").append(i1).toString();
          i2 = i1;
        }
        i1 += 1;
      }
      if (i2 == -1) {
        new StringBuilder("=============CAN'T find spineIndex for navIndex=").append(paramInt).append("=========normally, won't happen======").toString();
      }
      return i2;
    }
  }
  
  private int c(int paramInt)
  {
    if (this.L.t().equalsIgnoreCase("txt")) {
      return paramInt;
    }
    String str = (String)((HashMap)this.ae.get(paramInt)).get("src");
    int i1 = 0;
    int i2 = -1;
    while (i1 < this.W.size())
    {
      if (((String)((HashMap)this.W.get(i1)).get("src")).toString().toLowerCase().indexOf(str.toLowerCase()) >= 0)
      {
        new StringBuilder("getNavIndexFromSpineIndex spineIndex=").append(paramInt).append(" new navIndex=").append(i1).toString();
        i2 = i1;
      }
      i1 += 1;
    }
    i1 = i2;
    if (i2 == -1)
    {
      new StringBuilder("CAN'T find navIndex for spineIndex=").append(paramInt).toString();
      i1 = M;
    }
    return i1;
  }
  
  private void e()
  {
    this.P = ((this.q.getScrollY() + com.ireadercity.b2.a.E - this.o.a() * 2) / (this.q.getContentHeight() * this.q.getScale()) * 100.0F);
    if (this.P < 0.0F) {
      this.P = 0.0F;
    }
    for (;;)
    {
      f();
      return;
      if (this.P > 100.0F) {
        this.P = 100.0F;
      }
    }
  }
  
  private void f()
  {
    try
    {
      com.ireadercity.b2.c.a locala = com.ireadercity.b2.c.a.a(getApplicationContext());
      if ((M >= 0) && (M < this.W.size())) {
        locala.a(this.L.j(), M, this.P);
      }
      if (this.L.t().toLowerCase().endsWith("epub")) {
        locala.b(this.L.j(), N, this.P);
      }
      return;
    }
    catch (Exception localException)
    {
      localException.getMessage();
    }
  }
  
  private void g()
  {
    this.X = new String[this.W.size()];
    int i1 = 0;
    if (i1 < this.W.size())
    {
      String str = (String)((HashMap)this.W.get(i1)).get("title");
      if (!y.d(str)) {
        this.X[i1] = str;
      }
      for (;;)
      {
        i1 += 1;
        break;
        this.X[i1] = ("章节-" + i1);
      }
    }
  }
  
  public final void a()
  {
    V.a(getApplicationContext());
    V.h();
  }
  
  public final void a(float paramFloat)
  {
    int i1 = 0;
    new StringBuilder().append(paramFloat).append("initLoadPage() ==============").toString();
    this.P = paramFloat;
    new StringBuilder("initLoadPage progress").append(paramFloat).toString();
    com.ireadercity.b2.a.d();
    w.a(this.q);
    for (;;)
    {
      try
      {
        this.T = new d(getApplicationContext());
        if (this.af.booleanValue())
        {
          this.ab = this.K.substring(this.K.lastIndexOf("#") + 1, this.K.length());
          this.K = this.K.substring(0, this.K.lastIndexOf("#"));
        }
        new StringBuilder("****create newWebview**** URL=").append(this.K).toString();
        ViewGroup.LayoutParams localLayoutParams = new ViewGroup.LayoutParams(com.ireadercity.b2.a.D, com.ireadercity.b2.a.E);
        int i2 = this.o.a();
        if (this.r == null)
        {
          this.r = new RelativeLayout(getApplicationContext());
          this.u.addView(this.r, localLayoutParams);
        }
        this.r.setPadding(i2, i2, i2, i2);
        if (this.q != null)
        {
          this.r.destroyDrawingCache();
          this.r.removeView(this.q);
          this.q.destroy();
          this.q = null;
          com.ireadercity.b2.a.d();
        }
        this.q = new CustomerWebView(this);
        this.q.setVerticalScrollBarEnabled(false);
        this.q.setHorizontalScrollBarEnabled(false);
        if (com.ireadercity.b2.a.N == 0) {
          i1 = 80;
        }
        localLayoutParams = new ViewGroup.LayoutParams(this.a, this.b - i1);
        this.r.addView(this.q, localLayoutParams);
        this.q.a(new ft(this));
        this.q.setPadding(10, 0, 0, 0);
        this.q.setVerticalScrollBarEnabled(true);
        this.q.setBackgroundColor(0);
        this.q.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        this.q.getSettings().setJavaScriptEnabled(true);
        this.q.setInitialScale(100);
        this.r.setBackgroundResource(V.e());
        this.u.setBackgroundResource(V.e());
        this.q.setWebViewClient(new fu(this));
        if (this.L.t().equalsIgnoreCase("epub"))
        {
          this.R = this.T.a(this.K, this.L);
          if (this.R != null) {
            break;
          }
          throw new Exception("bodyCon is null");
        }
      }
      catch (Exception localException)
      {
        w.b();
        localException.printStackTrace();
        return;
      }
      if (this.L.t().equalsIgnoreCase("txt")) {
        this.R = this.T.b(M, this.L);
      }
    }
    this.S = this.T.a(this.R[0], this.R[1], V.i(), V.j(), V.k(), V.h(), this.o.a(), this.o.c());
    new StringBuilder("webView.loadDataWithBaseURL length())=").append(this.S.length()).append(" URL=").append(this.K).toString();
    Uri localUri;
    if (this.L.t().equalsIgnoreCase("epub"))
    {
      localUri = Uri.fromFile(new File(this.K));
      this.q.loadDataWithBaseURL(localUri.toString(), this.S, "text/html", "utf-8", null);
    }
    for (;;)
    {
      new StringBuilder("uri=").append(localUri.toString()).toString();
      this.r.setVisibility(0);
      this.u.bringChildToFront(this.r);
      this.u.bringChildToFront(this.m);
      this.u.bringChildToFront(this.t);
      this.u.bringChildToFront(this.ai);
      return;
      if (this.L.t().equalsIgnoreCase("txt"))
      {
        localUri = Uri.fromFile(new File(this.L.l()));
        this.q.loadDataWithBaseURL(null, this.S, "text/html", "utf-8", null);
      }
      else
      {
        localUri = null;
      }
    }
  }
  
  public final void a(int paramInt)
  {
    if (paramInt == 1)
    {
      getWindow().addFlags(2048);
      this.t.setOnTouchListener(new ga(this));
      this.u.bringChildToFront(this.t);
      this.u.bringChildToFront(this.E);
      this.t.setVisibility(0);
      this.t.setBackgroundColor(0);
      return;
    }
    this.u.bringChildToFront(this.m);
    this.u.bringChildToFront(this.E);
    this.t.setVisibility(4);
    getWindow().clearFlags(2048);
    this.t.setOnTouchListener(null);
  }
  
  public final void a(String paramString)
  {
    w.a(this.q);
    this.O = paramString;
    if (V.m() == 0)
    {
      V.i(1);
      this.C.setImageResource(2130837764);
      V.e(V.d());
      V.c(V.g());
    }
    for (;;)
    {
      this.u.setBackgroundResource(V.e());
      this.r.setBackgroundResource(V.e());
      V.b(getApplicationContext());
      a(this.P);
      a(0);
      return;
      V.i(0);
      V.e(V.c());
      V.c(V.f());
      this.C.setImageResource(2130837741);
    }
  }
  
  public final void b(String paramString)
  {
    Object localObject;
    String str1;
    String str2;
    AlertDialog localAlertDialog;
    if (this.P >= 100.0F)
    {
      localObject = "-->100%";
      str1 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss ").format(new Date(System.currentTimeMillis()));
      str2 = this.X[M];
      View localView = getLayoutInflater().inflate(2130903088, (ViewGroup)findViewById(2131362024));
      localAlertDialog = new AlertDialog.Builder(this).create();
      localAlertDialog.setTitle(2131230824);
      localAlertDialog.setView(localView);
      this.Y = ((EditText)localView.findViewById(2131362026));
      this.Z = ((TextView)localView.findViewById(2131362027));
      this.aa = ((TextView)localView.findViewById(2131362025));
      if (paramString == null) {
        break label286;
      }
      this.Y.setText(paramString);
    }
    for (;;)
    {
      this.Z.setText(getString(2131230888) + (String)localObject);
      this.aa.setText(str1);
      paramString = new fy(this, paramString, (String)localObject);
      localObject = new fz(this, localAlertDialog);
      localAlertDialog.setButton(getString(2131230887), paramString);
      localAlertDialog.setButton2(getString(2131230845), (DialogInterface.OnClickListener)localObject);
      localAlertDialog.show();
      return;
      float f1 = this.P;
      localObject = "-->" + Math.round(f1) + "%";
      break;
      label286:
      this.Y.setText(str2);
    }
  }
  
  public final void c(String paramString)
  {
    new StringBuilder("goChapter begin=").append(paramString).append(" spineIndex=").append(N).append(" navIndex").append(M).toString();
    this.O = paramString;
    if ((paramString.endsWith("back")) || (paramString.endsWith("jumpback"))) {
      if (N - 1 >= 0)
      {
        if ((!this.L.t().equalsIgnoreCase("txt")) && (this.ae != null) && (this.ae.size() > 0) && (N - 1 >= 0))
        {
          this.K = ((String)((HashMap)this.ae.get(N - 1)).get("src"));
          M = c(N - 1);
        }
        N -= 1;
        if (this.L.t().equalsIgnoreCase("txt")) {
          M = N;
        }
        new StringBuilder("URL=").append(this.K).append(" chapterIndex=").append(M).toString();
        a(100.0F);
      }
    }
    for (;;)
    {
      new StringBuilder("goChapter end=").append(paramString).append(" chapterIndexSpine=").append(N).append(" navIndex").append(M).toString();
      return;
      d("已到达书起始位置");
      continue;
      if (paramString.endsWith("next")) {
        if (N + 1 < this.l)
        {
          if ((!this.L.t().equalsIgnoreCase("txt")) && (this.ae != null) && (this.ae.size() > 0) && (N + 1 < this.ae.size()))
          {
            this.K = ((String)((HashMap)this.ae.get(N + 1)).get("src"));
            M = c(N + 1);
          }
          N += 1;
          if (this.L.t().equalsIgnoreCase("txt")) {
            M = N;
          }
          new StringBuilder("URL=").append(this.K).append(" chapterIndex=").append(M).toString();
          a(0.0F);
        }
        else
        {
          d("已到达书结尾位置");
        }
      }
    }
  }
  
  public final void d(String paramString)
  {
    Toast.makeText(this, paramString, 0).show();
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    a();
    this.ad = (d / c);
    this.O = "setRead";
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (com.ireadercity.b2.a.i) {}
    try
    {
      MobclickAgent.onError(this);
      paramBundle = getWindow().getAttributes();
      paramBundle.flags |= 0x400;
      getWindow().setAttributes(paramBundle);
      getWindow().addFlags(512);
      paramBundle = com.ireadercity.b2.c.a.a(getApplicationContext());
      this.J = t.a(getContentResolver());
      if (com.ireadercity.b2.a.k == null) {
        com.ireadercity.b2.a.b(this);
      }
      try
      {
        registerReceiver(this.p, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        new StringBuilder("===***getNativeHeapAllocatedSize()=").append(Debug.getNativeHeapAllocatedSize()).append("***===").toString();
        setContentView(2130903141);
        this.ap = new fx(this);
        this.ao = new gb(this);
        a();
        localObject1 = getIntent().getExtras();
        this.K = ((Bundle)localObject1).getString("reURL");
        if (this.K != null)
        {
          if (this.K.lastIndexOf("#") != -1)
          {
            bool = true;
            this.af = Boolean.valueOf(bool);
          }
        }
        else
        {
          M = ((Bundle)localObject1).getInt("chapterIndex");
          N = ((Bundle)localObject1).getInt("chapterIndexSpine");
          this.L = b.a;
          this.ae = this.L.x();
          this.W = this.L.q();
          if (!this.L.t().equalsIgnoreCase("epub")) {
            this.ae = this.L.q();
          }
          r.a(this.L.j());
          new StringBuilder("abook.getBookChapter().size()=").append(this.L.q().size()).toString();
          new StringBuilder("abook.getopfchapter.size()=").append(this.ae.size()).toString();
          this.O = ((Bundle)localObject1).getString("chapterChange");
          this.P = ((Bundle)localObject1).getFloat("progress");
          new StringBuilder("~~~~~~~~~~~~progress~~~~~~~~~~~~").append(this.P).toString();
          this.u = ((RelativeLayout)findViewById(2131362207));
          this.E = ((FrameLayout)findViewById(2131362213));
          this.t = ((RelativeLayout)findViewById(2131362028));
          this.s = ((LinearLayout)this.t.findViewById(2131362029));
          this.v = ((LinearLayout)this.t.findViewById(2131362033));
          this.x = ((ImageButton)this.s.findViewById(2131362030));
          this.z = ((ImageButton)this.s.findViewById(2131362318));
          this.w = ((TextView)this.s.findViewById(2131362031));
          if (this.L != null) {
            this.w.setText(this.L.k());
          }
          this.y = ((ImageButton)findViewById(2131362212));
          this.y.setOnClickListener(new gc(this));
          this.E.setOnClickListener(new gd(this));
          this.ai = ((RelativeLayout)findViewById(2131362239));
          this.al = ((ImageView)findViewById(2131362240));
          this.aj = ((TextView)findViewById(2131362242));
          this.ak = ((TextView)findViewById(2131362241));
          this.aj.setText(v.a());
          this.C = ((ImageButton)this.v.findViewById(2131362322));
          this.B = ((ImageButton)this.v.findViewById(2131362321));
          this.A = ((ImageButton)this.v.findViewById(2131362039));
          this.D = ((ImageButton)this.v.findViewById(2131362323));
          this.F = ((SeekBar)findViewById(2131362085));
          this.G = ((SeekBar)findViewById(2131362320));
          float f1 = v.b(getApplicationContext());
          this.G.setProgress(Math.round(V.i() / f1) - Math.round(10.0F * f1));
          this.G.setOnSeekBarChangeListener(new ge(this, f1));
          this.E.setOnClickListener(new gf(this));
          this.F.setOnSeekBarChangeListener(new gg(this));
          this.I = ((ImageButton)findViewById(2131362215));
          this.I.setOnClickListener(new gh(this));
          this.m = ((RelativeLayout)findViewById(2131362208));
          this.m.setVisibility(8);
          g();
          if (this.L.t().equalsIgnoreCase("epub")) {
            this.l = this.ae.size();
          }
          if (this.L.t().equalsIgnoreCase("txt")) {
            this.l = this.W.size();
          }
          new StringBuilder("allChapterCount=").append(this.l).append(" abook.getBookType()=").append(this.L.t()).toString();
          if (N == -1) {
            N = b(M);
          }
          if (M == -1) {
            M = c(N);
          }
          paramBundle.c(this.L.j());
          if (V.m() != 0) {
            break label1305;
          }
          this.C.setImageResource(2130837741);
          this.x.setOnClickListener(new fn(this));
          this.z.setOnClickListener(new fo(this));
          this.A.setOnClickListener(new fp(this));
          this.B.setOnClickListener(new fq(this));
          this.C.setOnClickListener(new fr(this));
          this.D.setOnClickListener(new fs(this));
          paramBundle = new RelativeLayout.LayoutParams(-1, -2);
        }
      }
      catch (Throwable localThrowable)
      {
        try
        {
          for (;;)
          {
            Object localObject1 = Class.forName("com.android.internal.R$dimen");
            Object localObject2 = ((Class)localObject1).newInstance();
            int i1 = Integer.parseInt(((Class)localObject1).getField("status_bar_height").get(localObject2).toString());
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
            paramBundle.setMargins(0, i2, 0, 0);
            this.t.setLayoutParams(paramBundle);
            this.H = s.a(getApplicationContext(), "showcontent");
            if (this.H)
            {
              this.E.setVisibility(0);
              s.b(getApplicationContext(), "showcontent");
            }
            w.a(this);
            return;
            localThrowable = localThrowable;
            localThrowable.printStackTrace();
            continue;
            boolean bool = false;
          }
          label1305:
          this.C.setImageResource(2130837764);
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
    }
    catch (Exception paramBundle)
    {
      for (;;) {}
    }
  }
  
  protected void onDestroy()
  {
    if (this.q != null)
    {
      this.r.destroyDrawingCache();
      this.r.removeView(this.q);
      this.q.destroy();
      this.q = null;
    }
    com.ireadercity.b2.a.d();
    super.onDestroy();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      if ((this.q != null) && (this.q.a()))
      {
        this.q.b();
        return true;
      }
      setResult(10087);
      finish();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 82)
    {
      if (this.t.getVisibility() == 0) {
        a(0);
      }
    }
    else {
      return true;
    }
    a(1);
    return true;
  }
  
  protected void onPause()
  {
    super.onPause();
    this.an = true;
    if (this.q != null) {
      this.q.b();
    }
    e();
    f();
    w.b();
    if ((this.n != null) && (this.n.isHeld())) {
      this.n.release();
    }
    com.ireadercity.b2.c.a locala = com.ireadercity.b2.c.a.a(getApplicationContext());
    new StringBuilder().append(M).toString();
    new StringBuilder().append(N).toString();
    try
    {
      locala.a(this.L.j(), N);
      f();
      if (com.ireadercity.b2.a.i) {}
      try
      {
        MobclickAgent.onPause(this);
        try
        {
          if (this.p != null) {
            unregisterReceiver(this.p);
          }
          return;
        }
        catch (Throwable localThrowable)
        {
          localThrowable.printStackTrace();
          return;
        }
      }
      catch (Exception localException1)
      {
        for (;;) {}
      }
    }
    catch (Exception localException2)
    {
      for (;;) {}
    }
  }
  
  protected void onRestart()
  {
    super.onRestart();
    getWindow().addFlags(1024);
  }
  
  protected void onResume()
  {
    super.onResume();
    this.an = false;
    this.am = new fm(this);
    this.am.sendMessage(this.am.obtainMessage());
    int i1 = Settings.System.getInt(getContentResolver(), "screen_brightness", 255);
    this.F.setProgress(i1);
    l.a(getApplicationContext());
    this.o = j.a(getApplicationContext());
    this.a = (com.ireadercity.b2.a.D - this.o.a() * 2);
    this.b = (com.ireadercity.b2.a.E - this.o.a() * 2);
    String.format("SCREENWIDTH=%d,SCREENHEIGHT=%d,getPagePadding=%d,SCREENWIDTH_WEB=%d", new Object[] { Integer.valueOf(com.ireadercity.b2.a.D), Integer.valueOf(com.ireadercity.b2.a.E), Integer.valueOf(this.o.a()), Integer.valueOf(this.a) });
    a(this.P);
    y.c(getApplicationContext());
    if (this.n == null) {
      this.n = ((PowerManager)getSystemService("power")).newWakeLock(536870922, "ShowContent");
    }
    this.n.setReferenceCounted(false);
    if (!this.n.isHeld()) {
      this.n.acquire(com.ireadercity.b2.a.j);
    }
    if (com.ireadercity.b2.a.i) {}
    try
    {
      MobclickAgent.onResume(this);
      if (com.ireadercity.b2.a.Y)
      {
        if (this.p == null) {
          this.p = new gi(this);
        }
        try
        {
          registerReceiver(this.p, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
          this.ai.setVisibility(0);
          return;
        }
        catch (Throwable localThrowable)
        {
          for (;;)
          {
            localThrowable.printStackTrace();
          }
        }
      }
      this.ai.setVisibility(8);
      return;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  protected void onStop()
  {
    super.onStop();
    try
    {
      r.b(this.L.j());
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\ShowContentScrollUpAndDown.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */