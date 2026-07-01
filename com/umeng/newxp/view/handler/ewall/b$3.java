package com.umeng.newxp.view.handler.ewall;

import com.umeng.newxp.view.widget.KeyboardListenRelativeLayout.IOnKeyboardStateChangedListener;

class b$3
  implements KeyboardListenRelativeLayout.IOnKeyboardStateChangedListener
{
  b$3(b paramb) {}
  
  public void onKeyboardStateChanged(int paramInt)
  {
    b.b();
    new StringBuilder("the keyboard state has changed ").append(paramInt).toString();
    this.a.n = paramInt;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\handler\ewall\b$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */