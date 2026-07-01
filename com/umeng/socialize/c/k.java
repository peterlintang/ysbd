package com.umeng.socialize.c;

import android.content.Context;
import com.umeng.socialize.bean.SocializeEntity;
import com.umeng.socialize.c.a.b;
import com.umeng.socialize.c.a.b.b;
import com.umeng.socialize.common.SocializeConstants;
import com.umeng.socialize.common.m;
import java.util.Map;

public class k
  extends b
{
  private static final String g = "/user/profile/get/";
  private static final int h = 3;
  
  public k(Context paramContext, SocializeEntity paramSocializeEntity)
  {
    super(paramContext, "", l.class, paramSocializeEntity, 3, b.b.a);
    this.c = paramContext;
  }
  
  protected String a()
  {
    return "/user/profile/get/" + m.a(this.c) + "/" + SocializeConstants.UID + "/";
  }
  
  protected Map<String, Object> a(Map<String, Object> paramMap)
  {
    return paramMap;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\c\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */