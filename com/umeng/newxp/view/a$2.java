package com.umeng.newxp.view;

import android.view.View;
import android.view.View.OnClickListener;
import com.umeng.newxp.Promoter;
import com.umeng.newxp.controller.XpListenersCenter.ListClickListener;
import com.umeng.newxp.controller.a.a;
import com.umeng.newxp.controller.b;

class a$2
  implements View.OnClickListener
{
  a$2(a parama, Promoter paramPromoter, int paramInt) {}
  
  public void onClick(View paramView)
  {
    if (this.c.a != null)
    {
      this.c.a.click(this.a);
      return;
    }
    b.a(new a.a(this.a, this.b), a.a(this.c), a.b(this.c), false, this.b);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\a$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */