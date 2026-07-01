package com.umeng.socialize.c;

import android.content.Context;
import com.umeng.socialize.bean.SocializeEntity;
import com.umeng.socialize.c.a.b;
import com.umeng.socialize.c.a.b.b;
import com.umeng.socialize.c.a.e;
import com.umeng.socialize.common.m;
import java.util.Map;

public class f
  extends b
{
  private static final String g = "/like/update/";
  private static final int h = 6;
  private f.a i;
  private SocializeEntity j;
  
  public f(Context paramContext, SocializeEntity paramSocializeEntity, f.a parama)
  {
    super(paramContext, "", e.class, paramSocializeEntity, 6, b.b.b);
    this.c = paramContext;
    this.i = parama;
    this.j = paramSocializeEntity;
  }
  
  protected String a()
  {
    return "/like/update/" + m.a(this.c) + "/" + this.j.entityKey + "/";
  }
  
  protected Map<String, Object> a(Map<String, Object> paramMap)
  {
    paramMap.put("st", Integer.valueOf(Integer.parseInt(this.i.toString())));
    return paramMap;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\c\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */