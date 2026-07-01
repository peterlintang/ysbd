package com.tencent.mm.sdk.openapi;

import android.os.Bundle;

public abstract class b
{
  public int a;
  public String b;
  public String c;
  
  public void a(Bundle paramBundle)
  {
    this.a = paramBundle.getInt("_wxapi_baseresp_errcode");
    this.b = paramBundle.getString("_wxapi_baseresp_errstr");
    this.c = paramBundle.getString("_wxapi_baseresp_transaction");
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\tencent\mm\sdk\openapi\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */