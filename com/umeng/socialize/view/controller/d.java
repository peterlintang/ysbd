package com.umeng.socialize.view.controller;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.bean.SnsAccount;
import com.umeng.socialize.bean.SocializeUser;
import com.umeng.socialize.bean.n;
import com.umeng.socialize.common.l;
import com.umeng.socialize.controller.RequestType;
import com.umeng.socialize.controller.UMServiceFactory;
import com.umeng.socialize.controller.UMSocialService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class d
{
  private static final String a = d.class.getName();
  private List<n> b;
  private Context c;
  private UMSocialService d;
  private d.b e;
  private List<d.b> f;
  private SnsAccount g;
  private d.c h;
  
  public d(Context paramContext, String paramString)
  {
    this.c = paramContext;
    this.h = d.c.b;
    this.e = new e(this);
    this.d = UMServiceFactory.getUMSocialService(paramString, RequestType.SOCIAL);
    this.b = l.a(paramContext, this.d.getConfig());
  }
  
  private void a(SocializeUser paramSocializeUser)
  {
    Iterator localIterator1 = paramSocializeUser.accounts.iterator();
    for (;;)
    {
      if (!localIterator1.hasNext()) {
        return;
      }
      SnsAccount localSnsAccount = (SnsAccount)localIterator1.next();
      String str = localSnsAccount.getPlatform();
      if (str != null)
      {
        Iterator localIterator2 = this.b.iterator();
        while (localIterator2.hasNext())
        {
          n localn = (n)localIterator2.next();
          if ((!TextUtils.isEmpty(localn.a)) && (!TextUtils.isEmpty(str)) && (localn.a.equalsIgnoreCase(str)))
          {
            localn.h = localSnsAccount;
            localn.g = localSnsAccount.getUsid();
            if (!TextUtils.isEmpty(localn.g)) {
              localn.e = true;
            }
            try
            {
              if (paramSocializeUser.default_platform.toString().equals(localn.a)) {
                localn.f = true;
              }
            }
            catch (Exception localException) {}
          }
        }
      }
    }
  }
  
  public List<n> a()
  {
    return this.b;
  }
  
  public void a(n paramn, d.a parama)
  {
    try
    {
      this.d.deleteOauth(this.c, SHARE_MEDIA.convertToEmun(paramn.a), new g(this, parama, paramn));
      return;
    }
    finally
    {
      paramn = finally;
      throw paramn;
    }
  }
  
  public void a(d.a parama)
  {
    parama = new f(this, parama);
    this.d.getUserInfo(this.c, parama);
  }
  
  public void a(d.b paramb)
  {
    if (this.f == null) {
      this.f = new ArrayList();
    }
    if (this.f.contains(paramb))
    {
      paramb = a;
      return;
    }
    this.f.add(paramb);
  }
  
  public void a(d.c paramc)
  {
    try
    {
      if (this.h != paramc)
      {
        this.h = paramc;
        this.e.a(paramc);
      }
      return;
    }
    finally
    {
      paramc = finally;
      throw paramc;
    }
  }
  
  public SnsAccount b()
  {
    return this.g;
  }
  
  public void b(n paramn, d.a parama)
  {
    if (parama != null) {}
    try
    {
      parama.a();
      this.d.doOauthVerify(this.c, SHARE_MEDIA.convertToEmun(paramn.a), new h(this, parama, paramn));
      return;
    }
    finally {}
  }
  
  public void b(d.a parama)
  {
    if (parama != null) {
      parama.a();
    }
    this.d.showLoginDialog(this.c, new k(this, parama));
  }
  
  public void b(d.b paramb)
  {
    if (this.f == null) {}
    while (!this.f.contains(paramb)) {
      return;
    }
    this.f.remove(paramb);
  }
  
  public void c(n paramn, d.a parama)
  {
    if (paramn.e)
    {
      a(paramn, new i(this, parama, paramn));
      return;
    }
    b(paramn, new j(this, parama, paramn));
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\controller\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */