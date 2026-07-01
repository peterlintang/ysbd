package com.ireadercity.b2.share;

import android.widget.Toast;
import com.tencent.mm.sdk.openapi.e;
import com.umeng.socialize.bean.CustomPlatform;
import com.umeng.socialize.bean.UMShareMsg;
import com.umeng.socialize.controller.RequestType;
import com.umeng.socialize.controller.UMServiceFactory;
import com.umeng.socialize.controller.UMSocialService;
import com.umeng.socialize.controller.listener.SocializeListeners.OnCustomPlatformClickListener;
import com.umeng.socialize.media.UMRichMedia;
import com.umeng.socialize.media.UMediaObject;

final class k
  implements SocializeListeners.OnCustomPlatformClickListener
{
  k(UMShareActivity paramUMShareActivity) {}
  
  public final void onClick(CustomPlatform paramCustomPlatform, String paramString, UMediaObject paramUMediaObject)
  {
    if (paramString == null) {}
    for (int i = 1;; i = 0)
    {
      paramCustomPlatform = paramString;
      if ((i | "".equals(paramString)) != 0) {
        paramCustomPlatform = "书香云集是一个源起iOS平台的Epub，TXT，PDF格式文档阅读软件，和与之配套的云端书库共同构建了一个“阅读”、“分享”、“评论”的生态圈。秉承着用户自由分享的原则，书香云集渐渐成长为一个书友交流的平台，一个修养提升的阶梯，一个相伴成长的忠实好友。";
      }
      if (this.a.a.a()) {
        break;
      }
      Toast.makeText(this.a, "你还没有安装微信", 0).show();
      return;
    }
    if (!this.a.a.b())
    {
      Toast.makeText(this.a, "你安装的微信版本不支持当前API", 0).show();
      return;
    }
    this.a.a.c();
    paramString = this.a;
    boolean bool = UMShareActivity.a(this.a.a, paramCustomPlatform, paramUMediaObject, false);
    if (bool)
    {
      paramString = UMServiceFactory.getUMSocialService("umeng_activitybar", RequestType.ANALYTICS);
      UMShareMsg localUMShareMsg = new UMShareMsg();
      localUMShareMsg.text = paramCustomPlatform;
      localUMShareMsg.setMediaData(UMRichMedia.toUMRichMedia(paramUMediaObject));
      paramString.postShareByCustomPlatform(this.a, null, "wxsession", localUMShareMsg, null);
    }
    paramUMediaObject = this.a;
    paramString = paramCustomPlatform;
    if ("#" + bool + "[WX]  " + paramCustomPlatform == null) {
      paramString = "";
    }
    Toast.makeText(paramUMediaObject, paramString, 0).show();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\share\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */