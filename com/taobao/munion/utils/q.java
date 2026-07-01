package com.taobao.munion.utils;

import com.taobao.munion.common.MunionConfigManager;
import com.umeng.newxp.common.b.a;

public class q
  implements d
{
  private static q a;
  
  public static q b()
  {
    if (a == null) {
      a = new q();
    }
    return a;
  }
  
  public String a()
  {
    return a.a(MunionConfigManager.getInstance().getContext()).a();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\utils\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */