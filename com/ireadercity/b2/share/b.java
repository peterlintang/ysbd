package com.ireadercity.b2.share;

import android.widget.Toast;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.bean.SocializeEntity;
import com.umeng.socialize.controller.listener.SocializeListeners.SnsPostListener;

final class b
  implements SocializeListeners.SnsPostListener
{
  b(MeachilShareActivity paramMeachilShareActivity) {}
  
  public final void onComplete(SHARE_MEDIA paramSHARE_MEDIA, int paramInt, SocializeEntity paramSocializeEntity)
  {
    if (paramInt == 200)
    {
      Toast.makeText(this.a.n, "分享成功.", 0).show();
      MeachilShareActivity.a(this.a, paramSHARE_MEDIA);
      MeachilShareActivity.a(this.a);
      this.a.a(paramSHARE_MEDIA);
      return;
    }
    paramSHARE_MEDIA = "";
    if (paramInt == -101) {
      paramSHARE_MEDIA = "没有授权";
    }
    Toast.makeText(this.a.n, "分享失败[" + paramInt + "] " + paramSHARE_MEDIA, 0).show();
  }
  
  public final void onStart()
  {
    Toast.makeText(this.a.n, "开始分享.", 0).show();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\share\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */