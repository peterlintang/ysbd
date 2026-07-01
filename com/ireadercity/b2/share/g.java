package com.ireadercity.b2.share;

import android.text.TextUtils;
import android.widget.Toast;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.controller.listener.SocializeListeners.DirectShareListener;

final class g
  implements SocializeListeners.DirectShareListener
{
  g(UMShareActivity paramUMShareActivity) {}
  
  public final void onAuthenticated(SHARE_MEDIA paramSHARE_MEDIA)
  {
    Toast.makeText(UMShareActivity.a(this.a), "已授权，直接打开。", 0).show();
  }
  
  public final void onOauthComplete(String paramString, SHARE_MEDIA paramSHARE_MEDIA)
  {
    if (!TextUtils.isEmpty(paramString))
    {
      Toast.makeText(UMShareActivity.a(this.a), "授权成功【usid:" + paramString + "】", 0).show();
      return;
    }
    Toast.makeText(UMShareActivity.a(this.a), "授权失败,请重试！", 1).show();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\share\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */