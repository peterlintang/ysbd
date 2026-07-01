package com.taobao.munion.net;

import android.support.v4.app.Fragment;

public abstract class s
  extends j
{
  private Fragment mFragment;
  
  public s(Fragment paramFragment)
  {
    this.mFragment = paramFragment;
  }
  
  public abstract void doHttpFailed(int paramInt, t paramt);
  
  public abstract void doHttpsuccsed(int paramInt, l paraml);
  
  protected void onHttpFailed(int paramInt, t paramt)
  {
    if (this.mFragment.isAdded()) {
      doHttpFailed(paramInt, paramt);
    }
  }
  
  protected void onHttpSucceed(int paramInt, l paraml)
  {
    if (this.mFragment.isAdded()) {
      doHttpsuccsed(paramInt, paraml);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\net\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */