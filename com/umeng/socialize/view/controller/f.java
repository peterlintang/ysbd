package com.umeng.socialize.view.controller;

import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.bean.SocializeUser;
import com.umeng.socialize.bean.n;
import com.umeng.socialize.bean.o;
import com.umeng.socialize.controller.listener.SocializeListeners.FetchUserListener;
import com.umeng.socom.net.o.a;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

class f
  implements SocializeListeners.FetchUserListener
{
  f(d paramd, d.a parama) {}
  
  public void onComplete(int paramInt, SocializeUser paramSocializeUser)
  {
    Object localObject = com.umeng.socialize.a.d.a(d.b(this.a));
    Set localSet;
    Iterator localIterator;
    if ((localObject != null) && (((Map)localObject).size() > 0))
    {
      localSet = ((Map)localObject).keySet();
      localIterator = d.c(this.a).iterator();
      if (localIterator.hasNext()) {}
    }
    else
    {
      if ((paramInt != 200) || (paramSocializeUser == null) || (paramSocializeUser.accounts == null)) {
        break label200;
      }
      if (paramSocializeUser.loginAccount != null) {
        d.a(this.a, paramSocializeUser.loginAccount);
      }
      d.a(this.a, paramSocializeUser);
      label100:
      if (this.b != null)
      {
        localObject = this.b;
        if (paramInt != 200) {
          break label216;
        }
      }
    }
    label200:
    label216:
    for (paramSocializeUser = o.a.a;; paramSocializeUser = o.a.b)
    {
      ((d.a)localObject).a(paramSocializeUser);
      this.a.a(d.c.b);
      return;
      n localn = (n)localIterator.next();
      SHARE_MEDIA localSHARE_MEDIA = SHARE_MEDIA.convertToEmun(localn.a);
      if (!localSet.contains(localSHARE_MEDIA)) {
        break;
      }
      localn.e = true;
      localn.g = ((String)((Map)localObject).get(localSHARE_MEDIA));
      break;
      o.a(d.b(this.a), paramInt, null);
      break label100;
    }
  }
  
  public void onStart()
  {
    this.a.a(d.c.a);
    if (this.b != null) {
      this.b.a();
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\controller\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */