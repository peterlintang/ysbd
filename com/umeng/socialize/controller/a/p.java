package com.umeng.socialize.controller.a;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.umeng.socialize.a.d;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.controller.listener.SocializeListeners.OauthCallbackListener;
import com.umeng.socialize.exception.SocializeException;

class p
  implements SocializeListeners.OauthCallbackListener
{
  p(b paramb, Context paramContext, SocializeListeners.OauthCallbackListener paramOauthCallbackListener, SocializeListeners.OauthCallbackListener[] paramArrayOfOauthCallbackListener) {}
  
  public void onComplete(Bundle paramBundle, SHARE_MEDIA paramSHARE_MEDIA)
  {
    Object localObject;
    if (paramBundle != null)
    {
      localObject = paramBundle.getString("uid");
      String str1 = paramBundle.getString("access_key");
      String str2 = paramBundle.getString("access_secret");
      if ((!TextUtils.isEmpty(str1)) && (!TextUtils.isEmpty(str2))) {
        d.a(this.b, paramSHARE_MEDIA, str1, str2);
      }
      if (!TextUtils.isEmpty((CharSequence)localObject)) {
        d.a(this.b, paramSHARE_MEDIA, (String)localObject);
      }
    }
    int j;
    int i;
    if (this.c != null)
    {
      this.c.onComplete(paramBundle, paramSHARE_MEDIA);
      if (this.d != null)
      {
        localObject = this.d;
        j = localObject.length;
        i = 0;
      }
    }
    for (;;)
    {
      if (i >= j) {
        return;
      }
      localObject[i].onComplete(paramBundle, paramSHARE_MEDIA);
      i += 1;
    }
  }
  
  public void onError(SocializeException paramSocializeException, SHARE_MEDIA paramSHARE_MEDIA)
  {
    d.d(this.b, paramSHARE_MEDIA);
    SocializeListeners.OauthCallbackListener[] arrayOfOauthCallbackListener;
    int j;
    int i;
    if (this.c != null)
    {
      this.c.onError(paramSocializeException, paramSHARE_MEDIA);
      if (this.d != null)
      {
        arrayOfOauthCallbackListener = this.d;
        j = arrayOfOauthCallbackListener.length;
        i = 0;
      }
    }
    for (;;)
    {
      if (i >= j) {
        return;
      }
      arrayOfOauthCallbackListener[i].onError(paramSocializeException, paramSHARE_MEDIA);
      i += 1;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\controller\a\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */