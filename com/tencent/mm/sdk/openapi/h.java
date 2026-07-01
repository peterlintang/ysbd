package com.tencent.mm.sdk.openapi;

import android.os.Bundle;

public final class h
  extends b
{
  public String d;
  public String e;
  public int f;
  public String g;
  
  public h() {}
  
  public h(Bundle paramBundle)
  {
    a(paramBundle);
  }
  
  public final void a(Bundle paramBundle)
  {
    super.a(paramBundle);
    this.d = paramBundle.getString("_wxapi_sendauth_resp_userName");
    this.e = paramBundle.getString("_wxapi_sendauth_resp_token");
    this.f = paramBundle.getInt("_wxapi_sendauth_resp_expireDate", 0);
    this.g = paramBundle.getString("_wxapi_sendauth_resp_state");
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\tencent\mm\sdk\openapi\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */