package com.ireadercity.b2.share;

import android.widget.Toast;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.bean.SocializeEntity;
import com.umeng.socialize.controller.listener.SocializeListeners.SnsPostListener;

final class n
  implements SocializeListeners.SnsPostListener
{
  n(UMShareActivity paramUMShareActivity) {}
  
  public final void onComplete(SHARE_MEDIA paramSHARE_MEDIA, int paramInt, SocializeEntity paramSocializeEntity)
  {
    Toast.makeText(UMShareActivity.a(this.a), "分享成功" + paramSocializeEntity.getShareContent(), 1).show();
  }
  
  public final void onStart() {}
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\share\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */