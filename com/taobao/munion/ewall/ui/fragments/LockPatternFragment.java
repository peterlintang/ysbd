package com.taobao.munion.ewall.ui.fragments;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.taobao.munion.actionbar.b;
import com.taobao.munion.common.MunionConfigManager;
import com.taobao.munion.common.fragment.BaseFragment;
import com.taobao.munion.common.fragment.FragmentPageManager;
import com.taobao.munion.common.fragment.FragmentViewBase;
import com.taobao.munion.pattern.LockPatternView;
import com.taobao.munion.pattern.LockPatternView.a;
import com.taobao.munion.pattern.LockPatternView.b;
import com.taobao.munion.pattern.LockPatternView.c;
import com.taobao.munion.requests.m;
import com.taobao.munion.utils.i;
import java.util.List;
import org.json.JSONObject;

public class LockPatternFragment
  extends BaseFragment
  implements LockPatternView.c
{
  public static final String KEY_PATTERN_CODE_TYPE = "code_type";
  public static final String KEY_PATTERN_ITEMS = "items";
  public static final String KEY_PATTERN_PASSWORD = "pattern_password";
  public static final String KEY_PATTERN_PASSWORD_TYPE = "pattern_type";
  public static final String KEY_SYNC_RESULT_CODE = "sync_result_code";
  public static final int PASSWORD_SET = 0;
  public static final int PASSWORD_VERIFY = 1;
  private RelativeLayout mBtnLeft;
  public LockPatternFragment.PatternState mCurrentState;
  private String mItemIds;
  private LockPatternView mLockPatternView;
  private int mRetryCount = 5;
  private m mSyncFavoriteRequest;
  private TextView mTopText;
  private String mUserDrawPassword;
  public String password;
  
  private void checkPassWordExist()
  {
    Bundle localBundle = getArguments();
    if (localBundle == null) {
      return;
    }
    if (localBundle.containsKey("pattern_type"))
    {
      switch (localBundle.getInt("pattern_type", 0))
      {
      default: 
        getFragmentManager().popBackStack();
      }
      for (;;)
      {
        this.mItemIds = MunionConfigManager.getInstance().getmItemIds();
        com.taobao.munion.utils.k.a("mItemIds = " + this.mItemIds);
        return;
        setPatternState(LockPatternFragment.PatternState.inputPassWord);
        setupSetActionBar();
        continue;
        setPatternState(LockPatternFragment.PatternState.passWordExist);
        setupSyncActionBar();
      }
    }
    getFragmentManager().popBackStack();
  }
  
  private void checkPassWordInExistState(List<LockPatternView.a> paramList)
  {
    this.password = com.taobao.munion.pattern.a.a(paramList);
    sendSyncRequest(this.mItemIds, this.password);
  }
  
  private void gotoLoginActivityAndClearPassword()
  {
    MunionConfigManager.getInstance().clearUserInfo();
    FragmentPageManager.getInstance().popToBack();
    FragmentPageManager.getInstance().pushPage(OauthFragment.class.getName());
  }
  
  private void init()
  {
    this.mTopText = ((TextView)this.mMainView.findViewById(com.taobao.munion.restool.a.c("pattern_top_text")));
    this.mLockPatternView = ((LockPatternView)this.mMainView.findViewById(com.taobao.munion.restool.a.c("pattern_view")));
    this.mBtnLeft = ((RelativeLayout)this.mMainView.findViewById(com.taobao.munion.restool.a.c("pattern_left_button")));
    this.mBtnLeft.setOnClickListener(this);
    this.mLockPatternView.a(this);
  }
  
  private void saveUserInfo(com.taobao.munion.net.l paraml)
  {
    if ((paraml != null) && (paraml.a()))
    {
      Object localObject = paraml.c().optJSONObject("result");
      if (localObject != null)
      {
        paraml = ((JSONObject)localObject).optString("nickName");
        localObject = ((JSONObject)localObject).optString("headerUrl");
        MunionConfigManager.getInstance().setUserInfo(paraml, (String)localObject);
      }
    }
  }
  
  private void sendLoginRequest(String paramString)
  {
    startLoadingStatus(new boolean[0]);
    paramString = new com.taobao.munion.requests.k(i.a(this, "code_type"), paramString);
    new LockPatternFragment.LoginTask(this, this).loadHttpContent(paramString);
  }
  
  private void sendSyncRequest(String paramString1, String paramString2)
  {
    if (!com.taobao.munion.utils.l.b(paramString1))
    {
      this.mSyncFavoriteRequest = new m(paramString1, paramString2);
      startLoadingStatus(new boolean[0]);
      new LockPatternFragment.SendSyncTask(this, this).loadHttpContent(this.mSyncFavoriteRequest);
      return;
    }
    stopLoadingStatus();
    setResultAndFinish(true);
  }
  
  private void setPatternState(LockPatternFragment.PatternState paramPatternState)
  {
    switch (LockPatternFragment.1.$SwitchMap$com$taobao$munion$ewall$ui$fragments$LockPatternFragment$PatternState[paramPatternState.ordinal()])
    {
    default: 
      return;
    case 1: 
      this.mBtnLeft.setVisibility(0);
      setTopTextByState(LockPatternFragment.TextState.gray, getString(com.taobao.munion.restool.a.k("munion_pattern_draw_pattern")));
      this.mCurrentState = LockPatternFragment.PatternState.passWordExist;
      return;
    case 2: 
      this.mBtnLeft.setVisibility(4);
      setTopTextByState(LockPatternFragment.TextState.gray, getString(com.taobao.munion.restool.a.k("munion_pattern_draw_pattern")));
      this.mCurrentState = LockPatternFragment.PatternState.inputPassWord;
      return;
    }
    this.mBtnLeft.setVisibility(4);
    this.mLockPatternView.c();
    this.mLockPatternView.setEnabled(true);
    setTopTextByState(LockPatternFragment.TextState.gray, getString(com.taobao.munion.restool.a.k("munion_pattern_draw_pattern_confirm")));
    this.mCurrentState = LockPatternFragment.PatternState.confirmPassword;
  }
  
  private void setResultAndFinish(boolean paramBoolean)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("verify_status", paramBoolean);
    setResult(-1, localIntent);
    FragmentPageManager.getInstance().popToBack();
  }
  
  private void setTopTextByState(LockPatternFragment.TextState paramTextState, String paramString)
  {
    switch (LockPatternFragment.1.$SwitchMap$com$taobao$munion$ewall$ui$fragments$LockPatternFragment$TextState[paramTextState.ordinal()])
    {
    }
    for (;;)
    {
      this.mTopText.setText(paramString);
      return;
      this.mTopText.setTextColor(getResources().getColor(com.taobao.munion.restool.a.b("munion_pattern_title_color_green")));
      continue;
      this.mTopText.setTextColor(getResources().getColor(com.taobao.munion.restool.a.b("munion_pattern_title_color_red")));
      continue;
      this.mTopText.setTextColor(getResources().getColor(com.taobao.munion.restool.a.b("munion_pattern_title_color_gray")));
    }
  }
  
  private void setupSetActionBar()
  {
    this.mMainView.initActionBar("设置手势密码", null, null, null);
  }
  
  private void setupSyncActionBar()
  {
    b localb = new b(getActivity());
    this.mMainView.initActionBar("输入手势密码", localb, null, null);
  }
  
  public void onClick(View paramView)
  {
    if (paramView.getId() == com.taobao.munion.restool.a.c("pattern_left_button")) {
      gotoLoginActivityAndClearPassword();
    }
    super.onClick(paramView);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.mMainView = ((FragmentViewBase)paramLayoutInflater.inflate(com.taobao.munion.restool.a.i("munion_lock_pattern"), null));
    init();
    checkPassWordExist();
    return this.mMainView;
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    com.taobao.munion.utils.k.a("lockpatternfragment ondestroy");
  }
  
  public void onPatternCellAdded(List<LockPatternView.a> paramList) {}
  
  public void onPatternCleared() {}
  
  public void onPatternDetected(List<LockPatternView.a> paramList)
  {
    if (paramList.size() < 4)
    {
      switch (LockPatternFragment.1.$SwitchMap$com$taobao$munion$ewall$ui$fragments$LockPatternFragment$PatternState[this.mCurrentState.ordinal()])
      {
      }
      for (;;)
      {
        this.mLockPatternView.a(LockPatternView.b.c);
        return;
        setTopTextByState(LockPatternFragment.TextState.warning, getString(com.taobao.munion.restool.a.k("munion_pattern_least_dots")));
        continue;
        setTopTextByState(LockPatternFragment.TextState.warning, getString(com.taobao.munion.restool.a.k("munion_pattern_try_again")));
        continue;
        checkPassWordInExistState(paramList);
      }
    }
    switch (LockPatternFragment.1.$SwitchMap$com$taobao$munion$ewall$ui$fragments$LockPatternFragment$PatternState[this.mCurrentState.ordinal()])
    {
    default: 
      return;
    case 1: 
      this.mBtnLeft.setEnabled(true);
      checkPassWordInExistState(paramList);
      return;
    case 2: 
      setTopTextByState(LockPatternFragment.TextState.normal, getString(com.taobao.munion.restool.a.k("munion_pattern_recored")));
      this.mUserDrawPassword = com.taobao.munion.pattern.a.a(paramList);
      setPatternState(LockPatternFragment.PatternState.confirmPassword);
      return;
    }
    if (com.taobao.munion.pattern.a.a(paramList).equals(this.mUserDrawPassword))
    {
      this.mLockPatternView.setEnabled(false);
      setTopTextByState(LockPatternFragment.TextState.normal, getString(com.taobao.munion.restool.a.k("munion_pattern_new_pattern")));
      sendLoginRequest(this.mUserDrawPassword);
      return;
    }
    this.mLockPatternView.a(LockPatternView.b.c);
    setTopTextByState(LockPatternFragment.TextState.warning, getString(com.taobao.munion.restool.a.k("munion_pattern_try_again")));
  }
  
  public void onPatternStart()
  {
    setTopTextByState(LockPatternFragment.TextState.normal, getString(com.taobao.munion.restool.a.k("munion_pattern_release_finger")));
    this.mBtnLeft.setEnabled(false);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\ewall\ui\fragments\LockPatternFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */