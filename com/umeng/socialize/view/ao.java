package com.umeng.socialize.view;

import android.view.View;
import android.view.View.OnClickListener;
import com.umeng.socialize.a.d;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.bean.n;
import com.umeng.socialize.controller.UMSocialService;

class ao
  implements View.OnClickListener
{
  ao(aj paramaj, n paramn) {}
  
  public void onClick(View paramView)
  {
    paramView = SHARE_MEDIA.convertToEmun(this.b.a);
    if (d.a(aj.c(this.a), paramView))
    {
      aj.a(this.a, paramView);
      return;
    }
    aj.d(this.a).doOauthVerify(aj.c(this.a), paramView, new ap(this, paramView));
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */