package com.tencent.mm.sdk.openapi;

import android.os.Bundle;

public abstract interface q
{
  public abstract boolean checkArgs();
  
  public abstract void serialize(Bundle paramBundle);
  
  public abstract int type();
  
  public abstract void unserialize(Bundle paramBundle);
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\tencent\mm\sdk\openapi\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */