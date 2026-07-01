package com.taobao.munion.ewall.ui.fragments;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.Toast;
import com.taobao.munion.actionbar.ActionBar.b;
import com.taobao.munion.common.MunionConfigManager;
import com.taobao.munion.common.fragment.BaseFragment;
import com.taobao.munion.common.fragment.FragmentPageManager;
import com.taobao.munion.common.fragment.FragmentViewBase;
import com.taobao.munion.ewall.actorframework.ActorBinder;
import com.taobao.munion.model.d;
import com.taobao.munion.model.f;
import com.taobao.munion.requests.c;
import com.taobao.munion.requests.h;
import com.taobao.munion.utils.l;
import com.taobao.munion.webview.MunionWebview;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;

public class GoodsDetailFragment
  extends BaseFragment
{
  public static final String DIRECT_WEBVIEW_LOAD = "direct_webview_load";
  public static final String GOODS_ID = "goods_id";
  public static final String GOODS_URL = "goods_url";
  public static final String HIDDEN_FAV_BAR = "hidden_fav_bar";
  private LayoutInflater inflater;
  private boolean isFav;
  private com.taobao.munion.requests.a mAddFavoriteRequest;
  private int mBottomMargin = 0;
  private c mDeleteFavoriteRequest;
  private boolean mDirectWebviewLoad;
  private ImageButton mFavBoxButton;
  private h mGetGoodsDetailRequest;
  private View mGoodsBottomBorder;
  private d mGoodsDetailBean;
  private GoodsDetailFragment.GoodsDetailWebViewClient mGoodsDetailClient;
  private MunionWebview mGoodsDetailWebview;
  private ImageButton mGoodsFavButton;
  private String mGoodsId;
  private String mGoodsUrl;
  private boolean mHiddenFav;
  private Toast mToast;
  private GoodsDetailFragment.ToggleFavRequest mToggleFavRequest;
  private ArrayList<f> tagList;
  
  private String addTtid(String paramString)
  {
    String str = MunionConfigManager.sTtid;
    if (l.b(str)) {
      return paramString;
    }
    try
    {
      if (paramString.contains("?")) {
        return paramString + "&ttid=" + URLEncoder.encode(str, "UTF-8");
      }
      str = paramString + "?ttid=" + URLEncoder.encode(str, "UTF-8");
      return str;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      com.taobao.munion.utils.k.b(localUnsupportedEncodingException.toString());
    }
    return paramString;
  }
  
  private void hideBottomBar()
  {
    this.mFavBoxButton.setVisibility(4);
    this.mGoodsFavButton.setVisibility(4);
    RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)this.mGoodsDetailWebview.getLayoutParams();
    localLayoutParams.bottomMargin = 0;
    this.mGoodsDetailWebview.setLayoutParams(localLayoutParams);
    this.mGoodsBottomBorder.setVisibility(4);
  }
  
  private void init()
  {
    this.mGoodsDetailWebview = ((MunionWebview)this.mMainView.findViewById(com.taobao.munion.restool.a.c("goods_main_detail")));
    this.mGoodsDetailClient = new GoodsDetailFragment.GoodsDetailWebViewClient(this);
    this.mGoodsDetailWebview.setWebViewClient(this.mGoodsDetailClient);
    this.mGoodsBottomBorder = this.mMainView.findViewById(com.taobao.munion.restool.a.c("goods_bottom_boder"));
    this.mGoodsDetailWebview.a(new GoodsDetailFragment.2(this));
    this.mFavBoxButton = ((ImageButton)this.mMainView.findViewById(com.taobao.munion.restool.a.c("love_taobao_btn")));
    this.mGoodsFavButton = ((ImageButton)this.mMainView.findViewById(com.taobao.munion.restool.a.c("goods_fav_button")));
    this.mBottomMargin = getResources().getDimensionPixelSize(com.taobao.munion.restool.a.f("munion_bottom_goods_webview_margin_bottom"));
    if (this.mHiddenFav) {
      hideBottomBar();
    }
    for (;;)
    {
      localObject = new com.taobao.munion.actionbar.b(getActivity());
      this.mMainView.initActionBar("手机淘宝", (ActionBar.b)localObject, null, null);
      if (l.b(this.mGoodsUrl)) {
        break label236;
      }
      if (!this.mDirectWebviewLoad) {
        break;
      }
      this.mGoodsDetailWebview.loadUrl(this.mGoodsUrl);
      return;
      this.mFavBoxButton.setOnClickListener(this);
      this.mGoodsFavButton.setOnClickListener(this);
    }
    Object localObject = new com.taobao.munion.requests.b(this.mGoodsUrl);
    new GoodsDetailFragment.ClickRequestTask(this, this).loadHttpContent((com.taobao.munion.net.k)localObject);
    return;
    label236:
    stopFailedStatus();
  }
  
  private void notifyMsg(String paramString)
  {
    if (this.mToast == null) {
      this.mToast = Toast.makeText(getActivity(), paramString, 0);
    }
    for (;;)
    {
      this.mToast.show();
      return;
      this.mToast.setText(paramString);
    }
  }
  
  private void receiveData()
  {
    Bundle localBundle = getArguments();
    if (localBundle.containsKey("goods_url")) {
      this.mGoodsUrl = localBundle.getString("goods_url");
    }
    if (localBundle.containsKey("goods_id"))
    {
      String str = localBundle.getString("goods_id");
      if ((str != null) && (!"".equals(str))) {
        this.mGoodsId = str.substring(str.indexOf("_") + 1);
      }
    }
    if (localBundle.containsKey("hidden_fav_bar")) {
      this.mHiddenFav = localBundle.getBoolean("hidden_fav_bar", false);
    }
    this.mDirectWebviewLoad = localBundle.getBoolean("direct_webview_load", false);
    this.mGetGoodsDetailRequest = new h(this.mGoodsId);
  }
  
  private void sendRequestSyncFavStatus()
  {
    this.mGetGoodsDetailRequest = new h(this.mGoodsId);
    new GoodsDetailFragment.SyncFavStatesRequest(this, this).loadHttpContent(this.mGetGoodsDetailRequest);
  }
  
  private void setupBottomBar(String paramString)
  {
    if ((paramString != null) && (paramString.contains(this.mGoodsId)))
    {
      showBottomBar();
      return;
    }
    hideBottomBar();
  }
  
  private void showBottomBar()
  {
    if (this.mHiddenFav) {
      return;
    }
    RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)this.mGoodsDetailWebview.getLayoutParams();
    localLayoutParams.bottomMargin = this.mBottomMargin;
    this.mGoodsDetailWebview.setLayoutParams(localLayoutParams);
    this.mFavBoxButton.setVisibility(0);
    this.mGoodsFavButton.setVisibility(0);
    this.mGoodsBottomBorder.setVisibility(0);
  }
  
  private void toggleFavStatus()
  {
    if (this.mToggleFavRequest == null) {
      this.mToggleFavRequest = new GoodsDetailFragment.ToggleFavRequest(this, this);
    }
    if (this.isFav)
    {
      this.mDeleteFavoriteRequest = new c(this.mGoodsId);
      this.mToggleFavRequest.loadHttpContent(this.mDeleteFavoriteRequest);
      return;
    }
    this.mAddFavoriteRequest = new com.taobao.munion.requests.a(this.mGoodsId);
    this.mToggleFavRequest.loadHttpContent(this.mAddFavoriteRequest);
  }
  
  protected ActorBinder createActorBinderDelegate()
  {
    return new ActorBinder();
  }
  
  public void hiddenErrorView()
  {
    stopFailedStatus();
  }
  
  public void onClick(View paramView)
  {
    super.onClick(paramView);
    int i = paramView.getId();
    if (i == com.taobao.munion.restool.a.c("goods_fav_button")) {
      toggleFavStatus();
    }
    while (i != com.taobao.munion.restool.a.c("love_taobao_btn")) {
      return;
    }
    FragmentPageManager.getInstance().pushPage(FavGroupFragment.class.getName());
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    getFragmentManager().addOnBackStackChangedListener(new GoodsDetailFragment.1(this));
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    com.taobao.munion.utils.k.a("oncreate view");
    this.mMainView = ((FragmentViewBase)paramLayoutInflater.inflate(com.taobao.munion.restool.a.i("munion_goods_detail"), null));
    receiveData();
    init();
    return this.mMainView;
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    com.taobao.munion.utils.k.a("onDestory in goodsdetail");
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (this.mGoodsDetailWebview != null) && (this.mGoodsDetailWebview.canGoBack()))
    {
      this.mGoodsDetailWebview.goBack();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public void onPause()
  {
    super.onPause();
    com.taobao.munion.utils.k.a("onPause in goodsdetail");
  }
  
  public void onResume()
  {
    super.onResume();
    com.taobao.munion.utils.k.a("onResume in goodsdetail");
    this.mGoodsDetailBean = null;
    sendRequestSyncFavStatus();
  }
  
  public void onRetry()
  {
    com.taobao.munion.requests.b localb = new com.taobao.munion.requests.b(this.mGoodsUrl);
    new GoodsDetailFragment.ClickRequestTask(this, this).loadHttpContent(localb);
    super.onRetry();
  }
  
  public void showErrorView()
  {
    setDefaultFailedStatus(getResources().getDimensionPixelSize(com.taobao.munion.restool.a.f("munion_actionbar_height")));
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\ewall\ui\fragments\GoodsDetailFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */