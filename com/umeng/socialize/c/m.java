package com.umeng.socialize.c;

import android.content.Context;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.bean.SocializeEntity;
import com.umeng.socialize.c.a.b;
import com.umeng.socialize.c.a.b.b;
import com.umeng.socialize.c.a.e;
import com.umeng.socialize.common.SocializeConstants;
import java.util.Map;

public class m
  extends b
{
  private static final String g = "/share/auth/report/";
  private static final int h = 11;
  private SocializeEntity i;
  private String j;
  private SHARE_MEDIA k;
  
  public m(Context paramContext, SocializeEntity paramSocializeEntity, SHARE_MEDIA paramSHARE_MEDIA, String paramString)
  {
    super(paramContext, "", e.class, paramSocializeEntity, 11, b.b.b);
    this.c = paramContext;
    this.i = paramSocializeEntity;
    this.j = paramString;
    this.k = paramSHARE_MEDIA;
  }
  
  protected String a()
  {
    return "/share/auth/report/" + com.umeng.socialize.common.m.a(this.c) + "/" + this.i.entityKey + "/";
  }
  
  protected Map<String, Object> a(Map<String, Object> paramMap)
  {
    paramMap.put("usid", this.j);
    paramMap.put("uid", SocializeConstants.UID);
    paramMap.put("to", this.k.toString());
    return paramMap;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\c\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */