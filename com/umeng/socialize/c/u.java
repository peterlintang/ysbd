package com.umeng.socialize.c;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.socialize.bean.SocializeEntity;
import com.umeng.socialize.bean.UMLocation;
import com.umeng.socialize.bean.UMShareMsg;
import com.umeng.socialize.c.a.b;
import com.umeng.socialize.c.a.b.b;
import com.umeng.socialize.c.a.e;
import com.umeng.socialize.c.b.c;
import com.umeng.socialize.common.m;
import java.util.Map;

public class u
  extends b
{
  private static final String g = "/share/add/";
  private static final int h = 9;
  private SocializeEntity i;
  private String j;
  private String k;
  private UMShareMsg l;
  
  public u(Context paramContext, SocializeEntity paramSocializeEntity, String paramString1, String paramString2, UMShareMsg paramUMShareMsg)
  {
    super(paramContext, "", e.class, paramSocializeEntity, 9, b.b.b);
    this.c = paramContext;
    this.i = paramSocializeEntity;
    this.j = paramString1;
    this.k = paramString2;
    this.l = paramUMShareMsg;
  }
  
  protected String a()
  {
    return "/share/add/" + m.a(this.c) + "/" + this.i.entityKey + "/";
  }
  
  protected Map<String, Object> a(Map<String, Object> paramMap)
  {
    paramMap.put("to", this.j);
    if (!TextUtils.isEmpty(this.l.text)) {
      paramMap.put(c.s, this.l.text);
    }
    paramMap.put("usid", this.k);
    paramMap.put("ak", m.a(this.c));
    if (!TextUtils.isEmpty(this.l.wid)) {
      paramMap.put("wid", this.l.wid);
    }
    if (this.l.location != null) {
      paramMap.put(c.t, this.l.location.toString());
    }
    if (this.l.getMedia() != null) {
      a(this.l.getMedia(), paramMap);
    }
    return paramMap;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\c\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */