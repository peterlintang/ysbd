package com.umeng.socialize.c;

import android.content.Context;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.bean.SocializeEntity;
import com.umeng.socialize.c.a.b;
import com.umeng.socialize.c.a.b.b;
import com.umeng.socialize.common.m;
import java.util.Map;

public class o
  extends b
{
  private static final String g = "/share/friends/";
  private static final int h = 14;
  private SocializeEntity i;
  private String j;
  private SHARE_MEDIA k;
  
  public o(Context paramContext, SocializeEntity paramSocializeEntity, SHARE_MEDIA paramSHARE_MEDIA, String paramString)
  {
    super(paramContext, "", p.class, paramSocializeEntity, 14, b.b.a);
    this.c = paramContext;
    this.i = paramSocializeEntity;
    this.j = paramString;
    this.k = paramSHARE_MEDIA;
  }
  
  protected String a()
  {
    return "/share/friends/" + m.a(this.c) + "/" + this.j + "/";
  }
  
  protected Map<String, Object> a(Map<String, Object> paramMap)
  {
    paramMap.put("to", this.k.toString());
    return paramMap;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\c\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */