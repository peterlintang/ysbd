package com.taobao.munion.ewall.ui.fragments;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.widget.Toast;
import com.taobao.munion.common.MunionConfigManager;
import com.taobao.munion.net.l;
import com.taobao.munion.net.s;
import com.taobao.munion.net.t;
import com.taobao.munion.pattern.LockPatternView;
import com.taobao.munion.pattern.LockPatternView.b;
import com.taobao.munion.restool.a;

class LockPatternFragment$SendSyncTask
  extends s
{
  public LockPatternFragment$SendSyncTask(LockPatternFragment paramLockPatternFragment, Fragment paramFragment)
  {
    super(paramFragment);
  }
  
  public void doHttpFailed(int paramInt, t paramt)
  {
    MunionConfigManager.getInstance().setItemIds(null);
    paramInt = paramt.a();
    this.this$0.stopLoadingStatus();
    if (720 == paramInt)
    {
      if ((LockPatternFragment.access$100(this.this$0) > 1) && (LockPatternFragment.access$100(this.this$0) <= 5))
      {
        LockPatternFragment.access$200(this.this$0).a(LockPatternView.b.c);
        LockPatternFragment.access$110(this.this$0);
        paramt = this.this$0.getActivity().getString(a.k("munion_pattern_wrong_pattern")).replace("$", LockPatternFragment.access$100(this.this$0));
        LockPatternFragment.access$300(this.this$0, LockPatternFragment.TextState.warning, paramt);
        return;
      }
      LockPatternFragment.access$200(this.this$0).setEnabled(false);
      LockPatternFragment.access$200(this.this$0).a(LockPatternView.b.c);
      LockPatternFragment.access$300(this.this$0, LockPatternFragment.TextState.warning, this.this$0.getActivity().getString(a.k("munion_pattern_wrong_password_no_changce")));
      LockPatternFragment.access$400(this.this$0);
      Toast.makeText(this.this$0.getActivity(), this.this$0.getActivity().getString(a.k("munion_pattern_wrong_password_no_changce")), 0).show();
      return;
    }
    Toast.makeText(this.this$0.getActivity(), "同步失败", 0).show();
    LockPatternFragment.access$000(this.this$0, false);
  }
  
  public void doHttpsuccsed(int paramInt, l paraml)
  {
    MunionConfigManager.getInstance().setItemIds(null);
    Toast.makeText(this.this$0.getActivity(), "同步已完成", 0).show();
    LockPatternFragment.access$000(this.this$0, true);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\ewall\ui\fragments\LockPatternFragment$SendSyncTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */