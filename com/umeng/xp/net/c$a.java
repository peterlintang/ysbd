package com.umeng.xp.net;

import com.umeng.common.net.e;
import com.umeng.xp.Promoter;

public class c$a
  implements e
{
  private String b;
  private com.umeng.common.net.c c;
  
  public c$a(c paramc)
  {
    this.b = c.a(paramc).url;
    this.c = com.umeng.common.net.c.a(c.b(paramc));
  }
  
  public void a()
  {
    c.b();
    if (c.c(this.a) != null) {
      new XpReportClient(c.b(this.a)).sendAsync(c.c(this.a), null);
    }
    this.c.a("xp", this.b);
  }
  
  public void a(int paramInt)
  {
    c.b();
  }
  
  public void a(int paramInt, String paramString)
  {
    c.b();
    new StringBuilder("XpDownloadListener.onEndresult = ").append(paramInt).append(" file = ").append(paramString).toString();
    if (paramInt == 1) {
      this.c.e("xp", this.b);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\net\c$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */