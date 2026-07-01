package com.taobao.munion.net;

class b$f
{
  long a = 0L;
  long b = 0L;
  long c = 0L;
  long d = 0L;
  long e = 0L;
  long f = 0L;
  
  b$f(b paramb) {}
  
  void a()
  {
    this.a = 0L;
    this.b = 0L;
    this.c = 0L;
    this.d = 0L;
    this.e = 0L;
    this.f = 0L;
  }
  
  String b()
  {
    String str2 = this.a + "," + this.b + ",";
    String str1 = str2;
    try
    {
      if (this.a > 0L) {
        str1 = str2;
      }
      for (str2 = str2 + this.c / this.a + "," + this.d / this.a;; str2 = str2 + "0,0")
      {
        str1 = str2;
        str2 = str2 + ",";
        str1 = str2;
        if (this.f <= 0L) {
          break;
        }
        str1 = str2;
        return str2 + this.e / this.f;
        str1 = str2;
      }
      str1 = str2;
      str2 = str2 + "0";
      return str2;
    }
    catch (Exception localException) {}
    return str1;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\net\b$f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */