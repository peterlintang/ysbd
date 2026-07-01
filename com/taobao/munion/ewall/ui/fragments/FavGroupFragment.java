package com.taobao.munion.ewall.ui.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentManager.OnBackStackChangedListener;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;
import com.taobao.munion.actionbar.ActionBar.b;
import com.taobao.munion.actionbar.b;
import com.taobao.munion.common.MunionConfigManager;
import com.taobao.munion.common.fragment.BaseFragment;
import com.taobao.munion.common.fragment.BaseFragment.OnFragmentFinishListener;
import com.taobao.munion.common.fragment.FragmentViewBase;
import com.taobao.munion.utils.l;

public class FavGroupFragment
  extends BaseFragment
  implements FragmentManager.OnBackStackChangedListener, RadioGroup.OnCheckedChangeListener, BaseFragment.OnFragmentFinishListener
{
  private ActionBar.b mAccountAction;
  private FragmentManager mChildManager;
  private FavGroupFragment.ListType mCurrentListType;
  private FavNotSyncFragment mFavNotSyncFragment;
  private FavSyncFragment mFavSyncFragment;
  private TextView mLabelDetailSubTitle;
  private RadioButton mNotSyncRadioButton;
  private RadioButton mSyncRadioButton;
  private RadioGroup mSyncRadioGroup;
  
  private void init(View paramView)
  {
    b localb = new b(getActivity());
    this.mAccountAction = new com.taobao.munion.actionbar.a(getActivity(), this);
    this.mMainView.initActionBar("愿望清单", localb, this.mAccountAction, null);
    this.mLabelDetailSubTitle = ((TextView)paramView.findViewById(com.taobao.munion.restool.a.c("label_detail_subtitle")));
    this.mSyncRadioButton = ((RadioButton)paramView.findViewById(com.taobao.munion.restool.a.c("radio_btn_sync")));
    this.mNotSyncRadioButton = ((RadioButton)paramView.findViewById(com.taobao.munion.restool.a.c("radio_btn_async")));
    this.mSyncRadioGroup = ((RadioGroup)paramView.findViewById(com.taobao.munion.restool.a.c("label_detail_radio_group")));
    this.mSyncRadioGroup.setOnCheckedChangeListener(this);
    this.mChildManager = getChildFragmentManager();
    getFragmentManager().addOnBackStackChangedListener(this);
    switchSyncListLayout(FavGroupFragment.ListType.notSync);
  }
  
  private void switchSyncListLayout(FavGroupFragment.ListType paramListType)
  {
    this.mCurrentListType = paramListType;
    switch (FavGroupFragment.1.$SwitchMap$com$taobao$munion$ewall$ui$fragments$FavGroupFragment$ListType[paramListType.ordinal()])
    {
    default: 
      return;
    case 1: 
      gotoPage(FavNotSyncFragment.class);
      return;
    }
    gotoPage(FavSyncFragment.class);
  }
  
  /* Error */
  public void gotoPage(Class<?> paramClass)
  {
    // Byte code:
    //   0: aload_1
    //   1: ldc -118
    //   3: if_acmpne +78 -> 81
    //   6: aload_0
    //   7: getfield 148	com/taobao/munion/ewall/ui/fragments/FavGroupFragment:mFavNotSyncFragment	Lcom/taobao/munion/ewall/ui/fragments/FavNotSyncFragment;
    //   10: ifnonnull +14 -> 24
    //   13: aload_0
    //   14: aload_1
    //   15: invokevirtual 154	java/lang/Class:newInstance	()Ljava/lang/Object;
    //   18: checkcast 138	com/taobao/munion/ewall/ui/fragments/FavNotSyncFragment
    //   21: putfield 148	com/taobao/munion/ewall/ui/fragments/FavGroupFragment:mFavNotSyncFragment	Lcom/taobao/munion/ewall/ui/fragments/FavNotSyncFragment;
    //   24: aload_0
    //   25: getfield 148	com/taobao/munion/ewall/ui/fragments/FavGroupFragment:mFavNotSyncFragment	Lcom/taobao/munion/ewall/ui/fragments/FavNotSyncFragment;
    //   28: astore_2
    //   29: aload_0
    //   30: getfield 156	com/taobao/munion/ewall/ui/fragments/FavGroupFragment:mFavSyncFragment	Lcom/taobao/munion/ewall/ui/fragments/FavSyncFragment;
    //   33: astore 4
    //   35: aload_2
    //   36: astore_3
    //   37: aload 4
    //   39: astore_2
    //   40: aload_0
    //   41: getfield 106	com/taobao/munion/ewall/ui/fragments/FavGroupFragment:mChildManager	Landroid/support/v4/app/FragmentManager;
    //   44: invokevirtual 160	android/support/v4/app/FragmentManager:beginTransaction	()Landroid/support/v4/app/FragmentTransaction;
    //   47: astore 4
    //   49: aload_2
    //   50: ifnull +10 -> 60
    //   53: aload 4
    //   55: aload_2
    //   56: invokevirtual 166	android/support/v4/app/FragmentTransaction:hide	(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;
    //   59: pop
    //   60: aload_3
    //   61: invokevirtual 170	com/taobao/munion/common/fragment/BaseFragment:isAdded	()Z
    //   64: ifeq +68 -> 132
    //   67: aload 4
    //   69: aload_3
    //   70: invokevirtual 173	android/support/v4/app/FragmentTransaction:show	(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;
    //   73: pop
    //   74: aload 4
    //   76: invokevirtual 176	android/support/v4/app/FragmentTransaction:commit	()I
    //   79: pop
    //   80: return
    //   81: aload_0
    //   82: getfield 156	com/taobao/munion/ewall/ui/fragments/FavGroupFragment:mFavSyncFragment	Lcom/taobao/munion/ewall/ui/fragments/FavSyncFragment;
    //   85: ifnonnull +14 -> 99
    //   88: aload_0
    //   89: aload_1
    //   90: invokevirtual 154	java/lang/Class:newInstance	()Ljava/lang/Object;
    //   93: checkcast 144	com/taobao/munion/ewall/ui/fragments/FavSyncFragment
    //   96: putfield 156	com/taobao/munion/ewall/ui/fragments/FavGroupFragment:mFavSyncFragment	Lcom/taobao/munion/ewall/ui/fragments/FavSyncFragment;
    //   99: aload_0
    //   100: getfield 156	com/taobao/munion/ewall/ui/fragments/FavGroupFragment:mFavSyncFragment	Lcom/taobao/munion/ewall/ui/fragments/FavSyncFragment;
    //   103: astore_2
    //   104: aload_0
    //   105: getfield 148	com/taobao/munion/ewall/ui/fragments/FavGroupFragment:mFavNotSyncFragment	Lcom/taobao/munion/ewall/ui/fragments/FavNotSyncFragment;
    //   108: astore 4
    //   110: aload_2
    //   111: astore_3
    //   112: aload 4
    //   114: astore_2
    //   115: goto -75 -> 40
    //   118: astore_3
    //   119: aconst_null
    //   120: astore_2
    //   121: aload_3
    //   122: invokevirtual 179	java/lang/Exception:printStackTrace	()V
    //   125: aload_2
    //   126: astore_3
    //   127: aconst_null
    //   128: astore_2
    //   129: goto -89 -> 40
    //   132: aload 4
    //   134: ldc -75
    //   136: invokestatic 70	com/taobao/munion/restool/a:c	(Ljava/lang/String;)I
    //   139: aload_3
    //   140: aload_1
    //   141: invokevirtual 185	java/lang/Class:getName	()Ljava/lang/String;
    //   144: invokevirtual 189	android/support/v4/app/FragmentTransaction:add	(ILandroid/support/v4/app/Fragment;Ljava/lang/String;)Landroid/support/v4/app/FragmentTransaction;
    //   147: pop
    //   148: goto -74 -> 74
    //   151: astore_3
    //   152: goto -31 -> 121
    //   155: astore_3
    //   156: goto -35 -> 121
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	159	0	this	FavGroupFragment
    //   0	159	1	paramClass	Class<?>
    //   28	101	2	localObject1	Object
    //   36	76	3	localObject2	Object
    //   118	4	3	localException1	Exception
    //   126	14	3	localObject3	Object
    //   151	1	3	localException2	Exception
    //   155	1	3	localException3	Exception
    //   33	100	4	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   6	24	118	java/lang/Exception
    //   24	29	118	java/lang/Exception
    //   81	99	118	java/lang/Exception
    //   99	104	118	java/lang/Exception
    //   29	35	151	java/lang/Exception
    //   104	110	155	java/lang/Exception
  }
  
  public void hiddenRadioButtonAndSetSubTitle()
  {
    this.mLabelDetailSubTitle.setVisibility(0);
    this.mSyncRadioGroup.setVisibility(8);
  }
  
  public void onBackStackChanged()
  {
    if ((this.mAccountAction != null) && (l.b(MunionConfigManager.getInstance().getUserName())))
    {
      this.mMainView.updateActionIcon(this.mAccountAction, com.taobao.munion.restool.a.e("munion_actionbar_account_unlogin_selector"));
      return;
    }
    this.mMainView.updateActionIcon(this.mAccountAction, com.taobao.munion.restool.a.e("munion_actionbar_account_login_selector"));
  }
  
  public void onCheckedChanged(RadioGroup paramRadioGroup, int paramInt)
  {
    if (paramInt == this.mNotSyncRadioButton.getId()) {
      switchSyncListLayout(FavGroupFragment.ListType.notSync);
    }
    while (paramInt != this.mSyncRadioButton.getId()) {
      return;
    }
    switchSyncListLayout(FavGroupFragment.ListType.sync);
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.mMainView = ((FragmentViewBase)paramLayoutInflater.inflate(com.taobao.munion.restool.a.i("munion_fav_list_group"), null));
    init(this.mMainView);
    return this.mMainView;
  }
  
  public void onFragmentResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    switch (FavGroupFragment.1.$SwitchMap$com$taobao$munion$ewall$ui$fragments$FavGroupFragment$ListType[this.mCurrentListType.ordinal()])
    {
    default: 
      return;
    case 1: 
      this.mFavNotSyncFragment.onChildFragmentResult(paramInt1, paramInt2, paramIntent);
      return;
    }
    this.mFavSyncFragment.onChildFragmentResult(paramInt1, paramInt2, paramIntent);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    switch (FavGroupFragment.1.$SwitchMap$com$taobao$munion$ewall$ui$fragments$FavGroupFragment$ListType[this.mCurrentListType.ordinal()])
    {
    default: 
      return super.onKeyDown(paramInt, paramKeyEvent);
    case 2: 
      return this.mFavSyncFragment.onKeyDown(paramInt, paramKeyEvent);
    }
    return this.mFavNotSyncFragment.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public void onResume()
  {
    super.onResume();
    if ((this.mAccountAction != null) && (l.b(MunionConfigManager.getInstance().getUserName())))
    {
      this.mMainView.updateActionIcon(this.mAccountAction, com.taobao.munion.restool.a.e("munion_actionbar_account_unlogin_selector"));
      return;
    }
    this.mMainView.updateActionIcon(this.mAccountAction, com.taobao.munion.restool.a.e("munion_actionbar_account_login_selector"));
  }
  
  public void refreshSyncList()
  {
    if (this.mFavSyncFragment != null) {
      this.mFavSyncFragment.isRefreshInOnResume = true;
    }
  }
  
  public void showRadioButtonAndHiddenSubTitle()
  {
    this.mLabelDetailSubTitle.setVisibility(8);
    this.mSyncRadioGroup.setVisibility(0);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\ewall\ui\fragments\FavGroupFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */