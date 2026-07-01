package com.umeng.newxp.view.handler.umwall;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.widget.AbsListView;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.taobao.munion.p4p.statistics.model.k;
import com.umeng.common.ufp.Log;
import com.umeng.newxp.Promoter;
import com.umeng.newxp.controller.ExchangeDataService;
import com.umeng.newxp.view.handler.utils.b.a;
import com.umeng.newxp.view.widget.pulltorefresh.PullToRefreshBase;
import java.util.List;

public class UMWallFragment
  extends Fragment
{
  private static final String B = UMWallFragment.class.getCanonicalName();
  static String r = "key_bundle_category";
  static String s = "key_bundle_index";
  static String t = "key_bundle_s_appkey";
  static String u = "key_bundle_s_slot";
  static String v = "key_bundle_s_pid";
  static String w = "key_bundle_s_layout_type";
  static String x = "key_bundle_s_uid";
  static String y = "key_bundle_s_landing_type";
  static String z = "key_bundle_s_actparams";
  FragmentActivity A;
  private boolean C;
  a a;
  AbsListView b;
  View c;
  View d;
  View e;
  View f;
  volatile boolean g;
  volatile boolean h;
  volatile boolean i;
  volatile boolean j;
  com.umeng.newxp.view.handler.utils.c k;
  PullToRefreshBase l;
  String m;
  ExchangeDataService n;
  int o = -1;
  com.umeng.newxp.common.a p;
  e q;
  
  private ExchangeDataService a(Bundle paramBundle, com.umeng.newxp.c paramc, com.umeng.newxp.b paramb)
  {
    String str = paramBundle.getString(v);
    paramc = new UMWallFragment.2(this, paramb, paramc, str);
    paramc.appkey = paramBundle.getString(t);
    paramc.slot_id = paramBundle.getString(u);
    paramc.psid = str;
    paramc.layoutType = paramBundle.getInt(w, -1);
    paramc.setCreditUID(paramBundle.getString(x));
    paramc.setLandingType(paramBundle.getInt(y, 0));
    paramc.slot_act_params = paramBundle.getString(z);
    return paramc;
  }
  
  private void a(ListAdapter paramListAdapter)
  {
    if ((this.b instanceof ListView)) {
      ((ListView)this.b).setAdapter(this.a);
    }
    while (!(this.b instanceof GridView)) {
      return;
    }
    ((GridView)this.b).setAdapter(this.a);
  }
  
  private void a(String paramString1, String paramString2)
  {
    try
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("psid", paramString1);
      localBundle.putString("tab_sid", paramString2);
      if (this.C)
      {
        this.C = false;
        com.taobao.munion.p4p.statistics.a.a().a(localBundle);
        com.taobao.munion.p4p.statistics.b.a().a(this.A, new k(1, 1));
      }
      return;
    }
    finally
    {
      paramString1 = finally;
      throw paramString1;
    }
  }
  
  private void a(List<Promoter> paramList, boolean paramBoolean)
  {
    Object localObject = B;
    localObject = new StringBuilder().append(this.m).append("  UMWallFragment adapterChanged ");
    int i1;
    if (this.a == null)
    {
      i1 = 0;
      ((StringBuilder)localObject).append(i1).toString();
      if (paramList == null) {
        break label167;
      }
    }
    label167:
    while ((this.a != null) && (this.a.getCount() != 0)) {
      try
      {
        if (paramList.size() > 0)
        {
          if (this.a == null)
          {
            this.a = new a(this.A, paramList, this.k);
            this.a.a(this.p);
            this.a.a(this.q.a());
            a(this.a);
            return;
            i1 = this.a.getCount();
            break;
          }
          this.a.a(paramList, paramBoolean);
          this.a.notifyDataSetChanged();
          return;
        }
      }
      catch (Exception paramList)
      {
        Log.e(B, "", paramList);
        this.a = null;
        onErrorView();
        return;
      }
    }
    this.a = null;
    onErrorView();
  }
  
  private int c()
  {
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    this.A.getWindowManager().getDefaultDisplay().getMetrics(localDisplayMetrics);
    if (com.umeng.newxp.b.b == this.p.e) {
      return localDisplayMetrics.widthPixels / 2;
    }
    if (com.umeng.newxp.b.c == this.p.e) {
      return localDisplayMetrics.widthPixels / 3;
    }
    return 0;
  }
  
  public static UMWallFragment newInstance(ExchangeDataService paramExchangeDataService, com.umeng.newxp.common.a parama, int paramInt)
  {
    UMWallFragment localUMWallFragment = new UMWallFragment();
    localUMWallFragment.m = parama.b;
    localUMWallFragment.p = parama;
    localUMWallFragment.n = paramExchangeDataService;
    localUMWallFragment.o = paramInt;
    paramExchangeDataService = B;
    new StringBuilder().append(localUMWallFragment.n.getKeywords()).append("  UMWallFragment newInstance ").append(localUMWallFragment.n.getKeywords()).toString();
    return localUMWallFragment;
  }
  
  protected void a()
  {
    this.g = true;
    this.c.setVisibility(0);
    this.q.a(false, true);
  }
  
  protected void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean2) {
      this.d.setVisibility(0);
    }
    this.h = false;
    this.g = true;
    this.j = false;
    this.q.a(true, paramBoolean1);
    this.b.setSelection(0);
    this.f.setVisibility(8);
  }
  
  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    paramBundle = B;
    new StringBuilder().append(this.m).append("  UMWallFragment onActivityCreated.").toString();
    if (!this.i)
    {
      a(false, true);
      this.i = true;
      return;
    }
    this.d.setVisibility(8);
    a(this.a);
    a(null, false);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Object localObject = B;
    new StringBuilder().append(this.m).append("  UMWallFragment onCreate.").toString();
    this.C = true;
    if (paramBundle != null)
    {
      this.p = ((com.umeng.newxp.common.a)paramBundle.getParcelable(r));
      this.n = a(paramBundle, this.p.f, this.p.e);
      this.o = paramBundle.getInt(s, -1);
      this.n.urlParams = this.p.a;
    }
    this.g = false;
    this.h = false;
    this.i = false;
    this.j = false;
    if ((this.n == null) || (this.p == null))
    {
      paramBundle = B;
      localObject = new StringBuilder("IllegalArgumentException ExchangeDataService[");
      if (this.n != null) {
        break label327;
      }
      paramBundle = "null";
      localObject = ((StringBuilder)localObject).append(paramBundle).append("]  Category[");
      if (this.p != null) {
        break label334;
      }
    }
    label327:
    label334:
    for (paramBundle = "null";; paramBundle = "normal")
    {
      ((StringBuilder)localObject).append(paramBundle).append("]").toString();
      getActivity().finish();
      this.n.template = this.p.f;
      this.n.resType = this.p.e;
      this.A = getActivity();
      this.q = new UMWallFragment.1(this, this.A, this.n, this.p);
      this.k = new com.umeng.newxp.view.handler.utils.c(this.A, c());
      paramBundle = new b.a(this.A, "thumbs");
      paramBundle.a(0.15F);
      this.k.a(this.A.getSupportFragmentManager(), paramBundle);
      return;
      paramBundle = "normal";
      break;
    }
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramBundle = B;
    new StringBuilder().append(this.m).append("  UMWallFragment onCreateView.").toString();
    paramBundle = this.A;
    paramLayoutInflater = paramLayoutInflater.inflate(UMWallRes.layout_umeng_xp_ew_fragment(paramBundle), paramViewGroup, false);
    paramViewGroup = (ViewGroup)paramLayoutInflater.findViewById(UMWallRes.umeng_xp_ew_content_frame(paramBundle));
    View localView = b.a(this.A, this.p.f);
    paramViewGroup.addView(localView, new ViewGroup.LayoutParams(-1, -1));
    if ((localView instanceof PullToRefreshBase))
    {
      this.l = ((PullToRefreshBase)localView);
      this.b = ((AbsListView)this.l.h());
      this.l.a(new UMWallFragment.3(this));
    }
    for (;;)
    {
      this.c = paramLayoutInflater.findViewById(UMWallRes.umeng_xp_ew_footview(paramBundle));
      this.d = paramLayoutInflater.findViewById(UMWallRes.umeng_xp_ew_page_loading(paramBundle));
      this.e = paramLayoutInflater.findViewById(UMWallRes.umeng_xp_ew_root(paramBundle));
      this.f = paramLayoutInflater.findViewById(UMWallRes.umeng_xp_ew_error(paramBundle));
      this.f.setOnClickListener(new UMWallFragment.4(this));
      this.b.setOnScrollListener(new UMWallFragment.5(this));
      return paramLayoutInflater;
      this.b = ((AbsListView)localView);
    }
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    String str = B;
    new StringBuilder().append(this.m).append("  UMWallFragment onDestroy.").toString();
    this.k.i();
  }
  
  public void onDestroyView()
  {
    super.onDestroyView();
    String str = B;
    new StringBuilder().append(this.m).append("  UMWallFragment onDestroyView.").toString();
  }
  
  public void onErrorView()
  {
    if (getActivity() != null) {
      this.f.setVisibility(0);
    }
  }
  
  public void onPause()
  {
    super.onPause();
    this.k.c(false);
    this.k.b(true);
    this.k.h();
  }
  
  public void onResume()
  {
    super.onResume();
    String str = B;
    new StringBuilder().append(this.m).append("  UMWallFragment onResume.").toString();
    this.k.b(false);
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString(t, this.n.appkey);
    localBundle.putString(u, this.n.slot_id);
    localBundle.putString(v, this.n.psid);
    localBundle.putInt(w, this.n.layoutType);
    localBundle.putString(x, this.n.getCreditUID());
    localBundle.putInt(y, this.n.layoutType);
    localBundle.putString(z, this.n.slot_act_params);
    paramBundle.putAll(localBundle);
    paramBundle.putParcelable(r, this.p);
    paramBundle.putInt(s, this.o);
    super.onSaveInstanceState(paramBundle);
  }
  
  public void onStop()
  {
    super.onStop();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\handler\umwall\UMWallFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */