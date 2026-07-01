package com.taobao.munion.ewall.ui.fragments;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import com.taobao.munion.common.MunionConfigManager;
import com.taobao.munion.common.fragment.BaseFragment;
import com.taobao.munion.common.fragment.FragmentPageManager;
import com.taobao.munion.common.fragment.FragmentViewBase;
import com.taobao.munion.ewall.EWallContainerActivity;
import com.taobao.munion.p4p.statistics.a;
import com.taobao.munion.p4p.statistics.model.i;
import com.taobao.munion.p4p.statistics.model.k;
import com.taobao.munion.requests.d;
import com.umeng.common.ufp.net.f;
import com.umeng.newxp.controller.ExchangeDataService;
import com.umeng.newxp.net.XpReportClient;
import com.umeng.newxp.net.m.a;
import com.umeng.newxp.view.handler.ewall.TabPageIndicator;
import com.umeng.newxp.view.widget.KeyboardListenRelativeLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public class EWallMainFragment
  extends BaseFragment
{
  private static final String COMMA = ",";
  private static final int REQUEST_CODE = 2199;
  private static int tabIndex = 0;
  String KEY_BUNDLE_MAINBEAN = "bundle_main";
  String KEY_BUNDLE_TAB = "key_bundle_tab";
  View backButton;
  View curtainView;
  InputMethodManager imm;
  View logoLayout;
  Context mContext;
  Handler mHandler;
  int mKeyboardState;
  private JSONArray mTabsJsonArray;
  public ViewPager mViewPager;
  public com.taobao.munion.model.b sEWallMainBean;
  private List<com.taobao.munion.model.c> sTabBeans;
  View searchButton;
  FrameLayout searchContent;
  View searchDelete;
  EditText searchEdit;
  View searchLayout;
  View searchResultLayout;
  boolean searchState;
  TextView searchTv;
  private ArrayList<String> viewedTabId = new ArrayList();
  ImageButton voiceSearch;
  
  private void goBack()
  {
    if (this.mKeyboardState == -3)
    {
      this.imm.hideSoftInputFromWindow(getActivity().getWindow().peekDecorView().getWindowToken(), 0);
      switchTitleState(true);
      return;
    }
    if (this.searchLayout.getVisibility() == 0)
    {
      switchTitleState(true);
      return;
    }
    staticBackEvent();
    if (FragmentPageManager.getInstance().canGoBack())
    {
      FragmentPageManager.getInstance().popToBack();
      return;
    }
    getActivity().finish();
  }
  
  private void loadViewContent()
  {
    if ((this.sTabBeans == null) || (this.sTabBeans.size() == 0))
    {
      new EWallMainFragment.GetInitDataTask(this).loadHttpContent(new d(EWallContainerActivity.mExchangeDataService));
      return;
    }
    setupTabs();
  }
  
  private void sendInitPingback()
  {
    a.a().a(0);
    a.a().a(1);
    Bundle localBundle = new Bundle();
    localBundle.putInt("view_width", com.umeng.common.ufp.b.b(this.mContext));
    localBundle.putInt("view_height", com.umeng.common.ufp.b.c(this.mContext));
    a.a().a(localBundle);
    com.taobao.munion.p4p.statistics.b.a().a(this.mContext, new k(1, 1));
  }
  
  private void setTabsBean(JSONArray paramJSONArray)
  {
    this.mTabsJsonArray = paramJSONArray;
    this.sTabBeans = new ArrayList();
    int i = 0;
    while (i < paramJSONArray.length())
    {
      com.taobao.munion.model.c localc = new com.taobao.munion.model.c(paramJSONArray.getJSONObject(i), i);
      if (i == 0) {
        localc.g(this.sEWallMainBean.d);
      }
      this.sTabBeans.add(localc);
      i += 1;
    }
  }
  
  private void setupTabs()
  {
    this.mViewPager.setAdapter(new EWallMainFragment.ViewPagerAdapter(this, getChildFragmentManager(), this.sTabBeans));
    TabPageIndicator localTabPageIndicator = (TabPageIndicator)this.mMainView.findViewById(com.umeng.newxp.view.handler.ewall.c.y(this.mContext));
    this.viewedTabId.add(((com.taobao.munion.model.c)this.sTabBeans.get(0)).g());
    if ((this.sTabBeans == null) || (this.sTabBeans.size() < 2)) {
      localTabPageIndicator.setVisibility(8);
    }
    for (;;)
    {
      sendInitPingback();
      return;
      localTabPageIndicator.setViewPager(this.mViewPager);
      localTabPageIndicator.setVisibility(0);
      localTabPageIndicator.setOnPageChangeListener(new EWallMainFragment.7(this));
    }
  }
  
  private void setupUserDatasCollectorInfo()
  {
    if ((this.sEWallMainBean != null) && (this.sEWallMainBean.q != null))
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("psid", this.sEWallMainBean.e);
      localBundle.putString("tab_sid", this.sEWallMainBean.d);
      a.a().a(localBundle);
    }
  }
  
  private void staticBackEvent()
  {
    String str = "";
    Object localObject = "";
    try
    {
      String[] arrayOfString = wrapTabAdMAP();
      if (arrayOfString != null)
      {
        str = arrayOfString[0];
        localObject = arrayOfString[1];
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localException.printStackTrace();
      }
      localObject = new m.a(this.mContext).a(0).b(0).c(this.sEWallMainBean.f()).d(9).d(str).e((String)localObject).g(this.sEWallMainBean.c()).a(this.sEWallMainBean.a()).f(com.umeng.newxp.common.c.a(MunionConfigManager.getInstance().getContext(), null)).a(this.sEWallMainBean.d, this.sEWallMainBean.e).a();
      new XpReportClient(this.mContext).sendAsync((f)localObject, null);
      com.taobao.munion.p4p.statistics.b.a().a(this.mContext, new k(1, 2));
      a.a().a(2);
    }
    new StringBuilder("Umeng tab data: ").append(str).toString();
    new StringBuilder("Umeng spv data: ").append((String)localObject).toString();
    if (this.sEWallMainBean == null) {
      return;
    }
  }
  
  private void switchTitleState(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.logoLayout.setVisibility(0);
      this.searchLayout.setVisibility(8);
      this.curtainView.setVisibility(8);
      return;
    }
    this.logoLayout.setVisibility(8);
    this.searchLayout.setVisibility(0);
    this.curtainView.setVisibility(0);
    this.searchEdit.requestFocus();
    this.mHandler.postDelayed(new EWallMainFragment.8(this), 300L);
  }
  
  private void updateTabIndex(int paramInt, com.taobao.munion.model.c paramc)
  {
    if (tabIndex != paramInt)
    {
      tabIndex = paramInt;
      if ((paramc != null) && (paramc.g() != null)) {
        this.viewedTabId.add(paramc.g().trim());
      }
      if ((this.sTabBeans != null) && (this.sTabBeans.size() > paramInt)) {
        a.a().a(new i(((com.taobao.munion.model.c)this.sTabBeans.get(paramInt)).h()));
      }
    }
  }
  
  private String[] wrapTabAdMAP()
  {
    StringBuilder localStringBuilder1 = new StringBuilder();
    StringBuilder localStringBuilder2 = new StringBuilder();
    HashMap localHashMap = ((com.taobao.munion.p4p.statistics.model.j)a.a().b(2)).a();
    Iterator localIterator = localHashMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      String str = (String)localEntry.getKey();
      if ((this.viewedTabId.size() > 0) && (this.viewedTabId.contains(str)))
      {
        localStringBuilder1.append((String)localEntry.getKey());
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
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (paramBundle != null)
    {
      this.sEWallMainBean = ((com.taobao.munion.model.b)com.taobao.munion.utils.j.a(paramBundle, this.KEY_BUNDLE_MAINBEAN));
      this.sTabBeans = ((List)com.taobao.munion.utils.j.a(paramBundle, this.KEY_BUNDLE_TAB));
      if (this.sEWallMainBean == null)
      {
        this.sEWallMainBean = new com.taobao.munion.model.b(new JSONObject());
        this.sEWallMainBean.a(paramBundle.getString("slotid"));
        this.sEWallMainBean.b(paramBundle.getInt("layouttype"));
        this.sEWallMainBean.e = paramBundle.getString("psid");
        this.sEWallMainBean.n = paramBundle.getString("slot_act_pams");
      }
      if (this.sTabBeans == null)
      {
        paramBundle = paramBundle.getString("tabarray");
        if (paramBundle == null) {}
      }
    }
    try
    {
      setTabsBean(new JSONArray(paramBundle));
      return;
    }
    catch (Exception paramBundle)
    {
      paramBundle.printStackTrace();
    }
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.mContext = getActivity();
    this.mMainView = ((FragmentViewBase)paramLayoutInflater.cloneInContext(new ContextThemeWrapper(getActivity(), com.umeng.newxp.view.handler.ewall.c.W(getActivity()))).inflate(com.umeng.newxp.view.handler.ewall.c.b(this.mContext), null));
    this.mHandler = new Handler();
    this.imm = ((InputMethodManager)this.mContext.getSystemService("input_method"));
    this.logoLayout = this.mMainView.findViewById(com.umeng.newxp.view.handler.ewall.c.h(this.mContext));
    this.searchLayout = this.mMainView.findViewById(com.umeng.newxp.view.handler.ewall.c.i(this.mContext));
    this.curtainView = this.mMainView.findViewById(com.umeng.newxp.view.handler.ewall.c.j(this.mContext));
    this.searchContent = ((FrameLayout)this.mMainView.findViewById(com.umeng.newxp.view.handler.ewall.c.k(this.mContext)));
    this.searchResultLayout = this.mMainView.findViewById(com.umeng.newxp.view.handler.ewall.c.l(this.mContext));
    this.searchTv = ((TextView)this.mMainView.findViewById(com.umeng.newxp.view.handler.ewall.c.m(this.mContext)));
    this.searchDelete = this.mMainView.findViewById(com.umeng.newxp.view.handler.ewall.c.o(this.mContext));
    this.voiceSearch = ((ImageButton)this.mMainView.findViewById(com.umeng.newxp.view.handler.ewall.c.p(this.mContext)));
    this.voiceSearch.setImageResource(com.umeng.newxp.view.handler.ewall.c.O(this.mContext));
    this.searchState = false;
    this.voiceSearch.setOnClickListener(new EWallMainFragment.1(this));
    this.searchDelete.setOnClickListener(new EWallMainFragment.2(this));
    ((KeyboardListenRelativeLayout)this.mMainView.findViewById(com.umeng.newxp.view.handler.ewall.c.u(this.mContext))).a(new EWallMainFragment.3(this));
    this.searchButton = this.mMainView.findViewById(com.umeng.newxp.view.handler.ewall.c.q(this.mContext));
    this.searchEdit = ((EditText)this.mMainView.findViewById(com.umeng.newxp.view.handler.ewall.c.r(this.mContext)));
    this.searchEdit.setRawInputType(1);
    this.searchEdit.setImeOptions(2);
    this.searchEdit.setOnEditorActionListener(new EWallMainFragment.4(this));
    this.backButton = this.mMainView.findViewById(com.umeng.newxp.view.handler.ewall.c.s(this.mContext));
    this.backButton.setOnClickListener(new EWallMainFragment.5(this));
    this.searchButton.setOnClickListener(new EWallMainFragment.6(this));
    this.mViewPager = ((ViewPager)this.mMainView.findViewById(com.umeng.newxp.view.handler.ewall.c.t(this.mContext)));
    loadViewContent();
    return this.mMainView;
  }
  
  public void onDestroy()
  {
    this.sEWallMainBean = null;
    this.sTabBeans = null;
    super.onDestroy();
  }
  
  public void onDestroyView()
  {
    staticBackEvent();
    super.onDestroyView();
  }
  
  protected void onRetry()
  {
    super.onRetry();
    loadViewContent();
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    com.taobao.munion.utils.j.a(paramBundle, this.KEY_BUNDLE_MAINBEAN, this.sEWallMainBean);
    com.taobao.munion.utils.j.a(paramBundle, this.KEY_BUNDLE_TAB, this.sTabBeans);
    paramBundle.putString("psid", this.sEWallMainBean.e);
    paramBundle.putString("slotid", this.sEWallMainBean.a());
    paramBundle.putString("slot_act_pams", this.sEWallMainBean.n);
    paramBundle.putInt("layouttype", this.sEWallMainBean.f());
    if (this.mTabsJsonArray != null) {
      paramBundle.putString("tabarray", this.mTabsJsonArray.toString());
    }
    super.onSaveInstanceState(paramBundle);
  }
  
  public void setDataService(ExchangeDataService paramExchangeDataService)
  {
    if (paramExchangeDataService != null)
    {
      this.sEWallMainBean = paramExchangeDataService.getEWallMainBean();
      setupUserDatasCollectorInfo();
      if ((this.sEWallMainBean == null) || (this.sEWallMainBean.q == null)) {}
    }
    try
    {
      paramExchangeDataService = this.sEWallMainBean.q.optJSONArray("tabs");
      if (paramExchangeDataService != null) {
        setTabsBean(paramExchangeDataService);
      }
    }
    catch (Exception paramExchangeDataService)
    {
      for (;;)
      {
        paramExchangeDataService.printStackTrace();
      }
    }
    this.sEWallMainBean.d = "";
  }
  
  public void showSearchResult(String paramString)
  {
    this.searchResultLayout.setVisibility(0);
    switchTitleState(true);
    if (this.mKeyboardState == -3) {
      this.imm.hideSoftInputFromWindow(getActivity().getWindow().peekDecorView().getWindowToken(), 0);
    }
    this.searchTv.setText(paramString);
    this.searchContent.removeAllViews();
    FragmentTransaction localFragmentTransaction = getChildFragmentManager().beginTransaction();
    paramString = EWallPageFragment.newInstance(new com.taobao.munion.model.c(paramString), this);
    localFragmentTransaction.add(com.umeng.newxp.view.handler.ewall.c.k(this.mContext), paramString);
    localFragmentTransaction.commitAllowingStateLoss();
    this.searchEdit.setText("");
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\ewall\ui\fragments\EWallMainFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */