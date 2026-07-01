package com.taobao.munion.ewall.ui.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.taobao.munion.common.fragment.BaseFragment;
import com.taobao.munion.common.fragment.BaseFragment.OnFragmentFinishListener;
import com.taobao.munion.common.fragment.FragmentViewBase;
import com.taobao.munion.oauth.a;
import com.taobao.munion.oauth.b;
import com.taobao.munion.utils.k;
import com.taobao.munion.webview.MunionWebview;

public class OauthFragment
  extends BaseFragment
  implements BaseFragment.OnFragmentFinishListener
{
  public static final int TYPE_TAOBAO = 1;
  public static final String VERIFY_STATUS = "verify_status";
  private String mUrl;
  private MunionWebview mWebView;
  private a oauthHandler;
  
  private void handleRedirectUrl(String paramString)
  {
    paramString = this.oauthHandler.a(paramString);
    if (paramString == null)
    {
      this.oauthHandler.b("授权失败");
      return;
    }
    String str1 = paramString.getString("error");
    String str2 = paramString.getString("error_code");
    if ((str1 == null) && (str2 == null))
    {
      this.oauthHandler.a(paramString);
      return;
    }
    if ("access_denied".equals(str1))
    {
      this.oauthHandler.c();
      return;
    }
    this.oauthHandler.a(Integer.parseInt(str2));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    int i = 1;
    super.onCreate(paramBundle);
    if (getArguments() != null) {
      i = getArguments().getInt("type", 1);
    }
    switch (i)
    {
    }
    for (;;)
    {
      this.mUrl = this.oauthHandler.a();
      return;
      this.oauthHandler = new b(getActivity(), this, this);
    }
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.mWebView = new MunionWebview(getActivity());
    this.mWebView.a(new OauthFragment.1(this));
    this.mMainView = new FragmentViewBase(getActivity());
    this.mMainView.addView(this.mWebView, new ViewGroup.LayoutParams(-1, -1));
    return this.mMainView;
  }
  
  public void onFragmentResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    k.a("oauthfragment onfragmentresult resultCode = " + paramInt2);
    if (paramInt2 == -1)
    {
      switch (paramInt1)
      {
      default: 
        return;
      }
      this.oauthHandler.b(paramInt1, paramInt2, paramIntent);
      return;
    }
    getFragmentManager().popBackStack();
  }
  
  public void onResume()
  {
    super.onResume();
    this.mWebView.loadUrl(this.mUrl);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\ewall\ui\fragments\OauthFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */