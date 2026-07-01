package com.taobao.munion.ewall;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentManager.BackStackEntry;
import android.view.KeyEvent;
import com.taobao.munion.common.MunionInitializer;
import com.taobao.munion.common.fragment.BaseFragment;
import com.taobao.munion.common.fragment.FragmentPageManager;
import com.taobao.munion.ewall.actorframework.DefaultActorManager;
import com.taobao.munion.ewall.ui.fragments.EWallMainFragment;
import com.taobao.munion.restool.a;
import com.taobao.munion.utils.j;
import com.taobao.munion.utils.k;
import com.umeng.newxp.controller.ExchangeDataService;

public class EWallContainerActivity
  extends FragmentActivity
{
  public static final String KEY_BUNDLE_MAINBEAN = "bundle_main";
  public static final String KEY_DATA_SERVICE = "data_service";
  public static ExchangeDataService mExchangeDataService;
  private BaseFragment mActiveFragment;
  private ExchangeDataService mBackupExchangeDataService;
  int mLandingType;
  int mLayoutType = 17;
  String mSlotid;
  
  private void InitPage()
  {
    EWallMainFragment localEWallMainFragment = new EWallMainFragment();
    localEWallMainFragment.setDataService(mExchangeDataService);
    mExchangeDataService.sessionId = "";
    FragmentPageManager.getInstance().pushPageObject(localEWallMainFragment);
  }
  
  public static void start(Context paramContext, ExchangeDataService paramExchangeDataService)
  {
    Intent localIntent = new Intent(paramContext, EWallContainerActivity.class);
    j.a(localIntent, "data_service", paramExchangeDataService);
    paramContext.startActivity(localIntent);
  }
  
  public BaseFragment getActiveFragment()
  {
    FragmentManager localFragmentManager = getSupportFragmentManager();
    int i = localFragmentManager.getBackStackEntryCount();
    if (i > 0) {
      this.mActiveFragment = ((BaseFragment)localFragmentManager.findFragmentByTag(localFragmentManager.getBackStackEntryAt(i - 1).getName()));
    }
    return this.mActiveFragment;
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (!MunionInitializer.isInitialized()) {
      MunionInitializer.initialize(getApplication());
    }
    setContentView(a.i("munion_ewall_container"));
    FragmentPageManager.getInstance().setFragmentManager(getSupportFragmentManager());
    if (paramBundle != null)
    {
      if (mExchangeDataService == null)
      {
        ExchangeDataService localExchangeDataService = new ExchangeDataService();
        mExchangeDataService = localExchangeDataService;
        localExchangeDataService.slot_id = paramBundle.getString("slotid");
        mExchangeDataService.layoutType = paramBundle.getInt("layoutType");
        mExchangeDataService.setLandingType(paramBundle.getInt("landingtype"));
        mExchangeDataService.appkey = paramBundle.getString("appkey");
        mExchangeDataService.psid = paramBundle.getString("psid");
        mExchangeDataService.slot_act_params = paramBundle.getString("slot_act_params");
      }
      return;
    }
    mExchangeDataService = (ExchangeDataService)j.a(getIntent(), "data_service");
    this.mBackupExchangeDataService = new ExchangeDataService();
    this.mBackupExchangeDataService.slot_id = mExchangeDataService.slot_id;
    this.mBackupExchangeDataService.layoutType = mExchangeDataService.layoutType;
    this.mBackupExchangeDataService.setLandingType(mExchangeDataService.getLandingType());
    this.mBackupExchangeDataService.appkey = mExchangeDataService.appkey;
    this.mBackupExchangeDataService.psid = mExchangeDataService.psid;
    this.mBackupExchangeDataService.slot_act_params = mExchangeDataService.slot_act_params;
    InitPage();
  }
  
  protected void onDestroy()
  {
    DefaultActorManager.getInstance().terminate();
    super.onDestroy();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    this.mActiveFragment = getActiveFragment();
    boolean bool1 = false;
    if (this.mActiveFragment != null) {
      bool1 = this.mActiveFragment.onKeyDown(paramInt, paramKeyEvent);
    }
    boolean bool2 = bool1;
    if (!bool1)
    {
      if (paramInt != 4) {
        break label65;
      }
      if (FragmentPageManager.getInstance().canGoBack()) {
        bool2 = super.onKeyDown(paramInt, paramKeyEvent);
      }
    }
    else
    {
      return bool2;
    }
    finish();
    return true;
    label65:
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onRestoreInstanceState(Bundle paramBundle)
  {
    if (paramBundle != null)
    {
      mExchangeDataService = (ExchangeDataService)j.a(paramBundle, "data_service");
      k.a("savedInstanceState " + mExchangeDataService);
      if (mExchangeDataService == null)
      {
        ExchangeDataService localExchangeDataService = new ExchangeDataService();
        mExchangeDataService = localExchangeDataService;
        localExchangeDataService.slot_id = paramBundle.getString("slotid");
        mExchangeDataService.layoutType = paramBundle.getInt("layoutType");
        mExchangeDataService.setLandingType(paramBundle.getInt("landingtype"));
        mExchangeDataService.appkey = paramBundle.getString("appkey");
        mExchangeDataService.psid = paramBundle.getString("psid");
        mExchangeDataService.slot_act_params = paramBundle.getString("slot_act_params");
        this.mBackupExchangeDataService = new ExchangeDataService();
        this.mBackupExchangeDataService.slot_id = mExchangeDataService.slot_id;
        this.mBackupExchangeDataService.layoutType = mExchangeDataService.layoutType;
        this.mBackupExchangeDataService.setLandingType(mExchangeDataService.getLandingType());
        this.mBackupExchangeDataService.appkey = mExchangeDataService.appkey;
        this.mBackupExchangeDataService.psid = mExchangeDataService.psid;
        this.mBackupExchangeDataService.slot_act_params = mExchangeDataService.slot_act_params;
      }
    }
    super.onRestoreInstanceState(paramBundle);
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    j.a(paramBundle, "data_service", this.mBackupExchangeDataService);
    paramBundle.putString("slotid", this.mBackupExchangeDataService.slot_id);
    paramBundle.putInt("layoutType", this.mBackupExchangeDataService.layoutType);
    paramBundle.putInt("landingtype", this.mBackupExchangeDataService.getLandingType());
    paramBundle.putString("appkey", this.mBackupExchangeDataService.appkey);
    paramBundle.putString("psid", this.mBackupExchangeDataService.psid);
    paramBundle.putString("slot_act_params", this.mBackupExchangeDataService.slot_act_params);
    super.onSaveInstanceState(paramBundle);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\ewall\EWallContainerActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */