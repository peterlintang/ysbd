package com.umeng.fb.util;

import android.app.Activity;
import java.util.Map;

public abstract interface FeedBackListener
{
  public abstract void onResetFB(Activity paramActivity, Map<String, String> paramMap1, Map<String, String> paramMap2);
  
  public abstract void onSubmitFB(Activity paramActivity);
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\fb\util\FeedBackListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */