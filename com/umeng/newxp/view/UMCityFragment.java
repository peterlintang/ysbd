package com.umeng.newxp.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.taobao.munion.common.fragment.BaseFragment;
import com.taobao.munion.common.fragment.FragmentViewBase;
import com.umeng.newxp.a.c;
import com.umeng.newxp.a.d;
import com.umeng.newxp.view.common.actionbar.ActionBar;
import com.umeng.newxp.view.common.actionbar.a;

public class UMCityFragment
  extends BaseFragment
{
  private UMCityView a;
  
  private void a()
  {
    ActionBar localActionBar = (ActionBar)this.mMainView.findViewById(c.ar(getActivity()));
    localActionBar.setLeftAction(new a(this));
    localActionBar.setTitle("选择城市");
    this.a = ((UMCityView)this.mMainView.findViewById(c.as(getActivity())));
    this.a.setFragment(this);
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.mMainView = ((FragmentViewBase)paramLayoutInflater.inflate(d.t(getActivity()), null));
    a();
    return this.mMainView;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\UMCityFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */