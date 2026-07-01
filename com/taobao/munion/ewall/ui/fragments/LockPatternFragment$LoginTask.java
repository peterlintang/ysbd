package com.taobao.munion.ewall.ui.fragments;

import android.support.v4.app.Fragment;
import android.widget.Toast;
import com.taobao.munion.net.l;
import com.taobao.munion.net.s;
import com.taobao.munion.net.t;

class LockPatternFragment$LoginTask
  extends s
{
  public LockPatternFragment$LoginTask(LockPatternFragment paramLockPatternFragment, Fragment paramFragment)
  {
    super(paramFragment);
  }
  
  public void doHttpFailed(int paramInt, t paramt)
  {
    this.this$0.stopLoadingStatus();
    LockPatternFragment.access$900(this.this$0, LockPatternFragment.PatternState.inputPassWord);
    Toast.makeText(this.this$0.getActivity(), "登录失败，请重试", 0).show();
    LockPatternFragment.access$000(this.this$0, false);
  }
  
  public void doHttpsuccsed(int paramInt, l paraml)
  {
    LockPatternFragment.access$500(this.this$0, paraml);
    Toast.makeText(this.this$0.getActivity(), "手势密码设置成功!", 0).show();
    LockPatternFragment.access$800(this.this$0, LockPatternFragment.access$600(this.this$0), LockPatternFragment.access$700(this.this$0));
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\ewall\ui\fragments\LockPatternFragment$LoginTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */