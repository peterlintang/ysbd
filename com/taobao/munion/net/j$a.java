package com.taobao.munion.net;

import android.os.AsyncTask;

class j$a
  extends AsyncTask<k, Void, l>
{
  protected int a = -1;
  
  public j$a(j paramj, int paramInt)
  {
    this.a = paramInt;
  }
  
  protected l a(k... paramVarArgs)
  {
    return paramVarArgs[0].e();
  }
  
  protected void a(l paraml)
  {
    if (isCancelled()) {}
    while (this.b.onHttpResult(this.a, paraml)) {
      return;
    }
    if (paraml == null)
    {
      this.b.onHttpFailed(this.a, new t(null));
      return;
    }
    if (paraml.a())
    {
      this.b.onHttpSucceed(this.a, paraml);
      return;
    }
    this.b.onHttpFailed(this.a, new t(paraml.c()));
  }
  
  protected void onCancelled()
  {
    this.b.onResumePreView(this.a);
    super.onCancelled();
  }
  
  protected void onPreExecute()
  {
    this.b.onHttpLoading(this.a);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\net\j$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */