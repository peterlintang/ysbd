package com.ireadercity.b2.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import com.ireadercity.b2.a;
import com.ireadercity.b2.bean.g;
import com.ireadercity.b2.bean.i;
import com.ireadercity.b2.bean.j;
import com.ireadercity.b2.bean.k;
import com.ireadercity.b2.bean.l;
import com.ireadercity.b2.h.n;
import com.ireadercity.b2.h.u;
import com.ireadercity.b2.h.v;
import com.ireadercity.b2.h.w;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SetReaderActivity
  extends Activity
{
  private static String F;
  private static int G;
  private static int H;
  private static i I = new i();
  private ArrayAdapter<String> A;
  private ArrayAdapter<String> B;
  private RelativeLayout C;
  private RelativeLayout D;
  private RelativeLayout E;
  private int J;
  private int K;
  private float L = 1.0F;
  private int M;
  private int N;
  private CheckBox O;
  private Button P;
  private Button Q;
  public Bitmap a;
  int b = 1;
  Paint c;
  private final String d = "pageeffect";
  private Context e = this;
  private String[] f;
  private String[] g;
  private String[] h;
  private Spinner i;
  private Spinner j;
  private Spinner k;
  private Spinner l;
  private Spinner m;
  private TextView n;
  private SeekBar o;
  private SeekBar p;
  private SeekBar q;
  private TextView r;
  private TextView s;
  private CheckBox t;
  private TextView u;
  private Button v;
  private Button w;
  private ArrayAdapter<String> x;
  private ArrayAdapter<String> y;
  private ArrayAdapter<String> z;
  
  private void a(Bitmap paramBitmap)
  {
    if ((this.a != null) && (!this.a.isRecycled()))
    {
      this.a.recycle();
      this.a = null;
      a.d();
    }
    this.a = paramBitmap;
  }
  
  private void f()
  {
    boolean bool = false;
    Object localObject = new String[l.a().size()];
    String[] arrayOfString = new String[l.b().size()];
    int i1 = 0;
    while (i1 < l.a().size())
    {
      localObject[i1] = ((k)l.a().get(i1)).a();
      i1 += 1;
    }
    i1 = 0;
    while (i1 < l.b().size())
    {
      arrayOfString[i1] = ((k)l.b().get(i1)).a();
      i1 += 1;
    }
    this.i = ((Spinner)findViewById(2131362272));
    this.j = ((Spinner)findViewById(2131362274));
    this.k = ((Spinner)findViewById(2131362281));
    this.l = ((Spinner)findViewById(2131362284));
    this.m = ((Spinner)findViewById(2131362286));
    this.n = ((TextView)findViewById(2131362270));
    this.o = ((SeekBar)findViewById(2131362296));
    this.p = ((SeekBar)findViewById(2131362292));
    this.q = ((SeekBar)findViewById(2131362289));
    this.t = ((CheckBox)findViewById(2131362297));
    this.C = ((RelativeLayout)findViewById(2131362299));
    this.C = ((RelativeLayout)findViewById(2131362299));
    Button localButton1 = (Button)this.C.findViewById(2131362300);
    Button localButton2;
    if (u.a(getApplicationContext()))
    {
      localButton1.setTag(Boolean.valueOf(true));
      a(true);
      a.X = true;
      localButton1.setOnClickListener(new fj(this));
      this.D = ((RelativeLayout)findViewById(2131362303));
      localButton1 = (Button)this.D.findViewById(2131362304);
      this.E = ((RelativeLayout)findViewById(2131362307));
      localButton2 = (Button)this.E.findViewById(2131362308);
      localButton1.setOnClickListener(new fk(this));
      if (!u.b(getApplicationContext())) {
        break label864;
      }
      localButton1.setTag(Boolean.valueOf(true));
      b(true);
      a.Y = true;
      label414:
      localButton2.setOnClickListener(new fl(this));
      if (I.q() != 1) {
        break label885;
      }
      c(true);
      localButton2.setTag(Boolean.valueOf(true));
    }
    int i2;
    for (;;)
    {
      this.r = ((TextView)findViewById(2131362290));
      this.s = ((TextView)findViewById(2131362293));
      this.i.setPromptId(2131230827);
      this.j.setPromptId(2131230828);
      this.k.setPromptId(2131230829);
      this.u = ((TextView)findViewById(2131362269));
      ((TextView)findViewById(2131362268)).setOnClickListener(new eo(this));
      this.v = ((Button)findViewById(2131362311));
      this.w = ((Button)findViewById(2131362282));
      this.w.setOnClickListener(new fa(this));
      this.x = new ArrayAdapter(this, 17367048, (Object[])localObject);
      this.x.setDropDownViewResource(17367049);
      this.i.setAdapter(this.x);
      this.i.setSelection(l.a(I.a(), l.a()), false);
      this.i.setOnTouchListener(new fc(this));
      this.i.setOnItemSelectedListener(new fd(this));
      this.y = new ArrayAdapter(this, 17367048, arrayOfString);
      this.y.setDropDownViewResource(17367049);
      this.j.setAdapter(this.y);
      this.j.setSelection(l.a(I.b(), l.b()), false);
      this.j.setOnTouchListener(new fe(this));
      this.j.setOnItemSelectedListener(new ff(this));
      this.z = new ArrayAdapter(this, 17367048, this.f);
      this.z.setDropDownViewResource(17367049);
      this.k.setAdapter(this.z);
      i1 = 0;
      i2 = 0;
      while (i1 < this.f.length)
      {
        if (this.f[i1].endsWith(I.j())) {
          i2 = i1;
        }
        i1 += 1;
      }
      localButton1.setTag(Boolean.valueOf(false));
      a(false);
      a.X = false;
      break;
      label864:
      localButton1.setTag(Boolean.valueOf(false));
      b(false);
      a.Y = false;
      break label414;
      label885:
      c(false);
      localButton2.setTag(Boolean.valueOf(false));
    }
    this.k.setSelection(i2, false);
    this.k.setOnItemSelectedListener(new fg(this));
    this.A = new ArrayAdapter(this, 17367048, this.g);
    this.A.setDropDownViewResource(17367049);
    this.l.setAdapter(this.A);
    this.l.setSelection(I.p() - 1, false);
    this.l.setOnItemSelectedListener(new fh(this));
    this.B = new ArrayAdapter(this, 17367048, this.h);
    this.B.setDropDownViewResource(17367049);
    this.m.setAdapter(this.B);
    this.m.setSelection(I.r(), false);
    this.m.setOnItemSelectedListener(new fi(this));
    this.p.setMax(this.K - 8);
    this.p.setProgress(I.n() - 8);
    this.s.setText(I.n());
    this.p.setOnSeekBarChangeListener(new ep(this));
    this.q.setMax(100);
    this.q.setProgress(I.o() - 100);
    this.r.setText(I.o() + "%");
    this.q.setOnSeekBarChangeListener(new eq(this));
    this.o.setProgress(Math.round(I.i() / this.L) - 8);
    this.o.setOnSeekBarChangeListener(new er(this));
    if (I.k() == 1) {
      this.t.setChecked(true);
    }
    for (;;)
    {
      this.t.setOnCheckedChangeListener(new es(this));
      this.O = ((CheckBox)findViewById(2131362276));
      this.P = ((Button)findViewById(2131362278));
      this.Q = ((Button)findViewById(2131362279));
      localObject = this.O;
      if (I.s() == 1) {
        bool = true;
      }
      ((CheckBox)localObject).setChecked(bool);
      this.O.setOnCheckedChangeListener(new et(this));
      this.P.setOnClickListener(new eu(this));
      this.Q.setOnClickListener(new ew(this));
      this.u.setOnClickListener(new ex(this));
      this.v.setOnClickListener(new ey(this));
      return;
      this.t.setChecked(false);
    }
  }
  
  public final void a()
  {
    this.c = w.a(I, this);
    this.n.setText("");
    this.n.setTextColor(this.c.getColor());
    this.n.getPaint().set(this.c);
    this.n.setText(getString(2131230826));
    this.n.setPadding(g.b, g.c, g.b / 2, g.c / 2);
    this.n.setLineSpacing(0.0F, g.i);
    for (;;)
    {
      try
      {
        int i2 = this.n.getWidth();
        int i3 = this.n.getHeight();
        int i1 = i3;
        if (i3 <= 0)
        {
          i1 = a.a(this, 120.0F);
          i2 = a.D - a.a(this, 16.0F);
        }
        Rect localRect = new Rect(0, 0, i2, i1);
        if ((w.b != null) && (!w.b.isRecycled()))
        {
          Bitmap localBitmap = w.b;
          Object localObject = Bitmap.Config.RGB_565;
          i2 = localRect.width();
          i3 = localRect.height();
          new StringBuilder("d w=").append(i2).append(" h=").append(i3).toString();
          a(Bitmap.createBitmap(i2, i3, (Bitmap.Config)localObject));
          localObject = new Canvas(this.a);
          i1 = localBitmap.getWidth();
          i2 = i3 * i1 / i2;
          new StringBuilder("w=").append(i1).append(" h=").append(i2).toString();
          ((Canvas)localObject).drawBitmap(localBitmap, new Rect(0, 0, i1, i2), localRect, null);
          if (a.U < 16) {
            continue;
          }
          this.n.setBackgroundDrawable(new BitmapDrawable(getResources(), this.a));
        }
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
        continue;
      }
      this.n.invalidate();
      return;
      this.n.setBackgroundDrawable(new BitmapDrawable(getResources(), this.a));
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    TextView localTextView1 = (TextView)this.C.findViewById(2131362301);
    TextView localTextView2 = (TextView)this.C.findViewById(2131362302);
    if (paramBoolean)
    {
      localTextView1.setTextColor(-1);
      localTextView2.setTextColor(-16777216);
    }
    while (paramBoolean)
    {
      this.C.setBackgroundResource(2130837577);
      return;
      localTextView1.setTextColor(-16777216);
      localTextView2.setTextColor(-1);
    }
    this.C.setBackgroundResource(2130837576);
  }
  
  public final void b()
  {
    j.b(this);
    I.a(this);
    j localj = j.a(this);
    this.i.setSelection(0, true);
    this.j.setSelection(0, false);
    u.a(getApplicationContext(), false);
    u.b(getApplicationContext(), false);
    this.k.setSelection(0);
    this.t.setChecked(false);
    this.J = I.i();
    this.o.setProgress(Math.round(I.i() / this.L) - 8);
    this.q.setProgress(localj.c() - 100);
    this.p.setProgress(localj.a() - 8);
    u.b(this.e, false);
    this.O.setChecked(false);
    b(false);
    c(false);
    a();
    this.M = 2;
    new StringBuilder("resultCode=").append(this.M).toString();
  }
  
  public final void b(boolean paramBoolean)
  {
    TextView localTextView1 = (TextView)this.D.findViewById(2131362305);
    TextView localTextView2 = (TextView)this.D.findViewById(2131362306);
    if (paramBoolean)
    {
      localTextView1.setTextColor(-1);
      localTextView2.setTextColor(-16777216);
    }
    while (paramBoolean)
    {
      this.D.setBackgroundResource(2130837577);
      return;
      localTextView1.setTextColor(-16777216);
      localTextView2.setTextColor(-1);
    }
    this.D.setBackgroundResource(2130837576);
  }
  
  public final void c(boolean paramBoolean)
  {
    TextView localTextView1 = (TextView)this.E.findViewById(2131362309);
    TextView localTextView2 = (TextView)this.E.findViewById(2131362310);
    if (paramBoolean)
    {
      localTextView1.setTextColor(-1);
      localTextView2.setTextColor(-16777216);
    }
    while (paramBoolean)
    {
      this.E.setBackgroundResource(2130837577);
      return;
      localTextView1.setTextColor(-16777216);
      localTextView2.setTextColor(-1);
    }
    this.E.setBackgroundResource(2130837576);
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if ((paramInt1 == this.b) && (paramInt2 == -1) && (paramIntent != null)) {}
    try
    {
      paramIntent = managedQuery(paramIntent.getData(), new String[] { "_data" }, null, null, null);
      paramInt1 = paramIntent.getColumnIndexOrThrow("_data");
      paramIntent.moveToFirst();
      paramIntent = paramIntent.getString(paramInt1);
      Object localObject = new File(paramIntent);
      new StringBuilder("f.getName()=").append(((File)localObject).getName()).toString();
      localObject = a.s + ((File)localObject).getName();
      n.a(paramIntent, (String)localObject);
      new StringBuilder("fileCopyed=selectedImagePath=").append(paramIntent).append(" dtPath=").append((String)localObject).toString();
      I.e((String)localObject);
      a();
      return;
    }
    catch (Exception paramIntent)
    {
      paramIntent.printStackTrace();
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.M = 0;
    getWindow().setFlags(2048, 2048);
    setContentView(2130903134);
    this.L = v.b(getApplicationContext());
    this.K = (getWindowManager().getDefaultDisplay().getWidth() / 6);
    this.N = getIntent().getIntExtra("src", 0);
    I.a(this);
    F = I.h();
    paramBundle = new String[l.a().size()];
    Object localObject1 = new String[l.b().size()];
    int i1 = 0;
    while (i1 < l.a().size())
    {
      paramBundle[i1] = ((k)l.a().get(i1)).a();
      i1 += 1;
    }
    i1 = 0;
    while (i1 < l.b().size())
    {
      localObject1[i1] = ((k)l.b().get(i1)).a();
      i1 += 1;
    }
    localObject1 = new File(a.t);
    paramBundle = new ArrayList();
    localObject1 = ((File)localObject1).listFiles();
    if ((localObject1 != null) && (localObject1.length != 0))
    {
      int i2 = localObject1.length;
      i1 = 0;
      while (i1 < i2)
      {
        Object localObject2 = localObject1[i1];
        if (((File)localObject2).getName().toLowerCase().endsWith(".ttf")) {
          paramBundle.add(localObject2);
        }
        i1 += 1;
      }
    }
    this.f = new String[paramBundle.size() + 5];
    this.f[0] = "默认(新版)";
    this.f[1] = "默认(旧版)";
    this.f[2] = "Arial";
    this.f[3] = "Courier New";
    this.f[4] = "Time New Roman";
    paramBundle = paramBundle.iterator();
    i1 = 5;
    while (paramBundle.hasNext())
    {
      localObject1 = (File)paramBundle.next();
      this.f[i1] = ("[自定义]" + ((File)localObject1).getName());
      i1 += 1;
    }
    this.g = new String[7];
    this.g[0] = "自由滑动";
    this.g[1] = "3D翻页";
    this.g[2] = "左右滑动";
    this.g[3] = "左右覆盖";
    this.g[4] = "上下滑动";
    this.g[5] = "上下覆盖";
    this.g[6] = "无动画";
    this.h = new String[3];
    this.h[0] = "默认(不转换)";
    this.h[1] = "转换成繁体";
    this.h[2] = "转换成简体";
    f();
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    a(null);
  }
  
  protected void onResume()
  {
    super.onResume();
    a();
  }
  
  protected void onStart()
  {
    super.onStart();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\SetReaderActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */