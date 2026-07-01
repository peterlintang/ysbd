package com.umeng.newxp.net;

import com.umeng.common.ufp.net.i;
import org.json.JSONObject;

public class d
  extends a
{
  String e;
  String f;
  int g;
  
  public d(String paramString1, String paramString2, int paramInt)
  {
    super("");
    this.f = paramString2;
    this.e = paramString1;
    this.g = paramInt;
  }
  
  public JSONObject a()
  {
    return null;
  }
  
  public String b()
  {
    return "http://w.m.taobao.com/credit/consume?uid=" + this.e + "&slot_id=" + this.f + "&count=" + this.g;
  }
  
  public String c()
  {
    return i.b;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\net\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */