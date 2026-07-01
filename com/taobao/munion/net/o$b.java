package com.taobao.munion.net;

import java.util.concurrent.Callable;

class o$b
  implements Callable<String>
{
  String a;
  
  o$b(String paramString)
  {
    this.a = paramString;
  }
  
  public String a()
  {
    return o.c(this.a);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\net\o$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */