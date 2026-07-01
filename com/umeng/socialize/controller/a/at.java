package com.umeng.socialize.controller.a;

import android.content.Context;
import android.os.AsyncTask;
import com.umeng.socialize.c.e;
import com.umeng.socialize.controller.listener.SocializeListeners.FetchCommetsListener;
import com.umeng.socialize.exception.SocializeException;

class at
  extends AsyncTask<Void, Void, e>
{
  at(aa paramaa, SocializeListeners.FetchCommetsListener paramFetchCommetsListener, z paramz, Context paramContext, long paramLong) {}
  
  protected e a(Void... paramVarArgs)
  {
    try
    {
      paramVarArgs = this.c.a(this.d, this.e);
      return paramVarArgs;
    }
    catch (SocializeException paramVarArgs)
    {
      aa.a();
      paramVarArgs.toString();
    }
    return null;
  }
  
  protected void a(e parame)
  {
    if (this.b != null)
    {
      if (parame != null) {
        this.b.onComplete(parame.n, parame.a, this.a.a);
      }
    }
    else {
      return;
    }
    this.b.onComplete(-102, null, this.a.a);
  }
  
  protected void onPreExecute()
  {
    super.onPreExecute();
    if (this.b != null) {
      this.b.onStart();
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\controller\a\at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */