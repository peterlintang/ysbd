package com.umeng.socialize.view.a;

import android.view.View;
import android.view.View.OnClickListener;
import com.umeng.socialize.common.m;

class az
  implements View.OnClickListener
{
  az(at.b paramb) {}
  
  public void onClick(View paramView)
  {
    at.b.a(this.a, true);
    m.a(at.b.d(this.a));
    switch (at.b.a(this.a))
    {
    default: 
      return;
    case 1: 
      this.a.a(at.b.b(this.a));
      return;
    case 2: 
      this.a.b(at.b.b(this.a));
      return;
    }
    this.a.c(at.b.b(this.a));
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\a\az.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */