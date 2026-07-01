package com.umeng.socialize.view.a;

import android.content.Context;
import com.umeng.socialize.bean.n;
import com.umeng.socialize.view.controller.d;
import java.util.Map;

class ap
  extends at.b
{
  ap(ag paramag, Context paramContext)
  {
    super(paramContext);
  }
  
  public void a(n paramn) {}
  
  protected void a(n paramn, boolean paramBoolean)
  {
    super.a(paramn, paramBoolean);
    if (ag.h(this.a).containsKey(paramn)) {
      ((ag.a)ag.h(this.a).get(paramn)).a.a = false;
    }
    if (!paramBoolean)
    {
      ag.a locala = (ag.a)ag.h(this.a).get(paramn);
      ag.a(this.a, locala.a, paramn.e);
    }
  }
  
  public void b(n paramn) {}
  
  public void c(n paramn)
  {
    ag.a(this.a).a(paramn, new aq(this, paramn));
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\a\ap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */