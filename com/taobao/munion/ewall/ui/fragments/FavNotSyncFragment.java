package com.taobao.munion.ewall.ui.fragments;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.taobao.munion.animationadapter.b;
import com.taobao.munion.common.MunionConfigManager;
import com.taobao.munion.common.fragment.FragmentPageManager;
import com.taobao.munion.model.d;
import com.taobao.munion.requests.i;
import com.taobao.munion.restool.a;
import com.taobao.munion.utils.k;
import com.taobao.munion.utils.l;
import java.util.LinkedHashSet;

public class FavNotSyncFragment
  extends FavListCommonFragment
{
  private boolean loading = false;
  
  private void doError()
  {
    finishLoading();
    if (this.mCurrentPage > 0)
    {
      this.mCurrentPage -= 1;
      Toast.makeText(getActivity(), "加载失败", 0).show();
      return;
    }
    setDefaultFailedStatus(getResources().getDimensionPixelSize(a.f("munion_label_error_margin_top")));
    stopLoadingStatus();
  }
  
  private void finishLoading()
  {
    removeFooterView();
    this.loading = false;
  }
  
  private void init()
  {
    this.isSync = d.l;
  }
  
  private void sendSyncRequest(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      Bundle localBundle = new Bundle();
      localBundle.putInt("pattern_type", 1);
      FragmentPageManager.getInstance().pushPageForResult(LockPatternFragment.class.getName(), 1, (FavGroupFragment)getParentFragment(), localBundle);
      return;
    }
    FragmentPageManager.getInstance().pushPageForResult(OauthFragment.class.getName(), 1, (FavGroupFragment)getParentFragment());
  }
  
  public void getList()
  {
    if (this.mList == null)
    {
      loadMore(this.mCurrentPage);
      return;
    }
    this.mListView.setSelectionFromTop(this.mPosition, this.mFirstItemTop);
  }
  
  protected void invokeSync()
  {
    String str = getItemsByCheckedId();
    if ((str == null) || ("".equals(str))) {
      return;
    }
    MunionConfigManager.getInstance().setItemIds(str);
    if (l.b(MunionConfigManager.getInstance().getUserName()))
    {
      sendSyncRequest(false);
      return;
    }
    sendSyncRequest(true);
  }
  
  protected void loadMore(int paramInt)
  {
    setFooterView();
    this.mCurrentPage = paramInt;
    requestList(paramInt, this.isSync);
  }
  
  protected void onChildFragmentResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt2 == -1) {
      switch (paramInt1)
      {
      }
    }
    do
    {
      boolean bool;
      do
      {
        return;
        bool = paramIntent.getBooleanExtra("verify_status", false);
      } while (!bool);
      k.a("verifyStatus = " + bool);
      stopLoadingStatus();
      if (this.mCurrentListViewState == FavListCommonFragment.ListViewState.notSyncList)
      {
        this.mTaobaoAnimationAdapter.a(this.mTempSelectedPositions);
        this.mSelectedPositions.clear();
      }
      switchBottomButtonState(FavListCommonFragment.BottomButtonState.normal);
      ((FavGroupFragment)getParentFragment()).refreshSyncList();
      return;
    } while (!paramIntent.getBooleanExtra("verify_status", false));
    ((FavGroupFragment)getParentFragment()).refreshSyncList();
  }
  
  public void onClick(View paramView)
  {
    super.onClick(paramView);
    if (paramView.getId() == a.c("label_detail_bottom_banner_button_sync_start")) {
      startSync();
    }
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.isSync = d.l;
    return super.onCreateView(paramLayoutInflater, paramViewGroup, paramBundle);
  }
  
  public void onHiddenChanged(boolean paramBoolean)
  {
    super.onHiddenChanged(paramBoolean);
    getList();
  }
  
  public void onResume()
  {
    super.onResume();
    getList();
  }
  
  public void onRetry()
  {
    super.onRetry();
    loadMore(this.mCurrentPage);
  }
  
  protected void refreshList()
  {
    this.mAdapter = null;
    this.mTaobaoAnimationAdapter = null;
    this.mCurrentPage = 0;
    this.mList = null;
    this.mListView.setAdapter(null);
    loadMore(this.mCurrentPage);
  }
  
  protected void requestList(int paramInt1, int paramInt2)
  {
    if (this.mCurrentPage <= 0) {
      startLoadingStatus(new boolean[] { true });
    }
    this.mGetGoodsListRequest = new i(paramInt1, paramInt2);
    new FavNotSyncFragment.NotSyncRequestListTask(this, this).loadHttpContent(this.mGetGoodsListRequest);
  }
  
  protected void startSync()
  {
    int i = 0;
    if (this.mSelectedPositions.size() == 0)
    {
      Toast.makeText(getActivity(), "请勾选需要同步的宝贝", 0).show();
      return;
    }
    if (this.mSelectedPositions.size() > 50) {
      i = 1;
    }
    if (i != 0)
    {
      makeDialog(3);
      return;
    }
    invokeSync();
  }
  
  protected void switchBottomButtonState(FavListCommonFragment.BottomButtonState paramBottomButtonState)
  {
    this.currentState = paramBottomButtonState;
    FavGroupFragment localFavGroupFragment = (FavGroupFragment)getParentFragment();
    switch (FavNotSyncFragment.1.$SwitchMap$com$taobao$munion$ewall$ui$fragments$FavListCommonFragment$BottomButtonState[paramBottomButtonState.ordinal()])
    {
    default: 
      return;
    case 1: 
      localFavGroupFragment.showRadioButtonAndHiddenSubTitle();
      toggleSelect(false);
      toggleMultiChooseMode(paramBottomButtonState);
      this.mBottomDeleteStartButton.setVisibility(4);
      this.mBottomSelectAllButton.setVisibility(4);
      this.mBottomSyncStartButton.setVisibility(4);
      this.mBottomDeleteButton.setVisibility(0);
      this.mBottomSyncButton.setVisibility(0);
      recoverSlidDelete();
      return;
    case 2: 
      if (this.mSelectedPositions != null) {
        this.mSelectedPositions.clear();
      }
      localFavGroupFragment.showRadioButtonAndHiddenSubTitle();
      toggleMultiChooseMode(paramBottomButtonState);
      this.mBottomDeleteStartButton.setVisibility(0);
      this.mBottomSelectAllButton.setVisibility(0);
      this.mBottomSyncStartButton.setVisibility(4);
      this.mBottomDeleteButton.setVisibility(4);
      this.mBottomSyncButton.setVisibility(4);
      removeSlidDelete();
      return;
    }
    if (this.mSelectedPositions != null) {
      this.mSelectedPositions.clear();
    }
    localFavGroupFragment.hiddenRadioButtonAndSetSubTitle();
    toggleMultiChooseMode(paramBottomButtonState);
    this.mBottomDeleteStartButton.setVisibility(4);
    this.mBottomSelectAllButton.setVisibility(0);
    this.mBottomSyncStartButton.setVisibility(0);
    this.mBottomDeleteButton.setVisibility(4);
    this.mBottomSyncButton.setVisibility(4);
    removeSlidDelete();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\ewall\ui\fragments\FavNotSyncFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */