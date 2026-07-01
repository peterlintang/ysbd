package com.umeng.newxp.net;

import com.umeng.common.ufp.net.i;
import com.umeng.common.ufp.util.h;
import java.util.Map;
import org.json.JSONObject;

public class n
  extends i
{
  private Map<String, Object> d;
  
  public n(Map<String, Object> paramMap)
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
    return i.b;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\net\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */