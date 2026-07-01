package com.umeng.socialize.view.a;

import android.content.Context;
import com.umeng.socialize.controller.UMSocialService;
import com.umeng.socialize.exception.SocializeException;
import com.umeng.socom.Log;

class ac
  implements ab.a
{
  ac(ab paramab) {}
  
  public void a(Context paramContext, UMSocialService paramUMSocialService)
  {
    this.a.onViewLoad(this.a.b);
  }
  
  public void a(SocializeException paramSocializeException)
  {
    Log.e(this.a.a, "Error initializing Socialize", paramSocializeException);
    this.a.onViewLoad(null);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\a\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */