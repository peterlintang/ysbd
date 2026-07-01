package com.taobao.munion.net;

import android.text.TextUtils;

public class h
{
  public static final int a = 2592000;
  static h h = new h(-1);
  static h i = new h(-2);
  static h j = new h(-3);
  public int b;
  public String c;
  public String d;
  public String e;
  int f;
  public int g = 0;
  public byte[] k;
  public Object l;
  
  public h()
  {
    this.b = 0;
    this.k = null;
    this.c = "";
    this.f = 2592000;
  }
  
  public h(int paramInt)
  {
    this.b = paramInt;
    this.k = null;
    this.c = "";
    this.f = 2592000;
  }
  
  public h(int paramInt, String paramString, byte[] paramArrayOfByte)
  {
    this.b = paramInt;
    this.c = paramString;
    this.k = paramArrayOfByte;
    this.f = 2592000;
  }
  
  public boolean a()
  {
    return this.b == 200;
  }
  
  public boolean b()
  {
    return TextUtils.equals(this.d, "SUCCESS");
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\net\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */