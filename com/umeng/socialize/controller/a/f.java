package com.umeng.socialize.controller.a;

import android.content.Context;
import com.umeng.socialize.bean.MultiStatus;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.bean.UMShareMsg;
import com.umeng.socialize.bean.m;
import com.umeng.socialize.controller.listener.SocializeListeners.SnsPostListener;

class f
  extends ay<Integer>
{
  f(b paramb, SocializeListeners.SnsPostListener paramSnsPostListener, String paramString1, String paramString2, z paramz, Context paramContext, UMShareMsg paramUMShareMsg) {}
  
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
    SHARE_MEDIA localSHARE_MEDIA = SHARE_MEDIA.convertToEmun(this.c);
    if (paramInteger.intValue() != 200) {
      b.a(this.a, localSHARE_MEDIA, paramInteger);
    }
    if (this.b != null) {
      this.b.onComplete(localSHARE_MEDIA, paramInteger.intValue(), this.a.a);
    }
  }
  
  protected Integer b()
  {
    Object localObject1 = new m(this.c, this.d);
    Object localObject2 = this.e;
    Context localContext = this.f;
    UMShareMsg localUMShareMsg = this.g;
    localObject1 = ((z)localObject2).a(localContext, new m[] { localObject1 }, localUMShareMsg);
    localObject2 = SHARE_MEDIA.convertToEmun(this.c);
    if (localObject2 != null)
    {
      int i = ((MultiStatus)localObject1).getPlatformStatus((SHARE_MEDIA)localObject2);
      if (-102 == i) {
        return Integer.valueOf(((MultiStatus)localObject1).getStCode());
      }
      return Integer.valueOf(i);
    }
    return Integer.valueOf(((MultiStatus)localObject1).getStCode());
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\controller\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */