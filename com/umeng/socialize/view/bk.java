package com.umeng.socialize.view;

import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.bean.SocializeConfig;
import com.umeng.socialize.bean.SocializeEntity;
import com.umeng.socialize.common.m;
import com.umeng.socialize.controller.UMSocialService;
import com.umeng.socialize.controller.listener.SocializeListeners.SnsPostListener;
import com.umeng.socialize.view.controller.UMBroadcastManager;

class bk
  implements SocializeListeners.SnsPostListener
{
  SocializeListeners.SnsPostListener[] a;
  
  bk(ShareActivity paramShareActivity) {}
  
  public void onComplete(SHARE_MEDIA paramSHARE_MEDIA, int paramInt, SocializeEntity paramSocializeEntity)
  {
    m.a(ShareActivity.o(this.b));
    if (paramInt == 200)
    {
      ShareActivity.p(this.b);
      paramSocializeEntity.IncrementSc();
      UMBroadcastManager.sendEntityChange(ShareActivity.m(this.b), paramSocializeEntity.descriptor);
      if (ShareActivity.n(this.b).getConfig().isSendBlock()) {
        this.b.b();
      }
    }
    SocializeListeners.SnsPostListener[] arrayOfSnsPostListener;
    int j;
    int i;
    if (this.a != null)
    {
      arrayOfSnsPostListener = this.a;
      j = arrayOfSnsPostListener.length;
      i = 0;
    }
    for (;;)
    {
      if (i >= j)
      {
        this.a = null;
        return;
      }
      arrayOfSnsPostListener[i].onComplete(paramSHARE_MEDIA, paramInt, paramSocializeEntity);
      i += 1;
    }
  }
  
  public void onStart()
  {
    SocializeListeners.SnsPostListener[] arrayOfSnsPostListener;
    int j;
    int i;
    if (ShareActivity.n(this.b).getConfig().isSendBlock())
    {
      m.a(ShareActivity.o(this.b), false);
      this.a = ((SocializeListeners.SnsPostListener[])ShareActivity.n(this.b).getConfig().getListener(SocializeListeners.SnsPostListener.class));
      if (this.a != null)
      {
        arrayOfSnsPostListener = this.a;
        j = arrayOfSnsPostListener.length;
        i = 0;
      }
    }
    for (;;)
    {
      if (i >= j)
      {
        return;
        this.b.b();
        break;
      }
      arrayOfSnsPostListener[i].onStart();
      i += 1;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\bk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */