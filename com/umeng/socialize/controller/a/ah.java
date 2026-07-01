package com.umeng.socialize.controller.a;

import android.content.Context;
import android.os.AsyncTask;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.c.p;
import com.umeng.socialize.controller.listener.SocializeListeners.FetchFriendsListener;
import com.umeng.socialize.exception.SocializeException;

class ah
  extends AsyncTask<Void, Void, p>
{
  ah(aa paramaa, SocializeListeners.FetchFriendsListener paramFetchFriendsListener, z paramz, Context paramContext, SHARE_MEDIA paramSHARE_MEDIA, String paramString) {}
  
  protected p a(Void... paramVarArgs)
  {
    try
    {
      paramVarArgs = this.c.a(this.d, this.e, this.f);
      return paramVarArgs;
    }
    catch (NullPointerException paramVarArgs)
    {
      aa.a();
      paramVarArgs.toString();
      return null;
    }
    catch (SocializeException paramVarArgs)
    {
      aa.a();
      paramVarArgs.toString();
    }
    return null;
  }
  
  protected void a(p paramp)
  {
    super.onPostExecute(paramp);
    if (this.b != null)
    {
      if (paramp != null) {
        this.b.onComplete(paramp.n, paramp.a);
      }
    }
    else {
      return;
    }
    this.b.onComplete(-102, null);
  }
  
  protected void onPreExecute()
  {
    super.onPreExecute();
    if (this.b != null) {
      this.b.onStart();
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\controller\a\ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */