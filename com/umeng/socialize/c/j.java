package com.umeng.socialize.c;

import android.content.Context;
import com.umeng.socialize.bean.SocializeEntity;
import com.umeng.socialize.c.a.b;
import com.umeng.socialize.c.a.b.b;
import com.umeng.socialize.c.a.e;
import com.umeng.socialize.common.m;
import java.util.Map;

public class j
  extends b
{
  private static final String g = "/comment/unbinding/";
  private static final int h = 15;
  
  public j(Context paramContext, SocializeEntity paramSocializeEntity)
  {
    super(paramContext, "", e.class, paramSocializeEntity, 15, b.b.b);
    this.c = paramContext;
  }
  
  protected String a()
  {
    return "/comment/unbinding/" + m.a(this.c) + "/";
  }
  
  protected Map<String, Object> a(Map<String, Object> paramMap)
  {
    return paramMap;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\c\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */