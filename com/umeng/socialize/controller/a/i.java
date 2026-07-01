package com.umeng.socialize.controller.a;

import android.content.Context;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.c.p;
import com.umeng.socialize.controller.listener.SocializeListeners.FetchFriendsListener;
import com.umeng.socialize.exception.SocializeException;

class i
  extends ay<p>
{
  i(b paramb, SocializeListeners.FetchFriendsListener paramFetchFriendsListener, z paramz, Context paramContext, SHARE_MEDIA paramSHARE_MEDIA, String paramString) {}
  
  protected void a()
  {
    super.a();
    if (this.b != null) {
      this.b.onStart();
    }
  }
  
  protected void a(p paramp)
  {
    super.a(paramp);
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
  
  protected p b()
  {
    try
    {
      p localp = this.c.a(this.d, this.e, this.f);
      return localp;
    }
    catch (NullPointerException localNullPointerException)
    {
      b.a();
      localNullPointerException.toString();
      return null;
    }
    catch (SocializeException localSocializeException)
    {
      b.a();
      localSocializeException.toString();
    }
    return null;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\controller\a\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */