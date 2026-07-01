package com.umeng.socialize.controller;

import android.content.Context;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.bean.SnsAccount;
import com.umeng.socialize.bean.SocializeConfig;
import com.umeng.socialize.bean.SocializeEntity;
import com.umeng.socialize.bean.UMComment;
import com.umeng.socialize.bean.UMShareMsg;
import com.umeng.socialize.bean.e.a;
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

public abstract interface UMSocialService
{
  public abstract void deleteOauth(Context paramContext, SHARE_MEDIA paramSHARE_MEDIA, SocializeListeners.SocializeClientListener paramSocializeClientListener);
  
  public abstract void directShare(Context paramContext, SHARE_MEDIA paramSHARE_MEDIA, SocializeListeners.DirectShareListener paramDirectShareListener);
  
  public abstract void doOauthVerify(Context paramContext, SHARE_MEDIA paramSHARE_MEDIA, SocializeListeners.OauthCallbackListener paramOauthCallbackListener);
  
  public abstract void follow(Context paramContext, SHARE_MEDIA paramSHARE_MEDIA, SocializeListeners.MulStatusListener paramMulStatusListener, String... paramVarArgs);
  
  public abstract void getComments(Context paramContext, SocializeListeners.FetchCommetsListener paramFetchCommetsListener, long paramLong);
  
  public abstract SocializeConfig getConfig();
  
  public abstract SocializeEntity getEntity();
  
  public abstract void getFriends(Context paramContext, SocializeListeners.FetchFriendsListener paramFetchFriendsListener, SHARE_MEDIA paramSHARE_MEDIA);
  
  public abstract void getPlatformInfo(Context paramContext, SHARE_MEDIA paramSHARE_MEDIA, SocializeListeners.PlatformInfoListener paramPlatformInfoListener);
  
  public abstract void getUserInfo(Context paramContext, SocializeListeners.FetchUserListener paramFetchUserListener);
  
  public abstract boolean hasShareContent();
  
  public abstract boolean hasShareImage();
  
  public abstract void initEntity(Context paramContext, SocializeListeners.SocializeClientListener paramSocializeClientListener);
  
  public abstract void likeChange(Context paramContext, SocializeListeners.SocializeClientListener paramSocializeClientListener);
  
  public abstract void login(Context paramContext, SHARE_MEDIA paramSHARE_MEDIA, SocializeListeners.SocializeClientListener paramSocializeClientListener);
  
  public abstract void login(Context paramContext, SnsAccount paramSnsAccount, SocializeListeners.SocializeClientListener paramSocializeClientListener);
  
  public abstract void loginout(Context paramContext, SocializeListeners.SocializeClientListener paramSocializeClientListener);
  
  public abstract void openComment(Context paramContext, boolean paramBoolean);
  
  public abstract void openShare(Context paramContext, boolean paramBoolean);
  
  public abstract void openUserCenter(Context paramContext, int... paramVarArgs);
  
  public abstract void postComment(Context paramContext, UMComment paramUMComment, SocializeListeners.MulStatusListener paramMulStatusListener, SHARE_MEDIA... paramVarArgs);
  
  public abstract void postLike(Context paramContext, SocializeListeners.SocializeClientListener paramSocializeClientListener);
  
  public abstract void postShare(Context paramContext, SHARE_MEDIA paramSHARE_MEDIA, UMShareMsg paramUMShareMsg, SocializeListeners.SnsPostListener paramSnsPostListener);
  
  public abstract void postShare(Context paramContext, String paramString, SHARE_MEDIA paramSHARE_MEDIA, UMShareMsg paramUMShareMsg, SocializeListeners.SnsPostListener paramSnsPostListener);
  
  public abstract void postShareByCustomPlatform(Context paramContext, String paramString1, String paramString2, UMShareMsg paramUMShareMsg, SocializeListeners.SnsPostListener paramSnsPostListener);
  
  public abstract void postShareByID(Context paramContext, String paramString1, String paramString2, SHARE_MEDIA paramSHARE_MEDIA, SocializeListeners.SnsPostListener paramSnsPostListener);
  
  public abstract void postShareMulti(Context paramContext, UMShareMsg paramUMShareMsg, SocializeListeners.MulStatusListener paramMulStatusListener, SHARE_MEDIA... paramVarArgs);
  
  public abstract void postUnLike(Context paramContext, SocializeListeners.SocializeClientListener paramSocializeClientListener);
  
  public abstract boolean registerListener(e.a parama);
  
  public abstract boolean registerListener(e.a parama, int paramInt);
  
  public abstract void setConfig(SocializeConfig paramSocializeConfig);
  
  public abstract void setCustomId(String paramString);
  
  public abstract void setEntityName(String paramString);
  
  public abstract void setGlobalConfig(SocializeConfig paramSocializeConfig);
  
  public abstract void setShareContent(String paramString);
  
  @Deprecated
  public abstract void setShareImage(UMImage paramUMImage);
  
  public abstract boolean setShareMedia(UMediaObject paramUMediaObject);
  
  public abstract void shareEmail(Context paramContext);
  
  public abstract void shareSms(Context paramContext);
  
  public abstract void showLoginDialog(Context paramContext, SocializeListeners.LoginListener paramLoginListener);
  
  public abstract void showPostComment(Context paramContext);
  
  public abstract boolean unregisterListener(e.a parama);
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\controller\UMSocialService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */