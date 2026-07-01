package com.umeng.socialize.c;

import android.content.Context;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.bean.SocializeEntity;
import com.umeng.socialize.c.a.b;
import com.umeng.socialize.c.a.b.b;
import com.umeng.socialize.c.a.e;
import com.umeng.socialize.common.SocializeConstants;
import com.umeng.socialize.common.m;
import java.util.Map;

public class n
  extends b
{
  private static final String g = "/share/auth_delete/";
  private static final int h = 15;
  private SHARE_MEDIA i;
  
  public n(Context paramContext, SocializeEntity paramSocializeEntity, SHARE_MEDIA paramSHARE_MEDIA)
  {
    super(paramContext, "", e.class, paramSocializeEntity, 15, b.b.b);
    this.c = paramContext;
    this.i = paramSHARE_MEDIA;
  }
  
  protected String a()
  {
    return "/share/auth_delete/" + m.a(this.c) + "/";
  }
  
  protected Map<String, Object> a(Map<String, Object> paramMap)
  {
    paramMap.put("uid", SocializeConstants.UID);
    paramMap.put("via", this.i.toString());
    return paramMap;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\c\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */