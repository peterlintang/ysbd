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
import android.widget.RelativeLayout.LayoutParams;
import android.widget.Toast;
import com.taobao.munion.common.MunionConfigManager;
import com.taobao.munion.model.d;
import com.taobao.munion.requests.i;
import com.taobao.munion.restool.a;
import com.taobao.munion.utils.l;
import java.util.LinkedHashSet;

public class FavSyncFragment
  extends FavListCommonFragment
{
  boolean isRefreshInOnResume = false;
  private boolean loading = false;
  
  private boolean JudgeShowLoginInErrorPage()
  {
    boolean bool = false;
    if (l.b(MunionConfigManager.getInstance().getUserName()))
    {
      setFailedStatus(getString(a.k("munion_label_list_no_login_title")), getString(a.k("munion_label_list_no_login_sub_title")), false, -1.0F);
      resetList();
      bool = true;
    }
    return bool;
  }
  
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
    this.isSync = d.k;
    this.mBottomSyncButton.setVisibility(8);
    RelativeLayout.LayoutParams localLayoutParams = (RelativeLayout.LayoutParams)this.mBottomDeleteButton.getLayoutParams();
    localLayoutParams.rightMargin = getResources().getDimensionPixelSize(a.f("munion_label_bottom_bar_sync_margin_right"));
    localLayoutParams.addRule(11);
    this.mBottomDeleteButton.setLayoutParams(localLayoutParams);
  }
  
  private void resetList()
  {
    this.mListView.setAdapter(null);
    this.mList = null;
    this.mAdapter = null;
    this.mTaobaoAnimationAdapter = null;
  }
  
  public void getList()
  {
    if (!JudgeShowLoginInErrorPage())
    {
      if (this.isRefreshInOnResume)
      {
        refreshList();
        this.isRefreshInOnResume = false;
      }
    }
    else {
      return;
    }
    if (this.mList == null)
    {
      loadMore(this.mCurrentPage);
      return;
    }
    this.mListView.setSelectionFromTop(this.mPosition, this.mFirstItemTop);
  }
  
  protected void loadMore(int paramInt)
  {
    setFooterView();
    this.mCurrentPage = paramInt;
    requestList(paramInt, this.isSync);
  }
  
  public void onChildFragmentResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    getList();
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = super.onCreateView(paramLayoutInflater, paramViewGroup, paramBundle);
    init();
    return paramLayoutInflater;
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
    this.mGetGoodsListRequest = new i(paramInt1, paramInt2, "modified_time");
    new FavSyncFragment.SyncRequestListTask(this, this).loadHttpContent(this.mGetGoodsListRequest);
  }
  
  protected void switchBottomButtonState(FavListCommonFragment.BottomButtonState paramBottomButtonState)
  {
    this.currentState = paramBottomButtonState;
    FavGroupFragment localFavGroupFragment = (FavGroupFragment)getParentFragment();
    switch (FavSyncFragment.1.$SwitchMap$com$taobao$munion$ewall$ui$fragments$FavListCommonFragment$BottomButtonState[paramBottomButtonState.ordinal()])
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
      this.mBottomSyncButton.setVisibility(8);
      recoverSlidDelete();
      return;
    }
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
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\ewall\ui\fragments\FavSyncFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */