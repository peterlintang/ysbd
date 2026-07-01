package com.umeng.socialize.view;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import com.umeng.socialize.bean.CustomPlatform;
import com.umeng.socialize.bean.SocializeConfig;
import com.umeng.socialize.bean.n;
import com.umeng.socialize.common.b;
import com.umeng.socialize.common.b.a;
import com.umeng.socialize.common.l;
import com.umeng.socialize.common.m;
import com.umeng.socialize.controller.RequestType;
import com.umeng.socialize.controller.UMServiceFactory;
import com.umeng.socialize.controller.UMSocialService;
import com.umeng.socialize.view.a.y.a;
import com.umeng.socialize.view.a.y.b;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class bc
{
  private static final String a = bc.class.getName();
  private Context b;
  private UMSocialService c;
  private String d;
  private Dialog e;
  
  public bc(Context paramContext, String paramString)
  {
    this.b = paramContext;
    this.d = paramString;
    this.c = UMServiceFactory.getUMSocialService(this.d, RequestType.SOCIAL);
    this.e = e();
  }
  
  private View a(CustomPlatform paramCustomPlatform)
  {
    y.b localb = new y.b(this.b);
    if (paramCustomPlatform.icon != -1) {
      localb.a(paramCustomPlatform.icon);
    }
    for (;;)
    {
      localb.a(paramCustomPlatform.showWord);
      localb.a(new bf(this, paramCustomPlatform));
      return localb.a();
      if (paramCustomPlatform.tag.equalsIgnoreCase("com.umeng.socialize.mail")) {
        localb.a(b.a(this.b, b.a.c, "umeng_socialize_gmail"));
      } else if (paramCustomPlatform.tag.equalsIgnoreCase("com.umeng.socialize.sms")) {
        localb.a(b.a(this.b, b.a.c, "umeng_socialize_sms"));
      }
    }
  }
  
  private Map<n, View> a(List<n> paramList)
  {
    Map localMap = c();
    bg localbg = new bg(this);
    paramList = paramList.iterator();
    for (;;)
    {
      if (!paramList.hasNext()) {
        return localMap;
      }
      n localn = (n)paramList.next();
      y.b localb = new y.b(this.b);
      localb.a(localn.c);
      localb.a(localn.b);
      localb.a(new bh(this, localn, localbg));
      localMap.put(localn, localb.a());
    }
  }
  
  private Dialog e()
  {
    Object localObject1 = l.a(this.b, this.c.getConfig());
    bd localbd = new bd(this, this.b);
    if (m.d(this.b))
    {
      localObject2 = m.c(this.b);
      localbd.a(localObject2[0], localObject2[1]);
    }
    localObject1 = a((List)localObject1);
    Object localObject2 = ((Map)localObject1).keySet();
    if ((localObject2 == null) || (((Set)localObject2).size() == 0))
    {
      localbd.a(8);
      localbd.a("分享到");
      localObject1 = this.c.getConfig().getCustomPlatforms();
      if ((localObject1 == null) || (((List)localObject1).size() <= 0)) {
        break label223;
      }
      localObject1 = ((List)localObject1).iterator();
      label132:
      if (((Iterator)localObject1).hasNext()) {
        break label201;
      }
      localbd.b(0);
    }
    for (;;)
    {
      localbd.b(null);
      return localbd.a();
      localObject2 = ((Set)localObject2).iterator();
      while (((Iterator)localObject2).hasNext()) {
        localbd.a((View)((Map)localObject1).get((n)((Iterator)localObject2).next()), null);
      }
      break;
      label201:
      localbd.b(a((CustomPlatform)((Iterator)localObject1).next()), null);
      break label132;
      label223:
      localbd.b(8);
    }
  }
  
  public void a()
  {
    m.a(this.e, false);
  }
  
  public void b()
  {
    m.a(this.e);
  }
  
  public Map<n, View> c()
  {
    return new TreeMap(new bi(this));
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\bc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */