package com.taobao.munion.net;

import android.os.AsyncTask.Status;

public abstract class j
{
  public static final int DEFAULT_HTTP_ERROR = -1;
  public static final int DEFAULT_VIEW = -1;
  public static final long TIME_DAY = 86400L;
  public static final long TIME_HOURSE = 3600L;
  public static final int VALID_ERROR = -50;
  private l mHttpResponse;
  private j.a mTaskHandler;
  
  public void breakHttpTask()
  {
    if ((this.mTaskHandler != null) && (isRunning())) {
      this.mTaskHandler.cancel(true);
    }
    this.mTaskHandler = null;
  }
  
  public boolean isRunning()
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (this.mTaskHandler != null) {
      if (this.mTaskHandler.getStatus() != AsyncTask.Status.RUNNING)
      {
        bool1 = bool2;
        if (this.mTaskHandler.getStatus() != AsyncTask.Status.PENDING) {}
      }
      else
      {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public void loadHttpContent(k paramk)
  {
    this.mTaskHandler = ((j.a)new j.a(this, -1).execute(new k[] { paramk }));
  }
  
  public void loadHttpContent(k paramk, int paramInt)
  {
    this.mTaskHandler = ((j.a)new j.a(this, paramInt).execute(new k[] { paramk }));
  }
  
  protected abstract void onHttpFailed(int paramInt, t paramt);
  
  protected void onHttpLoading(int paramInt) {}
  
  protected boolean onHttpResult(int paramInt, l paraml)
  {
    return false;
  }
  
  protected abstract void onHttpSucceed(int paramInt, l paraml);
  
  protected void onResumePreView(int paramInt) {}
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\net\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */