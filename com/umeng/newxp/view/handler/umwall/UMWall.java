package com.umeng.newxp.view.handler.umwall;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentManager.BackStackEntry;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.taobao.munion.common.MunionConfigManager;
import com.taobao.munion.common.MunionInitializer;
import com.taobao.munion.common.fragment.BaseFragment;
import com.taobao.munion.common.fragment.BaseFragment.OnFragmentFinishListener;
import com.taobao.munion.common.fragment.UMFragmentPageManager;
import com.taobao.munion.p4p.statistics.model.i;
import com.taobao.munion.p4p.statistics.model.j;
import com.taobao.munion.p4p.statistics.model.k;
import com.umeng.common.ufp.net.f;
import com.umeng.newxp.common.c;
import com.umeng.newxp.controller.ExchangeDataService;
import com.umeng.newxp.net.XpReportClient;
import com.umeng.newxp.net.m.a;
import com.umeng.newxp.view.handler.umwall.tab.TabPageIndicator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class UMWall
  extends FragmentActivity
  implements BaseFragment.OnFragmentFinishListener
{
  public static UMWall.ServiceZygote b;
  public static List<com.umeng.newxp.common.a> c;
  private static final String i = ",";
  private static final String j = UMWall.class.getCanonicalName();
  private static d.a k = d.a.a;
  private static ExchangeDataService p;
  FragmentManager a;
  d d;
  ViewPager e;
  View f;
  View g;
  public com.umeng.newxp.common.a h;
  private Context l;
  private ViewGroup m;
  private int n = 0;
  private ArrayList<String> o = new ArrayList();
  private BaseFragment q;
  
  private List<com.umeng.newxp.common.a> a(List<com.umeng.newxp.common.a> paramList)
  {
    ArrayList localArrayList = new ArrayList();
    if ((paramList != null) && (paramList.size() > 0))
    {
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        com.umeng.newxp.common.a locala = (com.umeng.newxp.common.a)paramList.next();
        if (locala != null) {
          localArrayList.add(locala);
        }
      }
    }
    return localArrayList;
  }
  
  private void a()
  {
    this.f.setVisibility(0);
    ExchangeDataService localExchangeDataService = b.fork();
    String str = j;
    localExchangeDataService.requestDataAsyn(this, new UMWall.2(this, localExchangeDataService), true);
  }
  
  private void a(int paramInt, com.umeng.newxp.common.a parama)
  {
    if ((parama != null) && (parama.d != null))
    {
      new StringBuilder("tab id ------------->>>>>>>>").append(parama.d).toString();
      this.o.add(parama.d.trim());
    }
    if (this.n != paramInt)
    {
      this.n = paramInt;
      com.taobao.munion.p4p.statistics.a.a().a(new i(""));
    }
  }
  
  private void b(List<com.umeng.newxp.common.a> paramList)
  {
    this.d.c();
    this.e = ((ViewPager)findViewById(UMWallRes.umeng_xp_ew_pager(this)));
    TabPageIndicator localTabPageIndicator = (TabPageIndicator)findViewById(UMWallRes.umeng_xp_ew_pageIndicator(this));
    this.e.setAdapter(new UMWall.ViewPagerAdapter(this, getSupportFragmentManager(), paramList));
    localTabPageIndicator.setViewPager(this.e);
    if ((paramList == null) || (paramList.size() < 2)) {
      localTabPageIndicator.setVisibility(8);
    }
    for (;;)
    {
      com.umeng.newxp.common.a locala = (com.umeng.newxp.common.a)paramList.get(0);
      this.h = ((com.umeng.newxp.common.a)paramList.get(0));
      updateSpecialAttr(locala);
      localTabPageIndicator.setOnPageChangeListener(new UMWall.3(this, paramList));
      return;
      localTabPageIndicator.setVisibility(0);
    }
  }
  
  private String[] b()
  {
    StringBuilder localStringBuilder1 = new StringBuilder();
    StringBuilder localStringBuilder2 = new StringBuilder();
    HashMap localHashMap = ((j)com.taobao.munion.p4p.statistics.a.a().b(2)).a();
    Iterator localIterator = localHashMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      String str = (String)localEntry.getKey();
      if ((this.o.size() > 0) && (this.o.contains(str)))
      {
        localStringBuilder1.append(str);
        localStringBuilder1.append(",");
        localStringBuilder2.append(((i)localEntry.getValue()).a());
        localStringBuilder2.append(",");
      }
    }
    if (localHashMap.size() > 0) {
      return new String[] { localStringBuilder1.toString().substring(0, localStringBuilder1.length() - 1), localStringBuilder2.toString().substring(0, localStringBuilder2.length() - 1) };
    }
    return null;
  }
  
  public static void start(Context paramContext, UMWall.ServiceZygote paramServiceZygote, List<com.umeng.newxp.common.a> paramList, d.a parama)
  {
    b = paramServiceZygote;
    c = paramList;
    k = parama;
    paramContext.startActivity(new Intent(paramContext, UMWall.class));
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    this.q = getActiveFragment();
    boolean bool1 = false;
    if (this.q != null) {
      bool1 = this.q.onKeyDown(paramKeyEvent.getKeyCode(), paramKeyEvent);
    }
    boolean bool2 = bool1;
    if (!bool1)
    {
      if ((4 != paramKeyEvent.getKeyCode()) || (paramKeyEvent.getAction() != 0)) {
        break label88;
      }
      if (UMFragmentPageManager.getInstance().canGoBackWithActivity())
      {
        staticBackEvent();
        this.d.b();
        bool2 = super.dispatchKeyEvent(paramKeyEvent);
      }
    }
    else
    {
      return bool2;
    }
    getSupportFragmentManager().popBackStack();
    return true;
    label88:
    return super.dispatchKeyEvent(paramKeyEvent);
  }
  
  public BaseFragment getActiveFragment()
  {
    FragmentManager localFragmentManager = getSupportFragmentManager();
    int i1 = localFragmentManager.getBackStackEntryCount();
    if (i1 > 0) {
      this.q = ((BaseFragment)localFragmentManager.findFragmentByTag(localFragmentManager.getBackStackEntryAt(i1 - 1).getName()));
    }
    return this.q;
  }
  
  public ExchangeDataService getTabExchangeDataService(int paramInt, com.umeng.newxp.common.a parama)
  {
    ExchangeDataService localExchangeDataService = b.fork(paramInt, parama);
    if (parama == null) {}
    for (parama = com.umeng.newxp.b.a;; parama = parama.e)
    {
      localExchangeDataService.resType = parama;
      return localExchangeDataService;
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if ((paramInt1 == 2199) && (paramInt2 == -1))
    {
      paramIntent = paramIntent.getStringArrayListExtra("android.speech.extra.RESULTS");
      if ((paramIntent != null) && (paramIntent.size() > 0))
      {
        paramIntent = ((String)paramIntent.get(0)).trim();
        if (TextUtils.isEmpty(paramIntent)) {
          break label165;
        }
        this.d.a(paramIntent);
      }
    }
    for (;;)
    {
      if ((9213 == paramInt1) && (-1 == paramInt2) && (this.e != null)) {
        paramInt1 = this.e.getCurrentItem();
      }
      try
      {
        paramIntent = (UMWallFragment)getSupportFragmentManager().findFragmentByTag("android:switcher:" + UMWallRes.umeng_xp_ew_pager(this) + ":" + paramInt1);
        if ((paramIntent != null) && (com.umeng.newxp.b.c == paramIntent.p.e))
        {
          updateSpecialAttr(paramIntent.p);
          paramIntent.a(true, true);
        }
        return;
      }
      catch (Exception paramIntent)
      {
        label165:
        paramIntent = j;
      }
      Toast.makeText(this, "无法识别输入内容哦，亲～", 0).show();
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.l = this;
    if (!MunionInitializer.isInitialized()) {
      MunionInitializer.initialize(getApplication());
    }
    if (b == null)
    {
      finish();
      return;
    }
    setContentView(UMWallRes.layout_umeng_xp_ew_main(this));
    com.taobao.munion.p4p.statistics.a.a().a(0);
    com.taobao.munion.p4p.statistics.a.a().a(1);
    paramBundle = new Bundle();
    paramBundle.putInt("view_width", com.umeng.common.ufp.b.b(this));
    paramBundle.putInt("view_height", com.umeng.common.ufp.b.c(this));
    com.taobao.munion.p4p.statistics.a.a().a(paramBundle);
    this.a = getSupportFragmentManager();
    UMFragmentPageManager.getInstance().setFragmentManager(this.a);
    this.m = ((ViewGroup)findViewById(UMWallRes.umeng_xp_ew_layout_content(this)));
    this.f = findViewById(UMWallRes.umeng_xp_preloading(this));
    this.g = findViewById(UMWallRes.umeng_xp_ew_error(this));
    this.g.findViewById(UMWallRes.umeng_xp_ew_error_btn(this)).setOnClickListener(new UMWall.1(this));
    ViewGroup localViewGroup = this.m;
    if (k == null) {}
    for (paramBundle = d.a.a;; paramBundle = k)
    {
      this.d = new d(localViewGroup, this, paramBundle);
      this.d.a(b.e);
      this.d.a();
      this.d.a(b);
      paramBundle = a(c);
      if ((paramBundle.size() == 1) && ((k == d.a.a) || (k == null))) {
        this.d.b(((com.umeng.newxp.common.a)paramBundle.get(0)).b);
      }
      if ((paramBundle == null) || (paramBundle.size() <= 0)) {
        break;
      }
      b(paramBundle);
      this.f.setVisibility(8);
      this.o.add(((com.umeng.newxp.common.a)paramBundle.get(0)).d);
      paramBundle = j;
      return;
    }
    a();
  }
  
  public void onFragmentResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if ((9213 == paramInt1) && (-1 == paramInt2) && (this.e != null)) {
      paramInt1 = this.e.getCurrentItem();
    }
    try
    {
      paramIntent = (UMWallFragment)getSupportFragmentManager().findFragmentByTag("android:switcher:" + UMWallRes.umeng_xp_ew_pager(this) + ":" + paramInt1);
      if ((paramIntent != null) && (com.umeng.newxp.b.c == paramIntent.p.e))
      {
        updateSpecialAttr(paramIntent.p);
        paramIntent.a(true, true);
      }
      return;
    }
    catch (Exception paramIntent)
    {
      paramIntent = j;
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public void staticBackEvent()
  {
    str2 = "";
    Object localObject1 = "";
    try
    {
      localObject2 = b();
      if (localObject2 != null)
      {
        str2 = localObject2[0];
        localObject1 = localObject2[1];
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject2;
        String str3;
        String str4;
        localException.printStackTrace();
        str2 = "";
        String str1 = "";
      }
    }
    new StringBuilder("Umeng tab data: ").append(str2).toString();
    new StringBuilder("Umeng spv data: ").append((String)localObject1).toString();
    if ((!TextUtils.isEmpty(str2)) && (!TextUtils.isEmpty((CharSequence)localObject1)))
    {
      localObject2 = (UMWallFragment)getSupportFragmentManager().findFragmentByTag("android:switcher:" + UMWallRes.umeng_xp_ew_pager(this) + ":0");
      str3 = ((UMWallFragment)localObject2).q.b.sessionId;
      str4 = ((UMWallFragment)localObject2).q.b.psid;
      if ((!TextUtils.isEmpty(str3)) && (!TextUtils.isEmpty(str4)))
      {
        localObject1 = new m.a(this).a(0).b(0).c(((UMWallFragment)localObject2).q.b.layoutType).d(9).d(str2).e((String)localObject1).a(((UMWallFragment)localObject2).q.b.slot_id).f(c.a(MunionConfigManager.getInstance().getContext(), null)).a(str3, str4).a();
        new XpReportClient(this).sendAsync((f)localObject1, null);
      }
    }
    com.taobao.munion.p4p.statistics.b.a().a(this, new k(1, 2));
    com.taobao.munion.p4p.statistics.a.a().a(2);
  }
  
  protected void updateSpecialAttr(com.umeng.newxp.common.a parama)
  {
    this.d.d();
    this.d.a(parama);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\handler\umwall\UMWall.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */