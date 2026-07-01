package com.umeng.socialize.view.a;

import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import com.umeng.socialize.controller.UMSocialService;

class l
  implements View.OnClickListener
{
  l(h paramh, Handler paramHandler) {}
  
  public void onClick(View paramView)
  {
    this.b.postDelayed(new m(this), 1000L);
    this.a.b.openShare(this.a.getContext(), false);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\a\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */