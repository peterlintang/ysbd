package com.umeng.socialize.bean;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.socialize.controller.a;
import com.umeng.socialize.controller.listener.SocializeListeners.MulStatusListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SocializeConfig
  extends e
{
  private List<SHARE_MEDIA> a = new ArrayList();
  private boolean b = true;
  private boolean c = true;
  private Map<SHARE_MEDIA, HashSet<String>> d;
  private boolean e = false;
  private boolean f = true;
  private boolean g = true;
  private String h = "Sharing Socialize";
  private List<CustomPlatform> i = new ArrayList();
  private CustomPlatform j;
  private CustomPlatform k;
  private boolean l = true;
  private SocializeListeners.MulStatusListener m;
  
  public SocializeConfig()
  {
    this.a.add(SHARE_MEDIA.QZONE);
    this.a.add(SHARE_MEDIA.SINA);
    this.a.add(SHARE_MEDIA.TENCENT);
    this.a.add(SHARE_MEDIA.RENREN);
    this.a.add(SHARE_MEDIA.DOUBAN);
    this.j = new CustomPlatform("短信分享", -1);
    this.j.tag = "com.umeng.socialize.sms";
    addCustomPlatform(this.j);
    this.k = new CustomPlatform("邮件分享", -1);
    this.k.tag = "com.umeng.socialize.mail";
    addCustomPlatform(this.k);
  }
  
  public void addCustomPlatform(CustomPlatform paramCustomPlatform)
  {
    this.i.add(paramCustomPlatform);
  }
  
  public void addFollow(SHARE_MEDIA paramSHARE_MEDIA, String paramString)
  {
    if ((TextUtils.isEmpty(paramString)) || (paramSHARE_MEDIA == null)) {
      return;
    }
    if (this.d == null) {
      this.d = new HashMap();
    }
    if (this.d.containsKey(paramSHARE_MEDIA))
    {
      ((HashSet)this.d.get(paramSHARE_MEDIA)).add(paramString);
      return;
    }
    HashSet localHashSet = new HashSet();
    localHashSet.add(paramString);
    this.d.put(paramSHARE_MEDIA, localHashSet);
  }
  
  public List<CustomPlatform> getCustomPlatforms()
  {
    return this.i;
  }
  
  public Set<String> getFollowFids(SHARE_MEDIA paramSHARE_MEDIA)
  {
    if ((this.d != null) && (this.d.containsKey(paramSHARE_MEDIA))) {
      return new HashSet((Collection)this.d.get(paramSHARE_MEDIA));
    }
    return null;
  }
  
  public String getMailSubject()
  {
    return this.h;
  }
  
  public SocializeListeners.MulStatusListener getOauthDialogFollowListener()
  {
    return this.m;
  }
  
  public List<SHARE_MEDIA> getPlatforms()
  {
    return this.a;
  }
  
  public boolean isDefaultShareComment()
  {
    return this.c;
  }
  
  public boolean isDefaultShareLocation()
  {
    return this.b;
  }
  
  public boolean isSendBlock()
  {
    return this.e;
  }
  
  public boolean isShareMail()
  {
    return this.g;
  }
  
  public boolean isShareSms()
  {
    return this.f;
  }
  
  public boolean isSyncUserInfo()
  {
    return this.l;
  }
  
  public void removeFollow(SHARE_MEDIA paramSHARE_MEDIA, String paramString)
  {
    if ((TextUtils.isEmpty(paramString)) || (paramSHARE_MEDIA == null) || (this.d == null) || (!this.d.containsKey(paramSHARE_MEDIA))) {
      return;
    }
    ((HashSet)this.d.get(paramSHARE_MEDIA)).remove(paramString);
  }
  
  public void setDefaultShareComment(boolean paramBoolean)
  {
    this.c = paramBoolean;
  }
  
  public void setDefaultShareLocation(boolean paramBoolean)
  {
    this.b = paramBoolean;
  }
  
  public void setMailSubject(String paramString)
  {
    this.h = paramString;
  }
  
  public void setOauthDialogFollowListener(SocializeListeners.MulStatusListener paramMulStatusListener)
  {
    this.m = paramMulStatusListener;
  }
  
  public void setPlatforms(SHARE_MEDIA... paramVarArgs)
  {
    this.a.clear();
    int i1;
    int n;
    if (paramVarArgs != null)
    {
      i1 = paramVarArgs.length;
      n = 0;
    }
    for (;;)
    {
      if (n >= i1) {
        return;
      }
      SHARE_MEDIA localSHARE_MEDIA = paramVarArgs[n];
      this.a.add(localSHARE_MEDIA);
      n += 1;
    }
  }
  
  public void setSendBlock(boolean paramBoolean)
  {
    this.e = paramBoolean;
  }
  
  public void setShareMail(boolean paramBoolean)
  {
    this.g = paramBoolean;
    if ((paramBoolean) && (!this.i.contains(this.k))) {
      addCustomPlatform(this.k);
    }
    while ((paramBoolean) || (!this.i.contains(this.k))) {
      return;
    }
    this.i.remove(this.k);
  }
  
  public void setShareSms(boolean paramBoolean)
  {
    this.f = paramBoolean;
    if ((paramBoolean) && (!this.i.contains(this.j))) {
      addCustomPlatform(this.j);
    }
    while ((paramBoolean) || (!this.i.contains(this.j))) {
      return;
    }
    this.i.remove(this.j);
  }
  
  public void supportAppPlatform(Context paramContext, APP_PLATFORM paramAPP_PLATFORM, String paramString, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      paramContext = a.a(paramContext, paramAPP_PLATFORM, paramString);
      if (!this.i.contains(paramContext)) {
        addCustomPlatform(paramContext);
      }
    }
    do
    {
      return;
      paramContext = a.a(paramContext, paramAPP_PLATFORM, paramString);
    } while (!this.i.contains(paramContext));
    this.i.remove(paramContext);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\bean\SocializeConfig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */