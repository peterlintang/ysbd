package com.umeng.socialize.c;

import android.content.Context;
import com.umeng.socialize.bean.SocializeEntity;
import com.umeng.socialize.c.a.b;
import com.umeng.socialize.c.a.b.b;
import java.util.Map;

public class v
  extends b
{
  private static final String g = "/share/userinfo/";
  private static final int h = 12;
  private com.umeng.socialize.bean.m i;
  
  public v(Context paramContext, SocializeEntity paramSocializeEntity, com.umeng.socialize.bean.m paramm)
  {
    super(paramContext, "", w.class, paramSocializeEntity, 12, b.b.a);
    this.c = paramContext;
    this.i = paramm;
  }
  
  protected String a()
  {
    return "/share/userinfo/" + com.umeng.socialize.common.m.a(this.c) + "/" + this.i.b + "/";
  }
  
  protected Map<String, Object> a(Map<String, Object> paramMap)
  {
    paramMap.put("sns", this.i.a.toString());
    return paramMap;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\c\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */