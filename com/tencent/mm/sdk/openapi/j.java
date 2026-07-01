package com.tencent.mm.sdk.openapi;

import android.os.Bundle;
import com.tencent.mm.sdk.platformtools.c;

public final class j
  extends a
{
  public WXMediaMessage b;
  public int c;
  
  public final int a()
  {
    return 2;
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    paramBundle.putAll(p.a(this.b));
    paramBundle.putInt("_wxapi_sendmessagetowx_req_scene", this.c);
  }
  
  public final void b(Bundle paramBundle)
  {
    super.b(paramBundle);
    this.b = p.a(paramBundle);
    this.c = paramBundle.getInt("_wxapi_sendmessagetowx_req_scene");
  }
  
  final boolean b()
  {
    if (this.b == null)
    {
      c.a("MicroMsg.SDK.SendMessageToWX.Req", "checkArgs fail ,message is null");
      return false;
    }
    return this.b.checkArgs();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\tencent\mm\sdk\openapi\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */