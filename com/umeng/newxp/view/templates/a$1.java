package com.umeng.newxp.view.templates;

import android.view.View;
import com.umeng.newxp.Promoter;
import com.umeng.newxp.a.b;
import com.umeng.newxp.a.c;
import com.umeng.newxp.controller.XpListenersCenter.AdapterListener;
import com.umeng.newxp.controller.XpListenersCenter.FitType;

class a$1
  implements XpListenersCenter.AdapterListener
{
  a$1(a parama) {}
  
  public void onFitType(View paramView, Promoter paramPromoter, XpListenersCenter.FitType paramFitType)
  {
    paramView = paramView.findViewById(c.H(a.a(this.a)));
    switch (a.5.a[paramFitType.ordinal()])
    {
    default: 
      return;
    case 1: 
      paramView.setBackgroundResource(b.f(a.a(this.a)));
      return;
    case 2: 
      paramView.setBackgroundResource(b.e(a.a(this.a)));
      return;
    case 3: 
      paramView.setBackgroundResource(b.d(a.a(this.a)));
      return;
    }
    paramView.setBackgroundResource(b.g(a.a(this.a)));
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\templates\a$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */