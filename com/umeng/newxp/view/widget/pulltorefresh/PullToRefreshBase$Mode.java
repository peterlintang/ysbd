package com.umeng.newxp.view.widget.pulltorefresh;

public enum PullToRefreshBase$Mode
{
  public static Mode f = b;
  public static Mode g = c;
  private int h;
  
  private PullToRefreshBase$Mode(int paramInt)
  {
    this.h = paramInt;
  }
  
  static Mode a()
  {
    return b;
  }
  
  static Mode a(int paramInt)
  {
    Mode[] arrayOfMode = values();
    int k = arrayOfMode.length;
    int j = 0;
    while (j < k)
    {
      Mode localMode = arrayOfMode[j];
      if (paramInt == localMode.e()) {
        return localMode;
      }
      j += 1;
    }
    return a();
  }
  
  final boolean b()
  {
    return (this != a) && (this != e);
  }
  
  public final boolean c()
  {
    return (this == b) || (this == d);
  }
  
  public final boolean d()
  {
    return (this == c) || (this == d) || (this == e);
  }
  
  final int e()
  {
    return this.h;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\widget\pulltorefresh\PullToRefreshBase$Mode.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */