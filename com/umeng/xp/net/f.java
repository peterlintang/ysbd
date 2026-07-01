package com.umeng.xp.net;

import com.umeng.common.b.h;
import com.umeng.common.net.k;
import java.util.Map;
import org.json.JSONObject;

public class f
  extends k
{
  private Map<String, Object> d;
  
  public f(Map<String, Object> paramMap)
  {
    super("");
    this.d = paramMap;
  }
  
  public JSONObject a()
  {
    return null;
  }
  
  public void a(String paramString)
  {
    this.c = paramString;
  }
  
  public String b()
  {
    return h.a(this.d, this.c).toString();
  }
  
  public String c()
  {
    return k.b;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\net\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */