package com.taobao.munion.net;

import java.util.HashMap;

public class r
{
  public static final int a = -2000;
  public static final int b = -2001;
  public static final int c = -2002;
  public static final int d = -2003;
  public static final int e = -2004;
  public static final int f = -2005;
  public static final int g = -2006;
  public static final int h = -2007;
  public static final int i = -7;
  public static final int j = -6;
  public static final int k = -5;
  public static final int l = -4;
  public static final int m = -3;
  public static final int n = -2;
  public static final int o = -1;
  public static final int p = -1000;
  public static final int q = -10002;
  public static final String r = "SUCCESS";
  public static final String s = "PARAM_ERR";
  public static final String t = "ERR_SID_INVALID";
  public static final String u = "FAIL";
  public static final String v = "SYSTEM_ERROR";
  static HashMap<String, Integer> w;
  
  static
  {
    HashMap localHashMap = new HashMap();
    w = localHashMap;
    localHashMap.put("ERRCODE_PROTOCOL_PARAM_LOST_FAILSE", Integer.valueOf(63535));
    w.put("ERRCODE_APP_ACCESS_API_FAIL", Integer.valueOf(63534));
    w.put("ERRCODE_AUTH_REJECT", Integer.valueOf(63533));
    w.put("ERR_SID_INVALID", Integer.valueOf(63532));
  }
  
  public static Integer a(String paramString)
  {
    Integer localInteger = (Integer)w.get(paramString);
    paramString = localInteger;
    if (localInteger == null) {
      paramString = Integer.valueOf(64536);
    }
    return paramString;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\net\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */