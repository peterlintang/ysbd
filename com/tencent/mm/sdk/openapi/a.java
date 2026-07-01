package com.tencent.mm.sdk.openapi;

import android.os.Bundle;

public abstract class a
{
  public String a;
  
  public abstract int a();
  
  public void a(Bundle paramBundle)
  {
    paramBundle.putInt("_wxapi_command_type", a());
    paramBundle.putString("_wxapi_basereq_transaction", this.a);
  }
  
  public void b(Bundle paramBundle)
  {
    this.a = paramBundle.getString("_wxapi_basereq_transaction");
  }
  
  abstract boolean b();
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\tencent\mm\sdk\openapi\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */