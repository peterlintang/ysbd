package com.umeng.socialize.view.a;

import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import com.umeng.socialize.controller.UMSocialService;

class q
  implements View.OnClickListener
{
  q(h paramh, Handler paramHandler) {}
  
  public void onClick(View paramView)
  {
    h.g(this.a).setClickable(false);
    this.b.postDelayed(new r(this), 1000L);
    this.a.b.openUserCenter(this.a.getContext(), new int[0]);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\a\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */