package com.taobao.munion.ewall.ui.fragments;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.widget.AbsListView;
import android.widget.FrameLayout.LayoutParams;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.taobao.munion.common.fragment.BaseFragment;
import com.taobao.munion.model.a;
import com.taobao.munion.model.b;
import com.taobao.munion.requests.e;
import com.taobao.munion.utils.j;
import com.umeng.common.ufp.Log;
import com.umeng.newxp.Promoter;
import com.umeng.newxp.net.XpReportClient;
import com.umeng.newxp.net.m;
import com.umeng.newxp.net.m.a;
import com.umeng.newxp.view.handler.UMEWallPromoter;
import com.umeng.newxp.view.handler.ewall.RecyclingImageView;
import com.umeng.newxp.view.widget.pulltorefresh.PullToRefreshBase;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class EWallPageFragment
  extends BaseFragment
{
  private static final String TAG = EWallPageFragment.class.getCanonicalName();
  String KEY_BUNDLE_MAINBEAN = "bundle_main";
  String KEY_BUNDLE_TAB = "key_bundle_tab";
  volatile boolean isNoMore;
  AbsListView mAbsList;
  com.taobao.munion.model.c mEWallTabBean;
  View mErrorPage;
  View mFootView;
  EWallPageFragment.ImageAdapter mImageAdapter;
  private boolean mIsRunning;
  View mPageLoadView;
  EWallMainFragment mParent;
  PullToRefreshBase mPullToREfreshView;
  View mRetryButton;
  View mRoot;
  volatile boolean startService;
  
  private void adapterChanged(List<a> paramList, boolean paramBoolean)
  {
    if (paramList != null)
    {
      try
      {
        if (paramList.size() <= 0) {
          break label119;
        }
        if (this.mImageAdapter == null)
        {
          if ("itemlist".equals(this.mEWallTabBean.b())) {}
          for (this.mImageAdapter = new EWallPageFragment.GaiGaiImageAdapter(this, paramList, getImageFetcher(), RecyclingImageView.a);; this.mImageAdapter = new EWallPageFragment.WaterFallImageAdapter(this, paramList, getImageFetcher(), RecyclingImageView.a))
          {
            setAbsListViewAdapter(this.mImageAdapter);
            return;
          }
        }
        this.mImageAdapter.addPromoters(paramList, paramBoolean);
      }
      catch (Exception paramList)
      {
        paramList = TAG;
        this.mImageAdapter = null;
        onErrorView();
        return;
      }
      this.mImageAdapter.notifyDataSetChanged();
      return;
    }
    label119:
    if ((this.mImageAdapter == null) || (this.mImageAdapter.getCount() == 0))
    {
      this.mImageAdapter = null;
      onErrorView();
    }
  }
  
  private void loadPageContent()
  {
    List localList = this.mParent.sEWallMainBean.d();
    ArrayList localArrayList;
    if (localList != null)
    {
      localArrayList = new ArrayList();
      localArrayList.addAll(localList);
    }
    for (;;)
    {
      if ((this.mEWallTabBean.f() == 0) && (localArrayList != null))
      {
        adapterChanged(localArrayList, true);
        this.mParent.sEWallMainBean.e();
        this.mPageLoadView.setVisibility(8);
        this.startService = true;
        report();
        return;
      }
      if (!this.startService)
      {
        new EWallPageFragment.GetPageDataTask(this, true, false).loadHttpContent(new e(this.mParent.sEWallMainBean, this.mEWallTabBean));
        this.mPageLoadView.setVisibility(0);
        this.startService = true;
        return;
      }
      this.mPageLoadView.setVisibility(8);
      setAbsListViewAdapter(this.mImageAdapter);
      adapterChanged(null, false);
      return;
      localArrayList = null;
    }
  }
  
  public static EWallPageFragment newInstance(com.taobao.munion.model.c paramc, EWallMainFragment paramEWallMainFragment)
  {
    EWallPageFragment localEWallPageFragment = new EWallPageFragment();
    localEWallPageFragment.mParent = paramEWallMainFragment;
    localEWallPageFragment.mEWallTabBean = paramc;
    return localEWallPageFragment;
  }
  
  private void report()
  {
    m localm = new m.a(getActivity()).a(0).b(0).g(this.mParent.sEWallMainBean.c()).d(5).c(this.mParent.sEWallMainBean.f()).c(this.mEWallTabBean.g()).a((Promoter[])getPromoters(this.mParent.sEWallMainBean).toArray(new Promoter[0])).f(com.umeng.newxp.common.c.a(getActivity(), null)).a(this.mParent.sEWallMainBean.a()).a(this.mEWallTabBean.h(), this.mParent.sEWallMainBean.e).a();
    new XpReportClient(getActivity()).sendAsync(localm, null);
  }
  
  private void setAbsListViewAdapter(ListAdapter paramListAdapter)
  {
    if ((this.mAbsList instanceof ListView)) {
      ((ListView)this.mAbsList).setAdapter(this.mImageAdapter);
    }
    while (!(this.mAbsList instanceof GridView)) {
      return;
    }
    ((GridView)this.mAbsList).setAdapter(this.mImageAdapter);
  }
  
  public List<UMEWallPromoter> getPromoters(b paramb)
  {
    localArrayList = new ArrayList();
    try
    {
      if ((paramb.q != null) && (paramb.q.has("promoters")))
      {
        paramb = paramb.q.getJSONArray("promoters");
        int i = 0;
        while (i < paramb.length())
        {
          UMEWallPromoter localUMEWallPromoter = (UMEWallPromoter)Promoter.getPromoterFromJson((JSONObject)paramb.get(i), UMEWallPromoter.class);
          localUMEWallPromoter.slot_act_pams = this.mParent.sEWallMainBean.n;
          localArrayList.add(localUMEWallPromoter);
          i += 1;
        }
      }
      return localArrayList;
    }
    catch (Exception paramb)
    {
      Log.b(TAG, "", paramb);
    }
  }
  
  protected void loadNextPage()
  {
    this.mFootView.setVisibility(0);
    new EWallPageFragment.GetPageDataTask(this, false, false).loadHttpContent(new e(this.mParent.sEWallMainBean, this.mEWallTabBean));
  }
  
  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    loadPageContent();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (paramBundle != null)
    {
      this.mParent = ((EWallMainFragment)getParentFragment());
      this.mEWallTabBean = ((com.taobao.munion.model.c)j.a(paramBundle, this.KEY_BUNDLE_TAB));
      if (this.mEWallTabBean == null)
      {
        this.mEWallTabBean = new com.taobao.munion.model.c(paramBundle.getString("tab_keyword"));
        this.mEWallTabBean.a(paramBundle.getInt("tab_index"));
        this.mEWallTabBean.c(paramBundle.getString("tab_resourcetype"));
        this.mEWallTabBean.f(paramBundle.getString("tab_tabid"));
        this.mEWallTabBean.b(paramBundle.getString("tab_template"));
        this.mEWallTabBean.a(paramBundle.getString("tab_title"));
        this.mEWallTabBean.d(paramBundle.getString("tab_urpparams"));
      }
    }
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramBundle = getActivity();
    paramViewGroup = paramLayoutInflater.inflate(com.umeng.newxp.view.handler.ewall.c.H(paramBundle), paramViewGroup, false);
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(com.umeng.newxp.view.handler.ewall.c.w(paramBundle));
    if ("itemlist".equals(this.mEWallTabBean.b()))
    {
      paramLayoutInflater = View.inflate(getActivity(), com.umeng.newxp.view.handler.ewall.c.e(getActivity()), null);
      localViewGroup.addView(paramLayoutInflater, new ViewGroup.LayoutParams(-1, -1));
      ImageView localImageView = new ImageView(paramBundle);
      localImageView.setImageResource(com.umeng.newxp.view.handler.ewall.c.P(paramBundle));
      int i = paramBundle.getResources().getDimensionPixelSize(com.umeng.newxp.view.handler.ewall.c.S(paramBundle));
      FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(paramBundle.getResources().getDimensionPixelSize(com.umeng.newxp.view.handler.ewall.c.T(paramBundle)), i);
      localLayoutParams.rightMargin = paramBundle.getResources().getDimensionPixelSize(com.umeng.newxp.view.handler.ewall.c.Q(paramBundle));
      localLayoutParams.bottomMargin = paramBundle.getResources().getDimensionPixelSize(com.umeng.newxp.view.handler.ewall.c.Q(paramBundle));
      localLayoutParams.gravity = 85;
      localImageView.setLayoutParams(localLayoutParams);
      localImageView.setClickable(true);
      localImageView.setOnClickListener(new EWallPageFragment.1(this));
      localViewGroup.addView(localImageView, localLayoutParams);
      if (!(paramLayoutInflater instanceof PullToRefreshBase)) {
        break label376;
      }
      this.mPullToREfreshView = ((PullToRefreshBase)paramLayoutInflater);
      this.mAbsList = ((AbsListView)this.mPullToREfreshView.h());
      this.mPullToREfreshView.a(new EWallPageFragment.2(this));
    }
    for (;;)
    {
      this.mFootView = paramViewGroup.findViewById(com.umeng.newxp.view.handler.ewall.c.z(paramBundle));
      this.mPageLoadView = paramViewGroup.findViewById(com.umeng.newxp.view.handler.ewall.c.A(paramBundle));
      this.mRoot = paramViewGroup.findViewById(com.umeng.newxp.view.handler.ewall.c.B(paramBundle));
      this.mErrorPage = paramViewGroup.findViewById(com.umeng.newxp.view.handler.ewall.c.C(paramBundle));
      this.mRetryButton = paramViewGroup.findViewById(com.umeng.newxp.view.handler.ewall.c.D(paramBundle));
      this.mRetryButton.setOnClickListener(new EWallPageFragment.3(this));
      this.mAbsList.setOnScrollListener(new EWallPageFragment.4(this));
      this.mAbsList.getViewTreeObserver().addOnGlobalLayoutListener(new EWallPageFragment.5(this));
      return paramViewGroup;
      paramLayoutInflater = View.inflate(getActivity(), com.umeng.newxp.view.handler.ewall.c.c(getActivity()), null);
      break;
      label376:
      this.mAbsList = ((AbsListView)paramLayoutInflater);
    }
  }
  
  public void onErrorView()
  {
    if (getActivity() != null) {
      this.mErrorPage.setVisibility(0);
    }
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    j.a(paramBundle, this.KEY_BUNDLE_TAB, this.mEWallTabBean);
    paramBundle.putString("tab_keyword", this.mEWallTabBean.e());
    paramBundle.putString("tab_resourcetype", this.mEWallTabBean.c());
    paramBundle.putString("tab_tabid", this.mEWallTabBean.g());
    paramBundle.putString("tab_template", this.mEWallTabBean.b());
    paramBundle.putString("tab_title", this.mEWallTabBean.a());
    paramBundle.putString("tab_urpparams", this.mEWallTabBean.d());
    paramBundle.putInt("tab_index", this.mEWallTabBean.f());
    super.onSaveInstanceState(paramBundle);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\ewall\ui\fragments\EWallPageFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */