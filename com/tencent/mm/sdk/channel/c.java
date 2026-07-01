package com.tencent.mm.sdk.channel;

import com.tencent.mm.a.a;

final class c
{
  static byte[] a(String paramString1, String paramString2)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    if (paramString1 != null) {
      localStringBuffer.append(paramString1);
    }
    localStringBuffer.append(553910273);
    localStringBuffer.append(paramString2);
    localStringBuffer.append("mMcShCsTr");
    return a.a(localStringBuffer.toString().substring(1, 9).getBytes()).getBytes();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\tencent\mm\sdk\channel\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */