package com.umeng.socialize.view.a;

import android.app.Activity;
import android.content.Context;

public abstract interface af
{
  public abstract Activity getActivity();
  
  public abstract void onViewLoad();
  
  public abstract void onViewRendered(int paramInt1, int paramInt2);
  
  public abstract void onViewUpdate();
  
  public abstract void showError(Context paramContext, Exception paramException);
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\a\af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */