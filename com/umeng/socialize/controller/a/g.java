package com.umeng.socialize.controller.a;

import android.content.Context;
import com.umeng.socialize.bean.MultiStatus;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.bean.UMShareMsg;
import com.umeng.socialize.bean.m;
import com.umeng.socialize.controller.listener.SocializeListeners.MulStatusListener;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class g
  extends ay<MultiStatus>
{
  g(b paramb, SocializeListeners.MulStatusListener paramMulStatusListener, z paramz, Context paramContext, m[] paramArrayOfm, UMShareMsg paramUMShareMsg, Map paramMap) {}
  
  protected void a()
  {
    super.a();
    if (this.b != null) {
      this.b.onStart();
    }
  }
  
  protected void a(MultiStatus paramMultiStatus)
  {
    super.a(paramMultiStatus);
    Map localMap = paramMultiStatus.getPlatformCode();
    localMap.putAll(this.g);
    Iterator localIterator = localMap.keySet().iterator();
    for (;;)
    {
      if (!localIterator.hasNext())
      {
        if (this.b != null) {
          this.b.onComplete(paramMultiStatus, paramMultiStatus.getStCode(), this.a.a);
        }
        return;
      }
      SHARE_MEDIA localSHARE_MEDIA = (SHARE_MEDIA)localIterator.next();
      int i = ((Integer)localMap.get(localSHARE_MEDIA)).intValue();
      if (200 != i) {
        b.a(this.a, localSHARE_MEDIA, Integer.valueOf(i));
      }
    }
  }
  
  protected MultiStatus b()
  {
    return this.c.a(this.d, this.e, this.f);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\controller\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */