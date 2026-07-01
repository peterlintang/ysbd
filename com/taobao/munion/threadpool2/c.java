package com.taobao.munion.threadpool2;

import java.util.Comparator;

public class c
  implements Comparator<b>
{
  public int a(b paramb1, b paramb2)
  {
    int i = paramb1.a();
    int j = paramb2.a();
    if (i > j) {
      return 1;
    }
    if (i < j) {
      return -1;
    }
    return 0;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\threadpool2\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */