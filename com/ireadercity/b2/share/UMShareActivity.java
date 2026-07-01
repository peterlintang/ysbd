package com.ireadercity.b2.share;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageButton;
import com.tencent.mm.sdk.openapi.e;
import com.umeng.socialize.bean.CustomPlatform;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.bean.SocializeConfig;
import com.umeng.socialize.bean.UMShareMsg;
import com.umeng.socialize.controller.RequestType;
import com.umeng.socialize.controller.UMServiceFactory;
import com.umeng.socialize.controller.UMSocialService;
import com.umeng.socialize.controller.listener.SocializeListeners.DirectShareListener;
import com.umeng.socialize.controller.listener.SocializeListeners.MulStatusListener;
import com.umeng.socialize.controller.listener.SocializeListeners.SnsPostListener;
import com.umeng.socialize.controller.listener.SocializeListeners.SocializeClientListener;
import com.umeng.socialize.view.ActionBarView;

public class UMShareActivity
  extends Activity
{
  private static String i = "wxd63062465d5e6e10";
  public e a;
  ImageButton b;
  UMSocialService c;
  SocializeListeners.SnsPostListener d;
  SocializeListeners.DirectShareListener e;
  SocializeListeners.MulStatusListener f;
  SocializeListeners.SocializeClientListener g;
  private Context h;
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.h = this;
    this.a = com.tencent.mm.sdk.openapi.n.a(this, i);
    this.a.a(i);
    this.a.a(getIntent(), new f(this));
    setContentView(2130903095);
    paramBundle = (ViewGroup)findViewById(2131362093);
    Object localObject = new ActionBarView(this, "umeng_activitybar");
    ((ActionBarView)localObject).setLayoutParams(new ViewGroup.LayoutParams(-2, -1));
    paramBundle.addView((View)localObject);
    this.b = ((ImageButton)findViewById(2131361905));
    this.b.setOnClickListener(new j(this));
    localObject = new CustomPlatform("微信", 2130838189);
    ((CustomPlatform)localObject).clickListener = new k(this);
    paramBundle = UMServiceFactory.getUMSocialService("umeng_activitybar", RequestType.SOCIAL);
    paramBundle.getConfig().addCustomPlatform((CustomPlatform)localObject);
    localObject = new CustomPlatform("朋友圈", 2130838193);
    ((CustomPlatform)localObject).clickListener = new l(this);
    paramBundle.getConfig().addCustomPlatform((CustomPlatform)localObject);
    this.c = UMServiceFactory.getUMSocialService("ireader.city", RequestType.SOCIAL);
    this.c.openComment(this.h, false);
    this.c.setShareContent("书香云集是一个适用于Epub，TXT，PDF格式文档阅读软件，和与之配套的云端书库共同构建了一个“阅读”、“分享”、“评论”的生态圈。秉承着用户自由分享的原则，书香云集渐渐成长为一个书友交流的平台，一个修养提升的阶梯，一个相伴成长的忠实好友。我觉得还不错，分享给大家");
    paramBundle = new SocializeConfig();
    paramBundle.setPlatforms(new SHARE_MEDIA[] { SHARE_MEDIA.SINA });
    this.c.setConfig(paramBundle);
    paramBundle = new UMShareMsg();
    paramBundle.text = "书香云集是一个适用于Epub，TXT，PDF格式文档阅读软件，和与之配套的云端书库共同构建了一个“阅读”、“分享”、“评论”的生态圈。秉承着用户自由分享的原则，书香云集渐渐成长为一个书友交流的平台，一个修养提升的阶梯，一个相伴成长的忠实好友。我觉得还不错，分享给大家";
    this.c.postShare(this.h, SHARE_MEDIA.SINA, paramBundle, new m(this));
    this.d = new n(this);
    this.e = new g(this);
    this.f = new h(this);
    this.g = new i(this);
    this.c.registerListener(this.d);
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    this.c.unregisterListener(this.d);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\share\UMShareActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */