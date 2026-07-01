package com.umeng.newxp.view.widget.pulltorefresh;

public enum PullToRefreshBase$State
{
  private int g;
  
  private PullToRefreshBase$State(int paramInt)
  {
    this.g = paramInt;
  }
  
  static State a(int paramInt)
  {
    State[] arrayOfState = values();
    int j = arrayOfState.length;
    int i = 0;
    while (i < j)
    {
      State localState = arrayOfState[i];
      if (paramInt == localState.a()) {
        return localState;
      }
      i += 1;
    }
    return a;
  }
  
  final int a()
  {
    return this.g;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\widget\pulltorefresh\PullToRefreshBase$State.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */