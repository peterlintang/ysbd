package com.umeng.socialize.view.a;

import android.view.View;
import android.view.View.OnClickListener;

class u
  implements View.OnClickListener
{
  u(t paramt) {}
  
  public void onClick(View paramView)
  {
    if ((this.a.getImageBytes() != null) && (this.a.getImageBytes().length > 0))
    {
      t.a(this.a);
      return;
    }
    t.b(this.a);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\a\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */