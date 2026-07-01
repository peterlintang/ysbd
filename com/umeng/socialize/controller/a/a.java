package com.umeng.socialize.controller.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.umeng.socialize.bean.MultiStatus;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.bean.SnsAccount;
import com.umeng.socialize.bean.SocializeEntity;
import com.umeng.socialize.bean.UMComment;
import com.umeng.socialize.bean.UMFriend;
import com.umeng.socialize.bean.UMShareMsg;
import com.umeng.socialize.bean.m;
import com.umeng.socialize.c.b;
import com.umeng.socialize.c.c;
import com.umeng.socialize.c.d;
import com.umeng.socialize.c.f;
import com.umeng.socialize.c.f.a;
import com.umeng.socialize.c.i;
import com.umeng.socialize.c.j;
import com.umeng.socialize.c.k;
import com.umeng.socialize.c.l;
import com.umeng.socialize.c.n;
import com.umeng.socialize.c.o;
import com.umeng.socialize.c.p;
import com.umeng.socialize.c.q;
import com.umeng.socialize.c.r;
import com.umeng.socialize.c.s;
import com.umeng.socialize.c.t;
import com.umeng.socialize.c.u;
import com.umeng.socialize.c.v;
import com.umeng.socialize.c.w;
import com.umeng.socialize.c.x;
import com.umeng.socialize.common.SocializeConstants;
import com.umeng.socialize.exception.SocializeException;
import java.util.Iterator;
import java.util.List;

public class a
{
  private static int b = -1;
  private static final String c = "installed";
  private static final String d = "umsocial_uid";
  protected SocializeEntity a;
  
  public a(SocializeEntity paramSocializeEntity)
  {
    this.a = paramSocializeEntity;
  }
  
  private int a(Context paramContext, f.a parama)
  {
    paramContext = new com.umeng.socialize.c.a.a().a(new f(paramContext, this.a, parama));
    if (paramContext != null)
    {
      if (paramContext.n == 200) {
        this.a.changeILike();
      }
      return paramContext.n;
    }
    return -102;
  }
  
  public int a(Context arg1)
  {
    boolean bool = true;
    if (b == -1) {}
    for (;;)
    {
      int i;
      synchronized (???.getSharedPreferences("umeng_socialize", 0))
      {
        b = ((SharedPreferences)???).getInt("installed", 1);
        if (TextUtils.isEmpty(SocializeConstants.UID)) {
          SocializeConstants.UID = ???.getSharedPreferences("umeng_socialize", 0).getString("umsocial_uid", "");
        }
        ??? = new com.umeng.socialize.c.a.a();
        ??? = this.a;
        if (b == 0)
        {
          i = 0;
          ??? = (b)((com.umeng.socialize.c.a.a)???).a(new com.umeng.socialize.c.a(???, (SocializeEntity)???, i));
          if (??? == null) {
            break;
          }
          if (b == 1) {}
          synchronized (???.getSharedPreferences("umeng_socialize", 0).edit())
          {
            ((SharedPreferences.Editor)???).putInt("installed", 0);
            ((SharedPreferences.Editor)???).commit();
            b = 0;
            if (((b)???).n == 200) {
              if ((TextUtils.isEmpty(SocializeConstants.UID)) || (!SocializeConstants.UID.equals(((b)???).h)))
              {
                new StringBuilder("update UID src=").append(SocializeConstants.UID).append(" dest=").append(((b)???).h).toString();
                SocializeConstants.UID = ((b)???).h;
                synchronized (???.getSharedPreferences("umeng_socialize", 0).edit())
                {
                  ???.putString("umsocial_uid", SocializeConstants.UID);
                  ???.commit();
                }
              }
            }
          }
        }
      }
      synchronized (this.a)
      {
        this.a.setComment_count(((b)???).b);
        this.a.entityKey = ((b)???).e;
        this.a.sessionID = ((b)???).d;
        if (((b)???).f == 0) {}
        for (;;)
        {
          this.a.setNew(bool);
          SocializeEntity localSocializeEntity = this.a;
          if (((b)???).g != 0) {
            break label441;
          }
          ??? = f.a.b;
          localSocializeEntity.setIlikey(???);
          this.a.setLike_count(((b)???).c);
          this.a.setPv(((b)???).a);
          this.a.setShare_count(((b)???).j);
          this.a.initialized = true;
          return ((b)???).n;
          ??? = finally;
          throw ???;
          i = 1;
          break;
          ??? = finally;
          throw ???;
          localObject2 = finally;
          throw ((Throwable)localObject2);
          bool = false;
        }
        label441:
        ??? = f.a.a;
      }
    }
    return -103;
  }
  
  public int a(Context paramContext, SHARE_MEDIA paramSHARE_MEDIA)
  {
    paramContext = new com.umeng.socialize.c.a.a().a(new i(paramContext, this.a, paramSHARE_MEDIA));
    if (paramContext != null) {
      return paramContext.n;
    }
    return -102;
  }
  
  public int a(Context paramContext, SnsAccount paramSnsAccount)
  {
    paramContext = new com.umeng.socialize.c.a.a().a(new x(paramContext, this.a, paramSnsAccount));
    if (paramContext == null) {
      return -103;
    }
    return paramContext.n;
  }
  
  public int a(Context paramContext, UMComment paramUMComment, m[] paramArrayOfm)
  {
    paramContext = new com.umeng.socialize.c.a.a().a(new c(paramContext, this.a, paramUMComment, paramArrayOfm));
    if (paramContext != null) {
      return paramContext.n;
    }
    return -103;
  }
  
  public MultiStatus a(Context paramContext, m paramm, String... paramVarArgs)
  {
    if ((paramm == null) || (paramm.b == null) || (paramm.a == null) || (paramVarArgs == null) || (paramVarArgs.length == 0)) {
      return new MultiStatus(-105);
    }
    paramContext = new q(paramContext, this.a, paramm, paramVarArgs);
    paramContext = (r)new com.umeng.socialize.c.a.a().a(paramContext);
    if (paramContext == null) {
      return new MultiStatus(-103);
    }
    paramm = new MultiStatus(paramContext.n);
    paramm.setInfoCode(paramContext.a);
    return paramm;
  }
  
  public MultiStatus a(Context paramContext, m[] paramArrayOfm, UMShareMsg paramUMShareMsg)
  {
    if (paramUMShareMsg == null) {
      return new MultiStatus(-102);
    }
    String str = paramUMShareMsg.wid;
    if ((paramArrayOfm == null) || (paramArrayOfm.length <= 0)) {
      return new MultiStatus(-105);
    }
    if (!TextUtils.isEmpty(str))
    {
      paramContext = new com.umeng.socialize.c.a.a().a(new u(paramContext, this.a, paramArrayOfm[0].a, paramArrayOfm[0].b, paramUMShareMsg));
      if (paramContext == null) {
        return new MultiStatus(-103);
      }
      return new MultiStatus(paramContext.n);
    }
    paramContext = (t)new com.umeng.socialize.c.a.a().a(new s(paramContext, this.a, paramArrayOfm, paramUMShareMsg));
    if (paramContext == null) {
      return new MultiStatus(-103);
    }
    paramArrayOfm = new MultiStatus(paramContext.n);
    paramArrayOfm.setPlatformCode(paramContext.a);
    return paramArrayOfm;
  }
  
  public com.umeng.socialize.c.e a(Context paramContext, long paramLong)
  {
    paramContext = (com.umeng.socialize.c.e)new com.umeng.socialize.c.a.a().a(new d(paramContext, this.a, paramLong));
    if (paramContext == null) {
      throw new SocializeException(-103, "Response is null...");
    }
    if (paramContext.n != 200) {
      throw new SocializeException(paramContext.n, paramContext.m);
    }
    return paramContext;
  }
  
  public p a(Context paramContext, SHARE_MEDIA paramSHARE_MEDIA, String paramString)
  {
    paramContext = (p)new com.umeng.socialize.c.a.a().a(new o(paramContext, this.a, paramSHARE_MEDIA, paramString));
    if (paramContext == null) {
      throw new SocializeException(-103, "Response is null...");
    }
    if (paramContext.n != 200) {
      throw new SocializeException(paramContext.n, paramContext.m);
    }
    if (paramContext.a != null) {
      paramSHARE_MEDIA = paramContext.a.iterator();
    }
    for (;;)
    {
      if (!paramSHARE_MEDIA.hasNext()) {
        return paramContext;
      }
      ((UMFriend)paramSHARE_MEDIA.next()).setUsid(paramString);
    }
  }
  
  public w a(Context paramContext, m paramm)
  {
    paramContext = (w)new com.umeng.socialize.c.a.a().a(new v(paramContext, this.a, paramm));
    if (paramContext != null) {
      return paramContext;
    }
    return null;
  }
  
  public int b(Context paramContext)
  {
    if (this.a.getIlike() == f.a.a) {}
    for (f.a locala = f.a.b;; locala = f.a.a) {
      return a(paramContext, locala);
    }
  }
  
  public int b(Context paramContext, SHARE_MEDIA paramSHARE_MEDIA)
  {
    paramContext = new com.umeng.socialize.c.a.a().a(new n(paramContext, this.a, paramSHARE_MEDIA));
    if (paramContext != null) {
      return paramContext.n;
    }
    return -102;
  }
  
  public int c(Context paramContext)
  {
    return a(paramContext, f.a.a);
  }
  
  public int d(Context paramContext)
  {
    return a(paramContext, f.a.b);
  }
  
  public l e(Context paramContext)
  {
    paramContext = (l)new com.umeng.socialize.c.a.a().a(new k(paramContext, this.a));
    if (paramContext == null) {
      throw new SocializeException(-103, "Response is null...");
    }
    if (paramContext.n != 200) {
      throw new SocializeException(paramContext.n, paramContext.m);
    }
    return paramContext;
  }
  
  public int f(Context paramContext)
  {
    paramContext = new com.umeng.socialize.c.a.a().a(new j(paramContext, this.a));
    if (paramContext != null) {
      return paramContext.n;
    }
    return -103;
  }
  
  public SocializeEntity getEntity()
  {
    return this.a;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\controller\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */