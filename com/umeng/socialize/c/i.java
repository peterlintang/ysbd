package com.umeng.socialize.c;

import android.content.Context;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.bean.SocializeEntity;
import com.umeng.socialize.c.a.b;
import com.umeng.socialize.c.a.b.b;
import com.umeng.socialize.c.a.e;
import com.umeng.socialize.common.m;
import java.util.Map;

public class i
  extends b
{
  private static final String g = "/comment/binding/";
  private static final int h = 13;
  private SocializeEntity i;
  private SHARE_MEDIA j;
  
  public i(Context paramContext, SocializeEntity paramSocializeEntity, SHARE_MEDIA paramSHARE_MEDIA)
  {
    super(paramContext, "", e.class, paramSocializeEntity, 13, b.b.b);
    this.c = paramContext;
    this.i = paramSocializeEntity;
    this.j = paramSHARE_MEDIA;
  }
  
  protected String a()
  {
    return "/comment/binding/" + m.a(this.c) + "/";
  }
  
  protected Map<String, Object> a(Map<String, Object> paramMap)
  {
    paramMap.put("sns", this.j.toString());
    return paramMap;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\c\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */