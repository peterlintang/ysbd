package com.umeng.socialize.c;

import android.content.Context;
import com.umeng.socialize.bean.SocializeEntity;
import com.umeng.socialize.c.a.b;
import com.umeng.socialize.c.a.b.b;
import com.umeng.socialize.common.m;
import java.util.Map;

public class d
  extends b
{
  private static final String g = "/comment/get/";
  private static final int h = 2;
  private SocializeEntity i;
  private long j;
  
  public d(Context paramContext, SocializeEntity paramSocializeEntity, long paramLong)
  {
    super(paramContext, "", e.class, paramSocializeEntity, 2, b.b.a);
    this.c = paramContext;
    this.i = paramSocializeEntity;
    this.j = paramLong;
  }
  
  protected String a()
  {
    return "/comment/get/" + m.a(this.c) + "/" + this.i.entityKey + "/";
  }
  
  protected Map<String, Object> a(Map<String, Object> paramMap)
  {
    paramMap.put("lct", Long.valueOf(this.j));
    paramMap.put("sid", this.i.sessionID);
    return paramMap;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\c\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */