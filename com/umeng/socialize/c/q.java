package com.umeng.socialize.c;

import android.content.Context;
import com.umeng.socialize.bean.SocializeEntity;
import com.umeng.socialize.c.a.b;
import com.umeng.socialize.c.a.b.b;
import java.util.Map;

public class q
  extends b
{
  private static final String g = "/share/follow/";
  private static final int h = 18;
  private com.umeng.socialize.bean.m i;
  private String[] j;
  
  public q(Context paramContext, SocializeEntity paramSocializeEntity, com.umeng.socialize.bean.m paramm, String... paramVarArgs)
  {
    super(paramContext, "", r.class, paramSocializeEntity, 18, b.b.b);
    this.c = paramContext;
    this.i = paramm;
    this.j = paramVarArgs;
  }
  
  protected String a()
  {
    return "/share/follow/" + com.umeng.socialize.common.m.a(this.c) + "/" + this.i.b + "/";
  }
  
  protected Map<String, Object> a(Map<String, Object> paramMap)
  {
    paramMap.put("to", this.i.a.toString());
    StringBuilder localStringBuilder = new StringBuilder();
    String[] arrayOfString;
    int m;
    int k;
    if (this.j != null)
    {
      arrayOfString = this.j;
      m = arrayOfString.length;
      k = 0;
    }
    for (;;)
    {
      if (k >= m)
      {
        if (localStringBuilder.length() > 0) {
          localStringBuilder.deleteCharAt(localStringBuilder.length() - 1);
        }
        paramMap.put("fusid", localStringBuilder.toString());
        return paramMap;
      }
      localStringBuilder.append(arrayOfString[k] + ",");
      k += 1;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\c\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */