package com.umeng.newxp.common.a.d;

import com.umeng.newxp.common.a.e;

class f
{
  static int a(byte paramByte)
  {
    int i = Character.digit((char)paramByte, 16);
    if (i == -1) {
      throw new e("Invalid URL encoding: not a valid digit (radix 16): " + paramByte);
    }
    return i;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\common\a\d\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */