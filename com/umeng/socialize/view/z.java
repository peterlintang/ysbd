package com.umeng.socialize.view;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.bean.n;
import com.umeng.socialize.controller.listener.SocializeListeners.OauthCallbackListener;
import com.umeng.socialize.exception.SocializeException;

class z
  implements SocializeListeners.OauthCallbackListener
{
  z(q.a parama) {}
  
  public void onComplete(Bundle paramBundle, SHARE_MEDIA paramSHARE_MEDIA)
  {
    paramBundle = paramBundle.getString("uid");
    if (!TextUtils.isEmpty(paramBundle))
    {
      this.a.a(paramBundle);
      this.a.b.setImageResource(this.a.g.c);
      this.a.c.setVisibility(0);
    }
  }
  
  public void onError(SocializeException paramSocializeException, SHARE_MEDIA paramSHARE_MEDIA) {}
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */