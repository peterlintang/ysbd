package com.umeng.socialize.controller.b;

import android.content.Context;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.bean.SnsAccount;
import com.umeng.socialize.bean.SocializeConfig;
import com.umeng.socialize.bean.SocializeEntity;
import com.umeng.socialize.bean.UMComment;
import com.umeng.socialize.bean.UMShareMsg;
import com.umeng.socialize.bean.e.a;
import com.umeng.socialize.controller.UMSocialService;
import com.umeng.socialize.controller.a.b;
import com.umeng.socialize.controller.listener.SocializeListeners.DirectShareListener;
import com.umeng.socialize.controller.listener.SocializeListeners.FetchCommetsListener;
import com.umeng.socialize.controller.listener.SocializeListeners.FetchFriendsListener;
import com.umeng.socialize.controller.listener.SocializeListeners.FetchUserListener;
import com.umeng.socialize.controller.listener.SocializeListeners.LoginListener;
import com.umeng.socialize.controller.listener.SocializeListeners.MulStatusListener;
import com.umeng.socialize.controller.listener.SocializeListeners.OauthCallbackListener;
import com.umeng.socialize.controller.listener.SocializeListeners.PlatformInfoListener;
import com.umeng.socialize.controller.listener.SocializeListeners.SnsPostListener;
import com.umeng.socialize.controller.listener.SocializeListeners.SocializeClientListener;
import com.umeng.socialize.media.UMImage;
import com.umeng.socialize.media.UMediaObject;

@c(a=b.class)
public class a
  implements UMSocialService
{
  public void deleteOauth(Context paramContext, SHARE_MEDIA paramSHARE_MEDIA, SocializeListeners.SocializeClientListener paramSocializeClientListener) {}
  
  public void directShare(Context paramContext, SHARE_MEDIA paramSHARE_MEDIA, SocializeListeners.DirectShareListener paramDirectShareListener) {}
  
  public void doOauthVerify(Context paramContext, SHARE_MEDIA paramSHARE_MEDIA, SocializeListeners.OauthCallbackListener paramOauthCallbackListener) {}
  
  public void follow(Context paramContext, SHARE_MEDIA paramSHARE_MEDIA, SocializeListeners.MulStatusListener paramMulStatusListener, String... paramVarArgs) {}
  
  public void getComments(Context paramContext, SocializeListeners.FetchCommetsListener paramFetchCommetsListener, long paramLong) {}
  
  public SocializeConfig getConfig()
  {
    return null;
  }
  
  @d
  public SocializeEntity getEntity()
  {
    return null;
  }
  
  public void getFriends(Context paramContext, SocializeListeners.FetchFriendsListener paramFetchFriendsListener, SHARE_MEDIA paramSHARE_MEDIA) {}
  
  public void getPlatformInfo(Context paramContext, SHARE_MEDIA paramSHARE_MEDIA, SocializeListeners.PlatformInfoListener paramPlatformInfoListener) {}
  
  public void getUserInfo(Context paramContext, SocializeListeners.FetchUserListener paramFetchUserListener) {}
  
  public boolean hasShareContent()
  {
    return false;
  }
  
  public boolean hasShareImage()
  {
    return false;
  }
  
  @d
  public void initEntity(Context paramContext, SocializeListeners.SocializeClientListener paramSocializeClientListener) {}
  
  @d
  public void likeChange(Context paramContext, SocializeListeners.SocializeClientListener paramSocializeClientListener) {}
  
  public void login(Context paramContext, SHARE_MEDIA paramSHARE_MEDIA, SocializeListeners.SocializeClientListener paramSocializeClientListener) {}
  
  public void login(Context paramContext, SnsAccount paramSnsAccount, SocializeListeners.SocializeClientListener paramSocializeClientListener) {}
  
  public void loginout(Context paramContext, SocializeListeners.SocializeClientListener paramSocializeClientListener) {}
  
  public void openComment(Context paramContext, boolean paramBoolean) {}
  
  public void openShare(Context paramContext, boolean paramBoolean) {}
  
  public void openUserCenter(Context paramContext, int... paramVarArgs) {}
  
  public void postComment(Context paramContext, UMComment paramUMComment, SocializeListeners.MulStatusListener paramMulStatusListener, SHARE_MEDIA... paramVarArgs) {}
  
  @d
  public void postLike(Context paramContext, SocializeListeners.SocializeClientListener paramSocializeClientListener) {}
  
  public void postShare(Context paramContext, SHARE_MEDIA paramSHARE_MEDIA, UMShareMsg paramUMShareMsg, SocializeListeners.SnsPostListener paramSnsPostListener) {}
  
  @d
  public void postShare(Context paramContext, String paramString, SHARE_MEDIA paramSHARE_MEDIA, UMShareMsg paramUMShareMsg, SocializeListeners.SnsPostListener paramSnsPostListener) {}
  
  @d
  public void postShareByCustomPlatform(Context paramContext, String paramString1, String paramString2, UMShareMsg paramUMShareMsg, SocializeListeners.SnsPostListener paramSnsPostListener) {}
  
  @d
  public void postShareByID(Context paramContext, String paramString1, String paramString2, SHARE_MEDIA paramSHARE_MEDIA, SocializeListeners.SnsPostListener paramSnsPostListener) {}
  
  public void postShareMulti(Context paramContext, UMShareMsg paramUMShareMsg, SocializeListeners.MulStatusListener paramMulStatusListener, SHARE_MEDIA... paramVarArgs) {}
  
  @d
  public void postUnLike(Context paramContext, SocializeListeners.SocializeClientListener paramSocializeClientListener) {}
  
  public boolean registerListener(e.a parama)
  {
    return false;
  }
  
  public boolean registerListener(e.a parama, int paramInt)
  {
    return false;
  }
  
  public void setConfig(SocializeConfig paramSocializeConfig) {}
  
  public void setCustomId(String paramString) {}
  
  @d
  public void setEntityName(String paramString) {}
  
  public void setGlobalConfig(SocializeConfig paramSocializeConfig) {}
  
  public void setShareContent(String paramString) {}
  
  public void setShareImage(UMImage paramUMImage) {}
  
  public boolean setShareMedia(UMediaObject paramUMediaObject)
  {
    return false;
  }
  
  public void shareEmail(Context paramContext) {}
  
  public void shareSms(Context paramContext) {}
  
  public void showLoginDialog(Context paramContext, SocializeListeners.LoginListener paramLoginListener) {}
  
  public void showPostComment(Context paramContext) {}
  
  public boolean unregisterListener(e.a parama)
  {
    return false;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\controller\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */