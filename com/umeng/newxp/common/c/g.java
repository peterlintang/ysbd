package com.umeng.newxp.common.c;

public class g
{
  public static int a(Object paramObject)
  {
    if ((paramObject instanceof Integer)) {
      return ((Integer)paramObject).intValue();
    }
    return 0;
  }
  
  public static String b(Object paramObject)
  {
    if (paramObject != null)
    {
      if ((paramObject instanceof String)) {
        return ((String)paramObject).toString();
      }
      if ((paramObject instanceof Integer)) {
        return ((Integer)paramObject).intValue();
      }
      if ((paramObject instanceof Long)) {
        return ((Long)paramObject).longValue();
      }
      if ((paramObject instanceof Double)) {
        return ((Double)paramObject).doubleValue();
      }
      if ((paramObject instanceof Float)) {
        return ((Float)paramObject).floatValue();
      }
      if ((paramObject instanceof Short)) {
        return ((Short)paramObject).shortValue();
      }
      if ((paramObject instanceof Byte)) {
        return ((Byte)paramObject).byteValue();
      }
      if ((paramObject instanceof Boolean)) {
        return ((Boolean)paramObject).toString();
      }
      if ((paramObject instanceof Character)) {
        return ((Character)paramObject).toString();
      }
      return paramObject.toString();
    }
    return "";
  }
  
  public static long c(Object paramObject)
  {
    if ((paramObject instanceof Long)) {
      return ((Long)paramObject).longValue();
    }
    return 0L;
  }
  
  public static double d(Object paramObject)
  {
    if ((paramObject instanceof Double)) {
      return ((Double)paramObject).doubleValue();
    }
    return 0.0D;
  }
  
  public static float e(Object paramObject)
  {
    if ((paramObject instanceof Float)) {
      return ((Float)paramObject).floatValue();
    }
    return 0.0F;
  }
  
  public static short f(Object paramObject)
  {
    if ((paramObject instanceof Short)) {
      return ((Short)paramObject).shortValue();
    }
    return 0;
  }
  
  public static byte g(Object paramObject)
  {
    if ((paramObject instanceof Byte)) {
      return ((Byte)paramObject).byteValue();
    }
    return 0;
  }
  
  public static boolean h(Object paramObject)
  {
    if ((paramObject instanceof Boolean)) {
      return ((Boolean)paramObject).booleanValue();
    }
    return false;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\common\c\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */