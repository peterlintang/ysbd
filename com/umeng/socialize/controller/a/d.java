package com.umeng.socialize.controller.a;

import android.content.Context;
import com.umeng.socialize.bean.UMComment;
import com.umeng.socialize.bean.m;
import com.umeng.socialize.controller.listener.SocializeListeners.MulStatusListener;

class d
  extends ay<Integer>
{
  d(b paramb, SocializeListeners.MulStatusListener paramMulStatusListener, z paramz, Context paramContext, UMComment paramUMComment, m[] paramArrayOfm) {}
  
  protected void a()
  {
    super.a();
    if (this.b != null) {
      this.b.onStart();
    }
  }
  
  protected void a(Integer paramInteger)
  {
    super.a(paramInteger);
    if (200 != paramInteger.intValue()) {
      b.a(this.a, null, paramInteger);
    }
    if (this.b != null) {
      this.b.onComplete(null, paramInteger.intValue(), this.a.a);
    }
  }
  
  protected Integer b()
  {
    return Integer.valueOf(this.c.a(this.d, this.e, this.f));
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\controller\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */