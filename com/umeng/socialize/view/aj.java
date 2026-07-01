package com.umeng.socialize.view;

import android.content.Context;
import android.view.View;
import com.umeng.socialize.a.c;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.bean.n;
import com.umeng.socialize.common.b;
import com.umeng.socialize.common.b.a;
import com.umeng.socialize.common.l;
import com.umeng.socialize.common.m;
import com.umeng.socialize.controller.RequestType;
import com.umeng.socialize.controller.UMServiceFactory;
import com.umeng.socialize.controller.UMSocialService;
import com.umeng.socialize.controller.listener.SocializeListeners.LoginListener;
import com.umeng.socialize.view.a.y;
import com.umeng.socialize.view.a.y.a;
import com.umeng.socialize.view.a.y.b;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class aj
{
  private y a;
  private Context b;
  private UMSocialService c;
  private List<n> d;
  private Map<n, View> e;
  private SocializeListeners.LoginListener f;
  
  public aj(Context paramContext, String paramString, SocializeListeners.LoginListener paramLoginListener)
  {
    this.b = paramContext;
    this.f = paramLoginListener;
    this.c = UMServiceFactory.getUMSocialService(paramString, RequestType.SOCIAL);
    this.d = l.a(paramContext, this.c.getConfig());
    this.e = a(this.d);
    paramString = new ak(this, paramContext, paramContext);
    paramLoginListener = this.e.keySet();
    if ((paramLoginListener == null) || (paramLoginListener.size() == 0)) {
      paramString.a(8);
    }
    for (;;)
    {
      paramString.a("使用已有账号登录");
      paramString.b(0);
      paramString.b("");
      paramLoginListener = new y.b(paramContext);
      paramLoginListener.a(b.a(paramContext, b.a.c, "umeng_socialize_default_avatar"));
      paramLoginListener.a("游客");
      paramLoginListener.a(new am(this));
      paramString.b(paramLoginListener.a(), null);
      if (m.d(paramContext))
      {
        paramContext = m.c(paramContext);
        paramString.a(paramContext[0], paramContext[1]);
      }
      this.a = paramString.a();
      this.a.a(new an(this));
      return;
      paramLoginListener = paramLoginListener.iterator();
      while (paramLoginListener.hasNext())
      {
        n localn = (n)paramLoginListener.next();
        paramString.a((View)this.e.get(localn), null);
      }
    }
  }
  
  private Map<n, View> a(List<n> paramList)
  {
    Map localMap = c();
    paramList = paramList.iterator();
    if (!paramList.hasNext()) {
      return localMap;
    }
    n localn = (n)paramList.next();
    y.b localb = new y.b(this.b);
    if (localn.a.equals("qzone"))
    {
      localb.a(b.a(this.b, b.a.c, "umeng_socialize_qq_login"));
      localb.a("QQ登录");
    }
    for (;;)
    {
      localb.a(new ao(this, localn));
      localMap.put(localn, localb.a());
      break;
      localb.a(localn.c);
      localb.a(localn.b);
    }
  }
  
  private void a(SHARE_MEDIA paramSHARE_MEDIA)
  {
    if (paramSHARE_MEDIA != null)
    {
      this.c.login(this.b, paramSHARE_MEDIA, new aq(this, paramSHARE_MEDIA));
      return;
    }
    this.c.loginout(this.b, new ar(this));
  }
  
  public void a()
  {
    if ((c.c(this.b)) || (c.d(this.b)))
    {
      this.f.loginSuccessed(c.b(this.b), true);
      return;
    }
    m.a(this.a, false);
  }
  
  public void b()
  {
    m.a(this.a);
  }
  
  public Map<n, View> c()
  {
    return new TreeMap(new as(this));
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */