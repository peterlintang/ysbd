package com.taobao.munion.common.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentManager.BackStackEntry;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import com.taobao.munion.utils.k;

public class FragmentPageManager
{
  private static FragmentPageManager sPageManager;
  private FragmentManager mManager;
  
  public static FragmentPageManager getInstance()
  {
    if (sPageManager == null) {
      sPageManager = new FragmentPageManager();
    }
    return sPageManager;
  }
  
  private void pushPage(Fragment paramFragment, String paramString)
  {
    FragmentTransaction localFragmentTransaction = this.mManager.beginTransaction();
    localFragmentTransaction.setCustomAnimations(com.taobao.munion.restool.a.a("munion_push_in_right"), com.taobao.munion.restool.a.a("munion_push_out_left"), com.taobao.munion.restool.a.a("munion_push_in_left"), com.taobao.munion.restool.a.a("munion_push_out_right"));
    localFragmentTransaction.add(com.taobao.munion.restool.a.c("fragment_container"), paramFragment, paramString);
    localFragmentTransaction.addToBackStack(paramString);
    localFragmentTransaction.commit();
  }
  
  private void pushPage(Fragment paramFragment, String paramString, Bundle paramBundle)
  {
    paramFragment.setArguments(paramBundle);
    pushPage(paramFragment, paramString);
  }
  
  public boolean canGoBack()
  {
    boolean bool = true;
    if (this.mManager.getBackStackEntryCount() == 1) {
      bool = false;
    }
    return bool;
  }
  
  public boolean canGoBackWithActivity()
  {
    return this.mManager.getBackStackEntryCount() != 0;
  }
  
  public void gotoPage(String paramString)
  {
    int k = 0;
    int i = this.mManager.getBackStackEntryCount() - 1;
    for (;;)
    {
      int j = k;
      if (i >= 0)
      {
        if (this.mManager.getBackStackEntryAt(i).getName().endsWith(paramString)) {
          j = 1;
        }
      }
      else
      {
        if (j == 0) {
          break;
        }
        popToPage(paramString);
        return;
      }
      i -= 1;
    }
    popToBack();
    pushPage((Fragment)com.taobao.munion.utils.a.c(paramString), paramString);
  }
  
  public void gotoPage(String paramString, Bundle paramBundle)
  {
    if (TextUtils.isEmpty(paramString)) {
      return;
    }
    int i = this.mManager.getBackStackEntryCount() - 1;
    if (i >= 0) {
      if (!this.mManager.getBackStackEntryAt(i).getName().endsWith(paramString)) {}
    }
    for (i = 1;; i = 0)
    {
      if (i != 0)
      {
        this.mManager.popBackStackImmediate(paramString, 0);
        return;
        i -= 1;
        break;
      }
      popToBack();
      pushPage((Fragment)com.taobao.munion.utils.a.c(paramString), paramString, paramBundle);
      return;
    }
  }
  
  public void popToBack()
  {
    this.mManager.popBackStack();
  }
  
  public void popToPage(String paramString)
  {
    this.mManager.popBackStack(paramString, 0);
  }
  
  public void pushPage(String paramString)
  {
    try
    {
      pushPage((Fragment)Class.forName(paramString).newInstance(), paramString);
      return;
    }
    catch (Exception paramString)
    {
      k.b("Fragment push exception: " + paramString.toString());
    }
  }
  
  public void pushPage(String paramString, Bundle paramBundle)
  {
    try
    {
      Fragment localFragment = (Fragment)Class.forName(paramString).newInstance();
      pushPage(localFragment, paramString, paramBundle);
      return;
    }
    catch (Exception paramString) {}
  }
  
  public BaseFragment pushPageForResult(String paramString, int paramInt)
  {
    BaseFragment localBaseFragment = (BaseFragment)com.taobao.munion.utils.a.c(paramString);
    if (localBaseFragment == null) {
      return null;
    }
    localBaseFragment.setRequireCode(paramInt);
    FragmentTransaction localFragmentTransaction = this.mManager.beginTransaction();
    localFragmentTransaction.add(com.taobao.munion.restool.a.c("fragment_container"), localBaseFragment, paramString);
    localFragmentTransaction.addToBackStack(paramString);
    localFragmentTransaction.commit();
    return localBaseFragment;
  }
  
  public BaseFragment pushPageForResult(String paramString, int paramInt, BaseFragment.OnFragmentFinishListener paramOnFragmentFinishListener)
  {
    BaseFragment localBaseFragment = (BaseFragment)com.taobao.munion.utils.a.c(paramString);
    if (localBaseFragment == null) {
      return null;
    }
    localBaseFragment.setFragmentFinishListener(paramOnFragmentFinishListener);
    localBaseFragment.setRequireCode(paramInt);
    paramOnFragmentFinishListener = this.mManager.beginTransaction();
    paramOnFragmentFinishListener.setCustomAnimations(com.taobao.munion.restool.a.a("munion_push_in_right"), com.taobao.munion.restool.a.a("munion_push_out_left"), com.taobao.munion.restool.a.a("munion_push_in_left"), com.taobao.munion.restool.a.a("munion_push_out_right"));
    paramOnFragmentFinishListener.add(com.taobao.munion.restool.a.c("fragment_container"), localBaseFragment, paramString);
    paramOnFragmentFinishListener.addToBackStack(paramString);
    paramOnFragmentFinishListener.commit();
    return localBaseFragment;
  }
  
  public BaseFragment pushPageForResult(String paramString, int paramInt, BaseFragment.OnFragmentFinishListener paramOnFragmentFinishListener, Bundle paramBundle)
  {
    BaseFragment localBaseFragment = (BaseFragment)com.taobao.munion.utils.a.c(paramString);
    if (localBaseFragment == null) {
      return null;
    }
    localBaseFragment.setFragmentFinishListener(paramOnFragmentFinishListener);
    localBaseFragment.setArguments(paramBundle);
    localBaseFragment.setRequireCode(paramInt);
    paramOnFragmentFinishListener = this.mManager.beginTransaction();
    paramOnFragmentFinishListener.setCustomAnimations(com.taobao.munion.restool.a.a("munion_push_in_right"), com.taobao.munion.restool.a.a("munion_push_out_left"), com.taobao.munion.restool.a.a("munion_push_in_left"), com.taobao.munion.restool.a.a("munion_push_out_right"));
    paramOnFragmentFinishListener.add(com.taobao.munion.restool.a.c("fragment_container"), localBaseFragment, paramString);
    paramOnFragmentFinishListener.addToBackStack(paramString);
    paramOnFragmentFinishListener.commit();
    return localBaseFragment;
  }
  
  public BaseFragment pushPageForResult(String paramString, Bundle paramBundle, int paramInt)
  {
    BaseFragment localBaseFragment = (BaseFragment)com.taobao.munion.utils.a.c(paramString);
    if (localBaseFragment == null) {
      return null;
    }
    localBaseFragment.setArguments(paramBundle);
    localBaseFragment.setRequireCode(paramInt);
    paramBundle = this.mManager.beginTransaction();
    paramBundle.add(com.taobao.munion.restool.a.c("fragment_container"), localBaseFragment, paramString);
    paramBundle.addToBackStack(paramString);
    paramBundle.commit();
    return localBaseFragment;
  }
  
  public BaseFragment pushPageForResultWithAnimation(String paramString, Bundle paramBundle, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    BaseFragment localBaseFragment = (BaseFragment)com.taobao.munion.utils.a.c(paramString);
    if (localBaseFragment == null) {
      return null;
    }
    if (paramBundle != null) {
      localBaseFragment.setArguments(paramBundle);
    }
    localBaseFragment.setRequireCode(paramInt1);
    paramBundle = this.mManager.beginTransaction();
    paramBundle.setCustomAnimations(paramInt2, paramInt3, paramInt4, paramInt5);
    paramBundle.add(com.taobao.munion.restool.a.c("fragment_container"), localBaseFragment, paramString);
    paramBundle.addToBackStack(paramString);
    paramBundle.commit();
    return localBaseFragment;
  }
  
  public void pushPageNoAnimation(String paramString)
  {
    try
    {
      Fragment localFragment = (Fragment)Class.forName(paramString).newInstance();
      FragmentTransaction localFragmentTransaction = this.mManager.beginTransaction();
      localFragmentTransaction.add(com.taobao.munion.restool.a.c("fragment_container"), localFragment, paramString);
      localFragmentTransaction.addToBackStack(paramString);
      localFragmentTransaction.commit();
      return;
    }
    catch (Exception paramString)
    {
      k.b("Fragment push exception: " + paramString.toString());
    }
  }
  
  public void pushPageNotAddToBackStack(String paramString)
  {
    try
    {
      Fragment localFragment = (Fragment)Class.forName(paramString).newInstance();
      FragmentTransaction localFragmentTransaction = this.mManager.beginTransaction();
      localFragmentTransaction.add(com.taobao.munion.restool.a.c("fragment_container"), localFragment, paramString);
      localFragmentTransaction.commit();
      return;
    }
    catch (Exception paramString)
    {
      k.b("Fragment commit exception: " + paramString.toString());
    }
  }
  
  public void pushPageObject(Fragment paramFragment)
  {
    try
    {
      FragmentTransaction localFragmentTransaction = this.mManager.beginTransaction();
      localFragmentTransaction.add(com.taobao.munion.restool.a.c("fragment_container"), paramFragment, paramFragment.getClass().getName());
      localFragmentTransaction.addToBackStack(paramFragment.getClass().getName());
      localFragmentTransaction.commit();
      return;
    }
    catch (Exception paramFragment)
    {
      k.b("Fragment push exception: " + paramFragment.toString());
    }
  }
  
  public void pushPageWithAnimation(String paramString, Bundle paramBundle, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    try
    {
      Fragment localFragment = (Fragment)Class.forName(paramString).newInstance();
      if (paramBundle != null) {
        localFragment.setArguments(paramBundle);
      }
      paramBundle = this.mManager.beginTransaction();
      paramBundle.setCustomAnimations(paramInt1, paramInt2, paramInt3, paramInt4);
      paramBundle.add(com.taobao.munion.restool.a.c("fragment_container"), localFragment, paramString);
      paramBundle.addToBackStack(paramString);
      paramBundle.commit();
      return;
    }
    catch (Exception paramString) {}
  }
  
  public void setFragmentManager(FragmentManager paramFragmentManager)
  {
    this.mManager = paramFragmentManager;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\common\fragment\FragmentPageManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */