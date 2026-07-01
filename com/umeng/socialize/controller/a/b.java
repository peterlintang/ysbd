package com.umeng.socialize.controller.a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Parcelable;
import android.text.Html;
import android.text.TextUtils;
import android.widget.Toast;
import com.umeng.socialize.bean.MultiStatus;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.bean.SnsAccount;
import com.umeng.socialize.bean.SocializeConfig;
import com.umeng.socialize.bean.SocializeEntity;
import com.umeng.socialize.bean.UMComment;
import com.umeng.socialize.bean.UMShareMsg;
import com.umeng.socialize.bean.e.a;
import com.umeng.socialize.controller.UMSocialService;
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
import com.umeng.socialize.media.UMVedio;
import com.umeng.socialize.media.UMediaObject;
import com.umeng.socialize.media.UMusic;
import com.umeng.socialize.view.CommentActivity;
import com.umeng.socialize.view.ShareActivity;
import com.umeng.socialize.view.aj;
import com.umeng.socialize.view.at;
import com.umeng.socialize.view.bc;
import com.umeng.socialize.view.cl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class b
  extends z
  implements UMSocialService
{
  private static final String b = b.class.getName();
  private static SocializeConfig c = new SocializeConfig();
  
  public b(SocializeEntity paramSocializeEntity)
  {
    super(paramSocializeEntity);
  }
  
  private void a(Context paramContext, SHARE_MEDIA paramSHARE_MEDIA, SocializeListeners.SocializeClientListener paramSocializeClientListener)
  {
    new y(this, paramSocializeClientListener, this, paramContext, paramSHARE_MEDIA).d();
  }
  
  private void a(Context paramContext, com.umeng.socialize.bean.m[] paramArrayOfm, UMComment paramUMComment, SocializeListeners.MulStatusListener paramMulStatusListener)
  {
    new d(this, paramMulStatusListener, this, paramContext, paramUMComment, paramArrayOfm).d();
  }
  
  private void a(SHARE_MEDIA paramSHARE_MEDIA, Integer paramInteger) {}
  
  private com.umeng.socialize.bean.m[] a(Context paramContext, Map<SHARE_MEDIA, Integer> paramMap, SHARE_MEDIA... paramVarArgs)
  {
    ArrayList localArrayList = new ArrayList();
    int i;
    if (paramVarArgs != null)
    {
      int j = paramVarArgs.length;
      i = 0;
      if (i < j) {}
    }
    else
    {
      return (com.umeng.socialize.bean.m[])localArrayList.toArray(new com.umeng.socialize.bean.m[localArrayList.size()]);
    }
    SHARE_MEDIA localSHARE_MEDIA = paramVarArgs[i];
    if (com.umeng.socialize.a.d.a(paramContext, localSHARE_MEDIA)) {
      localArrayList.add(new com.umeng.socialize.bean.m(localSHARE_MEDIA.toString(), com.umeng.socialize.a.d.b(paramContext, localSHARE_MEDIA)));
    }
    for (;;)
    {
      i += 1;
      break;
      if (paramMap != null) {
        paramMap.put(localSHARE_MEDIA, Integer.valueOf(-101));
      }
    }
  }
  
  public void deleteOauth(Context paramContext, SHARE_MEDIA paramSHARE_MEDIA, SocializeListeners.SocializeClientListener paramSocializeClientListener)
  {
    new j(this, paramSocializeClientListener, this, paramContext, paramSHARE_MEDIA).d();
  }
  
  public void directShare(Context paramContext, SHARE_MEDIA paramSHARE_MEDIA, SocializeListeners.DirectShareListener paramDirectShareListener)
  {
    Intent localIntent = new Intent(paramContext, ShareActivity.class);
    localIntent.putExtra("dc", this.a.descriptor);
    localIntent.putExtra("sns", paramSHARE_MEDIA.toString());
    if (com.umeng.socialize.a.d.a(paramContext, paramSHARE_MEDIA))
    {
      if (paramDirectShareListener != null) {
        paramDirectShareListener.onAuthenticated(paramSHARE_MEDIA);
      }
      paramContext.startActivity(localIntent);
      return;
    }
    doOauthVerify(paramContext, paramSHARE_MEDIA, new o(this, paramDirectShareListener, paramContext, localIntent));
  }
  
  public void doOauthVerify(Context paramContext, SHARE_MEDIA paramSHARE_MEDIA, SocializeListeners.OauthCallbackListener paramOauthCallbackListener)
  {
    paramOauthCallbackListener = new p(this, paramContext, paramOauthCallbackListener, (SocializeListeners.OauthCallbackListener[])getConfig().getListener(SocializeListeners.OauthCallbackListener.class));
    com.umeng.socialize.common.m.a(new at(paramContext, this.a, paramSHARE_MEDIA, paramOauthCallbackListener), false);
  }
  
  public void follow(Context paramContext, SHARE_MEDIA paramSHARE_MEDIA, SocializeListeners.MulStatusListener paramMulStatusListener, String... paramVarArgs)
  {
    if (com.umeng.socialize.a.d.a(paramContext, paramSHARE_MEDIA))
    {
      str = com.umeng.socialize.a.d.b(paramContext, paramSHARE_MEDIA);
      new q(this, paramMulStatusListener, this, paramContext, new com.umeng.socialize.bean.m(paramSHARE_MEDIA.toString(), str), paramVarArgs, paramSHARE_MEDIA).d();
    }
    while (paramMulStatusListener == null)
    {
      String str;
      return;
    }
    paramMulStatusListener.onStart();
    paramMulStatusListener.onComplete(new MultiStatus(-101), -101, this.a);
  }
  
  public void getComments(Context paramContext, SocializeListeners.FetchCommetsListener paramFetchCommetsListener, long paramLong)
  {
    new u(this, paramFetchCommetsListener, this, paramContext, paramLong).d();
  }
  
  public SocializeConfig getConfig()
  {
    if (this.a.getEntityConfig() == null)
    {
      if (c == null) {
        c = new SocializeConfig();
      }
      return c;
    }
    return this.a.getEntityConfig();
  }
  
  public void getFriends(Context paramContext, SocializeListeners.FetchFriendsListener paramFetchFriendsListener, SHARE_MEDIA paramSHARE_MEDIA)
  {
    String str = com.umeng.socialize.a.d.b(paramContext, paramSHARE_MEDIA);
    if (TextUtils.isEmpty(str))
    {
      if (paramFetchFriendsListener != null) {
        paramFetchFriendsListener.onStart();
      }
      if (paramFetchFriendsListener != null) {
        paramFetchFriendsListener.onComplete(-101, null);
      }
    }
    new i(this, paramFetchFriendsListener, this, paramContext, paramSHARE_MEDIA, str).d();
  }
  
  public void getPlatformInfo(Context paramContext, SHARE_MEDIA paramSHARE_MEDIA, SocializeListeners.PlatformInfoListener paramPlatformInfoListener)
  {
    if (com.umeng.socialize.a.d.a(paramContext, paramSHARE_MEDIA))
    {
      str = com.umeng.socialize.a.d.b(paramContext, paramSHARE_MEDIA);
      new r(this, paramPlatformInfoListener, this, paramContext, new com.umeng.socialize.bean.m(paramSHARE_MEDIA.toString(), str)).d();
    }
    while (paramPlatformInfoListener == null)
    {
      String str;
      return;
    }
    paramPlatformInfoListener.onStart();
    paramPlatformInfoListener.onComplete(-102, null);
  }
  
  public void getUserInfo(Context paramContext, SocializeListeners.FetchUserListener paramFetchUserListener)
  {
    new e(this, paramFetchUserListener, this, paramContext).d();
  }
  
  public boolean hasShareContent()
  {
    return (this.a != null) && (!TextUtils.isEmpty(this.a.getShareContent()));
  }
  
  public boolean hasShareImage()
  {
    return (this.a != null) && (this.a.getMedia() != null);
  }
  
  public void initEntity(Context paramContext, SocializeListeners.SocializeClientListener paramSocializeClientListener)
  {
    new c(this, paramSocializeClientListener, this, paramContext).d();
  }
  
  public void likeChange(Context paramContext, SocializeListeners.SocializeClientListener paramSocializeClientListener)
  {
    new n(this, paramSocializeClientListener, this, paramContext).d();
  }
  
  public void login(Context paramContext, SHARE_MEDIA paramSHARE_MEDIA, SocializeListeners.SocializeClientListener paramSocializeClientListener)
  {
    if (com.umeng.socialize.a.d.a(paramContext, paramSHARE_MEDIA))
    {
      a(paramContext, paramSHARE_MEDIA, paramSocializeClientListener);
      return;
    }
    doOauthVerify(paramContext, paramSHARE_MEDIA, new v(this, paramContext, paramSocializeClientListener));
  }
  
  public void login(Context paramContext, SnsAccount paramSnsAccount, SocializeListeners.SocializeClientListener paramSocializeClientListener)
  {
    new w(this, paramSocializeClientListener, paramContext, paramSnsAccount).d();
  }
  
  public void loginout(Context paramContext, SocializeListeners.SocializeClientListener paramSocializeClientListener)
  {
    new x(this, paramSocializeClientListener, this, paramContext).d();
  }
  
  public void openComment(Context paramContext, boolean paramBoolean)
  {
    Intent localIntent = new Intent(paramContext, CommentActivity.class);
    localIntent.putExtra("dc", this.a.descriptor);
    if (paramBoolean)
    {
      showLoginDialog(paramContext, new k(this, paramContext, localIntent));
      return;
    }
    paramContext.startActivity(localIntent);
  }
  
  public void openShare(Context paramContext, boolean paramBoolean)
  {
    bc localbc = new bc(paramContext, this.a.descriptor);
    if (paramBoolean)
    {
      showLoginDialog(paramContext, new l(this, localbc, paramContext));
      return;
    }
    localbc.a();
  }
  
  public void openUserCenter(Context paramContext, int... paramVarArgs)
  {
    int j = 0;
    int i = j;
    if (paramVarArgs != null)
    {
      i = j;
      if (paramVarArgs.length > 0) {
        i = paramVarArgs[0];
      }
    }
    paramVarArgs = new cl(paramContext, this.a.descriptor, i);
    if (1 == (i & 0xF))
    {
      showLoginDialog(paramContext, new m(this, paramVarArgs, paramContext));
      return;
    }
    paramVarArgs.show();
  }
  
  public void postComment(Context paramContext, UMComment paramUMComment, SocializeListeners.MulStatusListener paramMulStatusListener, SHARE_MEDIA... paramVarArgs)
  {
    a(paramContext, a(paramContext, new HashMap(), paramVarArgs), paramUMComment, paramMulStatusListener);
  }
  
  public void postLike(Context paramContext, SocializeListeners.SocializeClientListener paramSocializeClientListener)
  {
    new s(this, paramSocializeClientListener, this, paramContext).d();
  }
  
  public void postShare(Context paramContext, SHARE_MEDIA paramSHARE_MEDIA, UMShareMsg paramUMShareMsg, SocializeListeners.SnsPostListener paramSnsPostListener)
  {
    if (com.umeng.socialize.a.d.a(paramContext, paramSHARE_MEDIA))
    {
      str = com.umeng.socialize.a.d.b(paramContext, paramSHARE_MEDIA);
      if (paramUMShareMsg.text == null) {
        paramUMShareMsg.text = "";
      }
      postShare(paramContext, str, paramSHARE_MEDIA, paramUMShareMsg, paramSnsPostListener);
    }
    while (paramSnsPostListener == null)
    {
      String str;
      return;
    }
    paramSnsPostListener.onStart();
    paramSnsPostListener.onComplete(paramSHARE_MEDIA, -101, this.a);
  }
  
  public void postShare(Context paramContext, String paramString, SHARE_MEDIA paramSHARE_MEDIA, UMShareMsg paramUMShareMsg, SocializeListeners.SnsPostListener paramSnsPostListener)
  {
    postShareByCustomPlatform(paramContext, paramString, paramSHARE_MEDIA.toString(), paramUMShareMsg, paramSnsPostListener);
  }
  
  public void postShareByCustomPlatform(Context paramContext, String paramString1, String paramString2, UMShareMsg paramUMShareMsg, SocializeListeners.SnsPostListener paramSnsPostListener)
  {
    new f(this, paramSnsPostListener, paramString2, paramString1, this, paramContext, paramUMShareMsg).d();
  }
  
  public void postShareByID(Context paramContext, String paramString1, String paramString2, SHARE_MEDIA paramSHARE_MEDIA, SocializeListeners.SnsPostListener paramSnsPostListener)
  {
    new h(this, paramSnsPostListener, paramSHARE_MEDIA, paramString2, paramString1, this, paramContext).d();
  }
  
  public void postShareMulti(Context paramContext, UMShareMsg paramUMShareMsg, SocializeListeners.MulStatusListener paramMulStatusListener, SHARE_MEDIA... paramVarArgs)
  {
    HashMap localHashMap = new HashMap();
    paramVarArgs = a(paramContext, localHashMap, paramVarArgs);
    if ((paramVarArgs != null) && (paramVarArgs.length > 0)) {
      new g(this, paramMulStatusListener, this, paramContext, paramVarArgs, paramUMShareMsg, localHashMap).d();
    }
    while (paramMulStatusListener == null) {
      return;
    }
    paramMulStatusListener.onStart();
    paramContext = new MultiStatus(-105);
    paramContext.setPlatformCode(localHashMap);
    paramMulStatusListener.onComplete(paramContext, -105, this.a);
  }
  
  public void postUnLike(Context paramContext, SocializeListeners.SocializeClientListener paramSocializeClientListener)
  {
    new t(this, paramSocializeClientListener, this, paramContext).d();
  }
  
  public boolean registerListener(e.a parama)
  {
    return getConfig().registerListener(parama);
  }
  
  public boolean registerListener(e.a parama, int paramInt)
  {
    return getConfig().registerListener(parama, paramInt);
  }
  
  public void setConfig(SocializeConfig paramSocializeConfig)
  {
    if (paramSocializeConfig == null) {
      return;
    }
    this.a.setConfig(paramSocializeConfig);
  }
  
  public void setCustomId(String paramString)
  {
    this.a.customID = paramString;
  }
  
  public void setEntityName(String paramString)
  {
    this.a.setNickName(paramString);
  }
  
  public void setGlobalConfig(SocializeConfig paramSocializeConfig)
  {
    if (paramSocializeConfig == null) {
      return;
    }
    c = paramSocializeConfig;
  }
  
  public void setShareContent(String paramString)
  {
    this.a.setShareContent(paramString);
  }
  
  public void setShareImage(UMImage paramUMImage)
  {
    this.a.setMedia(paramUMImage);
  }
  
  public boolean setShareMedia(UMediaObject paramUMediaObject)
  {
    if ((paramUMediaObject != null) && (((paramUMediaObject instanceof UMImage)) || ((paramUMediaObject instanceof UMVedio)) || ((paramUMediaObject instanceof UMusic))))
    {
      this.a.setMedia(paramUMediaObject);
      return true;
    }
    paramUMediaObject = b;
    return false;
  }
  
  public void shareEmail(Context paramContext)
  {
    ResolveInfo localResolveInfo = null;
    SocializeEntity localSocializeEntity = getEntity();
    Intent localIntent = new Intent("android.intent.action.SEND");
    Object localObject2 = getConfig().getMailSubject();
    localIntent.putExtra("android.intent.extra.TITLE", "Share");
    localIntent.setType("message/rfc822");
    String str2 = getEntity().getShareContent();
    Object localObject1 = (UMImage)getEntity().getMedia(UMImage.class);
    if (localObject1 == null)
    {
      localObject1 = null;
      if (localObject1 != null)
      {
        localObject1 = com.umeng.socialize.common.m.a(paramContext, (String)localObject1);
        if (localObject1 != null)
        {
          localIntent.putExtra("android.intent.extra.STREAM", (Parcelable)localObject1);
          localIntent.setType("image/png;message/rfc822");
        }
      }
      if (!TextUtils.isEmpty(str2)) {
        localIntent.putExtra("android.intent.extra.TEXT", Html.fromHtml(str2));
      }
      localIntent.putExtra("android.intent.extra.SUBJECT", (String)localObject2);
    }
    for (;;)
    {
      try
      {
        localObject2 = paramContext.getPackageManager().queryIntentActivities(localIntent, 0).iterator();
        localObject1 = localResolveInfo;
        if (!((Iterator)localObject2).hasNext()) {
          if (localObject1 != null) {
            localIntent.setClassName(((ResolveInfo)localObject1).activityInfo.packageName, ((ResolveInfo)localObject1).activityInfo.name);
          }
        }
      }
      catch (Exception localException)
      {
        boolean bool;
        String str1;
        continue;
      }
      try
      {
        paramContext.startActivity(localIntent);
        com.umeng.socialize.common.m.a(paramContext, localSocializeEntity.descriptor, localSocializeEntity.getShareContent(), localSocializeEntity.getMedia(), "email");
        return;
      }
      catch (Throwable localThrowable)
      {
        str1 = b;
        Toast.makeText(paramContext, "无法通过邮件分享！", 1).show();
        return;
      }
      localObject1 = ((UMImage)localObject1).getImageCachePath();
      break;
      localResolveInfo = (ResolveInfo)((Iterator)localObject2).next();
      if (!localResolveInfo.activityInfo.packageName.endsWith(".gm"))
      {
        bool = localResolveInfo.activityInfo.name.toLowerCase().contains("gmail");
        if (!bool) {}
      }
      else
      {
        localObject1 = localResolveInfo;
      }
    }
  }
  
  public void shareSms(Context paramContext)
  {
    SocializeEntity localSocializeEntity = getEntity();
    Intent localIntent = new Intent("android.intent.action.VIEW");
    localIntent.setType("vnd.android-dir/mms-sms");
    localIntent.putExtra("sms_body", getEntity().getShareContent());
    paramContext.startActivity(localIntent);
    com.umeng.socialize.common.m.a(paramContext, localSocializeEntity.descriptor, localSocializeEntity.getShareContent(), localSocializeEntity.getMedia(), "sms");
  }
  
  public void showLoginDialog(Context paramContext, SocializeListeners.LoginListener paramLoginListener)
  {
    new aj(paramContext, this.a.descriptor, paramLoginListener).a();
  }
  
  public void showPostComment(Context paramContext)
  {
    new com.umeng.socialize.view.q(paramContext, this.a).show();
  }
  
  public boolean unregisterListener(e.a parama)
  {
    return getConfig().unregisterListener(parama);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\controller\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */