package com.taobao.munion.net;

class o$a
{
  long a = 0L;
  long b = 0L;
  long c = 0L;
  
  void a()
  {
    this.a = 0L;
    this.b = 0L;
    this.c = 0L;
  }
  
  String b()
  {
    for (Object localObject = this.a + "," + this.b + ",";; localObject = str)
    {
      try
      {
        if (this.a <= 0L) {
          break label79;
        }
        str = (String)localObject + this.c / this.a;
        localObject = str;
      }
      catch (Exception localException)
      {
        String str;
        label79:
        for (;;) {}
      }
      a();
      return (String)localObject;
      str = (String)localObject + "0";
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\net\o$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */