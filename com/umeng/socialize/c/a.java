package com.umeng.socialize.c;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.socialize.bean.SocializeEntity;
import com.umeng.socialize.c.a.b.b;
import com.umeng.socialize.c.b.c;
import com.umeng.socialize.common.m;
import java.util.Map;

public class a
  extends com.umeng.socialize.c.a.b
{
  private static final String g = "/bar/get/";
  private static final int h = 1;
  private SocializeEntity i;
  private int j = 0;
  
  public a(Context paramContext, SocializeEntity paramSocializeEntity, int paramInt)
  {
    super(paramContext, "", b.class, paramSocializeEntity, 1, b.b.a);
    this.c = paramContext;
    this.i = paramSocializeEntity;
    this.j = paramInt;
  }
  
  protected String a()
  {
    return "/bar/get/" + m.a(this.c) + "/";
  }
  
  protected Map<String, Object> a(Map<String, Object> paramMap)
  {
    paramMap.put("dc", this.i.descriptor);
    paramMap.put(c.E, Integer.valueOf(this.j));
    if (!TextUtils.isEmpty(this.i.getNickName())) {
      paramMap.put(c.G, this.i.getNickName());
    }
    if (!TextUtils.isEmpty(this.i.customID)) {
      paramMap.put(c.F, this.i.customID);
    }
    return paramMap;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */