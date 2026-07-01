package com.umeng.socialize.view;

import android.widget.Toast;
import com.umeng.socialize.a.d;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.bean.SocializeEntity;
import com.umeng.socialize.bean.o;
import com.umeng.socialize.controller.listener.SocializeListeners.SnsPostListener;

class ca
  implements SocializeListeners.SnsPostListener
{
  ca(ShareActivity paramShareActivity) {}
  
  public void onComplete(SHARE_MEDIA paramSHARE_MEDIA, int paramInt, SocializeEntity paramSocializeEntity)
  {
    if (paramInt == 200)
    {
      Toast.makeText(ShareActivity.m(this.a), "发送成功.", 0).show();
      return;
    }
    if ((paramInt == 5027) || (paramInt == 5028))
    {
      o.a(ShareActivity.m(this.a), paramInt, "授权已过期，请重新授权。");
      d.d(ShareActivity.m(this.a), paramSHARE_MEDIA);
      return;
    }
    o.a(ShareActivity.m(this.a), paramInt, "发送失败，请重试。");
  }
  
  public void onStart() {}
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\ca.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */