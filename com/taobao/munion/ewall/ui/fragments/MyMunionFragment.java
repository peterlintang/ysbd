package com.taobao.munion.ewall.ui.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.taobao.munion.actionbar.b;
import com.taobao.munion.common.MunionConfigManager;
import com.taobao.munion.common.fragment.BaseFragment;
import com.taobao.munion.common.fragment.BaseFragment.OnFragmentFinishListener;
import com.taobao.munion.common.fragment.FragmentPageManager;
import com.taobao.munion.common.fragment.FragmentViewBase;
import com.taobao.munion.restool.a;
import com.taobao.munion.threadpool2.d;
import com.umeng.newxp.view.handler.utils.c;

public class MyMunionFragment
  extends BaseFragment
  implements BaseFragment.OnFragmentFinishListener
{
  ImageView avatar;
  TextView nick;
  
  private void logout()
  {
    new d(new MyMunionFragment.2(this), 1).b();
  }
  
  private void setContent()
  {
    getImageFetcher().a(MunionConfigManager.getInstance().getUserAvatar(), this.avatar);
    this.nick.setText(MunionConfigManager.getInstance().getUserName());
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.mMainView = ((FragmentViewBase)paramLayoutInflater.inflate(a.i("munion_my_munion"), null));
    paramLayoutInflater = new b(getActivity());
    this.mMainView.initActionBar("我的账号", paramLayoutInflater, null, null);
    this.avatar = ((ImageView)this.mMainView.findViewById(a.c("avatar")));
    this.nick = ((TextView)this.mMainView.findViewById(a.c("user_name")));
    setContent();
    ((Button)this.mMainView.findViewById(a.c("logout"))).setOnClickListener(new MyMunionFragment.1(this));
    return this.mMainView;
  }
  
  public void onFragmentResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt2 == -1)
    {
      switch (paramInt1)
      {
      default: 
        return;
      }
      setContent();
      return;
    }
    FragmentPageManager.getInstance().popToBack();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\ewall\ui\fragments\MyMunionFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */