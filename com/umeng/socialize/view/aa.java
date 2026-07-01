package com.umeng.socialize.view;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.umeng.socialize.controller.listener.SocializeListeners.OauthCallbackListener;

class aa
  implements View.OnClickListener
{
  aa(q.a parama, SocializeListeners.OauthCallbackListener paramOauthCallbackListener) {}
  
  public void onClick(View paramView)
  {
    if (!this.a.d)
    {
      q.a(q.a.a(this.a), this.a.a, this.b);
      return;
    }
    if (this.a.c.getVisibility() == 0)
    {
      this.a.c.setVisibility(4);
      return;
    }
    this.a.c.setVisibility(0);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */