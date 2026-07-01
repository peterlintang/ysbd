package com.umeng.socialize.controller.a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Parcelable;
import android.text.Html;
import android.text.TextUtils;
import com.umeng.socialize.a.d;
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
import com.umeng.socialize.view.bc;
import com.umeng.socialize.view.cl;
import com.umeng.socialize.view.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class aa
  extends z
  implements UMSocialService
{
  public static Map<String, SocializeEntity> b = new HashMap();
  private static final String c = aa.class.getName();
  private static SocializeConfig d = new SocializeConfig();
  
  public aa(SocializeEntity paramSocializeEntity)
  {
    super(paramSocializeEntity);
  }
  
  private void a(Context paramContext, SHARE_MEDIA paramSHARE_MEDIA, SocializeListeners.SocializeClientListener paramSocializeClientListener)
  {
    if ((paramContext instanceof Activity))
    {
      new ax(this, paramSocializeClientListener, this, paramContext, paramSHARE_MEDIA).execute(new Void[0]);
      return;
    }
    paramContext = c;
  }
  
  private void a(Context paramContext, com.umeng.socialize.bean.m[] paramArrayOfm, UMComment paramUMComment, SocializeListeners.MulStatusListener paramMulStatusListener)
  {
    if ((paramContext instanceof Activity))
    {
      new ac(this, paramMulStatusListener, this, paramContext, paramUMComment, paramArrayOfm).execute(new Void[0]);
      return;
    }
    paramContext = c;
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
    if (d.a(paramContext, localSHARE_MEDIA)) {
      localArrayList.add(new com.umeng.socialize.bean.m(localSHARE_MEDIA.toString(), d.b(paramContext, localSHARE_MEDIA)));
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
    if ((paramContext instanceof Activity))
    {
      new ai(this, paramSocializeClientListener, this, paramContext, paramSHARE_MEDIA).execute(new Void[0]);
      return;
    }
    paramContext = c;
  }
  
  public void directShare(Context paramContext, SHARE_MEDIA paramSHARE_MEDIA, SocializeListeners.DirectShareListener paramDirectShareListener)
  {
    Intent localIntent = new Intent(paramContext, ShareActivity.class);
    localIntent.putExtra("dc", this.a.descriptor);
    localIntent.putExtra("sns", paramSHARE_MEDIA.toString());
    if (d.a(paramContext, paramSHARE_MEDIA))
    {
      if (paramDirectShareListener != null) {
        paramDirectShareListener.onAuthenticated(paramSHARE_MEDIA);
      }
      paramContext.startActivity(localIntent);
      return;
    }
    doOauthVerify(paramContext, paramSHARE_MEDIA, new an(this, paramDirectShareListener, paramContext, localIntent));
  }
  
  public void doOauthVerify(Context paramContext, SHARE_MEDIA paramSHARE_MEDIA, SocializeListeners.OauthCallbackListener paramOauthCallbackListener)
  {
    paramOauthCallbackListener = new ao(this, paramContext, paramOauthCallbackListener, (SocializeListeners.OauthCallbackListener[])getConfig().getListener(SocializeListeners.OauthCallbackListener.class));
    com.umeng.socialize.common.m.a(new com.umeng.socialize.view.at(paramContext, this.a, paramSHARE_MEDIA, paramOauthCallbackListener), false);
  }
  
  public void follow(Context paramContext, SHARE_MEDIA paramSHARE_MEDIA, SocializeListeners.MulStatusListener paramMulStatusListener, String... paramVarArgs)
  {
    if ((paramContext instanceof Activity))
    {
      if (d.a(paramContext, paramSHARE_MEDIA))
      {
        str = d.b(paramContext, paramSHARE_MEDIA);
        new ap(this, paramMulStatusListener, this, paramContext, new com.umeng.socialize.bean.m(paramSHARE_MEDIA.toString(), str), paramVarArgs, paramSHARE_MEDIA).execute(new Void[0]);
      }
      while (paramMulStatusListener == null)
      {
        String str;
        return;
      }
      paramMulStatusListener.onStart();
      paramMulStatusListener.onComplete(new MultiStatus(-101), -101, this.a);
      return;
    }
    paramContext = c;
  }
  
  public void getComments(Context paramContext, SocializeListeners.FetchCommetsListener paramFetchCommetsListener, long paramLong)
  {
    if ((paramContext instanceof Activity))
    {
      new at(this, paramFetchCommetsListener, this, paramContext, paramLong).execute(new Void[0]);
      return;
    }
    paramContext = c;
  }
  
  public SocializeConfig getConfig()
  {
    if (this.a.getEntityConfig() == null)
    {
      if (d == null) {
        d = new SocializeConfig();
      }
      return d;
    }
    return this.a.getEntityConfig();
  }
  
  public void getFriends(Context paramContext, SocializeListeners.FetchFriendsListener paramFetchFriendsListener, SHARE_MEDIA paramSHARE_MEDIA)
  {
    if ((paramContext instanceof Activity))
    {
      String str = d.b(paramContext, paramSHARE_MEDIA);
      if (TextUtils.isEmpty(str))
      {
        if (paramFetchFriendsListener != null) {
          paramFetchFriendsListener.onStart();
        }
        if (paramFetchFriendsListener != null) {
          paramFetchFriendsListener.onComplete(-101, null);
        }
      }
      new ah(this, paramFetchFriendsListener, this, paramContext, paramSHARE_MEDIA, str).execute(new Void[0]);
      return;
    }
    paramContext = c;
  }
  
  public void getPlatformInfo(Context paramContext, SHARE_MEDIA paramSHARE_MEDIA, SocializeListeners.PlatformInfoListener paramPlatformInfoListener)
  {
    if ((paramContext instanceof Activity))
    {
      if (d.a(paramContext, paramSHARE_MEDIA))
      {
        str = d.b(paramContext, paramSHARE_MEDIA);
        new aq(this, paramPlatformInfoListener, this, paramContext, new com.umeng.socialize.bean.m(paramSHARE_MEDIA.toString(), str)).execute(new Void[0]);
      }
      while (paramPlatformInfoListener == null)
      {
        String str;
        return;
      }
      paramPlatformInfoListener.onStart();
      paramPlatformInfoListener.onComplete(-102, null);
      return;
    }
    paramContext = c;
  }
  
  public void getUserInfo(Context paramContext, SocializeListeners.FetchUserListener paramFetchUserListener)
  {
    if ((paramContext instanceof Activity))
    {
      new ad(this, paramFetchUserListener, this, paramContext).execute(new Void[0]);
      return;
    }
    paramContext = c;
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
    if ((paramContext instanceof Activity))
    {
      new ab(this, paramSocializeClientListener, this, paramContext).execute(new Void[0]);
      return;
    }
    paramContext = c;
  }
  
  public void likeChange(Context paramContext, SocializeListeners.SocializeClientListener paramSocializeClientListener)
  {
    if ((paramContext instanceof Activity))
    {
      new am(this, paramSocializeClientListener, this, paramContext).execute(new Void[0]);
      return;
    }
    paramContext = c;
  }
  
  public void login(Context paramContext, SHARE_MEDIA paramSHARE_MEDIA, SocializeListeners.SocializeClientListener paramSocializeClientListener)
  {
    if (d.a(paramContext, paramSHARE_MEDIA))
    {
      a(paramContext, paramSHARE_MEDIA, paramSocializeClientListener);
      return;
    }
    doOauthVerify(paramContext, paramSHARE_MEDIA, new au(this, paramContext, paramSocializeClientListener));
  }
  
  public void login(Context paramContext, SnsAccount paramSnsAccount, SocializeListeners.SocializeClientListener paramSocializeClientListener)
  {
    if ((paramContext instanceof Activity))
    {
      new av(this, paramSocializeClientListener, paramContext, paramSnsAccount).execute(new Void[0]);
      return;
    }
    paramContext = c;
  }
  
  public void loginout(Context paramContext, SocializeListeners.SocializeClientListener paramSocializeClientListener)
  {
    if ((paramContext instanceof Activity))
    {
      new aw(this, paramSocializeClientListener, this, paramContext).execute(new Void[0]);
      return;
    }
    paramContext = c;
  }
  
  public void openComment(Context paramContext, boolean paramBoolean)
  {
    Intent localIntent = new Intent(paramContext, CommentActivity.class);
    localIntent.putExtra("dc", this.a.descriptor);
    if (paramBoolean)
    {
      showLoginDialog(paramContext, new aj(this, paramContext, localIntent));
      return;
    }
    paramContext.startActivity(localIntent);
  }
  
  public void openShare(Context paramContext, boolean paramBoolean)
  {
    bc localbc = new bc(paramContext, this.a.descriptor);
    if (paramBoolean)
    {
      showLoginDialog(paramContext, new ak(this, localbc, paramContext));
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
      showLoginDialog(paramContext, new al(this, paramVarArgs, paramContext));
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
    if ((paramContext instanceof Activity))
    {
      new ar(this, paramSocializeClientListener, this, paramContext).execute(new Void[0]);
      return;
    }
    paramContext = c;
  }
  
  public void postShare(Context paramContext, SHARE_MEDIA paramSHARE_MEDIA, UMShareMsg paramUMShareMsg, SocializeListeners.SnsPostListener paramSnsPostListener)
  {
    if (d.a(paramContext, paramSHARE_MEDIA))
    {
      str = d.b(paramContext, paramSHARE_MEDIA);
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
    if ((paramContext instanceof Activity))
    {
      new ae(this, paramSnsPostListener, paramString2, paramString1, this, paramContext, paramUMShareMsg).execute(new Void[0]);
      return;
    }
    paramContext = c;
  }
  
  public void postShareByID(Context paramContext, String paramString1, String paramString2, SHARE_MEDIA paramSHARE_MEDIA, SocializeListeners.SnsPostListener paramSnsPostListener)
  {
    if ((paramContext instanceof Activity))
    {
      new ag(this, paramSnsPostListener, paramSHARE_MEDIA, paramString2, paramString1, this, paramContext).execute(new Void[0]);
      return;
    }
    paramContext = c;
  }
  
  public void postShareMulti(Context paramContext, UMShareMsg paramUMShareMsg, SocializeListeners.MulStatusListener paramMulStatusListener, SHARE_MEDIA... paramVarArgs)
  {
    HashMap localHashMap = new HashMap();
    paramVarArgs = a(paramContext, localHashMap, paramVarArgs);
    if ((paramVarArgs != null) && (paramVarArgs.length > 0)) {
      if ((paramContext instanceof Activity)) {
        new af(this, paramMulStatusListener, this, paramContext, paramVarArgs, paramUMShareMsg, localHashMap).execute(new Void[0]);
      }
    }
    while (paramMulStatusListener == null)
    {
      return;
      paramContext = c;
      return;
    }
    paramMulStatusListener.onStart();
    paramContext = new MultiStatus(-105);
    paramContext.setPlatformCode(localHashMap);
    paramMulStatusListener.onComplete(paramContext, -105, this.a);
  }
  
  public void postUnLike(Context paramContext, SocializeListeners.SocializeClientListener paramSocializeClientListener)
  {
    if ((paramContext instanceof Activity))
    {
      new as(this, paramSocializeClientListener, this, paramContext).execute(new Void[0]);
      return;
    }
    paramContext = c;
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
    d = paramSocializeConfig;
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
    paramUMediaObject = c;
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
    String str = getEntity().getShareContent();
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
      if (!TextUtils.isEmpty(str)) {
        localIntent.putExtra("android.intent.extra.TEXT", Html.fromHtml(str));
      }
      localIntent.putExtra("android.intent.extra.SUBJECT", (String)localObject2);
    }
    for (;;)
    {
      try
      {
        localObject2 = paramContext.getPackageManager().queryIntentActivities(localIntent, 0).iterator();
        localObject1 = localResolveInfo;
        if (((Iterator)localObject2).hasNext()) {
          continue;
        }
        if (localObject1 != null) {
          localIntent.setClassName(((ResolveInfo)localObject1).activityInfo.packageName, ((ResolveInfo)localObject1).activityInfo.name);
        }
      }
      catch (Exception localException)
      {
        boolean bool;
        continue;
      }
      paramContext.startActivity(localIntent);
      com.umeng.socialize.common.m.a(paramContext, localSocializeEntity.descriptor, localSocializeEntity.getShareContent(), localSocializeEntity.getMedia(), "email");
      return;
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
    new com.umeng.socialize.view.aj(paramContext, this.a.descriptor, paramLoginListener).a();
  }
  
  public void showPostComment(Context paramContext)
  {
    new q(paramContext, this.a).show();
  }
  
  public boolean unregisterListener(e.a parama)
  {
    return getConfig().unregisterListener(parama);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\controller\a\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */