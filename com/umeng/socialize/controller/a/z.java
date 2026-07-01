package com.umeng.socialize.controller.a;

import android.content.Context;
import com.umeng.socialize.bean.MultiStatus;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.bean.SnsAccount;
import com.umeng.socialize.bean.SocializeEntity;
import com.umeng.socialize.bean.UMComment;
import com.umeng.socialize.bean.UMShareMsg;
import com.umeng.socialize.bean.m;
import com.umeng.socialize.c.e;
import com.umeng.socialize.c.l;
import com.umeng.socialize.c.p;
import com.umeng.socialize.c.w;

public class z
  extends a
{
  public z(SocializeEntity paramSocializeEntity)
  {
    super(paramSocializeEntity);
    this.a = paramSocializeEntity;
  }
  
  public int a(Context paramContext, SHARE_MEDIA paramSHARE_MEDIA)
  {
    if (g(paramContext)) {
      return super.a(paramContext, paramSHARE_MEDIA);
    }
    return -104;
  }
  
  public int a(Context paramContext, SnsAccount paramSnsAccount)
  {
    if (g(paramContext)) {
      return super.a(paramContext, paramSnsAccount);
    }
    return -104;
  }
  
  public int a(Context paramContext, UMComment paramUMComment, m[] paramArrayOfm)
  {
    if (g(paramContext)) {
      return super.a(paramContext, paramUMComment, paramArrayOfm);
    }
    return -104;
  }
  
  public MultiStatus a(Context paramContext, m paramm, String... paramVarArgs)
  {
    if (g(paramContext))
    {
      paramm = super.a(paramContext, paramm, paramVarArgs);
      paramContext = paramm;
      if (paramm == null) {
        paramContext = new MultiStatus(-102);
      }
      return paramContext;
    }
    return new MultiStatus(-104);
  }
  
  public MultiStatus a(Context paramContext, m[] paramArrayOfm, UMShareMsg paramUMShareMsg)
  {
    if (g(paramContext))
    {
      paramArrayOfm = super.a(paramContext, paramArrayOfm, paramUMShareMsg);
      paramContext = paramArrayOfm;
      if (paramArrayOfm == null) {
        paramContext = new MultiStatus(-102);
      }
      return paramContext;
    }
    return new MultiStatus(-104);
  }
  
  public e a(Context paramContext, long paramLong)
  {
    if (g(paramContext)) {
      return super.a(paramContext, paramLong);
    }
    return null;
  }
  
  public p a(Context paramContext, SHARE_MEDIA paramSHARE_MEDIA, String paramString)
  {
    if (g(paramContext)) {
      return super.a(paramContext, paramSHARE_MEDIA, paramString);
    }
    return null;
  }
  
  public w a(Context paramContext, m paramm)
  {
    if (g(paramContext)) {
      return super.a(paramContext, paramm);
    }
    return null;
  }
  
  public int b(Context paramContext)
  {
    if (g(paramContext)) {
      return super.b(paramContext);
    }
    return -104;
  }
  
  public int b(Context paramContext, SHARE_MEDIA paramSHARE_MEDIA)
  {
    if (g(paramContext)) {
      return super.b(paramContext, paramSHARE_MEDIA);
    }
    return -104;
  }
  
  public int c(Context paramContext)
  {
    if (g(paramContext)) {
      return super.c(paramContext);
    }
    return super.c(paramContext);
  }
  
  public int d(Context paramContext)
  {
    if (g(paramContext)) {
      return super.d(paramContext);
    }
    return super.d(paramContext);
  }
  
  public l e(Context paramContext)
  {
    if (g(paramContext)) {
      return super.e(paramContext);
    }
    return null;
  }
  
  public int f(Context paramContext)
  {
    if (g(paramContext)) {
      return super.f(paramContext);
    }
    return -104;
  }
  
  public boolean g(Context paramContext)
  {
    if (!this.a.initialized) {
      a(paramContext);
    }
    return this.a.initialized;
  }
  
  public SocializeEntity getEntity()
  {
    return super.getEntity();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\controller\a\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */