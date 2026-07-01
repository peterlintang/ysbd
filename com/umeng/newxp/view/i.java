package com.umeng.newxp.view;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.taobao.munion.common.fragment.BaseFragment;
import com.taobao.munion.common.fragment.FragmentViewBase;
import com.umeng.newxp.a.c;
import com.umeng.newxp.a.d;
import com.umeng.newxp.common.a;
import com.umeng.newxp.controller.ExchangeDataService;
import com.umeng.newxp.view.handler.umwall.UMWall.ServiceZygote;
import com.umeng.newxp.view.handler.umwall.UMWallFragment;
import com.umeng.newxp.view.widget.KeyboardListenRelativeLayout;

public class i
  extends BaseFragment
{
  public static UMWall.ServiceZygote a;
  public a b;
  FrameLayout c;
  int d;
  InputMethodManager e;
  private EditText f;
  private ImageView g;
  private TextView h;
  private TextView i;
  
  private void a()
  {
    Bundle localBundle = getArguments();
    if (localBundle.containsKey("category")) {
      this.b = ((a)localBundle.getParcelable("category"));
    }
  }
  
  public View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.mMainView = ((FragmentViewBase)paramLayoutInflater.inflate(d.u(getActivity()), null));
    this.e = ((InputMethodManager)getActivity().getSystemService("input_method"));
    ((KeyboardListenRelativeLayout)this.mMainView.findViewById(c.aD(getActivity()))).a(new i.1(this));
    this.f = ((EditText)this.mMainView.findViewById(c.ax(getActivity())));
    this.g = ((ImageView)this.mMainView.findViewById(c.ay(getActivity())));
    this.h = ((TextView)this.mMainView.findViewById(c.az(getActivity())));
    this.i = ((TextView)this.mMainView.findViewById(c.aA(getActivity())));
    this.c = ((FrameLayout)this.mMainView.findViewById(c.aB(getActivity())));
    this.g.setOnClickListener(new i.2(this));
    this.h.setOnClickListener(new i.3(this));
    if (this.f != null)
    {
      this.f.setRawInputType(1);
      this.f.setImeOptions(2);
      this.f.setOnEditorActionListener(new i.4(this));
    }
    return this.mMainView;
  }
  
  public void a(String paramString)
  {
    Object localObject = new a(paramString, this.b.b, this.b.d, this.b.e, this.b.f);
    localObject = a.fork(2, (a)localObject);
    a(paramString, getChildFragmentManager(), (ExchangeDataService)localObject);
    if (this.d == -3) {
      this.e.hideSoftInputFromWindow(getActivity().getWindow().peekDecorView().getWindowToken(), 0);
    }
    this.f.setText("");
  }
  
  public void a(String paramString, FragmentManager paramFragmentManager, ExchangeDataService paramExchangeDataService)
  {
    this.c.removeAllViews();
    paramFragmentManager = paramFragmentManager.beginTransaction();
    a locala = new a(paramString, paramString, this.b.d, this.b.e, this.b.f, this.b.a());
    paramExchangeDataService.setKeywords(paramString);
    paramString = UMWallFragment.newInstance(paramExchangeDataService, locala, 0);
    paramFragmentManager.replace(c.aB(getActivity()), paramString);
    paramFragmentManager.commitAllowingStateLoss();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    a();
  }
  
  public void onResume()
  {
    super.onResume();
    if (this.b != null) {
      this.i.setText(this.b.b);
    }
    this.f.requestFocus();
    this.e.showSoftInput(this.f, 1);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */