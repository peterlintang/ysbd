package com.umeng.socialize.view;

import com.umeng.socialize.view.wigets.KeyboardListenRelativeLayout.a;
import com.umeng.socom.Log;

class bj
  implements KeyboardListenRelativeLayout.a
{
  bj(ShareActivity paramShareActivity) {}
  
  public void a(int paramInt)
  {
    ShareActivity.a(this.a, paramInt);
    Log.c(ShareActivity.c(), "onKeyboardStateChanged  now state is " + paramInt);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\bj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */