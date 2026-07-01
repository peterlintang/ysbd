package com.umeng.socialize.view;

import android.content.res.Resources;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Toast;
import com.umeng.socialize.a.c;
import com.umeng.socialize.bean.SocializeConfig;
import com.umeng.socialize.common.b.a;
import com.umeng.socialize.controller.UMSocialService;
import java.util.List;

class u
  implements View.OnClickListener
{
  u(q paramq) {}
  
  public void onClick(View paramView)
  {
    int i = 1;
    if ((com.umeng.socom.b.a(q.g(this.a), "android.permission.ACCESS_NETWORK_STATE")) && (!com.umeng.socom.b.m(q.g(this.a))))
    {
      Toast.makeText(q.g(this.a), q.g(this.a).getResources().getString(com.umeng.socialize.common.b.a(q.g(this.a), b.a.e, "umeng_socialize_network_break_alert")), 1).show();
      return;
    }
    if (TextUtils.isEmpty(q.i(this.a).getText().toString().trim()))
    {
      Toast.makeText(q.g(this.a), "输入内容为空...", 0).show();
      return;
    }
    boolean bool = c.f(q.g(this.a));
    if ((q.d(this.a) == null) || (q.f(this.a).getConfig().getPlatforms().size() == 0)) {
      i = 0;
    }
    if ((q.b()) && (!bool) && (i != 0))
    {
      q.f(this.a).showLoginDialog(q.g(this.a), new v(this));
      return;
    }
    q.j(this.a);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */