package com.umeng.socialize.view.a;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.ViewFlipper;
import com.umeng.socialize.common.SocializeConstants;
import com.umeng.socialize.view.controller.d;
import com.umeng.socialize.view.controller.d.b;
import com.umeng.socialize.view.controller.d.c;

class ah
  implements d.b
{
  ah(ag paramag) {}
  
  public void a(d.c paramc)
  {
    if (paramc == d.c.a)
    {
      this.a.a.setVisibility(0);
      return;
    }
    paramc = ag.a(this.a).b();
    if (paramc != null)
    {
      this.a.a(paramc);
      this.a.b();
      ag.b(this.a).setDisplayedChild(1);
    }
    for (;;)
    {
      this.a.a.setVisibility(8);
      return;
      if (!TextUtils.isEmpty(SocializeConstants.GUIDENAME))
      {
        ag.c(this.a).setText(SocializeConstants.GUIDENAME);
        ag.d(this.a).setText(ag.e(this.a));
      }
      this.a.b();
      ag.b(this.a).setDisplayedChild(0);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\a\ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */