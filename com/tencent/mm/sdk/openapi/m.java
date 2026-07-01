package com.tencent.mm.sdk.openapi;

import android.os.Bundle;

public final class m
  extends a
{
  public WXMediaMessage b;
  
  public m() {}
  
  public m(Bundle paramBundle)
  {
    b(paramBundle);
  }
  
  public final int a()
  {
    return 4;
  }
  
  public final void a(Bundle paramBundle)
  {
    Bundle localBundle = p.a(this.b);
    super.a(localBundle);
    paramBundle.putAll(localBundle);
  }
  
  public final void b(Bundle paramBundle)
  {
    super.b(paramBundle);
    this.b = p.a(paramBundle);
  }
  
  final boolean b()
  {
    if (this.b == null) {
      return false;
    }
    return this.b.checkArgs();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\tencent\mm\sdk\openapi\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */