package com.ireadercity.b2.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.ClipData;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask.Status;
import android.os.Debug;
import android.os.Handler;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.provider.Settings.System;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;
import com.ireadercity.b2.a.ah;
import com.ireadercity.b2.a.al;
import com.ireadercity.b2.b.d;
import com.ireadercity.b2.b.f;
import com.ireadercity.b2.b.q;
import com.ireadercity.b2.bean.b;
import com.ireadercity.b2.bean.i;
import com.ireadercity.b2.bean.j;
import com.ireadercity.b2.bean.l;
import com.ireadercity.b2.curlview.CurlView;
import com.ireadercity.b2.curlview.k;
import com.ireadercity.b2.h.w;
import com.ireadercity.b2.h.y;
import com.ireadercity.b2.ui.widget.SimpleReadingView;
import com.umeng.analytics.MobclickAgent;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BookReadingActivityNew
  extends Activity
  implements f, k
{
  private static int aE;
  private static int aF;
  public static String[] g = { "", "主控界面", "三控界面", "风格设置界面", "语音阅读设置界面" };
  public static int x = 30;
  private TextView A;
  private ImageButton B;
  private LinearLayout C;
  private LinearLayout D;
  private LinearLayout E;
  private LinearLayout F;
  private LinearLayout G;
  private ImageView H;
  private TextView I;
  private TextView J;
  private TextView K;
  private ImageButton L;
  private ImageButton M;
  private SeekBar N;
  private RelativeLayout O;
  private LinearLayout P;
  private LinearLayout Q;
  private LinearLayout R;
  private RelativeLayout S;
  private Button T;
  private Button U;
  private LinearLayout V;
  private TextView W;
  private TextView X;
  private Button Y;
  private ImageButton Z;
  RelativeLayout a;
  private RelativeLayout aA;
  private boolean aB = false;
  private String aC;
  private b aD;
  private String aG = "";
  private float aH;
  private String aI = "";
  private d aJ;
  private boolean aK = false;
  private boolean aL = false;
  private boolean aM = false;
  private int aN;
  private ArrayList<HashMap<String, String>> aO = new ArrayList();
  private EditText aP;
  private TextView aQ;
  private TextView aR;
  private ArrayList<HashMap<String, String>> aS = new ArrayList();
  private boolean aT = false;
  private i aU = new i();
  private float aV = 1.0F;
  private com.ireadercity.b2.b.r aW;
  private Paint aX;
  private com.ireadercity.b2.c.a aY;
  private dj aZ;
  private ImageButton aa;
  private ImageButton ab;
  private ImageButton ac;
  private ImageView ad;
  private LinearLayout ae;
  private HorizontalScrollView af;
  private al ag;
  private al ah;
  private ah ai;
  private LinearLayout aj;
  private SeekBar ak;
  private Button al;
  private Button am;
  private Button an;
  private RelativeLayout ao;
  private com.ireadercity.b2.g.a ap;
  private dn aq;
  private RelativeLayout ar;
  private RelativeLayout as;
  private RelativeLayout at;
  private TextView au;
  private TextView av;
  private ImageView aw;
  private Handler ax;
  private boolean ay = false;
  private EditText az;
  int b = 0;
  private Animation ba;
  private boolean bb = false;
  private do bc;
  private Boolean bd = Boolean.valueOf(false);
  private CurlView be;
  private SimpleReadingView bf;
  private int bg = 0;
  private boolean bh = false;
  private RelativeLayout bi;
  private EditText bj;
  private ListView bk;
  private SimpleAdapter bl;
  private String bm;
  private int bn;
  private Button bo;
  private Button bp;
  private ImageButton bq;
  private ImageButton br;
  private ImageButton bs;
  private ImageButton bt;
  private RelativeLayout bu;
  private ArrayList<HashMap<String, Object>> bv = new ArrayList();
  private d bw = new d(this);
  private boolean bx = false;
  Button c;
  Button d;
  Button e;
  Button f;
  protected String h = "BookReadingActivity";
  int i;
  boolean j = true;
  boolean k = false;
  boolean l = false;
  boolean m = false;
  boolean n = false;
  int o = 0;
  boolean p;
  RelativeLayout q = null;
  RelativeLayout r = null;
  boolean s = false;
  boolean t = false;
  PowerManager.WakeLock u;
  j v;
  boolean w = false;
  private RelativeLayout y;
  private ImageButton z;
  
  private ArrayList<HashMap<String, Object>> a(String paramString1, int paramInt, String paramString2)
  {
    new StringBuilder("getSearchResult URL4Search=").append(paramString1).append(" chapterIndex4Search=").append(paramInt).append(" searchStr=").append(paramString2).toString();
    ArrayList localArrayList = new ArrayList();
    if (paramString1 != null) {}
    for (;;)
    {
      try
      {
        String str = this.bw.b(paramString1, this.aD);
        if (str == null) {
          return null;
        }
        new StringBuilder("txtContent!=null txtContent=").append(str).toString();
        str = d.a(str);
        paramString2 = Pattern.compile(paramString2).matcher(str);
        new StringBuilder(" matcher.find()=").append(paramString2.find()).toString();
        if (!paramString2.find()) {
          break;
        }
        HashMap localHashMap = new HashMap();
        float f1 = paramString2.start() / str.length() * 100.0F;
        localHashMap.put("floatPercent", Float.valueOf(f1));
        localHashMap.put("URL", paramString1);
        localHashMap.put("percent", (int)f1 + "%");
        localHashMap.put("chapterIndex", Integer.valueOf(paramInt));
        localHashMap.put("chapterIndex4diaplay", Integer.valueOf(paramInt + 1));
        int i3 = paramString2.start();
        int i2 = x + i3;
        int i1 = i2;
        if (i2 > str.length()) {
          i1 = str.length();
        }
        localHashMap.put("textShowing", str.substring(i3, i1) + "...");
        new StringBuilder("******FOUND******").append(localHashMap.get("chapterIndex")).append(" ").append(localHashMap.get("percent")).append(" ").append(localHashMap.get("textShowing")).toString();
        localArrayList.add(localHashMap);
        continue;
        str = d.a(this.aD, paramInt);
      }
      catch (Exception paramString1)
      {
        paramString1.printStackTrace();
        return localArrayList;
      }
    }
    return localArrayList;
  }
  
  private int f(int paramInt)
  {
    int i1 = 0;
    if (this.aD.t().equalsIgnoreCase("txt")) {
      return paramInt;
    }
    String str = (String)((HashMap)this.aO.get(paramInt)).get("src");
    if (str.indexOf("#") >= 0) {
      str = str.substring(0, str.indexOf("#"));
    }
    for (;;)
    {
      int i2 = -1;
      while (i1 < this.aS.size())
      {
        if (((String)((HashMap)this.aS.get(i1)).get("src")).toString().equalsIgnoreCase(str))
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
  
  private boolean f(String paramString)
  {
    if (this.bd.booleanValue()) {}
    for (Object localObject1 = Bitmap.createBitmap(this.be.g()); localObject1 == null; localObject1 = Bitmap.createBitmap(((View)localObject1).getDrawingCache()))
    {
      localObject1 = null;
      if (localObject1 != null) {
        break label303;
      }
      return false;
      localObject1 = this.bf;
      ((View)localObject1).setDrawingCacheEnabled(true);
      ((View)localObject1).measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
      ((View)localObject1).layout(0, 0, ((View)localObject1).getMeasuredWidth(), ((View)localObject1).getMeasuredHeight());
      ((View)localObject1).buildDrawingCache();
    }
    Object localObject2 = new ByteArrayOutputStream();
    ((Bitmap)localObject1).compress(Bitmap.CompressFormat.JPEG, 10, (OutputStream)localObject2);
    if (((ByteArrayOutputStream)localObject2).toByteArray().length / 1024 > 1024)
    {
      ((ByteArrayOutputStream)localObject2).reset();
      ((Bitmap)localObject1).compress(Bitmap.CompressFormat.JPEG, 50, (OutputStream)localObject2);
    }
    localObject1 = new ByteArrayInputStream(((ByteArrayOutputStream)localObject2).toByteArray());
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    localOptions.inJustDecodeBounds = true;
    BitmapFactory.decodeStream((InputStream)localObject1, null, localOptions);
    localOptions.inJustDecodeBounds = false;
    int i1 = localOptions.outWidth;
    int i2 = localOptions.outHeight;
    if ((i1 > i2) && (i1 > 480.0F)) {
      i1 = (int)(localOptions.outWidth / 480.0F);
    }
    for (;;)
    {
      i2 = i1;
      if (i1 <= 0) {
        i2 = 1;
      }
      localOptions.inSampleSize = i2;
      localObject1 = BitmapFactory.decodeStream(new ByteArrayInputStream(((ByteArrayOutputStream)localObject2).toByteArray()), null, localOptions);
      break;
      if ((i1 < i2) && (i2 > 800.0F))
      {
        i1 = (int)(localOptions.outHeight / 800.0F);
        continue;
        label303:
        if ((q.a()) && (!q.b())) {
          try
          {
            localObject2 = new File(paramString);
            if (!((File)localObject2).getParentFile().exists()) {
              ((File)localObject2).getParentFile().mkdirs();
            }
            localObject2 = new FileOutputStream((File)localObject2);
            ((Bitmap)localObject1).compress(Bitmap.CompressFormat.PNG, 100, (OutputStream)localObject2);
            new StringBuilder("OK>>").append(paramString).toString();
            ((FileOutputStream)localObject2).flush();
            ((FileOutputStream)localObject2).close();
            return true;
          }
          catch (Exception paramString)
          {
            return false;
          }
        }
        return false;
      }
      else
      {
        i1 = 1;
      }
    }
  }
  
  private int g(int paramInt)
  {
    if (!this.aD.y()) {
      return paramInt;
    }
    String str = (String)((HashMap)this.aS.get(paramInt)).get("src");
    int i1 = 0;
    int i2 = -1;
    while (i1 < this.aO.size())
    {
      if (((String)((HashMap)this.aO.get(i1)).get("src")).toString().toLowerCase().indexOf(str.toLowerCase()) >= 0)
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
      i1 = aE;
    }
    return i1;
  }
  
  private void h(int paramInt)
  {
    if (paramInt == 1) {}
    MotionEvent localMotionEvent1;
    MotionEvent localMotionEvent2;
    for (float f1 = com.ireadercity.b2.a.D - 100;; f1 = 100.0F)
    {
      localMotionEvent1 = MotionEvent.obtain(0L, 0L, 0, f1, com.ireadercity.b2.a.E / 2, 0);
      localMotionEvent2 = MotionEvent.obtain(0L, 0L, 1, f1, com.ireadercity.b2.a.E / 2, 0);
      if (!this.bd.booleanValue()) {
        break;
      }
      this.be.onTouch(this.be, localMotionEvent1);
      this.be.onTouch(this.be, localMotionEvent2);
      return;
    }
    this.bf.onTouch(this.be, localMotionEvent1);
    this.bf.onTouch(this.be, localMotionEvent2);
  }
  
  private void m()
  {
    try
    {
      this.aY.a(this.aD.j(), aF);
      this.aD.b(aF);
      n();
      if (com.ireadercity.b2.a.i) {
        MobclickAgent.onPause(this);
      }
      return;
    }
    catch (Exception localException) {}
  }
  
  private void n()
  {
    try
    {
      this.aY = com.ireadercity.b2.c.a.a(getApplicationContext());
      if ((aE >= 0) && (aE < this.aO.size())) {
        this.aY.a(this.aD.j(), aE, this.aH);
      }
      if (this.aD.y()) {
        this.aY.b(this.aD.j(), aF, this.aH);
      }
      return;
    }
    catch (Exception localException)
    {
      localException.getMessage();
    }
  }
  
  private void o()
  {
    this.bx = false;
    this.bo.setText("开始搜索");
    this.bo.setEnabled(true);
  }
  
  private boolean p()
  {
    if (this.y.getVisibility() == 0) {}
    while ((this.S.getVisibility() == 0) || (this.ao.getVisibility() == 0)) {
      return true;
    }
    return false;
  }
  
  public final void a()
  {
    j();
  }
  
  public final void a(int paramInt)
  {
    int i2 = 2130837525;
    int i1 = paramInt;
    if (this.aU.m() == 1) {
      i1 = -paramInt;
    }
    paramInt = i2;
    switch (i1)
    {
    default: 
      paramInt = i2;
    }
    for (;;)
    {
      this.aw.setImageResource(paramInt);
      return;
      paramInt = 2130837522;
      continue;
      paramInt = 2130837523;
      continue;
      paramInt = 2130837524;
      continue;
      paramInt = 2130837526;
      continue;
      paramInt = 2130837527;
      continue;
      paramInt = 2130838184;
      continue;
      paramInt = 2130838185;
      continue;
      paramInt = 2130838186;
      continue;
      paramInt = 2130838187;
      continue;
      paramInt = 2130838188;
    }
  }
  
  public final void a(i parami, boolean paramBoolean)
  {
    if ((this.aX == null) || (paramBoolean))
    {
      this.aX = w.a(parami, this);
      if (this.aW != null) {
        this.aW.a(this.aX);
      }
    }
  }
  
  public final void a(String paramString)
  {
    this.aG = paramString;
    if (this.aU.m() == 0)
    {
      this.aU.i(1);
      this.av.setTextColor(-1);
      this.au.setTextColor(-1);
      this.ad.setImageResource(2130837741);
      this.H.setImageResource(2130837764);
      this.I.setText("白天");
      this.aU.e(this.aU.d());
      this.aU.c(this.aU.g());
      this.ae.removeAllViews();
      i1 = 0;
      while (i1 < this.ah.e())
      {
        this.ae.addView((View)this.ah.c().get(i1));
        i1 += 1;
      }
    }
    this.aU.i(0);
    this.av.setTextColor(-16777216);
    this.au.setTextColor(-16777216);
    this.ad.setImageResource(2130837764);
    this.H.setImageResource(2130837741);
    this.I.setText("黑夜");
    this.aU.e(this.aU.c());
    this.aU.c(this.aU.f());
    this.ae.removeAllViews();
    int i1 = 0;
    while (i1 < this.ag.e())
    {
      this.ae.addView((View)this.ag.c().get(i1));
      i1 += 1;
    }
    a(this.i);
    this.aU.b(getApplicationContext());
    a(this.aU, true);
    if (this.bd.booleanValue()) {
      try
      {
        this.be.f();
        this.be.requestRender();
        return;
      }
      catch (OutOfMemoryError paramString)
      {
        for (;;)
        {
          paramString.printStackTrace();
        }
      }
      catch (Exception paramString)
      {
        for (;;)
        {
          paramString.printStackTrace();
        }
      }
    }
    this.bf.a(this.bf.a());
  }
  
  public final void a(boolean paramBoolean)
  {
    new StringBuilder("switchSelectionMode=").append(paramBoolean).toString();
    if (paramBoolean)
    {
      e(g[0]);
      this.az.setVisibility(0);
      String str = this.aW.a(this.bg);
      this.az.setText(str);
      this.az.requestFocus();
      if ((this.s) && (this.q.getVisibility() == 0)) {
        this.q.setVisibility(8);
      }
      for (;;)
      {
        try
        {
          if ((w.b != null) && (!w.b.isRecycled())) {
            continue;
          }
          this.az.setBackgroundColor(-16777216);
        }
        catch (Exception localException)
        {
          continue;
        }
        if (com.ireadercity.b2.a.U < 11)
        {
          this.az.onTextContextMenuItem(16908328);
          this.bu.setVisibility(0);
        }
        ((InputMethodManager)getSystemService("input_method")).hideSoftInputFromWindow(this.az.getApplicationWindowToken(), 2);
        Toast.makeText(this, "【点击】你要选择的文字，然后【拖动】以选择更多内容。", 0).show();
        return;
        this.az.setBackgroundDrawable(new BitmapDrawable(w.b));
      }
    }
    if ((this.s) && (this.q.getVisibility() == 8)) {
      this.q.setVisibility(0);
    }
    this.az.setVisibility(8);
    if (com.ireadercity.b2.a.U < 11) {
      this.bu.setVisibility(8);
    }
    this.bh = false;
  }
  
  public final void b()
  {
    b("next");
  }
  
  public final void b(int paramInt)
  {
    new StringBuilder(" ALL page ready !!!!!!!!!  ->dstindex=").append(paramInt).toString();
    runOnUiThread(new Thread(new cv(this, paramInt)));
  }
  
  public final void b(String paramString)
  {
    for (;;)
    {
      try
      {
        if (this.aZ != null)
        {
          boolean bool = this.aZ.getStatus().equals(AsyncTask.Status.FINISHED);
          if (!bool) {
            return;
          }
        }
        new StringBuilder("goChapter begin=").append(paramString).append(" spineIndex=").append(aF).append(" navIndex").append(aE).toString();
        this.aG = paramString;
        if (!paramString.endsWith("back")) {
          break label314;
        }
        if (aF - 1 >= 0)
        {
          if ((!this.aD.t().equalsIgnoreCase("txt")) && (this.aS != null) && (this.aS.size() > 0) && (aF - 1 >= 0))
          {
            this.aC = ((String)((HashMap)this.aS.get(aF - 1)).get("src"));
            aE = g(aF - 1);
          }
          aF -= 1;
          if (this.aD.t().equalsIgnoreCase("txt")) {
            aE = aF;
          }
          new StringBuilder("URL=").append(this.aC).append(" chapterIndex=").append(aE).toString();
          this.aH = 100.0F;
          f();
          m();
          new StringBuilder("goChapter end=").append(paramString).append(" chapterIndexSpine=").append(aF).append(" navIndex").append(aE).toString();
          continue;
        }
        c("已到达书起始位置");
      }
      finally {}
      continue;
      label314:
      if (paramString.endsWith("next")) {
        if (aF + 1 < this.o)
        {
          if ((!this.aD.t().equalsIgnoreCase("txt")) && (this.aS != null) && (this.aS.size() > 0) && (aF + 1 < this.aS.size()))
          {
            this.aC = ((String)((HashMap)this.aS.get(aF + 1)).get("src"));
            aE = g(aF + 1);
          }
          aF += 1;
          if (this.aD.t().equalsIgnoreCase("txt")) {
            aE = aF;
          }
          new StringBuilder("URL=").append(this.aC).append(" chapterIndex=").append(aE).toString();
          this.aH = 0.0F;
          f();
        }
        else
        {
          c("已到达书结尾位置");
        }
      }
    }
  }
  
  public final void c()
  {
    b("back");
  }
  
  public final void c(int paramInt)
  {
    int i1 = this.az.getSelectionStart();
    int i2 = this.az.getSelectionEnd();
    String str = this.az.getText().toString().substring(i1, i2);
    switch (paramInt)
    {
    case 2131362589: 
    default: 
      return;
    case 16908327: 
      a(false);
      return;
    case 2131362237: 
      a(false);
      return;
    case 2131362235: 
      if (com.ireadercity.b2.a.U >= 11) {
        ((android.content.ClipboardManager)getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(str, str));
      }
      for (;;)
      {
        Toast.makeText(this, "已拷贝", 0).show();
        return;
        ((android.text.ClipboardManager)getSystemService("clipboard")).setText(str);
      }
    }
    Intent localIntent = new Intent("android.intent.action.SEND");
    localIntent.setType("text/plain");
    localIntent.putExtra("android.intent.extra.SUBJECT", "#书香云集书分享# 书名：" + this.aD.k() + " 作者：" + this.aD.n());
    localIntent.putExtra("android.intent.extra.TEXT", "#书香云集书摘# " + str);
    startActivity(Intent.createChooser(localIntent, this.aD.k()));
  }
  
  public final void c(String paramString)
  {
    paramString = Toast.makeText(this, paramString, 0);
    paramString.setGravity(17, 0, 0);
    paramString.show();
  }
  
  public final void d()
  {
    if (p())
    {
      e(g[0]);
      return;
    }
    e(g[1]);
  }
  
  public final void d(String paramString)
  {
    this.bx = true;
    label449:
    for (;;)
    {
      try
      {
        runOnUiThread(new cx(this));
        Object localObject1 = "";
        int i1 = aE;
        i1 = aF - 1;
        Object localObject2;
        if ((i1 + 1 < this.o) && (this.bx))
        {
          localObject2 = localObject1;
          if (this.aD.y())
          {
            localObject2 = localObject1;
            if (this.aS != null)
            {
              localObject2 = localObject1;
              if (this.aS.size() > 0)
              {
                localObject2 = localObject1;
                if (i1 + 1 < this.aS.size())
                {
                  localObject2 = (String)((HashMap)this.aS.get(i1 + 1)).get("src");
                  g(i1 + 1);
                }
              }
            }
          }
          i1 += 1;
          localObject1 = localObject2;
          if (this.aD.z()) {
            localObject1 = null;
          }
          new StringBuilder("URL4Search=").append((String)localObject1).append(" chapterIndexSpine4Search=").append(i1).toString();
          localObject2 = a((String)localObject1, i1, paramString);
          if ((localObject2 == null) || (((ArrayList)localObject2).size() <= 0)) {
            break label449;
          }
          runOnUiThread(new cy(this, (ArrayList)localObject2));
          break label449;
        }
        i1 = aE;
        i1 = aF;
        if ((i1 - 1 >= 0) && (this.bx))
        {
          localObject2 = localObject1;
          if (this.aD.y())
          {
            localObject2 = localObject1;
            if (this.aS != null)
            {
              localObject2 = localObject1;
              if (this.aS.size() > 0)
              {
                localObject2 = localObject1;
                if (i1 - 1 >= 0)
                {
                  localObject2 = (String)((HashMap)this.aS.get(i1 - 1)).get("src");
                  g(i1 - 1);
                }
              }
            }
          }
          int i2 = i1 - 1;
          if (this.aD.z()) {
            localObject2 = null;
          }
          new StringBuilder("URL4Search=").append((String)localObject2).append(" chapterIndexSpine4Search=").append(i2).toString();
          ArrayList localArrayList = a((String)localObject2, i2, paramString);
          localObject1 = localObject2;
          i1 = i2;
          if (localArrayList.size() <= 0) {
            continue;
          }
          System.out.print("----found something2----");
          runOnUiThread(new cz(this, localArrayList));
          localObject1 = localObject2;
          i1 = i2;
          continue;
        }
        runOnUiThread(new da(this));
      }
      catch (Exception paramString)
      {
        paramString.printStackTrace();
        return;
      }
      return;
    }
  }
  
  public final void e()
  {
    j();
  }
  
  public final void e(String paramString)
  {
    if (g[0].equals(paramString))
    {
      this.y.setVisibility(4);
      this.S.setVisibility(4);
      this.ao.setVisibility(4);
      if ((com.ireadercity.b2.a.av) && ("up".equals(this.a.getTag())))
      {
        this.a.offsetTopAndBottom(this.b);
        this.a.setTag("down");
      }
      getWindow().clearFlags(2048);
    }
    do
    {
      do
      {
        return;
        if (g[1].equals(paramString)) {
          try
          {
            this.A.setText((CharSequence)((HashMap)this.aO.get(aE)).get("title"));
            this.y.setVisibility(0);
            this.O.setVisibility(4);
            this.S.setVisibility(4);
            this.ao.setVisibility(4);
            getWindow().addFlags(2048);
            return;
          }
          catch (Exception paramString)
          {
            for (;;)
            {
              paramString.printStackTrace();
            }
          }
        }
        if (g[2].equals(paramString))
        {
          this.y.setVisibility(0);
          this.O.setVisibility(0);
          this.S.setVisibility(4);
          this.ao.setVisibility(4);
          return;
        }
        if (g[3].equals(paramString))
        {
          this.y.setVisibility(4);
          this.ao.setVisibility(4);
          this.S.setVisibility(0);
          return;
        }
      } while (!g[4].equals(paramString));
      this.y.setVisibility(4);
      this.S.setVisibility(4);
      this.ao.setVisibility(0);
    } while ((!com.ireadercity.b2.a.av) || (!"down".equals(this.a.getTag())));
    this.a.offsetTopAndBottom(-this.b);
    this.a.setTag("up");
  }
  
  /* Error */
  public final void f()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 1066	com/ireadercity/b2/ui/BookReadingActivityNew:aX	Landroid/graphics/Paint;
    //   6: aload_0
    //   7: getfield 272	com/ireadercity/b2/ui/BookReadingActivityNew:aU	Lcom/ireadercity/b2/bean/i;
    //   10: invokestatic 1419	com/ireadercity/b2/bean/g:a	(Landroid/graphics/Paint;Lcom/ireadercity/b2/bean/i;)V
    //   13: invokestatic 1421	com/ireadercity/b2/a:d	()V
    //   16: aload_0
    //   17: getfield 1224	com/ireadercity/b2/ui/BookReadingActivityNew:aZ	Lcom/ireadercity/b2/ui/dj;
    //   20: ifnonnull +58 -> 78
    //   23: aload_0
    //   24: new 1226	com/ireadercity/b2/ui/dj
    //   27: dup
    //   28: aload_0
    //   29: invokespecial 1422	com/ireadercity/b2/ui/dj:<init>	(Lcom/ireadercity/b2/ui/BookReadingActivityNew;)V
    //   32: putfield 1224	com/ireadercity/b2/ui/BookReadingActivityNew:aZ	Lcom/ireadercity/b2/ui/dj;
    //   35: aload_0
    //   36: getfield 1224	com/ireadercity/b2/ui/BookReadingActivityNew:aZ	Lcom/ireadercity/b2/ui/dj;
    //   39: iconst_0
    //   40: anewarray 1424	java/lang/Void
    //   43: invokevirtual 1428	com/ireadercity/b2/ui/dj:execute	([Ljava/lang/Object;)Landroid/os/AsyncTask;
    //   46: pop
    //   47: aload_0
    //   48: getfield 298	com/ireadercity/b2/ui/BookReadingActivityNew:av	Landroid/widget/TextView;
    //   51: aload_0
    //   52: getfield 274	com/ireadercity/b2/ui/BookReadingActivityNew:aO	Ljava/util/ArrayList;
    //   55: invokevirtual 530	java/util/ArrayList:size	()I
    //   58: getstatic 507	com/ireadercity/b2/ui/BookReadingActivityNew:aE	I
    //   61: aload_0
    //   62: getfield 334	com/ireadercity/b2/ui/BookReadingActivityNew:aH	F
    //   65: ldc_w 353
    //   68: fdiv
    //   69: invokestatic 1431	com/ireadercity/b2/h/v:a	(IIF)Ljava/lang/String;
    //   72: invokevirtual 823	android/widget/TextView:setText	(Ljava/lang/CharSequence;)V
    //   75: aload_0
    //   76: monitorexit
    //   77: return
    //   78: aload_0
    //   79: getfield 1224	com/ireadercity/b2/ui/BookReadingActivityNew:aZ	Lcom/ireadercity/b2/ui/dj;
    //   82: invokevirtual 1230	com/ireadercity/b2/ui/dj:getStatus	()Landroid/os/AsyncTask$Status;
    //   85: getstatic 1236	android/os/AsyncTask$Status:FINISHED	Landroid/os/AsyncTask$Status;
    //   88: invokevirtual 1239	android/os/AsyncTask$Status:equals	(Ljava/lang/Object;)Z
    //   91: ifeq -44 -> 47
    //   94: aload_0
    //   95: new 1226	com/ireadercity/b2/ui/dj
    //   98: dup
    //   99: aload_0
    //   100: invokespecial 1422	com/ireadercity/b2/ui/dj:<init>	(Lcom/ireadercity/b2/ui/BookReadingActivityNew;)V
    //   103: putfield 1224	com/ireadercity/b2/ui/BookReadingActivityNew:aZ	Lcom/ireadercity/b2/ui/dj;
    //   106: aload_0
    //   107: getfield 1224	com/ireadercity/b2/ui/BookReadingActivityNew:aZ	Lcom/ireadercity/b2/ui/dj;
    //   110: iconst_0
    //   111: anewarray 1424	java/lang/Void
    //   114: invokevirtual 1428	com/ireadercity/b2/ui/dj:execute	([Ljava/lang/Object;)Landroid/os/AsyncTask;
    //   117: pop
    //   118: goto -71 -> 47
    //   121: astore_1
    //   122: aload_0
    //   123: monitorexit
    //   124: aload_1
    //   125: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	126	0	this	BookReadingActivityNew
    //   121	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	47	121	finally
    //   47	75	121	finally
    //   78	118	121	finally
  }
  
  protected void finalize()
  {
    super.finalize();
  }
  
  public final void g()
  {
    setResult(10087);
    finish();
  }
  
  public final void h()
  {
    this.aU.a(getApplicationContext());
    new StringBuilder("got UserSetRead setRead=").append(this.aU.t()).toString();
  }
  
  public final void i()
  {
    Object localObject1 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss ").format(new Date(System.currentTimeMillis()));
    Object localObject2 = (String)((HashMap)this.aO.get(aE)).get("title");
    View localView = getLayoutInflater().inflate(2130903088, (ViewGroup)findViewById(2131362024));
    AlertDialog localAlertDialog = new AlertDialog.Builder(this).create();
    localAlertDialog.setTitle(2131230824);
    localAlertDialog.setView(localView);
    this.aP = ((EditText)localView.findViewById(2131362026));
    this.aQ = ((TextView)localView.findViewById(2131362027));
    this.aR = ((TextView)localView.findViewById(2131362025));
    this.aQ.setText(getString(2131230888) + this.aH + "%");
    this.aR.setText((CharSequence)localObject1);
    this.aP.setText(String.format("%s %.2f%%", new Object[] { localObject2, Float.valueOf(this.aH) }));
    localObject1 = new cg(this);
    localObject2 = new cs(this, localAlertDialog);
    localAlertDialog.setButton(getString(2131230887), (DialogInterface.OnClickListener)localObject1);
    localAlertDialog.setButton2(getString(2131230845), (DialogInterface.OnClickListener)localObject2);
    localAlertDialog.show();
  }
  
  public final void j()
  {
    if (this.bd.booleanValue()) {}
    for (this.bg = this.be.c();; this.bg = this.bf.a())
    {
      this.N.setProgress(this.bg);
      if ((this.ap != null) && (this.ap.h())) {
        this.ap.a(this.aW.a(this.bg), aE * 100 + this.bg, aE * 100 + this.bg);
      }
      if (this.aW != null) {
        break;
      }
      return;
    }
    new StringBuilder("onTurnTopage......... currentIndex=").append(this.bg).toString();
    runOnUiThread(new cw(this));
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    new StringBuilder("BookReading onActivityResult resultCode=").append(paramInt2).toString();
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    switch (paramInt2)
    {
    default: 
      return;
    case 2: 
      new dl(this).execute(new Void[0]);
      return;
    }
    h();
    a(this.aU, true);
  }
  
  /* Error */
  public void onCreate(android.os.Bundle paramBundle)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: aload_0
    //   3: aload_1
    //   4: invokespecial 1563	android/app/Activity:onCreate	(Landroid/os/Bundle;)V
    //   7: getstatic 1030	com/ireadercity/b2/a:i	Z
    //   10: istore 4
    //   12: iload 4
    //   14: ifeq +7 -> 21
    //   17: aload_0
    //   18: invokestatic 1566	com/umeng/analytics/MobclickAgent:onError	(Landroid/content/Context;)V
    //   21: aload_0
    //   22: invokevirtual 1402	com/ireadercity/b2/ui/BookReadingActivityNew:getWindow	()Landroid/view/Window;
    //   25: invokevirtual 1570	android/view/Window:getAttributes	()Landroid/view/WindowManager$LayoutParams;
    //   28: astore_1
    //   29: aload_1
    //   30: aload_1
    //   31: getfield 1575	android/view/WindowManager$LayoutParams:flags	I
    //   34: sipush 1024
    //   37: ior
    //   38: putfield 1575	android/view/WindowManager$LayoutParams:flags	I
    //   41: aload_0
    //   42: invokevirtual 1402	com/ireadercity/b2/ui/BookReadingActivityNew:getWindow	()Landroid/view/Window;
    //   45: aload_1
    //   46: invokevirtual 1579	android/view/Window:setAttributes	(Landroid/view/WindowManager$LayoutParams;)V
    //   49: aload_0
    //   50: invokevirtual 1402	com/ireadercity/b2/ui/BookReadingActivityNew:getWindow	()Landroid/view/Window;
    //   53: sipush 512
    //   56: invokevirtual 1414	android/view/Window:addFlags	(I)V
    //   59: aload_0
    //   60: aload_0
    //   61: invokevirtual 1583	com/ireadercity/b2/ui/BookReadingActivityNew:getContentResolver	()Landroid/content/ContentResolver;
    //   64: invokestatic 1588	com/ireadercity/b2/h/t:a	(Landroid/content/ContentResolver;)Z
    //   67: putfield 207	com/ireadercity/b2/ui/BookReadingActivityNew:aL	Z
    //   70: aload_0
    //   71: invokestatic 1591	com/ireadercity/b2/a:b	(Landroid/app/Activity;)V
    //   74: aload_0
    //   75: iconst_0
    //   76: putfield 211	com/ireadercity/b2/ui/BookReadingActivityNew:aT	Z
    //   79: aload_0
    //   80: getfield 281	com/ireadercity/b2/ui/BookReadingActivityNew:aY	Lcom/ireadercity/b2/c/a;
    //   83: ifnonnull +14 -> 97
    //   86: aload_0
    //   87: aload_0
    //   88: invokevirtual 883	com/ireadercity/b2/ui/BookReadingActivityNew:getApplicationContext	()Landroid/content/Context;
    //   91: invokestatic 1039	com/ireadercity/b2/c/a:a	(Landroid/content/Context;)Lcom/ireadercity/b2/c/a;
    //   94: putfield 281	com/ireadercity/b2/ui/BookReadingActivityNew:aY	Lcom/ireadercity/b2/c/a;
    //   97: aload_0
    //   98: invokevirtual 1559	com/ireadercity/b2/ui/BookReadingActivityNew:h	()V
    //   101: aload_0
    //   102: aload_0
    //   103: getfield 272	com/ireadercity/b2/ui/BookReadingActivityNew:aU	Lcom/ireadercity/b2/bean/i;
    //   106: iconst_0
    //   107: invokevirtual 1124	com/ireadercity/b2/ui/BookReadingActivityNew:a	(Lcom/ireadercity/b2/bean/i;Z)V
    //   110: aload_0
    //   111: invokevirtual 1595	com/ireadercity/b2/ui/BookReadingActivityNew:getIntent	()Landroid/content/Intent;
    //   114: invokevirtual 1599	android/content/Intent:getExtras	()Landroid/os/Bundle;
    //   117: astore_1
    //   118: aload_0
    //   119: aload_1
    //   120: ldc_w 1601
    //   123: invokevirtual 1605	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   126: putfield 503	com/ireadercity/b2/ui/BookReadingActivityNew:aC	Ljava/lang/String;
    //   129: aload_1
    //   130: ldc_w 445
    //   133: invokevirtual 1608	android/os/Bundle:getInt	(Ljava/lang/String;)I
    //   136: putstatic 507	com/ireadercity/b2/ui/BookReadingActivityNew:aE	I
    //   139: aload_1
    //   140: ldc_w 1610
    //   143: invokevirtual 1608	android/os/Bundle:getInt	(Ljava/lang/String;)I
    //   146: putstatic 505	com/ireadercity/b2/ui/BookReadingActivityNew:aF	I
    //   149: aload_0
    //   150: getstatic 1612	com/ireadercity/b2/bean/b:a	Lcom/ireadercity/b2/bean/b;
    //   153: putfield 387	com/ireadercity/b2/ui/BookReadingActivityNew:aD	Lcom/ireadercity/b2/bean/b;
    //   156: aload_0
    //   157: getfield 387	com/ireadercity/b2/ui/BookReadingActivityNew:aD	Lcom/ireadercity/b2/bean/b;
    //   160: ifnonnull +7 -> 167
    //   163: aload_0
    //   164: invokevirtual 1614	com/ireadercity/b2/ui/BookReadingActivityNew:g	()V
    //   167: aload_0
    //   168: getfield 387	com/ireadercity/b2/ui/BookReadingActivityNew:aD	Lcom/ireadercity/b2/bean/b;
    //   171: invokevirtual 1021	com/ireadercity/b2/bean/b:j	()Ljava/lang/String;
    //   174: invokestatic 1618	com/ireadercity/b2/h/r:a	(Ljava/lang/String;)V
    //   177: aload_0
    //   178: aload_0
    //   179: getfield 387	com/ireadercity/b2/ui/BookReadingActivityNew:aD	Lcom/ireadercity/b2/bean/b;
    //   182: invokevirtual 1621	com/ireadercity/b2/bean/b:x	()Ljava/util/ArrayList;
    //   185: putfield 276	com/ireadercity/b2/ui/BookReadingActivityNew:aS	Ljava/util/ArrayList;
    //   188: aload_0
    //   189: aload_0
    //   190: getfield 387	com/ireadercity/b2/ui/BookReadingActivityNew:aD	Lcom/ireadercity/b2/bean/b;
    //   193: invokevirtual 1623	com/ireadercity/b2/bean/b:q	()Ljava/util/ArrayList;
    //   196: putfield 274	com/ireadercity/b2/ui/BookReadingActivityNew:aO	Ljava/util/ArrayList;
    //   199: aload_0
    //   200: getfield 387	com/ireadercity/b2/ui/BookReadingActivityNew:aD	Lcom/ireadercity/b2/bean/b;
    //   203: invokevirtual 511	com/ireadercity/b2/bean/b:t	()Ljava/lang/String;
    //   206: ldc_w 1625
    //   209: invokevirtual 516	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   212: ifne +14 -> 226
    //   215: aload_0
    //   216: aload_0
    //   217: getfield 387	com/ireadercity/b2/ui/BookReadingActivityNew:aD	Lcom/ireadercity/b2/bean/b;
    //   220: invokevirtual 1623	com/ireadercity/b2/bean/b:q	()Ljava/util/ArrayList;
    //   223: putfield 276	com/ireadercity/b2/ui/BookReadingActivityNew:aS	Ljava/util/ArrayList;
    //   226: new 338	java/lang/StringBuilder
    //   229: dup
    //   230: ldc_w 1627
    //   233: invokespecial 378	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   236: aload_0
    //   237: getfield 274	com/ireadercity/b2/ui/BookReadingActivityNew:aO	Ljava/util/ArrayList;
    //   240: invokevirtual 530	java/util/ArrayList:size	()I
    //   243: invokevirtual 383	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   246: invokevirtual 352	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   249: pop
    //   250: new 338	java/lang/StringBuilder
    //   253: dup
    //   254: ldc_w 1629
    //   257: invokespecial 378	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   260: aload_0
    //   261: getfield 276	com/ireadercity/b2/ui/BookReadingActivityNew:aS	Ljava/util/ArrayList;
    //   264: invokevirtual 530	java/util/ArrayList:size	()I
    //   267: invokevirtual 383	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   270: invokevirtual 352	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   273: pop
    //   274: aload_0
    //   275: aload_1
    //   276: ldc_w 1631
    //   279: invokevirtual 1605	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   282: putfield 267	com/ireadercity/b2/ui/BookReadingActivityNew:aG	Ljava/lang/String;
    //   285: aload_0
    //   286: aload_1
    //   287: ldc_w 1633
    //   290: invokevirtual 1637	android/os/Bundle:getFloat	(Ljava/lang/String;)F
    //   293: putfield 334	com/ireadercity/b2/ui/BookReadingActivityNew:aH	F
    //   296: new 338	java/lang/StringBuilder
    //   299: dup
    //   300: ldc_w 1639
    //   303: invokespecial 378	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   306: getstatic 507	com/ireadercity/b2/ui/BookReadingActivityNew:aE	I
    //   309: invokevirtual 383	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   312: ldc_w 1261
    //   315: invokevirtual 348	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   318: getstatic 505	com/ireadercity/b2/ui/BookReadingActivityNew:aF	I
    //   321: invokevirtual 383	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   324: ldc_w 1641
    //   327: invokevirtual 348	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   330: aload_0
    //   331: getfield 503	com/ireadercity/b2/ui/BookReadingActivityNew:aC	Ljava/lang/String;
    //   334: invokevirtual 348	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   337: ldc_w 1643
    //   340: invokevirtual 348	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   343: aload_0
    //   344: getfield 267	com/ireadercity/b2/ui/BookReadingActivityNew:aG	Ljava/lang/String;
    //   347: invokevirtual 348	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   350: ldc_w 1645
    //   353: invokevirtual 348	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   356: aload_0
    //   357: getfield 334	com/ireadercity/b2/ui/BookReadingActivityNew:aH	F
    //   360: invokevirtual 343	java/lang/StringBuilder:append	(F)Ljava/lang/StringBuilder;
    //   363: invokevirtual 352	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   366: pop
    //   367: aload_0
    //   368: getfield 334	com/ireadercity/b2/ui/BookReadingActivityNew:aH	F
    //   371: fconst_0
    //   372: fcmpg
    //   373: ifge +1826 -> 2199
    //   376: aload_0
    //   377: fconst_0
    //   378: putfield 334	com/ireadercity/b2/ui/BookReadingActivityNew:aH	F
    //   381: aload_0
    //   382: getfield 272	com/ireadercity/b2/ui/BookReadingActivityNew:aU	Lcom/ireadercity/b2/bean/i;
    //   385: invokevirtual 947	com/ireadercity/b2/bean/i:p	()I
    //   388: iconst_2
    //   389: if_icmpne +11 -> 400
    //   392: aload_0
    //   393: iconst_1
    //   394: invokestatic 241	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   397: putfield 243	com/ireadercity/b2/ui/BookReadingActivityNew:bd	Ljava/lang/Boolean;
    //   400: aload_0
    //   401: ldc_w 1646
    //   404: invokevirtual 1649	com/ireadercity/b2/ui/BookReadingActivityNew:setContentView	(I)V
    //   407: getstatic 1381	com/ireadercity/b2/a:av	Z
    //   410: ifeq +129 -> 539
    //   413: new 1453	java/util/Date
    //   416: dup
    //   417: invokespecial 1650	java/util/Date:<init>	()V
    //   420: invokevirtual 1653	java/util/Date:getSeconds	()I
    //   423: istore_3
    //   424: new 1655	java/util/Random
    //   427: dup
    //   428: iload_3
    //   429: i2l
    //   430: invokespecial 1656	java/util/Random:<init>	(J)V
    //   433: astore_1
    //   434: aload_1
    //   435: iload_3
    //   436: invokevirtual 1659	java/util/Random:nextInt	(I)I
    //   439: istore_3
    //   440: iload_3
    //   441: istore_2
    //   442: iload_2
    //   443: iconst_2
    //   444: irem
    //   445: ifne +1775 -> 2220
    //   448: aload_0
    //   449: aload_0
    //   450: ldc_w 1660
    //   453: invokevirtual 1474	com/ireadercity/b2/ui/BookReadingActivityNew:findViewById	(I)Landroid/view/View;
    //   456: checkcast 981	android/widget/RelativeLayout
    //   459: putfield 1385	com/ireadercity/b2/ui/BookReadingActivityNew:a	Landroid/widget/RelativeLayout;
    //   462: aload_0
    //   463: getfield 1385	com/ireadercity/b2/ui/BookReadingActivityNew:a	Landroid/widget/RelativeLayout;
    //   466: ldc_w 1394
    //   469: invokevirtual 1398	android/widget/RelativeLayout:setTag	(Ljava/lang/Object;)V
    //   472: aload_0
    //   473: getfield 1385	com/ireadercity/b2/ui/BookReadingActivityNew:a	Landroid/widget/RelativeLayout;
    //   476: astore_1
    //   477: aload_0
    //   478: ldc_w 1661
    //   481: aconst_null
    //   482: invokestatic 1664	android/widget/LinearLayout:inflate	(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;
    //   485: astore 5
    //   487: new 1666	com/umeng/newxp/controller/ExchangeDataService
    //   490: dup
    //   491: getstatic 1668	com/ireadercity/b2/a:d	Ljava/lang/String;
    //   494: invokespecial 1669	com/umeng/newxp/controller/ExchangeDataService:<init>	(Ljava/lang/String;)V
    //   497: astore 6
    //   499: aload 5
    //   501: ldc_w 1670
    //   504: invokevirtual 1500	android/view/View:findViewById	(I)Landroid/view/View;
    //   507: checkcast 981	android/widget/RelativeLayout
    //   510: astore 7
    //   512: new 1672	com/umeng/newxp/view/ExchangeViewManager
    //   515: dup
    //   516: aload_0
    //   517: aload 6
    //   519: invokespecial 1675	com/umeng/newxp/view/ExchangeViewManager:<init>	(Landroid/content/Context;Lcom/umeng/newxp/controller/ExchangeDataService;)V
    //   522: bipush 7
    //   524: aload 7
    //   526: iconst_0
    //   527: anewarray 1677	android/graphics/drawable/Drawable
    //   530: invokevirtual 1680	com/umeng/newxp/view/ExchangeViewManager:addView	(ILandroid/view/View;[Landroid/graphics/drawable/Drawable;)V
    //   533: aload_1
    //   534: aload 5
    //   536: invokevirtual 1681	android/widget/RelativeLayout:addView	(Landroid/view/View;)V
    //   539: aload_0
    //   540: aload_0
    //   541: ldc_w 1682
    //   544: invokevirtual 1683	android/app/Activity:findViewById	(I)Landroid/view/View;
    //   547: checkcast 981	android/widget/RelativeLayout
    //   550: putfield 1056	com/ireadercity/b2/ui/BookReadingActivityNew:y	Landroid/widget/RelativeLayout;
    //   553: aload_0
    //   554: aload_0
    //   555: getfield 1056	com/ireadercity/b2/ui/BookReadingActivityNew:y	Landroid/widget/RelativeLayout;
    //   558: ldc_w 1684
    //   561: invokevirtual 1685	android/widget/RelativeLayout:findViewById	(I)Landroid/view/View;
    //   564: checkcast 716	android/widget/ImageButton
    //   567: putfield 711	com/ireadercity/b2/ui/BookReadingActivityNew:z	Landroid/widget/ImageButton;
    //   570: aload_0
    //   571: aload_0
    //   572: getfield 1056	com/ireadercity/b2/ui/BookReadingActivityNew:y	Landroid/widget/RelativeLayout;
    //   575: ldc_w 1686
    //   578: invokevirtual 1685	android/widget/RelativeLayout:findViewById	(I)Landroid/view/View;
    //   581: checkcast 801	android/widget/TextView
    //   584: putfield 1073	com/ireadercity/b2/ui/BookReadingActivityNew:A	Landroid/widget/TextView;
    //   587: aload_0
    //   588: aload_0
    //   589: getfield 1056	com/ireadercity/b2/ui/BookReadingActivityNew:y	Landroid/widget/RelativeLayout;
    //   592: ldc_w 1687
    //   595: invokevirtual 1685	android/widget/RelativeLayout:findViewById	(I)Landroid/view/View;
    //   598: checkcast 716	android/widget/ImageButton
    //   601: putfield 722	com/ireadercity/b2/ui/BookReadingActivityNew:B	Landroid/widget/ImageButton;
    //   604: aload_0
    //   605: aload_0
    //   606: getfield 1056	com/ireadercity/b2/ui/BookReadingActivityNew:y	Landroid/widget/RelativeLayout;
    //   609: ldc_w 1688
    //   612: invokevirtual 1685	android/widget/RelativeLayout:findViewById	(I)Landroid/view/View;
    //   615: checkcast 732	android/widget/LinearLayout
    //   618: putfield 764	com/ireadercity/b2/ui/BookReadingActivityNew:C	Landroid/widget/LinearLayout;
    //   621: aload_0
    //   622: aload_0
    //   623: getfield 1056	com/ireadercity/b2/ui/BookReadingActivityNew:y	Landroid/widget/RelativeLayout;
    //   626: ldc_w 1689
    //   629: invokevirtual 1685	android/widget/RelativeLayout:findViewById	(I)Landroid/view/View;
    //   632: checkcast 732	android/widget/LinearLayout
    //   635: putfield 856	com/ireadercity/b2/ui/BookReadingActivityNew:D	Landroid/widget/LinearLayout;
    //   638: aload_0
    //   639: aload_0
    //   640: getfield 1056	com/ireadercity/b2/ui/BookReadingActivityNew:y	Landroid/widget/RelativeLayout;
    //   643: ldc_w 1690
    //   646: invokevirtual 1685	android/widget/RelativeLayout:findViewById	(I)Landroid/view/View;
    //   649: checkcast 732	android/widget/LinearLayout
    //   652: putfield 861	com/ireadercity/b2/ui/BookReadingActivityNew:E	Landroid/widget/LinearLayout;
    //   655: aload_0
    //   656: aload_0
    //   657: getfield 1056	com/ireadercity/b2/ui/BookReadingActivityNew:y	Landroid/widget/RelativeLayout;
    //   660: ldc_w 1691
    //   663: invokevirtual 1685	android/widget/RelativeLayout:findViewById	(I)Landroid/view/View;
    //   666: checkcast 732	android/widget/LinearLayout
    //   669: putfield 866	com/ireadercity/b2/ui/BookReadingActivityNew:F	Landroid/widget/LinearLayout;
    //   672: aload_0
    //   673: aload_0
    //   674: getfield 1056	com/ireadercity/b2/ui/BookReadingActivityNew:y	Landroid/widget/RelativeLayout;
    //   677: ldc_w 1692
    //   680: invokevirtual 1685	android/widget/RelativeLayout:findViewById	(I)Landroid/view/View;
    //   683: checkcast 732	android/widget/LinearLayout
    //   686: putfield 871	com/ireadercity/b2/ui/BookReadingActivityNew:G	Landroid/widget/LinearLayout;
    //   689: aload_0
    //   690: aload_0
    //   691: getfield 1056	com/ireadercity/b2/ui/BookReadingActivityNew:y	Landroid/widget/RelativeLayout;
    //   694: ldc_w 1693
    //   697: invokevirtual 1685	android/widget/RelativeLayout:findViewById	(I)Landroid/view/View;
    //   700: checkcast 809	android/widget/ImageView
    //   703: putfield 806	com/ireadercity/b2/ui/BookReadingActivityNew:H	Landroid/widget/ImageView;
    //   706: aload_0
    //   707: aload_0
    //   708: getfield 1056	com/ireadercity/b2/ui/BookReadingActivityNew:y	Landroid/widget/RelativeLayout;
    //   711: ldc_w 1694
    //   714: invokevirtual 1685	android/widget/RelativeLayout:findViewById	(I)Landroid/view/View;
    //   717: checkcast 801	android/widget/TextView
    //   720: putfield 817	com/ireadercity/b2/ui/BookReadingActivityNew:I	Landroid/widget/TextView;
    //   723: aload_0
    //   724: aload_0
    //   725: getfield 1056	com/ireadercity/b2/ui/BookReadingActivityNew:y	Landroid/widget/RelativeLayout;
    //   728: ldc_w 1695
    //   731: invokevirtual 1685	android/widget/RelativeLayout:findViewById	(I)Landroid/view/View;
    //   734: checkcast 801	android/widget/TextView
    //   737: putfield 1069	com/ireadercity/b2/ui/BookReadingActivityNew:J	Landroid/widget/TextView;
    //   740: aload_0
    //   741: aload_0
    //   742: getfield 1056	com/ireadercity/b2/ui/BookReadingActivityNew:y	Landroid/widget/RelativeLayout;
    //   745: ldc_w 1696
    //   748: invokevirtual 1685	android/widget/RelativeLayout:findViewById	(I)Landroid/view/View;
    //   751: checkcast 801	android/widget/TextView
    //   754: putfield 1071	com/ireadercity/b2/ui/BookReadingActivityNew:K	Landroid/widget/TextView;
    //   757: aload_0
    //   758: aload_0
    //   759: getfield 1056	com/ireadercity/b2/ui/BookReadingActivityNew:y	Landroid/widget/RelativeLayout;
    //   762: ldc_w 1697
    //   765: invokevirtual 1685	android/widget/RelativeLayout:findViewById	(I)Landroid/view/View;
    //   768: checkcast 716	android/widget/ImageButton
    //   771: putfield 750	com/ireadercity/b2/ui/BookReadingActivityNew:L	Landroid/widget/ImageButton;
    //   774: aload_0
    //   775: aload_0
    //   776: getfield 1056	com/ireadercity/b2/ui/BookReadingActivityNew:y	Landroid/widget/RelativeLayout;
    //   779: ldc_w 1698
    //   782: invokevirtual 1685	android/widget/RelativeLayout:findViewById	(I)Landroid/view/View;
    //   785: checkcast 716	android/widget/ImageButton
    //   788: putfield 745	com/ireadercity/b2/ui/BookReadingActivityNew:M	Landroid/widget/ImageButton;
    //   791: aload_0
    //   792: aload_0
    //   793: getfield 1056	com/ireadercity/b2/ui/BookReadingActivityNew:y	Landroid/widget/RelativeLayout;
    //   796: ldc_w 1699
    //   799: invokevirtual 1685	android/widget/RelativeLayout:findViewById	(I)Landroid/view/View;
    //   802: checkcast 758	android/widget/SeekBar
    //   805: putfield 542	com/ireadercity/b2/ui/BookReadingActivityNew:N	Landroid/widget/SeekBar;
    //   808: aload_0
    //   809: aload_0
    //   810: getfield 1056	com/ireadercity/b2/ui/BookReadingActivityNew:y	Landroid/widget/RelativeLayout;
    //   813: ldc_w 1700
    //   816: invokevirtual 1685	android/widget/RelativeLayout:findViewById	(I)Landroid/view/View;
    //   819: checkcast 981	android/widget/RelativeLayout
    //   822: putfield 295	com/ireadercity/b2/ui/BookReadingActivityNew:O	Landroid/widget/RelativeLayout;
    //   825: aload_0
    //   826: aload_0
    //   827: getfield 295	com/ireadercity/b2/ui/BookReadingActivityNew:O	Landroid/widget/RelativeLayout;
    //   830: ldc_w 1701
    //   833: invokevirtual 1685	android/widget/RelativeLayout:findViewById	(I)Landroid/view/View;
    //   836: checkcast 732	android/widget/LinearLayout
    //   839: putfield 727	com/ireadercity/b2/ui/BookReadingActivityNew:P	Landroid/widget/LinearLayout;
    //   842: aload_0
    //   843: aload_0
    //   844: getfield 295	com/ireadercity/b2/ui/BookReadingActivityNew:O	Landroid/widget/RelativeLayout;
    //   847: ldc_w 1702
    //   850: invokevirtual 1685	android/widget/RelativeLayout:findViewById	(I)Landroid/view/View;
    //   853: checkcast 732	android/widget/LinearLayout
    //   856: putfield 735	com/ireadercity/b2/ui/BookReadingActivityNew:Q	Landroid/widget/LinearLayout;
    //   859: aload_0
    //   860: aload_0
    //   861: getfield 295	com/ireadercity/b2/ui/BookReadingActivityNew:O	Landroid/widget/RelativeLayout;
    //   864: ldc_w 1703
    //   867: invokevirtual 1685	android/widget/RelativeLayout:findViewById	(I)Landroid/view/View;
    //   870: checkcast 732	android/widget/LinearLayout
    //   873: putfield 740	com/ireadercity/b2/ui/BookReadingActivityNew:R	Landroid/widget/LinearLayout;
    //   876: aload_0
    //   877: aload_0
    //   878: ldc_w 1704
    //   881: invokevirtual 1683	android/app/Activity:findViewById	(I)Landroid/view/View;
    //   884: checkcast 981	android/widget/RelativeLayout
    //   887: putfield 1061	com/ireadercity/b2/ui/BookReadingActivityNew:S	Landroid/widget/RelativeLayout;
    //   890: aload_0
    //   891: aload_0
    //   892: getfield 1061	com/ireadercity/b2/ui/BookReadingActivityNew:S	Landroid/widget/RelativeLayout;
    //   895: ldc_w 1705
    //   898: invokevirtual 1685	android/widget/RelativeLayout:findViewById	(I)Landroid/view/View;
    //   901: checkcast 895	android/widget/Button
    //   904: putfield 890	com/ireadercity/b2/ui/BookReadingActivityNew:T	Landroid/widget/Button;
    //   907: aload_0
    //   908: aload_0
    //   909: getfield 1061	com/ireadercity/b2/ui/BookReadingActivityNew:S	Landroid/widget/RelativeLayout;
    //   912: ldc_w 1706
    //   915: invokevirtual 1685	android/widget/RelativeLayout:findViewById	(I)Landroid/view/View;
    //   918: checkcast 895	android/widget/Button
    //   921: putfield 898	com/ireadercity/b2/ui/BookReadingActivityNew:U	Landroid/widget/Button;
    //   924: aload_0
    //   925: aload_0
    //   926: getfield 1061	com/ireadercity/b2/ui/BookReadingActivityNew:S	Landroid/widget/RelativeLayout;
    //   929: ldc_w 1707
    //   932: invokevirtual 1685	android/widget/RelativeLayout:findViewById	(I)Landroid/view/View;
    //   935: checkcast 732	android/widget/LinearLayout
    //   938: putfield 916	com/ireadercity/b2/ui/BookReadingActivityNew:V	Landroid/widget/LinearLayout;
    //   941: aload_0
    //   942: aload_0
    //   943: getfield 1061	com/ireadercity/b2/ui/BookReadingActivityNew:S	Landroid/widget/RelativeLayout;
    //   946: ldc_w 1708
    //   949: invokevirtual 1685	android/widget/RelativeLayout:findViewById	(I)Landroid/view/View;
    //   952: checkcast 801	android/widget/TextView
    //   955: putfield 316	com/ireadercity/b2/ui/BookReadingActivityNew:W	Landroid/widget/TextView;
    //   958: aload_0
    //   959: aload_0
    //   960: getfield 1061	com/ireadercity/b2/ui/BookReadingActivityNew:S	Landroid/widget/RelativeLayout;
    //   963: ldc_w 1709
    //   966: invokevirtual 1685	android/widget/RelativeLayout:findViewById	(I)Landroid/view/View;
    //   969: checkcast 801	android/widget/TextView
    //   972: putfield 318	com/ireadercity/b2/ui/BookReadingActivityNew:X	Landroid/widget/TextView;
    //   975: aload_0
    //   976: aload_0
    //   977: getfield 1061	com/ireadercity/b2/ui/BookReadingActivityNew:S	Landroid/widget/RelativeLayout;
    //   980: ldc_w 1710
    //   983: invokevirtual 1685	android/widget/RelativeLayout:findViewById	(I)Landroid/view/View;
    //   986: checkcast 895	android/widget/Button
    //   989: putfield 321	com/ireadercity/b2/ui/BookReadingActivityNew:Y	Landroid/widget/Button;
    //   992: aload_0
    //   993: aload_0
    //   994: getfield 1061	com/ireadercity/b2/ui/BookReadingActivityNew:S	Landroid/widget/RelativeLayout;
    //   997: ldc_w 1711
    //   1000: invokevirtual 1685	android/widget/RelativeLayout:findViewById	(I)Landroid/view/View;
    //   1003: checkcast 716	android/widget/ImageButton
    //   1006: putfield 927	com/ireadercity/b2/ui/BookReadingActivityNew:Z	Landroid/widget/ImageButton;
    //   1009: aload_0
    //   1010: aload_0
    //   1011: getfield 1061	com/ireadercity/b2/ui/BookReadingActivityNew:S	Landroid/widget/RelativeLayout;
    //   1014: ldc_w 1712
    //   1017: invokevirtual 1685	android/widget/RelativeLayout:findViewById	(I)Landroid/view/View;
    //   1020: checkcast 716	android/widget/ImageButton
    //   1023: putfield 932	com/ireadercity/b2/ui/BookReadingActivityNew:aa	Landroid/widget/ImageButton;
    //   1026: aload_0
    //   1027: aload_0
    //   1028: getfield 1061	com/ireadercity/b2/ui/BookReadingActivityNew:S	Landroid/widget/RelativeLayout;
    //   1031: ldc_w 1713
    //   1034: invokevirtual 1685	android/widget/RelativeLayout:findViewById	(I)Landroid/view/View;
    //   1037: checkcast 716	android/widget/ImageButton
    //   1040: putfield 937	com/ireadercity/b2/ui/BookReadingActivityNew:ab	Landroid/widget/ImageButton;
    //   1043: aload_0
    //   1044: aload_0
    //   1045: getfield 1061	com/ireadercity/b2/ui/BookReadingActivityNew:S	Landroid/widget/RelativeLayout;
    //   1048: ldc_w 1714
    //   1051: invokevirtual 1685	android/widget/RelativeLayout:findViewById	(I)Landroid/view/View;
    //   1054: checkcast 716	android/widget/ImageButton
    //   1057: putfield 942	com/ireadercity/b2/ui/BookReadingActivityNew:ac	Landroid/widget/ImageButton;
    //   1060: aload_0
    //   1061: aload_0
    //   1062: getfield 1061	com/ireadercity/b2/ui/BookReadingActivityNew:S	Landroid/widget/RelativeLayout;
    //   1065: ldc_w 1715
    //   1068: invokevirtual 1685	android/widget/RelativeLayout:findViewById	(I)Landroid/view/View;
    //   1071: checkcast 809	android/widget/ImageView
    //   1074: putfield 814	com/ireadercity/b2/ui/BookReadingActivityNew:ad	Landroid/widget/ImageView;
    //   1077: aload_0
    //   1078: aload_0
    //   1079: getfield 1061	com/ireadercity/b2/ui/BookReadingActivityNew:S	Landroid/widget/RelativeLayout;
    //   1082: ldc_w 1716
    //   1085: invokevirtual 1685	android/widget/RelativeLayout:findViewById	(I)Landroid/view/View;
    //   1088: checkcast 732	android/widget/LinearLayout
    //   1091: putfield 825	com/ireadercity/b2/ui/BookReadingActivityNew:ae	Landroid/widget/LinearLayout;
    //   1094: aload_0
    //   1095: aload_0
    //   1096: getfield 1061	com/ireadercity/b2/ui/BookReadingActivityNew:S	Landroid/widget/RelativeLayout;
    //   1099: ldc_w 1717
    //   1102: invokevirtual 1685	android/widget/RelativeLayout:findViewById	(I)Landroid/view/View;
    //   1105: checkcast 851	android/widget/HorizontalScrollView
    //   1108: putfield 849	com/ireadercity/b2/ui/BookReadingActivityNew:af	Landroid/widget/HorizontalScrollView;
    //   1111: aload_0
    //   1112: aload_0
    //   1113: getfield 1061	com/ireadercity/b2/ui/BookReadingActivityNew:S	Landroid/widget/RelativeLayout;
    //   1116: ldc_w 1718
    //   1119: invokevirtual 1685	android/widget/RelativeLayout:findViewById	(I)Landroid/view/View;
    //   1122: checkcast 732	android/widget/LinearLayout
    //   1125: putfield 971	com/ireadercity/b2/ui/BookReadingActivityNew:aj	Landroid/widget/LinearLayout;
    //   1128: aload_0
    //   1129: aload_0
    //   1130: getfield 1061	com/ireadercity/b2/ui/BookReadingActivityNew:S	Landroid/widget/RelativeLayout;
    //   1133: ldc_w 1719
    //   1136: invokevirtual 1685	android/widget/RelativeLayout:findViewById	(I)Landroid/view/View;
    //   1139: checkcast 758	android/widget/SeekBar
    //   1142: putfield 876	com/ireadercity/b2/ui/BookReadingActivityNew:ak	Landroid/widget/SeekBar;
    //   1145: aload_0
    //   1146: aload_0
    //   1147: getfield 1061	com/ireadercity/b2/ui/BookReadingActivityNew:S	Landroid/widget/RelativeLayout;
    //   1150: ldc_w 1720
    //   1153: invokevirtual 1685	android/widget/RelativeLayout:findViewById	(I)Landroid/view/View;
    //   1156: checkcast 895	android/widget/Button
    //   1159: putfield 325	com/ireadercity/b2/ui/BookReadingActivityNew:al	Landroid/widget/Button;
    //   1162: aload_0
    //   1163: aload_0
    //   1164: getfield 1061	com/ireadercity/b2/ui/BookReadingActivityNew:S	Landroid/widget/RelativeLayout;
    //   1167: ldc_w 1721
    //   1170: invokevirtual 1685	android/widget/RelativeLayout:findViewById	(I)Landroid/view/View;
    //   1173: checkcast 895	android/widget/Button
    //   1176: putfield 327	com/ireadercity/b2/ui/BookReadingActivityNew:am	Landroid/widget/Button;
    //   1179: aload_0
    //   1180: aload_0
    //   1181: getfield 1061	com/ireadercity/b2/ui/BookReadingActivityNew:S	Landroid/widget/RelativeLayout;
    //   1184: ldc_w 1722
    //   1187: invokevirtual 1685	android/widget/RelativeLayout:findViewById	(I)Landroid/view/View;
    //   1190: checkcast 895	android/widget/Button
    //   1193: putfield 992	com/ireadercity/b2/ui/BookReadingActivityNew:an	Landroid/widget/Button;
    //   1196: aload_0
    //   1197: aload_0
    //   1198: ldc_w 1723
    //   1201: invokevirtual 1683	android/app/Activity:findViewById	(I)Landroid/view/View;
    //   1204: checkcast 981	android/widget/RelativeLayout
    //   1207: putfield 1063	com/ireadercity/b2/ui/BookReadingActivityNew:ao	Landroid/widget/RelativeLayout;
    //   1210: aload_0
    //   1211: aload_0
    //   1212: getfield 1063	com/ireadercity/b2/ui/BookReadingActivityNew:ao	Landroid/widget/RelativeLayout;
    //   1215: ldc_w 1724
    //   1218: invokevirtual 1685	android/widget/RelativeLayout:findViewById	(I)Landroid/view/View;
    //   1221: checkcast 895	android/widget/Button
    //   1224: putfield 997	com/ireadercity/b2/ui/BookReadingActivityNew:c	Landroid/widget/Button;
    //   1227: aload_0
    //   1228: aload_0
    //   1229: getfield 1063	com/ireadercity/b2/ui/BookReadingActivityNew:ao	Landroid/widget/RelativeLayout;
    //   1232: ldc_w 1725
    //   1235: invokevirtual 1685	android/widget/RelativeLayout:findViewById	(I)Landroid/view/View;
    //   1238: checkcast 895	android/widget/Button
    //   1241: putfield 1002	com/ireadercity/b2/ui/BookReadingActivityNew:d	Landroid/widget/Button;
    //   1244: aload_0
    //   1245: aload_0
    //   1246: getfield 1063	com/ireadercity/b2/ui/BookReadingActivityNew:ao	Landroid/widget/RelativeLayout;
    //   1249: ldc_w 1726
    //   1252: invokevirtual 1685	android/widget/RelativeLayout:findViewById	(I)Landroid/view/View;
    //   1255: checkcast 895	android/widget/Button
    //   1258: putfield 1007	com/ireadercity/b2/ui/BookReadingActivityNew:e	Landroid/widget/Button;
    //   1261: aload_0
    //   1262: aload_0
    //   1263: getfield 1063	com/ireadercity/b2/ui/BookReadingActivityNew:ao	Landroid/widget/RelativeLayout;
    //   1266: ldc_w 1727
    //   1269: invokevirtual 1685	android/widget/RelativeLayout:findViewById	(I)Landroid/view/View;
    //   1272: checkcast 895	android/widget/Button
    //   1275: putfield 1012	com/ireadercity/b2/ui/BookReadingActivityNew:f	Landroid/widget/Button;
    //   1278: aload_0
    //   1279: getfield 997	com/ireadercity/b2/ui/BookReadingActivityNew:c	Landroid/widget/Button;
    //   1282: invokevirtual 1731	android/widget/Button:getViewTreeObserver	()Landroid/view/ViewTreeObserver;
    //   1285: new 1733	com/ireadercity/b2/ui/db
    //   1288: dup
    //   1289: aload_0
    //   1290: invokespecial 1734	com/ireadercity/b2/ui/db:<init>	(Lcom/ireadercity/b2/ui/BookReadingActivityNew;)V
    //   1293: invokevirtual 1740	android/view/ViewTreeObserver:addOnGlobalLayoutListener	(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
    //   1296: aload_0
    //   1297: aload_0
    //   1298: ldc_w 1741
    //   1301: invokevirtual 1474	com/ireadercity/b2/ui/BookReadingActivityNew:findViewById	(I)Landroid/view/View;
    //   1304: checkcast 1138	android/widget/EditText
    //   1307: putfield 1075	com/ireadercity/b2/ui/BookReadingActivityNew:az	Landroid/widget/EditText;
    //   1310: aload_0
    //   1311: aload_0
    //   1312: ldc_w 1742
    //   1315: invokevirtual 1474	com/ireadercity/b2/ui/BookReadingActivityNew:findViewById	(I)Landroid/view/View;
    //   1318: checkcast 981	android/widget/RelativeLayout
    //   1321: putfield 1018	com/ireadercity/b2/ui/BookReadingActivityNew:aA	Landroid/widget/RelativeLayout;
    //   1324: aload_0
    //   1325: aload_0
    //   1326: ldc_w 1743
    //   1329: invokevirtual 1474	com/ireadercity/b2/ui/BookReadingActivityNew:findViewById	(I)Landroid/view/View;
    //   1332: checkcast 981	android/widget/RelativeLayout
    //   1335: putfield 1745	com/ireadercity/b2/ui/BookReadingActivityNew:ar	Landroid/widget/RelativeLayout;
    //   1338: aload_0
    //   1339: aload_0
    //   1340: ldc_w 1746
    //   1343: invokevirtual 1474	com/ireadercity/b2/ui/BookReadingActivityNew:findViewById	(I)Landroid/view/View;
    //   1346: checkcast 981	android/widget/RelativeLayout
    //   1349: putfield 323	com/ireadercity/b2/ui/BookReadingActivityNew:as	Landroid/widget/RelativeLayout;
    //   1352: aload_0
    //   1353: aload_0
    //   1354: ldc_w 1747
    //   1357: invokevirtual 1474	com/ireadercity/b2/ui/BookReadingActivityNew:findViewById	(I)Landroid/view/View;
    //   1360: checkcast 981	android/widget/RelativeLayout
    //   1363: putfield 1749	com/ireadercity/b2/ui/BookReadingActivityNew:at	Landroid/widget/RelativeLayout;
    //   1366: aload_0
    //   1367: aload_0
    //   1368: ldc_w 1750
    //   1371: invokevirtual 1474	com/ireadercity/b2/ui/BookReadingActivityNew:findViewById	(I)Landroid/view/View;
    //   1374: checkcast 809	android/widget/ImageView
    //   1377: putfield 1080	com/ireadercity/b2/ui/BookReadingActivityNew:aw	Landroid/widget/ImageView;
    //   1380: aload_0
    //   1381: aload_0
    //   1382: ldc_w 1751
    //   1385: invokevirtual 1474	com/ireadercity/b2/ui/BookReadingActivityNew:findViewById	(I)Landroid/view/View;
    //   1388: checkcast 801	android/widget/TextView
    //   1391: putfield 363	com/ireadercity/b2/ui/BookReadingActivityNew:au	Landroid/widget/TextView;
    //   1394: aload_0
    //   1395: aload_0
    //   1396: ldc_w 1752
    //   1399: invokevirtual 1474	com/ireadercity/b2/ui/BookReadingActivityNew:findViewById	(I)Landroid/view/View;
    //   1402: checkcast 801	android/widget/TextView
    //   1405: putfield 298	com/ireadercity/b2/ui/BookReadingActivityNew:av	Landroid/widget/TextView;
    //   1408: aload_0
    //   1409: getfield 363	com/ireadercity/b2/ui/BookReadingActivityNew:au	Landroid/widget/TextView;
    //   1412: invokestatic 1754	com/ireadercity/b2/h/v:a	()Ljava/lang/String;
    //   1415: invokevirtual 823	android/widget/TextView:setText	(Ljava/lang/CharSequence;)V
    //   1418: new 1756	com/ireadercity/b2/ui/di
    //   1421: dup
    //   1422: aload_0
    //   1423: invokespecial 1757	com/ireadercity/b2/ui/di:<init>	(Lcom/ireadercity/b2/ui/BookReadingActivityNew;)V
    //   1426: iconst_0
    //   1427: anewarray 1424	java/lang/Void
    //   1430: invokevirtual 1758	com/ireadercity/b2/ui/di:execute	([Ljava/lang/Object;)Landroid/os/AsyncTask;
    //   1433: pop
    //   1434: new 1760	com/ireadercity/b2/bean/NetBookInfo
    //   1437: dup
    //   1438: invokespecial 1761	com/ireadercity/b2/bean/NetBookInfo:<init>	()V
    //   1441: astore_1
    //   1442: aload_1
    //   1443: aload_0
    //   1444: getfield 387	com/ireadercity/b2/ui/BookReadingActivityNew:aD	Lcom/ireadercity/b2/bean/b;
    //   1447: invokevirtual 1763	com/ireadercity/b2/bean/b:l	()Ljava/lang/String;
    //   1450: invokevirtual 1765	com/ireadercity/b2/bean/NetBookInfo:k	(Ljava/lang/String;)V
    //   1453: aload_0
    //   1454: invokevirtual 883	com/ireadercity/b2/ui/BookReadingActivityNew:getApplicationContext	()Landroid/content/Context;
    //   1457: invokestatic 1771	android/preference/PreferenceManager:getDefaultSharedPreferences	(Landroid/content/Context;)Landroid/content/SharedPreferences;
    //   1460: ldc_w 1773
    //   1463: aconst_null
    //   1464: invokeinterface 1778 3 0
    //   1469: astore 5
    //   1471: aload 5
    //   1473: ifnull +20 -> 1493
    //   1476: aload 5
    //   1478: aload_1
    //   1479: invokevirtual 1779	com/ireadercity/b2/bean/NetBookInfo:j	()Ljava/lang/String;
    //   1482: invokevirtual 1379	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1485: ifeq +8 -> 1493
    //   1488: aload_0
    //   1489: iconst_1
    //   1490: putfield 249	com/ireadercity/b2/ui/BookReadingActivityNew:w	Z
    //   1493: aload_0
    //   1494: aload_0
    //   1495: ldc_w 1780
    //   1498: invokevirtual 1474	com/ireadercity/b2/ui/BookReadingActivityNew:findViewById	(I)Landroid/view/View;
    //   1501: checkcast 981	android/widget/RelativeLayout
    //   1504: putfield 225	com/ireadercity/b2/ui/BookReadingActivityNew:q	Landroid/widget/RelativeLayout;
    //   1507: aload_0
    //   1508: aload_0
    //   1509: getfield 225	com/ireadercity/b2/ui/BookReadingActivityNew:q	Landroid/widget/RelativeLayout;
    //   1512: ldc_w 1781
    //   1515: invokevirtual 1685	android/widget/RelativeLayout:findViewById	(I)Landroid/view/View;
    //   1518: checkcast 981	android/widget/RelativeLayout
    //   1521: putfield 227	com/ireadercity/b2/ui/BookReadingActivityNew:r	Landroid/widget/RelativeLayout;
    //   1524: iconst_0
    //   1525: putstatic 1783	com/ireadercity/b2/a:K	I
    //   1528: aload_0
    //   1529: iconst_0
    //   1530: putfield 229	com/ireadercity/b2/ui/BookReadingActivityNew:s	Z
    //   1533: aload_0
    //   1534: getfield 225	com/ireadercity/b2/ui/BookReadingActivityNew:q	Landroid/widget/RelativeLayout;
    //   1537: bipush 8
    //   1539: invokevirtual 1149	android/widget/RelativeLayout:setVisibility	(I)V
    //   1542: aload_0
    //   1543: getfield 387	com/ireadercity/b2/ui/BookReadingActivityNew:aD	Lcom/ireadercity/b2/bean/b;
    //   1546: invokevirtual 511	com/ireadercity/b2/bean/b:t	()Ljava/lang/String;
    //   1549: ldc_w 1625
    //   1552: invokevirtual 516	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   1555: ifeq +14 -> 1569
    //   1558: aload_0
    //   1559: aload_0
    //   1560: getfield 276	com/ireadercity/b2/ui/BookReadingActivityNew:aS	Ljava/util/ArrayList;
    //   1563: invokevirtual 530	java/util/ArrayList:size	()I
    //   1566: putfield 223	com/ireadercity/b2/ui/BookReadingActivityNew:o	I
    //   1569: aload_0
    //   1570: getfield 387	com/ireadercity/b2/ui/BookReadingActivityNew:aD	Lcom/ireadercity/b2/bean/b;
    //   1573: invokevirtual 511	com/ireadercity/b2/bean/b:t	()Ljava/lang/String;
    //   1576: ldc_w 513
    //   1579: invokevirtual 516	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   1582: ifeq +14 -> 1596
    //   1585: aload_0
    //   1586: aload_0
    //   1587: getfield 274	com/ireadercity/b2/ui/BookReadingActivityNew:aO	Ljava/util/ArrayList;
    //   1590: invokevirtual 530	java/util/ArrayList:size	()I
    //   1593: putfield 223	com/ireadercity/b2/ui/BookReadingActivityNew:o	I
    //   1596: new 338	java/lang/StringBuilder
    //   1599: dup
    //   1600: ldc_w 1785
    //   1603: invokespecial 378	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1606: aload_0
    //   1607: getfield 223	com/ireadercity/b2/ui/BookReadingActivityNew:o	I
    //   1610: invokevirtual 383	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1613: ldc_w 1787
    //   1616: invokevirtual 348	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1619: aload_0
    //   1620: getfield 387	com/ireadercity/b2/ui/BookReadingActivityNew:aD	Lcom/ireadercity/b2/bean/b;
    //   1623: invokevirtual 511	com/ireadercity/b2/bean/b:t	()Ljava/lang/String;
    //   1626: invokevirtual 348	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1629: invokevirtual 352	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1632: pop
    //   1633: getstatic 505	com/ireadercity/b2/ui/BookReadingActivityNew:aF	I
    //   1636: iconst_m1
    //   1637: if_icmpne +13 -> 1650
    //   1640: aload_0
    //   1641: getstatic 507	com/ireadercity/b2/ui/BookReadingActivityNew:aE	I
    //   1644: invokespecial 1789	com/ireadercity/b2/ui/BookReadingActivityNew:f	(I)I
    //   1647: putstatic 505	com/ireadercity/b2/ui/BookReadingActivityNew:aF	I
    //   1650: getstatic 507	com/ireadercity/b2/ui/BookReadingActivityNew:aE	I
    //   1653: iconst_m1
    //   1654: if_icmpne +13 -> 1667
    //   1657: aload_0
    //   1658: getstatic 505	com/ireadercity/b2/ui/BookReadingActivityNew:aF	I
    //   1661: invokespecial 498	com/ireadercity/b2/ui/BookReadingActivityNew:g	(I)I
    //   1664: putstatic 507	com/ireadercity/b2/ui/BookReadingActivityNew:aE	I
    //   1667: aload_0
    //   1668: getfield 281	com/ireadercity/b2/ui/BookReadingActivityNew:aY	Lcom/ireadercity/b2/c/a;
    //   1671: aload_0
    //   1672: getfield 387	com/ireadercity/b2/ui/BookReadingActivityNew:aD	Lcom/ireadercity/b2/bean/b;
    //   1675: invokevirtual 1021	com/ireadercity/b2/bean/b:j	()Ljava/lang/String;
    //   1678: invokevirtual 1791	com/ireadercity/b2/c/a:c	(Ljava/lang/String;)Z
    //   1681: pop
    //   1682: new 1793	android/widget/RelativeLayout$LayoutParams
    //   1685: dup
    //   1686: iconst_m1
    //   1687: bipush -2
    //   1689: invokespecial 1795	android/widget/RelativeLayout$LayoutParams:<init>	(II)V
    //   1692: pop
    //   1693: ldc_w 1797
    //   1696: invokestatic 1803	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   1699: astore_1
    //   1700: aload_1
    //   1701: invokevirtual 1806	java/lang/Class:newInstance	()Ljava/lang/Object;
    //   1704: astore 5
    //   1706: aload_1
    //   1707: ldc_w 1808
    //   1710: invokevirtual 1812	java/lang/Class:getField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   1713: aload 5
    //   1715: invokevirtual 1815	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   1718: invokevirtual 1279	java/lang/Object:toString	()Ljava/lang/String;
    //   1721: invokestatic 1818	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   1724: istore_2
    //   1725: aload_0
    //   1726: invokevirtual 907	com/ireadercity/b2/ui/BookReadingActivityNew:getResources	()Landroid/content/res/Resources;
    //   1729: iload_2
    //   1730: invokevirtual 1821	android/content/res/Resources:getDimensionPixelSize	(I)I
    //   1733: pop
    //   1734: getstatic 1826	android/os/Build$VERSION:SDK_INT	I
    //   1737: bipush 10
    //   1739: if_icmple +7 -> 1746
    //   1742: getstatic 1826	android/os/Build$VERSION:SDK_INT	I
    //   1745: istore_2
    //   1746: aload_0
    //   1747: aload_0
    //   1748: invokevirtual 883	com/ireadercity/b2/ui/BookReadingActivityNew:getApplicationContext	()Landroid/content/Context;
    //   1751: ldc_w 1828
    //   1754: invokestatic 1833	com/ireadercity/b2/h/s:a	(Landroid/content/Context;Ljava/lang/String;)Z
    //   1757: putfield 203	com/ireadercity/b2/ui/BookReadingActivityNew:aB	Z
    //   1760: aload_0
    //   1761: getfield 203	com/ireadercity/b2/ui/BookReadingActivityNew:aB	Z
    //   1764: ifeq +13 -> 1777
    //   1767: aload_0
    //   1768: invokevirtual 883	com/ireadercity/b2/ui/BookReadingActivityNew:getApplicationContext	()Landroid/content/Context;
    //   1771: ldc_w 1828
    //   1774: invokestatic 1836	com/ireadercity/b2/h/s:b	(Landroid/content/Context;Ljava/lang/String;)V
    //   1777: aload_0
    //   1778: aload_0
    //   1779: ldc_w 1837
    //   1782: invokevirtual 1474	com/ireadercity/b2/ui/BookReadingActivityNew:findViewById	(I)Landroid/view/View;
    //   1785: checkcast 981	android/widget/RelativeLayout
    //   1788: putfield 1167	com/ireadercity/b2/ui/BookReadingActivityNew:bu	Landroid/widget/RelativeLayout;
    //   1791: aload_0
    //   1792: aload_0
    //   1793: getfield 1167	com/ireadercity/b2/ui/BookReadingActivityNew:bu	Landroid/widget/RelativeLayout;
    //   1796: ldc_w 1838
    //   1799: invokevirtual 1685	android/widget/RelativeLayout:findViewById	(I)Landroid/view/View;
    //   1802: checkcast 716	android/widget/ImageButton
    //   1805: putfield 1840	com/ireadercity/b2/ui/BookReadingActivityNew:bq	Landroid/widget/ImageButton;
    //   1808: aload_0
    //   1809: aload_0
    //   1810: getfield 1167	com/ireadercity/b2/ui/BookReadingActivityNew:bu	Landroid/widget/RelativeLayout;
    //   1813: ldc_w 1841
    //   1816: invokevirtual 1685	android/widget/RelativeLayout:findViewById	(I)Landroid/view/View;
    //   1819: checkcast 716	android/widget/ImageButton
    //   1822: putfield 1843	com/ireadercity/b2/ui/BookReadingActivityNew:br	Landroid/widget/ImageButton;
    //   1825: aload_0
    //   1826: aload_0
    //   1827: getfield 1167	com/ireadercity/b2/ui/BookReadingActivityNew:bu	Landroid/widget/RelativeLayout;
    //   1830: ldc_w 1844
    //   1833: invokevirtual 1685	android/widget/RelativeLayout:findViewById	(I)Landroid/view/View;
    //   1836: checkcast 716	android/widget/ImageButton
    //   1839: putfield 1846	com/ireadercity/b2/ui/BookReadingActivityNew:bs	Landroid/widget/ImageButton;
    //   1842: new 1848	com/ireadercity/b2/ui/dc
    //   1845: dup
    //   1846: aload_0
    //   1847: invokespecial 1849	com/ireadercity/b2/ui/dc:<init>	(Lcom/ireadercity/b2/ui/BookReadingActivityNew;)V
    //   1850: astore_1
    //   1851: aload_0
    //   1852: getfield 1840	com/ireadercity/b2/ui/BookReadingActivityNew:bq	Landroid/widget/ImageButton;
    //   1855: aload_1
    //   1856: invokevirtual 720	android/widget/ImageButton:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   1859: aload_0
    //   1860: getfield 1843	com/ireadercity/b2/ui/BookReadingActivityNew:br	Landroid/widget/ImageButton;
    //   1863: aload_1
    //   1864: invokevirtual 720	android/widget/ImageButton:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   1867: aload_0
    //   1868: getfield 1846	com/ireadercity/b2/ui/BookReadingActivityNew:bs	Landroid/widget/ImageButton;
    //   1871: aload_1
    //   1872: invokevirtual 720	android/widget/ImageButton:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   1875: aload_0
    //   1876: aload_0
    //   1877: ldc_w 1850
    //   1880: invokevirtual 1474	com/ireadercity/b2/ui/BookReadingActivityNew:findViewById	(I)Landroid/view/View;
    //   1883: checkcast 981	android/widget/RelativeLayout
    //   1886: putfield 289	com/ireadercity/b2/ui/BookReadingActivityNew:bi	Landroid/widget/RelativeLayout;
    //   1889: aload_0
    //   1890: aload_0
    //   1891: getfield 289	com/ireadercity/b2/ui/BookReadingActivityNew:bi	Landroid/widget/RelativeLayout;
    //   1894: ldc_w 1851
    //   1897: invokevirtual 1685	android/widget/RelativeLayout:findViewById	(I)Landroid/view/View;
    //   1900: checkcast 1138	android/widget/EditText
    //   1903: putfield 286	com/ireadercity/b2/ui/BookReadingActivityNew:bj	Landroid/widget/EditText;
    //   1906: aload_0
    //   1907: aload_0
    //   1908: getfield 289	com/ireadercity/b2/ui/BookReadingActivityNew:bi	Landroid/widget/RelativeLayout;
    //   1911: ldc_w 1852
    //   1914: invokevirtual 1685	android/widget/RelativeLayout:findViewById	(I)Landroid/view/View;
    //   1917: checkcast 716	android/widget/ImageButton
    //   1920: putfield 1854	com/ireadercity/b2/ui/BookReadingActivityNew:bt	Landroid/widget/ImageButton;
    //   1923: aload_0
    //   1924: aload_0
    //   1925: getfield 289	com/ireadercity/b2/ui/BookReadingActivityNew:bi	Landroid/widget/RelativeLayout;
    //   1928: ldc_w 1855
    //   1931: invokevirtual 1685	android/widget/RelativeLayout:findViewById	(I)Landroid/view/View;
    //   1934: checkcast 895	android/widget/Button
    //   1937: putfield 488	com/ireadercity/b2/ui/BookReadingActivityNew:bo	Landroid/widget/Button;
    //   1940: aload_0
    //   1941: aload_0
    //   1942: getfield 289	com/ireadercity/b2/ui/BookReadingActivityNew:bi	Landroid/widget/RelativeLayout;
    //   1945: ldc_w 1856
    //   1948: invokevirtual 1685	android/widget/RelativeLayout:findViewById	(I)Landroid/view/View;
    //   1951: checkcast 895	android/widget/Button
    //   1954: putfield 1858	com/ireadercity/b2/ui/BookReadingActivityNew:bp	Landroid/widget/Button;
    //   1957: aload_0
    //   1958: aload_0
    //   1959: getfield 289	com/ireadercity/b2/ui/BookReadingActivityNew:bi	Landroid/widget/RelativeLayout;
    //   1962: ldc_w 1859
    //   1965: invokevirtual 1685	android/widget/RelativeLayout:findViewById	(I)Landroid/view/View;
    //   1968: checkcast 1861	android/widget/ListView
    //   1971: putfield 1863	com/ireadercity/b2/ui/BookReadingActivityNew:bk	Landroid/widget/ListView;
    //   1974: aload_0
    //   1975: getfield 1854	com/ireadercity/b2/ui/BookReadingActivityNew:bt	Landroid/widget/ImageButton;
    //   1978: new 1865	com/ireadercity/b2/ui/dd
    //   1981: dup
    //   1982: aload_0
    //   1983: invokespecial 1866	com/ireadercity/b2/ui/dd:<init>	(Lcom/ireadercity/b2/ui/BookReadingActivityNew;)V
    //   1986: invokevirtual 720	android/widget/ImageButton:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   1989: aload_0
    //   1990: getfield 488	com/ireadercity/b2/ui/BookReadingActivityNew:bo	Landroid/widget/Button;
    //   1993: new 1868	com/ireadercity/b2/ui/de
    //   1996: dup
    //   1997: aload_0
    //   1998: invokespecial 1869	com/ireadercity/b2/ui/de:<init>	(Lcom/ireadercity/b2/ui/BookReadingActivityNew;)V
    //   2001: invokevirtual 896	android/widget/Button:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   2004: aload_0
    //   2005: getfield 1858	com/ireadercity/b2/ui/BookReadingActivityNew:bp	Landroid/widget/Button;
    //   2008: new 1871	com/ireadercity/b2/ui/dg
    //   2011: dup
    //   2012: aload_0
    //   2013: invokespecial 1872	com/ireadercity/b2/ui/dg:<init>	(Lcom/ireadercity/b2/ui/BookReadingActivityNew;)V
    //   2016: invokevirtual 896	android/widget/Button:setOnClickListener	(Landroid/view/View$OnClickListener;)V
    //   2019: aload_0
    //   2020: getfield 1863	com/ireadercity/b2/ui/BookReadingActivityNew:bk	Landroid/widget/ListView;
    //   2023: invokevirtual 1876	android/widget/ListView:getAdapter	()Landroid/widget/ListAdapter;
    //   2026: ifnonnull +91 -> 2117
    //   2029: aload_0
    //   2030: new 1878	android/widget/SimpleAdapter
    //   2033: dup
    //   2034: aload_0
    //   2035: aload_0
    //   2036: getfield 254	com/ireadercity/b2/ui/BookReadingActivityNew:bv	Ljava/util/ArrayList;
    //   2039: ldc_w 1879
    //   2042: iconst_3
    //   2043: anewarray 175	java/lang/String
    //   2046: dup
    //   2047: iconst_0
    //   2048: ldc_w 452
    //   2051: aastore
    //   2052: dup
    //   2053: iconst_1
    //   2054: ldc_w 441
    //   2057: aastore
    //   2058: dup
    //   2059: iconst_2
    //   2060: ldc_w 454
    //   2063: aastore
    //   2064: iconst_3
    //   2065: newarray <illegal type>
    //   2067: dup
    //   2068: iconst_0
    //   2069: ldc_w 1880
    //   2072: iastore
    //   2073: dup
    //   2074: iconst_1
    //   2075: ldc_w 1881
    //   2078: iastore
    //   2079: dup
    //   2080: iconst_2
    //   2081: ldc_w 1882
    //   2084: iastore
    //   2085: invokespecial 1885	android/widget/SimpleAdapter:<init>	(Landroid/content/Context;Ljava/util/List;I[Ljava/lang/String;[I)V
    //   2088: putfield 491	com/ireadercity/b2/ui/BookReadingActivityNew:bl	Landroid/widget/SimpleAdapter;
    //   2091: aload_0
    //   2092: getfield 1863	com/ireadercity/b2/ui/BookReadingActivityNew:bk	Landroid/widget/ListView;
    //   2095: new 1887	com/ireadercity/b2/ui/cu
    //   2098: dup
    //   2099: aload_0
    //   2100: invokespecial 1888	com/ireadercity/b2/ui/cu:<init>	(Lcom/ireadercity/b2/ui/BookReadingActivityNew;)V
    //   2103: invokevirtual 1892	android/widget/ListView:setOnItemClickListener	(Landroid/widget/AdapterView$OnItemClickListener;)V
    //   2106: aload_0
    //   2107: getfield 1863	com/ireadercity/b2/ui/BookReadingActivityNew:bk	Landroid/widget/ListView;
    //   2110: aload_0
    //   2111: getfield 491	com/ireadercity/b2/ui/BookReadingActivityNew:bl	Landroid/widget/SimpleAdapter;
    //   2114: invokevirtual 1896	android/widget/ListView:setAdapter	(Landroid/widget/ListAdapter;)V
    //   2117: invokestatic 1421	com/ireadercity/b2/a:d	()V
    //   2120: aload_0
    //   2121: getfield 243	com/ireadercity/b2/ui/BookReadingActivityNew:bd	Ljava/lang/Boolean;
    //   2124: invokevirtual 545	java/lang/Boolean:booleanValue	()Z
    //   2127: ifeq +118 -> 2245
    //   2130: aload_0
    //   2131: aload_0
    //   2132: ldc_w 1897
    //   2135: invokevirtual 1474	com/ireadercity/b2/ui/BookReadingActivityNew:findViewById	(I)Landroid/view/View;
    //   2138: checkcast 549	com/ireadercity/b2/curlview/CurlView
    //   2141: putfield 547	com/ireadercity/b2/ui/BookReadingActivityNew:be	Lcom/ireadercity/b2/curlview/CurlView;
    //   2144: aload_0
    //   2145: getfield 547	com/ireadercity/b2/ui/BookReadingActivityNew:be	Lcom/ireadercity/b2/curlview/CurlView;
    //   2148: new 1899	com/ireadercity/b2/ui/dp
    //   2151: dup
    //   2152: aload_0
    //   2153: iconst_0
    //   2154: invokespecial 1902	com/ireadercity/b2/ui/dp:<init>	(Lcom/ireadercity/b2/ui/BookReadingActivityNew;B)V
    //   2157: invokevirtual 1905	com/ireadercity/b2/curlview/CurlView:a	(Lcom/ireadercity/b2/curlview/j;)V
    //   2160: aload_0
    //   2161: getfield 547	com/ireadercity/b2/ui/BookReadingActivityNew:be	Lcom/ireadercity/b2/curlview/CurlView;
    //   2164: aload_0
    //   2165: invokevirtual 1908	com/ireadercity/b2/curlview/CurlView:a	(Lcom/ireadercity/b2/curlview/k;)V
    //   2168: aload_0
    //   2169: getfield 547	com/ireadercity/b2/ui/BookReadingActivityNew:be	Lcom/ireadercity/b2/curlview/CurlView;
    //   2172: iconst_0
    //   2173: invokevirtual 1909	com/ireadercity/b2/curlview/CurlView:setVisibility	(I)V
    //   2176: aload_0
    //   2177: invokevirtual 1255	com/ireadercity/b2/ui/BookReadingActivityNew:f	()V
    //   2180: return
    //   2181: astore_1
    //   2182: aload_1
    //   2183: invokevirtual 356	java/lang/Exception:printStackTrace	()V
    //   2186: goto -2165 -> 21
    //   2189: astore_1
    //   2190: aload_1
    //   2191: invokevirtual 356	java/lang/Exception:printStackTrace	()V
    //   2194: aload_0
    //   2195: invokevirtual 1440	com/ireadercity/b2/ui/BookReadingActivityNew:finish	()V
    //   2198: return
    //   2199: aload_0
    //   2200: getfield 334	com/ireadercity/b2/ui/BookReadingActivityNew:aH	F
    //   2203: ldc_w 353
    //   2206: fcmpl
    //   2207: ifle -1826 -> 381
    //   2210: aload_0
    //   2211: ldc_w 353
    //   2214: putfield 334	com/ireadercity/b2/ui/BookReadingActivityNew:aH	F
    //   2217: goto -1836 -> 381
    //   2220: aload_0
    //   2221: aload_0
    //   2222: ldc_w 1910
    //   2225: invokevirtual 1474	com/ireadercity/b2/ui/BookReadingActivityNew:findViewById	(I)Landroid/view/View;
    //   2228: checkcast 981	android/widget/RelativeLayout
    //   2231: putfield 1385	com/ireadercity/b2/ui/BookReadingActivityNew:a	Landroid/widget/RelativeLayout;
    //   2234: goto -1772 -> 462
    //   2237: astore_1
    //   2238: aload_1
    //   2239: invokevirtual 356	java/lang/Exception:printStackTrace	()V
    //   2242: goto -508 -> 1734
    //   2245: aload_0
    //   2246: aload_0
    //   2247: ldc_w 1911
    //   2250: invokevirtual 1474	com/ireadercity/b2/ui/BookReadingActivityNew:findViewById	(I)Landroid/view/View;
    //   2253: checkcast 707	com/ireadercity/b2/ui/widget/SimpleReadingView
    //   2256: putfield 560	com/ireadercity/b2/ui/BookReadingActivityNew:bf	Lcom/ireadercity/b2/ui/widget/SimpleReadingView;
    //   2259: aload_0
    //   2260: getfield 560	com/ireadercity/b2/ui/BookReadingActivityNew:bf	Lcom/ireadercity/b2/ui/widget/SimpleReadingView;
    //   2263: aload_0
    //   2264: invokevirtual 1912	com/ireadercity/b2/ui/widget/SimpleReadingView:a	(Lcom/ireadercity/b2/curlview/k;)V
    //   2267: aload_0
    //   2268: getfield 560	com/ireadercity/b2/ui/BookReadingActivityNew:bf	Lcom/ireadercity/b2/ui/widget/SimpleReadingView;
    //   2271: iconst_0
    //   2272: invokevirtual 1913	com/ireadercity/b2/ui/widget/SimpleReadingView:setVisibility	(I)V
    //   2275: aload_0
    //   2276: getfield 560	com/ireadercity/b2/ui/BookReadingActivityNew:bf	Lcom/ireadercity/b2/ui/widget/SimpleReadingView;
    //   2279: aload_0
    //   2280: getfield 272	com/ireadercity/b2/ui/BookReadingActivityNew:aU	Lcom/ireadercity/b2/bean/i;
    //   2283: invokevirtual 947	com/ireadercity/b2/bean/i:p	()I
    //   2286: invokevirtual 1914	com/ireadercity/b2/ui/widget/SimpleReadingView:b	(I)V
    //   2289: goto -113 -> 2176
    //   2292: astore_1
    //   2293: goto -1851 -> 442
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	2296	0	this	BookReadingActivityNew
    //   0	2296	1	paramBundle	android.os.Bundle
    //   1	1745	2	i1	int
    //   423	18	3	i2	int
    //   10	3	4	bool	boolean
    //   485	1229	5	localObject	Object
    //   497	21	6	localExchangeDataService	com.umeng.newxp.controller.ExchangeDataService
    //   510	15	7	localRelativeLayout	RelativeLayout
    // Exception table:
    //   from	to	target	type
    //   17	21	2181	java/lang/Exception
    //   7	12	2189	java/lang/Exception
    //   21	97	2189	java/lang/Exception
    //   97	167	2189	java/lang/Exception
    //   167	226	2189	java/lang/Exception
    //   226	381	2189	java/lang/Exception
    //   381	400	2189	java/lang/Exception
    //   400	434	2189	java/lang/Exception
    //   448	462	2189	java/lang/Exception
    //   462	539	2189	java/lang/Exception
    //   539	1471	2189	java/lang/Exception
    //   1476	1493	2189	java/lang/Exception
    //   1493	1569	2189	java/lang/Exception
    //   1569	1596	2189	java/lang/Exception
    //   1596	1650	2189	java/lang/Exception
    //   1650	1667	2189	java/lang/Exception
    //   1667	1693	2189	java/lang/Exception
    //   1734	1746	2189	java/lang/Exception
    //   1746	1777	2189	java/lang/Exception
    //   1777	2117	2189	java/lang/Exception
    //   2117	2176	2189	java/lang/Exception
    //   2176	2180	2189	java/lang/Exception
    //   2182	2186	2189	java/lang/Exception
    //   2199	2217	2189	java/lang/Exception
    //   2220	2234	2189	java/lang/Exception
    //   2238	2242	2189	java/lang/Exception
    //   2245	2289	2189	java/lang/Exception
    //   1693	1734	2237	java/lang/Exception
    //   434	440	2292	java/lang/Exception
  }
  
  protected void onDestroy()
  {
    try
    {
      this.aT = true;
      super.onDestroy();
      try
      {
        this.aD = null;
        this.aI = null;
        this.aJ = null;
        this.aO = null;
        this.aS = null;
        this.v = null;
        this.aU = null;
        this.aY = null;
        this.aZ = null;
        this.bc = null;
        if (this.ag != null)
        {
          this.ag.d();
          this.ag = null;
        }
        if (this.ah != null)
        {
          this.ah.d();
          this.ah = null;
        }
        if (this.ai != null)
        {
          this.ai.b();
          this.ai = null;
        }
        if (this.aW != null)
        {
          this.aW.f();
          this.aW = null;
        }
        if (this.bf != null)
        {
          this.bf.b();
          this.bf = null;
        }
        if (this.be != null)
        {
          this.be.e();
          this.be = null;
        }
        if ((w.b != null) && (!w.b.isRecycled()))
        {
          w.b.recycle();
          w.b = null;
          com.ireadercity.b2.a.d();
        }
        if (this.ap != null)
        {
          this.ap.d();
          this.ap = null;
        }
        com.ireadercity.b2.a.d();
        new StringBuilder("===***getNativeHeapAllocatedSize()=").append(Debug.getNativeHeapAllocatedSize()).append("***===getNativeHeapFreeSize()=").append(Debug.getNativeHeapFreeSize()).toString();
        com.ireadercity.b2.a.d();
      }
      catch (Exception localException)
      {
        for (;;)
        {
          localException.printStackTrace();
        }
      }
      finalize();
      return;
    }
    catch (Throwable localThrowable)
    {
      localThrowable.printStackTrace();
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      if (this.bh)
      {
        a(false);
        return true;
      }
      if (this.bi.getVisibility() == 0)
      {
        ((InputMethodManager)getSystemService("input_method")).hideSoftInputFromWindow(this.bj.getWindowToken(), 0);
        this.bi.setVisibility(8);
        this.t = false;
        o();
        return true;
      }
      if (p()) {
        e(g[0]);
      }
      for (;;)
      {
        return true;
        g();
      }
    }
    if ((this.aU.q() == 1) && ((paramInt == 25) || (paramInt == 24))) {
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 82)
    {
      if ((this.bh) || (this.bi.getVisibility() == 0)) {
        return true;
      }
      if (!p()) {
        break label65;
      }
      e(g[0]);
    }
    while (this.aU.q() == 1) {
      if (paramInt == 25)
      {
        h(1);
        return true;
        label65:
        e(g[1]);
      }
      else
      {
        if (paramInt == 24)
        {
          h(-1);
          return true;
        }
        return super.onKeyUp(paramInt, paramKeyEvent);
      }
    }
    return super.onKeyUp(paramInt, paramKeyEvent);
  }
  
  protected void onPause()
  {
    new StringBuilder("onPause markProgress=").append(this.aH).toString();
    super.onPause();
    try
    {
      if (this.aq != null) {
        unregisterReceiver(this.aq);
      }
      this.ay = true;
      this.p = true;
      if ((this.u != null) && (this.u.isHeld())) {
        this.u.release();
      }
      m();
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
  
  protected void onRestart()
  {
    new StringBuilder("onRestart mCurrentIndex").append(this.bg).toString();
    new StringBuilder("onRestart markProgress=").append(this.aH).toString();
    super.onRestart();
    getWindow().addFlags(1024);
  }
  
  protected void onResume()
  {
    super.onResume();
    this.ay = false;
    this.ax = new bj(this);
    this.ax.sendMessage(this.ax.obtainMessage());
    int i1 = Settings.System.getInt(getContentResolver(), "screen_brightness", 255);
    this.ak.setProgress(i1);
    l.a(getApplicationContext());
    this.v = j.a(getApplicationContext());
    y.c(getApplicationContext());
    if (this.aq == null) {
      this.aq = new dn(this);
    }
    try
    {
      registerReceiver(this.aq, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
      if (this.u == null) {
        this.u = ((PowerManager)getSystemService("power")).newWakeLock(536870922, "ShowContent");
      }
      this.u.setReferenceCounted(false);
      if (!this.u.isHeld()) {
        this.u.acquire(com.ireadercity.b2.a.j);
      }
      if (!com.ireadercity.b2.a.i) {}
    }
    catch (Exception localException2)
    {
      try
      {
        MobclickAgent.onResume(this);
        this.p = false;
        if (com.ireadercity.b2.a.Y) {
          if (this.aq == null) {
            this.aq = new dn(this);
          }
        }
      }
      catch (Exception localException2)
      {
        try
        {
          for (;;)
          {
            registerReceiver(this.aq, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            this.at.setVisibility(0);
            return;
            localException1 = localException1;
            localException1.printStackTrace();
          }
          localException2 = localException2;
          localException2.printStackTrace();
        }
        catch (Exception localException3)
        {
          for (;;)
          {
            localException3.printStackTrace();
          }
        }
        this.at.setVisibility(8);
      }
    }
  }
  
  protected void onStop()
  {
    new StringBuilder("onStop mCurrentIndex").append(this.bg).toString();
    super.onStop();
    try
    {
      com.ireadercity.b2.h.r.b(this.aD.j());
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (!this.aM)
    {
      if (!this.bd.booleanValue()) {
        break label32;
      }
      this.be.onTouch(this.be, paramMotionEvent);
    }
    for (;;)
    {
      return true;
      label32:
      this.bf.onTouch(this.bf, paramMotionEvent);
    }
  }
  
  public boolean onTrackballEvent(MotionEvent paramMotionEvent)
  {
    return true;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\BookReadingActivityNew.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */