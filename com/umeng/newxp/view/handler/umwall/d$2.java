package com.umeng.newxp.view.handler.umwall;

import com.umeng.newxp.view.widget.KeyboardListenRelativeLayout.IOnKeyboardStateChangedListener;

class d$2
  implements KeyboardListenRelativeLayout.IOnKeyboardStateChangedListener
{
  d$2(d paramd) {}
  
  public void onKeyboardStateChanged(int paramInt)
  {
    d.e();
    new StringBuilder("the keyboard state has changed ").append(paramInt).toString();
    this.a.o = paramInt;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\handler\umwall\d$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */