package com.umeng.socialize.view;

import android.view.View;
import android.view.View.OnClickListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.bean.n;
import com.umeng.socialize.controller.UMSocialService;
import com.umeng.socialize.controller.listener.SocializeListeners.DirectShareListener;

class bh
  implements View.OnClickListener
{
  bh(bc parambc, n paramn, SocializeListeners.DirectShareListener paramDirectShareListener) {}
  
  public void onClick(View paramView)
  {
    bc.c(this.a).directShare(bc.a(this.a), SHARE_MEDIA.convertToEmun(this.b.a), this.c);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\bh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */