package com.ireadercity.b2.a;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.AsyncTask.Status;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AbsListView.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.ireadercity.b2.b.g;
import com.ireadercity.b2.bean.b;
import com.ireadercity.b2.bean.f;
import com.ireadercity.b2.e.e;
import com.ireadercity.b2.ui.AIReaderActivity;
import com.ireadercity.b2.ui.PDFBrowseActivity;
import com.ireadercity.b2.ui.du;
import com.ireadercity.b2.ui.widget.RecycleableImageView;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public final class r
  extends BaseAdapter
{
  private static String b = "ListLocalBookAdapter";
  long a;
  private g c;
  private List<b> d;
  private List<f> e;
  private LayoutInflater f;
  private Activity g;
  private ae h;
  private CompoundButton.OnCheckedChangeListener i;
  private CompoundButton.OnCheckedChangeListener j;
  private WeakReference<Bitmap> k;
  private boolean l = false;
  private boolean m = false;
  private boolean n = false;
  private HashMap<b, Boolean> o;
  private ConcurrentHashMap<String, ab> p;
  private int q;
  private int r;
  private Animation s;
  
  public r(Activity paramActivity, List<f> paramList, List<b> paramList1, LayoutInflater paramLayoutInflater)
  {
    this.g = paramActivity;
    this.d = paramList1;
    this.e = paramList;
    this.f = paramLayoutInflater;
    this.s = AnimationUtils.loadAnimation(paramActivity.getApplicationContext(), 2130968580);
    try
    {
      if (this.d == null) {
        this.d = new ArrayList();
      }
      if (this.e == null) {
        this.e = new ArrayList();
      }
      this.r = com.ireadercity.b2.a.E;
      this.q = com.ireadercity.b2.a.D;
      if ((this.r == 960) && (this.q == 540)) {
        this.r = 880;
      }
      this.c = new g(this.g.getApplicationContext(), 2);
      this.p = new ConcurrentHashMap();
      this.h = new ae(this);
      this.o = new HashMap();
      this.i = new s(this);
      this.j = new t(this);
      if (this.k == null) {
        this.k = new WeakReference(BitmapFactory.decodeResource(this.g.getResources(), 2130837559));
      }
      return;
    }
    catch (OutOfMemoryError paramActivity)
    {
      paramActivity.printStackTrace();
      this.k = new WeakReference(null);
      com.ireadercity.b2.a.d();
    }
  }
  
  private boolean a(b paramb, RecycleableImageView paramRecycleableImageView)
  {
    String str2 = paramb.r();
    String str1;
    if (!com.ireadercity.b2.h.y.d(str2))
    {
      str1 = str2;
      if (new File(str2).exists()) {}
    }
    else
    {
      str2 = com.ireadercity.b2.h.s.a(paramb.l());
      if (!com.ireadercity.b2.h.y.d(str2))
      {
        str1 = str2;
        if (new File(str2).exists()) {}
      }
      else
      {
        str1 = com.ireadercity.b2.h.y.k(paramb.l());
      }
    }
    paramb = b;
    new StringBuilder("coverPath=").append(str1).toString();
    if ((com.ireadercity.b2.h.y.d(str1)) || (!new File(str1).exists()))
    {
      g.a(this.g);
      paramRecycleableImageView.b();
      return false;
    }
    paramb = this.c;
    if (g.a(new File(str1), paramRecycleableImageView)) {
      return true;
    }
    g.a(this.g);
    paramRecycleableImageView.b();
    return false;
  }
  
  public static void f()
  {
    AIReaderActivity.a.a(null);
    if (AIReaderActivity.a.b > 0) {
      AIReaderActivity.a.b = 0;
    }
    AIReaderActivity.a.g.setImageResource(2130837748);
    AIReaderActivity.a.g.setClickable(false);
    AIReaderActivity.a.l.setText("我的书库");
    AIReaderActivity.a.b();
  }
  
  public final HashMap<b, Boolean> a()
  {
    return this.o;
  }
  
  public final void a(int paramInt, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      Object localObject1 = com.ireadercity.b2.c.a.a(this.g.getApplicationContext());
      Object localObject2 = ((com.ireadercity.b2.c.a)localObject1).a(paramInt, -1);
      ((com.ireadercity.b2.c.a)localObject1).b(paramInt);
      localObject1 = ((List)localObject2).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (b)((Iterator)localObject1).next();
        b((b)localObject2);
        this.d.remove(localObject2);
      }
    }
    com.ireadercity.b2.c.a.a(this.g.getApplicationContext()).b(paramInt);
  }
  
  public final void a(b paramb)
  {
    new AlertDialog.Builder(this.g).setTitle(2131230809).setMessage(this.g.getResources().getString(2131230810, new Object[] { paramb.k() })).setPositiveButton(2131230844, new x(this, paramb)).setNegativeButton(2131230845, null).show();
  }
  
  public final void a(f paramf)
  {
    AIReaderActivity localAIReaderActivity = AIReaderActivity.a;
    AIReaderActivity.a(AIReaderActivity.a.d, this.g.getText(2131230849));
    AIReaderActivity.a.b = paramf.a();
    AIReaderActivity.a.a(paramf);
    AIReaderActivity.a.l.setText(paramf.c());
    AIReaderActivity.a.g.setImageResource(2130837713);
    AIReaderActivity.a.g.setClickable(true);
    new ad(this).execute(new Integer[] { Integer.valueOf(paramf.b()) });
  }
  
  public final void a(String paramString)
  {
    Toast.makeText(this.g, paramString, 0).show();
  }
  
  public final void a(List<b> paramList)
  {
    this.d = paramList;
    if (this.d == null) {
      this.d = new ArrayList();
    }
    notifyDataSetChanged();
  }
  
  public final void a(List<f> paramList, boolean paramBoolean)
  {
    this.e = paramList;
    if (this.e == null) {
      this.e = new ArrayList();
    }
    if (paramBoolean) {
      notifyDataSetChanged();
    }
  }
  
  public final void a(boolean paramBoolean)
  {
    this.m = paramBoolean;
  }
  
  public final void b(b paramb)
  {
    String str = b;
    new aa(this).execute(new Object[] { paramb });
  }
  
  public final void b(boolean paramBoolean)
  {
    this.l = true;
    this.n = paramBoolean;
    if (paramBoolean)
    {
      Iterator localIterator = this.d.iterator();
      while (localIterator.hasNext())
      {
        b localb = (b)localIterator.next();
        this.o.put(localb, Boolean.valueOf(true));
      }
    }
    this.o.clear();
    notifyDataSetChanged();
  }
  
  public final boolean b()
  {
    return this.m;
  }
  
  public final void c()
  {
    this.l = false;
    this.o.clear();
    notifyDataSetChanged();
  }
  
  public final void c(b paramb)
  {
    new StringBuilder("4---").append(System.currentTimeMillis() - this.a).toString();
    if (paramb == null) {}
    do
    {
      int i1;
      do
      {
        return;
        localObject = paramb.l().toLowerCase();
        if ((localObject == null) || ("".equals(((String)localObject).trim())))
        {
          a("不能打开此书，请删除重新下载。");
          return;
        }
        new StringBuilder("5---").append(System.currentTimeMillis() - this.a).toString();
        localObject = com.ireadercity.b2.e.a.a(this.g).b();
        if ((localObject != null) && (((List)localObject).size() > 0)) {
          Toast.makeText(this.g, "你有正在下载的内容，如果你的设备配置并不是很高，这时打开一本书很可能会很慢并有可能出现内存不足，这时如果看书就会出白皮屏问题，请在下载全部完成后，重新运行程序开始看书！", 1).show();
        }
        new StringBuilder("6---").append(System.currentTimeMillis() - this.a).toString();
        paramb.u();
        i1 = com.ireadercity.b2.c.a.a(this.g.getApplicationContext()).a(paramb.j());
        localObject = b;
        new StringBuilder("++++++++状态++++++++++").append(i1).toString();
        new StringBuilder("7---").append(System.currentTimeMillis() - this.a).toString();
        if (!paramb.y()) {
          break;
        }
        if (i1 <= 1)
        {
          localObject = (ab)this.p.get(paramb.j());
          if ((localObject != null) && ((((ab)localObject).getStatus().equals(AsyncTask.Status.RUNNING)) || (((ab)localObject).getStatus().equals(AsyncTask.Status.PENDING)))) {
            a("后台正在处理，请稍等...");
          }
          for (;;)
          {
            new StringBuilder("8---").append(System.currentTimeMillis() - this.a).toString();
            return;
            localObject = b;
            if (this.p.size() >= 4)
            {
              a("后台任务达到上限,稍后重试...");
            }
            else
            {
              localObject = new ab(this, this.g, paramb);
              this.p.put(paramb.j(), localObject);
              ((ab)localObject).execute(new Object[0]);
            }
          }
        }
      } while (i1 != 2);
      new AlertDialog.Builder(this.g).setTitle("提示信息").setMessage("后台正在处理，稍后重试...").setPositiveButton("确定", new y(this)).show();
      new StringBuilder("8---").append(System.currentTimeMillis() - this.a).toString();
      return;
      if (paramb.z())
      {
        new StringBuilder("9---").append(System.currentTimeMillis() - this.a).toString();
        localObject = new du(this.g);
        paramb.k();
        ((du)localObject).a(this.g.getString(2131230851));
        new z(this, paramb, (du)localObject).start();
        new StringBuilder("10---").append(System.currentTimeMillis() - this.a).toString();
        return;
      }
    } while (!paramb.A());
    Object localObject = paramb.l();
    String str = com.ireadercity.b2.a.n + "/" + paramb.j();
    File localFile = new File(str);
    if ((localFile.isDirectory()) && (localFile.listFiles().length > 0))
    {
      localObject = new Intent(this.g, PDFBrowseActivity.class);
      ((Intent)localObject).putExtra("xdata", paramb);
      this.g.startActivity((Intent)localObject);
      return;
    }
    if (((String)localObject).endsWith("pdf")) {}
    for (boolean bool = true;; bool = false)
    {
      new ac(this).execute(new Object[] { localObject, str, paramb, Boolean.valueOf(bool) });
      return;
    }
  }
  
  public final boolean d()
  {
    try
    {
      Iterator localIterator = this.o.keySet().iterator();
      while (localIterator.hasNext())
      {
        b localb = (b)localIterator.next();
        if ((this.o.get(localb) != null) && (((Boolean)this.o.get(localb)).equals(Boolean.TRUE))) {
          b(localb);
        }
      }
      this.o.clear();
      return true;
    }
    catch (Exception localException) {}
    return false;
  }
  
  public final boolean e()
  {
    return this.n;
  }
  
  public final int getCount()
  {
    int i1 = this.e.size() + this.d.size();
    if (i1 <= 0)
    {
      AIReaderActivity.a.h.setVisibility(8);
      if (i1 % 3 != 0) {
        break label76;
      }
      i1 /= 3;
    }
    for (;;)
    {
      if (i1 >= 4) {
        return i1;
      }
      return 4;
      AIReaderActivity.a.d.setVisibility(8);
      AIReaderActivity.a.h.setVisibility(0);
      break;
      label76:
      i1 = i1 / 3 + 1;
    }
    return i1;
  }
  
  public final Object getItem(int paramInt)
  {
    return null;
  }
  
  public final long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    paramViewGroup = b;
    long l1 = new Date().getTime();
    View localView;
    ag localag;
    Object localObject1;
    label1132:
    label1166:
    label1200:
    Object localObject2;
    if (paramView == null)
    {
      localView = this.f.inflate(2130903054, null);
      localag = new ag();
      ag.a(localag, (LinearLayout)localView.findViewById(2131361908));
      ag.a(localag).bringToFront();
      ag.a(localag, (ImageView)localView.findViewById(2131361919));
      ((RelativeLayout)localView).bringChildToFront(ag.a(localag));
      ag.a(localag, (FrameLayout)localView.findViewById(2131361909));
      ag.b(localag, (FrameLayout)localView.findViewById(2131361917));
      ag.c(localag, (FrameLayout)localView.findViewById(2131361918));
      ag.a(localag, (RecycleableImageView)ag.b(localag).findViewById(2131361910));
      ag.b(localag, (RecycleableImageView)ag.c(localag).findViewById(2131361910));
      ag.c(localag, (RecycleableImageView)ag.d(localag).findViewById(2131361910));
      ag.e(localag).setOnClickListener(this.h);
      ag.f(localag).setOnClickListener(this.h);
      ag.g(localag).setOnClickListener(this.h);
      this.g.registerForContextMenu(ag.e(localag));
      this.g.registerForContextMenu(ag.f(localag));
      this.g.registerForContextMenu(ag.g(localag));
      ag.a(localag, (TextView)ag.b(localag).findViewById(2131361911));
      ag.b(localag, (TextView)ag.c(localag).findViewById(2131361911));
      ag.c(localag, (TextView)ag.d(localag).findViewById(2131361911));
      ag.b(localag, (ImageView)ag.b(localag).findViewById(2131361912));
      ag.c(localag, (ImageView)ag.c(localag).findViewById(2131361912));
      ag.d(localag, (ImageView)ag.d(localag).findViewById(2131361912));
      ag.d(localag, (FrameLayout)ag.b(localag).findViewById(2131361913));
      ag.e(localag, (FrameLayout)ag.c(localag).findViewById(2131361913));
      ag.f(localag, (FrameLayout)ag.d(localag).findViewById(2131361913));
      ag.a(localag, (CheckBox)ag.h(localag).findViewById(2131361914));
      ag.b(localag, (CheckBox)ag.i(localag).findViewById(2131361914));
      ag.c(localag, (CheckBox)ag.j(localag).findViewById(2131361914));
      ag.a(localag, (RelativeLayout)ag.h(localag).findViewById(2131361915));
      ag.b(localag, (RelativeLayout)ag.i(localag).findViewById(2131361915));
      ag.c(localag, (RelativeLayout)ag.j(localag).findViewById(2131361915));
      ag.d(localag, (CheckBox)ag.k(localag).findViewById(2131361916));
      ag.e(localag, (CheckBox)ag.l(localag).findViewById(2131361916));
      ag.f(localag, (CheckBox)ag.m(localag).findViewById(2131361916));
      ag.a(localag, (ProgressBar)ag.k(localag).findViewById(2131361867));
      ag.b(localag, (ProgressBar)ag.l(localag).findViewById(2131361867));
      ag.c(localag, (ProgressBar)ag.m(localag).findViewById(2131361867));
      localView.setLayoutParams(new AbsListView.LayoutParams(this.q, -2));
      paramView = new LinearLayout.LayoutParams((int)((this.q + 0.1F) / 4.5F), (int)((this.q + 0.1F) / 3.0F));
      paramViewGroup = new LinearLayout.LayoutParams((int)((this.q + 0.1F) / 4.5F), (int)((this.q + 0.1F) / 3.0F));
      localObject1 = new LinearLayout.LayoutParams((int)((this.q + 0.1F) / 4.5F), (int)((this.q + 0.1F) / 3.0F));
      paramView.gravity = 65;
      paramViewGroup.gravity = 65;
      ((LinearLayout.LayoutParams)localObject1).gravity = 65;
      paramView.weight = 1.0F;
      paramViewGroup.weight = 1.0F;
      ((LinearLayout.LayoutParams)localObject1).weight = 1.0F;
      ag.b(localag).setLayoutParams(paramView);
      ag.c(localag).setLayoutParams(paramViewGroup);
      ag.d(localag).setLayoutParams((ViewGroup.LayoutParams)localObject1);
      ag.b(localag).setPadding(this.q / 10, 0, 0, 0);
      ag.c(localag).setPadding(this.q / 20, 0, this.q / 20, 0);
      ag.d(localag).setPadding(0, 0, this.q / 10, 0);
      af.a = Math.round(this.q / 48.0F);
      af.b = Math.round(this.q / 96.0F);
      ag.e(localag).setPadding(0, 0, af.a, af.b);
      ag.f(localag).setPadding(0, 0, af.a, af.b);
      ag.g(localag).setPadding(0, 0, af.a, af.b);
      ag.n(localag).setPadding(0, 0, 10, this.q / 12);
      ag.o(localag).setPadding(0, 0, 10, this.q / 12);
      ag.p(localag).setPadding(0, 0, 10, this.q / 12);
      ag.a(localag).bringToFront();
      localView.setTag(localag);
      localObject1 = null;
      if (this.e.size() <= paramInt * 3) {
        break label2338;
      }
      localObject1 = this.e.get(paramInt * 3);
      paramViewGroup = null;
      if (this.e.size() <= paramInt * 3 + 1) {
        break label2390;
      }
      paramViewGroup = this.e.get(paramInt * 3 + 1);
      paramView = null;
      if (this.e.size() <= paramInt * 3 + 2) {
        break label2445;
      }
      paramView = this.e.get(paramInt * 3 + 2);
      ag.e(localag).setTag(localObject1);
      ag.f(localag).setTag(paramViewGroup);
      ag.g(localag).setTag(paramView);
      ag.b(localag).setVisibility(0);
      ag.c(localag).setVisibility(0);
      ag.d(localag).setVisibility(0);
      ag.h(localag).setVisibility(8);
      ag.i(localag).setVisibility(8);
      ag.j(localag).setVisibility(8);
      ag.e(localag).setBackgroundResource(2130837559);
      ag.f(localag).setBackgroundResource(2130837559);
      ag.g(localag).setBackgroundResource(2130837559);
      ag.k(localag).setVisibility(8);
      ag.l(localag).setVisibility(8);
      ag.m(localag).setVisibility(8);
      ag.q(localag).setVisibility(0);
      ag.r(localag).setVisibility(0);
      ag.s(localag).setVisibility(0);
      ag.t(localag).setVisibility(8);
      ag.u(localag).setVisibility(8);
      ag.v(localag).setVisibility(8);
      ag.e(localag).setAlpha(255);
      ag.f(localag).setAlpha(255);
      ag.g(localag).setAlpha(255);
      localObject2 = b;
      new StringBuilder().append(localObject1).append(" arg0=").append(paramInt).toString();
      if ((localObject1 == null) || (!(localObject1 instanceof b))) {
        break label2500;
      }
      localObject2 = b;
      ((b)localObject1).k();
      label1493:
      if (localObject1 == null) {
        break label2992;
      }
      if (!(localObject1 instanceof b)) {
        break label2885;
      }
      localObject1 = (b)localObject1;
      if (!((b)localObject1).c()) {
        break label2558;
      }
      localObject2 = b;
      new StringBuilder("=============  pending book").append(((b)localObject1).k()).toString();
      ag.e(localag).setImageBitmap(null);
      ag.n(localag).setText(((b)localObject1).k());
      ag.n(localag).setVisibility(0);
      ag.h(localag).setVisibility(0);
      ag.h(localag).setBackgroundColor(Color.argb(0, 255, 255, 255));
      ag.k(localag).setVisibility(0);
      ag.q(localag).setVisibility(8);
      ag.w(localag).setOnCheckedChangeListener(null);
      ag.w(localag).setTag(localObject1);
      localObject2 = (e)com.ireadercity.b2.e.a.b.get(((b)localObject1).i());
      if ((localObject2 == null) || (!((e)localObject2).getStatus().equals(AsyncTask.Status.RUNNING))) {
        break label2530;
      }
      ag.w(localag).setChecked(true);
      label1691:
      ag.e(localag).setImageBitmap(g.a(this.g));
      ag.w(localag).setOnCheckedChangeListener(this.j);
      if (localObject2 != null) {
        ((e)localObject2).a(ag.x(localag));
      }
      localObject2 = (Integer)com.ireadercity.b2.e.a.c.get(((b)localObject1).i());
      if (localObject2 == null) {
        break label2542;
      }
      ag.x(localag).setProgress(((Integer)localObject2).intValue());
      label1767:
      if (paramViewGroup == null) {
        break label3472;
      }
      if (!(paramViewGroup instanceof b)) {
        break label3369;
      }
      paramViewGroup = (b)paramViewGroup;
      if (!paramViewGroup.c()) {
        break label3031;
      }
      localObject1 = b;
      new StringBuilder("=============  pending book").append(paramViewGroup.k()).toString();
      ag.f(localag).setImageBitmap(null);
      ag.o(localag).setText(paramViewGroup.k());
      ag.o(localag).setVisibility(0);
      ag.i(localag).setVisibility(0);
      ag.i(localag).setBackgroundColor(Color.argb(0, 255, 255, 255));
      ag.l(localag).setVisibility(0);
      ag.r(localag).setVisibility(8);
      ag.y(localag).setOnCheckedChangeListener(null);
      ag.y(localag).setTag(paramViewGroup);
      localObject1 = (e)com.ireadercity.b2.e.a.b.get(paramViewGroup.i());
      if ((localObject1 == null) || (!((e)localObject1).getStatus().equals(AsyncTask.Status.RUNNING))) {
        break label3004;
      }
      ag.y(localag).setChecked(true);
      label1956:
      ag.f(localag).setImageBitmap(g.a(this.g));
      ag.y(localag).setOnCheckedChangeListener(this.j);
      if (localObject1 != null) {
        ((e)localObject1).a(ag.z(localag));
      }
      localObject1 = (Integer)com.ireadercity.b2.e.a.c.get(paramViewGroup.i());
      if (localObject1 == null) {
        break label3016;
      }
      ag.z(localag).setProgress(((Integer)localObject1).intValue());
      label2031:
      if (paramView == null) {
        break label3941;
      }
      if (!(paramView instanceof b)) {
        break label3839;
      }
      paramView = (b)paramView;
      if (!paramView.c()) {
        break label3511;
      }
      paramViewGroup = b;
      new StringBuilder("=============  pending book").append(paramView.k()).toString();
      ag.g(localag).setImageBitmap(null);
      ag.p(localag).setText(paramView.k());
      ag.p(localag).setVisibility(0);
      ag.j(localag).setVisibility(0);
      ag.j(localag).setBackgroundColor(Color.argb(0, 255, 255, 255));
      ag.m(localag).setVisibility(0);
      ag.s(localag).setVisibility(8);
      ag.A(localag).setOnCheckedChangeListener(null);
      ag.A(localag).setTag(paramView);
      paramViewGroup = (e)com.ireadercity.b2.e.a.b.get(paramView.i());
      if ((paramViewGroup == null) || (!paramViewGroup.getStatus().equals(AsyncTask.Status.RUNNING))) {
        break label3484;
      }
      ag.A(localag).setChecked(true);
      label2216:
      ag.A(localag).setOnCheckedChangeListener(this.j);
      ag.g(localag).setImageBitmap(g.a(this.g));
      if (paramViewGroup != null) {
        paramViewGroup.a(ag.B(localag));
      }
      paramViewGroup = (Integer)com.ireadercity.b2.e.a.c.get(paramView.i());
      if (paramViewGroup == null) {
        break label3496;
      }
      ag.B(localag).setProgress(paramViewGroup.intValue());
    }
    for (;;)
    {
      paramView = b;
      new StringBuilder("GetView TimeUserd=").append(new Date().getTime() - l1).toString();
      return localView;
      localag = (ag)paramView.getTag();
      localView = paramView;
      break;
      label2338:
      if (this.e.size() + this.d.size() <= paramInt * 3) {
        break label1132;
      }
      localObject1 = this.d.get(paramInt * 3 - this.e.size());
      break label1132;
      label2390:
      if (this.e.size() + this.d.size() <= paramInt * 3 + 1) {
        break label1166;
      }
      paramViewGroup = this.d.get(paramInt * 3 + 1 - this.e.size());
      break label1166;
      label2445:
      if (this.e.size() + this.d.size() <= paramInt * 3 + 2) {
        break label1200;
      }
      paramView = this.d.get(paramInt * 3 + 2 - this.e.size());
      break label1200;
      label2500:
      if ((localObject1 == null) || (!(localObject1 instanceof b))) {
        break label1493;
      }
      localObject2 = b;
      ((f)localObject1).c();
      break label1493;
      label2530:
      ag.w(localag).setChecked(false);
      break label1691;
      label2542:
      ag.x(localag).setProgress(((b)localObject1).a());
      break label1767;
      try
      {
        label2558:
        if ((!this.m) && (a((b)localObject1, ag.e(localag)))) {
          ag.n(localag).setVisibility(8);
        }
        for (;;)
        {
          if (((b)localObject1).e() > 0) {
            break label2848;
          }
          ag.t(localag).setVisibility(0);
          if (!this.l) {
            break label2873;
          }
          ag.h(localag).setBackgroundResource(2130837541);
          ag.h(localag).setVisibility(0);
          ag.q(localag).setVisibility(0);
          ag.q(localag).setTag(localObject1);
          ag.q(localag).setTag(2131361910, ag.e(localag));
          localObject1 = (Boolean)this.o.get(localObject1);
          if ((localObject1 == null) || (((Boolean)localObject1).booleanValue() != true)) {
            break label2861;
          }
          ag.q(localag).setChecked(true);
          ag.e(localag).setAlpha(85);
          ag.q(localag).setOnCheckedChangeListener(this.i);
          ag.h(localag).setOnClickListener(new u(this, localag));
          break;
          ag.n(localag).setVisibility(0);
          ag.n(localag).setText(((b)localObject1).k().trim() + "\nby:" + ((b)localObject1).n().trim());
          ag.e(localag).setImageBitmap(g.a(this.g));
        }
      }
      catch (NullPointerException localNullPointerException2)
      {
        for (;;)
        {
          ag.e(localag).setImageBitmap(null);
          ag.n(localag).setText(((b)localObject1).k());
          continue;
          label2848:
          ag.t(localag).setVisibility(8);
          continue;
          label2861:
          ag.q(localag).setChecked(false);
        }
        label2873:
        ag.q(localag).setVisibility(4);
      }
      break label1767;
      label2885:
      if (!(localObject1 instanceof f)) {
        break label1767;
      }
      ag.e(localag).setBackgroundDrawable(null);
      String str2 = b;
      ag.e(localag).setImageBitmap(g.b(this.g));
      localObject1 = ((f)localObject1).c();
      ag.n(localag).setVisibility(0);
      ag.n(localag).setText((CharSequence)localObject1);
      ag.h(localag).setVisibility(8);
      ag.t(localag).setVisibility(8);
      ag.e(localag).setPadding(0, 0, af.a, af.b - 5);
      break label1767;
      label2992:
      ag.b(localag).setVisibility(4);
      break label1767;
      label3004:
      ag.y(localag).setChecked(false);
      break label1956;
      label3016:
      ag.z(localag).setProgress(paramViewGroup.a());
      break label2031;
      try
      {
        label3031:
        if ((!this.m) && (a(paramViewGroup, ag.f(localag)))) {
          ag.o(localag).setVisibility(8);
        }
        for (;;)
        {
          if (paramViewGroup.e() > 0) {
            break label3311;
          }
          ag.u(localag).setVisibility(0);
          if (!this.l) {
            break label3336;
          }
          ag.i(localag).setVisibility(0);
          ag.i(localag).setBackgroundResource(2130837541);
          ag.r(localag).setVisibility(0);
          ag.r(localag).setTag(paramViewGroup);
          ag.r(localag).setTag(2131361910, ag.f(localag));
          paramViewGroup = (Boolean)this.o.get(paramViewGroup);
          if ((paramViewGroup == null) || (paramViewGroup.booleanValue() != true)) {
            break label3324;
          }
          ag.r(localag).setChecked(true);
          ag.f(localag).setAlpha(85);
          ag.i(localag).setOnClickListener(new v(this, localag));
          ag.r(localag).setOnCheckedChangeListener(this.i);
          break;
          ag.o(localag).setVisibility(0);
          ag.o(localag).setText(paramViewGroup.k().trim() + "\nby:" + paramViewGroup.n().trim());
          ag.f(localag).setImageBitmap(g.a(this.g));
        }
      }
      catch (NullPointerException localNullPointerException1)
      {
        for (;;)
        {
          ag.f(localag).setImageBitmap(null);
          ag.o(localag).setText(paramViewGroup.k());
          continue;
          label3311:
          ag.u(localag).setVisibility(8);
          continue;
          label3324:
          ag.r(localag).setChecked(false);
        }
        label3336:
        ag.i(localag).setBackgroundColor(Color.argb(0, 255, 255, 255));
        ag.r(localag).setVisibility(4);
      }
      break label2031;
      label3369:
      if (!(paramViewGroup instanceof f)) {
        break label2031;
      }
      ag.f(localag).setBackgroundDrawable(null);
      String str1 = b;
      ag.f(localag).setImageBitmap(g.b(this.g));
      paramViewGroup = ((f)paramViewGroup).c();
      ag.o(localag).setVisibility(0);
      ag.o(localag).setText(paramViewGroup);
      ag.i(localag).setVisibility(8);
      ag.u(localag).setVisibility(8);
      ag.f(localag).setPadding(0, 0, af.a, af.b - 5);
      break label2031;
      label3472:
      ag.c(localag).setVisibility(4);
      break label2031;
      label3484:
      ag.A(localag).setChecked(false);
      break label2216;
      label3496:
      ag.B(localag).setProgress(paramView.a());
      continue;
      try
      {
        label3511:
        if ((!this.m) && (a(paramView, ag.g(localag)))) {
          ag.p(localag).setVisibility(8);
        }
        for (;;)
        {
          if (paramView.e() > 0) {
            break label3781;
          }
          ag.v(localag).setVisibility(0);
          if (!this.l) {
            break label3806;
          }
          ag.j(localag).setBackgroundResource(2130837541);
          ag.j(localag).setVisibility(0);
          ag.s(localag).setVisibility(0);
          ag.s(localag).setTag(paramView);
          ag.s(localag).setTag(2131361910, ag.g(localag));
          paramView = (Boolean)this.o.get(paramView);
          if ((paramView == null) || (paramView.booleanValue() != true)) {
            break label3794;
          }
          ag.s(localag).setChecked(true);
          ag.g(localag).setAlpha(85);
          ag.j(localag).setOnClickListener(new w(this, localag));
          ag.s(localag).setOnCheckedChangeListener(this.i);
          break;
          ag.p(localag).setVisibility(0);
          ag.p(localag).setText(paramView.k().trim() + "\nby:" + paramView.n().trim());
          ag.g(localag).setImageBitmap(g.a(this.g));
        }
      }
      catch (NullPointerException paramViewGroup)
      {
        for (;;)
        {
          ag.p(localag).setText(paramView.k());
          continue;
          label3781:
          ag.v(localag).setVisibility(8);
          continue;
          label3794:
          ag.s(localag).setChecked(false);
        }
        label3806:
        ag.j(localag).setBackgroundColor(Color.argb(0, 255, 255, 255));
        ag.s(localag).setVisibility(4);
      }
      continue;
      label3839:
      if ((paramView instanceof f))
      {
        ag.g(localag).setBackgroundDrawable(null);
        paramViewGroup = b;
        ag.g(localag).setImageBitmap(g.b(this.g));
        paramView = ((f)paramView).c();
        ag.p(localag).setVisibility(0);
        ag.p(localag).setText(paramView);
        ag.j(localag).setVisibility(8);
        ag.v(localag).setVisibility(8);
        ag.g(localag).setPadding(0, 0, af.a, af.b - 5);
        continue;
        label3941:
        ag.d(localag).setVisibility(4);
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\a\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */