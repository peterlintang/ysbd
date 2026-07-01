package com.umeng.update;

import com.umeng.common.net.e;

final class a
  implements e
{
  public final void a() {}
  
  public final void a(int paramInt) {}
  
  public final void a(int paramInt, String paramString)
  {
    if (UmengUpdateAgent.a() != null) {
      UmengUpdateAgent.a().OnDownloadEnd(paramInt);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\update\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */