package com.umeng.socialize.view;

import android.app.ProgressDialog;
import android.widget.Toast;
import com.umeng.socialize.bean.MultiStatus;
import com.umeng.socialize.bean.SocializeConfig;
import com.umeng.socialize.bean.SocializeEntity;
import com.umeng.socialize.bean.o;
import com.umeng.socialize.common.m;
import com.umeng.socialize.controller.UMSocialService;
import com.umeng.socialize.controller.listener.SocializeListeners.MulStatusListener;
import com.umeng.socialize.view.controller.UMBroadcastManager;

class t
  implements SocializeListeners.MulStatusListener
{
  SocializeListeners.MulStatusListener[] a;
  
  t(q paramq) {}
  
  public void onComplete(MultiStatus paramMultiStatus, int paramInt, SocializeEntity paramSocializeEntity)
  {
    int j = 0;
    m.a(q.e(this.b));
    int i;
    label107:
    SocializeListeners.MulStatusListener[] arrayOfMulStatusListener;
    int k;
    if (paramInt == 200)
    {
      q.g(this.b).reflushData();
      i = 0;
      if (i >= q.h(this.b))
      {
        paramSocializeEntity.IncrementCc();
        q.a(this.b, 0);
        UMBroadcastManager.sendEntityChange(q.g(this.b), paramSocializeEntity.descriptor);
        Toast.makeText(q.g(this.b), "发送成功.", 0).show();
        if (q.d(this.b).isSendBlock()) {
          m.a(this.b);
        }
        if (this.a != null)
        {
          arrayOfMulStatusListener = this.a;
          k = arrayOfMulStatusListener.length;
          i = j;
        }
      }
    }
    for (;;)
    {
      if (i >= k)
      {
        return;
        paramSocializeEntity.IncrementSc();
        i += 1;
        break;
        o.a(q.g(this.b), paramInt, "发送失败，请重试。");
        break label107;
      }
      arrayOfMulStatusListener[i].onComplete(paramMultiStatus, paramInt, paramSocializeEntity);
      i += 1;
    }
  }
  
  public void onStart()
  {
    SocializeListeners.MulStatusListener[] arrayOfMulStatusListener;
    int j;
    int i;
    if (q.d(this.b).isSendBlock())
    {
      q.e(this.b).setMessage("发送中...");
      m.a(q.e(this.b), false);
      this.a = ((SocializeListeners.MulStatusListener[])q.f(this.b).getConfig().getListener(SocializeListeners.MulStatusListener.class));
      if (this.a != null)
      {
        arrayOfMulStatusListener = this.a;
        j = arrayOfMulStatusListener.length;
        i = 0;
      }
    }
    for (;;)
    {
      if (i >= j)
      {
        return;
        m.a(this.b);
        break;
      }
      arrayOfMulStatusListener[i].onStart();
      i += 1;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */