package com.taobao.munion.utils;

public class l
{
  public static String a(Object paramObject)
  {
    if (paramObject != null) {
      return paramObject.toString();
    }
    return "";
  }
  
  public static boolean b(Object paramObject)
  {
    return (paramObject == null) || (paramObject.toString().length() == 0);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\utils\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */